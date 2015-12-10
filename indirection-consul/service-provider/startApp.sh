#!/bin/sh
let $# || { echo No arugments supplied please supply hostname and port!; exit 1; }  # Exit if no arguments!
#((!$1 || !$2)) && echo No arugments supplied please supply hostname and port! && exit 1
host=$1
port=$2
docker run -it -d -P service-provider java -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.cloud.consul.discovery.hostname=$host --server.port=$port