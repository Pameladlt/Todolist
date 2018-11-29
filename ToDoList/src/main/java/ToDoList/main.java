
import ToDoList.Task;
import ToDoList.TaskOperation;
import java.util.ArrayList;
import java.util.List;

public class main {

  
    public static void main(String[] args) {
        
       List<Task> taskList = new ArrayList<Task>(); 
       List<Task> taskList2 = new ArrayList<Task>();
       
        Task task = new Task("Comer","2211","otro","high","Emilio");
        TaskOperation to = new TaskOperation();
        
        
        
        //to.saveTask(0,task);
        
        taskList.add(task);
        taskList2.add(task);
        
        System.out.println("task : " + taskList.equals(taskList2));
        
        taskList.remove(task);
        
        System.out.println("task : " + taskList.equals(taskList2));
       // System.out.println("task : " + task.getTask() + " date: " + task.getDateDue() + " Importance: " + " User: " + task.getUser());
//        
//        to.deleteTask(0);
//     
//        System.out.println("task : " + task.getTask() + " date: " + task.getDateDue() + " Importance: " + " User: " + task.getUser());
    }
    
}
