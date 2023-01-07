-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jun 23, 2022 at 02:08 AM
-- Server version: 5.7.33
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tokohp`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang`
--

CREATE TABLE `tb_barang` (
  `id_barang` int(11) NOT NULL,
  `nama_barang` varchar(200) NOT NULL,
  `merk_barang` varchar(20) NOT NULL,
  `tipe_barang` varchar(20) NOT NULL,
  `ram` varchar(15) DEFAULT NULL,
  `harga` int(10) NOT NULL,
  `harga_jual` int(20) NOT NULL,
  `jumlah` int(5) NOT NULL,
  `keterangan` varchar(800) DEFAULT NULL,
  `kategori` enum('barang','aksesoris') NOT NULL,
  `barcode` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_barang`
--

INSERT INTO `tb_barang` (`id_barang`, `nama_barang`, `merk_barang`, `tipe_barang`, `ram`, `harga`, `harga_jual`, `jumlah`, `keterangan`, `kategori`, `barcode`) VALUES
(22, 'Redmi 10C hitam', 'redmi', 'handphone', '12 GB', 26000000, 3000000, 10, 'Detail Prosesor	SM6225 Snapdragon 680 4G (6 nm)\r\nMemori Internal	64 GB\r\nResolusi Kamera Belakang	50 MP\r\nResolusi Kamera Utama Lainnya	2 MP\r\nResolusi Kamera Depan	5 MP\r\nUSB	Type-C, USB OTG\r\nNFC	Ya\r\nKapasitas Baterai	5000 mAh', 'barang', '8998989300261'),
(23, 'Redmi 9', 'iphone', 'smartphone', '4 GB', 29000000, 3200000, 10, 'OS Version	Android 11\r\nUkuran Layar	6.6 inch\r\nScreen Resolution	720 x 1612 Pixel\r\nDetail Prosesor	MT6761 Helio A22 (12 nm)\r\nMemori Internal	64 GB\r\nResolusi Kamera Belakang	13 MP\r\nResolusi Kamera Utama Lainnya	-\r\nResolusi Kamera Depan	8 MP\r\nUSB	microUSB\r\nNFC	Tidak\r\nKapasitas Baterai	5000 mAh', 'barang', '6941059646600'),
(24, 'redmi note 5 Hitam', 'redmi', 'smartphone', '4 GB', 13000000, 1500000, 3, 'OS Version	Android 11\r\nUkuran Layar	6.6 inch\r\nScreen Resolution	1080 x 2408 Pixel\r\nDetail Prosesor	T616 (12 nm)\r\nMemori Internal	64 GB\r\nResolusi Kamera Belakang	50 MP\r\nResolusi Kamera Utama Lainnya	2 MP\r\nResolusi Kamera Depan	8 MP\r\nUSB	Type-C, USB OTG\r\nNFC	Tidak\r\nKapasitas Baterai	5000 mAh', 'barang', '6941059617211'),
(25, ' realme C31', 'realme', 'smartphone', '4 GB', 3000000, 3300000, 10, 'OS Version	Android 11\r\nUkuran Layar	6.51 inch\r\nScreen Resolution	720 x 1600 Pixel\r\nDetail Prosesor	MT6765G Helio G35 (12 nm)\r\nMemori Internal	64 GB\r\nResolusi Kamera Belakang	50 MP\r\nResolusi Kamera Utama Lainnya	2, 2 MP\r\nResolusi Kamera Depan 2	-\r\nNFC	Tidak\r\nUSB	Type-C, USB OTG\r\nKapasitas Baterai	5000 mAh', 'barang', ''),
(26, 'Samsung Galaxy A23', 'samsung', 'smartphone', '6 GB', 2800000, 3100000, 5, 'OS Version	Android 12\r\nUkuran Layar	6.6 inch\r\nScreen Resolution	1080 x 2408 Pixel\r\nDetail Prosesor	SM6225 Snapdragon 680 4G (6 nm)\r\nMemori Internal	128 GB\r\nResolusi Kamera Belakang	50 MP\r\nResolusi Kamera Utama Lainnya	2 MP\r\nResolusi Kamera Depan	-\r\nUSB	Type-C\r\nNFC	Ya\r\nKapasitas Baterai	5000 mAh', 'barang', ''),
(27, 'vivo Y21T ', 'vivo', 'smartphone', '6 GB', 3000000, 3300000, 10, 'OS Version	Android 11\r\nUkuran Layar	6.51 inch\r\nScreen Resolution	720 x 1600 Pixel\r\nDetail Prosesor	SM6225 Snapdragon 680 4G (6 nm)\r\nMemori Internal	128 GB\r\nResolusi Kamera Belakang	50 MP\r\nResolusi Kamera Utama Lainnya	2, 2 MP\r\nResolusi Kamera Depan	8 MP\r\nUSB	USB OTG\r\nKapasitas Baterai	5000 mAh', 'barang', ''),
(28, 'vivo Y75 5G', 'vivo', 'smartphone', '8 GB', 3000000, 3300000, 10, 'OS Version	Android 11\r\nUkuran Layar	6.58 inch\r\nScreen Resolution	1080 x 2408 Pixel\r\nDetail Prosesor	MT6833 Dimensity 700 5G (7 nm)\r\nMemori Internal	128 GB\r\nResolusi Kamera Belakang	50 MP\r\nResolusi Kamera Utama Lainnya	2, 2 MP\r\nResolusi Kamera Depan	16 MP\r\nUSB	Type-C\r\nKapasitas Baterai	5000 mAh', 'barang', ''),
(29, 'IPhone XS', 'iphone', 'smartphone', '4 GB', 23000000, 23300000, 5, 'OS : iOS 12, upgradable to iOS 13.1\r\nCPU : Hexa-core (2×2.5 GHz Vortex + 4×1.6 GHz Tempest)\r\nDisplay : 5.8 inches, 1125 x 2436 pixels\r\nMemory : 512 GB\r\nBattery : Li-Ion 2658 mAh\r\nCamera : Primary 12 MP + 12 MP & Secondary 7 MP', 'barang', ''),
(30, 'Apple iPhone 11', 'iphone', 'smartphone', '4 GB', 13000000, 13300000, 10, 'OS : iOS 13, upgradable to iOS 13.1\r\nCPU : Hexa-core (2×2.65 GHz Lightning + 4×1.8 GHz Thunder)\r\nDisplay : 6.1 inches, 828 x 1792 pixels\r\nMemory : 256 GB\r\nBattery : Li-Ion 3110 mAh\r\nCamera : Primary 12 MP + 12 MP & Secondary 12 MP', 'barang', ''),
(31, 'Apple iPhone 11 Pro', 'iphone', 'smartphone', '4 GB', 95000000, 9800000, 10, 'OS : iOS 13, upgradable to iOS 13.1\r\nCPU : Hexa-core (2×2.65 GHz Lightning + 4×1.8 GHz Thunder)\r\nDisplay : 5.8 inches, 1125 x 2436 pixels\r\nMemory : 512 GB\r\nBattery : Li-Ion 3046 mAh\r\nCamera : Primary 12 MP + 12 MP + 12 MP & Secondary 12 MP', 'barang', ''),
(32, 'Apple iPhone 11 Pro Max', 'iphone', 'smartphone', '4 GB', 13000000, 13300000, 10, 'OS : iOS 13, upgradable to iOS 13.1\r\nCPU : Hexa-core (2×2.65 GHz Lightning + 4×1.8 GHz Thunder)\r\nDisplay : 6.5 inches, 1242 x 2688 pixels\r\nMemory : 512 GB\r\nBattery : Li-Ion 3969 mAh\r\nCamera : Primary 12 MP + 12 MP + 12 MP & Secondary 12 MP', 'barang', ''),
(33, 'Xiaomi 12 Pro', 'xiaomi', 'smartphone', '12 GB', 12000000, 12300000, 10, 'Layar	LTPO AMOLED 6.73 inci\r\nChipset	Qualcomm Snapdragon 8 Gen1\r\nMemori Internal	256 GB\r\nKamera	50 MP (wide) 50 MP (ultrawide) 50 MP (telephoto)\r\nBaterai	Li-Po 4600 mAh', 'barang', ''),
(34, 'Xiaomi 12', 'xioami', 'smartphone', '8 GB', 9000000, 9300000, 10, 'Layar	Super AMOLED 6.28 inci\r\nChipset	Qualcomm Snapdragon 8 Gen1\r\nMemori Internal	256 GB\r\nKamera	50 MP (wide) 13 MP (ultrawide) 5 MP (telephoto macro)\r\nBaterai	Li-Po 4500 mAh', 'barang', ''),
(35, 'Redmi Note 11 Pro 5G', 'redmi', 'samrtphone', '8 GB', 4500000, 4800000, 10, 'Layar	Super AMOLED 6.67 inci\r\nChipset	Qualcomm Snapdragon 695 5G\r\nMemori Internal	128 GB\r\nKamera	108 MP (wide) 8 MP (ultrawide) 2 MP (macro)\r\nBaterai	Li-Po 5000 mAh', 'barang', ''),
(36, 'Xiaomi 11T Pro', 'xioami', 'smartphone', '4 GB', 5999999, 6200000, 10, 'Layar	AMOLED 6.67 inci\r\nChipset	MediaTek Dimensity 1200\r\nMemori Internal	256 GB\r\nKamera	108 MP (wide) 8 MP (ultrawide) 5 MP (telephoto macro)\r\nBaterai	Li-Po 5000 mAh', 'barang', ''),
(42, 'headset m1 pro', 'samsung', 'headset', NULL, 100000, 200000, 10, NULL, 'aksesoris', '5012345678900'),
(43, 'headset x1 pro', 'vivo', 'headset', NULL, 10, 150000, 250000, NULL, 'aksesoris', '861165044281227 '),
(44, 'iphone edit 30', 'oppo', 'headset', NULL, 160000, 280000, 10, NULL, 'aksesoris', ''),
(45, 'x2 pro aerbuds', 'xiaomi', 'casing', NULL, 120000, 185000, 10, NULL, 'aksesoris', ''),
(47, 'headset pro 1 x', 'vivo', 'headset', NULL, 300000, 500000, 10, NULL, 'aksesoris', ''),
(55, 'Charger Iphone 20 Watt', 'iphone', 'charger', NULL, 100000, 200000, 10, NULL, 'aksesoris', ''),
(60, 'oppo A5 2020 Hitam Hitam', 'oppo', 'smartphone', '4 GB', 1500000, 2500000, 24, 'OS Version	Android 12\r\nUkuran Layar	6.6 inch\r\nScreen Resolution	1080 x 2408 Pixel\r\nDetail Prosesor	SM6225 Snapdragon 680 4G (6 nm)\r\nMemori Internal	128 GB\r\nResolusi Kamera Belakang	50 MP\r\nResolusi Kamera Utama Lainnya	2 MP\r\nResolusi Kamera Depan	-\r\nUSB	Type-C\r\nNFC	Ya\r\nKapasitas Baterai	5000 mAh', 'barang', '6944284648050'),
(61, 'earphone', 'nokia', 'casing', NULL, 20000, 20000, 12, NULL, 'aksesoris', '123456789101'),
(62, 'tambah baru Gold', 'redmi', 'smartphone', '2 GB', 100000, 200000, 10, 'hhh', 'barang', '6944284648050');

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang_keluar`
--

CREATE TABLE `tb_barang_keluar` (
  `id` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah_keluar` int(11) NOT NULL,
  `tanggal_keluar` date NOT NULL,
  `sisa_barang` int(11) NOT NULL,
  `status_keluar` enum('seller','update') NOT NULL,
  `id_penjualan` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_barang_keluar`
--

INSERT INTO `tb_barang_keluar` (`id`, `id_barang`, `jumlah_keluar`, `tanggal_keluar`, `sisa_barang`, `status_keluar`, `id_penjualan`) VALUES
(10, 24, 1, '2022-06-16', 9, 'seller', 7),
(11, 24, 1, '2022-06-16', 8, 'seller', 8),
(12, 24, 1, '2022-06-16', 7, 'seller', 9),
(13, 26, 1, '2022-06-16', 9, 'seller', 10),
(14, 26, 1, '2022-06-16', 8, 'seller', 11),
(15, 26, 1, '2022-06-16', 7, 'seller', 12),
(16, 29, 1, '2022-06-16', 9, 'seller', 13),
(17, 29, 1, '2022-06-16', 8, 'seller', 14),
(18, 26, 1, '2022-06-16', 6, 'seller', 15),
(19, 24, 1, '2022-06-16', 6, 'seller', 16),
(20, 29, 1, '2022-06-16', 7, 'seller', 17),
(21, 26, 1, '2022-06-16', 5, 'seller', 18),
(22, 24, 1, '2022-06-16', 5, 'seller', 19),
(23, 29, 1, '2022-06-16', 6, 'seller', 20),
(24, 29, 1, '2022-06-16', 5, 'seller', 21),
(25, 60, 1, '2022-06-16', 24, 'seller', 22),
(26, 62, 1, '2022-06-16', 10, 'seller', 22),
(27, 24, 1, '2022-06-16', 4, 'seller', 22),
(28, 24, 1, '2022-06-16', 3, 'seller', 23);

-- --------------------------------------------------------

--
-- Table structure for table `tb_barang_masuk`
--

CREATE TABLE `tb_barang_masuk` (
  `id` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah_masuk` int(5) NOT NULL,
  `tanggal_masuk` date NOT NULL,
  `ketersediaan` int(5) NOT NULL,
  `id_pegawai` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_barang_masuk`
--

INSERT INTO `tb_barang_masuk` (`id`, `id_barang`, `jumlah_masuk`, `tanggal_masuk`, `ketersediaan`, `id_pegawai`) VALUES
(9, 30, 10, '2022-06-01', 10, 44),
(10, 31, 10, '2022-06-01', 10, 44),
(11, 32, 10, '2022-06-01', 10, 44),
(12, 55, 10, '2022-06-01', 10, 44),
(13, 42, 10, '2022-06-01', 10, 44),
(14, 47, 10, '2022-06-01', 10, 44),
(15, 43, 10, '2022-06-01', 10, 44),
(16, 44, 10, '2022-06-01', 10, 44),
(17, 29, 10, '2022-06-01', 10, 44),
(18, 25, 10, '2022-06-01', 10, 44),
(19, 24, 10, '2022-06-01', 10, 44),
(20, 23, 10, '2022-06-01', 10, 44),
(21, 22, 10, '2022-06-01', 10, 44),
(22, 35, 10, '2022-06-01', 10, 44),
(23, 26, 10, '2022-06-01', 10, 44),
(24, 27, 10, '2022-06-01', 10, 44),
(25, 28, 10, '2022-06-01', 10, 44),
(26, 45, 10, '2022-06-01', 10, 44),
(27, 36, 10, '2022-06-01', 10, 44),
(28, 34, 10, '2022-06-01', 10, 44),
(29, 33, 10, '2022-06-01', 10, 44),
(30, 60, 10, '2022-06-16', 10, 45),
(31, 61, 12, '2022-06-16', 12, 45),
(32, 62, 11, '2022-06-16', 11, 45),
(33, 62, 5, '2022-06-16', 25, 45);

-- --------------------------------------------------------

--
-- Table structure for table `tb_config`
--

CREATE TABLE `tb_config` (
  `id_config` int(11) NOT NULL,
  `jabatan` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tb_config`
--

INSERT INTO `tb_config` (`id_config`, `jabatan`) VALUES
(1, 'SELLER'),
(2, 'STOKER'),
(3, 'ADMIN');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pegawai`
--

CREATE TABLE `tb_pegawai` (
  `id_pegawai` int(11) NOT NULL,
  `nik` varchar(15) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `tempat_lahir` varchar(35) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `alamat` varchar(80) NOT NULL,
  `kewarganegaraan` varchar(3) NOT NULL,
  `jenis_kelamin` enum('LAKI-LAKI','PEREMPUAN') NOT NULL,
  `agama` varchar(20) NOT NULL,
  `gaji` int(50) NOT NULL,
  `status_pegawai` enum('aktif','nonaktif') NOT NULL DEFAULT 'aktif',
  `foto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_pegawai`
--

INSERT INTO `tb_pegawai` (`id_pegawai`, `nik`, `nama`, `tempat_lahir`, `tanggal_lahir`, `alamat`, `kewarganegaraan`, `jenis_kelamin`, `agama`, `gaji`, `status_pegawai`, `foto`) VALUES
(43, '2020573010055', 'Rahmat Siddiqi', 'Lhokseumawe', '2001-04-24', 'krukuh', 'WNI', 'LAKI-LAKI', 'ISLAM ', 2500000, 'aktif', 'src\\upload\\Rahmat Siddiqi_1655363760578.jpeg'),
(44, '2020573010019', 'Dzikri Arraiyan', 'Lhokseumawe', '2002-07-11', 'Mongeudong', 'WNI', 'LAKI-LAKI', 'ISLAM ', 3000000, 'aktif', 'src\\upload\\Dzikri Arraiyan_1655363856253.jpeg'),
(45, '2020573010012', 'Baihaqi', 'Lhokseumawe', '2001-06-13', 'panggoi', 'WNI', 'LAKI-LAKI', 'ISLAM ', 5000000, 'aktif', 'src\\upload\\Baihaqi_1655363646212.jpeg'),
(47, '2020573010058', 'Raza Fahlevi', 'Lhokseumawe', '2002-06-11', 'Bayu', 'WNI', 'LAKI-LAKI', 'ISLAM ', 3500000, 'aktif', 'src\\upload\\Raza Fahlevi_1655364261519.jpeg'),
(49, '20205730100', 'Dzikri Arr', 'lhokseumawe', '2002-06-11', 'mon geudong', 'WNI', 'LAKI-LAKI', 'ISLAM ', 100000, 'aktif', 'src\\upload\\Dzikri Arr_1655368418165.jpeg');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pembeli`
--

CREATE TABLE `tb_pembeli` (
  `id_pembeli` int(11) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no hp` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_pembeli`
--

INSERT INTO `tb_pembeli` (`id_pembeli`, `nama`, `alamat`, `no hp`, `email`) VALUES
(3, 'Aidil', 'MatangKuli', '0812345678', 'aidilfitrah@gmail.com'),
(4, 'Mifzal', 'Lhokseumawe', '08123456789', 'mifzal@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tb_penjualan`
--

CREATE TABLE `tb_penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `nama_pegawai` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `id_pembeli` int(11) NOT NULL,
  `id_pegawai` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_penjualan`
--

INSERT INTO `tb_penjualan` (`id_penjualan`, `nama_pegawai`, `tanggal`, `id_pembeli`, `id_pegawai`) VALUES
(7, 'Raza Fahlevi', '2022-06-16', 3, 47),
(8, 'Raza Fahlevi', '2022-06-16', 3, 47),
(9, 'Raza Fahlevi', '2022-06-16', 3, 47),
(10, 'Raza Fahlevi', '2022-06-16', 3, 47),
(11, 'Raza Fahlevi', '2022-06-16', 3, 47),
(12, 'Raza Fahlevi', '2022-06-16', 3, 47),
(13, 'Raza Fahlevi', '2022-06-16', 3, 47),
(14, 'Raza Fahlevi', '2022-06-16', 3, 47),
(15, 'Raza Fahlevi', '2022-06-16', 3, 47),
(16, 'Raza Fahlevi', '2022-06-16', 3, 47),
(17, 'Raza Fahlevi', '2022-06-16', 3, 47),
(18, 'Raza Fahlevi', '2022-06-16', 3, 47),
(19, 'Raza Fahlevi', '2022-06-16', 3, 47),
(20, 'Raza Fahlevi', '2022-06-16', 3, 47),
(21, 'Raza Fahlevi', '2022-06-16', 3, 47),
(22, 'Raza Fahlevi', '2022-06-16', 4, 47),
(23, 'Raza Fahlevi', '2022-06-16', 3, 47);

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(11) NOT NULL,
  `user` varchar(35) NOT NULL,
  `password` varchar(32) NOT NULL,
  `level` varchar(35) NOT NULL,
  `id_pegawai` int(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `user`, `password`, `level`, `id_pegawai`) VALUES
(40, 'rahmat', '202cb962ac59075b964b07152d234b70', 'ADMIN', 43),
(41, 'darraiyan', '202cb962ac59075b964b07152d234b70', 'STOKER', 44),
(42, 'baihaqi', '202cb962ac59075b964b07152d234b70', 'STOKER', 45),
(43, 'reza', '202cb962ac59075b964b07152d234b70', 'SELLER', 47),
(45, 'zikrii', '202cb962ac59075b964b07152d234b70', 'SELLER', 49);

-- --------------------------------------------------------

--
-- Stand-in structure for view `ve_aksesoris`
-- (See below for the actual view)
--
CREATE TABLE `ve_aksesoris` (
`id_barang` int(11)
,`nama_barang` varchar(200)
,`merk_barang` varchar(20)
,`tipe_barang` varchar(20)
,`ram` varchar(15)
,`harga` int(10)
,`harga_jual` int(20)
,`jumlah` int(5)
,`keterangan` varchar(800)
,`kategori` enum('barang','aksesoris')
,`barcode` varchar(20)
);

-- --------------------------------------------------------

--
-- Structure for view `ve_aksesoris`
--
DROP TABLE IF EXISTS `ve_aksesoris`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `ve_aksesoris`  AS SELECT `tb_barang`.`id_barang` AS `id_barang`, `tb_barang`.`nama_barang` AS `nama_barang`, `tb_barang`.`merk_barang` AS `merk_barang`, `tb_barang`.`tipe_barang` AS `tipe_barang`, `tb_barang`.`ram` AS `ram`, `tb_barang`.`harga` AS `harga`, `tb_barang`.`harga_jual` AS `harga_jual`, `tb_barang`.`jumlah` AS `jumlah`, `tb_barang`.`keterangan` AS `keterangan`, `tb_barang`.`kategori` AS `kategori`, `tb_barang`.`barcode` AS `barcode` FROM `tb_barang` WHERE (`tb_barang`.`kategori` = 'aksesoris')  ;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_barang`
--
ALTER TABLE `tb_barang`
  ADD PRIMARY KEY (`id_barang`);

--
-- Indexes for table `tb_barang_keluar`
--
ALTER TABLE `tb_barang_keluar`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_penjualan` (`id_penjualan`),
  ADD KEY `id_barang` (`id_barang`);

--
-- Indexes for table `tb_barang_masuk`
--
ALTER TABLE `tb_barang_masuk`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_barang` (`id_barang`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indexes for table `tb_config`
--
ALTER TABLE `tb_config`
  ADD PRIMARY KEY (`id_config`);

--
-- Indexes for table `tb_pegawai`
--
ALTER TABLE `tb_pegawai`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD UNIQUE KEY `nik` (`nik`);

--
-- Indexes for table `tb_pembeli`
--
ALTER TABLE `tb_pembeli`
  ADD PRIMARY KEY (`id_pembeli`);

--
-- Indexes for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_pembeli` (`id_pembeli`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `user` (`user`),
  ADD KEY `relasi pegawai` (`id_pegawai`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_barang`
--
ALTER TABLE `tb_barang`
  MODIFY `id_barang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=63;

--
-- AUTO_INCREMENT for table `tb_barang_keluar`
--
ALTER TABLE `tb_barang_keluar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `tb_barang_masuk`
--
ALTER TABLE `tb_barang_masuk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT for table `tb_config`
--
ALTER TABLE `tb_config`
  MODIFY `id_config` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tb_pegawai`
--
ALTER TABLE `tb_pegawai`
  MODIFY `id_pegawai` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `tb_pembeli`
--
ALTER TABLE `tb_pembeli`
  MODIFY `id_pembeli` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_barang_keluar`
--
ALTER TABLE `tb_barang_keluar`
  ADD CONSTRAINT `tb_barang_keluar_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_barang_keluar_ibfk_2` FOREIGN KEY (`id_penjualan`) REFERENCES `tb_penjualan` (`id_penjualan`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_barang_masuk`
--
ALTER TABLE `tb_barang_masuk`
  ADD CONSTRAINT `tb_barang_masuk_ibfk_1` FOREIGN KEY (`id_barang`) REFERENCES `tb_barang` (`id_barang`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_barang_masuk_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_penjualan`
--
ALTER TABLE `tb_penjualan`
  ADD CONSTRAINT `tb_penjualan_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`) ON UPDATE CASCADE,
  ADD CONSTRAINT `tb_penjualan_ibfk_2` FOREIGN KEY (`id_pembeli`) REFERENCES `tb_pembeli` (`id_pembeli`) ON UPDATE CASCADE;

--
-- Constraints for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD CONSTRAINT `tb_user_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `tb_pegawai` (`id_pegawai`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
