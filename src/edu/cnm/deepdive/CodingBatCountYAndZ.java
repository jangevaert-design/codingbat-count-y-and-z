package edu.cnm.deepdive;

/*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z'
in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
 */

public class CodingBatCountYAndZ {

  public static void main(String[] args) {
    System.out.printf("Given the String %s, the outcome will be "
    + countYZ("fez day") + ".\n", "fez day");
    System.out.printf("Given the String %s, the outcome will be "
        + countYZ("day fez") + ".\n", "day fez");
    System.out.printf("Given the String %s, the outcome will be "
        + countYZ("day fyyyz") + ".\n", "day fyyyz");
  }

  public static int countYZ(String str) {
    int count = 0;
    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
        if (i < str.length() - 1 && !Character.isLetter(str.charAt(i + 1))) {
          count++;
        }  else if (i == str.length() - 1) {
          count++;
        }
      }
    }
    return count;
  }


}
