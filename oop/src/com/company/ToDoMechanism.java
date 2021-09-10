package com.company;

import java.sql.Array;
import java.util.ArrayList;

public abstract class ToDoMechanism {
    public  String LevelStyle(Priority.Level pLevel){
        if(pLevel.toString().equals("HIGH")){
            return ToDoSettings.Test_Styles.Color_Red+"high";
        }
        if(pLevel.toString().equals("MEDIUM")){
            return ToDoSettings.Test_Styles.Color_Yellow+"medium";
        }
        if(pLevel.toString().equals("LOW")){
            return ToDoSettings.Test_Styles.Color_Blue+"low";
        }
        return ToDoSettings.Test_Styles.Color_Blue+"low";
    }

    static ArrayList<String> CommandsArray = new ArrayList();
   static ArrayList<ToDoMaterial>  toDoMaterials = new ArrayList<ToDoMaterial>();
    ArrayList<Object> ToDoArray = new ArrayList<>();
    ToDoMechanism(){

    }
public static void info(){

}
    public static void MethodsList(){

        String commands1= "list all to-dos";
        String commands2= "create new todo";
        String commands3= "update a todo";
        String commands4= "delete a todo";
        String commands5 = "commandslist";
        String commands6 = "complete todo";
        String commands7 = "show not complete";
        String commands9 = "settings";
        String commands10 = "quit";
        String commands11= "info";


        CommandsArray.add(0,commands1);
        CommandsArray.add(1,commands2);
        CommandsArray.add(2,commands3);
        CommandsArray.add(3,commands4);
        CommandsArray.add(4,commands5);
        CommandsArray.add(5,commands6);
        CommandsArray.add(6,commands7);
        CommandsArray.add(7,commands9);
        CommandsArray.add(8,commands10);
        CommandsArray.add(9,commands11);


    }
 public static void MethodList(){
     for (String i: CommandsArray) {
         System.out.println(i);
     }
 }

  public static ArrayList GetCommands(){
     return CommandsArray;
  }
    public abstract int ListAllItem();
    public abstract int AddItem(int index);
    public abstract int UpdateItem();
    public abstract int CompleteItem();
    public abstract int DeleteItem();
    public abstract void PrintAllCommands();
    public static void Starting() {
    }
public  abstract  void notcomplatedıtem();

}
