package srg.dvl.main.infrastructure.eventlogger;

import org.springframework.stereotype.Component;
import srg.dvl.main.domain.model.EventLogger;

@Component("consoleEventLogger")
public class ConsoleEventLogger implements EventLogger {

    private static final String CONSOLE = "[CONSOLE_EVENT_LOGGER] ";

    @Override
    public void logMessage(String message) {
        System.out.println(CONSOLE + message);
    }
}
