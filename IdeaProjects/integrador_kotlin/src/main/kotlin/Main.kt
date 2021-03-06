import java.util.*
fun main() {

    //initialized empty vehicle set for our parking.
    val setOfVehicles = mutableSetOf<Vehicle>()

    // EXERCISE 6: created array of vehicles to work with
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

    println("----------ADDING VEHICLES----------\n")
    //for loop to add all the vehicles in the array
    createdVehicles.forEach {parking.addVehicle(it)}
    parking.listVehicles()

    val parkingSpace = ParkingSpace(createdVehicles[0],parking)
    val parkingSpace1 = ParkingSpace(createdVehicles[1],parking)
    val parkingSpace2 = ParkingSpace(createdVehicles[2],parking)
    val parkingSpace3 = ParkingSpace(createdVehicles[3],parking)
    val parkingSpace4 = ParkingSpace(createdVehicles[4],parking)
    val parkingSpace5 = ParkingSpace(createdVehicles[5],parking)
    val parkingSpace6 = ParkingSpace(createdVehicles[6],parking)
    val parkingSpace7 = ParkingSpace(createdVehicles[7],parking)
    val parkingSpace8 = ParkingSpace(createdVehicles[8],parking)
    val parkingSpace9 = ParkingSpace(createdVehicles[9],parking)


    //setting a time to use for the calculation
    val cal: Calendar = Calendar.getInstance()
    cal.add(Calendar.MINUTE, 136)
    parkingSpace.actualTime = cal

    println("\n----------CHECKOUT----------\n")
    //running the checkOutVehicle function
    parkingSpace.checkOutVehicle("ABC123")
    parkingSpace1.checkOutVehicle("DEF456")
    parkingSpace2.checkOutVehicle("GHI789")
    parkingSpace3.checkOutVehicle("AWW654")

    parking.showParkingData()

    parking.listVehicles()

}