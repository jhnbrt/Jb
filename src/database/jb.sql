-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 09:26 AM
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
  `log_event` varchar(200) NOT NULL,
  `log_timestamp` datetime NOT NULL,
  `log_descript` varchar(500) NOT NULL,
  `r_id` int(10) NOT NULL,
  `ticket_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
(3003, 'The Nun', 2017, 'Horror', 150, 'David Villondo', 'Active', 3, 150),
(3004, 'Haikyuu', 2023, 'Sports', 121, 'John Bert Plameran', 'Active', 4, 500),
(3005, 'Wrong Turn', 2045, 'Horror,Thriller', 123, 'derrick', 'Active', 1, 2500),
(3009, 'Doctor Strange', 2016, 'Action', 160, 'Vince Bacarisas', 'Archived', 1, 1200);

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
(1005, 'chan', 'chan', 'chan', 'chan2', 'fa585d89c851dd338a70dcf535aa2a92fee7836dd6aff12265', 'Admin', 'Archived'),
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
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `r_id` (`r_id`),
  ADD KEY `ticket_id` (`ticket_id`);

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
  ADD PRIMARY KEY (`ticket_id`),
  ADD KEY `m_id` (`m_id`),
  ADD KEY `u_id` (`u_id`);

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
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=122;

--
-- AUTO_INCREMENT for table `tbl_movies`
--
ALTER TABLE `tbl_movies`
  MODIFY `m_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3010;

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
-- Constraints for table `tbl_logs`
--
ALTER TABLE `tbl_logs`
  ADD CONSTRAINT `tbl_logs_ibfk_3` FOREIGN KEY (`r_id`) REFERENCES `tbl_reports` (`r_id`),
  ADD CONSTRAINT `tbl_logs_ibfk_4` FOREIGN KEY (`ticket_id`) REFERENCES `tbl_ticket` (`ticket_id`);

--
-- Constraints for table `tbl_movies`
--
ALTER TABLE `tbl_movies`
  ADD CONSTRAINT `tbl_movies_ibfk_1` FOREIGN KEY (`c_id`) REFERENCES `tbl_cinema` (`c_id`);

--
-- Constraints for table `tbl_ticket`
--
ALTER TABLE `tbl_ticket`
  ADD CONSTRAINT `tbl_ticket_ibfk_1` FOREIGN KEY (`m_id`) REFERENCES `tbl_movies` (`m_id`),
  ADD CONSTRAINT `tbl_ticket_ibfk_2` FOREIGN KEY (`u_id`) REFERENCES `tbl_u` (`u_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
