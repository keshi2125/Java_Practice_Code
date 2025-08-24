public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int sp=1;sp<=row-i;sp++){
                System.out.print(" ");
            }
            for(int st=1;st<=2*i-1;st++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}