import java.util.*
fun main() {

    //initialized empty vehicle set for our parking.
    var setOfVehicles = mutableSetOf<Vehicle>()

    //created vehicles to work with
    val car = Vehicle("ABC123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val bus = Vehicle("DEF456", VehicleType.BUS, Calendar.getInstance())
    val moto = Vehicle("GHI789", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val minibus = Vehicle("JKL123", VehicleType.MINI_BUS, Calendar.getInstance())
    val car2 = Vehicle("ABC123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")


    val parking = Parking(setOfVehicles)

    /*println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(moto))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(bus))
    println(parking.vehicles.contains(car2))*/
    println("------ADD-----")

    parking.addVehicle(car)
    parking.addVehicle(moto)
    parking.addVehicle(minibus)
    parking.addVehicle(bus)
    parking.addVehicle(car2)
}