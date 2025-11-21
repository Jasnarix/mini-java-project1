import java.util.Random; //importing Random generator


public class Main{
    public static void main(String[] args) {
        String argsString = args[0];              
        int argsInt = Integer.parseInt(argsString);     //Converting commandline string to int
        String output = "";

        
        for (int i = argsInt; i != 0; i--) {
            
            Random concatenate = new Random();              
            char c = (char)(concatenate.nextInt(95) + 32);
            output += c;
            System.out.println(c);
        }System.out.println(output);
    
    
     }
}