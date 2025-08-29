public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int co=0;
        for (int i=1;i<=val;i++){
            if(val%i==0){
                co++;
            }
        }
        sc.close();
        System.out.println(co);
        
    }
}