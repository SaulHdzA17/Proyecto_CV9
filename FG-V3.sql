-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS FG_V3;
USE FG_V3;

-- Crear la tabla Director
CREATE TABLE IF NOT EXISTS Director (
   id INT PRIMARY KEY AUTO_INCREMENT,
   nombre VARCHAR(255),
   correo VARCHAR(255),
   usuario VARCHAR(255),
   contraseña VARCHAR(255)

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
   director_id INT,
   FOREIGN KEY (director_id) REFERENCES Director(id)

);

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

CREATE TABLE IF NOT EXISTS Prestamo (
	id INT PRIMARY KEY AUTO_INCREMENT,
   incio_prestamo DATE,
   fin_prestamo DATE,
   motivo TEXT,
   personal_id INT,
   item_id INT,
   FOREIGN KEY (personal_id) REFERENCES Personal(id),
   FOREIGN KEY (item_id) REFERENCES Item(id)
);

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
CREATE TABLE IF NOT EXISTS bitacora (
    id_reporte INT AUTO_INCREMENT PRIMARY KEY,
    descripcion_incidente TEXT,
    fecha_incidente DATE,
    id_usuario_registrador INT,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);

-- Crer tabla para registar Visitantes
CREATE TABLE IF NOT EXISTS Visitantes (
    id_visita INT AUTO_INCREMENT PRIMARY KEY,
    cantidad_visitantes INT,
    fecha_registro DATE,
    id_usuario_registrador INT,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);

-- Crear Tabla para registrar visitante
CREATE TABLE IF NOT EXISTS Visitante (
    id_visitante INT AUTO_INCREMENT PRIMARY KEY,
    descripcion_visitante TEXT,
    motivo_visitante VARCHAR(255),
    id_usuario_registrador INT,
    fecha_registro_visitante DATETIME,
    FOREIGN KEY (id_usuario_registrador) REFERENCES Personal(id)
);


-- Insertar al director en la tabla Director
INSERT INTO Director (nombre, correo, usuario, contraseña)
VALUES ('Ramon', 'ramon@gmail.com','ramon123','123');

SELECT * FROM Director;

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, director_id)
VALUES ('Juan Pérez', 'juan123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Investigador', 1);

SELECT * FROM Personal;

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, director_id)
VALUES ('jose', 'jose123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Catalogador', 1);

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, director_id)
VALUES ('Pedro', 'Pedro123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Catalogador', 1);

-- Insertar un nuevo registro en la tabla 'Personal'
INSERT INTO Personal (nombre, usuario, contraseña, curp, rfc, fecha_contratacion, edad, rol, director_id)
VALUES ('Y', 'Y123', '123', 'ABC123456XYZ', 'RFC123456XYZ', '2022-01-01', 30, 'Coordinador de personal', 1);

SELECT * FROM Chat
WHERE emisor_id = 1
ORDER BY timestamp;