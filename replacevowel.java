//Write a program to replace all vowels with spaces
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String replace=a.replaceAll("[aeiouAEIOU]"," ");
        System.out.println(replace);
    }
}