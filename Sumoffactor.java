public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,i=1;
        while(i<=n){
            if(n%i==0){
                sum+=i;
            }
            i++;
        }
        sc.close();
        System.out.println(sum);
    }
}