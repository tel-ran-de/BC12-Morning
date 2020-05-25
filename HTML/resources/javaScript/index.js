console.log('Hello world')

function fizzbuzz(n) {
    if(n % 3 === 0  && n % 2 === 0){
        console.log("fizzbizz")
    }    else if (n % 3 === 0) {
        console.log("fizz")
    } else if (n % 2 === 0) {
        console.log("/n")
    } else {
        console.log("buzz")
    }
}

var fn = fizzbuzz;

fn(42);


function add (a, b){
    return a + b;
}

function divide (a, b){
    return a/b;
}

function multiplay(a,b){
    return a * b;
}

var operationsDB = {
    "*" : multiplay,
    "+" : add,
    "-" : divide
}

function calculator(operation, a, b){
    
    return operation (a, b);
}

console.log(calculator(multiplay,897, 8713));
console.log(calculator(operationsDB["-"], 897, 8713));
