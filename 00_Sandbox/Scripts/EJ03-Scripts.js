//---------Head fuctions
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
//---------Buttons functions-------
let idUsers="U23-";
let counterUsers=0;

function userData(){

    
    let userName=document.getElementById("nameUser");
    let userEmail=document.getElementById("emailUser");
    let userPhone=document.getElementById("phoneUser");
    counterUsers+=1;
    let userID=idUsers + 0 + counterUsers; 

    let cardName = document.getElementById("outputName");
    let cardEmail = document.getElementById("outputEmail");
    let cardPhone = document.getElementById("outputPhone");
    let cardID = document.getElementById("outputID");

    cardName.textContent=userName.value;
    cardEmail.textContent="Email: " + userEmail.value;
    cardPhone.textContent="Phone: " + userPhone.value;
    cardID.textContent="ID: " + userID;
    cardName.style.color ="purple";
}

let textAlert="User " + userID + " created.";

function alertMesage(){
    setTimeout(mensageAl, 1000);
}

function mensageAl(){
    alert("Usuario creado exitosamente!")
}


function counterMain(){
    let textRegCounter=document.getElementById("registerCounter");
    textRegCounter.textContent = "Usuarios registrados: " + counterUsers;
    textRegCounter.style.color = "green";
}


function playAudio(){
    let audioBox = document.getElementById("audio-uno");
    audioBox.play();
}

function startClock(){
    setInterval(segundero, 1000);
}

function segundero(){
    let tiempoActual = new Date();
    let hora = tiempoActual.getHours();
    let minutos=tiempoActual.getMinutes();
    let segundos=tiempoActual.getSeconds();

    let textoHour = hora + ":" + minutos + ":" + 
    segundos;
    let tiempoPantalla = document.getElementById("clockText");
    tiempoPantalla.textContent = "Hour: " + textoHour;
}

function actualDate(){
    let fechaActual = new Date();
    let formatoDate= fechaActual.toLocaleDateString("es-ES");
    //let monthCurrent = fechaActual.getMonth();
    //let dayCurrent = fechaActual.getDay();
    //let yearCurrent = fechaActual.getFullYear();

    //let completeDate= dayCurrent + monthCurrent; //yearCurrent;

    let fechaPantalla = document.getElementById("dateText");
    fechaPantalla.textContent = "Date: " + formatoDate;
}
   