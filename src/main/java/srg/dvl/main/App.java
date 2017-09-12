package srg.dvl.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import srg.dvl.main.domain.model.Client;
import srg.dvl.main.infrastructure.configuration.SpringConfig;

public class App {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        EventLogger eventLogger = new ConsoleEventLogger();
//        Client client = new Client(1, "Sergiu", eventLogger);
        Client client = (Client) context.getBean("client");
        client.logMessage();
        context.close();
    }
}
