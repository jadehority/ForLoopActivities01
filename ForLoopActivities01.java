public class MyProgram
{
    public static void main(String[] args)
    {
      /*****************
      * FOR LOOP NOTES *
      ******************
      *  
      * For loops allow you to set all the parameters of the
      * loop in one line. This makes it easy to set how many
      * times the loop repeats, where it starts, and where it 
      * ends.
      * 
      * For Loop Parameters
      *  1) Loop Variable (usually int)
      *  2) Loop condition. Loop continues while the condition is true.
      *  3) increment/decrement. How much to change the loop variable
      *     after each iteration of the loop.
      * 
      */
        
        // Repeat a message 10 times
        for( int x = 0; x < 10; x++ ){
            // repeat this
            System.out.println("it worked!");
        }
        
        System.out.println(); //extra line
        
        // Use loop variable in the body of the loop
        for( int x = 0; x < 10; x++ ){
            System.out.print(x);
        }
        
        System.out.println(); //extra line
        
        // Same as above with spaces added
        for( int x = 0; x < 10; x++ ){
            System.out.print(x + " ");
        }
        
        System.out.println(); //extra line
        System.out.println(); //extra line
        
        // Start or end at any number you want
        for( int i = 8; i > -2; i-- ){
            System.out.print(i);
        }
        
        System.out.println(); //extra line
        System.out.println(); //extra line
        
        // Increment by any amount
        for( int i = 3; i <= 33; i+=3 ){
            System.out.print(i);
        }
        
        System.out.println(); //extra line
        System.out.println(); //extra line
        
        // Do math with the loop variable.
        // For example: sum all the numbers from 1-100
        int sum = 0;
        for( int i = 1; i <= 100; i++ ){
            sum += i;
        }
        System.out.println(sum);
        
        // Some random math information
        Math.random();
        
        //Square root
        System.out.println( Math.sqrt(64) );
        
        //Raise any number to any power
        System.out.println( Math.pow(2,3) );
        
    }
}
