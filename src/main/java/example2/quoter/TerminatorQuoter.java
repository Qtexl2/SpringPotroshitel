package example2.quoter;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {
    private String message;

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    @PostConstruct
    public void sayQuote() {
        for (int i = 0; i < repeat;  i++) {
            System.out.println("message = " + message);
        }
    }
}
