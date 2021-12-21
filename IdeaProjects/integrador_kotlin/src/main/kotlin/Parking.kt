
data class Parking(val vehicles: MutableSet<Vehicle>) {
    /* EXERCISE 1: Definimos vehicles como un Set porque de esta manera no van a haber vehiculos repetidos,
       ya que tienen un identificador unico, y lo unico que necesitamos es saber si estan o no
       estan en el set, no necesitamos saber el orden */

    //Maximum amount of space per Parking
    val availableSpace = 20

    //EXERCISE 5: created the addVehicle function
    fun addVehicle(vehicle: Vehicle): Boolean{
        return when{
            vehicles.size < 20 -> {
                if (vehicles.add(vehicle)){
                    println("Welcome to AlkeParking!")
                    true
                }else{
                     println("Sorry, the check-in failed because the vehicle is already in the parking")
                    false
                }
            }

            else -> {
                println("Sorry, the check-in failed")
                false
            }
        }
    }
}