import java.util.*;
public class tod {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> tasks = new ArrayList<>();
            while(true){
                System.out.println();
                System.out.println("1.Add");
            System.out.println("2.Remove");
            System.out.println("3.Exit");
            System.out.println("Enter Your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                System.out.println("You are Adding Task");
                System.out.print("Enter Task: ");
                String task = sc.nextLine();
                tasks.add(task);
                System.out.println("Task Added "+task);
            }
            else if(choice == 2){
                    if(tasks.isEmpty()){
                        System.out.println("No tasks can be Removed");
                    }
                    else{
                        System.out.println("Your Tasks: ");
                        for(int i=0;i<tasks.size();i++){
                            System.out.println((i+1)+"."+tasks.get(i));
                        }
                        int removeIndex = sc.nextInt();
                        if(removeIndex>0 && removeIndex<=tasks.size()){
                            System.out.println("You are Removing a task");
                            String remove = tasks.remove(removeIndex-1);
                            System.out.println("Task Removed "+remove);
                            for(int i=0;i<tasks.size();i++){
                                System.out.println((i+1)+" "+tasks.get(i));
                            }
                        }
                        else{
                            System.out.println("Invalid Index");
                        }
                    }
            }   
            else if(choice == 3){
                System.out.println("Exiting...");
                break;
            }    
            else{
                System.out.println("Invalid!!!");
            }
            }     
        }
}