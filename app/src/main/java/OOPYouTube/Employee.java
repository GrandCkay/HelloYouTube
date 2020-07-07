package OOPYouTube;

public class Employee {
    String name;
    String position;
    int pay;
    int works;
    boolean errorWorking;

    /*
        The default constructor is created automatically;
        if a constructor with parameters is created, the default constructor is destroyed
     */
    Employee () {

    }

    // new constructor with parameters
    public Employee(String name, int works) {
        this.name = name;
        this.works = works;
    }

    // method with parameters
    void employeeMethod (String name, int works) {
        this.name = name;
        this.works = works;
    }

    void setPositionPay () {
        if (works >= 12) {
            position = "Middle Coder";
            pay = 3000;
        } else if (works >= 6) {
            position = "Junior Coder";
            pay = 1500;
        } else if (works > 0) {
            position = "Intern Coder";
            pay = 500;
        } else {
            position = "null";
        }
    }

    String infoEmployee (int months) {
        if (months > works || months < 0) {
            errorWorking = true;
            return "Invalid request";
        } else if (months == 0) {
            return "Employee - " + name + ", position - " + position
                    + ", earns per month - $" + pay
                    + ". Works in the company for " + works + " months"
                    + ". Haven’t received pay yet.";
        } else {
            return "Employee - " + name + ", position - " + position
                    + ", earns per month - $" + pay
                    + ". Works in the company for " + works + " months"
                    + ", over the last " + months
                    + " months earned $" + months * pay;
        }
    }

    void mentor() {
        if (!errorWorking) {
            switch (position) {
                case "Middle Coder":
                    System.out.println(name + ", can be a mentor.");
                    break;
                case "Junior Coder":
                    System.out.println(name + ", can work unattended. It's too early to be a mentor.");
                    break;
                case "Intern Coder":
                    System.out.println(name + "s need a mentor.");
                    break;
                default:
                    System.out.println("Invalid position");
                    break;
            }
        } else {
            System.out.println("An employee " + name + " has not been working with us for so long");
        }
    }
}
