DROP DATABASE IF EXISTS TP_hibernate;
CREATE DATABASE TP_hibernate;

USE TP_hibernate;

CREATE TABLE T_Articles (
    IdArticle int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Desccrpt text NOT NULL,
    Brand text NOT NULL,
    UnitaryPrice        double      NOT NULL
);

