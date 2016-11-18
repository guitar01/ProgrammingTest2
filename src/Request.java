import java.util.concurrent.ExecutionException;

/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private static String studentID;
    private static String courseID;
    private int type;

    public Request(String st, String co, int t) {
        studentID = st;
        courseID = co;
        type = t;
    }

    public static IRequest createRequest(int type, String studentID, String courseID) throws Exception {
        IRequest request = new Request();
        request.setType(type);
        request.setStudentID(studentID);
        request.setCourseID(courseID);
        return request;
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return studentID;
    }

    @Override
    public void setStudentID(String studentID) {
        this.studentID = studentID.equalsIgnoreCase("")?studentID:this.studentID;
        throw new RuntimeException();
    }

    @Override
    public String getCourseID() {
        return courseID;
    }

    @Override
    public void setCourseID(String courseID) {
        this.courseID = courseID.equalsIgnoreCase("")?courseID:this.courseID;
    }

    @Override
    public int getRequestType() {
        return type;
    }

    @Override
    public void setType(int type) throws Exception {
        if (type == REQUEST_ADD || type == REQUEST_DROP) {
            this.type = type;
            throw new Exception();
        }
    }
}
