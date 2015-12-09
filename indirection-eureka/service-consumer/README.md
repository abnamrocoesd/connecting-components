# What happened to the service consumer
The client initializer is updated with this annotation: @EnableEurekaClient so our consumer can use Eureka

Most of the changes are in the configuration. the ribbon property is removed and the following have been added:
```
eureka.password: password
eureka.client.serviceUrl.defaultZone: http://user:${eureka.password}@localhost:8761/eureka/
eureka.instance.leaseRenewalIntervalInSeconds: 10
eureka.instance.metadataMap.instanceId: ${vcap.application.instance_id:${spring.application.name}:${spring.application.instance_id:${server.port}}}
```
