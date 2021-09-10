package com.company;

public class ToDoSettings
{

    static class Test_Styles{
        public static final String Reset_Color = "\u001B[0m";
        public static final String COLO = "\u001B[30m";
        public static final String Color_Red = "\u001B[31m";
        public static final String Color_Green = "\u001B[32m";
        public static final String Color_Yellow = "\u001B[33m";
        public static final String Color_Blue = "\u001B[34m";
        public static final String Renk_Mor = "\u001B[35m";
        public static final String Color_Cyan = "\u001B[36m";
        public static final String Color_White = "\u001B[37m";
        private static  String AsistantName= "Jahona";

        public static String getAsistantName() {
            return AsistantName;
        }

        public static void setAsistantName(String asistantName) {
            AsistantName = asistantName;
        }
    }

}
