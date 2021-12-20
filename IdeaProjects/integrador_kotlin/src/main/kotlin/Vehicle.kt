import java.util.*

// EXERCISE 2)b): type
// EXERCISE 3)a): checkInTime
data class Vehicle(val plate: String, val type: VehicleType, var checkInTime: Calendar, val discountCard: String? = null) {

    override fun equals(other: Any?): Boolean {
        if(other is Vehicle){
            return this.plate == other.plate
        }
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return this.plate.hashCode()
    }
}