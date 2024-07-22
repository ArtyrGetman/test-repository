public class Main {

    public static void main(String[] args) {


     Student student = new Student(14);
     Student student2 = new Student(18);
     Student student3 = new Student(16);

     int result = (student.getAge()+student2.getAge()+student3.getAge())/3;

        System.out.println(result);




    }
}