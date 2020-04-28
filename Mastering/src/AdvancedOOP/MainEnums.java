package AdvancedOOP;

public class MainEnums {
    // Enums = Enumerations - a better way of static final vars.
    public enum Members {JER, BOB, LAR};
    public static Members selectedPerson;

    public static void main(String[] args) {
        selectedPerson = Members.BOB;

        if(selectedPerson.equals(Members.BOB)) {
            System.out.println("Bob!");
        }
        if(selectedPerson.equals(Members.JER)) {
            System.out.println("Jer!");
        }
    }

}
