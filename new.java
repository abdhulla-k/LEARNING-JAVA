import java.util.*;
public class main {
    
    public static void main ( String[] args){

        int sum = 0;

        for ( int i = 0; i < 20; i++ ){
            
            sum=sum-sum+i;
            System.out.println ( "Result is :" + i );
            
        

        }
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);

        



    }
}