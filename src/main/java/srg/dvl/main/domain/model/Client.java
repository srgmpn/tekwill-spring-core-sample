package srg.dvl.main.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {

    private int id;
    private String name;
    private EventLogger eventLogger;

    @Autowired
    public Client(int id, String name, EventLogger eventLogger) {
        this.id = id;
        this.name = name;
        this.eventLogger = eventLogger;
    }

    public void logMessage() {
        eventLogger.logMessage("User with -> " + id + ":" + name);
    }
}
