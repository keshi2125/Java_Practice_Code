//Write a program to find the length of the string without using in-built function
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(0);
            count++;
        }
        System.out.println(count);
    }
}