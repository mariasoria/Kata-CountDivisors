public class CountDivisors {

    public static long numberOfDivisors(int n) {
        long counter = 0;

        for (int i = n; i > 0; i--){
            if((n % i) == 0) counter++;
        }
        return counter;
    }

}
