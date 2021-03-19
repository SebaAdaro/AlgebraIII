package Trabajo1;

public class Main {

    public static int exercise_2_c(int n) {  //termino enesisimo de fibonacci
        int serie = 10, num1 = 0, num2 = 1, suma = 0;

        for (int i = 1; i < n; i++) {

            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println(exercise_2_c(4));
    }
}
