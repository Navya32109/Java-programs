import java.util.Scanner;

public class Mark {
    public static void main(String[] args){
        System.out.println("Enter the mark");
        Scanner sc =new Scanner(System.in);
        int mark=sc.nextInt();
        if (mark>90 && mark<=100){
            System.out.println("5-star");
        }
        else if (mark>70 && mark<=90){
            System.out.println("4-star");
        }
        else if (mark>50 && mark<=70){
            System.out.println("3-star");
        }
        else if(mark>0 && mark<=50){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid mark");
        }
        sc.close();
    }
}