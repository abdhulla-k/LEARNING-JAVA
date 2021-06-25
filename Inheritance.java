import java.util.*;
public class Inheritance{

    public static void main( String[] args ){

        A obj = new A();
        B object = new B( 999992, 88886 );
        object.b = 10;
        obj.a = 9;

        object.display();
        object.print();
        object.getSuper();

    }
}
public class A{

    A( ){

        System.out.println( "from A" );
        System.out.println( "It is A constructor" );
    }

    A(int k){
        System.out.println( "It is argument constructor of A" );
    }

    int a;
    void display(){

        System.out.println( "class a "+a );
        

    }

    void print(){

        System.out.println( "Hello i am method print from class a. If you need me, you can call me with keyword 'sulper'");
    }
}
public class B extends A{

    B( int a,int s ){

        super(20);

        int sum = a + b;

        System.out.println( "From B, sum is :" +sum );
        System.out.println( "It is B constructor" );
    }

    int b;
    void print(){

        System.out.println( "class b"+b );
    }
    void getSuper(){

        super. print();
    }
}