//Write a program to convert the digits of the string into a single number
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        String ch=sc.nextLine();
        int a=0;
        for(int i=0;i<ch.length();i++)
        {
            char c=ch.charAt(i);
            if(Character.isDigit(c)){
                System.out.print(c);
                a=1;
            }
            
        }
        if(a==0){
            System.out.println(0);
        }
        
    }
}