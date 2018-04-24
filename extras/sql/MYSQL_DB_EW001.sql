
CREATE DATABASE EW001;

CREATE TABLE `APPLIANT` (
 `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 `FIRSTNAME` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `LASTNAME` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `BIRTHDATE` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `CREATIONDATE` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `CREATIONDATEGMT` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `CREATIONCONTENT` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
 `SEXE` text COLLATE utf8mb4_unicode_ci NOT NULL,
 `JOB` text COLLATE utf8mb4_unicode_ci NOT NULL,
 `APPLIANTSTATUS` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'publish',
 `ADDRESS` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `CITY` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `COUNTRY` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `CELLPHONE` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `PHONE` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `POSTCODE` text COLLATE utf8mb4_unicode_ci NOT NULL,
 `EMAIL` text COLLATE utf8mb4_unicode_ci NOT NULL,
 PRIMARY KEY (`ID`));
 
 CREATE TABLE `APPLICATION` (
 `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 `APPLICATIONNOTE` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `CREATIONDATE` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `CREATIONDATEGMT` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `APPLICATIONDATE` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `APPLICATIONDATEGMT` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `CONTENT` longtext COLLATE utf8mb4_unicode_ci NOT NULL,
 `AMOUNT` text COLLATE utf8mb4_unicode_ci NOT NULL,
 `STATUS` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'publish',
 `ADDRESS` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `CITY` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `COUNTRY` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `APPLICATIONTYPE` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `METHODE` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `DEVICE` text COLLATE utf8mb4_unicode_ci NOT NULL,
 PRIMARY KEY (`ID`));
 
  CREATE TABLE `CREDIT` (
 `ID` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 `ALLOCATIONDATE` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `ALLOCATIONDATEGMT` datetime NOT NULL DEFAULT '1000-01-01 00:00:00',
 `APPLICATIONAMOUNT` text COLLATE utf8mb4_unicode_ci NOT NULL,
 `CREDITAMOUNT` text COLLATE utf8mb4_unicode_ci NOT NULL,
 `STATUS` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT 'publish',
 `ALLOCATIONMANAGER` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `ALLOCATIONCONDITION` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `ALLOCATIONNOTE` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `ALLOCATIONTYPE` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `METHODE` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `ALLOCATIONWARNING` text COLLATE utf8mb4_unicode_ci NOT NULL,
 PRIMARY KEY (`ID`));
 
  CREATE TABLE `ADMINISTRATEURS` (
 `ID` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `PRENOM` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `NOM` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `DESCRIPTION` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 PRIMARY KEY (`ID`));
 
  CREATE TABLE `CLIENTS` (
 `ID` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `PRENOM` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `NOM` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `DESCRIPTION` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 PRIMARY KEY (`ID`));
 
 CREATE TABLE `PROFILS` (
 `ID` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `PRENOM` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `NOM` varchar(120) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 `DESCRIPTION` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '',
 PRIMARY KEY (`ID`),
 FOREIGN KEY (ID) REFERENCES ADMINISTRATEURS(ID));
