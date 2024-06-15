-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2024 at 07:22 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `librarymanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `booktable`
--

CREATE TABLE `booktable` (
  `Bookid` varchar(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  `author` varchar(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  `availability` varchar(50) NOT NULL,
  `borroweddate` date NOT NULL,
  `returndate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booktable`
--

INSERT INTO `booktable` (`Bookid`, `name`, `author`, `category`, `availability`, `borroweddate`, `returndate`) VALUES
('1', 'Heensaraya', 'KumaraMunidasa', 'Novel', 'Yes', '2024-05-06', '2024-05-10'),
('2', 'ThunAwurudda', 'AnthoneyMenomi', 'ShortStory', 'No', '2024-06-05', '2024-06-15'),
('3', 'The Ceo', 'AnukWeerasinghe', 'Magazine', 'Yes', '2024-07-10', '2024-07-20'),
('4', 'IronFlame', 'RebeccaYarros', 'Fantacy', 'No', '2024-09-15', '2024-09-18'),
('5', 'TwistedMinds', 'KetaKendric', 'Romance', 'Yes', '2024-10-13', '2024-10-23'),
('6', 'ChosenSprits', 'SamithBasu', 'Fictions', 'No', '2024-11-16', '2024-11-22');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `uname` varchar(10) NOT NULL,
  `password` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`uname`, `password`) VALUES
('oshan', '123');

-- --------------------------------------------------------

--
-- Table structure for table `usertable`
--

CREATE TABLE `usertable` (
  `userid` int(50) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usertable`
--

INSERT INTO `usertable` (`userid`, `firstname`, `lastname`, `username`, `email`, `password`) VALUES
(6, 'rrrrr', 'trrrrrrr', 'rrrrrrr', 'rrrrrrr', 'rrrrrrr'),
(19, '', '', '', '', ''),
(22, 'oshan', 'viduranga', 'admin', 'oviduranga@88@gmail.com', ''),
(23, 'kusara', 'tamashi', 'admincampus', 'kusaratamashi15@gmail.com', ''),
(25, 'kavindu', 'sahan', 'horizoncampus', 'kavindu23@gmail.com', '2344'),
(26, '', '', '', '', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booktable`
--
ALTER TABLE `booktable`
  ADD PRIMARY KEY (`Bookid`);

--
-- Indexes for table `usertable`
--
ALTER TABLE `usertable`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `usertable`
--
ALTER TABLE `usertable`
  MODIFY `userid` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
