package model;

import service.PeselValidator;

public class User {
    private String firstName;
    private String lastName;
    private String pesel;
    private boolean valid;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public boolean isValid() {
        return valid;
    }

    public User(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.valid = this.validatePesel();
    }

    private boolean validatePesel() {
        PeselValidator validator = new PeselValidator(this.pesel);
        return validator.isValid();
    }
}
