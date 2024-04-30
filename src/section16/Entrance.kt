package section16

class Entrance {

    private val console = Console

    fun control() {
        val age = console.readInt("Digite sua idade: ")
        val inviteType = console.readInviteType("Digite o tipo do convite: ")
        val inviteCode = console.readInviteCode("Digite o codigo do convite: ")
    }


}