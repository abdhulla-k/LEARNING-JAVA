import java.util.*;
public class main{
    
    public static void main(String[]args){

        Scanner s = new Scanner( System.in );

        System.out.println( "Enter \n 1 for addition \n 2 for substraction \n 3 for multiplication\n 4 for divition \n 5 for find percentage \n 6 for CAGR \n 7 for Growth percentage \n 8 for PE ratio");
        int number = s.nextInt();

        
        if( number == 1){

            System.out.println( "Enter two number's" );
        
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println ( "You entered \n"+a );
        System.out.println ( "and "+b );


            int result = sum( a, b );
            System.out.println( "result is :" +result);

        }else if( number == 2 ){

            System.out.println( "Enter two number's" );
        
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println ( "You entered \n"+a );
        System.out.println ( "and "+b );


            int result = substraction( a, b );
            System.out.println( "Result is :" +result);

        }else if( number == 3 ){

            System.out.println( "Enter two number's" );
        
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println ( "You entered \n"+a );
        System.out.println ( "and "+b );


            int result = multiplication( a, b );
            System.out.println( "Result is :" +result);

        }else if( number == 4 ){

            System.out.println( "Enter two number's" );
        
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println ( "You entered \n"+a );
        System.out.println ( "and "+b );


            int result = divition( a, b );
            System.out.println( "Result is :" +result);

        }else if( number == 5 ){

            System.out.println( "Enter two number's" );
        
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println ( "You entered \n"+a );
        System.out.println ( "and "+b );

        
            int result = percentage( a, b );
            System.out.println( "Result is :" +result );

            

        }else if( number == 6 ){

            System.out.println( "Enter\n Initial investment\n Growth rate\n and Time frame");

            float InitialInvestment = s.nextInt();
            float GrowthRate = s.nextInt();
            float TimeFrame = s.nextInt();

            float result = CAGR( InitialInvestment, GrowthRate, TimeFrame );

            System.out.println( "Result is :"+result );

        }else if( number == 7 ){

            System.out.println( " Initial investment \n growth rate\n time frame\n ");

            float InitialInvestment = s.nextInt();
            float growthPercentage = s.nextInt();
            float timeFrame = s.nextInt();
            float result = growthPercentage( InitialInvestment, growthPercentage, timeFrame );
            System.out.println( "Total Percentage is :" +result );

        }else if( number == 8 ){

            System.out.println( "Enter\n count of outstanding shares \n net income" );
            
            float shares = s.nextInt();
            float income = s.nextInt();
            float PE = PE( shares, income );

            System.out.println( "result is :"+PE );
        }

        else{

            System.out.println( "You entered wrong camand ");

        }

        

    }


    static int sum ( int a, int b ){

    int result = a + b;
    return result;
}


static int multiplication (int a, int b){

    int result = a * b;
    return result;

}

static int divition( int a, int b){

    int result = a / b;
    return result;
}

static int substraction( int a, int b ){

    int result = a - b;
    return result;

}

static int percentage( int a , int b){

    int result =  a * b / 100;
    return result;

}

static float CAGR( float InitialInvestment, float GrowthRate, float TimeFrame ){

    float n = InitialInvestment;

    for( int i = 1; i <= TimeFrame; i++ ){

        n = n * GrowthRate / 100 + n;
    }

    float result = n;

    return result;
}

static float growthPercentage( float InitialInvestment, float percentage ,float timeframe ){

    float ressult = CAGR( InitialInvestment, percentage, timeframe );

    System.out.println( "Grown amount is : " +ressult );

    
    float OnePercentage = InitialInvestment / 100;
    float Answer = ressult / OnePercentage;

    float growth = Answer - 100;

    System.out.println( "Growth percentage is :" +growth );

    return Answer;

}
static float PE( float shares, float netIncome ){

    float result = netIncome / shares;
    return result;
}

}