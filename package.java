import java.util.*;

package hello.hey;

public static void main( String[] args ){

    h.display();


}

public class Hello{

void display(){

    System.out.println( "I am from package hey");

}



}

package hello.hai;

public class call{


    Hello h = new Hello();

    

    }
}