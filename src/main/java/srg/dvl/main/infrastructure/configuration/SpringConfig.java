package srg.dvl.main.infrastructure.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import srg.dvl.main.domain.model.Client;
import srg.dvl.main.domain.model.EventLogger;

@Configuration
@ComponentScan("srg.dvl.main")
public class SpringConfig {

    @Autowired
    @Qualifier("fileEventLogger")
    private EventLogger fileEventLogger;

    @Autowired
    @Qualifier("consoleEventLogger")
    private EventLogger consoleEventLogger;

    @Bean(name = "clientSergiu")
    public Client clientSergiu() {
        return new Client(1, "Sergiu", fileEventLogger);
    }

    @Bean(name = "clientJohn")
    public Client clientJohn() {
        return new Client(2, "John", consoleEventLogger);
    }
}
