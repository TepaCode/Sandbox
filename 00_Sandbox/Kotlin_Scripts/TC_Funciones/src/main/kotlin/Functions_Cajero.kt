
//----Inicio de Sesion----

var registerUser= mutableMapOf<String,String>()
var optionSelected:String = ""
var currentDivisa:String = "$"
var saldoCuenta:Float = 0.00f


fun sesionRegister(){
    print("Nombre:")
    var nameUser:String=readln()
    while(nameUser.isEmpty()){
        print("Insert a valid name:")
        nameUser=readln()
    }

    print("Email:")
    var emailUser: String = readln()
    while(emailUser.isEmpty()){
        print("Ivalid Email, try again:")
        emailUser= readln()
    }

    registerUser.put(nameUser, emailUser)
}

fun printMenu():String{
    println("""
            1 -> Consultar Saldo
            2 -> Depositar a Cuenta
            3 -> Retirar
            4 -> Salir
            """.trimIndent())
    print("Select a option: ")
    optionSelected= readln()
    return optionSelected
}

fun consultaSaldoCuenta() {
    println("Cliente: ${registerUser.keys}")
    println("El saldo de tu cuenta es de: $saldoCuenta ")
}

fun depositarCuenta() {
    print("Ingresa el monto a depositar: $")
    var montoIngresar:Float = readln().toFloat()
    saldoCuenta += montoIngresar
    println("Deposito realizado exitosamente, el saldo actual de tu cuenta es de $ $saldoCuenta ")
}

fun retirarEfectivo(){
    print("Indica el monto a retirar: $")
    var montoRetiro= readln().toString().toFloat()
    while(montoRetiro > saldoCuenta){
        println("Saldo insuficiente, puedes retirar hasta $ $saldoCuenta")
        print("Indica el monto a retirar: $")
        montoRetiro = readln().toFloat()
    }
    saldoCuenta -= montoRetiro
    println(message = "Operacion realizada exitosamente, el saldo restante es de: $saldoCuenta")
}

fun terminarSesion(){
    println("Gracias por usar nuestros servicios")
    println("----------Vuelve pronto------------")
}
