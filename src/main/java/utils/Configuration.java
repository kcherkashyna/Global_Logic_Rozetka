package utils;

import static com.codeborne.selenide.Selenide.open;

public class Configuration {

    private final String BASE_URL = "https://rozetka.com.ua/shtorky-dlia-vannoy-i-dusha/c4625865/";

    public void openSite() {
        open(BASE_URL);
    }

}
