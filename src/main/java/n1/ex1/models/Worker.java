package n1.ex1.models;

public class Worker {
    protected String name;
    protected String surname;
    protected int pricePerHour;

    public Worker(String name, String surname, int pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double calculateSalary(int hoursWorked){
        return (hoursWorked * pricePerHour);
    }
}
