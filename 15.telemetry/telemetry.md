Start Zipkin:
docker run -d -p 9411:9411 openzipkin/zipkin
docker run -d -p 9411:9411 -e COLLECTOR_OTLP_ENABLED=true openzipkin/zipkin