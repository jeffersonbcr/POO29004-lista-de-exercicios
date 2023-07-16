import java.util.*;

public class Exercicio03 {

    public static boolean isPrime(int numero) {
        numero = Math.abs(numero);
        if (numero % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int contPar = 0, contImpar = 0, contPrimos = 0;
        Map<Integer, Integer> tabela = new HashMap<>();

        Scanner leitorDeArquivo = new Scanner(System.in);
        while (leitorDeArquivo.hasNext()) {
            int dadoDoArquivo = leitorDeArquivo.nextInt();
            if (tabela.containsKey(dadoDoArquivo)) {
                int valorAntigo = tabela.get(dadoDoArquivo);
                int valorAtualizado = valorAntigo + 1;
                tabela.replace(dadoDoArquivo, valorAntigo, valorAtualizado);
            } else {
                tabela.put(dadoDoArquivo, 1);
            }
        }
        ArrayList<Integer> listaMaisRepetidos = new ArrayList<>();
        ArrayList<Integer> listaUnicos = new ArrayList<>();

        for (Integer key : tabela.keySet()) {
            int dadoDaTabela = tabela.get(key);
            if (dadoDaTabela > 1) {
                if (key % 2 == 0) {
                    if (isPrime(dadoDaTabela)) {
                        contPrimos = contPrimos + 1;

                    } else
                        contPar = contPar + 1;
                } else {
                    if (isPrime(key)) {
                        contPrimos = contPrimos + 1;

                    } else
                        contImpar = contImpar + 1;
                }
            } else {
                listaUnicos.add(key);
                if (key % 2 == 0) {
                    if (isPrime(key)) {
                        contPrimos = contPrimos + 1;

                    } else
                        contPar = contPar + 1;
                } else {
                    if (isPrime(key)) {
                        contPrimos = contPrimos + 1;

                    } else
                        contImpar = contImpar + 1;
                }
            }
        }

        for (int value : tabela.values()) {
            listaMaisRepetidos.add(value);
        }

        listaMaisRepetidos.sort(null);

        System.out.println("Total de numeros Únicos: " + listaUnicos.size());
        System.out.print("Números(s) com o maior número de repetições: ");

        for (Integer chave : tabela.keySet()) {
            int numeroDeMaiorRepeticao = tabela.get(chave);
            if (numeroDeMaiorRepeticao == listaMaisRepetidos.get(listaMaisRepetidos.size() - 1)) {
                System.out.print(chave + " ");
            }
        }

        System.out.println();
        System.out.println("Total de números pares: " + contPar);
        System.out.println("Total de números ímpares: " + contImpar);
        System.out.println("Total de números primos: " + contPrimos);

    }
}