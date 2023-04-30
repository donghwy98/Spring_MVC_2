package hello.typeconverter.type;
import lombok.EqualsAndHashCode;
import lombok.Getter;
@Getter
@EqualsAndHashCode
//"127.0.0.1:8080"
public class IpPort {
    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port ;
    }
}
