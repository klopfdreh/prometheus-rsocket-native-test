package prometheus.rsocket.server.test;

import io.micrometer.prometheus.rsocket.autoconfigure.EnablePrometheusRSocketProxyServer;
import io.micrometer.prometheus.rsocket.autoconfigure.PrometheusRSocketClientAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = PrometheusRSocketClientAutoConfiguration.class)
@EnablePrometheusRSocketProxyServer
public class PrometheusRSocketServerTestApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(PrometheusRSocketServerTestApplication.class).run(args);
    }
}
