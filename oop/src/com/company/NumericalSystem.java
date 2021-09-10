package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class NumericalSystem extends ToDoMechanism {


    static Scanner scan = new Scanner(System.in);
    public static int Numeritor=0;
    public static String PreferName = "numerical";
    public static String QuitName = "quit";

    private static String UserNames = "Default";
    public static String WelcomeText = "Welcome again. Can I know your name?";
    Scanner scanneran = new Scanner(System.in);
    static int indexNo = 0;

    public static String getUserNames() {
        return UserNames;
    }

    public static void setUserNames(String userNames) {
        UserNames = userNames;
    }

    void PrintScreenType() {
        setUserNames(scan.nextLine());
    }

    public static void Starting() {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Hello there!\n" +
                "You can type \"0\" to view your to-do list." +"You can type \"1\" to add a new to-do list element."+" You can type 2 to update item. "+
                "You can type \"2\" to update item. \n" +
                "You can type \"3\" to delete an item. \n" +
                "You can type \"4\" to see what I can do. \n" +
                "Incomplete You can type \"5\" to mark an item as complete. \n" +
                "You can type \"6\" to see incomplete items. \n" +
                "You can type 8 to see the settings. \n" +
                "(Since the engineer who designed me forgot to write 7 and there was no 7 in my upper class, he switched me directly to 8, it's definitely not my fault, but if you want, you can reach his linkedin account link by typing \"8\". He is sorry for this)\n" +
                "\"You can log out by typing 9.\"");
        if(Numeritor==0){
            System.out.println(TypingSystem.WelcomeText);
            TypingSystem.setUserNames(scanner.nextLine());
            Numeritor++;
        }
        if(toDoMaterials.size()<=0){
            System.out.println("Welcome " + TypingSystem.getUserNames() + " today time " + FormatterDateTime.Formatter() + " I see that you haven't prepared a to-do list for today. What can I do for you?");

        }
        else
            System.out.println("Welcome " + TypingSystem.getUserNames() + " today time " + FormatterDateTime.Formatter() + " What can I do for you?");

        MethodsList();
        StartingWhile();

    }

    @Override
    public void notcomplatedıtem() {
        if (toDoMaterials.size() > 0) {

            for (int i = 0; i < toDoMaterials.size(); i++) {
                if(!toDoMaterials.get(i).getIs_Completed()){

                    System.out.println();
                    System.out.print(toDoMaterials.get(i).getTitle() + "         ");
                    System.out.print(toDoMaterials.get(i).getDescription() + "         ");
                    System.out.print(toDoMaterials.get(i).getRemaindate() + "         ");
                    System.out.print(LevelStyle(toDoMaterials.get(i).getLevel()) + "         ");
                    System.out.print(MainClass.TranslateString(toDoMaterials.get(i).getIs_Completed()) + "            ");
                    System.out.println();
                }
                else    {
                    System.out.println("I see you're not doing anything off the to-do list.\n");
                    System.out.println("I get it, everyone can be so lazy sometimes, even me^^");
                }
            }
        } else
            System.out.println("The to-do list appears empty. You can type \"create new todo\" to add a to-do list. ");

        StartingWhile();

    }



    @Override
    public int ListAllItem() {

        if (toDoMaterials.size() > 0) {

            for (int i = 0; i < toDoMaterials.size(); i++) {


                System.out.println();
                System.out.print(toDoMaterials.get(i).getTitle() + "         ");
                System.out.print(toDoMaterials.get(i).getDescription() + "         ");
                System.out.print(toDoMaterials.get(i).getRemaindate() + "         ");
                System.out.print(LevelStyle(toDoMaterials.get(i).getLevel()) + "         ");
                System.out.print(MainClass.TranslateString(toDoMaterials.get(i).getIs_Completed()) + "            ");
                System.out.println();
                StartingWhile();
            }
        } else
            System.out.println("The to-do list appears empty. You can type \"create new todo\" to add a to-do list. ");
        StartingWhile();



        return 0;
    }

    @Override
    public int AddItem(int index) {
        Scanner scanner = new Scanner(System.in);
        ToDoMaterial temporary = new ToDoMaterial();
        System.out.println("Please type the title of the to-do list item you want to add.");
        String title = scanner.nextLine();
        temporary.setTitle(title);
        System.out.println("Please type the description of the to-do list item you want to add.(max 30 characters)");
        String description = scanner.nextLine();
        temporary.setDescription(description);
        temporary.setIs_Completed(false);
        LocalDateTime localDateTime = LocalDateTime.now();
        temporary.setRemaindate(FormatterDateTime.Formatter());
        System.out.println("Please select  priority Level(type HIGH,MEDIUM,LOW)");
        String PriorityLevel = scanner.nextLine();
        if (PriorityLevel.equals("low")) {
            temporary.setLevel(Priority.Level.LOW);
            System.out.println("Your item has been successfully added to the to-do list.\n" +
                    "I refer you to other options.");
        } else if (PriorityLevel.equals("medium")) {
            temporary.setLevel(Priority.Level.MEDIUM);
            System.out.println("Your item has been successfully added to the to-do list.\n" +
                    "I refer you to other options.");

        } else if (PriorityLevel.equals("high")) {
            temporary.setLevel(Priority.Level.HIGH);
            System.out.println("Your item has been successfully added to the to-do list.\n" +
                    "I refer you to other options.");

        } else {
            System.out.println("Please try again");

            AddItem(index);
        }





        toDoMaterials.add(index, temporary);


        return 0;
    }

    @Override
    public int UpdateItem() {
        Scanner scanner = new Scanner(System.in);
        if (toDoMaterials.size() > 0) {
            System.out.println("To update the title 1\n" +
                    "You can type 2 to update the description."
            + "you can type 3 to update the level");
            int UpdateItem = scanner.nextInt();

            if (UpdateItem==1) {

                System.out.println("Please first write the index number and the new title you want to change, leaving a space.\n" +
                        "(for example \"1" +
                        " sample\")");
                String newTitle = scanner.nextLine();
                String[] NewTitlee = newTitle.split(" ");
                int indexnumber = Integer.parseInt(NewTitlee[0]);
                String newTitleValue = NewTitlee[1];
                if (newTitleValue.length() >= 3 && newTitleValue.length() < 100) {
                    try{
                        toDoMaterials.get(indexnumber).setTitle(newTitleValue);

                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Please type valid characters");
                        UpdateItem();
                    }
                    System.out.println("The title has been successfully updated.");
                    return 0;

                } else {
                    System.out.println("title word It should be between 3 and 100 letters, Please try again. ");
                    UpdateItem();
                    return 0;

                }
            }
            if (UpdateItem==2) {

                System.out.println("Please first write the index number and the new description you want to change, leaving a space.\n" +
                        "(for example \"1" +
                        " sample\")");
                String newTitle = scanner.nextLine();
                String[] NewTitlee = newTitle.split(" ");
                int indexnumber = Integer.parseInt(NewTitlee[0]);
                String newDescriptionValue = NewTitlee[1];
                if (newDescriptionValue.length() > 3 && newDescriptionValue.length() < 100) {
                    try{
                        toDoMaterials.get(indexnumber).setDescription(newDescriptionValue);

                    }
                    catch(IndexOutOfBoundsException e) {
                        System.out.println(("Please try again."));
                        UpdateItem();
                    }

                    System.out.println("The Description value has been successfully updated.");
                    return 0;

                } else {
                    System.out.println("Description word It should be between 3 and 100 letters, Please try again. ");
                    UpdateItem();
                    return 0;

                }
            }
            if (UpdateItem==3) {
                System.out.println("Please first write the index number and the new importance level you want to change, leaving a space.\n" +
                        "(for example \"1" +
                        " sample\")");
                String newTitle = scanner.nextLine();
                String[] NewTitlee = newTitle.split(" ");
                int indexnumber = Integer.parseInt(NewTitlee[0]);
                String newLevelValue = NewTitlee[1];
                if (newLevelValue.equals("low")) {
                    try{
                        toDoMaterials.get(indexnumber).setLevel(Priority.Level.LOW);
                        System.out.println("priority level has been successfully changed.");
                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Please try again");
                        UpdateItem();

                    }

                } else if (newLevelValue.equals("medium")) {
                    try{
                        toDoMaterials.get(indexnumber).setLevel(Priority.Level.MEDIUM);
                        System.out.println("priority level has been successfully changed.");
                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Please try again");
                        UpdateItem();

                    }


                } else if (newLevelValue.equals("high")) {
                    try{
                        toDoMaterials.get(indexnumber).setLevel(Priority.Level.HIGH);
                        System.out.println("priority level has been successfully changed.");
                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Please try again");

                        UpdateItem();

                    }


                } else System.out.println("try again");

            }
        } else
            System.out.println("The to-do list appears empty. You can type \"create new todo\" to add a to-do list. ");



        return  0;
    }

    @Override
    public int CompleteItem() {
        if (toDoMaterials.size() > 0) {
            System.out.println("please type the index number of the item you want to complete. \n");
            int Index = scan.nextInt();

            try {
                toDoMaterials.get(Index).setIs_Completed(true);
                System.out.println("todo item successfully completed.");
                return 0;

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Please type valid characters");
                CompleteItem();
                return 0;

            }

        } else {
            System.out.println("The to-do list appears empty. You can type \"create new todo\" to add a to-do list. ");
            return 0;

        }

    }

    @Override
    public int DeleteItem() {

        if(toDoMaterials.size()>0){
            System.out.println("Please enter the sequence number of the item you want to delete.");
            String SelectedItem= scan.nextLine();
            System.out.println("Are you sure you want to delete this item?\n" +
                    "Please write yes or no.");

            String choice = scan.nextLine();
            while(true){
                if(choice.equals("yes")) {
                    try{
                        toDoMaterials.remove(Integer.parseInt(SelectedItem));

                    }
                    catch (IndexOutOfBoundsException e){
                        System.out.println("Please enter valid characters.");
                        DeleteItem();
                    }
                    System.out.println("The deletion is  complete.");

                    return 0;
                }
                if(choice.equals("no")) {
                    System.out.println("The deletion is not complete.");
                    System.out.println("exiting...");
                    return 0;
                }
                return 0;
            }
        }
        else
            System.out.println("The to-do list appears empty. You can type \"create new todo\" to add a to-do list. ");

        return 0;
    }

    @Override
    public void PrintAllCommands() {
        ToDoMechanism.MethodList();
    }
    public static void StartingWhile(){

        while (true) {

            int Exist = scan.nextInt();
            if (Exist == 0) {
                NumericalSystem numericalSystem = new NumericalSystem();
                System.out.print(ToDoSettings.Test_Styles.Color_Blue+"Title "+"         ");
                System.out.print(ToDoSettings.Test_Styles.Color_White+"Description "+"         ");
                System.out.print(ToDoSettings.Test_Styles.Color_Blue+"Creation date "+"         ");
                System.out.print(ToDoSettings.Test_Styles.Color_Cyan+"Level "+"         ");
                System.out.println(ToDoSettings.Test_Styles.Color_Cyan+"Completion status "+"         "+ToDoSettings.Test_Styles.Reset_Color);
                numericalSystem.ListAllItem();
            }
            if(Exist == 1){

                NumericalSystem numericalSystem = new NumericalSystem();
                numericalSystem.AddItem(indexNo);

            }
            if(Exist == 2){
                NumericalSystem numericalSystem = new NumericalSystem();
                numericalSystem.UpdateItem();

            }
            if(Exist==3){
                NumericalSystem numericalSystem = new NumericalSystem();
                numericalSystem.DeleteItem();
            }
            if(Exist==4){
                NumericalSystem numericalSystem = new NumericalSystem();

                System.out.println("Method list is loading...");
                System.out.println("there are...");
                numericalSystem.PrintAllCommands();
            }
            if(Exist==5){
                NumericalSystem numericalSystem = new NumericalSystem();

                numericalSystem.CompleteItem();
            }
            if(Exist==6){
                NumericalSystem numericalSystem = new NumericalSystem();

                numericalSystem.notcomplatedıtem();
            }
            if(Exist==-1){
                System.out.println("The command you entered does not exist in my functions.\n Please Try Again.");
                System.out.println("Please type \"commandlist\" to see the command list.");

            }
            if (Exist==8){
                NumericalSystem numericalSystem = new NumericalSystem();

                Settings();
            }
            if(Exist==9){
                System.out.println("Thanks "+getUserNames()+" Hope to see you again ^^");
                System.out.print(ToDoSettings.Test_Styles.getAsistantName());
                break;
            }
            if(Exist==7){
                System.out.println("https://www.linkedin.com/in/teyfikaktas/");
            }
        }


    }
    public static void Settings(){
        System.out.println("Hi + \" \" + \"I see that you want to change the settings.\n" +
                "Here are my options.\n" +
                " You can change my name.\n" +
                "You can type \"1\" for this.\n" +
                " You can change your own name.\n" +
                "You can write \"2\" for this.\n" +
                "You can clear the entire to-do list.\n" +
                "For this \"3\"\n" +
                "To get information for the engineer who designed me.\n" +
                "\"4\"");
        String s = scan.next();
        switch (s) {
            case "new assistant name" -> {
                System.out.println("Please write the name of the new assistant.");
                System.out.print("");
                String newName = scan.nextLine();
                ToDoSettings.Test_Styles.setAsistantName(newName);
                System.out.println("Successfully updated. I redirect to home page.");

                NumericalSystem.Starting();
                break;
            }
            case "new user name" -> {
                System.out.println("Please write the name of the new use name.");
                String newName = scan.nextLine();
                TypingSystem.setUserNames(newName);
                System.out.println("Successfully updated. I redirect to home page.");
                NumericalSystem.Starting();
                break;
            }
            case "delete all todo items" -> {
                System.out.println("Are Are you sure you want to clear the to-do list? ");
                String PreferC = scan.nextLine();
                if (PreferC.equals("yes")) {
                    if (toDoMaterials.size() > 0) {
                        toDoMaterials.clear();
                    } else {
                        System.out.println("Your to-do list seems empty.");
                        NumericalSystem.StartingWhile();
                    }
                } else if (PreferC.equals("no")) {
                    System.out.println("I thought so, too.");
                    NumericalSystem.StartingWhile();
                }
            }
            default -> System.out.println("try again");
        }
    }

}
