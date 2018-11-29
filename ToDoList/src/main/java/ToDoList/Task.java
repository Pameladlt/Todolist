package ToDoList;

import java.util.ArrayList;
import java.util.List;

//metodo task 
public class Task {
    
    private String task;
    private String dateDue;
    private String type;
    private String importance;
    private String user;
  
    //constructor vacio
    public Task (){}
    
   //constructor con parametros
    public Task(String task, String dateDue, String type, String importance, String user){
        this.task = task;
        this.dateDue = dateDue;
        this.type = type;
        this.importance = importance;
        this.user = user;
    }

    //SETTERS Y GETTERS
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDateDue() {
        return dateDue;
    }

    public void setDateDue(String dateDue) {
        this.dateDue = dateDue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    
}
