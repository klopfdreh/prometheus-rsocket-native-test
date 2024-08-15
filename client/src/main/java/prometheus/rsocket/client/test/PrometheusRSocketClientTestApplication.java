package prometheus.rsocket.client.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PrometheusRSocketClientTestApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PrometheusRSocketClientTestApplication.class).run(args);
    }
}
