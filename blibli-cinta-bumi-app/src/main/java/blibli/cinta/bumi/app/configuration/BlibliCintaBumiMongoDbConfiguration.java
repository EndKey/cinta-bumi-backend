package blibli.cinta.bumi.app.configuration;

import blibli.cinta.bumi.app.configuration.properties.MongoDbProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "blibli.cinta.bumi.app.repository",
    mongoTemplateRef = "BlibliCintaBumiMongoTemplate")
@ConfigurationProperties(prefix = "bliblicintabumi")
public class BlibliCintaBumiMongoDbConfiguration extends MongoDbConfiguration {

  public BlibliCintaBumiMongoDbConfiguration(MongoDbProperties mongoDbProperties) {
    super(mongoDbProperties);
  }

  @Override
  @Bean(name = "BlibliCintaBumiMongoTemplate")
  public MongoTemplate mongoTemplate() throws Exception {
    return new MongoTemplate(mongoClient(), mongoProperties.getDatabase());
  }
}
