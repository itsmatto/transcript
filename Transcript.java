import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public class Transcript {

  String name;
  Integer age;
  Integer yog;
  Float gpa;
  HashMap<String, Float> courses;
  Integer studentid;

  public Transcript(
    String Name,
    Integer Age,
    Integer YearofGraduation,
    Float GPA,
    String Address,
    HashMap<String, Float> Courses,
    Integer StudentID
  ) {

    String name = Name;
    age = Age;
    yog = YearofGraduation;
    gpa = GPA;
    courses = Courses;
    studentid = StudentID;

  }

  public static void getCourses(HashMap<String, Float> Courses) {
    HashMap<String, Float> courses = Courses;

    for(String course : courses.keySet()) {
      System.out.println(course + ": " + courses.get(course));
    }

  }

  public static float averageGPA(HashMap<String, Float> Courses) {

    int x = 0;
    Float average = 0.0f;

    HashMap<String, Float> courses = Courses;

    for(String course : courses.keySet()) {

      average = average + courses.get(course);
      x++;

    }

    average = average / x;

    average = (float) Math.floor((double)average) + 1.0f;

    return average;

  }

  public static void main(String[] args) {

    HashMap<String, Float> courses = new HashMap<String, Float>();

    Transcript matt = new Transcript(
      "Matthew Ballou",
      16,
      2018,
      4.0f,
      "101 Fake Street",
      courses,
      1858067
    );

    courses.put("Programming II",       96.0f);
    courses.put("Chemistry",            98.0f);
    courses.put("U.S. History",         88.0f);
    courses.put("English Composition",  92.0f);
    courses.put("Pre-Calculus",         98.0f);
    courses.put("Spanish III",          91.0f);

    System.out.println(matt.name);
    //System.out.println(matt.age);
    //System.out.println(matt.yog);
    System.out.println(averageGPA(courses));
    //System.out.println(getCourses());
    //System.out.println(matt.studentid);

  }

}
