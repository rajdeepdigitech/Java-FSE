import { createInterface } from 'readline';


let myNumber : number = 67;
let myDecimalNumber : number = 8.55;
let myName : string = "Pushpal";
let isPresent : boolean = true;

let arr: number[] = [1,2,3,4,5,6];

// console.log(myNumber);
// console.log(myDecimalNumber);

// console.log(myName);
// console.log(isPresent);

let output: string = "";

for (let i = 0; i < arr.length - 1; i++) {
    output += arr[i] + " ";
}
// console.log(output);



let result: number = 0;

const rl = createInterface({ 
  input: process.stdin, 
  output: process.stdout, 
  crlfDelay: Infinity 
});

rl.question('Enter the value of x: ', (x) => {
  const numX = parseInt(x, 10); // Convert string to number
  
  result = myFunc(numX); // Call myFunc and store result
  
  console.log('Result:', result); // Print after calculation
  
  rl.close();
});

function myFunc(x: number) {
  result += x;
  return result;
}