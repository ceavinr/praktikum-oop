public interface Student {
    public long getStudentID();
    public double getOverallGPA();
    public double getGrade();
    public String getMajor();
    public boolean applyMajor(String applymajor);
    public void applyScholarship(String applyscholarship);
    public void promoteGrade(double promotegrade);
    public void payTuition(boolean tuitionBool, String tuitionString);
}