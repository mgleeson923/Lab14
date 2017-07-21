/**
 * Created by michaelgleeson on 7/20/17.
 */
public class Singleton {
    public static void main(String[] args) {
        ProgramConfiguration test = ProgramConfiguration.getInstance();
        test.setConnectionLimit(100);
        test.setPortNumber(2);
        test.setTimeout(11000);
        test.setUrl("http://www.linkedin.com");
        System.out.println(test.getUrl());


        ProgramConfiguration test2 = ProgramConfiguration.getInstance();
        System.out.println(test2.getUrl());
    }
}
