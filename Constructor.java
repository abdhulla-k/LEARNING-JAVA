import java.util.*;
public class main{

    public static void main(String[] args ){

        Sample sample = new Sample();
        
        sample.log("Hello");
    }
}

public class Sample{

    Sample(){
        
        System.out.println( "Iam a Constructor" );
    }
    
    public void log(String val){
        System.out.println(val);
    }


}