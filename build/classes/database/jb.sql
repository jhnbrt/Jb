-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 03:30 AM
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
(1, 'C1', 50, 'Active'),
(2, 'C2', 50, 'Active'),
(3, 'C3', 50, 'Active'),
(4, 'C4', 50, 'Active');

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
(22, 1007, 'Logged In Successfully', '2024-06-20 21:33:24', 'Admin Login successfully'),
(23, 1007, 'Logged In Successfully', '2024-06-21 17:05:56', 'Admin Login successfully'),
(24, 1007, 'Logged In Successfully', '2024-06-21 17:06:27', 'Admin Login successfully'),
(25, 1006, 'Logged In Successfully', '2024-06-21 17:06:53', 'User Login successfully'),
(26, 1007, 'Logged In Successfully', '2024-06-21 17:09:36', 'Admin Login successfully'),
(27, 1007, 'Logged In Successfully', '2024-06-21 17:14:52', 'Admin Login successfully'),
(28, 1007, 'Logged In Successfully', '2024-06-21 17:35:51', 'Admin Login successfully'),
(29, 1007, 'Logged In Successfully', '2024-06-21 17:43:21', 'Admin Login successfully'),
(30, 1007, 'Logged In Successfully', '2024-06-21 17:49:46', 'Admin Login successfully'),
(31, 1007, 'Logged In Successfully', '2024-06-21 17:50:36', 'Admin Login successfully'),
(32, 1007, 'Logged In Successfully', '2024-06-21 17:55:25', 'Admin Login successfully'),
(33, 1007, 'Logged In Successfully', '2024-06-21 18:01:49', 'Admin Login successfully'),
(34, 1007, 'Logged In Successfully', '2024-06-21 18:04:31', 'Admin Login successfully'),
(35, 1007, 'Logged In Successfully', '2024-06-21 18:06:26', 'Admin Login successfully'),
(36, 1007, 'LOGIN_FAILED', '2024-06-21 18:07:17', 'User login attempt failed'),
(37, 1007, 'LOGIN_FAILED', '2024-06-21 18:07:24', 'User login attempt failed'),
(38, 1007, 'Logged In Successfully', '2024-06-21 18:07:30', 'Admin Login successfully'),
(39, 1007, 'Logged In Successfully', '2024-06-21 18:12:09', 'Admin Login successfully'),
(40, 1006, 'Logged In Successfully', '2024-06-21 18:12:42', 'User Login successfully'),
(41, 1006, 'Logged In Successfully', '2024-06-21 18:14:55', 'User Login successfully'),
(42, 1006, 'Logged In Successfully', '2024-06-21 18:18:38', 'User Login successfully'),
(43, 1007, 'Logged In Successfully', '2024-06-21 18:19:27', 'Admin Login successfully'),
(44, 1006, 'Logged In Successfully', '2024-06-21 18:21:11', 'User Login successfully'),
(45, 1007, 'Logged In Successfully', '2024-06-21 18:29:30', 'Admin Login successfully'),
(46, 1007, 'Logged In Successfully', '2024-06-21 18:30:20', 'Admin Login successfully'),
(47, 1007, 'Logged In Successfully', '2024-06-21 18:31:38', 'Admin Login successfully'),
(48, 1007, 'Logged In Successfully', '2024-06-21 18:32:36', 'Admin Login successfully'),
(49, 1007, 'Logged In Successfully', '2024-06-21 18:34:06', 'Admin Login successfully'),
(50, 1007, 'Logged In Successfully', '2024-06-21 18:34:25', 'Admin Login successfully'),
(51, 1007, 'Logged In Successfully', '2024-06-21 18:36:57', 'Admin Login successfully'),
(52, 1007, 'Logged In Successfully', '2024-06-21 18:39:02', 'Admin Login successfully'),
(53, 1007, 'Logged In Successfully', '2024-06-21 18:40:03', 'Admin Login successfully'),
(54, 1007, 'Logged In Successfully', '2024-06-21 18:43:25', 'Admin Login successfully'),
(55, 1007, 'Logged In Successfully', '2024-06-21 19:10:13', 'Admin Login successfully'),
(56, 1007, 'Logged In Successfully', '2024-06-21 19:12:27', 'Admin Login successfully'),
(57, 1007, 'Logged In Successfully', '2024-06-21 19:12:55', 'Admin Login successfully'),
(58, 1007, 'Logged In Successfully', '2024-06-21 19:15:15', 'Admin Login successfully'),
(59, 1007, 'Logged In Successfully', '2024-06-21 19:55:39', 'Admin Login successfully'),
(60, 1007, 'Logged In Successfully', '2024-06-21 19:57:21', 'Admin Login successfully'),
(61, 1006, 'Logged In Successfully', '2024-06-21 19:57:53', 'User Login successfully'),
(62, 1006, 'Logged In Successfully', '2024-06-21 20:00:28', 'User Login successfully'),
(63, 1006, 'Logged In Successfully', '2024-06-21 20:05:29', 'User Login successfully'),
(64, 1006, 'Logged In Successfully', '2024-06-21 20:08:15', 'User Login successfully'),
(65, 1006, 'Logged In Successfully', '2024-06-21 20:08:52', 'User Login successfully'),
(66, 1007, 'Logged In Successfully', '2024-06-21 20:09:35', 'Admin Login successfully'),
(67, 1006, 'Logged In Successfully', '2024-06-21 20:09:45', 'User Login successfully'),
(68, 1007, 'Logged In Successfully', '2024-06-21 20:12:32', 'Admin Login successfully'),
(69, 1007, 'Logged In Successfully', '2024-06-21 20:13:31', 'Admin Login successfully'),
(70, 1007, 'Logged In Successfully', '2024-06-21 20:15:04', 'Admin Login successfully'),
(71, 1006, 'Logged In Successfully', '2024-06-21 20:22:16', 'User Login successfully'),
(72, 1006, 'Logged In Successfully', '2024-06-21 20:25:22', 'User Login successfully'),
(73, 1006, 'LOGIN_FAILED', '2024-06-21 20:29:20', 'User login attempt failed'),
(74, 1006, 'Logged In Successfully', '2024-06-21 20:29:28', 'User Login successfully'),
(75, 1007, 'Logged In Successfully', '2024-06-21 20:31:10', 'Admin Login successfully'),
(76, 1007, 'Logged In Successfully', '2024-06-21 20:49:54', 'Admin Login successfully'),
(77, 1006, 'Logged In Successfully', '2024-06-21 20:52:17', 'User Login successfully'),
(78, 1006, 'Logged In Successfully', '2024-06-21 20:55:01', 'User Login successfully'),
(79, 1006, 'Logged In Successfully', '2024-06-21 20:55:35', 'User Login successfully'),
(80, 1007, 'Logged In Successfully', '2024-06-21 21:00:29', 'Admin Login successfully'),
(81, 1006, 'Logged In Successfully', '2024-06-21 21:01:25', 'User Login successfully'),
(82, 1006, 'Logged In Successfully', '2024-06-21 21:08:15', 'User Login successfully'),
(83, 1006, 'Logged In Successfully', '2024-06-21 21:09:05', 'User Login successfully'),
(84, 1006, 'Logged In Successfully', '2024-06-21 21:51:34', 'User Login successfully'),
(85, 1006, 'Logged In Successfully', '2024-06-21 21:53:08', 'User Login successfully');

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
  `c_id` int(10) NOT NULL,
  `m_price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_movies`
--

INSERT INTO `tbl_movies` (`m_id`, `title`, `r_year`, `genre`, `run_time`, `director`, `movie_status`, `c_id`, `m_price`) VALUES
(3001, 'Doctor strange', 2016, 'Action', 160, 'Vince Bacarisas', 'Active', 1, 1200),
(3002, 'Boys In love', 2024, 'Bromance', 169, 'Christian Abendan', 'Active', 1, 100),
(3003, 'The Nun', 2017, 'Horror', 150, 'David Villondo', 'Active', 3, 150),
(3004, 'Haikyuu', 2023, 'Sports', 121, 'John Bert Plameran', 'Active', 4, 500);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_reports`
--

CREATE TABLE `tbl_reports` (
  `r_id` int(10) NOT NULL,
  `sales` int(10) NOT NULL,
  `date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_ticket`
--

CREATE TABLE `tbl_ticket` (
  `ticket_id` int(10) NOT NULL,
  `m_id` int(10) NOT NULL,
  `quantity` int(10) NOT NULL,
  `timestomp` datetime NOT NULL,
  `u_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  ADD KEY `c_id` (`c_id`);

--
-- Indexes for table `tbl_reports`
--
ALTER TABLE `tbl_reports`
  ADD PRIMARY KEY (`r_id`);

--
-- Indexes for table `tbl_ticket`
--
ALTER TABLE `tbl_ticket`
  ADD PRIMARY KEY (`ticket_id`);

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
  MODIFY `c_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2005;

--
-- AUTO_INCREMENT for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=86;

--
-- AUTO_INCREMENT for table `tbl_movies`
--
ALTER TABLE `tbl_movies`
  MODIFY `m_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3005;

--
-- AUTO_INCREMENT for table `tbl_reports`
--
ALTER TABLE `tbl_reports`
  MODIFY `r_id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_ticket`
--
ALTER TABLE `tbl_ticket`
  MODIFY `ticket_id` int(10) NOT NULL AUTO_INCREMENT;

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
  ADD CONSTRAINT `tbl_movies_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `tbl_cinema` (`c_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
