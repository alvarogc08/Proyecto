# Proyecto del Segundo Cuatrimestre Fundamentos de Programaci�n (Curso 22\23)
Autor/a: �lvaro G�mez Campos   uvus: alvgomcam

Aqu� debes a�adir la descripci�n del dataset y un enunciado del dominio del proyecto.


## Estructura de las carpetas del proyecto

* **/src**: Contiene los diferentes archivos que forman parte del proyecto. Debe estar estructurado en los siguentes paquetes
  * **fp.tipos**: Paquete que contiene los tipos del proyecto.
  * **fp.tipos.test**: Paquete que contiene las clases de test del proyecto.
  * **fp.common**: Paquete que contiene los tipos auxiliares del proyecto
  * **fp.utiles**:  Paquete que contiene las clases de utilidad. 
* **/data**: Contiene el dataset o datasets del proyecto
    * **PartidosMadrid.csv**: Una lista con los partidos de liga del Real Madrid en la temporada 2021/2022

    
## Estructura del *dataset*

El dataset est� compuesto por 8 columnas, con la siguiente descripci�n:

* **Rival**: de tipo String, representa el nombre del rival del Real Madrid en ese partido.
* **Fecha y Hora**: de tipo LocalDateTime, representa la fecha y hora de comienzo del partido.
* **Local **: de tipo Boolean, determina si el Real Madrid fue local (devuelve True) o visitante (devuelve False).
* **Audiencia**: de tipo Double, representa la audiencia en millones por TV de ese partido.
* **Goles Real Madrid**: de tipo Integer, representa los goles que el Real Madrid marc� en ese partido.
* ** Goles Rival**: de tipo Integer, representa los goles que el rival marc� en ese partido.
* ** Resultado**: de tipo Resultados, determina si el partido acab� en victoria, empate o derrota para el Real Madrid
* ** Jugadores**: de tipo Lista, es una lista de longitud variable de 2 a 6 unidades con jugadores de cada partido.

## Tipos implementados

### Tipo Base

El tipo base es el tipo Partido.
Adem�s, hay un tipo enumerado para los resultados, con los valores 'victoria', 'derrota' o 'empate'.
**Propiedades**:

- _rival_, de tipo String, consultable y modificable. 
- _fechaHora_, de tipo LocalDateTime, consultable y modificable. 
- _fueLocal_, de tipo Boolean, consultable y modificable.
- _audiencia_,de tipo Double, consultable y modificable.
- _golesMadrid_,de tipo Integer, consultable y modificable.
- _golesRival_,de tipo Integer, consultable y modificable.
- _resultado_,de tipo Resultados, consultable y modificable.
- _jugadores_,de tipo Lista, consultable y modificable.
- _diferenciaGoles_, de tipo Integer, que es el resultado en valor absoluto de la diferencia
	 entre los goles del Real Madrid y los del final, solo consultable.
- _reumenPartido_, de tipo Integer, representa el resultado final del partido con los goles tanto del Real Madrid como del rival.
**Constructores**: 

- C1: Recibe como par�metros el nombre del rival, la fecha y hora del partido y el resultado.
- C2: Rrecibe como par�metros los mismos que C1 y adem�s tambi�n la audiencia.


**Restricciones**:
 
- R1: Si el a�o del partido es diferente a 2021 o 2022, el partido no es de esa temporada.
- R2: La audiencia no puede ser negativa.

**Criterio de igualdad**: Dos partidos son iguales si fueron contra el mismo rival, el mismo d�a y el resultado fue el mismo.

**Criterio de ordenaci�n**: Primero se ordenar� por rival, si es el mismo, por la fecha y si es la misma se ordenar� por el resultado.


#### Tipos auxiliares
**Partido**, recibe como par�metros el rival, sus goles y los del Real Madrid para hacer la propiedad resumenPartido.

### Factoría
Descripción breve de la factoría.

- _método 1_: Descripción del método 1.
-	_método 2_: Descripción del método 2.

### Tipo Contenedor

Descripción breve del tipo contenedor.

**Propiedades**:

- _propiedad1_, de tipo \<Tipo1\>, consultable. 
- _propiedad2_, de tipo \<Tipo2\>, consultable y modificable. 
- ...
- 
**Constructores**: 

- C1: Descripción del constructor 1.
- C2: Descripción del constructor 2.
- ...

**Restricciones**:
 
- R1: Descripción de la restricción 1.
- R2: Descripción de la restricción 2.
- ...
- 
**Criterio de igualdad**: Describir el criterio de igualdad

**Criterio de ordenación**: Describir el criterio de ordenación (si lo hay).

**Otras operaciones**:
 
-	_método 1_: Descripción del método 1.
- ...
