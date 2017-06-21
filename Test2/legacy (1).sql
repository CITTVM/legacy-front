-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 21-06-2017 a las 19:22:23
-- Versión del servidor: 10.1.22-MariaDB
-- Versión de PHP: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `legacy`
--
CREATE DATABASE IF NOT EXISTS `legacy` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `legacy`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `articulo`
--

CREATE TABLE `articulo` (
  `Id_articulo` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Descripcion` varchar(60) NOT NULL,
  `Observacion` varchar(60) DEFAULT NULL,
  `Marca` varchar(15) DEFAULT NULL,
  `Modelo` varchar(15) DEFAULT NULL,
  `Numero_serie` varchar(20) DEFAULT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Categoria` varchar(20) NOT NULL,
  `Id_track` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `articulo`
--

INSERT INTO `articulo` (`Id_articulo`, `Nombre`, `Descripcion`, `Observacion`, `Marca`, `Modelo`, `Numero_serie`, `Estado`, `Categoria`, `Id_track`) VALUES
(1, 'Raspberry', 'pi 3', 'en buen estado', 'Rasp', 'Pi3', '123456', 1, 'Microcontroladores', 1),
(2, 'Arduino', 'uno r3', 'en buen estado', 'libre', 'r3', '1234562', 1, 'Microcontroladores', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boletin`
--

CREATE TABLE `boletin` (
  `Id_boletin` int(11) NOT NULL,
  `Titulo` varchar(30) NOT NULL,
  `Descripcion` varchar(60) NOT NULL,
  `Fecha` date NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carrera`
--

CREATE TABLE `carrera` (
  `Id_carrera` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Escuela` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `carrera`
--

INSERT INTO `carrera` (`Id_carrera`, `Nombre`, `Escuela`) VALUES
(1, 'Ingenieria en Informatica', 'Informatica'),
(2, 'DiseÃ±o Grafico', 'DiseÃ±o'),
(3, 'DiseÃ±o Grafico', 'DiseÃ±o');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuenta`
--

CREATE TABLE `cuenta` (
  `Id_cuenta` int(11) NOT NULL,
  `Nickname` varchar(20) NOT NULL,
  `Pass` varchar(20) NOT NULL,
  `Tipo_cuenta` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cuenta`
--

INSERT INTO `cuenta` (`Id_cuenta`, `Nickname`, `Pass`, `Tipo_cuenta`) VALUES
(1, 'Elba@Calao.cl', 'jonasql', 'Basico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_prestamo`
--

CREATE TABLE `detalle_prestamo` (
  `Id_detalle` int(11) NOT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `Id_articulo` int(11) NOT NULL,
  `Id_prestamo` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inscripciones_workshop`
--

CREATE TABLE `inscripciones_workshop` (
  `Id_inscripcion` int(11) NOT NULL,
  `Fecha` date NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Rut_asistente` varchar(10) NOT NULL,
  `Nombre_asistente` varchar(15) NOT NULL,
  `Apellidos_Asistente` varchar(30) NOT NULL,
  `Id_workshop` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `participantes_proyectos`
--

CREATE TABLE `participantes_proyectos` (
  `Id_participante` int(11) NOT NULL,
  `Id_usuario` int(11) NOT NULL,
  `Id_proyecto` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `Id_prestamo` int(11) NOT NULL,
  `Fecha_inicio` date NOT NULL,
  `Fecha_termino` date NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Id_solicitante` int(11) NOT NULL,
  `Id_encargado` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proyecto`
--

CREATE TABLE `proyecto` (
  `Id_proyecto` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Descripcion` varchar(60) DEFAULT NULL,
  `Fecha_inicio` date NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Id_jefe` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `track`
--

CREATE TABLE `track` (
  `Id_track` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Descripcion` varchar(60) NOT NULL,
  `Id_lider` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `track`
--

INSERT INTO `track` (`Id_track`, `Nombre`, `Descripcion`, `Id_lider`) VALUES
(1, 'Microcontroladores', 'micro', 1),
(2, 'Des Web', 'hacen paginas', 1),
(3, 'videojuegos', 'hacen juegos', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `Id_usuario` int(11) NOT NULL,
  `Rut` varchar(10) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `ApellidoPaterno` varchar(20) NOT NULL,
  `ApellidoMaterno` varchar(20) NOT NULL,
  `Id_cuenta` int(11) NOT NULL,
  `Id_carrera` int(11) NOT NULL,
  `Id_track` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`Id_usuario`, `Rut`, `Nombre`, `ApellidoPaterno`, `ApellidoMaterno`, `Id_cuenta`, `Id_carrera`, `Id_track`) VALUES
(1, '178052772', 'Jordan', 'Silva', 'Ortega', 0, 1, 1),
(2, '178052772', 'Jordan', 'Silva', 'Ortega', 0, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `workshop`
--

CREATE TABLE `workshop` (
  `Id_workshop` int(11) NOT NULL,
  `Nombre` varchar(30) NOT NULL,
  `Descripcion` varchar(60) DEFAULT NULL,
  `Fecha` date NOT NULL,
  `Cupos` int(11) NOT NULL,
  `Estado` tinyint(1) NOT NULL,
  `Nombre_instructor` varchar(40) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `articulo`
--
ALTER TABLE `articulo`
  ADD PRIMARY KEY (`Id_articulo`),
  ADD KEY `Id_track` (`Id_track`);

--
-- Indices de la tabla `boletin`
--
ALTER TABLE `boletin`
  ADD PRIMARY KEY (`Id_boletin`);

--
-- Indices de la tabla `carrera`
--
ALTER TABLE `carrera`
  ADD PRIMARY KEY (`Id_carrera`);

--
-- Indices de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  ADD PRIMARY KEY (`Id_cuenta`);

--
-- Indices de la tabla `detalle_prestamo`
--
ALTER TABLE `detalle_prestamo`
  ADD PRIMARY KEY (`Id_detalle`),
  ADD KEY `Id_articulo` (`Id_articulo`),
  ADD KEY `Id_prestamo` (`Id_prestamo`);

--
-- Indices de la tabla `inscripciones_workshop`
--
ALTER TABLE `inscripciones_workshop`
  ADD PRIMARY KEY (`Id_inscripcion`),
  ADD KEY `Id_workshop` (`Id_workshop`);

--
-- Indices de la tabla `participantes_proyectos`
--
ALTER TABLE `participantes_proyectos`
  ADD PRIMARY KEY (`Id_participante`),
  ADD KEY `Id_usuario` (`Id_usuario`),
  ADD KEY `Id_proyecto` (`Id_proyecto`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`Id_prestamo`),
  ADD KEY `Id_encargado` (`Id_encargado`),
  ADD KEY `Id_solicitante` (`Id_solicitante`);

--
-- Indices de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`Id_proyecto`),
  ADD KEY `Id_jefe` (`Id_jefe`);

--
-- Indices de la tabla `track`
--
ALTER TABLE `track`
  ADD PRIMARY KEY (`Id_track`),
  ADD KEY `Id_lider` (`Id_lider`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Id_usuario`),
  ADD KEY `Id_cuenta` (`Id_cuenta`),
  ADD KEY `Id_carrera` (`Id_carrera`),
  ADD KEY `Id_track` (`Id_track`);

--
-- Indices de la tabla `workshop`
--
ALTER TABLE `workshop`
  ADD PRIMARY KEY (`Id_workshop`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `articulo`
--
ALTER TABLE `articulo`
  MODIFY `Id_articulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `boletin`
--
ALTER TABLE `boletin`
  MODIFY `Id_boletin` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `carrera`
--
ALTER TABLE `carrera`
  MODIFY `Id_carrera` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `cuenta`
--
ALTER TABLE `cuenta`
  MODIFY `Id_cuenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `detalle_prestamo`
--
ALTER TABLE `detalle_prestamo`
  MODIFY `Id_detalle` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `inscripciones_workshop`
--
ALTER TABLE `inscripciones_workshop`
  MODIFY `Id_inscripcion` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `participantes_proyectos`
--
ALTER TABLE `participantes_proyectos`
  MODIFY `Id_participante` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `Id_prestamo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `proyecto`
--
ALTER TABLE `proyecto`
  MODIFY `Id_proyecto` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `track`
--
ALTER TABLE `track`
  MODIFY `Id_track` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `Id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `workshop`
--
ALTER TABLE `workshop`
  MODIFY `Id_workshop` int(11) NOT NULL AUTO_INCREMENT;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
