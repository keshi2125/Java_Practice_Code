//Write a program to accept the string from the user and display the string in the password format without making any change in the input array
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        for(int i=0;i<ch.length();i++)
            System.out.print("*");
    }
}