public class Employee {
    public String name = "";
    public double grossSalary = 0;
    public double tax = 0;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void IncreseSalary(double porcentage) {
        grossSalary += grossSalary * porcentage / 100;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}