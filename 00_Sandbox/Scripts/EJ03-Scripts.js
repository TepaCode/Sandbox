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
    
    let textAlert="User " + userID + " created.";
    setTimeout(alert(textAlert, 2000));

    cardName.style.color ="purple";
}

function counterMain(){
    
    let textRegCounter=document.getElementById("registerCounter");
    textRegCounter.textContent = "Usuarios registrados: " + counterUsers;
    textRegCounter.style.color = "green";
}