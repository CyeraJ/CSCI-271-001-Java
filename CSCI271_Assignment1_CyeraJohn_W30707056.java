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
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] assignment = new int[7];
		int x = 0;
		int totalassign = 0;
    			for (int i = 0; i < 7; i++) {
				x = input.nextInt();
      				assignment[i] = x;
				totalassign += x;

    			} 
		int A = totalassign / 7; //did this instead of the number 7 because 
					
		
		int[] test = new int[7];
		int y = 0;
	        int totaltest = 0;
			for (int i = 0; i < 7; i++) {
                    		y = input.nextInt();
        		        test[i] = y;
                 		totaltest += y;
            		} 
		int T = totaltest / 7;

		int M = input.nextInt(); 
		int F = input.nextInt();			


		double E = ((0.4 * F)+(0.2 * M)+(0.1 * T))/0.7; //figured out the bug was turning 70 to 0.7
		double W = ((E-60)/20) * 0.3;
		double G = 0;
			if ( E < 60) {
				G = E;
				System.out.println(G);
				System.out.println("Final grade = F");
			}	 
			else if ( E < 80 && E >= 60) {
				G = (1-W) * E + (W*A);
				if (G <=79 && G >= 60) {
					System.out.println(G);
					System.out.println("Final Grade = D");
				}
				else {
					System.out.println(G);
					System.out.println("Final Grade = C");
				}
			}
			else if ( E >= 80) {
				G = (0.4 * F)+(0.2 * M)+(0.1 * T)+(0.3 * A);
				if (G <= 89 && G >= 80) {
					System.out.println(G);
					System.out.println("Final Grade = B");
				}
				else {
					System.out.println(G);
					System.out.println("Final Grade = A");
				}
			}

	}	
}
