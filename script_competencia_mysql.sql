create database siscomp;
use siscomp;

create table datos_proyecto(
	id int auto_increment primary key not null,
    inversion_total decimal not null,
    porcentaje_financiamiento decimal not null,
    porcentaje_tasa_prestamo decimal not null,
    plazo_prestamo int not null,
    metodo_amortizacion varchar(50) not null,
    Ingresos_primer_anho decimal not null,
    porcentaje_crecimiento_anual_ingresos decimal not null,
    costos_produccion_primer_anho decimal not null,
    porcentaje_crecimiento_costos_produccion_anual decimal not null,
    gastos_administrativos_anuales decimal not null,
    gastos_ventas_anuales decimal not null,
    porcentaje_gastos_depreciacion_anual decimal not null,
    porcentaje_valor_residual_activo_fijo decimal not null,
    vida_util_proyecto int not null,
    porcentaje_tasa_minima_retorno_TMAR decimal not null
);

insert into datos_proyecto values (0,200000,40,26,5,'Cuota Nivelada',130000,12,15000,15,10000,12000,15,25,5,28);

    
select * from datos_proyecto
