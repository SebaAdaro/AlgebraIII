package Trabajo1;

public class Main {

    public static int exercise_6_b_iii(int n) {
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if ((n%i) == 0  ){
                counter++;
            }
        }return counter;
    }

    public static void main(String[] args) {
        int[] array = {1,0,0,1,5};
        System.out.println(exercise_6_b_iii(5));
    }
}
