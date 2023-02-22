#!/usr/bin/env bash

cd /Users/dongpo.li/IdeaProjects_workspace/house-metrics && ./gradlew build -x test

scp /Users/dongpo.li/IdeaProjects_workspace/house-metrics/build/libs/house-metrics-1.0.0.jar dongpo.li@39.105.88.127:/home/dongpo.li/house-metrics/

