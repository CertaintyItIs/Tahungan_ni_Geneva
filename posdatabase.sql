-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 24, 2024 at 05:50 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `posdatabase`
--

-- --------------------------------------------------------

--
-- Table structure for table `currentactive`
--

CREATE TABLE `currentactive` (
  `ActiveUser` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `currentactive`
--

INSERT INTO `currentactive` (`ActiveUser`) VALUES
('RiRi');

-- --------------------------------------------------------

--
-- Table structure for table `producttable`
--

CREATE TABLE `producttable` (
  `ProductID` int(11) NOT NULL,
  `SellerID` int(11) NOT NULL,
  `Seller` varchar(50) NOT NULL,
  `Product` varchar(50) NOT NULL,
  `Type` varchar(50) NOT NULL,
  `Price` int(11) NOT NULL,
  `Stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `producttable`
--

INSERT INTO `producttable` (`ProductID`, `SellerID`, `Seller`, `Product`, `Type`, `Price`, `Stock`) VALUES
(11, 6, 'RiRi', 'alimango', 'crustacean', 80, 0),
(12, 6, 'RiRi', 'kasag', 'crustacean', 80, 3),
(13, 6, 'RiRi', 'Bangus', 'Fish', 180, 14),
(14, 6, 'RiRi', 'Galunggong', 'fish', 120, 68),
(15, 6, 'RiRi', 'Pasayan', 'Crustacean', 80, 14),
(16, 8, 'Luna', 'cagaykay', 'seafood', 200, 9),
(17, 8, 'Luna', 'litob', 'seafood', 1210, 10),
(18, 8, 'Luna', 'hipon', 'seafood', 480, 10),
(19, 8, 'Luna', 'greenshell', 'seafood', 100, 4),
(20, 6, 'RiRi', 'Hasa-hasa', 'Fish', 200, 100),
(21, 6, 'RiRi', 'Lato', 'seaweed', 80, 10),
(22, 7, 'Mariaaa', 'Alimango', 'seafood', 180, -4);

-- --------------------------------------------------------

--
-- Table structure for table `transactionlogtable`
--

CREATE TABLE `transactionlogtable` (
  `TransactionID` int(11) NOT NULL,
  `ProductID` int(11) NOT NULL,
  `SellerID` int(11) NOT NULL,
  `Seller` varchar(50) NOT NULL,
  `BuyerID` int(11) NOT NULL,
  `Buyer` varchar(50) NOT NULL,
  `Product` varchar(50) NOT NULL,
  `Price` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transactionlogtable`
--

INSERT INTO `transactionlogtable` (`TransactionID`, `ProductID`, `SellerID`, `Seller`, `BuyerID`, `Buyer`, `Product`, `Price`, `Quantity`, `Subtotal`) VALUES
(29, 11, 6, 'RiRi', 7, 'Mariaaa', 'RiRi', 80, 1, 80),
(29, 13, 6, 'RiRi', 7, 'Mariaaa', 'RiRi', 180, 1, 180),
(29, 15, 6, 'RiRi', 7, 'Mariaaa', 'RiRi', 80, 1, 80),
(30, 11, 6, 'RiRi', 8, 'Luna', 'RiRi', 80, 1, 80),
(30, 12, 6, 'RiRi', 8, 'Luna', 'RiRi', 80, 1, 80),
(30, 14, 6, 'RiRi', 8, 'Luna', 'RiRi', 120, 1, 120),
(31, 12, 6, 'RiRi', 6, 'RiRi', 'RiRi', 80, 1, 80),
(31, 16, 8, 'Luna', 6, 'RiRi', 'Luna', 200, 1, 200),
(31, 14, 6, 'RiRi', 6, 'RiRi', 'RiRi', 120, 1, 120),
(32, 15, 6, 'RiRi', 8, 'Luna', 'RiRi', 80, 25, 2000),
(32, 19, 8, 'Luna', 8, 'Luna', 'Luna', 100, 6, 600),
(33, 13, 6, 'RiRi', 8, 'Luna', 'RiRi', 180, 10, 1800),
(34, 11, 6, 'RiRi', 8, 'Luna', 'RiRi', 80, 2, 160);

-- --------------------------------------------------------

--
-- Table structure for table `transactiontable`
--

CREATE TABLE `transactiontable` (
  `TransactionID` int(11) NOT NULL,
  `BuyerID` int(11) NOT NULL,
  `Buyer` varchar(50) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transactiontable`
--

INSERT INTO `transactiontable` (`TransactionID`, `BuyerID`, `Buyer`, `Total`) VALUES
(29, 7, 'Mariaaa', 3),
(30, 8, 'Luna', 3),
(31, 6, 'RiRi', 3),
(32, 8, 'Luna', 31),
(33, 8, 'Luna', 10),
(34, 8, 'Luna', 2);

-- --------------------------------------------------------

--
-- Table structure for table `usertable`
--

CREATE TABLE `usertable` (
  `UserID` int(11) NOT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `First_Name` varchar(50) DEFAULT NULL,
  `Middle_Name` varchar(50) NOT NULL,
  `Last_Name` varchar(50) DEFAULT NULL,
  `Birthday` varchar(50) DEFAULT NULL,
  `Contact_Number` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usertable`
--

INSERT INTO `usertable` (`UserID`, `Username`, `Password`, `First_Name`, `Middle_Name`, `Last_Name`, `Birthday`, `Contact_Number`, `Email`, `Address`) VALUES
(3, 'Rhesa ', 'Rhesa', 'Roldan', '', 'A.', '06-20-2004', '09466534546', 'rhesaroldan@gmail.com', 'BALIJUAGAN'),
(4, 'Jona', 'official', 'Jonabelle', 'c', 'official', '04-02-2000', '096674555678', 'jonabellcasabonofficial', 'Sunshine village Roxas City'),
(5, 'isaac', 'isaac', 'Isaac Thomas', 'A', 'ungui', '08-14-2000', '09788634542', 'isaacthomasungui@gmail.com', 'Makinli Roxas City'),
(6, 'RiRi', 'RiRi', 'Rio Glen', 'b', 'Andrada', '06-02-2023', '09094648863', 'rioglenandra@gmail.com', 'Ivisan '),
(7, 'Rio', 'Mariaaa', 'Andrada', 'A.', 'andrada', '06-06-2006', '09455676869', 'rioandrada@gmail.com', 'Bato Panay Capiz'),
(8, 'Luna', 'Luna', 'Luna', 'D', 'Maeve', '06-05-2004', '09616364578', 'lunamaeve@gmail.com', 'Panay Capiz'),
(9, 'larisa', 'larisa', 'Larisa', 'A', 'prisilia', '06-05-2000', '09788909789', 'larisaprisilia@gmail.com', 'Bato Roxas Capiz'),
(10, 'lucinda', 'lusindsa', 'Lusinda', 'h', 'Maever', '08-11-2023', '09455695368', 'lusindamaever@gmail.com', 'Ivisan Roxas Capiz'),
(11, 'Mia', 'Mia', 'Maria Mia', 'M', 'Lorelei', '11-12-2009', '09344567890', 'mariamialorelei', 'Bato roxas capiz'),
(12, 'Mavi', 'Mavi', 'Mavii Clay', 'O', 'Mecaila', '12-11-2009', '09344678998', 'maviiclaymecaila@gmail.com', 'Pontevedra Capiz');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `producttable`
--
ALTER TABLE `producttable`
  ADD PRIMARY KEY (`ProductID`);

--
-- Indexes for table `transactionlogtable`
--
ALTER TABLE `transactionlogtable`
  ADD KEY `TransactionID` (`TransactionID`),
  ADD KEY `ProductID` (`ProductID`),
  ADD KEY `SellerID` (`SellerID`),
  ADD KEY `BuyerID` (`BuyerID`),
  ADD KEY `Seller` (`Seller`),
  ADD KEY `Buyer` (`Buyer`),
  ADD KEY `Product` (`Product`),
  ADD KEY `Price` (`Price`);

--
-- Indexes for table `transactiontable`
--
ALTER TABLE `transactiontable`
  ADD PRIMARY KEY (`TransactionID`),
  ADD KEY `transactiontable_ibfk_1` (`BuyerID`);

--
-- Indexes for table `usertable`
--
ALTER TABLE `usertable`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `producttable`
--
ALTER TABLE `producttable`
  MODIFY `ProductID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `transactiontable`
--
ALTER TABLE `transactiontable`
  MODIFY `TransactionID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;

--
-- AUTO_INCREMENT for table `usertable`
--
ALTER TABLE `usertable`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transactionlogtable`
--
ALTER TABLE `transactionlogtable`
  ADD CONSTRAINT `transactionlogtable_ibfk_1` FOREIGN KEY (`TransactionID`) REFERENCES `transactiontable` (`TransactionID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `transactionlogtable_ibfk_2` FOREIGN KEY (`BuyerID`) REFERENCES `usertable` (`UserID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `transactionlogtable_ibfk_3` FOREIGN KEY (`SellerID`) REFERENCES `usertable` (`UserID`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `transactionlogtable_ibfk_4` FOREIGN KEY (`ProductID`) REFERENCES `producttable` (`ProductID`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `transactiontable`
--
ALTER TABLE `transactiontable`
  ADD CONSTRAINT `transactiontable_ibfk_1` FOREIGN KEY (`BuyerID`) REFERENCES `usertable` (`UserID`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
