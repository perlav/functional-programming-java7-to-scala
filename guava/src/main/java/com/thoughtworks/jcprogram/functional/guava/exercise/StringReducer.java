package com.thoughtworks.jcprogram.functional.guava.exercise;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static java.util.Arrays.asList;

// Given a list of strings like {"Bill", "Archer", "Lana"}
// Print the first letter of each of the string that have a length of 4.
// For example, "BL"

public class StringReducer {

    public static void main(String[] args) {
        List<String> strings = newArrayList("Bill", "Archer", "Lana");
        System.out.println(new StringReducer().reduceToFirstLetterOfLengthFourStrings(strings));
    }

    public String reduceToFirstLetterOfLengthFourStrings(List<String> strings) {
        return "";
    }
}