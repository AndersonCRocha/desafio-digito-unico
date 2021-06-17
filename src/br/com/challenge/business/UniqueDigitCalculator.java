package br.com.challenge.business;

public interface UniqueDigitCalculator {

  default int calculateUniqueDigit(long number) {
    return calculateUniqueDigit(number, 1);
  }

  int calculateUniqueDigit(long number, long numberOfRepetitions);

}
