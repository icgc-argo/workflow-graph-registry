package workflow.graph.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.schema.registry.EnableSchemaRegistryServer;

@SpringBootApplication
@EnableSchemaRegistryServer
public class WorkflowGraphRegistryApplication {

  public static void main(String... args) {
    SpringApplication.run(WorkflowGraphRegistryApplication.class, args);
  }
}
