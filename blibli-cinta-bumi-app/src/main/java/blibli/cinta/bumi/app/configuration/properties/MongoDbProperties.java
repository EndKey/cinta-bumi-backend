package blibli.cinta.bumi.app.configuration.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mongodb")
public class MongoDbProperties {
  private int connectionPerHost;
  private int maxWaitTime;
  private int socketTimeout;
  private String writeConcern;
  private int heartbeatFrequency;
  private int maxConnectionIdleTime;
  private int maxConnectionLifeTime;
  private int minConnectionsPerHost;
  private int minHeartbeatFrequency;
  private String readPreference;

  public synchronized int getConnectionPerHost() {
    return connectionPerHost;
  }

  public synchronized void setConnectionPerHost(int connectionPerHost) {
    this.connectionPerHost = connectionPerHost;
  }

  public synchronized int getMaxWaitTime() {
    return maxWaitTime;
  }

  public synchronized void setMaxWaitTime(int maxWaitTime) {
    this.maxWaitTime = maxWaitTime;
  }

  public synchronized int getSocketTimeout() {
    return socketTimeout;
  }

  public synchronized void setSocketTimeout(int socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public synchronized String getWriteConcern() {
    return writeConcern;
  }

  public synchronized void setWriteConcern(String writeConcern) {
    this.writeConcern = writeConcern;
  }

  public synchronized int getHeartbeatFrequency() {
    return heartbeatFrequency;
  }

  public synchronized void setHeartbeatFrequency(int heartbeatFrequency) {
    this.heartbeatFrequency = heartbeatFrequency;
  }

  public synchronized int getMaxConnectionIdleTime() {
    return maxConnectionIdleTime;
  }

  public synchronized void setMaxConnectionIdleTime(int maxConnectionIdleTime) {
    this.maxConnectionIdleTime = maxConnectionIdleTime;
  }

  public synchronized int getMaxConnectionLifeTime() {
    return maxConnectionLifeTime;
  }

  public synchronized void setMaxConnectionLifeTime(int maxConnectionLifeTime) {
    this.maxConnectionLifeTime = maxConnectionLifeTime;
  }

  public synchronized int getMinConnectionsPerHost() {
    return minConnectionsPerHost;
  }

  public synchronized void setMinConnectionsPerHost(int minConnectionsPerHost) {
    this.minConnectionsPerHost = minConnectionsPerHost;
  }

  public synchronized int getMinHeartbeatFrequency() {
    return minHeartbeatFrequency;
  }

  public synchronized void setMinHeartbeatFrequency(int minHeartbeatFrequency) {
    this.minHeartbeatFrequency = minHeartbeatFrequency;
  }

  public synchronized String getReadPreference() {
    return readPreference;
  }

  public synchronized void setReadPreference(String readPreference) {
    this.readPreference = readPreference;
  }
}
