public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary > 1000) {
            return (salary * (0.03));
        } else
            return 0;
    }

    public int bonus() {
        if (workHours > 40)
            return (workHours - 40) * 30;
        else
            return 0;
    }

     public double raiseSalary() {
        if (hireYear <= 2002) {
            return salary * (0.15);
        }
        if (hireYear > 2002 && hireYear < 2012) {
            return salary * (0.10);
        }
        if (hireYear >= 2012 && hireYear <= 2021) {
            return salary * (0.05);
        } else
            return 0;
     }



    int salaryTaxBonus() {
        return (int) (salary - tax() + bonus());
    }


    int totalSalary() {
        return (int) (salary - tax() + bonus() + raiseSalary());
    }

    public void display() {
        System.out.println("Name:\t\t\t\t\t\t " + this.name);
        System.out.println("Salary:\t\t\t\t\t\t " + this.salary);
        System.out.println("Working Hours:\t\t\t\t " + this.workHours);
        System.out.println("Starting Year:\t\t\t\t " + this.hireYear);
        System.out.println("Tax:\t\t\t\t\t\t " + tax());
        System.out.println("Bonus:\t\t\t\t\t\t " + bonus());
        System.out.println("Salary Raise:\t\t\t\t " + raiseSalary());
        System.out.println("Salar with Tax and Bonus:\t " + salaryTaxBonus());
        System.out.println("Total Salary:\t\t\t\t " + totalSalary());

    }
}





