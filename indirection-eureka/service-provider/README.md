# What happened to the service provider
the Server class has a new annotation: @EnableDiscoveryClient which will try to register the service in Eureka

## configuration
```
# this is the name we'll see in the service registry
spring.application.name: myService

#without this, errors occur and health returns DOWN.
spring.cloud.config.enabled=false

eureka.password: password
eureka.client.serviceUrl.defaultZone: http://user:${eureka.password}@localhost:8761/eureka/
eureka.instance.leaseRenewalIntervalInSeconds: 10
eureka.instance.metadataMap.instanceId: ${vcap.application.instance_id:${spring.application.name}:${spring.application.instance_id:${server.port}}}
``` 

## Dependencies
```
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-commons</artifactId>
   <version>1.0.0.RELEASE</version>
</dependency>
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-eureka</artifactId>
   <version>1.0.0.RELEASE</version>
</dependency>
```
