import java.util.*;
public class main{

    public static void main( String[] args ){

        System.out.println( "Enter two numbers");

        Scanner s = new Scanner( System.in );

        int a = s.nextInt();
        int b = s.nextInt();
        
        
        ThisSample f = new ThisSample( a, b );

        f.display();
        f.sum();
        
        
    }
}

public class ThisSample{

    int a, b;

    

    ThisSample( int a , int b ){

        this.a = a;
        this.b = b;

        System.out.println( "you entered "+this.a );
        System.out.println( "and "+this.b );
    }
    void display(){

        System.out.println( "a is:" +this.a );
        System.out.println( "b is:" +this.b );
    }

    void sum(){

        int c = this.a + this.b;

        System.out.println( "sum is :"+c );
    }
}