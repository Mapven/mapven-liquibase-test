# Mapven Liquibase test

This is an educational purpose project. My objective is to learn how to integrate Liquibase with Maven and Vagrant. This could be important in next project phases.

## Technologies
* Maven
* Liquibase
* Hibernate
* Vagrant
* Puppet

## Profiles
* **develop**: with test data
* **production**: with an empty dataset

## Build instructions
```sh
mvn clean package -P develop
```

```sh
mvn clean package -P production
```
