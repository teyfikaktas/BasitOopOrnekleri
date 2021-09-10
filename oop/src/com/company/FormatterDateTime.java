package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterDateTime {
    static LocalDateTime myDateObj = LocalDateTime.now();
    static DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    private static String formattedDate = myDateObj.format(myFormatObj);

    public static String getFormattedDate() {

        return formattedDate;
    }

    public void setFormattedDate(String formattedDate) {
        this.formattedDate = formattedDate;
    }

    static String Formatter() {

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return myDateObj.format(myFormatObj);
    }
}
