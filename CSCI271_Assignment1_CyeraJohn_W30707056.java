/*************************************************************************
* Assignment 1 for CSCI 271-001 Spring 2026
*
* Author: Cyera John
* OS: Ubuntu Debian 24.04.3
* Compiler: javac 21.0.9
* Date: January 21, 2026
*
* Purpose
* My program reads a list of scores from an input file, counts how many
* scores there are in the list, and computes their sum and average.
*
*************************************************************************/
/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* Cyera John
* W30707056
********************************************************************/
import java.util.Scanner;

public class CSCI271_Assignment1_CyeraJohn_W30707056 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		string sentence = input.nextLine();
		double A = x/7;
		double E = (0.4 * F + 0.2 * M + 0.1 * T)/70;
		double W = ((E-60)/20) * 0.3;
		double G;
		if ( E < 60) {
			G = E;
		} 
		else if ( E < 80 && E >= 60) {
			G = (1-W) * E + (WA);
		}
		else if ( E >= 80) {
			(0.4 * F) + (0.2 * M) + (0.1 * T) + (0.3 * A);
		}
		System.out.println("Grade = " + grade);
	//print statements system print etc....
		input.close(); // Make sure to always
			// close your input objects
	}
}


// int testScore = 76;
//char grade;
//if (testScore >= 90) {
//grade = 'A';
//} else if (testScore >= 80) {
//grade = 'B';
//} else if (testScore >= 70) {
//grade = 'C';
//} else if (testScore >= 60) {
//grade = 'D';
//} else {
//grade = 'F';
//}
//System.out.println("Grade = " + grade)
