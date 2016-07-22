package com.thoughtworks.tdd;

import java.util.Arrays;
import java.util.List;

/**
 * compare number
 * Created by dev on 7/22/16.
 */
class CompareNumber {
    String compare(String systemInput, String customerInput) {
        List<String> systemInputList = Arrays.asList(systemInput.split(""));
        List<String> customerInputList = Arrays.asList(customerInput.split(""));

        int sameCharSameLocationCount = 0;
        int sameCharCount = 0;

        for (int i = 0; i < systemInputList.size(); i++) {
            if (systemInputList.get(i).equals(customerInputList.get(i))) {
                sameCharSameLocationCount++;
            } else {
                if (customerInputList.contains(systemInputList.get(i))) {
                    sameCharCount++;
                }
            }
        }
        return sameCharSameLocationCount + "A" + sameCharCount + "B";
    }
}
