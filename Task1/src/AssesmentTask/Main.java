
package AssesmentTask;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {

            //Initializing the List with initial capacity 3
    public List<PermanentEmployee> permanentEmployeesList = new ArrayList<>(3);
    public  List<ContractualEmployee> contractualEmployeesList = new ArrayList<>(3);
    public  List<TemporaryEmployee> temporaryEmployeesList = new ArrayList<>(3);

            //Taking Input for Permanent employee

    public PermanentEmployee userInputPermanent(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Name: ");
        String name = scan.nextLine();

        System.out.println("Salary: ");
        int salary = scan.nextInt();
        PermanentEmployee employee = new PermanentEmployee(id,name,salary);
        return  employee;
    }
           //Taking input for Contractual Employee

    public ContractualEmployee userInputContractual(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Name: ");
        String name = scan.nextLine();

        System.out.println("Salary: ");
        int salary = scan.nextInt();
        ContractualEmployee employee = new ContractualEmployee(id,name,salary);
        return  employee;
    }

          //Taking input for Contractual Employee

    public TemporaryEmployee userInputTemporary(){
        Scanner scan = new Scanner(System.in);
        System.out.println("ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Name: ");
        String name = scan.nextLine();

        System.out.println("Salary: ");
        int salary = scan.nextInt();
        TemporaryEmployee employee = new TemporaryEmployee(id,name,salary);
        return  employee;
    }

    //For storing in the list declaring method

    public  void insertIntoPermanent(PermanentEmployee permanentEmployee){
        permanentEmployeesList.add(permanentEmployee);
    }

    public  void insertIntoContractual(ContractualEmployee contractualEmployee) {
        contractualEmployeesList.add(contractualEmployee);
    }
    public  void insertIntoTemporary(TemporaryEmployee temporaryEmployee){
        temporaryEmployeesList.add(temporaryEmployee);
    }

   
    //show the value
    public  void showPermanent() {
        for (PermanentEmployee permanentEmployee : permanentEmployeesList) {
            System.out.println("Employee ID: " + permanentEmployee.getId() + " " + "Employee Name : "+ permanentEmployee.getName() + " " +"Employee Bonus : " + permanentEmployee.getBonus());
        }
    }
    public  void showPermanentFund() {
        for (PermanentEmployee permanentEmployee : permanentEmployeesList) {
            System.out.println("Employee ID: " + permanentEmployee.getId() + " " + "Employee Name : "+ permanentEmployee.getName() + " " + "Employee is eligible for Provident Fund :" + permanentEmployee.eligibleOrNot() );
        }
    }

    public  void showContractual() {
        for (ContractualEmployee contractualEmployee : contractualEmployeesList) {
            System.out.println("Employee ID: " + contractualEmployee.getId() + " " + "Employee Name : "+ contractualEmployee.getName() + " " +"Employee Bonus : " + contractualEmployee.getBonus());
        }
    }
    public  void showContractualFund() {
        for (ContractualEmployee contractualEmployee : contractualEmployeesList) {
            System.out.println("Employee ID: " + contractualEmployee.getId() + " " + "Employee Name : "+ contractualEmployee.getName() + " " + "Employee is eligible for Provident Fund :" + contractualEmployee.eligibeleOrNot());
        }
    }

    public  void showTemporary() {
        for (TemporaryEmployee temporaryEmployee : temporaryEmployeesList) {
            System.out.println("Employee ID: " + temporaryEmployee.getId() + " " + "Employee Name : "+ temporaryEmployee.getName() + " " +"Employee Bonus : " + temporaryEmployee.getBonus());
        }
    }
    public  void showTemporaryFund() {
        for (TemporaryEmployee temporaryEmployee : temporaryEmployeesList) {
            System.out.println("Employee ID: " + temporaryEmployee.getId() + " " + "Employee Name : "+ temporaryEmployee.getName() + " " + "Employee is eligible for Provident Fund :" + temporaryEmployee.eligibleOrNot());
        }
    }






    public static void main(String args[]){

        int countPermanentEmployee=0;
        int countTemporaryEmployee=0;
        int countContractualEmployee=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of permanent employee you would like to see :");
        int numberOfPermanentEmployee = scanner.nextInt();
        System.out.println("Number of contractual employee you would like to see :");
        int numberOfContractualEmployee = scanner.nextInt();
        System.out.println("Number of Temporary employee you would like to see:");
        int numberOfTemporaryEmployee = scanner.nextInt();
        Main indicator = new Main();


        while (numberOfPermanentEmployee>0){
            PermanentEmployee permanentEmployee1 = indicator.userInputPermanent();
            indicator.insertIntoPermanent(permanentEmployee1);
            numberOfPermanentEmployee--;
            countPermanentEmployee++;
        }

        while (numberOfContractualEmployee>0){
            ContractualEmployee contractualEmployee1= indicator.userInputContractual();
            indicator.insertIntoContractual(contractualEmployee1);
            numberOfContractualEmployee--;
            countContractualEmployee++;
        }

        while (numberOfTemporaryEmployee>0){
            TemporaryEmployee temporaryEmployee1= indicator.userInputTemporary();
            indicator.insertIntoTemporary(temporaryEmployee1);
            numberOfTemporaryEmployee--;
            countTemporaryEmployee++;
        }

        if(countPermanentEmployee !=0 ){
            indicator.showPermanent();
        }
        
        if(countContractualEmployee !=0 ){
            indicator.showContractual();
        }
        
        if(countTemporaryEmployee !=0 ){
            indicator.showTemporary();
        }
        
        if(countPermanentEmployee !=0 ){
            indicator.showPermanentFund();

        }
        if(countContractualEmployee!=0 ){
            indicator.showContractualFund();

        }
        if(countTemporaryEmployee !=0 ){
            indicator.showTemporaryFund();

        }

    }

}
