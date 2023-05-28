//---------Buttons functions-------

function boxRandom(){
 
    alert("Haz ganado pizza gratis!!!!")
}
function alertName(){
    alert("Hola " + document.getElementById("input-one").value + " bienvenido!")
}

function alertEmail(){
    alert("El email " + document.getElementById("input-two").value + " a sido registrado con exito.")
}

function alertTel(){
    alert("Telefono " + document.getElementById("input-three").value +" fue registrado.")
}

function alertSubject(){
    alert("tu mensaje: '" + document.getElementById("input-four").value + "' sera respondido en breve.")
}

let counter=0
function keepCalm(){
    counter+=1
    if (counter == 5){
    alert("Hey, tomalo con calma amigo!!!!")
        
    }
    if (counter == 6){
        counter-=5
    }
}
