var listaPalabras:List<String> = listOf("barco", "avion","motocicleta","elevador","tren","aeropuerto","zapato","cuchara","cuaderno","computadora","edificio")

fun main(args: Array<String>) {
    println(
        """----------Wellcome to Ahorcado Game-----------
        
                       O
                      /|\
                      / \
                              """)
    println("              For start press 1")
    val startGame = readln().toInt()
    if (startGame == 1) {
        println("\nloading game...")
        println("loadind data and scores game...")
        println("starting process, please wait while ...")

        var score: Int = 0
        var vidasJuego:Int= 6
        var letterUser:String
        var secretWord = randomWord(listaPalabras)
        var listCharUser = mutableListOf<String>()

        println("\n--------Adivina la palabra escondida--------\n")
        print("Score: $score")
        print("    |    Vidas: $vidasJuego \n")

        ahorcadoParts(vidasJuego)
        print("\nPalabra Secreta: ")
        for (i in secretWord) {
            print("-")}
        //println("\n                ${secretWord.reversed()}")

        letterUser = charInputUser()
        if(letterUser in secretWord){
            score+=10
            listCharUser.add(letterUser)
        }else{vidasJuego -=1}

        while (vidasJuego >= 1) {
            println("\n--------Adivina la palabra escondida--------\n")
            print("Score: $score")
            print("    |    Vidas: $vidasJuego \n")
            ahorcadoParts(vidasJuego)
            print("\nPalabra Secreta: ")
            for (i in secretWord) {
                if (i.toString() in listCharUser) print(i) else print("-")
            }
            //println("\n                  ${secretWord.reversed()}")

            letterUser = charInputUser()
            while(letterUser in listCharUser){
                print("Ya probaste con esta letra, prueba con otra:")
                letterUser=charInputUser()
            }
            if(letterUser in secretWord){
                score+=10
                listCharUser.add(letterUser)
            }else{vidasJuego -=1}
            //var secretWordOrder = secretWord.toMutableList().sorted()
            //var listCharUserOrder = listCharUser.sorted()
            //println(secretWordOrder)
            //println(listCharUserOrder)
            //if(secretWordOrder == listCharUserOrder){
            if(secretWord.toMutableList() == listCharUser){
                println(secretWord.toMutableList())
                println(listCharUser)
                score +=100
                print("Score: $score")
                print("        Vidas: $vidasJuego \n")
                println("Palabra Secreta: $secretWord \n")
                println("""_____________________________________
< ----Felicidades, haz ganado!!!--- >
=====================================
                            \
                             \
                               ^__^
                               (oo)\_______
                               (__)\       )\/\
                                   ||----w |
                                   ||     ||""")
                println("\n---------Hasta la proxima!!!!---------")
                break
            }
        }

        if (vidasJuego==0){
            print("Score: $score")
            print("        Vidas: $vidasJuego \n")
            println("""_____________________
|     Perdiste!!!   |
=====================
            \
             \
              \
               \
                  .-=-==--==--.
              ..-=="  ,'o`)      `.
            ,'         `"'         \
            :  (                     `.__...._
            |                  )    /         `-=-.
            :       ,vv.-._   /    /               `---==-._
            \/\/\/VV ^ d88`;'    /                         `.
                ``  ^/d88P!'    /             ,              `._
                   ^/    !'   ,.      ,      /                  "-,,__,,--'""''-.
                  ^/    !'  ,'  \ . .(      (         _           )  ) ) ) ))_,-.\
                 ^(__ ,!',"'   ;:+.:%:a.     \:.. . ,'          )  )  ) ) ,"'    '
                  ',,,'','     /o:::":%:%a.    \:.:.:         .    )  ) _,'
                    ''''       ;':::'' `+%%%a._  \%:%|         ;.). _,-""
                              ,-='_.-'      ``:%::)  )%:|        /:._,"
                             (/(/"            ," ,'_,'%%%:       (_,'
                                             (  (//(`.______;    \
                                                \     \      `   `\
                                                   ):%::       :::::;
                                                 __,::%:(        :::::
                                            ,;:%%%%%%%:        ;:%::
                                             ;,--""-.`\  ,=--':%:%:\
                                            /"       "| /-".:%%%%%%%\
                                                            ;,-"'`)%%)
                                                           /"      "|)""")
            println("\n-------Hasta la proxima!!!!---------")
        }
    }
}


//-------------------------FUNCIONES-----------------------------------

fun randomWord(rWord:List<String>):String{
    var rWord = listaPalabras.random()
    return rWord
}

fun charInputUser():String{
    print("\nIngresa una letra: ")
    var charInput:String = readln().lowercase()
    return charInput
}

fun ahorcadoParts(vidasJuego:Int){
    when(vidasJuego){
        6 -> println("""
              _______             
             |      |
             |
             |
             |
            _|________           
        """.trimIndent())
        5 -> println("""
              _______             
             |      |
             |      O
             |   
             |
            _|________           
        """.trimIndent())
        4 -> println("""
              _______             
             |      |
             |      O
             |     /
             |
            _|________           
        """.trimIndent())
        3 -> println("""
              _______             
             |      |
             |      O
             |     /|
             |
            _|________          
        """.trimIndent())
        2 -> println("""
              _______             
             |      |
             |      O
             |     /|\
             |
            _|________           
        """.trimIndent())
        1 -> println("""
              _______             
             |      |
             |      O
             |     /|\
             |     /
            _|________       
        """.trimIndent())
        0 -> println("""
              _______             
             |      |
             |      O
             |     /|\
             |     / \
            _|________ 
        """.trimIndent())
    }
}
