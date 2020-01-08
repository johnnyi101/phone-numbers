package phone;

public class numberChecker {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public numberChecker(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        String [] splitNumb = phoneNumber.split("");
        String errorMessage = "Invalid Number";
        if (splitNumb[0] == "+")
            setPhoneNumber(phoneNumber);
        else
            setPhoneNumber(errorMessage);
    }
}
