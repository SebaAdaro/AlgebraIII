package Trabajo1;

public class Guide1IterativeSolution implements Guide1 {
    @Override
    public int exercise_1_d(int n) {
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number = (2 * i) - 1;
        }
        return number;
    }

    @Override
    public int exercise_2_c(int n) {  //termino enesisimo de fibonacci
        int serie = 10, num1 = 0, num2 = 1, suma = 0;

        for (int i = 1; i < n; i++) {

            suma = num1 + num2;

            num1 = num2;

            num2 = suma;
        }
        return suma;
    }

    @Override
    public boolean exercise_4(int[] array) {
        return false;
    }

    @Override
    public int exercise_6_b_iii(int n) {
        return 0;
    }

    @Override
    public int exercise_8(int[] coefs, int n) {
        return 0;
    }
}
