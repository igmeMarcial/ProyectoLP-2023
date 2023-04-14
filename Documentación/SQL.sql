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
(1, 'Asistente de almacen', '1'),
(2, 'Asistente de almacen', '1'),
(3, 'Jefe de operaciones', '1');

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
INSERT INTO `empleado` (`nombre`, `apellidos`, `sexo`, `fechaNacimiento`, `telefono`, `celular`, `email`, `idCargo`)
VALUES
('Juan', 'Pérez', 'M', '1990-01-01', '1234567', '987654321', 'juan.perez@gmail.com', 1),
('María', 'García', 'F', '1992-05-10', '2345678', '987654321', 'maria.garcia@gmail.com', 2),
('Pedro', 'Rodríguez', 'M', '1988-08-15', '3456789', '987654321', 'pedro.rodriguez@gmail.com', 3),
('Ana', 'Martínez', 'F', '1995-02-20', '4567890', '987654321', 'ana.martinez@gmail.com', 1),
('Luis', 'Sánchez', 'M', '1991-04-05', '5678901', '987654321', 'luis.sanchez@gmail.com', 2),
('Lucía', 'Fernández', 'F', '1989-09-12', '6789012', '987654321', 'lucia.fernandez@gmail.com', 3),
('Carlos', 'Gómez', 'M', '1994-03-25', '7890123', '987654321', 'carlos.gomez@gmail.com', 1),
('Sara', 'Pérez', 'F', '1993-07-30', '8901234', '987654321', 'sara.perez@gmail.com', 2),
('Javier', 'García', 'M', '1996-12-10', '9012345', '987654321', 'javier.garcia@gmail.com', 3),
('Laura', 'Rodríguez', 'F', '1990-06-15', '0123456', '987654321', 'laura.rodriguez@gmail.com', 1);


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
('12345678901', 'CH Technology', 'Categoría X', 'Solicitud Tipo 1', 'proveedora@example.com', '1234567890'),
('12345678901', 'Tecnología Max', 'Hardware', 'Compra de componentes', 'max@tecnologiamax.com', '555-1234'),
('23456789012', 'Infotech', 'Software', 'Servicios de desarrollo', 'info@infotech.com', '555-2345'),
('34567890123', 'Sistemas Inteligentes', 'Hardware', 'Compra de equipos', 'sistemasinteligentes@sistemasinteligentes.com', '555-3456'),
('45678901234', 'TecnoSoluciones', 'Servicios', 'Soporte técnico', 'ventas@tecnosoluciones.com', '555-4567'),
('56789012345', 'Redes y Comunicaciones', 'Hardware', 'Compra de routers', 'ventas@redesycomunicaciones.com', '555-5678'),
('67890123456', 'Desarrollo Innovador', 'Software', 'Servicios de programación', 'desarrolloinnovador@desarrolloinnovador.com', '555-6789'),
('78901234567', 'Tecnología Futura', 'Hardware', 'Compra de servidores', 'ventas@tecnologiafutura.com', '555-7890'),
('89012345678', 'Soluciones Virtuales', 'Software', 'Servicios de virtualización', 'solucionesvirtuales@solucionesvirtuales.com', '555-8901'),
('90123456789', 'Innovación Digital', 'Hardware', 'Compra de discos duros', 'ventas@innovaciondigital.com', '555-9012'),
('01234567890', 'Tecnología Avanzada', 'Software', 'Servicios de consultoría', 'ventas@tecnologiaavanzada.com', '555-0123'),
('12345678901', 'Comunicaciones y Sistemas', 'Hardware', 'Compra de switches', 'ventas@comunicacionesysistemas.com', '555-1234'),
('23456789012', 'Desarrollo Ágil', 'Software', 'Servicios de desarrollo web', 'ventas@desarrolloagil.com', '555-2345'),
('34567890123', 'Tecnología Inteligente', 'Hardware', 'Compra de cámaras de seguridad', 'ventas@tecnologiainteligente.com', '555-3456'),
('45678901234', 'Innovación Tecnológica', 'Software', 'Servicios de diseño gráfico', 'ventas@innovaciontecnologica.com', '555-4567'),
('56789012345', 'Computación Avanzada', 'Hardware', 'Compra de laptops', 'ventas@computacionavanzada.com', '555-5678'),
('67890123456', 'Desarrollo Tecnológico', 'Software', 'Servicios de desarrollo móvil', 'ventas@desarrollotecnologico.com', '555-6789'),
('78901234567', 'Sistemas Modernos', 'Hardware', 'Compra de impresoras', 'ventas@sistemasmodernos.com', '555-7890'),
('89012345678', 'Innovación y Tecnología', 'Software', 'Servicios de análisis de datos', 'ventas@innovacionytecnologia.com', '555-8901');

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
INSERT INTO equipo (nombre, marca, modelo, tipo, serie, ip) VALUES 
('Morphos', 'LG', '27UK650-W', 10, '678901', '192.168.0.10'),
('Laptop ', 'Dell', 'XPS 13', 10, '123456', '192.168.0.11'),
('Teclado ', 'Genius', 'SlimStar 8000', 10, '789012', '192.168.0.12'),
('PC Administrativa', 'HP', 'Z2 Mini G3', 10, '345678', '192.168.0.13'),
('Mouse ', 'Logitech', 'MX Master 3', 10, '901234', '192.168.0.14'),
('Caja', 'Thermaltake', 'Level 20 VT', 10, '567890', '192.168.0.15'),
('Gaveta', 'Seagate', 'Backup Plus', 10, '234567', '192.168.0.16'),
('Ticketera', 'Epson', 'EcoTank L3150', 10, '890123', '192.168.0.17'),
('Blastera', 'Samsung', 'U28E590D', 10, '456789', '192.168.0.18');



DROP TABLE IF EXISTS `categoria`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `categoria` (
  `idCategoria` int NOT NULL AUTO_INCREMENT,
  `nombreCategoria` varchar(200) NOT NULL,
  `descripcion` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;


INSERT INTO `categoria` (`nombreCategoria`, `descripcion`) VALUES
('Hardware', 'Productos electrónicos y componentes de computadora'),
('Software', 'Programas informáticos y aplicaciones'),
('Gestion', 'Herramientas y suministros de oficina'),
('Office 365', 'Suite de aplicaciones de productividad y colaboración en línea'),
('Servidores', 'Hardware y software para servidores y centros de datos'),
('Comunicaciones', 'Equipos de telecomunicaciones y servicios de comunicación'),
('Redes', 'Hardware y software de red y conectividad'),
('Validacion', 'Procesos y herramientas de garantía de calidad'),
('Terminales', 'Dispositivos y accesorios para puntos de venta y transacciones'),
('Requirimiento', 'Medios y entretenimiento en línea y físicos');


DROP TABLE IF EXISTS `detalleAtencion`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `detalleAtencion` (
  `idDetalleAtencion` int NOT NULL AUTO_INCREMENT,
  `estado` varchar(200) NOT NULL,
  `descripcion` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`iddetalleAtencion`)
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

 
 INSERT INTO `ticket` (`nombre`, `tipo`, `prioridad`, `categoria`, `fuenteSol`, `fechaApertura`, `idDetalleAtencion`)
VALUES 
    ('Requerimiento de ticketera', 1, 'Alta', 'Redes', 'Correo', '2023-04-13 09:00:00', 1),
    ('Requerimiento PC administrativo', 1, 'Media', 'Hardware', 'Teléfono', '2023-04-13 09:15:00',2),
    ('Requerimiento de software', 1, 'Baja', 'Sistemas', 'Portal web', '2023-04-13 10:00:00', 1),
    ('Requerimiento de seguridad', 1, 'Alta', 'Redes', 'Chat', '2023-04-13 10:30:00', 1);




INSERT INTO `detalleatencion` (`estado`, `descripcion`) VALUES
( 'Resuelto en Curso', 'La incidencia ha sido identificada y se está trabajando en su resolución'),
('Cerrado en Espera', 'La incidencia ha sido cerrada temporalmente y se espera una respuesta del cliente');


-- SELECT t.idTicket, t.nombre, t.tipo, t.prioridad, t.categoria, t.fuenteSol, t.fechaApertura, t.fechaResulucion, d.idDetalleAtencion as idDetalle, d.estado, d.descripcion FROM ticket t JOIN detalleAtencion d ON t.idDetalleAtencion = d.idDetalleAtencion WHERE t.idTicket= 1;
-- SELECT t.idTicket, t.nombre, t.tipo, t.prioridad, t.categoria, t.fuenteSol, t.fechaApertura, t.fechaResulucion, d.idDetalleAtencion as idDetalle, d.estado, d.descripcion FROM ticket t JOIN detalleAtencion d ON t.idDetalleAtencion = d.idDetalleAtencion;

DROP TABLE IF EXISTS `inventario`;
 SET character_set_client = utf8mb4 ;
 CREATE TABLE `inventario` (
  `idInventario` int NOT NULL AUTO_INCREMENT,
   `idTicket`  int (11) not null,
    `idEquipo`  bigint(20)  not null,
     `idProveedor`  int (11) not null,
        `stockInicial`  int (11) not null,
           `salidas`  int (11) not null,
              `total`  int (11) not null,
      `idCategoria`  int (11) not null,
  PRIMARY KEY (`idInventario`),
   CONSTRAINT `fk_empleado_ticket` FOREIGN KEY (`idTicket`) REFERENCES `ticket` (`idTicket`),
    CONSTRAINT `fk_empleado_equipo` FOREIGN KEY (`idEquipo`) REFERENCES `equipo` (`idEquipo`),
     CONSTRAINT `fk_empleado_proveedor` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`),
      CONSTRAINT `fk_empleado_cate` FOREIGN KEY (`idCategoria`) REFERENCES `categoria` (`idCategoria`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;



-- _____________________________________________successs_________________________________________


/* SELECT inv.idInventario, t.idTicket, t.nombre AS nombreTicket, eq.idEquipo, eq.nombre AS nombreEquipo, p.idProveedor, p.ruc AS rucProveedor, c.idCategoria, c.nombreCategoria AS nombreCategoria
 FROM inventario inv
 JOIN ticket t ON t.idTicket = inv.idTicket
 JOIN equipo eq ON eq.idEquipo = inv.idEquipo
 JOIN proveedor p ON p.idProveedor = inv.idProveedor
 JOIN categoria c ON c.idCategoria = inv.idCategoria;

-- SELECT inv.idInventario, t.nombre AS nombreTicket, eq.nombre AS nombreEquipo, p.ruc AS rucProveedor, c.nombreCategoria AS nombreCategoria
FROM inventario inv
JOIN ticket t ON t.idTicket = inv.idTicket
JOIN equipo eq ON eq.idEquipo = inv.idEquipo
JOIN proveedor p ON p.idProveedor = inv.idProveedor
JOIN categoria c ON c.idCategoria = inv.idCategoria;
*/
-- exec correct

































DROP TABLE IF EXISTS `detalleEquipo`;
SET character_set_client = utf8mb4 ;
CREATE TABLE `detalleEquipo` (
  `iddetalleEquipo` int NOT NULL AUTO_INCREMENT,
  `garantia` varchar(200) NOT NULL,
  `unidadStock` smallint(6) NOT NULL DEFAULT '0',
  `descripcion` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`iddetalleEquipo`)
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










-- FALTAN TABLA ENTRDAS Y SALIDAS TAMBIEN UNA TABLA (TECNICO S)