import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//      Cotações utilizadas do dia 29/09/2023

        int start;
        int cont = 1;
        int prin_cont = 1;
        int moeda;
        int end;
        double real;
        double dollar;
        double euro;
        double libra;
        double rublo;
        double yuan;

        for (int j = 0;j < prin_cont;j++) {
            System.out.println("Escolha a moeda base : ");
            System.out.println("1 --------------------------- R$ Real ");
            System.out.println("2 --------------------------- $ Dollar ");
            System.out.println("3 --------------------------- € Euro ");
            System.out.println("4 --------------------------- £ Libra ");
            System.out.println("5 --------------------------- ₽ Rublo ");
            System.out.println("6 --------------------------- ¥ Yuan ");
            start = in.nextInt();

            switch (start) {
                case 1:
//                  Converção Real.
                    for (int i = 0; i < cont; i++) {
                        dollar = 0.20;
                        euro = 0.19;
                        libra = 0.16;
                        rublo = 19.53;
                        yuan = 1.45;

                        System.out.println(" ");
                        System.out.println("Escolher moeda para converção ");
                        System.out.println("1 --------------------------- $ Dollar ");
                        System.out.println("2 --------------------------- € Euro ");
                        System.out.println("3 --------------------------- £ Libra ");
                        System.out.println("4 --------------------------- ₽ Rublo ");
                        System.out.println("5 --------------------------- ¥ Yuan ");
                        moeda = in.nextInt();

                        switch (moeda) {
                            case 1:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Reais deseja converter: R$ ");
                                real = in.nextFloat();
                                dollar = real * dollar;
                                System.out.println("R$" + real + " Reais é equivalente a $ " + dollar + " Dolares");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Reais deseja converter: R$ ");
                                real = in.nextFloat();
                                euro = real * euro;
                                System.out.println("R$" + real + " Reais é equivalente a € " + euro + " Euros");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Reais deseja converter: R$ ");
                                real = in.nextFloat();
                                libra = real * libra;
                                System.out.println("R$" + real + " Reais é equivalente a £ " + libra + " Libras");
                                break;
                            case 4:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Reais deseja converter: R$ ");
                                real = in.nextFloat();
                                rublo = real * rublo;
                                System.out.println("R$" + real + " Reais é equivalente a ₽ " + rublo + " Rublos");
                                break;
                            case 5:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Reais deseja converter: R$ ");
                                real = in.nextFloat();
                                yuan = real * yuan;
                                System.out.println("R$" + real + " Reais é equivalente a ¥ " + yuan + " Yuans");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Valor invalino");
                                break;
                        }
                        System.out.println(" ");
                        System.out.println("Deseja fazer outra converção ?");
                        System.out.println("1 --------------------------- Sim");
                        System.out.println("2 --------------------------- Não");
                        end = in.nextInt();
                        if (end == 1) {
                            cont++;
                        } else if (end == 2) {
                            System.out.println(" ");
                            System.out.println("Converções Finalizadas!");
                        } else {
                            System.out.println(" ");
                            System.out.println("Valor Invalido");
                        }
                    }
                    break;
                case 2:
//                  Converção Dollar.
                    for (int i = 0; i < cont; i++) {
                        real = 4.92;
                        euro = 0.95;
                        libra = 0.82;
                        rublo = 96.60;
                        yuan = 7.31;

                        System.out.println(" ");
                        System.out.println("Escolher moeda para converção ");
                        System.out.println("1 --------------------------- R$ Real ");
                        System.out.println("2 --------------------------- € Euro ");
                        System.out.println("3 --------------------------- £ Libra ");
                        System.out.println("4 --------------------------- ₽ Rublo ");
                        System.out.println("5 --------------------------- ¥ Yuan ");
                        moeda = in.nextInt();

                        switch (moeda) {
                            case 1:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Dolares deseja converter: $ ");
                                dollar = in.nextFloat();
                                real = dollar * real;
                                System.out.println("$" + dollar + " Dolares é equivalente a R$ " + real + " Reais");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Dolares deseja converter: $ ");
                                dollar = in.nextFloat();
                                euro = dollar * euro;
                                System.out.println("$" + dollar + " Dolares é equivalente a € " + euro + " Euros");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Dolares deseja converter: $ ");
                                dollar = in.nextFloat();
                                libra = dollar * libra;
                                System.out.println("$" + dollar + " Dolares é equivalente a £ " + libra + " Libras");
                                break;
                            case 4:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Dolares deseja converter: $ ");
                                dollar = in.nextFloat();
                                rublo = dollar * rublo;
                                System.out.println("$" + dollar + " Dolares é equivalente a ₽ " + rublo + " Rublos");
                                break;
                            case 5:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Dolares deseja converter: $ ");
                                dollar = in.nextFloat();
                                yuan = dollar * yuan;
                                System.out.println("$" + dollar + " Dolares é equivalente a ¥ " + yuan + " Yuans");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Valor invalino");
                                break;
                        }
                        System.out.println(" ");
                        System.out.println("Deseja fazer outra converção ?");
                        System.out.println("1 --------------------------- Sim");
                        System.out.println("2 --------------------------- Não");
                        end = in.nextInt();
                        if (end == 1) {
                            cont++;
                        } else if (end == 2) {
                            System.out.println(" ");
                            System.out.println("Converções Finalizadas!");
                        } else {
                            System.out.println(" ");
                            System.out.println("Valor Invalido");
                        }
                    }
                    break;
                case 3:
//                  Converção Euro.
                    for (int i = 0; i < cont; i++) {
                        dollar = 1.06;
                        real = 5.27;
                        libra = 0.87;
                        rublo = 100.61;
                        yuan = 7.73;

                        System.out.println(" ");
                        System.out.println("Escolher moeda para converção ");
                        System.out.println("1 --------------------------- $ Dollar ");
                        System.out.println("2 --------------------------- R$ Real ");
                        System.out.println("3 --------------------------- £ Libra ");
                        System.out.println("4 --------------------------- ₽ Rublo ");
                        System.out.println("5 --------------------------- ¥ Yuan ");
                        moeda = in.nextInt();

                        switch (moeda) {
                            case 1:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Euros deseja converter: € ");
                                euro = in.nextFloat();
                                dollar = euro * dollar;
                                System.out.println("€" + euro + " Euros é equivalente a $ " + dollar + " Dolares");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Euros deseja converter: € ");
                                euro = in.nextFloat();
                                real = real * euro;
                                System.out.println("€" + euro + " Euros é equivalente a R$ " + real + " Reais");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Euros deseja converter: € ");
                                euro = in.nextFloat();
                                libra = euro * libra;
                                System.out.println("€" + euro + " Euros é equivalente a £ " + libra + " Libras");
                                break;
                            case 4:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Euros deseja converter: € ");
                                euro = in.nextFloat();
                                rublo = euro * rublo;
                                System.out.println("€" + euro + " Euros é equivalente a ₽ " + rublo + " Rublos");
                                break;
                            case 5:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Euros deseja converter: € ");
                                euro = in.nextFloat();
                                yuan = euro * yuan;
                                System.out.println("€" + euro + " Euros é equivalente a ¥ " + yuan + " Yuans");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Valor invalino");
                                break;
                        }
                        System.out.println(" ");
                        System.out.println("Deseja fazer outra converção ?");
                        System.out.println("1 --------------------------- Sim");
                        System.out.println("2 --------------------------- Não");
                        end = in.nextInt();
                        if (end == 1) {
                            cont++;
                        } else if (end == 2) {
                            System.out.println(" ");
                            System.out.println("Converções Finalizadas!");
                        } else {
                            System.out.println(" ");
                            System.out.println("Valor Invalido");
                        }
                    }
                    break;
                case 4:
//                  Converção Libra.
                    for (int i = 0; i < cont; i++) {
                        dollar = 1.21;
                        euro = 1.15;
                        real = 6.06;
                        rublo = 115.63;
                        yuan = 8.73;

                        System.out.println(" ");
                        System.out.println("Escolher moeda para converção ");
                        System.out.println("1 --------------------------- $ Dollar ");
                        System.out.println("2 --------------------------- € Euro ");
                        System.out.println("3 --------------------------- R$ Real ");
                        System.out.println("4 --------------------------- ₽ Rublo ");
                        System.out.println("5 --------------------------- ¥ Yuan ");
                        moeda = in.nextInt();

                        switch (moeda) {
                            case 1:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Libras deseja converter: £ ");
                                libra = in.nextFloat();
                                dollar = libra * dollar;
                                System.out.println("£" + libra + " Libras é equivalente a $ " + dollar + " Dolares");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Libras deseja converter: £ ");
                                libra = in.nextFloat();
                                euro = libra * euro;
                                System.out.println("£" + libra + " Libras é equivalente a € " + euro + " Euros");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Libras deseja converter: £ ");
                                libra = in.nextFloat();
                                real = libra * real;
                                System.out.println("£" + libra + " Libras é equivalente a R$ " + real + " Reais");
                                break;
                            case 4:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Libras deseja converter: £ ");
                                libra = in.nextFloat();
                                rublo = libra * rublo;
                                System.out.println("£" + libra + " Libras é equivalente a ₽ " + rublo + " Rublos");
                                break;
                            case 5:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Libras deseja converter: £ ");
                                libra = in.nextFloat();
                                yuan = libra * yuan;
                                System.out.println("£" + libra + " Libras é equivalente a ¥ " + yuan + " Yuans");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Valor invalino");
                                break;
                        }
                        System.out.println(" ");
                        System.out.println("Deseja fazer outra converção ?");
                        System.out.println("1 --------------------------- Sim");
                        System.out.println("2 --------------------------- Não");
                        end = in.nextInt();
                        if (end == 1) {
                            cont++;
                        } else if (end == 2) {
                            System.out.println(" ");
                            System.out.println("Converções Finalizadas!");
                        } else {
                            System.out.println(" ");
                            System.out.println("Valor Invalido");
                        }
                    }
                    break;
                case 5:
//                  Converção Rublo.
                    for (int i = 0; i < cont; i++) {
                        dollar = 0.011;
                        euro = 0.0099;
                        libra = 0.0086;
                        real = 0.052;
                        yuan = 0.77;

                        System.out.println(" ");
                        System.out.println("Escolher moeda para converção ");
                        System.out.println("1 --------------------------- $ Dollar ");
                        System.out.println("2 --------------------------- € Euro ");
                        System.out.println("3 --------------------------- £ Libra ");
                        System.out.println("4 --------------------------- R$ Real ");
                        System.out.println("5 --------------------------- ¥ Yuan ");
                        moeda = in.nextInt();

                        switch (moeda) {
                            case 1:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Rublos deseja converter: R$ ");
                                rublo = in.nextFloat();
                                dollar = rublo * dollar;
                                System.out.println("₽" + rublo + " Rublos é equivalente a $ " + dollar + " Dolares");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Rublos deseja converter: ₽ ");
                                rublo = in.nextFloat();
                                euro = rublo * euro;
                                System.out.println("₽" + rublo + " Rublos é equivalente a € " + euro + " Euros");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Rublos deseja converter: ₽ ");
                                rublo = in.nextFloat();
                                libra = rublo * libra;
                                System.out.println("₽" + rublo + " Rublos é equivalente a £ " + libra + " Libras");
                                break;
                            case 4:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Rublos deseja converter: ₽ ");
                                rublo = in.nextFloat();
                                real = rublo * real;
                                System.out.println("₽" + rublo + " Rublos é equivalente a R$ " + real + " Reais");
                                break;
                            case 5:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Rublos deseja converter: ₽ ");
                                rublo = in.nextFloat();
                                yuan = rublo * yuan;
                                System.out.println("₽" + rublo + " Rublos é equivalente a ¥ " + yuan + " Yuans");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Valor invalino");
                                break;
                        }
                        System.out.println(" ");
                        System.out.println("Deseja fazer outra converção ?");
                        System.out.println("1 --------------------------- Sim");
                        System.out.println("2 --------------------------- Não");
                        end = in.nextInt();
                        if (end == 1) {
                            cont++;
                        } else if (end == 2) {
                            System.out.println(" ");
                            System.out.println("Converções Finalizadas!");
                        } else {
                            System.out.println(" ");
                            System.out.println("Valor Invalido");
                        }
                    }
                    break;
                case 6:
//                  Converção Yuan.
                    for (int i = 0; i < cont; i++) {
                        dollar = 0.14;
                        euro = 0.13;
                        libra = 0.11;
                        rublo = 13.45;
                        real = 0.68;

                        System.out.println(" ");
                        System.out.println("Escolher moeda para converção ");
                        System.out.println("1 --------------------------- $ Dollar ");
                        System.out.println("2 --------------------------- € Euro ");
                        System.out.println("3 --------------------------- £ Libra ");
                        System.out.println("4 --------------------------- ₽ Rublo ");
                        System.out.println("5 --------------------------- R$ Real ");
                        moeda = in.nextInt();

                        switch (moeda) {
                            case 1:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Yuans deseja converter: ¥ ");
                                real = in.nextFloat();
                                dollar = real * dollar;
                                System.out.println("¥" + real + " Yuans é equivalente a $ " + dollar + " Dolares");
                                break;
                            case 2:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Yuans deseja converter: ¥ ");
                                yuan = in.nextFloat();
                                euro = yuan * euro;
                                System.out.println("¥" + yuan + " Yuans é equivalente a € " + euro + " Euros");
                                break;
                            case 3:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Yuans deseja converter: ¥ ");
                                yuan = in.nextFloat();
                                libra = yuan * libra;
                                System.out.println("¥" + yuan + " Yuans é equivalente a £ " + libra + " Libras");
                                break;
                            case 4:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Yuans deseja converter: ¥ ");
                                yuan = in.nextFloat();
                                rublo = yuan * rublo;
                                System.out.println("¥" + yuan + " Yuans é equivalente a ₽ " + rublo + " Rublos");
                                break;
                            case 5:
                                System.out.println(" ");
                                System.out.print("Digite a quantidade de Yuans deseja converter: ¥ ");
                                yuan = in.nextFloat();
                                real = yuan * real;
                                System.out.println("¥" + yuan + " Yuans é equivalente a R$ " + real + " Reais");
                                break;
                            default:
                                System.out.println(" ");
                                System.out.println("Valor invalino");
                                break;
                        }
                        System.out.println(" ");
                        System.out.println("Deseja fazer outra converção ?");
                        System.out.println("1 --------------------------- Sim");
                        System.out.println("2 --------------------------- Não");
                        end = in.nextInt();
                        if (end == 1) {
                            cont++;
                        } else if (end == 2) {
                            System.out.println(" ");
                            System.out.println("Converções Finalizadas!");
                        } else {
                            System.out.println(" ");
                            System.out.println("Valor Invalido");
                        }
                    }
                    break;
                default:
                    System.out.println(" ");
                    System.out.println("Valor invalino");
                    break;
            }

            System.out.println(" ");
            System.out.println("Deseja fazer converção com outra moeda ?");
            System.out.println("1 --------------------------- Sim");
            System.out.println("2 --------------------------- Não");
            end = in.nextInt();
            if (end == 1) {
                prin_cont++;
            } else if (end == 2) {
                System.out.println(" ");
                System.out.println("Converções Finalizadas!");
            } else {
                System.out.println(" ");
                System.out.println("Valor Invalido");
            }
        }
    }
}