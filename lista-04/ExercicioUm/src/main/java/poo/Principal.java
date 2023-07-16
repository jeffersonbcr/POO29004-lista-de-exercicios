package poo;

public class Principal {
    public static void main(String[] args) {
        if(args.length > 3) System.out.println("numero de argumentos irregular, maximo de argumentos suportado igual a tres.");
        else {
            String opcao = "args[0]";
            switch (opcao.toLowerCase()) {
                case "ascii":
                    Retangulo retanguloAscii = new Retangulo(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
                    retanguloAscii.desenharASCII();
                    break;
                case "utf8":
                    Retangulo retanguloUft8 = new Retangulo(Integer.parseInt(args[1]),Integer.parseInt(args[2]));
                    retanguloUft8.desenharUTF8();
                    break;
                default:
                    System.out.println("Opcao de desenho para retangulo invalida");
            }
        }
    }
}
