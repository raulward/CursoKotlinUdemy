package section16.business

import section16.entity.Guest

class GuestBussiness private constructor() {

    companion object {
        fun validateAge(age: Int): Boolean {
            return age >= 18
        }

        fun validateInviteType(inviteType: String): Boolean {
            return inviteType == "comum" || inviteType == "premium" || inviteType == "luxo"
        }

        fun validateCode(guest: Guest): Boolean = when (guest.inviteType) {
            "comum" -> guest.code.startsWith("xt")
            "premium", "luxo" -> guest.code.startsWith("xl")
            else -> false
        }

    }


//    fun verifyInvite(str: String): Boolean {
//        val types: List<String> = listOf("comum", "premium", "luxo")
////        return types.filter { it == str }
//    }

}