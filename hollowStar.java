public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n*2-1;
        int r,c;
        for(r=1;r<=n;r++){
            for(c=1;c<=n;c++){
                if(r==1||r==n||c==1||c==n||c+r==n+1||r==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}