import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str="I am a student";
        long i=Arrays.stream(str.split(" ")).count();
        System.out.println(i);
    }
}
