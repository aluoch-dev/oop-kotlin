package com.oop

fun main() {
    val meeting = Meeting()

    println("Created: $meeting")

    val participant = Participant()
    val name = Name()
    name.name = "Laurine"
    participant.name = name
    participant.email = "laurie@mail.com"

    participant.canonicalEmail =""

    meeting.addParticipant(participant)

    meeting.meetingName = "Review"
}