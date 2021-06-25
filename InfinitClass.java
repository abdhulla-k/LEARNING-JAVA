import java.util.*;
public class main{

    public static void main( String[] ar ){

        Input f = new Input();
        f.display();

    }
}

public class Input{

    Output f = new Output();

    void display(){

        f.Enter();
    }
}

public class Output{

    void Enter(){

        System.out.println( "Enter your data");

        Data f = new Data();
        f.scanner();
    }

}

public class Data{

    void scanner(){

        Scanner s = new Scanner( System.in );
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        
        System.out.println( "You Entered :"+num1 +num2 );
    }
}