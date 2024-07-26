import java.util.Scanner;

public class String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        
        if(s.length()==0){
            System.out.println(0);
        }else{
            String[] tokens = s.split("[^a-zA-Z]+");
            System.out.println(tokens.length);
            
            for( String str : tokens){
                System.out.println(str);
        }
        }
        
        // Write your code here.
        scan.close();
    }
}

