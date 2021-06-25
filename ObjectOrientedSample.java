import java.util.*;
public class main {
    
    public static void main ( String[] args){

        sample S1 = new sample();
        sample S2 = new sample();

        S1.a = 20;
        S2.a = 30;
        S1.b = 33;
        S2.b = 99;
    

        System.out.println( "S1 a is:"+S1.a );
        System.out.println( "S2 a is:"+S2.a );
        System.out.println( "S1 b is:"+S1.b );
        System.out.println( "S2 b is:"+S2.b );


        S1.display();
        S2.display();


    }
   
}

public class sample{
    int a;
    int b;



    void display(){

        System.out.println( "Resultis:"+a );
        System.out.println( "Resultis:"+b );
        
    }

}