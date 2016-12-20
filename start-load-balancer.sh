#!/usr/bin/env bash

[ ! `which nginx` ] && echo "please install nginx - 'brew install nginx'" && exit 1

echo "starting nginx"
nginx -p support -c nginx.conf