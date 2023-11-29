package DataObject;

import com.github.javafaker.Faker;

public interface RegAuthorizationPageData {
    Faker faker = new Faker();
    int fake_random_number = faker.number().numberBetween(0,999);
    int full_random_number = faker.number().numberBetween(100000000,400000000);
    String authorization_last_name =  faker.name().lastName();
    String authorization_email = authorization_last_name.toLowerCase() + "@gmail.com";
    String authorization_password = authorization_last_name + 2023;
}
