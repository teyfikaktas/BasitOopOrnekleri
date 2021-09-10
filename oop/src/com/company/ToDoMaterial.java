package com.company;

public class ToDoMaterial
{
    private  String title;
    private String description;
    private String remaindate;
    private Priority.Level Level;
    private boolean Is_Completed;

    public ToDoMaterial(String title, String description, String remaindate, Priority.Level level, boolean is_Completed) {
        this.title = title;
        this.description = description;
        this.remaindate = remaindate;
        Level = level;
        Is_Completed = is_Completed;
    }
    public ToDoMaterial(String title, String description, String remaindate, Priority.Level level) {
        this.title = title;
        this.description = description;
        this.remaindate = remaindate;
        Level = level;
        Is_Completed=false;

    }
    public ToDoMaterial(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {


        this.description = description;
    }

    public String getRemaindate() {
        return remaindate;
    }

    public void setRemaindate(String remaindate) {
        this.remaindate = remaindate;
    }

    public Priority.Level getLevel() {

        return Level;
    }

    public void setLevel(Priority.Level level) {
        Level = level;
    }

    public boolean getIs_Completed() {
        return Is_Completed;
    }

    public void setIs_Completed(boolean is_Completed) {
        Is_Completed = is_Completed;
    }
}
