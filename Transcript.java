import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Transcript {

  public Transcript(String Name,
  Integer Age,
  Integer YearofGraduation,
  Float GPA,
  String Address,
  HashMap<String, Float> Courses,
  Integer StudentID) {

    String name = Name;
    Integer age = Age;
    Integer yog = YearofGraduation;
    Float gpa = GPA;
    HashMap<String, Float> courses = Courses;
    Integer studentid = StudentID;

  }

  public float averageGPA(HashMap<String, Float> Courses) {

    int x = 0;
    Float average = 0.0f;

    HashMap<String, Float> courses = Courses;

    for(String course : courses.keySet()) {

      average = average + courses.get(course);
      x++;

    }

    average = average / x;

    return average;

  }

  public static void main(String[] args) {

    HashMap<String, Float> courses = new HashMap<String, Float>();

    Transcript matthew = new Transcript(
    "Matthew Ballou",
    16,
    2018,
    4.0f, //eventually this will be changed to read the courses of the student
    "101 Fake Street",
    courses,
    1858067
    );


  }

}
