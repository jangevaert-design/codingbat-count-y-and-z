package edu.cnm.deepdive;

import static edu.cnm.deepdive.CodingBatCountYAndZ.countYZ;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatCountYAndZTest {

  private String[] countParams = {
      "fez day",
      "day fez",
      "day fyyyz",
      "day yak",
      "day:yak",
      "!!day--yaz!!",
      "yak zak",
      "DAY abc XYZ",
      "aaz yyz my",
      "y2bz",
      "zxyx"
  };

  private int[] countExpected = {2, 2, 2, 1, 1, 2, 0, 2, 3, 2, 0};


  @Test
  void countTest() {
    for (int i = 0; i < countParams.length; i++) {
      int actual = countYZ(countParams[i]);
      Assertions.assertEquals(actual, countExpected[i]);
    }
  }

}