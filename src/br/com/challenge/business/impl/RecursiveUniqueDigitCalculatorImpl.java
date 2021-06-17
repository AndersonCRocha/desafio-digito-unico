package br.com.challenge.business.impl;

import br.com.challenge.business.UniqueDigitCalculator;

import java.math.BigInteger;
import java.util.stream.Stream;

public class RecursiveUniqueDigitCalculatorImpl implements UniqueDigitCalculator {

  /**
   * Se os números forem muito grandes irá estourar erro de memória no StringBuilder
   */
  @Override
  public int calculateUniqueDigit(long number, long numberOfRepetitions) {
    StringBuilder finalNumber = new StringBuilder();
    for (int count = 0; count < numberOfRepetitions; count++) {
      finalNumber.append(number);
    }

    return addIfGreaterThanOneDigit(new BigInteger(finalNumber.toString()));
  }

  /**
   * Pode causar estouro de pilha para valores muito grandes
   */
  private static int addIfGreaterThanOneDigit(BigInteger number) {
    if (number.toString().length() == 1) {
      return number.intValue();
    }

    return addIfGreaterThanOneDigit(
      Stream.of(number.toString().split(""))
        .map(BigInteger::new)
        .reduce(BigInteger.ZERO, BigInteger::add)
    );
  }

}
