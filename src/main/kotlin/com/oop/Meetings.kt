package com.oop

import java.lang.IllegalArgumentException
import java.util.*

class Meeting {

    internal val logger = Logger()

    var meetingName: String = ""

    fun addParticipant(participant: Participant) {
        if(verifyParticipant(participant))
        println("Added: ${participant.participantName}, ${participant.email}")
    }

    private fun verifyParticipant(participant: Participant) : Boolean {
        println("Try to verify")
        return true
    }

    protected fun verifyMeeting() {

    }
}

class Participant {
    var name: Name = Name()
    var email = ""

    var canonicalEmail = ""
        get() = email.uppercase(Locale.getDefault())

    val participantName: String
        get() = name.name
}

class Name {
    var name: String = ""
    set(value: String)  {
        if (value.isNullOrBlank()) throw IllegalArgumentException()
        field = value
    }
}