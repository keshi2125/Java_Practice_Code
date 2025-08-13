//Write a program to count the number of upper-case characters in a given string
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            if(ch>='A' && ch<='Z')
                count++;
            
        }
        System.out.println(count);
    }
}