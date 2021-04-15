

async function sendApiRequest(){
let response = await fetch(`https://opentdb.com/api.php?amount=30&category=23&difficulty=easy&type=multiple`);
let data= await response.json()
useApiData()
}
function useApiData(){
document.querySelector("#category").innerHTML = `Category:${data.results[0].category}`
document.querySelector("#difficulty").innerHTML = `Difficulty:${data.results[0].difficulty}`
document.querySelector("#question").innerHTML = `Question:${data.results[0].question}`
document.querySelector("#answer1").innerHTML = data.results[0].correct_answer
document.querySelector("#answer1").innerHTML = data.results[0].incorrect_answer[0]
document.querySelector("#answer1").innerHTML = data.results[0].incorrect_answer[1]
document.querySelector("#answer1").innerHTML = data.results[0].incorrect_answer[2]
}

let correctButton = document.querySelector("answer1")
correctButton.addEventListener("click", ()=>{alert("Correct")
sendApiRequest()
})