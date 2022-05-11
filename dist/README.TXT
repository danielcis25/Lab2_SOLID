===============================================================================
TÍTULO DEL PROYECTO: 3er Laboratorio Ing Software,Aplicacionn principios SOLID

VERSIÓN: 1.0 - 10/05/2022 
AUTOR: dcisneros@unicauca.edu.co
===============================================================================
DESCRIPCIÓN: App basica que nos permite guardar y recuperar vehículos,calcula
tarifa por el servicio que presta el parqueadero,esto segun el tipo de vehiculo 
ya sea camion,carro o moto.

Ejecucion: Se ejecuta desde la clase main ubicada en paqute "co.unicauca.parkinglot.presentation"

Instrucciones P.Unitaria: Las pruebas unitarias estan ubicadas en la carpeta
"Test Package" en el paquete co.unicauca.parkinglot.damain, este test cuenta 
con pruebas unitarias,donde se pone a prueba el correcto de los metodos implementados

Herramientas Usadas: Apache Netbeans IDE 13 y SQLite

Sorteo: En el dominion del negocio nos especifica que se debe crear un sorte
para los vehiculos de tipo "Camion", este sorteo consiste en si un camion 
tiene un tiempo de parqueo mayor a un dia, este podra participar con un boleto
para que su tarifa de parqueo sea 0(Gratis), a un camion se le asignara un boleto de 1 - 10
y el sistema generara un numero entre dicho rango, si el # del boleto del camino es igual 
al generado por el sistema, el participante ganara el sorteo y no se le cobrara dicho tiempo de parqueo
