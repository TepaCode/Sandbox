fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    println("--------Registred for start------------\n")

    sesionRegister()
    println("Welcome ${registerUser.keys}, select a option ")

    printMenu()

    while(optionSelected != "4") {
        when (optionSelected) {
            "1" -> {
                println("----SALDO ACTUAL----")
                consultaSaldoCuenta()
                printMenu()
            }

            "2" -> {
                println("----DEPOSITAR A CUENTA----")
                depositarCuenta()
                printMenu()
            }

            "3" -> {
                println("----RETIRAR EFECTIVO----")
                retirarEfectivo()
                printMenu()
            }

            else -> {
                println("Elige una opcion valida:")
                printMenu()
            }
        }
    }
    terminarSesion()

}

