import java.util.Scanner;
public class Payroll {
    class Employess{
        Scanner scan = new Scanner(System.in);
        String name;
        String dob;
        String empnum;
        String position;
        String dpt;
        String gender;
        float salary;
        float hsallowance;
        float travallowance;

        //Get and set methods
        public void setAllwances() {
            hsallowance = (float) 0.5 * salary;
            travallowance = (float) 0.1 * salary;
        }//end of setAllwances

        //getters
        public float getHsallowance() {
            return hsallowance;
        }//end of getHsallowance

        public float getTravallowance() {
            return travallowance;
        }//end of getTravallowance

        public float getSalary() {
            return salary;
        }//end of getSalary

        public String getName() {
            return name;
        }//end of getName

        public String getNumber() {
            return empnum;
        }//end of getNumber

        //get position
        public String getPosition() {
            return position;
        }//end of getPosition

        //get department
        public String getDpt() {
            return dpt;
        }//end of getDpt

        //get dob
        public String getDob() {
            return dob;
        }//end of getDob

        //get gender
        public String getGender() {
            return gender;
        }


        //setters
        public void setName(String nm){
            name = nm;
        }//end of setName

        //salary
        public void setSalary(float sal){
            salary = sal;
        }//end of setSalary

        //EmpNum
        public void setEmpNum(String num){
            empnum = num;
        }//end of setEmpNum

        //dpt
        public void setDpt(String dpt){
            this.dpt = dpt;
        }//end of setDpt

        //dob
        public void setDob(String db){

            dob=db;
        } //end of set

        //
        public void setGender(String gd){
            gender=gd;
        } //end of setGender


        // A method to set Employee Details
        public void setDetails(){
            System.out.println("Enter Employee name");
            name=scan.nextLine();
            System.out.println("Enter Employee Number");
            empnum=scan.next();
            System.out.println("Enter Employee Position");
            position=scan.next();
            System.out.println("Enter Employee Salary");
            salary=scan.nextFloat();
            System.out.println("Enter Employee Department");
            dpt=scan.nextLine();
            System.out.println("Enter Employee Date of Birth");
            dob=scan.next();
        }
        // A method to Print Employee Details
        public void printEmployee(){
            System.out.println(empnum+"\t"+name+"\t"+position+"\t"+dpt);
        }
    }//End of class Employee
    //Main Driver Class
    public class EmployeeMain{
        public static void main(String [] args){
            Scanner scan=new Scanner(System.in);
            //First Example we illustrating with a single employee
            //Employee Emp=new Employee();
            //Emp.setDetails();
            //Emp.setAllwances();
            //printPaySlip(Emp);
//Second we illustrating with a set of employees
// Creating an array of employees myemps
            Employee myemps[]=new Employee[5];
            //Populating the array
            for(int i=0;i<myemps.length;i++){
                myemps[i]=new Employee();
                myemps[i].setDetails();
                myemps[i].setAllwances();
            }//end of for loop
            printWageBill(myemps);
        }// End of main method
        // A method to get Employee Gross Pay
        public static float getGross(Employee E){
            return E.getSalary()+E.getHseAllowance()+E.getTravAllowance();
        }
        // A method to get Employee Tax
        public static float getTax(Employee E){
            float gross=getGross(E);
            float tax=0;
            if(gross<=10000)
                tax=0;
            else
            if(gross<=25000)
                tax=1000+10/100*(gross-10000);
            else
            if(gross<=35000)
                tax=1500+ 20/100*(gross-25000);
            else
            if(gross<=45000)
                tax=3500+ 30/100*(gross-35000);
            else
                tax=6500+ 40/100*(gross-45000);
            return tax;
        }
        // A method to print Employee Pay Slip
        public static void printPaySlip(Employee E){
            System.out.println("Catholic University of Eastern Africa");
            System.out.println("Employee Monthly Pay Slip\t Month :\t"+ getMonth());
            System.out.println("Employee Number"+E.getNumber()+"\tFull Name\t"+E.getName()
                    +"\tDate:\t"+getDate());
            System.out.println("Position\t"+E.getPosition()+"\tDepartement\t"+E.getDpt());
            System.out.println("Basic Salary\t\t"+E.getSalary());
            System.out.println("House Allowance\t\t"+E.getHseAllowance());
            System.out.println("Travelling Allowance\t\t"+E.getTravAllowance());
            System.out.println("Gross Income\t\t"+getGross(E));
            System.out.println("Paye\t\t"+getTax(E));
            System.out.println("Net Income\t\t"+(getGross(E)-getTax(E)));
        }//end of printPaySlip

        // A method to Return Current Month
        public static String getMonth(){
            String
                    months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
                    Date dt= new Date();
            GregorianCalendar gc=new GregorianCalendar();
            int year=gc.get(Calendar.YEAR);
            int month=gc.get(Calendar.MONTH);
            int dte=gc.get(Calendar.DATE);
            String mon=months[month];
            return mon;
}
// A method to Return Current Date
            public static String getDate(){
                Date dt= new Date();
                GregorianCalendar gc=new GregorianCalendar();
                int year=gc.get(Calendar.YEAR);
                int month=gc.get(Calendar.MONTH);
                int dte=gc.get(Calendar.DATE);
                String date=dte+"/"+month+"/"+year;
                return date;
            }
            // A method to Return Time now
            public static String getTime(){
                Date dt= new Date();
                GregorianCalendar gc=new GregorianCalendar();
                int hour=gc.get(Calendar.HOUR);
                int min=gc.get(Calendar.MINUTE);
                int sec=gc.get(Calendar.SECOND);
                String tm=hour+":"+min+":"+sec;
                return tm;
            }
        }// End of class EmployeeMain


    }//end of class Employees
}//end of class Payroll

