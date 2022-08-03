package com.example.apuntesdekotlin

/***
 * La Funcion main es la principal donde tiene que ir lo que se vaya a ejecutal
 */
fun main (){
    // 1º, Llamamos a la funcion miPrimeraFuncion y le pasamos el parametro tipo String.
    miPrimeraFuncion("Aprendiendo Kotlin")

/*++++++++++++++++++++++++++++++++++++++++VARIABLES++++++++++++++++++++++++++++++++++++++++++++++++++
* val define las constantes.
* var define las variables
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++* */
    miPrimeraFuncion("Constantes y Variable")

    val a = 2 //El valor de "a" es constante y no puede ser cambiado.
    println("La Constante a tiene un valor fijo de: $a")

    println()

    var b = 3 //El valor de "b" puede ser modificado cada vez que se declare. ahora vale 3.
    println("La Variable b tiene un valor inicial de: $b")
    b = 4 // y ahora se le da el valor de 4.
    println("La Variable b se ha declarado nuevamente con un nuevo valor que es: $b")

    println()

    //En Kotlin no puede haber una variable NULL, por lo que si podemos llegar a tener una variable
    //que pueda ser NULL , despues de indicar el tipo ( que se le indica con : despues del nombre de la variable)
    // tenemos que poner el simbolo de ? ; de esta forma interpreta que puede contener un valor nulo.
    var objetoNull: Any? //Any indica que la variable puede ser de cualquier tipo.
    objetoNull = null
    println( "La variable objetoNull puede tener un valor : $objetoNull")

}//Fin de la Funcion main.
//--------------------------------------------------------------------------------------------
//--------------------------------------------------------------------------------------------



/*++++++++FUNCION Basica ++++++++++++++++++++++++
* las funcienos pueden requerir parametros o no
++++++++++++++++++++++++++++++++++++++++++++++* */
//Funciones con paso de Parametros.
fun miPrimeraFuncion(tipo: String){
    print("\n ================== $tipo ======================\n")
    //Con el simbolo $ podemos llamar la parametro dentro de un string.
}//fin de miPrimeraFuncion.