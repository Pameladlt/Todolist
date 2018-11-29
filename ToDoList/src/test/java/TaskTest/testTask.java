
package TaskTest;

import ToDoList.Task;
import ToDoList.TaskOperation;
import org.junit.Test;
import static org.junit.Assert.*;


public class testTask {
    
    public testTask() {
    }

   
    @Test
    public void saveTaskTest(){
        
        Task task = new Task("Comer","2211","otro","high","Emilio");
        TaskOperation tas = new TaskOperation();
        
        tas.saveTask(task);
        
        assertTrue(tas.compareTaskList(task));
        
    }
    
    @Test
    public void deleteTaskTest(){
        
        Task task = new Task("Comer","2211","otro","high","Emilio");
        TaskOperation to = new TaskOperation();
        
        to.saveTask(task);
        
        assertTrue(to.compareTaskList(task));
         
         to.deleteTask(task);
        
         assertFalse(to.compareTaskList(task));
    }
    
    @Test
    public void completeTaskTest(){
        
        Task task = new Task("Comer","2211","otro","high","Emilio");
        TaskOperation to = new TaskOperation();
        
        to.completeTask(task);
        
        assertFalse(to.compareTaskCompleteList(task));
         
        to.saveTask(task);
        
        to.completeTask(task);
        
        assertTrue(to.compareTaskCompleteList(task));
    }
}
