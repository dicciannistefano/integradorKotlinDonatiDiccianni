import java.util.*
fun main() {

    //initialized empty vehicle set for our parking.
    var setOfVehicles = mutableSetOf<Vehicle>()

    //created vehicles to work with
    val car = Vehicle("ABC123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val bus = Vehicle("DEF456", VehicleType.BUS, Calendar.getInstance())
    val moto = Vehicle("GHI789", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val minibus = Vehicle("JKL123", VehicleType.MINI_BUS, Calendar.getInstance())
    val car2 = Vehicle("ABC1230", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car3 = Vehicle("ABC1243", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val bus2 = Vehicle("DEF4556", VehicleType.BUS, Calendar.getInstance())
    val moto2 = Vehicle("GHI7869", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val minibus2 = Vehicle("JKL1423", VehicleType.MINI_BUS, Calendar.getInstance())
    val car4 = Vehicle("ABC1123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car5 = Vehicle("ABC1723", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val bus3 = Vehicle("DEF4956", VehicleType.BUS, Calendar.getInstance())
    val car9 = Vehicle("ABC1231", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val moto3 = Vehicle("GHI7089", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val minibus3 = Vehicle("JKL1323", VehicleType.MINI_BUS, Calendar.getInstance())
    val car6 = Vehicle("ABC129", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val car7 = Vehicle("BCA123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    val bus4 = Vehicle("DEF106", VehicleType.BUS, Calendar.getInstance())
    val moto4 = Vehicle("YYI789", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002")
    val minibus4 = Vehicle("JKL553", VehicleType.MINI_BUS, Calendar.getInstance())
    val car8 = Vehicle("ARC153", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")

    //created array for adding vehicles
    val createdVehicles = arrayOf(car,bus,moto,minibus,car2,car3,bus2,moto2,minibus2,car4,car5,bus3,car9,moto3,minibus3,car6,car7,bus4,moto4,minibus4,car8)

    //assigned setOfVehicles to parking
    val parking = Parking(setOfVehicles)

    println("------ADD-----")
    //for loop to add all the vehicles in the array
    createdVehicles.forEach {parking.addVehicle(it)}
}