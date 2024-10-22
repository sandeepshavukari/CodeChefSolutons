/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*; 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int n=in.nextInt();
	        int x=in.nextInt();
	        int y=in.nextInt();
	        
	        int c1 = Math.min(x,y/3);
            int rem = x-c1;
            int c2 = Math.min(rem/2,n-c1);
            if(c1+c2 >= n)
            System.out.println("yes");
            else
            System.out.println("no");
	    }
		// your code goes here
	}
}
