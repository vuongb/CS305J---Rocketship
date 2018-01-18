/**
 * @author  Bryan Vuong
 * @version 09/20/2010
 * CS305J Lab 3
 * On my honor, Bryan Vuong, this programming assignment is my own work.
 *
 *
 * A program to print out a rocket ship.
 *
 * Slip days information.
 * Number of slip days I am using on this assignment:0
 * Number of slip days I think I have so far this semester
 * including this assignment: Maximum Amount
 */
public class Rocketship {
	//Variable SIZE determines the length and width of rocket
	public static final int SIZE = 3;
	
	public static void main(String[] args)
	{

	coneHead();
	barbedWire();
	topBox();
	bottomBox();
	barbedWire();
	bottomBox();
	topBox();
	barbedWire();
	coneHead();
	
	}
	//Prints the rocket's cone
	public static void coneHead() {
		//Specifies the Size of the top cone
		for(int i=1; i<=2*SIZE-1; i++)
		{
			//Specifies the amount of spaces needed
			for(int j=1; j<=2*SIZE-i;j++)
			{
				space();
			}
			//Specifies the amount of forward slashes
			for(int k=1; k<=i; k++)
			{
				forwardSlash();
			}
			System.out.print("**");
			//Specifies the amount of back slashes
			for(int l=1; l<=i; l++)
			{
				backSlash();
			}
			newLine();
		}
	}
	//Prints out the line separating the boxes and cone
	public static void barbedWire()
	{
	plus();
	//Prints the amount of "=*" as the width specified
	for (int i=1; i<=2*SIZE; i++)
	{
		equalStar();
	}
	plus();
	newLine();
	}
	//Prints the top half of the box
	public static void topBox()
	{
		//Specifies the height of the box's half
		for (int i=1; i<=SIZE; i++)
		{
			//Prints the Border
			System.out.print("|");
			//Specifies the amount of dots needed on the boundaries
			for(int j=1; j<=SIZE-i; j++)
			{
				dot();
			}
			//Specifies how many triangles are needed
			for(int k=1; k<=i; k++)
			{
				forwardSlash();
				backSlash();
			}
			//Specifies how many center dots are needed
			for(int l=1; l<=2*SIZE-2*i; l++)
			{
				dot();
			}
			//Specifies how many triangles are needed
			for(int m=1; m<=i; m++)
			{
				forwardSlash();
				backSlash();
			}
			//Specifies how many boundary dots are needed
			for(int n=1; n<=SIZE-i; n++)
			{
				dot();
			}
			//Prints the box's boundary
			line();
			newLine();
			}
	}
	//Prints the bottom half of the box
	public static void bottomBox()
	{
		//Specifies the height of the box's half
		for (int i=SIZE; i>=1; i--)
		{
			//Prints the Border
			System.out.print("|");
			//Specifies the amount of dots needed on the boundaries
			for(int j=1; j<=SIZE-i; j++)
			{
				dot();
			}
			//Specifies how many triangles are needed
			for(int k=1; k<=i; k++)
			{
				forwardSlash();
				backSlash();
			}
			//Specifies how many center dots are needed
			for(int l=1; l<=2*SIZE-2*i; l++)
			{
				dot();
			}
			//Specifies how many triangles are needed
			for(int m=1; m<=i; m++)
			{
				forwardSlash();
				backSlash();
			}
			//Specifies how many boundary dots are needed
			for(int n=1; n<=SIZE-i; n++)
			{
				dot();
			}
			//Prints the box's boundary
			line();
			newLine();
			}
	}
	public static void dot()
	{
		System.out.print(".");
	}
	public static void line()
	{
		System.out.print("|");
	}
	public static void newLine()
	{
		System.out.println("");
	}
	public static void plus()
	{
		System.out.print("+");
	}
	public static void equalStar()
	{
		System.out.print("=*");
	}
	public static void forwardSlash()
	{
		System.out.print("/");
	}
	public static void backSlash()
	{
		System.out.print("\\");
	}
	public static void asterisk()
	{
		System.out.print("**");
	}
	public static void space()
	{
		System.out.print(" ");
	}
}
