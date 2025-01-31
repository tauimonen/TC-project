CREATE DATABASE  IF NOT EXISTS `tcdatabase` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tcdatabase`;

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `user` VALUES
    (1, 'Ken', 'Client', 'example1user@email.com'),
    (2, 'Lisa', 'Client', 'example2user@email.com');

DROP TABLE IF EXISTS `exercise`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exercise` (
  `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
  `user_id` BIGINT(20) NOT NULL,
  `date` datetime(6) DEFAULT NULL,
  `duration` INT DEFAULT NULL,
  `description` VARCHAR(255) DEFAULT NULL,
  `is_done` BOOLEAN DEFAULT NULL,
  `exercise_type` varchar(45) DEFAULT NULL,
  `intensity_type` varchar(45) DEFAULT NULL,
  `distance` INT DEFAULT NULL,

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO `exercise` (`user_id`, `date`, `duration`, `description`, `is_done`, `exercise_type`, `distance`, `intensity_type`) VALUES
(1, '2023-01-15 08:30:00', 30, 'Morning jog', true, 'RUN', 5000, 'MODERATE'),
(2, '2023-02-02 18:45:00', 45, 'Evening workout', true, 'WEIGHT_TRAINING', 0, 'WORKOUT'),
(3, '2023-03-10 12:00:00', 30, 'Quick cardio', false, 'CYCLING', 10000, 'EASY'),
(4, '2023-04-25 09:00:00', 40, 'Intense interval training', true, 'RUN', 7000, 'WORKOUT'),
(5, '2023-05-08 16:15:00', 120, 'Long run', true, 'RUN', 12000, 'LONG');


UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

