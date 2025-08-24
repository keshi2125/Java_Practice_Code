public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int size=row*2-1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==j || i+j==size+1){
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