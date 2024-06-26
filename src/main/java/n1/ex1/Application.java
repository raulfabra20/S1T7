package n1.ex1;

import n1.ex1.models.OnlineWorker;
import n1.ex1.models.OnsiteWorker;

public class Application {

    public static void testMethods(){
        OnlineWorker worker1 = new OnlineWorker("Raul", "Fabra", 10);
       int hoursWorker1 = 160;
        double salaryWorker1 = worker1.calculateSalary(hoursWorker1);
        System.out.println("The salary of "+worker1.getName()+" is: "+salaryWorker1+" €.");

        OnsiteWorker worker2 = new OnsiteWorker("Pedro", "Garcia", 12);
        int hoursWorker2 = 120;
        double salaryWorker2 = worker2.calculateSalary(hoursWorker2);
        System.out.println("The salary of "+worker2.getName()+" is: "+salaryWorker2+" €.");


    }
}
