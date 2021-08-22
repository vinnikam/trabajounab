
/**
 * Author:  Vinni
 * Created: 20/08/2021
 */
--Mysql 
create database `libreta_bd`;
CREATE USER 'contacto' IDENTIFIED BY 'clave';
GRANT USAGE ON *.* TO 'contacto'@'%' IDENTIFIED BY 'clave';
GRANT ALL privileges ON `libreta_bd`.* TO 'contacto'@'%';

CREATE TABLE contactos
(
  identificador serial NOT NULL,
  nombre text,
  apellidos text,
  telefono numeric(10),
  correo text,
  empresa text,
  CONSTRAINT contactos_pkey PRIMARY KEY (identificador)
)

CREATE TABLE contactos (
    identificador BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) ,
    apellidos VARCHAR(100) ,
    correo VARCHAR(50) ,
    empresa VARCHAR(50) ,
    telefono numeric(10,0),
    favorito boolean);

-- INSERCION
insert into contactos (nombre,apellido, correo, empresa, telefono, favorito) 
values ('helios', 'fernandez', 'c@', 'rcn', 123, true);

select * from contactos where identificador = 3;

select nombre, correo from contactos;

update contactos set nombre = 'jorge';

update contactos set nombre = 'jorge'
where telefono = 123;

update contactos set nombre = 'jorge'
where telefono = 123;

update contactos set nombre = 'PABLO', apellidos = '', correo = '', empresa = '', telefono = 0, favorito = true
where identificador = 3;


delete from contatos
where identificador = 3;