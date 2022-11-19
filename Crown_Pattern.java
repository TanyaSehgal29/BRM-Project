//COMPLETED
package level3;

import java.util.Scanner;
public class Crown_Pattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER AN ODD NUMBER UPTO 51");
        int num = sc.nextInt();
        pattern(num);
    }
    
    static void pattern(int num)
    {
        int ilimit = (num/2)/2;         //limit of right angled triangles
        //rows of triangles
        for(int i=1; i<=ilimit; i++)
        {
            //left triangle
            for(int j=1; j<=i; j++)
            {
                System.out.print("#");
            }
            //spaces                   
            for(int k=1; k<=((num/2)+1)-(i*2); k++)
            {
                System.out.print(" ");
            }
            //center triangle
            for(int l=1; l<=(i*2)-1; l++)
            {
                System.out.print("#");
            }
            //spaces
            for(int m=1; m<=((num/2)+1)-(i*2); m++)
            {
                System.out.print(" ");
            }
            //right triangle
            for(int n=1; n<=i; n++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
        //* band rows
        for(int i=1; i<=ilimit; i++)
        {
            for(int j=1; j<=num; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
