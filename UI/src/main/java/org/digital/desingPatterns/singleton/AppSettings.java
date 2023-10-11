package org.digital.desingPatterns.singleton;
public class AppSettings {
    private static AppSettings instance;
    private String username;
    private String apiKey;


    // приватный конструктор, чтобы извне не могли создать
    private AppSettings() {

    }


    // получение единственного экземпляра
    public static synchronized AppSettings getInstance() {
        if (instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }






















//    AppSettings settings = AppSettings.getInstance();   --->   получение эземпляра класса



//    settings.setUsername("user123");
//                                             задаем настройки
//    settings.setApiKey("secretApiKey");



//    String username = settings.getUsername();
//                                                получаем настройки
//    String apiKey = settings.getApiKey();







}