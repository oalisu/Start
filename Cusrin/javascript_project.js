var temp = 20

if (temp>80) {
    console.log("Hot outside!");
} else if (temp <= 80 && temp >= 50) {
    console.log("Average temp outside");
} else if (temp < 50 && temp >= 32) {
    console.log("It is pretty cold outside");
}else {
    console.log("It is veery cold outside!");
}