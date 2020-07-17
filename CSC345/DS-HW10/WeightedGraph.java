import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class WeightedGraph
{
	//Creating an object of the vertex with integers 1 and 15//
	static Vertex currVer = new Vertex(1, 15);
	
	//Setting the current vertex
	static Vertex currentVertex = currVer;
	
	//Incrementing the vertex//
	static int vertexCount = 1;
	
	//Array List//
	static ArrayList<Vertex> Vertices = new ArrayList<Vertex>();
	
	//Random Number generator for weight//
	static Random randomNum = new Random();
	
	//Scanner for user input//
	static Scanner scanner = new Scanner(System.in);
	
	//Constructor//
	public WeightedGraph()
	{
		for (int i = 1; i < 50; i++)
		{
			addVertex();
			if (vertexCount % 15 == 0)
			{
				shiftVertex(vertexCount); //shift
			}
		}
	}
	
	//Adding a vertex method//
	public static void addVertex()
	{
		vertexCount++;
		Vertex vertex = new Vertex(vertexCount, randomNum.nextInt(100) + 1);
		vertex.add(currentVertex);
		currentVertex.add(vertex);
	}
	
	//Moving/shifting the vertex//
	public static void moveVertex()
	{
		ArrayList<Vertex> arraylist = currentVertex.getNeighbors();
		System.out.print("Move to the vertex through input: (");
		getNeighbors(arraylist);

		int move = scanner.nextInt();
		for (Vertex vec : arraylist)
		{
			if (vec.getData() == move)
			{
				currentVertex = vec;
				System.out.println("The current vertex is: " + currentVertex.getData());
				System.out.print("The vertex " + currentVertex.getData() + "'s neighboring vertices are (");
				getNeighbors(vec.getNeighbors());
			}
		}
		System.out.println();
	}
	
	//Shift vertex method//
	public static void shiftVertex(int data)
	{
		for (Vertex vec : currentVertex.getNeighbors())
		{
			if (vec.getData() == data)
			{
				currentVertex = vec;
				System.out.println("The current vertex is: " + currentVertex.getData());
				System.out.print("The vertex " + currentVertex.getData() + " has the neighboring vertices (");
				getNeighbors(vec.getNeighbors());
			}
		}
		System.out.println();
	}

	//returning the neighboring vertex's that are in the arraylist//
	public static void getNeighbors(ArrayList<Vertex> ara_ara)
	{
		for (Vertex vec : ara_ara)
		{
			if (vec != ara_ara.get(ara_ara.size() - 1))
			{
				System.out.print(vec.getData() + ", ");
			}
			else
			{
				System.out.print(vec.getData() + ") ");
			}
		}
	}
	
	//Returning the vertex's weight via what vertex the user inputs//
	public static int getVerticesWeight()
	{
		System.out.print("Select the vertex to check its weight: (");
		getNeighbors(currentVertex.getNeighbors());
		
		int input = scanner.nextInt();
		Vertex ref = null;
		
		for (Vertex ver : currentVertex.getNeighbors())
		{
			if (ver.getData() == input)
			{
				ref = ver;
			}
		}
		
		return currentVertex.getWeight() + ref.getWeight();
	}
	
	//Our main method to run the program//
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		WeightedGraph graph = new WeightedGraph();
		moveVertex();
		System.out.println(getVerticesWeight());
	}
	
}