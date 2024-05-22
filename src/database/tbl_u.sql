-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 22, 2024 at 08:50 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `jb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_u`
--

CREATE TABLE `tbl_u` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `user_emel` varchar(50) NOT NULL,
  `user_name` varchar(50) NOT NULL,
  `user_pass` varchar(50) NOT NULL,
  `account_type` varchar(50) NOT NULL,
  `u_staus` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_u`
--

INSERT INTO `tbl_u` (`u_id`, `u_fname`, `u_lname`, `user_emel`, `user_name`, `user_pass`, `account_type`, `u_staus`) VALUES
(1005, 'chan', 'chan', 'christian@gmail.com', 'chan2', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active'),
(1007, 'johnbert', 'plameran', 'johnbert@gmail.com', 'jeybe', 'd9e6762dd1c8eaf6d61b3c6192fc408d4d6d5f1176d0c29169', 'Admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_u`
--
ALTER TABLE `tbl_u`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_u`
--
ALTER TABLE `tbl_u`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1009;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
