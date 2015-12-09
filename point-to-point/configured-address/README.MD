# Configured address
Shows how to let feign use a service name instead of an hardcoded address

## what happens?
The service consumer has a client interface which looks like this:
```
@FeignClient("myService")
interface Client {

}
```
The feign client accepts a service ID. That service ID must be resolved to the real address.

In resources\application.properties you find:
```
myService.ribbon.listOfServers: localhost:9000
```
which shows the use of Ribbon by Feign where a list of hosts (1 in this example) is configured.