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
        int sum = 0;
        int serie = 10, num1 = 0, num2 = 1, suma = 1;

        for (int i = 1; i < n; i++) {
            //primero sumamos
            sum = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
        }
        return sum;
    }

    @Override
    public boolean exercise_4(int[] array) {
        int size = array.length - 1; //recorre el arreglo de atras para adelante

        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[size]) {
                return false;
            }
            size--;
        }
        return true;
    }

    @Override
    public int exercise_6_b_iii(int n) {
        int counter = 0;
        for(int i=2;i<n;i++){
                while(n%i==0){
                    n=n/i;
                    counter++;
                    if(n==1){
                        System.exit(0);
                    }
                }
            }return counter;

        }
    @Override
    public int exercise_8(int[] coefs, int n) {
        int l = coefs.length;
        int grado = coefs.length-1;
        int[] coefs2 = new int[l];
        coefs2[n] = coefs[n];
        for (int i = n; i <=0 ; i--) {
            coefs2[i] = coefs[i] + coefs2[i+1]*n;
        }
        return coefs2[0];
    }
}
