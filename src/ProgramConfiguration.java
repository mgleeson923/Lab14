/**
 * Created by michaelgleeson on 7/20/17.
 */
public class ProgramConfiguration {
    int connectionLimit;
    int portNumber;
    String url;
    int timeout;

    private static ProgramConfiguration instance = null;

    private ProgramConfiguration(){

    }

    public static ProgramConfiguration getInstance(){
        if(instance == null){
            instance = new ProgramConfiguration();
        }
        return instance;
    }

    public int getConnectionLimit() {
        return connectionLimit;
    }

    public void setConnectionLimit(int connectionLimit) {
        this.connectionLimit = connectionLimit;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
