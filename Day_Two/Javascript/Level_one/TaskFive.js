const input = require("prompt-sync")();


const celcius = Number(input("Enter celcius number => "))

const farenheit = (celcius * 9/5) + 32

console.log(`${celcius} in celcius => ${farenheit}`)

