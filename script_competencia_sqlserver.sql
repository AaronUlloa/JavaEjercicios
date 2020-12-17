create database siscomp
go
use siscomp
create table datos_proyecto(
    id int identity(1,1) primary key not null,
    inversion_total decimal(9,2) not null,
	porcentaje_financiamiento decimal(9,2) not null,
	porcentaje_tasa_prestamo decimal(9,2) not null,
	plazo_prestamo int not null,
	metodo_amortizacion nvarchar(25) not null,
	Ingresos_primer_anho decimal(9,2) not null,
	porcentaje_crecimiento_anual_ingresos decimal(9,2) not null,
	costos_produccion_primer_anho decimal(9,2) not null,
	porcentaje_crecimiento_costos_produccion_anual decimal(9,2) not null,
	gastos_administrativos_anuales decimal(9,2) not null,
	gastos_ventas_anuales decimal(9,2) not null,
	porcentaje_gastos_depreciacion_anual decimal(9,2) not null,
	porcentaje_valor_residual_activo_fijo decimal(9,2) not null,
	vida_util_proyecto int not null,
	porcentaje_tasa_minima_retorno_TMAR decimal(9,2) not null 
   )

   insert into datos_proyecto values(200000,40,26,5,'Couta nivelada',130000,12,15000,15,10000,12000,15,25,5,28)
   
   select * from datos_proyecto

