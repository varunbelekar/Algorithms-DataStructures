package com.varun.Algos;

public class Subsets {
    public static void main(String[] args) {
        char[] set = {'a', 'b', 'c', 'd'};
        printAllSubsets(set);
    }

    public static void printAllSubsets(char[] set){
        printAllSubsets(set, 0, "");
    }

    public static void printAllSubsets(char[] set, int i, String s){
        if (i == set.length){
            if (s.length() == 0) {
                System.out.println("{}");
            }else {
                System.out.println("{" + s.substring(0, s.length() - 1) + "}");
            }
            return;
        }
        printAllSubsets(set, i + 1, s);
        printAllSubsets(set, i + 1, s + set[i] + ",");
    }
}
