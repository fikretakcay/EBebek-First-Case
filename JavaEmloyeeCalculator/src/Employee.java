public class Employee {
    String name;
    int workHours,hireYear,salary;
    double tax,bonus,raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear){
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
            this.tax = 0;
            this.bonus = 0;
            this.raiseSalary = 0;
    }
      double tax(){
        if(this.salary > 1000){
            this.tax = this.salary*0.03;
        }else{
            this.tax = 0;
        }
        return this.tax;
    }
     double bonus(){
        if(this.workHours > 40){
            this.bonus = (this.workHours - 40) *30;
        }else{
            this.bonus = 0;
        }
        //System.out.println("Bonus is :" + this.bonus);
         return this.bonus;
    }
     double raiseSalary(){

        if(2021 - this.hireYear < 10){
            this.raiseSalary = this.salary * 0.05;
        }else if(2021 - this.hireYear > 9 && 2021 -this.hireYear<20){
            this.raiseSalary = this.salary * 0.10;
        }else if(2021 -this.hireYear > 19){
            this.raiseSalary = this.salary * 0.15;
        }
        return this.raiseSalary;
    }
     void stringInfo(){
        System.out.println("Employee Name :" + name);
        System.out.println("Employee Salary :" + salary);
        System.out.println("Work Hours At Week :" + workHours);
        System.out.println("Hire Year :" + hireYear);
        System.out.println("Salary with Tax and Bonus : " + (this.salary - tax() + bonus()));
        System.out.println("Current Salary :" +(this.salary + this.raiseSalary()));
    }
}
