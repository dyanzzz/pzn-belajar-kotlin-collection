package data

class Person(val name: String) {
    override fun hashCode(): Int {
        //return super.hashCode()
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean{
        return when(other) {
            //return super.equals(other)
            is Person -> name == other.name
            else -> false
        }
    }

    override fun toString(): String {
        //return super.toString()
        return "Person with name $name"
    }
}