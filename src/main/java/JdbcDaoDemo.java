public class JdbcDaoDemo
{

    public static void main(String[] args)
    {
        StudentDao dao = new StudentDao(); // creo un nuevo estudiante dao, osea data object

        Student s2 = new Student();
        s2.rollno = 15;
        s2.sname = "Lucas";

        try {
            dao.addStudent(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
