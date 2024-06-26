package n1.ex2;

import n1.ex2.models.OnlineWorker;
import n1.ex2.models.OnsiteWorker;

public class Application {
    public static void createWorkers(){
        OnlineWorker worker1 = new OnlineWorker("Raul", "Fabra", 10);
        
        OnsiteWorker worker2 = new OnsiteWorker("Pedro", "Garcia", 12);
        
        testDeprecatedMethods(worker1, worker2);


    }
    @SuppressWarnings("deprecation")
    public static void testDeprecatedMethods(OnlineWorker worker1, OnsiteWorker worker2){
        System.out.println("Salary of "+worker1.getName()+": ");
        int hoursWorker1 = 160;
        worker1.getSalary(hoursWorker1);

        System.out.println("Salary of "+worker2.getName()+": ");
        int hoursWorker2 = 120;
        worker2.getSalary(hoursWorker2);
    }
}
