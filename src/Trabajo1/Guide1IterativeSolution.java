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
    public boolean exercise_4(int[] array) {  // 101 1221  11011
        int size = array.length;
        double middle = size/2;
        //Sea An = {a1, a2, ...,an}, verificar si el conjunto es capicúa, es decir a1 = an; a2 = an-1, etc
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[size]){
                return false;
            }size--;
        }
        return true;
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
