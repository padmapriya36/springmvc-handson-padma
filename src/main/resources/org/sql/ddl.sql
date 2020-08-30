CREATE DATABASE IF NOT EXISTS spring_mvc;

USE spring_mvc;

DROP TABLE IF EXISTS `spring_mvc`.`users`;

CREATE TABLE `spring_mvc`.`users` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NULL,
  `age` INT NULL,
  PRIMARY KEY (`username`));

DROP TABLE IF EXISTS `spring_mvc`.`user_book_info`;

  CREATE TABLE `spring_mvc`.`user_book_info` (
  `username` VARCHAR(45) NOT NULL,
  `bookName` VARCHAR(45) NULL,
  `bookDescription` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`username`));