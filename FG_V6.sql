-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS FG_V6;
USE FG_V6;

-- Crear la tabla Director
CREATE TABLE IF NOT EXISTS AdminSistema (
   id INT PRIMARY KEY AUTO_INCREMENT,
   nombre VARCHAR(255),
   correo VARCHAR(255),
   usuario VARCHAR(255),
   contraseña VARCHAR(255),
   curp VARCHAR(255),
   rfc VARCHAR(255),
   escolaridad VARCHAR(255),
   edad INT(10),
   telefono VARCHAR(22)

);

-- Crear la tabla Personal
CREATE TABLE IF NOT EXISTS Personal (
   id INT PRIMARY KEY AUTO_INCREMENT,
   nombre VARCHAR(255),
   usuario VARCHAR(255),
   contraseña VARCHAR(255),
   curp VARCHAR(255),
   rfc VARCHAR(255),
   fecha_contratacion DATE,
   correo VARCHAR(255),
   escolaridad VARCHAR(255),
   edad INT(10),
   telefono VARCHAR(22),
   rol VARCHAR(50),
   registrado_por INT
);
select * from Personal;
-- Crear la tabla Item
CREATE TABLE IF NOT EXISTS Item (
   id INT PRIMARY KEY AUTO_INCREMENT,
   nombre VARCHAR(255),
   clasificacion VARCHAR(255),
   descripcion TEXT,
   estado VARCHAR(255),
   prestamo VARCHAR(255),
   personal_id INT,
   FOREIGN KEY (personal_id) REFERENCES Personal(id)

);

-- Crear la tabla Reporte
CREATE TABLE IF NOT EXISTS Reporte (
   id INT PRIMARY KEY AUTO_INCREMENT,
   descripcion TEXT,
   fecha_inicio VARCHAR(255),
   fecha_fin VARCHAR(255),
   estado VARCHAR(255),
   personal_id INT,
   FOREIGN KEY (personal_id) REFERENCES Personal(id)
   -- Otras columnas específicas del reporte
);
Select * from Reporte where id =1 or fecha_inicio =2023-12-07;

CREATE TABLE IF NOT EXISTS Prestamo (
	id INT PRIMARY KEY AUTO_INCREMENT,
   inicio_prestamo DATE,
   fin_prestamo DATE,
   motivo TEXT,
   personal_id INT,
   item_id INT,
   FOREIGN KEY (personal_id) REFERENCES Personal(id),
   FOREIGN KEY (item_id) REFERENCES Item(id)
);
select * from Prestamo;
-- Crear la tabla Chat
CREATE TABLE IF NOT EXISTS Chat (
   id INT PRIMARY KEY AUTO_INCREMENT,
   emisor_id INT,
   receptor_id INT,
   asunto TEXT,
   mensaje TEXT,
   timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   FOREIGN KEY (emisor_id) REFERENCES Personal(id),
   FOREIGN KEY (receptor_id) REFERENCES Personal(id)
);

-- Crear Tabla para bitacora de incidentes
CREATE TABLE IF NOT EXISTS Bitacora (
    id INT AUTO_INCREMENT PRIMARY KEY,
    asunto VARCHAR(255), 
    descripcion_incidente TEXT,
    fecha_incidente DATE,
    id_usuario_registrador INT,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);

-- Crear tabla para registar Visitantes
CREATE TABLE IF NOT EXISTS RegistrarVisitantes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    cantidad_visitantes INT,
    fecha_registro DATE,
    id_usuario_registrador INT,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);

-- Crear Tabla para registrar Datos de Acceso del visitante
CREATE TABLE IF NOT EXISTS DatosAceso (
    id_visitante INT AUTO_INCREMENT PRIMARY KEY,
	nombrecompleto VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    correoElectronico VARCHAR(100),
    direccion VARCHAR(255),
    foto_identificacion BLOB, 
	motivo_visitante VARCHAR(255),
    descripcion_visitante TEXT,
    fecha_registro_visitante DATETIME,
	id_usuario_registrador INT,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);

-- Tabla para registrar actividades
CREATE TABLE IF NOT EXISTS Actividad (
    id INT AUTO_INCREMENT PRIMARY KEY,
    asunto TEXT,
    descripcion_actividad TEXT,
    fecha_actividad DATE,
    id_usuario_registrador INT,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);

-- Crear Tabla para las visitas (visitas guiadas/ agendar horiarios/ eventos )
CREATE TABLE IF NOT EXISTS VisitasAgendadas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    NombreVisitante VARCHAR(100) NOT NULL,
    CorreoVisitante VARCHAR(100),
    TelefonoVisitante VARCHAR(20),
    FechaVisita DATE NOT NULL,
    HoraInicio TIME NOT NULL,
    HoraFin TIME,
    Comentarios TEXT,
    EstadoVisita ENUM('Pendiente', 'Confirmada', 'Cancelada') DEFAULT 'Pendiente'
);

-- Crear Tabla Eventos
CREATE TABLE IF NOT EXISTS EventosMuseo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    Nombre_Evento VARCHAR(255) NOT NULL,
    Descripcion TEXT,
    Fecha_Inicio DATE NOT NULL,
    Fecha_Fin DATE,
    Hora_Inicio TIME,
    Hora_Fin TIME,
    Lugar VARCHAR(255),
    Cupo_Maximo INT,
    UNIQUE (Nombre_Evento)
);

-- Tabla para registrar Salas
CREATE TABLE IF NOT EXISTS Sala (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tematica TEXT,
    informacion_sala TEXT,
    fecha_sala DATE,
    id_usuario_registrador INT,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);


-- Insertar al director en la tabla Director
INSERT INTO AdminSistema (nombre, correo, usuario, contraseña, curp, rfc, escolaridad, edad, telefono)
VALUES ('Ramon', 'ramon@gmail.com','ramon123','123', 'ABC1111111', 'ABC22222222', 'Ing en Sistemas', '21', '5566778899');

 SELECT * FROM AdminSistema;

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('Juan Pérez', 'juan123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Investigador', 1);

SELECT * FROM Personal;

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('jose', 'jose123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Catalogador', 1);

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('Pedro', 'Pedro123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Catalogador', 1);

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('Y', 'Y123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Coordinador de personal', 1);

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('T', 'T123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Encargado de Catalogadores_Investigadores', 2);

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('V', 'V123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Director', 1);

-- Insertar un nuevo registro en la tabla 'Item'
INSERT INTO Item (nombre, clasificacion, descripcion, estado, prestamo)
VALUES ('Retrato', 'Pintura', 'Arte del siglo XV', 'Buen estado', 'Museo local');

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('z', 'z123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Jefe de seguridad', 1);

ALTER TABLE DatosAceso
MODIFY COLUMN foto_identificacion mediumblob;

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, registrado_por)
VALUES ('ot', 'ot123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Encargado del personal operativo y taquillas', 1);


SELECT * FROM Personal;

-- Insertar un nuevo registro en la tabla 'VisitasAgendadas'

INSERT INTO VisitasAgendadas (NombreVisitante, CorreoVisitante, TelefonoVisitante, FechaVisita, HoraInicio, HoraFin, Comentarios, EstadoVisita)
VALUES ('Omar', 'omar@gmail.com', '5512345678', '2023-12-18', '10:30', '11:30', 'Excelente servicio', 'Pendiente');

Select * from VisitasAgendadas;

-- Insertar un nuevo registro en la tabla 'Bitacora'
INSERT INTO Bitacora (asunto, descripcion_incidente, fecha_incidente) 
VALUES ('Item recuperado', 'Se devolvió un item extraviado', '2023-12-17');

-- Insertar un nuevo registro en la tabla 'EventoMuseo'
INSERT INTO EventosMuseo (Nombre_Evento, Descripcion, Fecha_Inicio, Fecha_Fin, Hora_Inicio, Hora_Fin, Lugar, Cupo_Maximo)
VALUES ('Visita guiada', 'Recorrido sobre el arte abstracto', '2023-12-15', '2023-12-18', '10:00:00', '12:00:00', 'Sala A', '30');

-- Insertar un nuevo registro en la tabla 'Visitantes'
INSERT INTO RegistrarVisitantes (cantidad_visitantes, fecha_registro) VALUES ('50', '2023-12-18');

-- Insertar un nuevo registro en la tabla 'Visitantes'
INSERT INTO RegistrarVisitantes (cantidad_visitantes, fecha_registro) VALUES ('100', '2023-12-19');

Select * from RegistrarVisitantes;
select * from Actividad;
select * from Sala;
select * from DatosAceso;
