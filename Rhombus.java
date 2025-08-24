public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sp,st;
        for(r=1;r<=n;r++){
            for(sp=1;sp<=n-r;sp++)
                System.out.print(" ");
            for(st=1;st<=n;st++)
                System.out.print("*");
            System.out.println();
           
        }
    }
}