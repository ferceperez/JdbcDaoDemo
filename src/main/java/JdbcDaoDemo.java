public class JdbcDaoDemo
{

    public static void main(String[] args)
    {
        StudentDao dao = new StudentDao(); // creo un nuevo estudiante dao, osea data object
        Student s1 = null;
        try {
            s1 = dao.getStudent(1); // llamo el metodo dato para obtener el estudiante con el rollno 1 en la base de datos
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(s1.sname); //imprimo el nombre obtenido por mi busqueda en la base
    }
}
