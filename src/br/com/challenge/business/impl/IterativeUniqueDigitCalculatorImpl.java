package br.com.challenge.business.impl;

import br.com.challenge.business.UniqueDigitCalculator;

import java.math.BigInteger;
import java.util.stream.Stream;

public class IterativeUniqueDigitCalculatorImpl implements UniqueDigitCalculator {

  @Override
  public int calculateUniqueDigit(long number, long numberOfRepetitions) {
    StringBuilder finalNumber = new StringBuilder();
    for (int count = 0; count < numberOfRepetitions; count++) {
      finalNumber.append(number);
    }

    return addIfGreaterThanOneDigit(new BigInteger(finalNumber.toString()));
  }

  private static int addIfGreaterThanOneDigit(BigInteger number) {
    
    while (number.toString().length() != 1) {
      number = Stream.of(number.toString().split(""))
        .map(BigInteger::new)
        .reduce(BigInteger.ZERO, BigInteger::add);
    }

    return number.intValue();
  }

}
