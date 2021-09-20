public class Wilder {

    Wilder(String firstName, boolean present){
        this.firstName = firstName;
        this.present = present;
    }

    private String firstName;
    private boolean present;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public String whoAmI(){
        return "My name is "+this.firstName+" and I am " + (present ? "present" : "not present");
    }
}
