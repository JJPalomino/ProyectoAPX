# Escenario: Almacenamiento de Información de Clientes en Oracle

En este escenario, nos enfrentamos al desafío de almacenar la información de un cliente en una base de datos Oracle mediante un proceso de inserción. Para garantizar la consistencia y cumplir con ciertos estándares, se han establecido restricciones y requisitos específicos que deben ser seguidos rigurosamente.

## Restricciones

- **Nombre de la tabla**:  
  La tabla debe estar dentro del esquema `WIKJ` y nombrarse como `T_WIKJ_HAB_PRUEBAFINAL`.

- **Campos de la tabla**:  
  Los campos necesarios son los siguientes (aunque en la base de datos todos se almacenarán como `VARCHAR`, en el diseño inicial se especifican así):  
  - `id` (`VARCHAR(5)` NOT NULL PRIMARY KEY, `String` en Java)  
  - `nuip` (`VARCHAR(10)`, `String` en Java)  
  - `full_name` (`VARCHAR(50)`, `String` en Java)  
  - `phone` (`VARCHAR(15)`, `String` en Java)  
  - `address` (`VARCHAR(30)`, `String` en Java)
    
    ![Image](https://github.com/user-attachments/assets/50e7edfb-03a4-425f-a30d-d56e31933165)

- **Validación del `nuip`**:  
  Antes de insertar la información, se debe validar que el `nuip` no exista previamente en la tabla. No se permite sobreescribir ni duplicar registros basados en este campo.

- **Prácticas seguras**:  
  Se prohíben prácticas inseguras como:  
  - Consultas del tipo `SELECT *`.  
  - Inserciones con sintaxis genérica como `(?, ?, ?, ?, ?)`.  
  Estas prácticas son consideradas malas prácticas de programación, pueden introducir riesgos de seguridad y afectar la integridad de la base de datos. Se exige un enfoque específico y seguro para acceder y manipular los datos.

## Proceso y Salida

- **Salida esperada**:  
  La salida debe reflejar la misma información proporcionada como entrada. Esto se logra mediante:  
  - Una consulta `SELECT` utilizando el `id` recibido.  
  - O devolviendo directamente la información de entrada. La correcta ejecución de la inserción será validada.
 
![Image](https://github.com/user-attachments/assets/020a66de-d9e4-4d2d-a76e-ed2d937ac09f)

### Entrada y salida en Postman ###

![Image](https://github.com/user-attachments/assets/0a1c3a0a-77ee-42ca-8389-8f961ff4520a)

## Herramientas y Procedimientos

- **Uso de `apx-cli`**:  
  Se debe emplear `apx-cli` para crear:  
  - El DTO (Data Transfer Object).  
  - La librería de negocio.  
  - La transacción.

- **Conexión a la base de datos**:  
  Se requiere utilizar la utilidad JDBC generada por `apx-cli` para gestionar la conexión con la base de datos Oracle.

## Pruebas y Validación
### Entrada y salida en Postman ###

![Image](https://github.com/user-attachments/assets/0a1c3a0a-77ee-42ca-8389-8f961ff4520a)

### Entrada de un Json con el mismo nuip ###

![Image](https://github.com/user-attachments/assets/2c72795d-ec4c-4543-be88-8b252543d31c)

No me lo genera en la base de datos aunque se marque un OK

![Image](https://github.com/user-attachments/assets/67262f86-a912-4e2c-bf6c-202b4a1131e6)

## Componentes Esenciales

- **DTOs obligatorios**:  
  - Un DTO de entrada.  
  - Un DTO de salida.  
  Ambos deben pasar por la librería de negocio como parte del procesamiento.

![Image](https://github.com/user-attachments/assets/3c4f5b26-5f1b-4c6c-aa12-244f6a733dbb)

## Capturas de la correcta compilación e instalación
![Image](https://github.com/user-attachments/assets/f319a9e6-9db3-4fed-b8ee-2ff2b1ea2af3)

![Image](https://github.com/user-attachments/assets/a9584651-6e51-4cd3-b188-4f85831ed631)

