import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        int num = Integer.parseInt(n);
        if(IsPrime(num)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
    public static boolean IsPrime(int num){
        for(int i=2; i<num-1; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
