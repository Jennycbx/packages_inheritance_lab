package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String depName;

    public Manager(String name, String niNumber, double salary, String depName) {
        super(name, niNumber, salary);
        this.depName = depName;
    }

    public String getDepName() {
        return depName;
    }
}
