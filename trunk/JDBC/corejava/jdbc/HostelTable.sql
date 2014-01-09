/*
SQLyog Community Edition- MySQL GUI v6.07
Host - 5.6.11 : Database - hostellatestgeetha
*********************************************************************
Server version : 5.6.11
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `hostellatestgeetha`;

USE `hostellatestgeetha`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `hostel` */

DROP TABLE IF EXISTS `hostel`;

CREATE TABLE `hostel` (
  `hostel_id` int(11) NOT NULL AUTO_INCREMENT,
  `hostel_name` varchar(45) DEFAULT NULL,
  `hostel_street` varchar(30) NOT NULL,
  `hostel_city` varchar(20) DEFAULT NULL,
  `hostel_state` varchar(20) DEFAULT NULL,
  `hostel_postal_code` int(20) DEFAULT NULL,
  `hostel_country` varchar(45) DEFAULT NULL,
  `hostel_phone` varchar(20) DEFAULT NULL,
  `hostel_email` varchar(40) DEFAULT NULL,
  `hostel_facebook` varchar(40) DEFAULT NULL,
  `hostel_web` varchar(30) DEFAULT NULL,
  `hostel_checkIn_time` varchar(11) DEFAULT NULL,
  `hostel_checkOut_time` varchar(11) DEFAULT NULL,
  `smoking` varchar(4) DEFAULT NULL,
  `alcohol` varchar(4) DEFAULT NULL,
  `cancellation_hours_limit` int(11) DEFAULT NULL,
  `cancellation_fee_percant` int(11) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  PRIMARY KEY (`hostel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
