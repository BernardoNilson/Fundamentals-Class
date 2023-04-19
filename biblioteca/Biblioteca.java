package biblioteca;

/**
 * Biblioteca com intuito de complementar as atividades avaliativas de Fundamentos de Programação.
 * A mesma possui diversos métodos genéricos.
 * 
 * @author: Bernardo Nilson 
 * @version: 18.04.2023
 */

 public class Biblioteca{

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


    public static int somaDivisores(int quantDivisores){
        int somaDivisores = 0;
        while (quantDivisores >= 0){
            somaDivisores += quantDivisores;
            quantDivisores--;
        }
        return somaDivisores;
    }

    public static int somaDivisoresP(int quantDivisoresP){
        int somaDivisoresP = 0;
        while (quantDivisoresP >= 0){
            somaDivisoresP += quantDivisoresP;
            quantDivisoresP--;
        }
        return somaDivisoresP;
    }

    //Verificão se tal número é verdadeiro.
    public static boolean verificaPrimo(int num){
        if (quantDivisores(num)==2) return true;
        else return false;
    }

    public static boolean verificaPar(int num){
        if (num % 2 == 0) return true;
        else return false;
    }

    public static boolean verificaPerfeito(int num){
        if (somaDivisoresP(quantDivisoresP(num)) == num) return true;
        else return false;
    }

    public static boolean verificaAbundante(int num){
        if (somaDivisoresP(quantDivisoresP(num)) >= num) return true;
        else return false;
    }

    public static boolean verificaDefectivo(int num){
        if (somaDivisoresP(quantDivisoresP(num)) <= num) return true;
        else return false;
    }

    public static boolean verificaAmigo(int num, int numDois){
        if ((somaDivisoresP(quantDivisoresP(num)) == numDois)&&(somaDivisoresP(quantDivisoresP(numDois)) == num)) return true;
        else return false;
    }
}