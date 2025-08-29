public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int power=sc.nextInt();
        int copy=1;
        for(int i=1;i<=power;i++){
            copy*=base;
        }
        sc.close();
        System.out.println(copy);
    }
}