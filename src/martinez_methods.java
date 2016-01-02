import javax.swing.JOptionPane;  // Needed for JOptionPane

/*
 This method is going to calculate the total points, average, and determine the grade.
 */

public class martinez_methods 
{
	public static void main(String[]args)
	{
		double score1;  // To hold score #1
		double score2;  // To hold score #2
		double score3;  // To hold score #3
		double score4;  // To hold score #4
		double score5;  // To hold score #5
		double score6;  // To hold score #6
		double score7;  // To hold score #7
		double score8;  // To hold score #8
		double score9;  // To hold score #9
		double score10;  // To hold score #10
		String input;            // To hold the user's input
		
		// Get the first grade
		input = JOptionPane.showInputDialog("Enter score #1:");
		score1 = Double.parseDouble(input);
		
		// Get the second grade
		input = JOptionPane.showInputDialog("Enter the score #2:");
		score2 = Double.parseDouble(input);
		
		// Get the third grade
		input = JOptionPane.showInputDialog("Enter the score #3:");
		score3 = Double.parseDouble(input);
		
		// Get the fourth grade
		input = JOptionPane.showInputDialog("Enter the score #4:");
		score4 = Double.parseDouble(input);
		
		// Get the fifth grade
		input = JOptionPane.showInputDialog("Enter the score #5:");
		score5 = Double.parseDouble(input);
		
		// Get the sixth grade
		input = JOptionPane.showInputDialog("Enter the score #6:");
		score6 = Double.parseDouble(input);
		
		// Get the seventh grade
		input = JOptionPane.showInputDialog("Enter the score #7:");
		score7 = Double.parseDouble(input);
		
		// Get the eighth grade
		input = JOptionPane.showInputDialog("Enter the score #8:");
		score8 = Double.parseDouble(input);
		
		// Get the ninth grade
		input = JOptionPane.showInputDialog("Enter the score #9:");
		score9 = Double.parseDouble(input);
		
		// Get the tenth grade
		input = JOptionPane.showInputDialog("Enter the score #10:");
		score10 = Double.parseDouble(input);
		
		// Call the calcTotalPoints method passing the contents of the name variable as an argument
			    calcTotalPoints(score1, score2, score3, score4, score5, score6, score7, score8, 
			    		        score9, score10);
			    
		// Call the calcAverage method passing the contents of the name variable as an argument
				calcAverage(score1, score2, score3, score4, score5, score6, score7, score8, 
	    		        score9, score10);	
				
		// Call the determineGrade method passing the contents of the name variable as an argument
				determineGrade(score1, score2, score3, score4, score5, score6, score7, score8, 
	    		        score9, score10);
	}		
	
	/*
     This method will calculate the amount of all the scores
	*/
		
	public static void calcTotalPoints(double score1, double score2, double score3, double score4,
									   double score5, double score6, double score7, double score8,
									   double score9, double score10)
		{
		double sum;
		sum = (score1 + score2 + score3 + score4 + score5 +
		           score6 + score7 + score8 + score9 + score10);
		JOptionPane.showMessageDialog(null, "Your total points is " + sum);
		
    }
	
	/*
	 This method will calculate the average amount of points
	 */
	
	public static void calcAverage(double score1, double score2, double score3, double score4,
								   double score5, double score6, double score7, double score8,
								   double score9, double score10)
	    {
		double sum1;
		sum1 = (score1 + score2 + score3 + score4 + score5 +
		           score6 + score7 + score8 + score9 + score10) / 10.0;
		JOptionPane.showMessageDialog(null, "Your average score is " + sum1);

	    }
	
	/* 
	 This method will assign a grade to the average amount
	 */
	
	public static void determineGrade(double score1, double score2, double score3, double score4,
			   						  double score5, double score6, double score7, double score8,
			   						  double score9, double score10)
	    {
		double sum2;
		sum2 = (score1 + score2 + score3 + score4 + score5 +
		           score6 + score7 + score8 + score9 + score10) / 10.0;
		
		// Display the grade
		if (sum2 < 60)
		{
			JOptionPane.showMessageDialog(null, "Your grade is F.");
		}
			else
			{
				if (sum2 < 70)
				{
					JOptionPane.showMessageDialog(null, "Your grade is D.");
				}
			else
			{
				if (sum2 < 80)
				{
					JOptionPane.showMessageDialog(null, "Your grade is C.");
				}
			else 
			{
				if (sum2 < 90)
				{
					JOptionPane.showMessageDialog(null, "Your grade is B.");
				}
			else
			{
				
				JOptionPane.showMessageDialog(null, "Your grade is A.");
			}
				}
			}
				System.exit(0);
	    }
		
	}}

