package recursion.TowerofHanoi;

import java.util.Scanner;

public class TowerofHanoi {
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the number of Disks:");
	int n = scan.nextInt();
	System.out.println("\nFollow the steps given below:\n");
	hanoi(n, 'A', 'B', 'C');
	scan.close();
}

static void hanoi(int n, char source, char temp, char dest)
{
if(n==1)
{
System.out.println("Move Disk "+ n +" from " + source + " to " + dest);
return;
}
hanoi(n-1,source,dest,temp);
System.out.println("Move Disk "+ n +" from " + source + " to " + dest);
hanoi(n-1,temp,source,dest);
}
}