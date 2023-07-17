
import java.util.ArrayList;
import java.util.Scanner;
public class ToDoList {
    private ArrayList<String>tasks;
    public ToDoList(){
        tasks=new ArrayList<>();
        }
        public void addTask(String task){
            tasks.add(task);
        }
        public void removeTask(int index){
            if(index>=0 && index<tasks.size()){
                tasks.remove(index);
            }else{
                System.out.println("Invalid Index");
            }
        }
        public void displayTasks(){
            if(tasks.isEmpty()){
                  System.out.println("No tasks found");
            }else{
                  System.out.println("No Tasks found");
                  for(int i=0;i<tasks.size();i++){
                      System.out.println((i + 1) +" . " + tasks.get(i));
                  }
                
            }
        }

    
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        ToDoList toDoList=new ToDoList();
        
        while(true){
              System.out.println("\n---Menu---");
                System.out.println("1. Add Task");
                  System.out.println("2. Remove Task");
                    System.out.println("3. Display Tasks");
                      System.out.println("4. Exit");
                        System.out.println("Enter your Choice:");
                        int choice=scanner.nextInt();

               switch(choice){
                case 1:
                scanner.nextLine();
                  System.out.print("Enter the Task: ");
                  String task = scanner.nextLine();
                  toDoList.addTask(task);
                    System.out.println("Task added successfully");
                    break;
                    case 2:
                      System.out.print("Enter the index of the task you eant to remove");
                      int index=scanner.nextInt();
                      toDoList.removeTask( - 1);
                      break;
                      case 3:
                        toDoList.displayTasks();
                        break;
                        case 4:
                          System.out.println("Exiting......");
                          default:
                            System.out.println("Invalid Choice");
                          
               }         
        }
    }
}

