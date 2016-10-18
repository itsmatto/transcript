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
  HashMap<String, List<String>> Courses,
  Integer StudentID) {

    String name = Name;
    Integer age = Age;
    Integer yog = YearofGraduation;
    Float gpa = GPA;
    HashMap<String, List<String>> courses = Courses;
    Integer studentid = StudentID;

  }

  public static void main(String[] args) {

    HashMap<String, List<String>> courses = new HashMap<String, List<String>>();
    List<String> values = new ArrayList<String>();

    Transcript matthew = new Transcript(
    "Matthew Ballou",
    16,
    2018,
    4.0f,
    "101 Fake Street",
    courses,
    1858067
    );


  }

}
