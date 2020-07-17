import java.util.ArrayList;

public class Vertex
{
	private int data;
	private int weight;
	
	//Putting neighbors into a arraylist//
	private ArrayList<Vertex> neighbors = new ArrayList<Vertex>();

	public Vertex(int data, int weight)
	{
		this.data = data;
		this.weight = weight;
	}
	
	public void add(Vertex v) {neighbors.add(v);}
	
	public int getNumEdges() {return neighbors.size();}
	
	public int getData() {return data;}
	
	public void setDate(int num) {this.data = num;}
	
	public int getWeight() {return weight;}
	
	public void setWeight(int weight) {this.weight = weight;}
	
	public ArrayList<Vertex> getNeighbors() {return neighbors;}
}