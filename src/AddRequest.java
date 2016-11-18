public class AddRequest extends Request {
    private AddRequest() {}
    private AddRequest(String n,String t,int p){
        super(n,t,REQUEST_ADD);
    }
}

