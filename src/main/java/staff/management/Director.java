package staff.management;

public class Director extends Manager {

    private double budget;
    private double salary;

    public Director(String name, String niNumber, double salary, String depName, double budget) {
        super(name, niNumber, salary, depName);
        this.budget = budget;
        this.salary = salary;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus() {
        return this.salary/50;
    }

}
