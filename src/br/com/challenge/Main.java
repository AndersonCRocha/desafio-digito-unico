package br.com.challenge;

import br.com.challenge.business.UniqueDigitCalculator;
import br.com.challenge.business.impl.RecursiveUniqueDigitCalculatorImpl;

import java.util.Scanner;

/**
 * Made by Anderson Rocha: https://github.com/andersoncrocha
 */
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    UniqueDigitCalculator uniqueDigitCalculator = new RecursiveUniqueDigitCalculatorImpl();
//    UniqueDigitCalculator uniqueDigitCalculator = new IterativeUniqueDigitCalculatorImpl();

    System.out.println("------------------ DESAFIO ------------------");
    System.out.println("----------- Entrada de dois números ---------");
    System.out.println("---------------------------------------------");
    System.out.print("Digite o primeiro número: ");
    long numberOne = scanner.nextLong();
    System.out.print("Digite o segundo número: ");
    long numberTwo = scanner.nextLong();

    int uniqueDigit = uniqueDigitCalculator.calculateUniqueDigit(numberOne, numberTwo);
    System.out.printf("Resultado: %d\n", uniqueDigit);

    System.out.println("---------------------------------------------");
    System.out.println("------------- Entrada de um número ----------");
    System.out.println("---------------------------------------------");
    System.out.print("Digite o número: ");
    numberOne = scanner.nextLong();

    uniqueDigit = uniqueDigitCalculator.calculateUniqueDigit(numberOne);
    System.out.printf("Resultado: %d", uniqueDigit);

    scanner.close();
  }

}
