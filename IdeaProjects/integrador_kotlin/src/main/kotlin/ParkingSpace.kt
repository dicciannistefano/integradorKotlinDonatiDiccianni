import java.util.*
import kotlin.math.round

const val MINUTES_IN_MILLISECONDS = 60000
const val MINUTES_AFTER_VEHICLE_TYPE_FEE = 15
const val FEE_AFTER_VEHICLE_TYPE_FEE = 5

data class ParkingSpace(var vehicle : Vehicle, val parking: Parking) {

    var actualTime: Calendar = Calendar.getInstance()

    //EXERCISE 4: parkedTime value
    val parkedTime: Long get() = (actualTime.timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS


    //EXERCISE 7:
    fun checkOutVehicle(plate: String){
        checkOutVehicle(plate, ::onSuccess, ::onError)
    }

    private fun checkOutVehicle(plate: String, success:(Int) -> Unit, error:() -> Unit){
        //todo --> evaluating if the vehicle is in their parking space
        if(vehicle.plate == plate){
            var hasDiscountCard = false
            vehicle.discountCard?.let {
                hasDiscountCard = true
            }
            success(calculateFee(vehicle.type, parkedTime.toInt(), hasDiscountCard))
        }else{
            error()
        }
    }

    private fun onSuccess(amount: Int){
        parking.apply {
            removeVehicle(vehicle)
            editParkingData(amount)
            //showParkingData()
        }
        //EXERCISE 10:
        println("Vehicle with plate ${vehicle.plate}, your fee is $$amount . Come back soon.")
    }

    private fun onError(){
        println("Sorry, the checkout failed, incorrect plate")
    }

    //EXERCISE 8:
    private fun calculateFee(type: VehicleType, parkedTime: Int, hasDiscountCard: Boolean): Int{
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

        //EXERCISE 9: Apply discount
        if(hasDiscountCard){
            val appliedResult = result - (result * 0.15)
            result = appliedResult.toInt()
        }
        return result
    }

}