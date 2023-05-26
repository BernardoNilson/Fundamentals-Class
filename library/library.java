package library;

/**
 * Biblioteca com intuito de complementar as atividades avaliativas de Fundamentos de Programação.
 * A mesma possui diversos métodos genéricos.
 * 
 * @author: Bernardo Nilson 
 * @version: 18.04.2023
 */

 public class library{

    //Métodos para cálculo da área.
    public static double areaCirculo(double raioC){
        return Math.PI*Math.pow(raioC, 2);
    }

    public static double areaRetangulo(double baseR, double alturaR){
        return baseR*alturaR;
    }

    public static double areaQuadrado(double ladoQ){
        return Math.pow(ladoQ, 2);
    }

    public static double areaTriangulo(double baseT, double alturaT){
        return (baseT*alturaT)/2;
    }

    //Métodos para cálculo do perímetro.
    public static double perimetroCirculo(double raioC){
        return 2*Math.PI*raioC;
    }

    public static double perimetroRetangulo(double baseR, double alturaR){
        return 2*baseR + 2*alturaR;
    }

    public static double perimetroQuadrado(double ladoQ){
        return 4*ladoQ;
    }

    public static double perimetroTriangulo(double ladoA, double ladoB, double ladoC){
        return ladoA + ladoB + ladoC;
    }

    //Métodos para cálculo da superfície.
    public static double areaEsfera(double raioC){
        return 4*Math.PI*Math.pow(raioC, 2);
    }

    public static double areaParalelepipedo(double larguraP, double alturaP, double comprimentoP){
        return 2*alturaP*comprimentoP + 2*alturaP*larguraP + 2*larguraP*comprimentoP;
    }

    public static double areaCubo(double ladoQ){
        return Math.pow(ladoQ, 3);
    }

    public static double areaPrismaT(double baseT, double alturaT, double alturaPrisma){
        return 3*baseT*alturaPrisma + baseT*alturaT;
    }

    public static double areaCilindro(double raioC, double alturaC){
        return 2*Math.PI*raioC*alturaC + 2*Math.PI*Math.pow(raioC, 2);
    }

    public static double areaPiramideT(double baseP){
         return (Math.sqrt(6)*baseP)/4;
    }

    public static double areaPiramideQ(double baseP, double alturaP){
        //Significa a altura do centro da base até o topo.
        return Math.pow(baseP, 2) + 2*baseP*alturaP; 
    }

   public static double areaPiramideR(double larguraP, double comprimentoP, double alturaP){
        //Significa a altura da lateral, pela superficie, até o topo.
        return larguraP*alturaP + comprimentoP*alturaP + larguraP*comprimentoP;
    }

    //Métodos para cálculo do volume.
    public static double volumeEsfera(double raioC){
        return (4/3)*Math.PI*Math.pow(raioC, 3);
    }

    public static double volumeParalelepipedo(double comprimentoP, double alturaP, double larguraP){
        return comprimentoP*alturaP*larguraP;
    }

    public static double volumeCubo(double ladoQ){
        return Math.pow(ladoQ, 3);
    }

    public static double volumePrismaT(double baseT, double alturaT, double comprimentoT){
        return (1/2)*baseT*alturaT*comprimentoT;
    }

    //Métodos lógicos.
    public static int quantDivisores(int num){
        int quantDivisores = 0;
        int count = 1;
        while (count <= num){
            if (num % count == 0) quantDivisores++;
            count++;
        }
        return quantDivisores;
    }

    public static int quantDivisoresP(int num){
        return quantDivisores(num) - 1;
    }


    public static int somaDivisores(int num){
        int somaDivisores = 0;
        int count = 1;
        while (count <= num){
            if (num % count == 0) somaDivisores += count;
            count++;
        }
        return somaDivisores;
    }

    public static int somaDivisoresP(int num){
        int somaDivisoresP = 0;
        int count = 1;
        while (count < num){
            if (num % count == 0) somaDivisoresP += count;
            count++;
        }
        return somaDivisoresP;
    }

    public static int inverteDigito (int num){
        int numReverso = 0;
        while (num > 0){
            numReverso = numReverso*10 + num % 10;
            num /= 10;
        }
        return numReverso;
    }

    public static int quantidadeDiaAniversario(int mesNascimento, int diaNascimento, int anoHoje){
        int diaAniversario = 0;

        switch (mesNascimento){
            case 1:
                diaAniversario = diaNascimento;
                break;
            case 2:
                diaAniversario = diaNascimento + 31;
                break;
            case 3:
                diaAniversario = diaNascimento + 59;
                break;
            case 4:
                diaAniversario = diaNascimento + 90;
                break;
            case 5:
                diaAniversario = diaNascimento + 120;
                break;
            case 6:
                diaAniversario = diaNascimento + 151;
                break;
            case 7:
                diaAniversario = diaNascimento + 181;
                break;
            case 8:
                diaAniversario = diaNascimento + 212;
                break;
            case 9:
                diaAniversario = diaNascimento + 243;
                break;
            case 10:
                diaAniversario = diaNascimento + 273;
                break;
            case 11:
                diaAniversario = diaNascimento + 304;
                break;
            case 12:
                diaAniversario = diaNascimento + 334;
                break;
            default:
                System.out.println("Opaaa... Data inválida");
        }

        if ((mesNascimento > 2)&&(verificaBissexto(anoHoje))) diaAniversario++;

        return diaAniversario;
    }

    public static int quantidadeDiaHoje(int mesHoje, int diaHoje, int anoHoje){
        int diaAtual = 0;

        switch (mesHoje){
            case 1:
                diaAtual = diaHoje;
                break;
            case 2:
                diaAtual = diaHoje + 31;
                break;
            case 3:
                diaAtual = diaHoje + 59;
                break;
            case 4:
                diaAtual = diaHoje + 90;
                break;
            case 5:
                diaAtual = diaHoje + 120;
                break;
            case 6:
                diaAtual = diaHoje + 151;
                break;
            case 7:
                diaAtual = diaHoje + 181;
                break;
            case 8:
                diaAtual = diaHoje + 212;
                break;
            case 9:
                diaAtual = diaHoje + 243;
                break;
            case 10:
                diaAtual = diaHoje + 273;
                break;
            case 11:
                diaAtual = diaHoje + 304;
                break;
            case 12:
                diaAtual = diaHoje + 334;
                break;
            default:
                System.out.println("Opaaa... Data inválida");
        }
        
        if ((mesHoje > 2)&&(verificaBissexto(anoHoje))) diaAtual++;

        return diaAtual;
    }

    public static String obterSigno(int mesNascimento, int diaNascimento){

        //Definimos signo como um espaço vazio porque o programa não sabe lidar com a variável não declarada.
        String signo = "";

        switch (mesNascimento){
            case 1:
                if(diaNascimento <= 20) signo = "Capricórnio";
                 else signo = "Aquário";
                break;
            case 2:
                if(diaNascimento <= 18) signo = "Aquário";
                 else signo = "Peixes";
                break;
            case 3:
                if(diaNascimento <= 20) signo = "Peixes";
                 else signo = "Áries";
                break;
            case 4:
                if(diaNascimento <= 20) signo = "Áries";
                 else signo = "Touro";
                break;
            case 5:
                if(diaNascimento <= 20) signo = "Touro";
                 else signo = "Gêmeos";
                break;
            case 6:
                if(diaNascimento <= 20) signo = "Gêmeos";
                 else signo = "Câncer";
                break;
            case 7:
                if(diaNascimento <= 22) signo = "Câncer";
                 else signo = "Leão";
                break;
            case 8:
                if(diaNascimento <= 22) signo = "Leão";
                 else signo = "Virgem";
                break;
            case 9:
                if(diaNascimento <= 22) signo = "Virgem";
                 else signo = "Libra";
                break;
            case 10:
                if(diaNascimento <= 22) signo = "Libra";
                 else signo = "Escorpião";
                break;
            case 11:
                if(diaNascimento <= 21) signo = "Escorpião";
                 else signo = "Sagitário";
                break;
            case 12:
                if(diaNascimento <= 21) signo = "Sagitário";
                 else signo = "Capricórnio";
                break;
            default:
                System.out.println("Opaaa... Data inválida");
        }
        
        return signo;
    }

    //Verificão se tal número é verdadeiro.
    public static boolean verificaPrimo(int num){
        return quantDivisores(num)==2;
    }

    public static boolean isEven(double num){
        return num % 2 == 0;
    }

    public static boolean verificaPerfeito(int num){
        return somaDivisoresP(num) == num;
    }

    public static boolean verificaAbundante(int num){
        return somaDivisoresP(num) >= num;
    }

    public static boolean verificaDefectivo(int num){
        return somaDivisoresP(num) <= num;
    }

    public static boolean verificaAmigo(int num, int numDois){
        return (somaDivisoresP(num) == numDois)&&(somaDivisoresP(numDois) == num);
    }

    public static boolean verificaNatural(double num){
        return num >= 0;
    }

    public static boolean verificaPalindromo(int num){
        return num == inverteDigito(num);
    }

    public static boolean verificaBissexto(int anoHoje){
        if (anoHoje % 4 == 0 && (anoHoje % 100 != 0 || (anoHoje % 400 == 0 && anoHoje % 100 == 0))) return true;
        else return false;
    }

    public static void verificaAniversario (int diaAniversario, int mesAniversario, int diaHoje, int mesHoje, int anoHoje){
        //Por meio de um método, calcula a quantidade de dias até o dia do aniversário.
        int quantDiaAniversario = quantidadeDiaAniversario(mesAniversario, diaAniversario, anoHoje);
        
        //Por meio de um método, calcula a quantidade de dias até o dia atual.
        int quantDiaHoje = quantidadeDiaHoje(mesHoje, diaHoje, anoHoje);

        //Parte final, executa os comandos ao usuário e exibe tudo o que foi calculado.
        if (quantDiaAniversario == quantDiaHoje){
            System.out.println("Parabéns! Hoje é o seu aniversário.");
        } else {
            if (quantDiaAniversario > quantDiaHoje){
            System.out.println("Que pena! Ainda faltam " + (quantDiaAniversario-quantDiaHoje) + " dias para o seu aniversário!");
            } else {
            System.out.println("Que pena! Seu aniversário já passou! Por apenas " + (quantDiaHoje-quantDiaAniversario) + " dias!");
            }
        } 
    }

    public static void imprimeDecrescente (double numA, double numB, double numC){
        //Para isso, vamos fazer o uso de uma variável auxiliar.
        //O maior número é calculado primeiro.
        double maior = numA;
        if (numB > maior) maior = numB;
        if (numC > maior) maior = numC;

        //Agora, calculamos o menor número.
        double menor = numA;
        if (numB < menor) menor = numB;
        if (numC < menor) menor = numC;

        //Por fim, o número que está no meio dos dois.
        double meio = numA;
        if ((numB < maior)&&(numB > menor)) meio = numB;
        if ((numC < maior)&&(numC > menor)) meio = numC;

        System.out.println("A ordem decrescente dos números é " + maior + ", " + meio + " e " + menor);
    }
}