package basicjavapractice;

import java.math.BigInteger;
import java.util.Random;

public class Test1 {

    public static void main(String[] args) {
        BigInteger value = BigInteger.probablePrime(2, new Random());
        System.out.println(value);

    }
}
