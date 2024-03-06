package JdbcStuff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

class Abc{
    private Scanner ob;
    public Abc(){
        ob = new Scanner(System.in);
    }
    public void db(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

            try{
                Statement statement = connection.createStatement();

                try {
                    statement.execute("CREATE TABLE student_record(id integer NOT NULL UNIQUE AUTO_INCREMENT, name varchar(35) UNIQUE, age integer(2), class_num integer(2), PRIMARY KEY(id));");

                }catch (Exception e){
                    System.out.println(e);
                    System.out.println("Table is already created");
                }

                System.out.println("Enter the Fields");
                while(true){
                    System.out.println("1 to add any other to exit");
                    int opt = ob.nextInt();


                    if(opt == 1){
                        ob.nextLine();
                        System.out.println("Enter the name");
                        String name = ob.nextLine();
                        System.out.println("Enter the age");
                        int age = ob.nextInt();
                        System.out.println("Enter the class");
                        int classNum = ob.nextInt();
                        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO student_record VALUES(?,?,?,?)");
                        try {
                            preparedStatement.setString(1,null);
                            preparedStatement.setString(2,name);
                            preparedStatement.setInt(3,age);
                            preparedStatement.setInt(4,classNum);
                            preparedStatement.execute();
                            preparedStatement.close();
                        }catch (Exception e){
                            System.out.println(e);
                            System.out.println("Duplicate detected");
                        }
                    }else{
                        break;
                    }
                }


            }catch (Exception e){
                System.out.println(e);
            }
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Done");
    }
}

public class ValuesToQuery {
    public static void main(String[] args){
        Abc abc = new Abc();
        abc.db();
    }
}
