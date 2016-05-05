DROP TABLE FOTOGRAFIA;
DROP TABLE CONCURSO;
DROP TABLE TUTORIAL;
DROP TABLE EVENTO;
DROP TABLE ARTICULO;
DROP TABLE USUARIO;

CREATE TABLE USUARIO (
    NOMBRE VARCHAR(50) NOT NULL,
    APELLIDOS VARCHAR(50) NOT NULL,
    NICK VARCHAR(50) PRIMARY KEY,
    LOCALIDAD VARCHAR(100) NOT NULL,
    EMAIL VARCHAR(100) UNIQUE NOT NULL,
    VISITAS INTEGER,
    PASSEMAIL VARCHAR(50) NOT NULL,
    PASSWORD VARCHAR(50) NOT NULL
    
    
);

CREATE TABLE ARTICULO (
    ID INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    NOMBRE VARCHAR(100),
    NICK VARCHAR(50),
    PRECIO REAL NOT NULL,
    ESTADOARTICULO CHAR NOT NULL CHECK (ESTADOARTICULO = 'R' OR ESTADOARTICULO = 'D' 
                            OR ESTADOARTICULO = 'V'),
    DESCRIPCION VARCHAR(50) NOT NULL,
    FOREIGN KEY (NICK) REFERENCES USUARIO(NICK)
);

CREATE TABLE EVENTO (
    NOMBRE VARCHAR (50) NOT NULL,
    FECHAINICIO DATE NOT NULL,
    FECHAFIN DATE NOT NULL,
    LOCALIZACION VARCHAR(50) NOT NULL,
    PARTICIPANTES INTEGER NOT NULL,
    HORAINICIO TIME NOT NULL,
    HORAFIN TIME NOT NULL
);

CREATE TABLE TUTORIAL (
    TITULO VARCHAR(100) NOT NULL,
    DESCRIPCION VARCHAR(100) NOT NULL

);

CREATE TABLE CONCURSO (
    TITULO VARCHAR(100),
    DESCRIPCION VARCHAR(100),
    FECHAINICIO DATE NOT NULL,
    FECHAFIN DATE NOT NULL,
    NICK VARCHAR(50),
    FOREIGN KEY (NICK) REFERENCES USUARIO(NICK)
);

CREATE TABLE FOTOGRAFIA(
    TITULO VARCHAR(100),
    NICK VARCHAR(50),
    FECHASUBIDA DATE NOT NULL,
    FOREIGN KEY (NICK) REFERENCES USUARIO(NICK)
    
);

