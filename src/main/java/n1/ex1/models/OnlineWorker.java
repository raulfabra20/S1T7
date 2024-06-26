package n1.ex1.models;

public class OnlineWorker extends Worker{
    protected final int INTERNETFEE = 15;


    public OnlineWorker(String name, String surname, int pricePerHour) {
        super(name, surname, pricePerHour);
    }


    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked*pricePerHour)+INTERNETFEE;
    }
}
