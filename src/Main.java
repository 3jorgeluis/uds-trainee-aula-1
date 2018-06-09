import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Integer saldo = 1500;
        int novosaldo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("digita a categoria:");
        Integer entrada = scanner.nextInt();
        while (saldo > 25) {
            switch (entrada) {
                case 1:

                    System.out.println("categoria 1");
                    Scanner var = new Scanner(System.in);
                    System.out.println("digita o produto:");
                    Integer produto = var.nextInt();
                    switch (produto) {
                        case 1:
                            System.out.println("produto 1");
                            saldo -= 150;
                            break;
                        case 2:
                            System.out.println("produto 2");
                            saldo -= 200;
                            break;
                        case 3:
                            System.out.println("produto 3");
                            saldo -= 225;
                            break;
                        case 4:
                            System.out.println("produto 4");
                            saldo -= 50;
                            break;
                        case 5:
                            System.out.println("produto 5");
                            saldo -= 68;
                            break;


                    }
                case 2:

                    System.out.println("categoria 2");
                    Scanner var2 = new Scanner(System.in);
                    System.out.println("digita o produto:");
                    Integer produto2 = var2.nextInt();
                    switch (produto2) {
                        case 1:
                            System.out.println("produto 1");
                            saldo -= 300;
                            break;
                        case 2:
                            System.out.println("produto 2");
                            saldo -= 226;
                            break;
                        case 3:
                            System.out.println("produto 3");
                            saldo -= 289;
                            break;
                        case 4:
                            System.out.println("produto 4");
                            saldo -= 51;
                            break;
                        case 5:
                            System.out.println("produto 5");
                            saldo -= 25;
                            break;
                    }
                case 3:

                    System.out.println("categoria 3");
                    Scanner var3 = new Scanner(System.in);
                    System.out.println("digita o produto:");
                    Integer produto3 = var3.nextInt();
                    switch (produto3) {
                        case 1:
                            System.out.println("produto 1");
                            saldo -= 176;
                            break;
                        case 2:
                            System.out.println("produto 2");
                            saldo -= 400;
                            break;
                        case 3:
                            System.out.println("produto 3");
                            saldo -= 295;
                            break;
                        case 4:
                            System.out.println("produto 4");
                            saldo -= 15;
                            break;
                        case 5:
                            System.out.println("produto 5");
                            saldo -= 98;
                            break;
                    }
                case 4:

                    System.out.println("categoria 4");
                    Scanner var4 = new Scanner(System.in);
                    System.out.println("digita o produto:");
                    Integer produto4 = var4.nextInt();
                    switch (produto4) {
                        case 1:
                            System.out.println("produto 1");
                            saldo -= 15;
                            break;
                        case 2:
                            System.out.println("produto 2");
                            saldo -= 78;
                            break;
                        case 3:
                            System.out.println("produto 3");
                            saldo -= 225;
                            break;
                        case 4:
                            System.out.println("produto 4");
                            saldo -= 566;
                            break;
                        case 5:
                            System.out.println("produto 5");
                            saldo -= 64;
                            break;
                    }
                case 5:

                    System.out.println("categoria 1");
                    Scanner var5 = new Scanner(System.in);
                    System.out.println("digita o produto:");
                    Integer produto5 = var5.nextInt();
                    switch (produto5) {
                        case 1:
                            System.out.println("produto 1");
                            saldo -= 150;
                            break;
                        case 2:
                            System.out.println("produto 2");
                            saldo -= 423;
                            break;
                        case 3:
                            System.out.println("produto 3");
                            saldo -= 225;
                            break;
                        case 4:
                            System.out.println("produto 4");
                            saldo -= 50;
                            break;
                        case 5:
                            System.out.println("produto 5");
                            saldo -= 68;
                            break;
                    }
            }
        }
        System.out.println("voce nao tem saldo suficiente");
        System.out.println(saldo);
    }

}

//    public static void main(String[] args) {
//
//        System.out.println("hello world");
//        String nome = "jorge";
//
//        String sobrenome = "luis";
//        Integer idade = 18;
//        Boolean generomasculino = true;
//        Double peso = 65.444;
//        System.out.println(nome + " " + sobrenome + " "  + idade + "anos" + generomasculino + " " + peso);
//        if (idade <= 18) {
//            System.out.println("novinho");
//        } else if (idade > 18 && idade <= 30) {
//            System.out.println("toizinho");
//        } else {
//            System.out.println("tiozão");
//        }
//
//        Integer dia = 5;
//        switch (dia) {
//            case 0:
//                System.out.println("domingo");
//                break;
//            case 1:
//                System.out.println("segunda");
//                break;
//            case 2:
//                System.out.println("terça");
//                break;
//            case 3:
//                System.out.println("quarta");
//                break;
//            case 4:
//                System.out.println("quinta");
//                break;
//            case 5:
//                System.out.println("sexta");
//                break;
//            case 6:
//                System.out.println("sabado");
//        }
//
//        Scanner scanner = new Scanner (System.in);
//        System.out.println("digita ai:");
//        Integer entrada = scanner.nextInt();
//        System.out.println(jorge(entrada));
//        int i = 0;
//        while (i <= 10){
//
//            System.out.println(jorge(entrada));
//            i ++;
//        }
//
//
//    }
//
//    public static String jorge(Integer numero)
//    {
//
//        switch (numero) {
//            case 1:
//                return "I";
//            case 2:
//                return "II";
//            case 3:
//                return "III";
//            case 4:
//                return "IV";
//            case 5:
//                return "V";
//            case 6:
//                return "VI";
//            case 7:
//                return "VII";
//            case 8:
//                return "VIII";
//            case 9:
//                return "IX";
//            case 10:
//                return "X";
//        }
//        return "digite um numero entre 1 e 10";
//    }