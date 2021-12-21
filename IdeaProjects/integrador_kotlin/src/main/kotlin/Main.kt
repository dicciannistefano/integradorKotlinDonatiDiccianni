import java.util.*
fun main() {

    //initialized empty vehicle set for our parking.
    val setOfVehicles = mutableSetOf<Vehicle>()

    //created vehicles to work with
    val createdVehicles = arrayOf(
    Vehicle("ABC123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("DEF456", VehicleType.BUS, Calendar.getInstance()),
    Vehicle("GHI789", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002"),
    Vehicle("JKL123", VehicleType.MINI_BUS, Calendar.getInstance()),
    Vehicle("ABC122", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("ABC111", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("DEF455", VehicleType.BUS, Calendar.getInstance()),
    Vehicle("GHI888", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002"),
    Vehicle("JKL999", VehicleType.MINI_BUS, Calendar.getInstance()),
    Vehicle("ABC007", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("ABC222", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("DEF333", VehicleType.BUS, Calendar.getInstance()),
    Vehicle("ABC123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("GHI555", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002"),
    Vehicle("JKL666", VehicleType.MINI_BUS, Calendar.getInstance()),
    Vehicle("ABC129", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("BCA123", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
    Vehicle("DEF106", VehicleType.BUS, Calendar.getInstance()),
    Vehicle("YYI789", VehicleType.MOTORCYCLE, Calendar.getInstance(), "DISCOUNT_CARD_002"),
    Vehicle("JKL553", VehicleType.MINI_BUS, Calendar.getInstance()),
    Vehicle("ARC153", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001"),
        Vehicle("ARC006", VehicleType.CAR, Calendar.getInstance(), "DISCOUNT_CARD_001")
    )

    //assigned setOfVehicles to parking
    val parking = Parking(setOfVehicles)

    println("------ADD-----")
    //for loop to add all the vehicles in the array
    createdVehicles.forEach {parking.addVehicle(it)}
}