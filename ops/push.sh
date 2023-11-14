#!/bin/bash -e


DIR=$( cd "$( dirname "$0" )" && pwd )
BRH=$(git branch --show-current)
MSG="${1:-Autopush}"

echo $DIR
echo $BRH
echo $MSG

pushd $DIR/..
  git add .
  git commit -m "$MSG"
  git push origin $BRH
popd
