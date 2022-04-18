import java.sql.*;

public class StudentDao
{
    public Student getStudent(int rollno) throws Exception //clase que crea el estudiante con la busqueda, la exception es por la conexion a la base de datos
    {
        Student s = new Student();
        s.rollno = rollno;

        String url = "jdbc:mysql://localhost:3306/jdbcdao";
        String uname = "root";
        String pass = "souless123";
        String query = "select sname from student where rollno = "+ rollno;
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);

        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String name = rs.getNString("sname");

        s.sname = name;

        st.close();
        con.close();


        return s;
    }


    public void addStudent(Student s2) throws  Exception{
        String url = "jdbc:mysql://localhost:3306/jdbcdao";
        String uname = "root";
        String pass = "souless123";
        String query = "insert into student values (?,?)";
        int rollno = s2.rollno;
        String sname = s2.sname;


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);

        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,rollno);
        st.setString(2,sname);
        int count = st.executeUpdate();
        System.out.println(count + " row/s affected");


        st.close();
        con.close();


    }
}
