package AssesmentTask;

public class ActionTask {

    public int id;
    public String  name;
    public int salary;
    public int bonus;
    public boolean eligibeleOrNot;
    public ActionTask() {
    	
    }
    public ActionTask(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }
    public boolean eligibeleOrNot() {
        return eligibeleOrNot;
    }
    public void setEligible(boolean eligibleOrNot)
    {
    	this.eligibeleOrNot=eligibleOrNot;
    }
  
}
