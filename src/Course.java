// Giuseppe Stramandinoli
// HW2
// Number 2

import java.util.Scanner;

public class Course 
{
		// Initialize scanner
		Scanner keyboard = new Scanner(System.in);
		
		//Initialize variables
		private Student[] scores;
		private static final int SIZE = 100;
		private int used;
		private double average, standardDeviation = 0;
		
		public Course()
		{
			// Set array size
			scores = new Student[SIZE];
			used = 0;
		}

		private void add(int score, String name)
		{
			// Create objects in array
			scores[used] = new Student(name, score);
		}
		
		public void load()
		{
			// Prompt user to exit or add a number
			System.out.println("Enter 2 negative numbers to exit.");
			System.out.println("Please enter the name of student and final exam score: ");
			String studentName = keyboard.next();
			int examScore = keyboard.nextInt();
			
			// Adds the student and score
			while(examScore >= 0)
			{
				add(examScore, studentName);
				System.out.println("Please enter the name of student and final exam score: ");
				studentName = keyboard.next();
				examScore = keyboard.nextInt();
				used++;	
			}
		}
		
		public void compute()
		{
			// Initialize local counter;
			int counter = 0;
			
			// Add the test scores to average
			while(counter < used)
			{
				average = average + scores[counter].getScore();
				counter++;
			}
			
			// Find the average;
			average = average / counter;
			
			// Set counter back to 0
			counter = 0;
			
			// Compute standard deviation
			// Add each test scores deviation to total deviation
			while(counter < used)
			{
				double number = (scores[counter].getScore() - average);
				standardDeviation = standardDeviation + (Math.pow(number, 2));
				counter++;
			}
			
			// Find the square root of standard deviation to get final standard deviation
			standardDeviation = Math.sqrt((standardDeviation/(counter-1)));
		}
	
		public void print()
		{
			//System.out.println(scores[0]);
			// Print all tests
			int counter = 0;
			while(counter <= (used-1))
			{
				// Print name and score
				System.out.println(scores[counter]);
				
				// Tell user if exam score is average, below average, or above average
				if(scores[counter].getScore() > average)
					System.out.println("Above Average by " + (scores[counter].getScore() - average) +
							" points");
				else if (scores[counter].getScore() < average)
					System.out.println("Below Average by " + (average - scores[counter].getScore()) +
							" points");
				else 
					System.out.println("Equal to average");
				
				counter++;
				System.out.println();
			}			
			
			// Print the average and standard deviation
			System.out.println("Average: " + average);
			System.out.println("Standard Deviation:" + standardDeviation);
		}
}
