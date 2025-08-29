public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2,co=0;
        while(n>1){
            if(n%i==0){
                co++;
                n=n/i;
            }
            else{
                if(co>=1)
                    System.out.println(i+"->"+co);
                    co=0;
                    i++;
            }
        }
        sc.close();
        System.out.println(i+"->"+co);
    }
}