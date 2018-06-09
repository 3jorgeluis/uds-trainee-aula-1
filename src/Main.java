import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        System.out.println("hello world");
        String nome = "jorge";
        String sobrenome = "luis";
        Integer idade = 18;
        Boolean generomasculino = true;
        Double peso = 65.444;
        System.out.println(nome + " " + sobrenome + " "  + idade + "anos" + generomasculino + " " + peso);
        if (idade <= 18) {
            System.out.println("novinho");
        } else if (idade > 18 && idade <= 30) {
            System.out.println("toizinho");
        } else {
            System.out.println("tiozão");
        }

        Integer dia = 5;
        switch (dia) {
            case 0:
                System.out.println("domingo");
                break;
            case 1:
                System.out.println("segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("quarta");
                break;
            case 4:
                System.out.println("quinta");
                break;
            case 5:
                System.out.println("sexta");
                break;
            case 6:
                System.out.println("sabado");
        }

        Scanner scanner = new Scanner (System.in);
        System.out.println("digita ai:");
        Integer entrada = scanner.nextInt();
        System.out.println(jorge(entrada));


    }

    public static String jorge(Integer numero)
    {
        switch (numero) {
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
            case 10:
                return "X";
        }
        return "digite um numero entre 1 e 10";
    }
}

