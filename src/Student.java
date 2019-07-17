public class Student {
    private int rno;
    private String name;
    private String branch;
    private int sem;

    public Student() {
    }

    
    
    public Student(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }

    
    
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
    
    
}
