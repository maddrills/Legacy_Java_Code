package Main;

import java.sql.*;
import java.util.Scanner;

class Database extends Thread{
        Scanner sc= new Scanner(System.in);
        int indx,id,emp_age,salary;
        String db_value,emp_name,designation;
        int opt;

    public void run() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            //to insert all the entries in database
            PreparedStatement stmt = con.prepareStatement("insert into employee values(?,?,?,?,?) ");
            //to update emp_name
            PreparedStatement stmt1 = con.prepareStatement("update employee set emp_name=? where emp_id=? ");
            //to update emp_id
            PreparedStatement stmt2 = con.prepareStatement("update employee set emp_id=? where emp_name=? ");
            //to update salary
            PreparedStatement stmt3 = con.prepareStatement("update employee set salary=? where emp_id=? ");
            //to update age
            PreparedStatement stmt4 = con.prepareStatement("update employee set emp_age=? where emp_id=? ");
            //to update designation
            PreparedStatement stmt5 = con.prepareStatement("update employee set designation=? where emp_id=? ");
            //to delete record from database
            PreparedStatement stmt6 = con.prepareStatement("delete from employee where emp_id=? ");
            //to display all the entries of a database
            Statement stmt7= con.createStatement();
            ResultSet rs = stmt7.executeQuery("select * from employee");

            do {
                //asking user to choose his option
                System.out.println("Choose your options :");
                System.out.println("To Enter the details of Employee's :- ");
                System.out.println("1. Add entries to Employee ");
                System.out.println("2. Update Employee ID :");
                System.out.println("3. Update Employee Name :");
                System.out.println("4. Update Employee age :");
                System.out.println("5. Update Employee salary :");
                System.out.println("6. Update Employee Designation :");
                System.out.println("7. Delete entries from Employee ");
                System.out.println("8. View Employee Details ");
                System.out.println("9. Exit");

                System.out.println("Enter your choice :");
                opt=sc.nextInt();
                Thread.sleep(2000);
                switch(opt) {
                    case 1:
                        //Adding all employee details
                        System.out.println("Enter emp_id :");
                        id=sc.nextInt();
                        System.out.println("Enter Employee Name :");
                        emp_name= sc.next();
                        System.out.println("Enter age of the Employee :");
                        emp_age = sc.nextInt();
                        System.out.println("Enter Salary :");
                        salary = sc.nextInt();
                        System.out.println("Enter Designation of the Employee :");
                        designation = sc.next();

                        stmt.setInt(1, id);
                        stmt.setString(2, emp_name);
                        stmt.setInt(3, emp_age);
                        stmt.setInt(4, salary);
                        stmt.setString(5, designation);
                        stmt.execute();
                        Thread.sleep(2000);
                        System.out.println("Data inserted successfully...!");
                        break;

                    case 2:
                        //Update employee id
                        System.out.println("Update emp_id :");
                        Thread.sleep(2000);
                        System.out.println("Enter name :");
                        emp_name=sc.next();
                        System.out.println("Enter emp_id you want to update :");
                        id=sc.nextInt();

                        stmt2.setInt(1,id );
                        stmt2.setString(2,emp_name );

                        stmt2.execute();
                        Thread.sleep(2000);
                        System.out.println("Emp_id updated successfully");
                        break;

                    case 3:
                        //Update employee name
                        System.out.println("Enter emp_id :");
                        id=sc.nextInt();
                        System.out.println("Enter emp_name you want to update :");
                        emp_name=sc.next();

                        stmt1.setInt(2, id);
                        stmt1.setString(1, emp_name);

                        stmt1.execute();
                        Thread.sleep(2000);
                        System.out.println("emp_name updated successfully");
                        break;

                    case 4:
                        //Update employee age
                        System.out.println("Enter emp_id :");
                        id=sc.nextInt();
                        System.out.println("Enter emp_age :");
                        emp_age=sc.nextInt();

                        stmt4.setInt(2, id);
                        stmt4.setInt(1, emp_age);
                        stmt4.execute();
                        Thread.sleep(2000);
                        System.out.println("emp_age updated successfully");
                        break;

                    case 5:
                        //Update employee salary
                        System.out.println("Enter emp_id :");
                        id=sc.nextInt();
                        System.out.println("Enter emp_salary :");
                        salary=sc.nextInt();

                        stmt3.setInt(2, id);
                        stmt3.setInt(1, salary);

                        stmt3.execute();
                        Thread.sleep(2000);
                        System.out.println("emp_salary updated successfully");
                        break;

                    case 6 :
                        //Update designation

                        System.out.println("Enter emp_id :");
                        id=sc.nextInt();
                        System.out.println("Enter Designation :");
                        designation=sc.next();

                        stmt5.setInt(2, id);
                        stmt5.setString(1, designation);
                        stmt5.execute();
                        Thread.sleep(2000);
                        System.out.println("Designation updated successfully");
                        break;

                    case 7 :
                        //Delete employee recored by emp_id
                        System.out.println("Enter emp_id to delete record :");
                        id=sc.nextInt();

                        stmt6.setInt(1, id);
                        stmt6.execute();
                        Thread.sleep(2000);
                        System.out.println("Data deleted successfully");
                        break;

                    case 8 :
                        //View all employee data
                        System.out.println("Displaying all the entries in a database :");
                        while(rs.next()){
                            System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t "+ rs.getInt(3)+ "\t "+rs.getInt(4)+"\t "+rs.getString(5) );
                        }
                        break;

                    case 9 :
                        //Exit
                        System.out.println("Thank you...!");
                        System.exit(opt);
                        break;

                    default :
                        System.out.println("Invalid option choosen :");
                }
            }
            while(opt!=9);

            stmt.close();
            stmt1.close();
            stmt2.close();
            stmt3.close();
            stmt4.close();
            stmt5.close();
            stmt6.close();
            stmt7.close();
            con.close();
        }
        catch (Exception e ) {
            System.out.println(e);
        }
    }
}
public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Database db = new Database();
        Thread t = new Thread(db);


        System.out.println("*** Welcome to database handling program ***");
        t.start();
    }
}
