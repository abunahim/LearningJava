/*let randomNum = Math.random();

const min = 50;
const max = 100;

let randomNum = Math.floor(Math.random() * 100) + 1;
let randomNum = Math.floor(Math.random() * (max - min)) + min;

console.log(randomNum);*/

//RandomNumberGenerator

const myButton = document.getElementById("myButton");
const label1 = document.getElementById("label1");
const label2 = document.getElementById("label2");
const label3 = document.getElementById("label3");
const min = 1;
const max = 6;
let randonNum1;
let randonNum2;
let randonNum3;

myButton.onclick = function(){
    randonNum1 = Math.floor(Math.random() * max) + min;
    randonNum2 = Math.floor(Math.random() * max) + min;
    randonNum3 = Math.floor(Math.random() * max) + min;
    label1.textContent = randonNum1;
    label2.textContent = randonNum2;
    label3.textContent = randonNum3;
}