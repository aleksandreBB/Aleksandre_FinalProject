package DataObject;

import com.github.javafaker.Faker;

public interface MobilePhonePageData {
    Faker faker = new Faker();
    int left_random_price = faker.number().numberBetween(0,5999);
    int right_random_price = faker.number().numberBetween(0,5999);
    int left_half_random_price = faker.number().numberBetween(0,2999);
    int right_half_random_price = faker.number().numberBetween(3000,5999);
}
