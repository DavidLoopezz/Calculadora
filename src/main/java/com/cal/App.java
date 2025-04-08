package com.cal;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculadora calc = new Calculadora(5, 3);
            int resultadoSuma = calc.suma();
                System.out.println("Resultado de la suma: " + resultadoSuma);
    }
}
