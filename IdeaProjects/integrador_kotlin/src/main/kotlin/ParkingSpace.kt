import java.util.*

const val MINUTES_IN_MILLISECONDS = 60000

data class ParkingSpace(var vehicle : Vehicle) {

    //EXERCISE 4: parkedTime value
    val parkedTime: Long get() = (Calendar.getInstance().timeInMillis - vehicle.checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS
}