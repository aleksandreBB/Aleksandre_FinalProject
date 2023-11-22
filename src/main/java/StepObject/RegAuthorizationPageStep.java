package StepObject;

import PageObject.CommonPage;
import com.codeborne.selenide.Condition;
import org.checkerframework.checker.units.qual.C;

import java.time.Duration;

import static DataObject.CommonPageData.*;
import static DataObject.MobilePhonePageData.random_price;
import static DataObject.RegAuthorizationPageData.*;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


import PageObject.RegAuthorizationPage;
import com.codeborne.selenide.Condition;

import java.time.Duration;

public class RegAuthorizationPageStep extends RegAuthorizationPage {

    public RegAuthorizationPageStep log_in_reg_authorization_page(){
        registration_authorization_button.click();
        return this;
    }
    public RegAuthorizationPageStep registration_page_click(){
        registration_page_button.click();
        return this;
    }
    public int put_incomplete_random_number(){
        reg_phone_number_input.setValue(String.valueOf(fake_random_number));
        return fake_random_number;
    }
    public int put_random_number(){
        reg_phone_number_input.setValue(String.valueOf(full_random_number));
        return full_random_number;
    }
    public RegAuthorizationPageStep agree_terms_and_conditions() {
        read_and_agree_text.click();
        return this;
    }
    public RegAuthorizationPageStep waiting_confirm_number() {
        confirm_number.shouldBe(Condition.visible, Duration.ofMillis(8000));
        return this;
    }
    public RegAuthorizationPageStep registration_button_click() {
        registration_button.click();
        return this;
    }

    public RegAuthorizationPageStep authorization_page_click(){
        authorization_page_button.click();
        return this;
    }
    public RegAuthorizationPageStep send_code_click(){
        send_code.click();
        return this;
    }

    public RegAuthorizationPageStep waiting_confirm_code() {
        confirm_code.shouldBe(Condition.visible, Duration.ofMillis(8000));
        return this;
    }

    public RegAuthorizationPageStep enter_authorization_by_number(){
        authorization_by_number.click();
        return this;
    }
    public RegAuthorizationPageStep enter_authorization_by_email(){
        authorization_by_email.click();
        return this;
    }
    public String put_random_email(){
        authorization_email_input.setValue(String.valueOf(authorization_email));
        return authorization_email;
    }
    public String put_wrong_random_email(){
        authorization_email_input.setValue(String.valueOf(authorization_last_name));
        return authorization_last_name;
    }
    public String put_random_password(){
        authorization_password_input.setValue(String.valueOf(authorization_password));
        return authorization_password;
    }

    public RegAuthorizationPageStep enter_by_email_click(){
        enter_by_email.click();
        return this;
    }

    public RegAuthorizationPageStep waiting_invalid_username_or_password() {
        invalid_username_or_password.shouldBe(Condition.visible, Duration.ofMillis(8000));
        return this;
    }






}
