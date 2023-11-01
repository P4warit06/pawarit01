public class Student {
    private static int nextId = 0;
    private final int id;
    private String fname;
    private String lname;

    public Student(String fname, String lname) {
        this.fname = checkName(fname);
        this.lname = checkName(lname);
        this.id = nextId++;
    }

    private static String checkName(String name) {
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Firstname and Lastname cannot be null or blank.");
        return name;
    }

    public int getId() {
        return this.id;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = checkName(fname);
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = checkName(lname);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", fname='" + getFname() + "'" +
                ", lname='" + getLname() + "'" +
                "}";
    }
}
