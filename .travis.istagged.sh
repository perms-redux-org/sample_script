#!/usr/bin/env bash

`bash --version`

RC=-1
if [[ `git describe --exact-match HEAD` == v* ]]; then RC=0; else RC=1; fi

echo "check tag rc: $RC"

exit $RC

