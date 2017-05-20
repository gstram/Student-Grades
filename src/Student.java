// Giuseppe Stramandinoli
// HW2
// Number 2

public class Student 
{
	private String name;
	private int score;
	
	public Student(String aName, int aScore)
	{
		name = aName;
		score = aScore;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return "Name/Score: " + name + "/" + score;
	}
}