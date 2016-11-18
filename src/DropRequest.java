public class DropRequest extends Request {
    private DropRequest() {}
    private DropRequest(String a,String b,int c) {
        super(a,b,REQUEST_DROP);
    }
}
