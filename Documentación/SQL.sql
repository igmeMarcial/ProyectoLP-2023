CREATE DATABASE  proyectoLP;

USE  proyectoLP;

CREATE TABLE `usuario` (
  `idUsuario` int auto_increment primary key,
  `userName` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `cargo` (
  `idCargo` int (11) not null,
  `NombreCargo` varchar(20) DEFAULT NULL,
  `estado` bit(1) DEFAULT NULL,
    PRIMARY KEY (`idCargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `cargo` (`idCargo`, `NombreCargo`, `estado`) VALUES
(1, 'ADMINISTRADOR', '1'),
(2, 'VENDEDOR', '1');

DROP TABLE IF EXISTS `empleado`;
 SET character_set_client = utf8mb4 ;
 CREATE TABLE `empleado` (
  `idEmpleado` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
    `apellidos` varchar(200) NOT NULL,
    `sexo` char(1) DEFAULT NULL,
    `fechaNacimiento` date DEFAULT NULL,
  `telefono` int(11)  NULL,
  `celular` int(11)  NULL,
  `email` varchar(50)  NULL,
  `idCargo`  int (11) not null,
  PRIMARY KEY (`idEmpleado`),
  CONSTRAINT `fk_empleado_cargo` FOREIGN KEY (`idCargo`) REFERENCES `cargo` (`idCargo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `empleado` ( `nombre`,`apellidos`, `sexo`, `fechaNacimiento`, `telefono`,`email`,`idCargo`) VALUES
('Marcial', 'Igme Chillca', 'M', '2001-05-28', '055544','igmemarcial@gmail.com',1),
('Sheyla', 'Galarza', 'F', '2000-05-28', '055545','sheyla.galarza@ngr.com.pe',2),
('Alonzo', 'Barreda', 'M', '2000-05-28', '055545','chanchito15@ngr.com.pe',2),
('Joss', 'Paucarpura', 'F', '2000-05-28', '055545','joss@ngr.com.pe',2);

-- select e.idEmpleado,e.nombre, e.apellidos,e.sexo,e.fechaNacimiento,e.telefono,e.celular,e.email,c.NombreCargo from empleado e inner join cargo c on c.idCargo = e.idCargo order by e.idEmpleado;

-- select c.idCargo, c.NombreCargo, c.estado from cargo c order by c.idCargo;


DROP TABLE IF EXISTS `proveedor`;
 SET character_set_client = utf8mb4 ;
 CREATE TABLE `proveedor` (
  `idProveedor` int NOT NULL AUTO_INCREMENT,
  `ruc` varchar(11) NOT NULL,
  `razonSocial` varchar(200) NOT NULL,
  `categoria` varchar(100) NOT NULL,
  `tipoSolicitud` varchar(255) NOT NULL,
  `email` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


INSERT INTO `proveedor` (`ruc`, `razonSocial`, `categoria`, `tipoSolicitud`, `email`, `telefono`)
VALUES 
('12345678901', 'Proveedor A', 'Categoría X', 'Solicitud Tipo 1', 'proveedora@example.com', '1234567890'),
('23456789012', 'Proveedor B', 'Categoría Y', 'Solicitud Tipo 2', 'proveedorb@example.com', '2345678901'),
('34567890123', 'Proveedor C', 'Categoría Z', 'Solicitud Tipo 3', 'proveedorc@example.com', '3456789012'),
('45678901234', 'Proveedor D', 'Categoría X', 'Solicitud Tipo 2', 'proveedord@example.com', '4567890123'),
('56789012345', 'Proveedor E', 'Categoría Y', 'Solicitud Tipo 1', 'proveedore@example.com', '5678901234'),
('67890123456', 'Proveedor F', 'Categoría Z', 'Solicitud Tipo 3', 'proveedorf@example.com', '6789012345'),
('78901234567', 'Proveedor G', 'Categoría X', 'Solicitud Tipo 2', 'proveedorg@example.com', '7890123456'),
('89012345678', 'Proveedor H', 'Categoría Y', 'Solicitud Tipo 1', 'proveedorh@example.com', '8901234567'),
('90123456789', 'Proveedor I', 'Categoría Z', 'Solicitud Tipo 3', 'proveedori@example.com', '9012345678'),
('01234567890', 'Proveedor J', 'Categoría X', 'Solicitud Tipo 2', 'proveedorj@example.com', '0123456789');

-- select p.idProveedor, p.ruc, p.razonSocial, p.categoria, p.tipoSolicitud, p.email, p.telefono from proveedor p;


DROP TABLE IF EXISTS `equipo`;
 SET character_set_client = utf8mb4 ;
 CREATE TABLE `equipo` (
  `idEquipo` bigint(20) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(200) NOT NULL,
  `marca` varchar(100) NOT NULL,
    `modelo` varchar(100) NOT NULL,
      `tipo` smallint(6) NOT NULL DEFAULT '0',
  `serie` varchar(50) NOT NULL,
  `ip` varchar(50) NOT NULL,
  PRIMARY KEY (`idEquipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Computadora 1', 'Lenovo', 'ThinkPad T14', 1, '123456', '192.168.0.1');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Impresora 1', 'HP', 'LaserJet Pro M404dw', 2, '789012', '192.168.0.2');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Servidor 1', 'Dell', 'PowerEdge R640', 3, '345678', '192.168.0.3');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Rúter 1', 'Cisco', 'ISR 1100 4-Port', 4, '901234', '192.168.0.4');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Switch 1', 'Netgear', 'GS324TP', 5, '567890', '192.168.0.5');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Cámara de seguridad 1', 'Hikvision', 'DS-2CD2143G0-IS', 6, '234567', '192.168.0.6');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Teléfono 1', 'Avaya', 'J139', 7, '890123', '192.168.0.7');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Proyector 1', 'Epson', 'PowerLite 1780W', 8, '456789', '192.168.0.8');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Escáner 1', 'Brother', 'ADS-1700W', 9, '012345', '192.168.0.9');
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES ('Monitor 1', 'LG', '27UK650-W', 10, '678901', '192.168.0.10');

DROP TABLE IF EXISTS `categoria`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `categoria` (
  `idCategoria` int NOT NULL AUTO_INCREMENT,
  `nombreCategoria` varchar(200) NOT NULL,
  `descripcion` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO `categoria` (`nombreCategoria`, `descripcion`) VALUES
( 'CATEGORIA A', 'SUELDO DE S/1500'),
( 'CATEGORIA B', 'SUELDO DE S/2000'),
( 'CATEGORIA C', 'SUELDO DE S/2800'),
( 'CATEGORIA D', 'SUELDO DE S/3200');


-- _____________________________________________successs_________________________________________

DROP TABLE IF EXISTS `detalleEquipo`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `detalleEquipo` (
  `iddetalleEquipo` int NOT NULL AUTO_INCREMENT,
  `garantia` varchar(200) NOT NULL,
  `unidadStock` smallint(6) NOT NULL DEFAULT '0',
  `descripcion` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`iddetalleEquipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


-- exec correct



DROP TABLE IF EXISTS `detalleAtencion`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `detalleAtencion` (
  `idDetalleAtencion` int NOT NULL AUTO_INCREMENT,
  `estado` varchar(200) NOT NULL,
  `descripcion` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`iddetalleAtencion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;







DROP TABLE IF EXISTS `CDP`;
 SET character_set_client = utf8mb4 ;
 CREATE TABLE `CDP` (
  `idCDP` int NOT NULL AUTO_INCREMENT,
  `tipo` smallint(6) NOT NULL DEFAULT '0',
  `estado` smallint(6) NOT NULL DEFAULT '0',
  `subTotal` float NOT NULL DEFAULT '0',
  `articuloDescuento` float NOT NULL DEFAULT '0',
  `impuesto` float NOT NULL DEFAULT '0',
  `envio` float NOT NULL DEFAULT '0',
  `total` float NOT NULL DEFAULT '0',
  `promocion` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `descuento` float NOT NULL DEFAULT '0',
  `grandTotal` float NOT NULL DEFAULT '0',
  `contenido` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`idCDP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;



DROP TABLE IF EXISTS `ticket`;
 SET character_set_client = utf8mb4 ;
 CREATE TABLE `ticket` (
  `idTicket` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(75) COLLATE utf8mb4_unicode_ci NOT NULL,
   `tipo` smallint(6) NOT NULL DEFAULT '0',
  `prioridad` tinytext COLLATE utf8mb4_unicode_ci,
    `categoria` varchar(200) NOT NULL,
       `fuenteSol` varchar(200) NOT NULL,
  `fechaApertura` datetime NOT NULL,
  `fechaResulucion` datetime DEFAULT NULL,
    `idDetalleAtencion`  int (11) not null,
  PRIMARY KEY (`idTicket`),
    CONSTRAINT `fk_empleado_detalle` FOREIGN KEY (`idDetalleAtencion`) REFERENCES `detalleAtencion` (`idDetalleAtencion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

DROP TABLE IF EXISTS `inventario`;
 SET character_set_client = utf8mb4 ;
 CREATE TABLE `inventario` (
  `idInventario` int NOT NULL AUTO_INCREMENT,
   `idTicket`  int (11) not null,
    `idEquipo`  int (11) not null,
     `idProveedor`  int (11) not null,
      `idCDP`  int (11) not null,
  PRIMARY KEY (`idInventario`),
   CONSTRAINT `fk_empleado_ticket` FOREIGN KEY (`idTicket`) REFERENCES `ticket` (`idTicket`),
    CONSTRAINT `fk_empleado_equipo` FOREIGN KEY (`idEquipo`) REFERENCES `equipo` (`idEquipo`),
     CONSTRAINT `fk_empleado_proveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`),
      CONSTRAINT `fk_empleado_cdp` FOREIGN KEY (`idCDP`) REFERENCES `CDP` (`idCDP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;





-- FALTAN TABLA ENTRDAS Y SALIDAS TAMBIEN UNA TABLA (TECNICO S)