# Prometheus RSocket Test

1. Install Docker Desktop
2. (Build) Run `mvn verify` of the root project
3. (Prometheus RSocket Server) Start the server: `prometheus.rsocket.server.test.PrometheusRSocketServerTestApplication`
4. (Prometheus RSocket Client Native Image) `cd client`
5. (Prometheus RSocket Client Native Image) run command `docker build -t testimg .`
6. (Prometheus RSocket Client Native Image) run command `docker images` to find the image id
7. (Prometheus RSocket Client Native Image) run command `docker run --rm -e DOCKER_HOST=host.docker.internal <image_id>` to run the actual image
8. Access `http://localhost:8080/metrics/connected` on the host and you should see metrics with `main_application_class=prometheus.rsocket.client.test.PrometheusRSocketClientTestApplication`