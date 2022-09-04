package AssesmentTask;

/* In this Java class we are actually extends the EmployeeTask as a Permanent Employee Children Task and
 implemeting the ActionTask for interface  */


public class PermanentEmployee extends ActionTask implements EmployeeTask {




        public PermanentEmployee(int id, String name, int salary)
        {
            this.id= id;
            this.name=name;
            this.salary=salary;
            this.bonus= bonus();
            this.eligibeleOrNot= eligibeleOrNot();
        }



    @Override
    public int bonus() {
        return (int) (this.salary* 0.5);
    }

    @Override
    public boolean eligibleOrNot() {
        return true;
    }
   


}
