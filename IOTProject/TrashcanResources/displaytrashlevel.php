<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "trashcan";
$count = 0;

print("<h2>Smart Trashcan Data</h2>");

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT Event, Distance FROM trashlevel";
$result = $conn->query($sql);

print("<table cellpadding=5 cellspacing=5 border=3><tr><td><b>TimeStamp</b></td><td><b>Distance</b></tr>");

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
      
        echo "<tr><td>" . $row["Event"] . "</td><td>" . $row["Distance"] . "</td></tr>";
    
    }
    print ("</table>\n");
    
} else {
    echo "0 results";
}
$conn->close();
?>
