package sportsstar;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Footballer f1=new Footballer();



        System.out.println("Enter no of players in football:");
        Scanner sc=new Scanner(System.in);
        int footballer_count=sc.nextInt();
        int[] goals=new int[footballer_count];

        int total_goals=0;
        System.out.println(" No of goals scored or saved by each footballer:");
        for(int i=0;i<footballer_count;i++)
        {
            goals[i]= sc.nextInt();
            total_goals+=goals[i];
        }

        int avg_goals=total_goals/footballer_count;
        f1.calc_income(avg_goals);

        Cricketer c1=new Cricketer();


        System.out.println("Enter no of players in cricket");

        int cricketer_count=sc.nextInt();
        int[] bat_bowl=new int[cricketer_count];

        int total_cricket_score=0;
        System.out.println(" bating or bowling avg of each cricketer:");
        for(int i=0;i<cricketer_count;i++)
        {
            bat_bowl[i]= sc.nextInt();
            total_cricket_score+=bat_bowl[i];
        }

        int avg_bat_bowl=total_cricket_score/cricketer_count;
        c1.calc_income(avg_bat_bowl);
    }
}
