import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;

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

    name = Name;
    age = Age;
    yog = YearofGraduation;
    gpa = GPA;
    courses = Courses;
    studentid = StudentID;

  }

  public static float averageGPA(HashMap<String, Float> Courses) {

    int x = 0;
    Float average = 0.0f;

    HashMap<String, Float> courses = Courses;

    for(String course : courses.keySet()) {

      average = (average + (float)courses.get(course));
      x++;

    }

    average = average / x;
    average = average / 25;

    return average;

  }

  public static void makeTranscript(HashMap<String, Float> Courses, Transcript Student) throws FileNotFoundException {

    PrintWriter writer = new PrintWriter(new File("transcript.csv"));
    StringBuilder sb = new StringBuilder();

    HashMap<String, Float> courses = Courses;
    Transcript student = Student;

    sb.append("Name");
    sb.append(',');
    sb.append("Age");
    sb.append(',');
    sb.append("Year of Graduation");
    sb.append(',');
    sb.append("GPA");
    sb.append(',');
    sb.append("Student ID");
    sb.append('\n');

    sb.append(student.name);
    sb.append(',');
    sb.append(student.age);
    sb.append(',');
    sb.append(student.yog);
    sb.append(',');
    sb.append(averageGPA(student.courses));
    sb.append(',');
    sb.append(student.studentid);
    sb.append('\n');

    for(String course : student.courses.keySet()) {
      sb.append(course);
      sb.append(",");
      sb.append(student.courses.get(course));
      sb.append('\n');
    }

    writer.write(sb.toString());
    writer.close();

  }

  public static void main(String[] args) {

    HashMap<String, Float> courses = new HashMap<String, Float>();

    Transcript matt = new Transcript(
      "Matthew Ballou",
      16,
      2018,
      averageGPA(courses),
      "101 Fake Street",
      courses,
      1858067
    );

    courses.put("Programming II",       96.0f);
    courses.put("Chemistry",            98.0f);
    courses.put("U.S. History",         92.0f);
    courses.put("English Composition",  92.0f);
    courses.put("Pre-Calculus",         98.0f);
    courses.put("Spanish III",          91.0f);

    System.out.println(matt.name);
    System.out.println(matt.age);
    System.out.println(matt.yog);
    System.out.println(averageGPA(courses));
    System.out.println(matt.studentid);

    for(String course : courses.keySet()) {
      System.out.println(course + ": " + courses.get(course));
    }

    try {
      makeTranscript(courses, matt);
      System.out.println("Transcript successfully made in this directory.");
    }
    catch (Exception e) {
      System.out.println("Transcript has not been made or updated. See the error below.");
      System.out.println(e);
    }

  }

}
