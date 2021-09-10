package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import static com.company.ToDoMechanism.toDoMaterials;


class MainClass{


    public static void main(String[] args) {


        System.out.println(OpeningScene.WelcomeText);

       MainClass.Start();







    }

    public static  String TranslateString (boolean bool){
      if(bool){
          return ToDoSettings.Test_Styles.Color_Green+ "Completed"+ToDoSettings.Test_Styles.Reset_Color;

      }
    else
        return  ToDoSettings.Test_Styles.Color_Red+"is not Completed"+ToDoSettings.Test_Styles.Reset_Color;
    }



    public static void Start(){
        Scanner scanner= new Scanner(System.in);
        String Prefer = scanner.nextLine();
        while(true){
            if(Prefer.equals(TypingSystem.PreferName)){
                TypingSystem.Starting(); }
            else if(Prefer.equals(NumericalSystem.PreferName)){
                NumericalSystem.Starting();
            }
            else if(Prefer.equals(TypingSystem.QuitName)){
                System.out.println("Thanks. If you are wondering about my designer, you can go to the link!  \"https://www.linkedin.com/in/teyfikaktas/\"");

            }
            else
                System.out.println("Please enter a valid entry.");
MainClass.Start();





        }

    }
    }

class TypeModule{

    void typeStyle(){

    }




    }








