import controller.CourseController;
import controller.StudentController;
import controller.authentication;
import model.Advising;
import model.student;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StudentController controller = new StudentController();
        CourseController courseController = new CourseController();

        System.out.println("Hello and welcome to the Java Academy");
        Scanner scan = new Scanner(System.in);
        authentication auth = new authentication();
        boolean IsLoggedIn = false;
        if (!IsLoggedIn){
            System.out.println("Enter your username");
            String username = scan.nextLine();

            System.out.println("Enter you password");
            String password = scan.nextLine();
            if (auth.adminLogin(username, password)){
                IsLoggedIn = true;
            }else{
                System.out.println("Username or Password is wrong.");
            }
        }
        if (IsLoggedIn){
            while (true){
                System.out.println("--------------------------------------------------------------------");
                System.out.println("Welcome to the admin dashboard and select a option for next steps");
                System.out.println("1. See all students");
                System.out.println("2. Add Student");
                System.out.println("3. See Student By Id");
                System.out.println("4. Assign Course to a model.student");
                System.out.println("5. See courses by Student Id");
                System.out.println("6. Exit");
                System.out.println("Choose a option: ");
                System.out.println("--------------------------------------------------------------------");

                int opt = scan.nextInt();
                scan.nextLine();
                if(opt == 1){
                    System.out.println("All students are here: ");
                    List<student> getAllStudents = controller.getAllStudents();
                    for(student s: getAllStudents){
                        System.out.println("Id: "+s.getId()+" Name: "+s.getName()+" Program: "+s.getProgram()+" Batch: "+s.getBatch()+ " CGPA: "+s.getCgpa());
                    }

                }else if(opt == 2){
                    System.out.println("Enter Student Information");
                    String stu = scan.nextLine();
                    String[] data = stu.split(",");
                    if (data.length < 6){
                        System.out.println("Invalid input format");
                        return;
                    }
                    double cgpa;
                    try{
                        cgpa = Double.parseDouble(data[5]);
                    }catch(Exception e){
                        System.out.println("Invalid cgpa.");
                        return;
                    }
                    student s = new student(
                            data[0],
                            data[1],
                            data[2],
                            data[3],
                            data[4],
                            cgpa
                    );

                    controller.addStudent(s);
                }else if (opt == 3){
                    System.out.println("Enter student id to see students details");
                    String id = scan.nextLine();
                    student stu = controller.getStudentsById(id);
                    if(stu != null){
                        System.out.println("Id: "+stu.getId()+ " Name: "+stu.getName()+" Program: "+stu.getProgram()+" Batch: "+stu.getBatch()+" CGPA: "+stu.getCgpa());
                    }else{
                        System.out.println("No student found");
                    }
                }else if(opt == 4){
                    System.out.println("Give Student information to assign");
                    String stu = scan.nextLine();
                    String[] data = stu.split(",");
                    Advising advising = new Advising(
                            data[0],
                            data[1],
                            data[2],
                            Integer.parseInt(data[3])
                    );
                    courseController.advisingCourse(advising);

                }else if(opt == 5){
                    System.out.println("Enter Student id to see advised courses");
                    String id = scan.nextLine();
                    student stu = controller.getStudentsById(id);
                    String name = stu.getName();
                    List<String> courses = courseController.getCoursesById(id);
                    if(courses.isEmpty()){
                        System.out.println("This students don't have any assigned course");
                    }else{
                        System.out.println("Course Registered by "+ name);
                        for(String s: courses){
                            System.out.println(s);
                        }
                    }
                }else if (opt == 6){
                    System.out.println("The operations are closed. Login again. Thank you.");
                    break;

                }else{
                    System.out.println("Choose option from the list.");
                }
            }
        }




    }
}