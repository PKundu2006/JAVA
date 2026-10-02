package cse26.oop.sms;

public class Course {
    private String code;
    private String title;
    private String creditHour;
    private String type;
    private String prerequisite;

    public Course(String code, String title, String creditHour, String type, String prerequisite) {
        this.code = code;
        this.title = title;
        this.creditHour = creditHour;
        this.type = type;
        this.prerequisite = prerequisite;
    }
}
