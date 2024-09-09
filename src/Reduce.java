public class Reduce {
    public static void main(String[] args) {
        int r = 0;
        int i = 100;
        while (i != 0){

            boolean divisibleBy2 = i % 2 == 0;

            if (divisibleBy2){
                i /= 2;
                r++ ;
            }
            else {
                i -= 1;
                r++ ;
            }
        }
        System.out.println(r);
    }
}
