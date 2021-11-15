-- MySQL dump 10.13  Distrib 8.0.27, for Linux (x86_64)
--
-- Host: localhost    Database: cowin
-- ------------------------------------------------------
-- Server version	8.0.27-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `appointment`
--

DROP TABLE IF EXISTS `appointment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment` (
  `sr_no` int NOT NULL AUTO_INCREMENT,
  `vaccinee` varchar(13) NOT NULL,
  `appointment_date` date NOT NULL,
  `appointment_time` varchar(20) NOT NULL,
  `vaccinator` varchar(13) NOT NULL,
  PRIMARY KEY (`sr_no`),
  KEY `vaccinee` (`vaccinee`),
  KEY `vaccinator` (`vaccinator`),
  CONSTRAINT `appointment_ibfk_1` FOREIGN KEY (`vaccinee`) REFERENCES `users` (`aadhar_no`),
  CONSTRAINT `appointment_ibfk_2` FOREIGN KEY (`vaccinator`) REFERENCES `users` (`aadhar_no`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment`
--

LOCK TABLES `appointment` WRITE;
/*!40000 ALTER TABLE `appointment` DISABLE KEYS */;
/*!40000 ALTER TABLE `appointment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `appointment_schedule`
--

DROP TABLE IF EXISTS `appointment_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appointment_schedule` (
  `sr_no` int NOT NULL AUTO_INCREMENT,
  `vaccinator` varchar(13) NOT NULL,
  `avail_date` date NOT NULL,
  `avail_time` varchar(30) NOT NULL,
  PRIMARY KEY (`sr_no`),
  KEY `vaccinator` (`vaccinator`),
  CONSTRAINT `appointment_schedule_ibfk_1` FOREIGN KEY (`vaccinator`) REFERENCES `users` (`aadhar_no`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appointment_schedule`
--

LOCK TABLES `appointment_schedule` WRITE;
/*!40000 ALTER TABLE `appointment_schedule` DISABLE KEYS */;
INSERT INTO `appointment_schedule` VALUES (1,'123456789012','2021-11-15','09:00-12:00'),(2,'123456789012','2021-11-15','14:00-17:00'),(3,'123456789012','2021-11-16','14:00-17:00'),(4,'1234','2021-11-17','09:00-12:00');
/*!40000 ALTER TABLE `appointment_schedule` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `does_details`
--

DROP TABLE IF EXISTS `does_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `does_details` (
  `sr_no` int NOT NULL AUTO_INCREMENT,
  `vaccinee` varchar(13) NOT NULL,
  `vaccine_name` varchar(10) NOT NULL,
  `dose1` date DEFAULT NULL,
  `dose2` date DEFAULT NULL,
  PRIMARY KEY (`sr_no`),
  KEY `vaccinee` (`vaccinee`),
  KEY `vaccine_name` (`vaccine_name`),
  CONSTRAINT `does_details_ibfk_1` FOREIGN KEY (`vaccinee`) REFERENCES `users` (`aadhar_no`),
  CONSTRAINT `does_details_ibfk_2` FOREIGN KEY (`vaccinee`) REFERENCES `users` (`aadhar_no`),
  CONSTRAINT `does_details_ibfk_3` FOREIGN KEY (`vaccine_name`) REFERENCES `vaccines` (`vaccine_name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `does_details`
--

LOCK TABLES `does_details` WRITE;
/*!40000 ALTER TABLE `does_details` DISABLE KEYS */;
INSERT INTO `does_details` VALUES (3,'995407472038','COVAXIN','2021-11-15','2021-11-17'),(4,'4321','COVISHILD','2021-11-17','2021-11-17');
/*!40000 ALTER TABLE `does_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `sr_no` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `aadhar_no` varchar(12) NOT NULL,
  `dob` date NOT NULL,
  `user_type` varchar(20) NOT NULL,
  `mobile_no` varchar(13) NOT NULL,
  `user_status` varchar(15) NOT NULL DEFAULT 'NOT_VERIFIED',
  `password` varbinary(20) NOT NULL,
  PRIMARY KEY (`sr_no`),
  UNIQUE KEY `aadhar_no` (`aadhar_no`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Mahesh','Bhakare','Morvis','995407472038','2000-05-16','Vaccinee','9075710676','VERIFIED',_binary 'mahesh@123'),(2,'ADMIN','ADMIN','xxxxxxxx','ADMIN','1999-05-12','Admin','xxxxxxxxxx','VERIFIED',_binary 'ADMIN'),(4,'Yash','Deshpande','Rahuri','123456789012','2021-11-06','Vaccinator','9730123412','VERIFIED',_binary 'yash@100'),(5,'PRATIK','Borhade','Dhandarphal','1234','2000-11-24','Vaccinator','12345','VERIFIED',_binary '12345'),(7,'Saurabh','Satpute','Dhandarphal','4321','2016-11-12','Vaccinee','1234','VERIFIED',_binary '12345');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vaccines`
--

DROP TABLE IF EXISTS `vaccines`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vaccines` (
  `sr_no` int NOT NULL AUTO_INCREMENT,
  `vaccine_name` varchar(10) NOT NULL,
  `total_vaccines` int NOT NULL,
  `avail_vaccines` int NOT NULL,
  PRIMARY KEY (`sr_no`),
  UNIQUE KEY `vaccine_name` (`vaccine_name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vaccines`
--

LOCK TABLES `vaccines` WRITE;
/*!40000 ALTER TABLE `vaccines` DISABLE KEYS */;
INSERT INTO `vaccines` VALUES (1,'COVISHILD',10,3),(2,'COVAXIN',12,10),(3,'SPUTNIK-V',22,22);
/*!40000 ALTER TABLE `vaccines` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-15 22:08:48
