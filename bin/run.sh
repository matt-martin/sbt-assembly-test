#!/bin/bash

DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
java -classpath "${DIR}/hello-assembly-1.0.jar:${DIR}/hello-assembly-1.0-deps.jar" com.example.Hi
