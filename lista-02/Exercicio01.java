public class Exercicio01 {
    public static void main(String[] args) {
        String teste = args[0];
        int numeroDeLinhas = Integer.parseInt(args[1]);
        if (teste.equalsIgnoreCase("quadrado")) {

            if (numeroDeLinhas % 2 == 0) {
                for (int linha = 0; linha < numeroDeLinhas; linha++) {
                    System.out.println();
                    for (int colunas = 0; colunas < numeroDeLinhas; colunas++) {

                        if ((linha == 0) || (linha == numeroDeLinhas - 1)) {
                            System.out.print("*");
                        } else {
                            if ((colunas == 0) || (colunas == numeroDeLinhas - 1)) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }

                    }
                }

            } else {
                System.out.println("O numero de linhas nao e possivel reproduzir um quadrado , digite um numero de linhas que seja: par");
            }

        } else if (teste.equalsIgnoreCase("losango")) {

            if (numeroDeLinhas % 2 == 0) {
                System.out.println("O numero de linhas nao e possivel reproduzir um losango , digite um numero de linhas que seja: impar");
            } else {
                int numeroDeLinhasAuxliar = numeroDeLinhas, contadorLinha, contadorColuna, meio;
                numeroDeLinhasAuxliar++;
                meio = (numeroDeLinhasAuxliar / 2);
                for (contadorLinha = 1; contadorLinha <= meio; contadorLinha++) {
                    for (contadorColuna = 1; contadorColuna <= (meio - contadorLinha); contadorColuna++) {
                        System.out.print(" ");

                    }
                    if (contadorLinha == 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("*");

                        for (contadorColuna = 1; contadorColuna <= 2 * contadorLinha - 3; contadorColuna++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for (contadorLinha = meio + 1; contadorLinha < numeroDeLinhasAuxliar; contadorLinha++) {
                    for (contadorColuna = 1; contadorColuna <= contadorLinha - meio; contadorColuna++) {
                        System.out.print(" ");
                    }
                    if (contadorLinha == numeroDeLinhasAuxliar - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print("*");

                        for (contadorColuna = 1; contadorColuna <= 2 * (numeroDeLinhasAuxliar - contadorLinha) - 3; contadorColuna++) {

                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }


        } else {
            System.out.println("A forma geometrica digitada nao e possivel reproduzir, digite: quadrado ou losango");
        }

    }
}
