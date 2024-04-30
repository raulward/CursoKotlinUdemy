package section16

class GuestBussiness(guest: Guest) {
    fun verifyMininumAge(age: Int): Boolean {
        return age >= 18
    }

    fun verifyInvite(str: String): Boolean {
        val types: List<String> = listOf("comum", "premium", "luxo")
        return types.filter { it == str }
    }

}