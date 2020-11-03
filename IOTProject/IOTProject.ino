// MURRAY STATE UNIVERSITY IOT WIRELESS SMART TRASHCAN PROJECT

#include <SoftwareSerial.h>
#include <Ultrasonic.h>
SoftwareSerial esp(2,3); //Rx, Tx //ESP Rx->Tx, Tx->Rx
Ultrasonic ultrasonic(6, 7); //40000UL

//Method to send AT commands through Serial
void wifi_init()
{ 
  esp.println("AT+CWMODE=1");
  delay(100);
  esp.println("AT+CWJAP_DEF=\"FBI Surveillance Van #192601\",\"deepbutter800\"");
  delay(10000);
}

void setup()
{

  // Set LED Pins as output
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);

  Serial.begin(115200); // Starts the serial communication rate
  esp.begin(115200); //Starts ESP object communication rate
  wifi_init(); //Call the AT method to configure ESP
  Serial.println("System Ready..");
  delay(1000); //delay to show system is starting
}



int getDistance()
{
  int distance;
  distance = ultrasonic.read(CM);

  
  if ((distance >= 0) && (distance <= 19))
  {
    // Turn on Appropriate LED
    digitalWrite(8, LOW);
    digitalWrite(9, LOW);
    digitalWrite(10, HIGH);
  }
  else if ((distance >= 20) && (distance <= 39))
  {
    // Turn on Appropriate LED
    digitalWrite(8, LOW);
    digitalWrite(9, HIGH);
    digitalWrite(10, LOW);
  }
  else if (distance >= 40)
  {
    // Turn on Appropriate LED
    digitalWrite(8, HIGH);
    digitalWrite(9, LOW);
    digitalWrite(10, LOW);
  }
  else
  {
    digitalWrite(8, HIGH);
    digitalWrite(9, HIGH);
    digitalWrite(10, HIGH);
  }
  

  // Print the distance to the Serial Monitor
  Serial.print("Distance: ");
  Serial.println(distance);
  return distance;
}

void loop()
{
  int value = getDistance();

  String stringOne = "GET /trash/data.php?Distance=";
  String getStatement = stringOne + value;
  
  esp.println("AT+CIPSTART=\"TCP\",\"192.168.1.5\",80"); //connects to server
  delay(100);
  
  esp.println("AT+CIPSEND=44");                           //defines amount of bytes to send
  delay(100);
  
  Serial.println(getStatement);
  esp.println(getStatement);                              //executes php code with this value 
  delay(100);
  
  esp.println(getStatement);
  delay(2500);
}
