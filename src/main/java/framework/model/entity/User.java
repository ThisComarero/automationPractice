package framework.model.entity;

import framework.model.entity.enums.ECountry;
import framework.model.entity.enums.EState;
import lombok.*;

@Data
@ToString
@Builder
public class User {
    private boolean male;
    private boolean female;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private String password;
    private String dayOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private boolean isNewsletterSignUp;
    private boolean isSpecialOffersChecked;
    private String firstName;
    private String lastName;
    private String company;
    private String firstAddressPart;
    private String secondAddressPart;
    private String city;
    private String postalCode;
    private EState eState;
    private ECountry eCountry;
    private String additionalInfo;
    private String phoneNumber;
    private String mobileNumber;
    private String alias;

}
