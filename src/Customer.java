public class Customer {

    // customer properties
    private String name;
    private int yearOfBirth;
    private float balance;
    private boolean isNew;
    private final String code = ("12345");

    //getters
    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getCode() {
        return code;
    }

    public boolean getIsNew(){
        return isNew;
    }

    // setters

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
}
