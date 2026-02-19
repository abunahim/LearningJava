/*let username = "";

while(username === "" || username === null){
    username = window.prompt(`Enter you name`);
}

let username;

do{
    username = window.prompt(`Enter you name`);
}while(username === "" || username === null);

console.log(`Hello ${username}`);*/

let loggedIn = true;
let username;
let password;

do{
    username =window.prompt("Enter your username");
    password =window.prompt("Enter your password");

    if(username === "qwerty" && password === "qwerty"){
        loggedIn = true;
        console.log("You are logged In!");
    }
    else{
        console.log("Invalid credentials! Please try again");
    }
}while(!loggedIn)