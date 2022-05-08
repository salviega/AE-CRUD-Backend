# PruebasUnitariasMavem

# Actividad para CONCRETAR - Backend

Decidí trabajar con dos entidades para el taller, entidad PersonModel y entidad RolModel,
las cuales relacioné con una notación SpringBoot @OnetoMany (un RolModel a muchos PersonModel).
En una empresa se cuentran cargos que comparten varías personas, por ejemplo, en una empresa de 
desarrollo IT el área de desarrollo lo manejan empleados que se identifican con el rol
de programador, al igual que el área de adminstrativa habrán personas que se consideran contadores o tesoreros.
Eso quiere decir que los roles son compartidos, son muchas personas realizando una misma función. 
En las imágnes de Java Springboot que se muestran abajo, se anotan @OnetoMany las columnas de PersonModel con el
identificador (id) del rol a las personas.

![Screen Shot 2022-05-08 at 4 52 42 PM](https://user-images.githubusercontent.com/90350943/167318431-827b8339-2c1e-439b-9387-7439394082c2.png)

![Screen Shot 2022-05-08 at 4 52 35 PM](https://user-images.githubusercontent.com/90350943/167318474-516a573a-6c4a-4906-ad25-3d0684edac97.png)


Ya como segundo punto era requerido realizar las funciones CRUD en ambas entidades. En especial la función de
modificar, PUT como método htttp y pruebas unitarias de algunas métodos que realizan CRUD. 

![Screen Shot 2022-05-08 at 4 53 03 PM](https://user-images.githubusercontent.com/90350943/167318483-1808a4dc-252e-4358-ac22-e1a4752e359c.png)

![Screen Shot 2022-05-08 at 4 52 56 PM](https://user-images.githubusercontent.com/90350943/167318514-9b9e497f-589b-4861-bcc4-801c1ceec26b.png)
