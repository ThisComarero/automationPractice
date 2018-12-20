package dataprovider;

import com.github.javafaker.Faker;
import framework.BasePage;
import framework.model.entity.User;
import framework.model.entity.enums.ECountry;
import framework.model.entity.enums.EState;
import org.testng.annotations.DataProvider;

public class UserDataProvider extends BasePage<UserDataProvider> {
    @DataProvider(name = "UserRegistration")
    public static Object[][] appUser() {
        Faker faker = new Faker();
        User appUser = User.builder()
                .male(true)
                .customerFirstName(faker.name().firstName())
                .customerLastName(faker.name().lastName())
                .password(faker.letterify("10"))
                .dayOfBirth("5")
                .monthOfBirth("12")
                .yearOfBirth("1992")
                .isNewsletterSignUp(false)
                .isSpecialOffersChecked(false)
                .company(faker.company().name())
                .firstAddressPart(faker.address().streetAddress())
                .secondAddressPart(faker.address().buildingNumber())
                .city(faker.address().city())
                .eCountry(ECountry.UNITED_STATES)
                .eState(EState.COLORADO)
                .postalCode(faker.address().zipCode())
                .phoneNumber(faker.phoneNumber().phoneNumber())
                .mobileNumber(faker.phoneNumber().cellPhone())
                .build();

        Object[][] objects = new Object[1][1];
        objects[0][0] = appUser;
        return objects;
    }
}
