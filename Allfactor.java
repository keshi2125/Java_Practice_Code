public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<a;i++){
            if(a%i==0){
                System.out.print(i+",");
            }

        }
        sc.close();
        System.out.println(a);
    }
}