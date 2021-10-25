package oop.ExceptionExample;

public class PhoneTester {
    public static void main(String[] args) {
        String [] phoneNumber = {"123-456", null, "789-567", "345-908"};

        for (int i = 0; i < phoneNumber.length; i++) {
            try{
                System.out.println(new Phone("iphone 12 pro max",phoneNumber[i]));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }

        }
    }
}
