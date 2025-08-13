//Write a program to accept the string and rotate the string n times
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        sc.nextLine();
        String ch=sc.nextLine();
        int l=ch.length();
        int n=s%l;
        String ch1=ch.substring(n)+ch.substring(0,n);
        System.out.println(ch1);
    }
}