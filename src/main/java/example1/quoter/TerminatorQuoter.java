package example1.quoter;

public class TerminatorQuoter implements Quoter {
    private String message;
    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat;  i++) {
            System.out.println("message = " + message);
        }
    }
}
