
data class Parking(val vehicles: MutableSet<Vehicle>) {
    /* EXERCISE 1: We defined vehicles as a Set, because this way we can avoid repeats of vehicles,
        given that each one has a unique identifier, and we only need to know if they are or aren't in the set,
        we don't need to know the order. */

    private var parkingData = Pair(0,0)

    //Maximum amount of space per Parking
    private val maxAvailableSpace = 20

    //EXERCISE 11:
    fun editParkingData(vehicleFee: Int){
        parkingData = parkingData.copy(first = parkingData.first + 1 ,second = parkingData.second + vehicleFee)
    }
    fun showParkingData(){
        println("\n PARKING DATA:")
        println("${parkingData.first} vehicles have checked out and have earnings of $${parkingData.second}")
    }

    //EXERCISE 12:
    fun listVehicles(){
        println(" \n Current vehicles in the parking(${vehicles.size}):")
        vehicles.forEach { println("Plate: ${it.plate}, Vehicle type: ${it.type}") }
    }


    //EXERCISE 5: created the addVehicle function
    fun addVehicle(vehicle: Vehicle): Boolean{
        return when{
            vehicles.size < maxAvailableSpace -> {

                //evaluates if vehicle plate exists in set
                if (vehicles.add(vehicle)){
                    println("Vehicle with plate ${vehicle.plate}, Welcome to AlkeParking!")
                    true
                }else{
                     println("Vehicle with plate ${vehicle.plate} sorry, the check-in failed because the vehicle is already in the parking")
                    false
                }
            }
            else -> {
                println("Vehicle with plate ${vehicle.plate} sorry, the check-in failed, we're full")
                false
            }
        }
    }

    fun removeVehicle(vehicle: Vehicle): Boolean{
        if(vehicles.contains(vehicle)){
            vehicles.remove(vehicle)
            return true
        }
        return false
    }
}