//Write a program to reverse a given string without using in-built functions
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=a.length()-1;i>=0;i--){
            char ch=a.charAt(i);
            System.out.print(ch);
        }
    }
}