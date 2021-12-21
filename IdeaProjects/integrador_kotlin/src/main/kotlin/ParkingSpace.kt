import java.util.*
import kotlin.math.round

const val MINUTES_IN_MILLISECONDS = 60000
const val MINUTES_AFTER_VEHICLE_TYPE_FEE = 15
const val FEE_AFTER_VEHICLE_TYPE_FEE = 5

data class ParkingSpace(var vehicle : Vehicle, val parking: Parking) {

    var actualTime: Calendar = Calendar.getInstance()

    //EXERCISE 4: parkedTime value
    val parkedTime: Long get() = (actualTime.timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS

    fun checkOutVehicle(plate: String){
        checkOutVehicle(plate, ::onSuccess, ::onError)
    }

    private fun checkOutVehicle(plate: String, success:(Int) -> Unit, error:() -> Unit){
        if(vehicle.plate == plate){
            success(calculateFee(vehicle.type, parkedTime.toInt()))
        }else{
            error()
        }
    }

    fun onSuccess(amount: Int): Unit{
        parking.removeVehicle(vehicle)
        println("Vehicle ${vehicle.plate} pay a fee of $amount")
    }

    fun onError(): Unit{
        println("Vehicle doesn't exist")
    }

    private fun calculateFee(type: VehicleType, parkedTime: Int): Int{
        var timeInMinutes = parkedTime % 60
        val timeInHours = parkedTime / 60

        if((timeInMinutes % MINUTES_AFTER_VEHICLE_TYPE_FEE) != 0){
            timeInMinutes = (round(timeInMinutes/10.0) * MINUTES_AFTER_VEHICLE_TYPE_FEE).toInt()
        }

        var result = 0

        if(timeInHours >= 2){
            result = type.fee +  ((timeInMinutes / MINUTES_AFTER_VEHICLE_TYPE_FEE) * FEE_AFTER_VEHICLE_TYPE_FEE)
        }else if(timeInHours < 2){
            result = type.fee
        }
        return result
    }

}