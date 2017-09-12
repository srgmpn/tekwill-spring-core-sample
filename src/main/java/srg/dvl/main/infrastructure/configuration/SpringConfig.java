package srg.dvl.main.infrastructure.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import srg.dvl.main.domain.model.Client;

@Configuration
@ComponentScan("srg.dvl.main")
public class SpringConfig {

    @Bean(name = "client")
    public Client client() {
        return new Client(1, "Sergiu");
    }
}
