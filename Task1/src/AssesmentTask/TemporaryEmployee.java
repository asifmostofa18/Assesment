package AssesmentTask;

public class TemporaryEmployee extends ActionTask implements EmployeeTask {


    public TemporaryEmployee(int id, String name, int salary)
    {
        this.id= id;
        this.name=name;
        this.salary=salary;
        this.bonus= bonus();
        this.eligibeleOrNot= eligibeleOrNot();
    }


    @Override
    public int bonus() {
        return (int) (this.salary* 0);
    }




    @Override
    public boolean eligibleOrNot() {
        return false;
    }
}