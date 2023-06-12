import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Undertanding the problem: Trata-se de um programa para orçamento de colares:
 * - Dois tipos tamanho: 50 cm (300 reais) e 70 cm (400 reais)
 * - Cada pingente de prata é R$70 e cada pingente de prata incrustada é R$100
 * - Duas opções de suporte para os colares: gancho de RS200 e caixa de R$350
 * Sobre as opçõesde pagamento:
 * - 5% de desconto caso pagamento à vista;
 * - Valor orçado para pagamentos em até 3x;
 * - 10% de juros em até 5x;
 * Deve ser exibido o tipo e quantidade de objetos comprados, assim como o valor
 * final e a forma de pagamento.
 * 
 * @author: Bernardo Nilson - 23111469
 * @version: 12.06.2023
 */

public class BicharaSystem {

    public static void main(String[] args) {

        // To create the user entrance
        Scanner scan = new Scanner(System.in);
        // To create the decimal formatter
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        // Inicialize the final value
        double valorColar = 0;

        // Clean the terminal and show the welcome message
        System.out.print("\033\143");
        System.out.println("Hey, este programa ajuda você a orçar um colar com pingentes! Siga os passos descritos!\n");

        // Explain how the program will work
        System.out.println("Vou apresentar as suas opções por categoria/tipo, por favor, selecione o número da sua escolha (ex. 7)!\n");

        // Necklace length selection
        System.out.println("Escolha o tamanho do seu colar:\n- 1 - 50 cm por R$300\n- 2 - 70 cm por R$400");
        int tamanhoColar = scan.nextInt();
        String colarSelecionado = "";

        // Create a String variable to use it later in the summary and start calculating the necklace value
        switch (tamanhoColar) {
            case 1:
                colarSelecionado = "Você selecionou 50 cm por R$300!";
                valorColar = 300;
                break;
            case 2:
                colarSelecionado = "Você selecionou 70 cm por R$400!";
                valorColar = 400;
                break;
            // If something diffent happens, the program will stop and exit
            default:
                System.out.println("Algum erro aconteceu! Por favor, reinicie o programa");
                System.exit(0);
        }

        // Necklace pendant selection
        System.out.println("\nAgora, selecione a quantidade de cada tipo de colar que você deseja:     (Pode selecionar '0', se quiser)");
        System.out.println("- Pingente de prata por R$70 cada. Quantos?");
        int pingentePrata = scan.nextInt();
        System.out.println("- Pingente de prata com pedras incrustadas por R$100 cada. Quantos?");
        int pingentePrataComPedra = scan.nextInt();

        // Necklace special acessories selection
        System.out.println("\nCaso queira adicionar um acessório especial:");
        System.out.println("- Gancho para pingentes por R$200 cada. Quantos?");
        int ganchoPingente = scan.nextInt();
        System.out.println("- Caixa para pingentes por R$350 cada. Quantos?");
        int caixaPingente = scan.nextInt();

        // Payment type selection
        System.out.println("\nPor fim, selecione a opção de pagamento, considerando descontos e acréscimos!\n- 1 - Pagamento à vista: 5% de desconto!\n- 2 - Pagamento em até 3x: Orçamento calculado\n- 3 - Pagamento em até 5x: 10% de acréscimo!");
        int tipoPagamento = scan.nextInt();

        // Closes the Scanner object
        scan.close();

        // Calculate the inicial necklace value
        valorColar = calcularOrcamento(valorColar, pingentePrata, pingentePrataComPedra, ganchoPingente, caixaPingente);
        // Change value acording to payment type
        valorColar = calcularValorFinal(valorColar, tipoPagamento);
        // Format the double value, to fix the monetary format
        decimalFormat.format(valorColar);

        // Shop summary
        exibirResumoCompra(colarSelecionado, pingentePrata, pingentePrataComPedra, ganchoPingente, caixaPingente,
                valorColar);

        // END
    }

    public static double calcularOrcamento(double valorColar, int pingentePrata, int pingentePrataComPedra,
            int ganchoPingente, int caixaPingente) {
        // Here, we calculate using the enunciate values
        return valorColar + pingentePrata * 70 + pingentePrataComPedra * 100 + ganchoPingente * 200
                + caixaPingente * 350;
    }

    public static double calcularValorFinal(double valorColar, int tipoPagamento) {
        
        switch (tipoPagamento) {
            case 1:
            // 5% discount
                return valorColar * 0.95;
            case 2:
            // Do not change
                return valorColar;
            case 3:
            // 10% increase
                return valorColar * 1.1;
            default:
                System.out.println("Algum erro aconteceu! Por favor, reinicie o programa");
                System.exit(0);
                return 0;
        }
    }

    public static void exibirResumoCompra(String colarSelecionado, int pingentePrata, int pingentePrataComPedra,
            int ganchoPingente, int caixaPingente, double valorColar) {
        System.out.println("\n  - RESUMO DAS COMPRAS\n" + colarSelecionado);
        System.out.println("Você selecionou " + pingentePrata + " pingente (s) de prata e " + pingentePrataComPedra
                + " pingente (s) de prata com pedras incrustadas!");
        System.out.println("Você selecionou " + ganchoPingente + " gancho (s) de pingentes e " + caixaPingente
                + " caixa (s) de pingente!");
        System.out.println("Valor calculado, considerando o tipo de pagamento: R$" + valorColar);
    }
}
