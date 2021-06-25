public class main {
    
    public static void main ( String[] args){
        
        int a = 33;
        int divition = a / 2;

        if ( divition == 0 ){
            
            System.out.println ( "number is even" );

        }else{
            System.out.println ( "number is odd" );
        }
        int sum = 0;

        for ( int i = 0; i < a; i++ ){

            sum = sum + i;
        }
        System.out.println ( "Result is :" +sum );



        
        

    }
}