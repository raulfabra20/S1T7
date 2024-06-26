package n1.ex1.models;

public class OnsiteWorker extends Worker {
    protected static int gasoline;

    public OnsiteWorker(String name, String surname, int pricePerHour) {
        super(name, surname, pricePerHour);
        this.gasoline = 30;
    }

    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked*pricePerHour)+gasoline;
    }
}
