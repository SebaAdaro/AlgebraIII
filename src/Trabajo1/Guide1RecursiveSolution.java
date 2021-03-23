package Trabajo1;

public class Guide1RecursiveSolution implements Guide1 {
    @Override
    public int exercise_1_d(int n) {
        if (n > 0){
            return (2*n) - 1 + exercise_1_d(n - 1);
        }
        return 0;
    }


    @Override
    public int exercise_2_c(int n) {
        if (n > 1) {
            return exercise_2_c(n - 1) + exercise_2_c(n - 2);
        } else if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    @Override
    public boolean exercise_4(int[] array) {
        if (array.length == 0 || array.length == 1) return true;
        if (array.length == 2) if (array[0] == array[1]) return true;
        if (array[0] == array[array.length - 1]) {
            int[] newArray = new int[array.length - 2];
            for (int i = 0; i < array.length - 2; i++) {
                newArray[i] = array[i + 1];
            }
            return exercise_4(newArray);
        }
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
