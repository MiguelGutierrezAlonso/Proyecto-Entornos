    -- Eliminar la base de datos si existe
    DROP DATABASE IF EXISTS Carniceria;

    -- Crear la base de datos Carniceria
    CREATE DATABASE Carniceria CHARACTER SET utf8 COLLATE utf8_spanish_ci;

    -- Seleccionar la base de datos recién creada
    USE Carniceria;

    CREATE TABLE Proveedores (
        ID_Proveedor INT(4) NOT NULL AUTO_INCREMENT primary key,
        Empresa VARCHAR(25) NOT NULL,
        Telefono varchar(15) NOT NULL,
        Direccion VARCHAR(255) NOT NULL
    );

    CREATE TABLE Clientes (
        ID_Cliente INT(5) NOT NULL AUTO_INCREMENT primary key,
        NIdentidad VARCHAR(15) UNIQUE NOT NULL,
        Nombre VARCHAR(20) NOT NULL,
        Apellido VARCHAR(25) NOT NULL,
        Telefono varchar(15) NOT NULL,
        Direccion VARCHAR(255)
    );

    CREATE TABLE Productos (
        ID_Producto INT(4) NOT NULL AUTO_INCREMENT primary key,
        Nombre VARCHAR(30) NOT NULL,
        Cantidad int(6) not null,
        Precio_Compra DECIMAL(6, 2) NOT NULL,
        Precio_Venta DECIMAL(6, 2) NOT NULL,
        Categoria varchar(20) NOT NULL,
        ID_Proveedor int(10) not null
    );

    CREATE TABLE Empleados (
    ID_Empleado INT(4) NOT NULL AUTO_INCREMENT PRIMARY KEY,
        NIdentidad VARCHAR(15) NOT NULL,
        Nombre VARCHAR(20) NOT NULL,
        Apellido VARCHAR(25) NOT NULL,
        Telefono varchar(15) NOT NULL,
        Usuario VARCHAR(15) NOT NULL,
        Password VARCHAR(255) NOT NULL,
        Sueldo DECIMAL(10, 2) NOT NULL,
        Direccion VARCHAR(50) NOT NULL,
        Admin BOOLEAN NOT NULL DEFAULT FALSE
    );

INSERT INTO Empleados (NIdentidad, Nombre, Apellido, Telefono, Usuario, Password, Sueldo, Direccion, Admin) 
VALUES ("12312312X", "Miguel", "Gutierrez", "612312312", "boss", "a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3", 2000.00, "Mi casa", true),
('12345678A', 'Carlos', 'García', '612345678', 'carlosgarcia', 'ef92b778bafe771e89245b89ecbc08a44a4e166c06659911881f383d4473e94f', 30000.00, 'Calle Falsa 123', FALSE),
('23456789B', 'Ana', 'Martínez', '622345678', 'anamartinez', 'c6ba91b90d922e159893f46c387e5dc1b3dc5c101a5a4522f03b987177a24a91', 32000.00, 'Avenida Siempre Viva 742', TRUE),
('34567890C', 'Luis', 'López', '632345678', 'luislopez', '5efc2b017da4f7736d192a74dde5891369e0685d4d38f2a455b6fcdab282df9c', 28000.00, 'Calle del Sol 5', FALSE),
('45678901D', 'María', 'Sánchez', '642345678', 'mariasanchez', '5c773b22ea79d367b38810e7e9ad108646ed62e231868cefb0b1280ea88ac4f0', 31000.00, 'Plaza Mayor 1', TRUE),
('56789012E', 'Javier', 'Pérez', '652345678', 'javierperez', 'fca4836976e56c23b1aa03a2815aef685b33e9bb1838130eaa6d30533c90bee1', 29000.00, 'Calle Luna 14', FALSE),
('67890123F', 'Laura', 'Gómez', '662345678', 'lauragomez', '47eccaf210b519f43c06494401bbcc02066d6c54cc30a19a763a532c04c5c34c', 27000.00, 'Calle Estrella 22', TRUE),
('78901234G', 'David', 'Fernández', '672345678', 'davidfernandez', '4f93067daa8232d8a58468fa645d6c5ff3b3adb8614e26857fa96e69245dc565', 26000.00, 'Avenida del Mar 45', FALSE),
('89012345H', 'Elena', 'Díaz', '682345678', 'elenadiaz', 'd2553b9e78fc047b9c7454d2a7928e6fbfff84eee56141271e93f144398a53d7', 32000.00, 'Calle del Río 30', TRUE),
('90123456I', 'José', 'Ruiz', '692345678', 'joseruiz', '2efe01a936a0d264615b22db60a20af1fb4c2041b0339f76d40af3ecd34a854a', 31000.00, 'Paseo de la Reforma 77', FALSE),
('01234567J', 'Marta', 'Jiménez', '612345679', 'martajimenez', 'c359b73350c3ba9deaebdeef38bc8bd5d3f17902907a7422cbad5a4e440c0f1b', 28000.00, 'Calle de la Paz 100', TRUE),
('12345678K', 'Sergio', 'Hernández', '622345679', 'sergiohernandez', 'cc0a3922602622537d23bac97d36235e03ea2c13191a9b1c3eeae2b86853b4c9', 27000.00, 'Avenida de los Pinos 55', FALSE),
('23456789L', 'Isabel', 'Torres', '632345679', 'isabeltorres', '4e83f96b9611d90798b28abea7e9f2b2cedbff8edc3bd7488bd248160b4fc83b', 30000.00, 'Calle de los Robles 90', TRUE),
('34567890M', 'Pedro', 'Ramírez', '642345679', 'pedroramirez', '4c395c424720e081493be06ec2fefa65c2925e0c3695f58e26f710edd9041ee1', 29000.00, 'Paseo del Prado 4', FALSE),
('45678901N', 'Patricia', 'Alonso', '652345679', 'patriciaalonso', '19cb0711df0a5c9915c57bc8209b23da7b9ecae22627bc957eb25bcf53182a81', 31000.00, 'Calle del Álamo 6', TRUE),
('56789012O', 'Raúl', 'Castro', '662345679', 'raulcastro', '644f72a3cc2b2729424618c7317594d4190928ff2150dff08c050d78ea59c779', 28000.00, 'Avenida de la Libertad 3', FALSE);

    CREATE TABLE ventas (
        ID_Pedido INT NOT NULL AUTO_INCREMENT primary key,
        ID_Cliente INT NOT NULL,
        Fecha DATE NOT NULL DEFAULT '2024-04-27',
        PrecioTotal double (10,2) not null
    );

    CREATE TABLE detalles (
        Id_Detalle int (11) AUTO_INCREMENT primary key,
        ID_Pedido INT NOT NULL,
        ID_Producto INT NOT NULL,
        Cantidad INT(10) NOT NULL,
        precio_Unitario double(10, 2) not null,
        precio_total double (10,2) not null
    );

    INSERT INTO Proveedores (Empresa, Telefono, Direccion) VALUES
        ('Meat Distributors Inc.', '911234567', 'Calle Mayor 10, Madrid'),
        ('Logistics Services Ltd.', '912345678', 'Avenida de la Constitución 25, Barcelona'),
        ('Gonzalez Meats', '913456789', 'Calle del Prado 14, Valencia'),
        ('Pérez Transport', '914567890', 'Calle de la Luna 33, Sevilla'),
        ('Martínez Supplies', '915678901', 'Avenida de los Pinos 77, Zaragoza'),
        ('López Appliances', '916789012', 'Calle del Sol 8, Bilbao'),
        ('Díaz Commercial', '917890123', 'Plaza Mayor 3, Málaga'),
        ('Sánchez Provider', '918901234', 'Calle de la Estrella 22, Murcia'),
        ('Fernández Burgers', '919012345', 'Avenida del Mar 45, Alicante'),
        ('Ruiz POLLOS ASADOS', '910123456', 'Calle de la Paz 100, Granada'),
        ('Jiménez Materials', '921234567', 'Calle de los Pinos 55, Córdoba'),
        ('Hernández Barbacues', '922345678', 'Avenida de los Robles 90, Valladolid'),
        ('Cheeses of the tower', '923456789', 'Calle de los Olivos 4, Vigo'),
        ('Ramírez Foods', '924567890', 'Paseo del Prado 4, Salamanca'),
        ('Alonso Supplies', '925678901', 'Calle del Álamo 6, Palma de Mallorca');


    INSERT INTO Clientes (NIdentidad, Nombre, Apellido, Telefono, Direccion) VALUES
        ('12345678A', 'María', 'García López', '612345678', 'Calle Gran Vía 12, Madrid'),
        ('23456789B', 'Juan', 'Martínez Fernández', '622345678', 'Avenida de América 22, Barcelona'),
        ('34567890C', 'Ana', 'Sánchez Rodríguez', '632345678', 'Calle Alcalá 15, Valencia'),
        ('45678901D', 'Luis', 'Pérez Gómez', '642345678', 'Calle de Serrano 10, Sevilla'),
        ('56789012E', 'Laura', 'González Sánchez', '652345678', 'Paseo de la Castellana 20, Zaragoza'),
        ('67890123F', 'Carlos', 'López Martínez', '662345678', 'Calle del Carmen 18, Bilbao'),
        ('78901234G', 'Marta', 'Díaz Álvarez', '672345678', 'Avenida de la Constitución 33, Málaga'),
        ('89012345H', 'José', 'Hernández Jiménez', '682345678', 'Calle del Sol 11, Murcia'),
        ('90123456I', 'Sara', 'Moreno Ruiz', '692345678', 'Calle de la Luna 44, Alicante'),
        ('01234567J', 'David', 'Muñoz Torres', '602345678', 'Calle de la Paz 55, Granada'),
        ('12345679K', 'Raquel', 'Romero Vázquez', '612346789', 'Calle del Prado 66, Córdoba'),
        ('23456780L', 'Pablo', 'Rubio Martínez', '622347890', 'Avenida del Mar 77, Valladolid'),
        ('34567891M', 'Elena', 'Ortiz Morales', '632348901', 'Calle Mayor 88, Vigo'),
        ('45678902N', 'Fernando', 'Alonso Ramos', '642349012', 'Paseo del Prado 99, Salamanca'),
        ('56789013O', 'Alicia', 'Castro Herrera', '652340123', 'Calle de los Pinos 101, Palma de Mallorca');


    INSERT INTO Productos (Nombre, Cantidad, Precio_Compra, Precio_Venta, Categoria, ID_Proveedor) VALUES
        ('Beef Fillet', 100, 5.50, 8.00, 'Beef', 1),
        ('Pork Chop', 150, 3.00, 5.00, 'Pork', 2),
        ('Chicken Breast', 200, 4.00, 6.50, 'Chicken', 3),
        ('Manchego Cheese', 50, 6.00, 10.00, 'Cheese', 4),
        ('Iberian Chorizo', 120, 4.50, 7.00, 'Saussage', 5),
        ('Burgos Blood Sausage', 100, 3.20, 5.50, 'Saussage', 6),
        ('Pork Loin', 80, 5.00, 8.50, 'Pork', 7),
        ('Beef Ribs', 90, 4.75, 7.50, 'Beef', 8),
        ('Chicken Wings', 130, 2.50, 4.00, 'Chicken', 9),
        ('Brie Cheese', 40, 5.00, 8.00, 'Cheese', 10),
        ('Salami', 110, 3.80, 6.00, 'Saussage', 11),
        ('York Ham', 70, 4.00, 6.50, 'Other', 12),
        ('Chicken Sausage', 150, 2.80, 4.50, 'Saussage', 13),
        ('Beef Liver', 60, 3.50, 5.50, 'Beef', 14),
        ('Ribeye Steak', 50, 8.00, 12.00, 'Beef', 15);


