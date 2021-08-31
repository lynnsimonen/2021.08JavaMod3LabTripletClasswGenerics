package edu.wctc;

public class Main {

    public static void main(String[] args) {
      
        Triplet<String> snoopy = new Triplet<>();
            snoopy.first("Peanuts");
        
        Triplet<String> santasLittleHelper = new Triplet<>();
            santasLittleHelper.second("The Simpsons");
        
        Triplet<String> clifford = new Triplet<>();
            clifford.third("Clifford, The Big Red Dog");
        
//         Triplet snoopy = new Triplet(peanuts, white, medium);
//         Triplet santasLittleHelper = new Triplet(simpsons, brown, small);
//         Triplet clifford = new Triplet(cliffordTheBigRedDog, red, big);
        
    }
}
