package n1.ex2.models;

public class OnlineWorker extends Worker{
    protected final int INTERNETFEE = 15;


    public OnlineWorker(String name, String surname, int pricePerHour) {
        super(name, surname, pricePerHour);
    }


    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked*pricePerHour)+INTERNETFEE;
    }

    @Deprecated
    public void getSalary(int hoursWorked){
        int salary = hoursWorked*pricePerHour;
        System.out.println(salary+" €");
    }
}
