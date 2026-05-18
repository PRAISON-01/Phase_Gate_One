const input = require("prompt-sync")();


let random_number = Math.floor(Math.random() * 100) + 1;

let attempt = 1;
console.log(random_number);
do{
const guess = Number(input("Guess the number between 1 and 100 => "));

if(guess == random_number){
    console.log("Congratulation, you got the number correct");
    break;
}

else if(guess < random_number){
    console.log("Too low");
}
else if(guess > random_number){
    console.log("Too High");
}

attempt += 1;

if(guess < 1 || guess > 100){
    console.log("Guess out of bound");
}


}while(attempt <= 5);

console.log("=====RESULTS=====");
console.log("Correct Number => "+ random_number);
console.log("Number of Attempts => "+ attempt);


if(attempt == 1){
    console.log("Lengendary");
}
if(attempt == 2){
    console.log("Excellent");
}
if(attempt == 3){
    console.log("Good");
}
if(attempt == 4){
    console.log("Good");
}

if(attempt == 5){
    console.log("Close");
}

if(attempt > 5){
    console.log("Better luck")
}
