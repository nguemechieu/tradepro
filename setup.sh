#!/usr/bin/env bash

echo "Welcome to TradePro"
echo "--------------------------------"
echo "-Now Setting up TradePro"
echo "--------------------------------"
echo "In order to continue your installation please enter the following values:"
echo "#1 to execute tradepro on docker"
echo "#2 to execute to execute tradepro on your machine"
read -r -machine
if [ "$1" == "1" ]; then echo "Thanks for installing app on docker"
elif [ "$1" == "2" ]; then echo "Thanks for installing app on your machine"
 fi

echo "--------------------------------"
echo "Installation  complete! You can now use your application"