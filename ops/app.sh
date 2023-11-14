#!/bin/bash -e

#ENV=dev ./ops/app.sh [] [build] [run]

echo ==============current env==========
echo $SPRING_PROFILES_ACTIVE
echo ===================================

DIR=$( cd "$( dirname "$0" )" && pwd )
export ACT=$1
pushd $DIR/..
  if [ "${ACT}" == 'build' ] ; then
    mvn package
  else
    mvn clean spring-boot:run
  fi
popd

