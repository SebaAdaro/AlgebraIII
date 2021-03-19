package Trabajo1;

public class Guide1RecursiveSolution implements Guide1 {
    @Override
    public int exercise_1_d(int n) {
        return 0;
    }

    @Override
    public int exercise_2_c(int n) {
        return 0;
    }
    int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base
            return 1;
        } else if (n == 0) {  // caso base
            return 0;
        } else { //error
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
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
