#!/usr/bin/env bash

cd /Users/dongpo.li/IdeaProjects_workspace/green-house-metrics && ./gradlew build -x test

scp /Users/dongpo.li/IdeaProjects_workspace/green-house-metrics/build/libs/green-house-metrics-1.0.0.jar dongpo.li@39.105.88.127:/home/dongpo.li/green-house-metrics/

