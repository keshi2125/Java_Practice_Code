public class Main{
    class Res{
        String Foodname;
        int Rate;
        Res next;
        public Res(String Foodname,int Rate){
            this.Foodname=Foodname;
            this.Rate=Rate;
            this.next=null;
        }
    }
    Res st=null,end=null;
    void insert(String a,int b){
        Res ne=new Res(a,b);
        if(st==null){
            st=ne;
            ed=ne;
        }
        else{
            ed.next=ne;
            ed=ne;
        }
    }

    void displaytot(){
        Res i=st;
        int sum=0;
        while(i!=null){
            sum=sum+i.Rate;
            i=i.next;
        System.out.println(sum);
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Main n=new Main();
        while(true){
            System.out.println("\n1.add\n2.Displaytotal\n3.exit");
            int op=sc.nextInt();
            switch(op){
            case 1:
                System.out.println("Enter Food ");
                String da=sc.nextLine();
                System.out.println("Rate");
                int db=sc.nextInt();
                n.insert(da,db);
                break;
            
            case 2:
                System.out.println("Total Rate of Food");
                m.displaytot();
                break;
            
            case 3:
            System.out.println("Enjoy your Food");
            break;

            default:
                System.out.println("Invalid");




                 

        }
    }
}