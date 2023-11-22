package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegAuthorizationPage {
    public SelenideElement


    authorization_page = $(".sc-389461ae-0"),
    authorization_page_button = $ (".sc-76160106-3"),
    registration_page = $(".sc-926349e1-0"),
    registration_page_button = $(".sc-76160106-4"),

    registration_authorization_button = $(".sc-f9c7bae0-13",1),

    reg_phone_number_input = $(".sc-af0c516c-2"),
    read_and_agree_text = $(".sc-c27aa0ae-1"),
    registration_button = $(".sc-926349e1-16"),
    confirm_number = $(".sc-926349e1-6 "),
    other_registration = $(".sc-58c671a0-1"),
    google_icon = $("#container"),


    authorization_by_number = $(".sc-389461ae-3",0),
    authorization_by_email = $(".sc-389461ae-3",1),
    authorization_phone_number_input = $(".sc-af0c516c-2"),
    authorization_email_input = $(".sc-af0c516c-2",0),
    send_code = $(".sc-389461ae-8 "),
    mandate = $(".sc-106fa713-3 "),
    enter_code = $(".sc-af0c516c-1"),
    confirm_code = $(".sc-389461ae-8"),
    authorization_password_input = $(".sc-af0c516c-2",1),
    forgot_password =$(".sc-389461ae-7"),
    enter_by_email = $(".sc-389461ae-8"),
    email_mandate = $(".sc-af0c516c-6",0),
    password_mandate = $(".sc-af0c516c-6",1),
    invalid_username_or_password = $(".sc-389461ae-9");
}
