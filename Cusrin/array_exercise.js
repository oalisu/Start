var roster = []

function addNew() {
    var newName = prompt("What name would you like to add to the roste?")
    roster.push(newName);
} 

function remove() {
var remName = prompt("Which name would you like to delete?")
var index = roster.indexof(remName);
index.splice(index,1);
}

function display() {
    console.log(roster)
}

var start = prompt("Would you like to create a new student roster? y/n")
var request = "empty";

if (start === "y") {
    while (request != quit) {
        request = prompt("Please select an action: Add, Remove, Display or Quit")
    } if (request === "add") {
        addNew()
    }   else if (request === "display") {
        display()
    }   else if (request === "remove") {
        remove()
    } else (alert('Not recognized!')) 

}

alert('Thanks for using the web page')