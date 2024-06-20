-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 20, 2024 at 03:48 PM
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
-- Table structure for table `tbl_cinema`
--

CREATE TABLE `tbl_cinema` (
  `c_id` int(20) NOT NULL,
  `c_name` varchar(50) NOT NULL,
  `c_seats` int(50) NOT NULL,
  `c_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_cinema`
--

INSERT INTO `tbl_cinema` (`c_id`, `c_name`, `c_seats`, `c_status`) VALUES
(2001, 'C1', 50, 'Active');

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
(18, 1007, 'LOGOUT', '2024-06-12 18:12:32', 'User logged out'),
(19, 1007, 'Logged In Successfully', '2024-06-20 20:03:15', 'Admin Login successfully'),
(20, 1007, 'Logged In Successfully', '2024-06-20 20:05:26', 'Admin Login successfully'),
(21, 1007, 'Logged In Successfully', '2024-06-20 21:02:17', 'Admin Login successfully'),
(22, 1007, 'Logged In Successfully', '2024-06-20 21:33:24', 'Admin Login successfully');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_movies`
--

CREATE TABLE `tbl_movies` (
  `m_id` int(11) NOT NULL,
  `title` varchar(50) NOT NULL,
  `r_year` int(11) NOT NULL,
  `genre` varchar(50) NOT NULL,
  `run_time` int(11) NOT NULL,
  `director` varchar(50) NOT NULL,
  `movie_status` varchar(50) NOT NULL,
  `tbl_cinema` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_movies`
--

INSERT INTO `tbl_movies` (`m_id`, `title`, `r_year`, `genre`, `run_time`, `director`, `movie_status`, `tbl_cinema`) VALUES
(3001, 'doctor strange', 2016, 'action', 160, 'audrey', 'Active', 2001);

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
(1002, 'christian', 'abendan', 'chan@gmail.com', 'chan', '123456789', 'ADMIN', 'Archived'),
(1003, 'vince', 'bacarisas', 'benz@gmail.com', 'benz', '123456789', 'Admin', 'Active'),
(1005, 'chan', 'chan', 'chan', 'chan2', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Active'),
(1006, 'jonna', 'canete', 'jonna@gmail.com', 'namie', 'd9e6762dd1c8eaf6d61b3c6192fc408d4d6d5f1176d0c29169', 'User', 'Active'),
(1007, 'johnbert', 'plameran', 'jb@gmail.com', 'jb', 'd9e6762dd1c8eaf6d61b3c6192fc408d4d6d5f1176d0c29169', 'Admin', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_cinema`
--
ALTER TABLE `tbl_cinema`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `tbl_movies`
--
ALTER TABLE `tbl_movies`
  ADD PRIMARY KEY (`m_id`),
  ADD KEY `fk_cinema` (`tbl_cinema`);

--
-- Indexes for table `tbl_u`
--
ALTER TABLE `tbl_u`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_cinema`
--
ALTER TABLE `tbl_cinema`
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2002;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `tbl_movies`
--
ALTER TABLE `tbl_movies`
  MODIFY `m_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3002;

--
-- AUTO_INCREMENT for table `tbl_u`
--
ALTER TABLE `tbl_u`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1008;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_movies`
--
ALTER TABLE `tbl_movies`
  ADD CONSTRAINT `fk_cinema` FOREIGN KEY (`tbl_cinema`) REFERENCES `tbl_cinema` (`c_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
