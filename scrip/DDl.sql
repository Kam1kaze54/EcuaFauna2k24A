-- database: ../Database/Ecuafauna.sqlite
/*
|----------------------------------------|
| (©) 2K24 EPN-FIS, All rights reserved. |
| justin.ortiz@epn.edu.ec       kam1kaze |
|----------------------------------------|
Autor : Justin Ortiz 
Fecha : 15.agosto.2k24
Script: Creacion de la estructura de datos para EcuaFauna
*/

DROP TABLE IF EXISTS Hormiga;
DROP TABLE IF EXISTS Alimento;
DROP TABLE IF EXISTS Pais;
DROP TABLE IF EXISTS Region;
DROP TABLE IF EXISTS Provincia;


CREATE TABLE Hormiga (
    IdHormiga INTEGER PRIMARY KEY AUTOINCREMENT,
    TipoHormiga TEXT NOT NULL,
    Sexo TEXT NOT NULL,
    Provincia TEXT,
    Estado TEXT NOT NULL,
    IdAlimento INTEGER,
    FOREIGN KEY (IdAlimento) REFERENCES Alimento(IdAlimento)
);


CREATE TABLE Alimento (
    IdAlimento INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,IngestaNativa      TEXT NOT NULL
    ,GenoAlimento       TEXT
    ,Observacion        TEXT
    ,Estado             VARCHAR(1) NOT NULL DEFAULT 'A'
    ,FechaCreacion      DATETIME DEFAULT(datetime('now', 'localtime'))
    ,FechaModifica      DATETIME
);

CREATE TABLE Pais (
    IdPais INTEGER PRIMARY KEY AUTOINCREMENT,
    Nombre TEXT NOT NULL,
    IdRegion INTEGER,
    FOREIGN KEY (IdRegion) REFERENCES Region(IdRegion)
);

CREATE TABLE Region (
    IdRegion INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT
    ,Nombre   TEXT NOT NULL
    ,FechaCreacion DATETIME DEFAULT(datetime('now', 'localtime'))
    ,FechaModifica DATETIME
    
);

CREATE TABLE Provincia (
    IdProvincia INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
    Nombre TEXT NOT NULL,
    IdRegion INTEGER NOT NULL,
    FechaCreacion DATETIME DEFAULT(datetime('now', 'localtime')),
    FechaModifica DATETIME,
    FOREIGN KEY (IdRegion) REFERENCES Region(IdRegion)
);
