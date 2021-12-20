data class Parking(val vehicles: MutableSet<Vehicle>) {
    /*Definimos vehicles como un Set porque de esta manera no van a haber vehiculos repetidos,
       ya que tienen un identificador unico, y lo unico que necesitamos es saber si estan o no
       estan en el set, no necesitamos saber el orden */
}