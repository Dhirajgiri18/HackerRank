import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine().trim();
        BigInteger num = new BigInteger(n);
        System.out.println(num.isProbablePrime(10) ? "prime" : "not prime");
        bufferedReader.close();
    }
}
