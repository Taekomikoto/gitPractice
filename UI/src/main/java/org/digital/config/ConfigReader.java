package org.digital.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    /**
     * Загружает конфигурационные данные из файла config.properties.
     */
    private static Properties properties;

    static {
        try {
            String path = "C:\\Users\\taeko\\Desktop\\projectHTML\\SummerSDET2023\\UI\\src\\main\\resources\\drivers\\chromedriver-win64\\chromedriver.exe";
            FileInputStream inputStream = new FileInputStream(path);
            // для чтения содержимого файла по указанному пути
            properties = new Properties();
            // объект этого класса
            properties.load(inputStream);
            // загружает в этот класс все данные
            inputStream.close();
            // закрыли поток
        } catch (IOException e){
            e.printStackTrace();
            // распечатали ошибку в случае чего
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();

    }

    public static void main(String[] args) {
        System.out.println(getProperty("browser"));
    }

}
