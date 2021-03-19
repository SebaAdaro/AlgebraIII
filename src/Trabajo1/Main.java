package Trabajo1;

public class Main {

    public static boolean exercise_4(int[] array) {
        int size = array.length - 1; //recorre de atras para adelante

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[size]) {
                return false;
            }
            size--;
        }
        return true;
    }


    public static void main(String[] args) {
        int[] array = {1, 0, 6, 6, 0, 1};
        System.out.println(Main.exercise_4(array));
    }
}
