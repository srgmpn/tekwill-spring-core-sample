package srg.dvl.main.infrastructure.eventlogger;

import org.springframework.stereotype.Component;
import srg.dvl.main.domain.model.EventLogger;

@Component("fileEventLogger")
public class FileEventLogger implements EventLogger {

    private static final String FILE = "[FILE_EVENT_LOGGER] ";

    @Override
    public void logMessage(String message) {
        System.out.println(FILE + message);
    }
}
