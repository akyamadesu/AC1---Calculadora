/**
 * A classe Calculadora contém métodos para realizar operações matemáticas básicas.
 * @version 1.0
 * @author Megumi
 */
public class Calculadora {

    /**
     * método de adição que recebe dois números inteiros, soma e retorna o resultado.
     *
     * @param a - primeiro número.
     * @param b - segundo número.
     * @return - retorna a soma de a e b.
     */
    public int soma(int a, int b){
        return a + b;
    }

    /**
     * método de subtração que recebe dois números inteiros, subtrai e retorna o resultado.
     *
     * @param a - primeiro número.
     * @param b - segundo número.
     * @return retorna a subtração entre a e b.
     */
    public int subtracao(int a, int b){
        return a - b;
    }

    /**
     * método de multiplicação que recebe dois números inteiros, multiplica e retorna o resultado.
     *
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return retorna a multiplicação entre a e b.
     */
    public int multiplicacao(int a, int b){
        return a * b;
    }

    /**
     * método de divisão que recebe dois números inteiros, divide e retorna o resultado.
     *
     * @param a - primeiro número (dividendo).
     * @param b - segundo número (divisor).
     * @return - retorna a divisão de a por b.
     */
    public int divisao(int a, int b){
        return a / b;
    }

}
