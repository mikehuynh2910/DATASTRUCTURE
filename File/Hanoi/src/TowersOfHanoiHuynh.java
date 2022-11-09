import java.util.*;
public class TowersOfHanoiHuynh {
	/*
	* Recursion - definition: Recusrion is the basic technique in programming
	* in which method calls itself continuously.
	*/
	static int moves = 0; // static variable to count number of moves
	// Driver code
	public static void main( String[] args ) {
	Scanner insi = new Scanner(System.in);
	System.out.print("Please enter the number of disks: ");
	int disks = insi.nextInt();
	moveTower(disks, 'A', 'B', 'C');
	System.out.printf(disks +" disks requires "+ moves +" moves ");
	  
	}
	/*
	* There are only 3 columns to move.
	* Only one disk can be moved at a time (no middle disk).
	* A disk can only be placed on a larger disk
	* it is not necessary that the two disks be of contiguous size
	* the smallest disk can rest on top of the largest disk
	* This recursive method moves one disk at a time from one peg to another being careful to not
	* place a larger disk onto a smaller disk. If first moves the stack of disks from the source(A)
	* peg to the destination(C) peg using the B peg as the spare peg and then moves the stack back
	* from the source(C) to the destination(B) peg using the A peg as the spare peg.
	*/
	private static void moveTower(int disk, char src, char dest, char spare) {
	if (disk != 0) {
	moveTower(disk - 1, src, spare, dest); // Move stack of disks to the spare peg
	moves++; // move disk from src to dest
	moveTower(disk - 1, spare, dest, src); // Move stack of disks back to dest peg
	}
	}
}
