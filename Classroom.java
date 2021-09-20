public class Classroom {

    public static void main(String[] args) {

        Wilder personA = new Wilder("Susanne", false);
        Wilder personB = new Wilder("Frank", true);
        Wilder personC = new Wilder("Anna", true);
        Wilder personD = new Wilder("Bernd", false);

        System.out.println(personA.whoAmI());
        System.out.println(personB.whoAmI());
        System.out.println(personC.whoAmI());
        System.out.println(personD.whoAmI());
    }
}
