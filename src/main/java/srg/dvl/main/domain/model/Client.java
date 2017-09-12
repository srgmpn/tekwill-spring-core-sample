package srg.dvl.main.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {

    private int id;
    private String name;

    @Autowired
    @Qualifier("fileEventLogger")
    private EventLogger eventLogger;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void logMessage() {
        eventLogger.logMessage("User with -> " + id + ":" + name);
    }
}
