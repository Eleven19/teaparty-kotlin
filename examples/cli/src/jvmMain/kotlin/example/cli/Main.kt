package example.cli

import com.github.ajalt.clikt.core.*

class Main : CliktCommand() {
    override fun run() {
        println("Hello from teaparty CLI example!")
    }
}

fun main(args: Array<String>) = Main().main(args)
