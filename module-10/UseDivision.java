public class UseDivision {
    public static void main(String[] args) {
        // Creating instances of InternationalDivision
        InternationalDivision intDiv1 = new InternationalDivision("Global Tech", 101, "Germany", "German");
        InternationalDivision intDiv2 = new InternationalDivision("Oceanic Solutions", 102, "Japan", "Japanese");

        // Creating instances of DomesticDivision
        DomesticDivision domDiv1 = new DomesticDivision("Home Services", 201, "California");
        DomesticDivision domDiv2 = new DomesticDivision("Retail Express", 202, "Texas");

        // Displaying the details of each division
        intDiv1.display();
        System.out.println();
        intDiv2.display();
        System.out.println();
        domDiv1.display();
        System.out.println();
        domDiv2.display();
    }
}