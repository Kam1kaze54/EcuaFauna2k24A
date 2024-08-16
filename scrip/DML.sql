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
INSERT INTO Hormiga (TipoHormiga, Sexo, Provincia, Estado, IdAlimento) VALUES
('Reina', 'Femenino', 'Pichincha', 'Activo', 1),  
('Obrera', 'Femenino', 'Guayas', 'Activo', 2),
('Soldado', 'Masculino', 'Azuay', 'Activo', 3),
('Larva', 'Indeterminado', 'Loja', 'Activo', 4);


INSERT INTO Alimento (IngestaNativa, GenoAlimento, Observacion) VALUES
('Herviboro', 'Az1', 'Alimento dulce para hormigas')
,('Carnivoro', 'Pr2', 'Suplemento proteico para desarrollo')
,('Omnivoro', 'Gr3', 'Alimento sólido y nutritivo')
,('Insectivoro', 'Fr4', 'Alimento variado para el consumo');

INSERT INTO Region (Nombre) VALUES
('Región Sierra')
,('Región Costa')
,('Región Oriente')
,('Región Galapagos');

INSERT INTO Pais (Nombre, IdRegion) VALUES
('Ecuador', 1),  
('Colombia', 2),
('Perú', 3),
('Brasil', 4),
('Chile', 5);



INSERT INTO Provincia (Nombre, IdRegion) VALUES
('Pichincha', 1),
('Guayas', 2),
('Azuay', 1),
('Loja', 1);


