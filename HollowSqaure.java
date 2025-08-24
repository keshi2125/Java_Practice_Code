public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,c;
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                if(r==1||r==n||c==1||c==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }System.out.println();
        }
    }
}