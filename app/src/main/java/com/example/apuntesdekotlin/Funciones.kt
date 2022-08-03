package com.example.apuntesdekotlin

//Recordamos que la funcion main es donde va el codigo que se va a ejecutar.
fun main(){
    pintamosEnPantalla()

    //Al no haber indicado private en esta funcion podemos llamarla desde otro archivo o clase.
    //al crear la funcion sin especificar nada, automaticamente se considera public .
    miPrimeraFuncion("Argumentos")



}//Fin de la funcion principal main.
//-------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------

//Al poner private delante de la funcion, le estamos diciendo que solo funconara en este archivo o clase.
//si le decimos que la funcion es de tipo : Unit no retornara datos (por defecto viene asi, no hace falta ponerlo)
// Unit es lo mismo que void .
private fun pintamosEnPantalla(): Unit {
    println("===== Aprendiendo los Tipos de Funciones =====")
}
