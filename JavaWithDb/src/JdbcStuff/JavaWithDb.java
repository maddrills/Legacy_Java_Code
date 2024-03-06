package JdbcStuff;

import java.sql.*;
import java.util.ArrayList;

public class JavaWithDb {
    static class Data{
        private ArrayList<String> theData = new ArrayList();

        public void sqlStuff(){
            try{
                //import the class
                Class.forName("com.mysql.cj.jdbc.Driver");
                //establish the connection
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studant","root","root");
                //create the ability for a statement
                Statement statement = connection.createStatement();
                PreparedStatement preparedStatement = connection.prepareStatement("");
                try{
                    statement.execute("CREATE TABLE classOneStudent(student_name VARCHAR(35), rol_number INTEGER(5), age INTEGER(2));");
                }catch (Exception e){
                    System.out.println(e);
                }
                // statement.execute("INSERT INTO classOneStudent(student_name,rol_number,age) VALUES('mat',12345,24);");
                ResultSet resultSet = statement.executeQuery("SELECT * FROM classOneStudent");

                //get the result of all the data
                while(resultSet.next()){
                    //theData.put(resultSet.getString("student_name"),resultSet.getString("rol_number"));
                    theData.add(resultSet.getString("student_name"));
                    theData.add(resultSet.getString("rol_number"));
                    theData.add(resultSet.getString("age"));
                }
                System.out.println(theData);

                statement.close();
                connection.close();

            }catch(Exception e){
                System.out.println(e);
            }

        }
    }

    public static void main(String[] args){
        Data data = new Data();
        data.sqlStuff();
    }
}
