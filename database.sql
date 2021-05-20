CREATE DATABASE todo;
USE todo;

CREATE TABLE `todo`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `location` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`userid`));

