-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2024 at 06:24 AM
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
-- Table structure for table `tbl_logs`
--

CREATE TABLE `tbl_logs` (
  `log_id` int(20) NOT NULL,
  `u_id` int(20) NOT NULL,
  `log_event` varchar(200) NOT NULL,
  `log_timestamp` datetime NOT NULL,
  `log_descript` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_logs`
--

INSERT INTO `tbl_logs` (`log_id`, `u_id`, `log_event`, `log_timestamp`, `log_descript`) VALUES
(3, 1007, 'Logged In Successfully', '2024-06-12 17:03:15', 'Admin Login successfully'),
(4, 1007, 'Logged In Successfully', '2024-06-12 17:05:01', 'Admin Login successfully'),
(5, 1006, 'Logged In Successfully', '2024-06-12 17:27:53', 'User Login successfully'),
(6, 1007, 'Logged In Successfully', '2024-06-12 17:30:51', 'Admin Login successfully'),
(7, 1007, 'Logged In Successfully', '2024-06-12 17:50:23', 'Admin Login successfully'),
(8, 1007, 'Logged In Successfully', '2024-06-12 17:50:59', 'Admin Login successfully'),
(9, 1007, 'LOGIN_FAILED', '2024-06-12 17:57:27', 'User login attempt failed'),
(10, 1007, 'LOGIN_FAILED', '2024-06-12 17:57:47', 'User login attempt failed'),
(11, 1007, 'LOGIN_FAILED', '2024-06-12 17:57:54', 'User login attempt failed'),
(12, 1007, 'LOGIN_FAILED', '2024-06-12 17:58:02', 'User login attempt failed'),
(13, 1007, 'Logged In Successfully', '2024-06-12 17:59:16', 'Admin Login successfully'),
(14, 1007, 'Logged In Successfully', '2024-06-12 18:06:24', 'Admin Login successfully'),
(15, 1007, 'Logged In Successfully', '2024-06-12 18:10:01', 'Admin Login successfully'),
(16, 1007, 'Logged In Successfully', '2024-06-12 18:11:20', 'Admin Login successfully'),
(17, 1007, 'Logged In Successfully', '2024-06-12 18:12:29', 'Admin Login successfully'),
(18, 1007, 'LOGOUT', '2024-06-12 18:12:32', 'User logged out');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
