const prompt = require("prompt-sync")(); //Run npm install prompt-sync in the terminal

const str1 = prompt("Enter the virus name ");
str1=str1.toLowerCase(); //convert the sample virus into Lowercase
console.log(`The name of the virus is ${str1}`);

const n = prompt("Enter number of people between 1 to 10");// input no of people
console.log(`The number of people is ${n}`);

const arr = [];
for (let i = 0; i < n; i++) {
  arr[i] = prompt("Enter the Sample report of person " + (i + 1)+" ");
  arr[i]=arr[i].toLowerCase(); //convert string to lower case
}
console.log(arr);
const len = arr.length; //calculate the length of arr
const length1 = str1.length;
let str2;
for (i = 0; i < len; i++) {
  str2 = arr[i];
  const length2 = str2.length;
  let result = report(str2, str1, length2, length1);// function call 
  if (result) console.log("POSITIVE");//receive boolean value from function report
  else console.log("NEGATIVE");
}
function report(tmp1, tmp2, m, n) {
  let j = 0;
  for (let i = 0; i < n && j < m; i++) {
    if (tmp1[j] == tmp2[i]) { //if condition to check whether the character of tmp1 exists in tmp2
      j++; //increment to the next element in the tmp1
    }
  }
  return j == m; //return boolean value
}
