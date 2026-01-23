/*************************************************************************
* Assignment 1 for CSCI 271-001 Spring 2026
*
* Author: Cyera John
* OS: Ubuntu Debian 24.04.3
* Compiler: javac 21.0.9
* Date: January 21, 2026
*
* Purpose
* My program reads a list of scores from an input file, computes the sum and average of the first and second
* set of 7 numbers, reads the next two numbers then calculates and prints a grade.
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
import java.util.Scanner; //obtained from course notes

public class CSCI271_Assignment1_CyeraJohn_W30707056 { /* obtained from course notes */
/*****************************<main>****************************
* Description: the main function of the code takes in arguements.
*
* Parameters: arguements
*
* Pre: class has to be made before anything
*
* Post: main code will have finished running as long as bracket is closed.
*
* Returns: nothing it is void.
*
* Called by: n/a
* Calls: n/a
************************************************************************/
	public static void main(String[] args) { //obtained from course notes
		Scanner input = new Scanner(System.in); // obtained from notes reads input
		int[] assignment = new int[7]; //initialize an array limit is 7 also used class examples for this array
		int x = 0;//initialize x to be used for the loop
		int totalassign = 0; //initialize totalassign to be used for the loop
// for loop reads the first 7 numbers then adds them together, totalassign holds the sum
		for (int i = 0; i < 7; i++) { //combined array example and input example from class, reads until it hits the 7th number
			x = input.nextInt(); // grabs the next integer until limit is reached
      		assignment[i] = x; // stores into array
			totalassign += x;// add all items in array
    	} 
		int A = totalassign / 7; // takes the sum in totalassign and divides by 7 to get the average 			
		
		int[] test = new int[7]; //initialize another array limit is 7
		int y = 0; //initialize y to be used for the loop
	    int totaltest = 0; //initialize totaltest to be used for the loop
// for loop reads the first 7 numbers then adds them together, totalassign holds the sum
		for (int i = 0; i < 7; i++) { //reads next set of 7 numbers increasing
            y = input.nextInt(); // grabs the next integer until limit is reached
        	test[i] = y; // stores into array
            totaltest += y; // add all items in array
        }
 
		int T = totaltest / 7; // takes the sum in totaltest and divides by 7 to get the average
		int M = input.nextInt(); //grabs next number
		int F = input.nextInt(); //grabs final number			


		double E = ((0.4 * F)+(0.2 * M)+(0.1 * T))/0.7; //figured out the bug the 70 had to change it to 0.7 first calculation for E
		double W = ((E-60)/20) * 0.3; // takes E-60 and divides it by 20 then multiplies that answer by 30%
		double G = 0;// initialize G for the below functions

	//if statement of combined test & exam score (E), if it falls below 60 your final grade is F
		if ( E < 60) {
			G = E; //grade is the combination score held in E no other calculations
			System.out.println(G); //prints grade
			System.out.println("Final grade = F"); //reads out a final grade of F
		}	 
	//else-if statement of combined test & exam score (E), if it falls between 60 and 80 your final grade is calculated like so
		else if ( E < 80 && E >= 60) { 
			G = (1-W) * E + (W*A); //multiplies E by 1-W calculation and then adds it to the W calculation multiplied by the average of assigments
	//if statement that differs if G is between 60-69 and 70-79 
			if (G <=69 && G >= 60) { // if G is between 60-69 it should print the below
				System.out.println(G); //prints grade
				System.out.println("Final Grade = D"); //reads out a final grade of D
			}
			else { // if G is between 70-79 it should print the below
				System.out.println(G); //prints grade
				System.out.println("Final Grade = C"); //reads out a final grade of C
			}
		}
	// else if statement that will run if E is greater than or equal to 80 & differs if G is between 80-89 and 90-100
		else if ( E >= 80 && E <= 100) {
			G = (0.4 * F)+(0.2 * M)+(0.1 * T)+(0.3 * A); //similar to the original E calculation except values are being added together now
			if (G <= 89 && G >= 80) {//if G is between 80-89 it should print the below
				System.out.println(G);//prints grade
				System.out.println("Final Grade = B"); //reads out a final grade of B
			}
			else { //if G is between 90-100 it should print the below
				System.out.println(G);//prints grade
				System.out.println("Final Grade = A");//reads out a final grade of A
			}
		}

	}	
}
