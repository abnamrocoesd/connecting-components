#!/bin/sh
echo "start consul in docker container and expose ports"
docker run -p 8400:8400 -p 8500:8500 -p 8600:53/udp --name progriumConsul -h node1 -d progrium/consul -server -bootstrap