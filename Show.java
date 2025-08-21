import java.util.*;

abstract class Show{
    private String showname;
    private int time;

    public Show(String showname,int time){
        this.showname=showname;
        this.time=time;
    }
    public String getShowname() {
         return showname; 
        }
    public int getTime() { return time; }

    public abstract void getshowDetails();
}
class Vjsiddhu extends Show{
    public Vjsiddhu(String showname,int time){
        super(showname,time);
    }
    @override
    public void getshowDetails(){
        System.out.println(+getShowname() + " Show starts in " +getTime());
    }
}
class Parithabangal extends Show{
    public Parithabangal(String showname,int time){
        super(showname,time);
    }
    @override
    public void getshowDetails(){
        System.out.println(+getShowname()+" show starts in "+getTime());
    }
}
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcom to Show");
        System.out.println("Enter a Show");
        Show h;
        while(true){
            System.out.println("\n1.Add travel Show");
            System.out.println("2.Add comedy Show");
            System.out.println("4.Exit");
            System.out.println("Enter Choice");
            int choose=sc.nextInt();
            sc.nextLine();
            switch(choose){
                case 1:
                    System.out.println("Enter Showname");
                    String vshow=sc.nextLine();
                    System.out.println("Enter Time");
                    int vtime=sc.nextInt();
                    h=new Vjsiddhu(vshow,vtime);
                    h.getshowDetails();
                    break;

                case 2:
                    System.out.println("Enter Showname");
                    String pshow=sc.nextLine();
                    System.out.println("Enter Time");
                    int ptime=sc.nextInt();
                    h=new Parithabangal(pshow,ptime);
                    h.getshowDetails();
                    break;
                
                default:
                    System.out.println("enter correctly");
                    break;


            }
        }
    }
}