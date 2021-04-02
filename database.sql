CREATE DATABASE todo;
USE todo;


CREATE TABLE users (
  idusers int NOT NULL AUTO_INCREMENT,
  firstname varchar(45) NOT NULL,
  lastname varchar(45) NOT NULL,
  username varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  location varchar(45) NOT NULL,
  gender varchar(45) NOT NULL,
  PRIMARY KEY (`idusers`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE tasks (
  idtasks int NOT NULL,
  idusers int NOT NULL,
  task varchar(45) NOT NULL,
  datecreated datetime NOT NULL,
  description varchar(45) NOT NULL,
  PRIMARY KEY (`idtasks`),
  KEY `idusers_idx` (`idusers`),
  CONSTRAINT `idusers` FOREIGN KEY (`idusers`) REFERENCES `users` (`idusers`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
