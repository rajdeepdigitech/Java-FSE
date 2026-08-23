// Alert generation 

//    alert("You have been hacked!");
//    ^ -> function

// Prompt generation 

// let userResponse = prompt("Please enter your prompt!");

// Datatypes 

let x = 34; // int
let myName = "Pushpal"; // String 
let character = 'X';
let myFloat = 6.09; // double
let isPresent = true;

// Variable naming 

var $bbno$ = "Nice music";
var _snakecase = "Testing variable naming!";

// console.log($bbno$ +" " + _snakecase);
// console.log(_snakecase.length);

var sliced = (_snakecase.slice(0, 5));

//console.log(sliced);

var slicedUpperCase = sliced.toUpperCase();
var slicedLowerCase = sliced.toLowerCase();

// console.log(slicedUpperCase + " " + slicedLowerCase);

// Basic arithmetic operators!

var myNumberOne = 6;
var myNumberTwo = 9;

let result = 6 + 9;
// console.log(result);
result = 6 * 9;
// console.log(result);
result = 6 / 9;
// console.log(result);
result = 6 - 9;
// console.log(result);
result = 6 % 9; // Returns 6 as 6 is not divisible by 9
// console.log(result);

// Increment && Decrement

var increment = 6;
var decrement = increment--;
// console.log(decrement);


// Functions 

function getMilk(f) {
    let cost = Math.PI * f;
    console.log(cost);
}
getMilk(x);


