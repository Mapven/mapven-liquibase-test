#!/bin/bash

locale-gen en_US en_US.UTF-8 es_ES es_ES.UTF-8
dpkg-reconfigure locales

apt-get -y update
apt-get -y upgrade

# Creates puppet modules folder
mkdir -p /etc/puppet/modules;

# Installs puppet required modules
puppet module install puppetlabs-mysql

