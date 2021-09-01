package edu.wctc;

public class Main {

    public static void main(String[] args) {

        Triplet<String> siblings = new Triplet<>("Ethan", "Lucas", "Wylie");
        Triplet<Integer> favNumbers = new Triplet<>(3, 24, 68);
        Triplet<Character> favLetters = new Triplet<>('a', 'b', 'c');


        System.out.println(siblings);
        System.out.println(favLetters);
        System.out.println(favNumbers);


        //    Triplet<String> siblings = new Triplet<>();
    //        siblings.add(new Triplet("Ethan", "Lucas", "Wylie"));
    //        siblings.add(new Triplet("Ethan", "Lucas", "Wylie"));
    //                Triplet<int> favNumbers = new Triplet<>();
    //                favNumbers.setSecond(3, 24, 68);

        //for (Triplet triplet : .values()) {   <--This is for loops
        //   System.out.println(triplet);        }

    }
}
