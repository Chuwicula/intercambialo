--Creación de las tablas de la base de Datos
--Eliminar tablas
Drop table Credenciales;
Drop table OrdenEnvio;
Drop table Solicitud;
Drop table Elemento;
Drop table Categoria;
Drop table EstadoElemento;
Drop table usuario;
Drop table Rol;
--Creación de la tabla Rol
create table Rol (
	IdRol serial primary key,
	NombreRol varchar(50) NOT NULL	
);
--Creación de la tabla Usuario
create table Usuario(
	IdUsuario serial primary key,
	IdRol int NOT NULL,
	NombreU varchar (100) NOT NULL,
	TipoDocumentoU varchar (30),
	DireccionU varchar (20) NOT NULL,
	FechaNacimientoU date,
	foreign key (IdRol) references Rol (IdRol)
);
--Creación de la tabla EstadoElemento
create table EstadoElemento (
	IdEstadoElemento serial Primary key,
	NombreEstadoElemento varchar(50) NOT NULL
);
--Creación de la tabla categoria
create table Categoria (
	IdCategoria serial Primary key ,
	NombreCategoria varchar(70) NOT NULL
);
-- Creación de la tabla Elemento
create table Elemento (
	IdElemento serial Primary key,
	IdUsuario int NOT NULL,
	IdEstadoElemento int NOT NULL,
	IdCategoria int NOT NULL,
	NombreElemento varchar (100) NOT NULL,
	Descripcion varchar(200),
	foreign key (IdUsuario) references Usuario(idUsuario),
	foreign key (IdEstadoElemento) references EstadoElemento (IdEstadoElemento),
	foreign key (IdCategoria) references Categoria (IdCategoria)
);
--Creación de la tabla Solicitud
create table Solicitud (
	IdSolicitud serial Primary key,
	IdUsuarioSolicitante int NOT NULL,
	IdElementoSolicitado int NOT NULL,
	Estado boolean NOT NULL,
	foreign key (IdUsuarioSolicitante) references Usuario (IdUsuario),
	foreign key (IdElementoSolicitado) references Elemento (IdElemento)
);
--Creación de la tabla OrdenEnvio
create table OrdenEnvio (
	IdOrdenEnvio serial Primary key,
	IdSolicitud int NOT NULL,
	DireccionOrigen varchar(20) NOT NULL,
	NombreOrigen varchar (100) NOT NULL,
	NombreDestino varchar (100) NOT NULL,
	DireccionDestino varchar(20) NOT NULL,
	foreign key (IdSolicitud) references Solicitud (IdSolicitud)
);
--Creación tabla de credenciales
create table Credenciales (
	IdUsuario serial Primary key,
	usuario varchar(100) UNIQUE NOT NULL,
	contraseña varchar (20) UNIQUE NOT NULL,
	foreign key (IdUsuario) references Usuario (IdUsuario)
)

