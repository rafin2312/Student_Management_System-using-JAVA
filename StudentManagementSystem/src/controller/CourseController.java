package controller;

import model.Advising;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CourseController {
    private static final String course_file = "src/files/courses.txt";

    public void advisingCourse(Advising advising){
        try(BufferedWriter br = new BufferedWriter(new FileWriter(course_file, true))){
            String data =advising.getStudentId()+","+ advising.getCourseId()+","+advising.getCourseTitle()+"," + advising.getCourseCredit();
            br.write(data);
            br.newLine();
            System.out.println("Course assign successfully");
        }catch(Exception e){
            System.out.println("Failed to add courses");
        }
    }
    public List<String> getCoursesById(String id){
        List<String> courses = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(course_file))){
            String line;
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                if(data.length < 4){
                    continue;
                }
                if (data[0].equals(id)){
                    courses.add(data[1]);
                }

            }

        }catch(Exception e){
            System.out.println("Failed to get courses by id" + e);
        }
        return courses;
    }
}
