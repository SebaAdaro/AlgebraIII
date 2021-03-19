package Trabajo1;

public class Main {

    public static boolean exercise_4(int[] array) {  // 101 1221  11011
        int size = array.length;
        double middle = (int)size/2;
        //Sea An = {a1, a2, ...,an}, verificar si el conjunto es capicúa, es decir a1 = an; a2 = an-1, etc
        for (int i = 0; i < size; i++) {
            if (i == middle){
                break;
            }
            if (array[i] == array[size]){
                size--;
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,0,1};
        System.out.println(exercise_4(array));
    }
}
