package oop.ExceptionExample;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {
        if(phoneNumber == null || phoneType == null)
            throw new IllegalArgumentException("PhoneType and PhoneNumber cannot be null");
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Your phone type is: " + " " + phoneType + " " +
                "and phone number is:" + " " + phoneNumber;
    }
}
