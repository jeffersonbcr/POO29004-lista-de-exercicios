import java.util.Random;
public class Exercicio02{
    public static void main(String[] args) {
        Random aleaotorio = new Random();
        int[] numerosAleatorios = new int[10];
        System.out.println("Dados do vetor ");
        for (int cont = 0; cont < 10; cont++) {
            numerosAleatorios[cont] = aleaotorio.nextInt(100);
            System.out.println(numerosAleatorios[cont]);
        }
        System.out.println();
        int k, j, n = numerosAleatorios.length, aux;
        for (k = 1; k < n; k++) {
        
            for (j = 0; j < n - k; j++) {
               
                if (numerosAleatorios[j] > numerosAleatorios[j + 1]) {
                 
                    aux = numerosAleatorios[j];
                    numerosAleatorios[j] = numerosAleatorios[j + 1];
                    numerosAleatorios[j + 1] = aux;
                }
            }
        }
        System.out.println("Dados do vetor ordenado");
        for (int cont2 = 0; cont2 < 10; cont2++) {
            System.out.println(numerosAleatorios[cont2]);
        }
    }
}