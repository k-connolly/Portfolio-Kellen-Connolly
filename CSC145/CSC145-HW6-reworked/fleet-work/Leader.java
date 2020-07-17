
public class Leader {
	//set names for ranks and name
	String name;
	String rank;
	int xp;
	String a = "Commodore";
	String b = "Rear Admiral";
	String c = "Vice Admiral";
	String d = "Admiral";
	String e = "Fleet Admiral";
	String f = "Grand Admiral";
	
	
	public Leader(String name) {
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setRank(String leaderRank) 
	{
		rank = leaderRank;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setXP(int leaderXP) {
		xp = leaderXP;
	}
	
	public int getXP() {
		return xp;
	}
	
	public void printLeader() {
		System.out.println("Name: " + name);
		System.out.println("Rank: " + rank);
		System.out.println("Experiance: " + xp);
	}
	
	public void Promote() {
		if (xp < 100 || rank == f) {
			System.out.println("ERROR: Cannot Promote.");
		}
		else {
			if (rank == a) {
				rank = b;
			}
			else if (rank == b) {
				rank = c;
			}
			else if (rank == c) {
				rank = d;
			}
			else if (rank == d) {
				rank = e;
			}
			else if (rank == e) {
				rank = f;
			}
			System.out.println(name + "'s rank is now " + rank + ".");
			System.out.println();
		}
	}
}
