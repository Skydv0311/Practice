public class GCD {
    public static int getGcd(int n1,int n2){
     /**
      * Solution 1
        if(n1==0){

            return n2;
        }
        return getGcd(n2%n1,n1);
      */

        /**
         * Solution 2
         */
        if(n1==0 || n2==0)
            return 0;
        else if(n1==n2)
            return n1;
        else if(n1>n2)
            return getGcd(n1-n2,n1);
        else
            return getGcd(n1,n2-n1);

    }

    public static void main(String[] args) {
        System.out.println(getGcd(60,36));
    }
}
