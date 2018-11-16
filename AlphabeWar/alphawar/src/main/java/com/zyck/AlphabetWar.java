package com.zyck;

import java.util.HashMap;

// Solution

public class AlphabetWar {
  public static String alphabetWar(String fight) {
    HashMap<Character, Integer> scores = new HashMap<>();
    scores.put('w', 4);
    scores.put('p', 3);
    scores.put('b', 2);
    scores.put('s', 1);
    scores.put('m', -4);
    scores.put('q', -3);
    scores.put('d', -2);
    scores.put('z', -1);

    int count = 0;

    for (Character letter : fight.toCharArray()) {
      if (scores.containsKey(letter))
        count += scores.get(letter);
    }

    String ret = "Let's fight again!";
    if (count > 0) {
      ret = "Left side wins!";
    } else if (count < 0) {
      ret = "Right side wins!";
    }

    return ret;
  }
}