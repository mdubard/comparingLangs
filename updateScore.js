var score = 0;
var color = "blue";

function updateScore(points){
	score += points;
	if(score < 0)
		score = 0;
	color = (score > 0) ? "green" : "red";
}

/*
//testing
updateScore(3);
alert("Test (3): " + score);
alert("Test (green): " + color);
updateScore(-6);
alert("Test (0): " + score);
alert("Test (red): " + color);
*/