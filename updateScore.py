score = 0
color = "blue"

def updateScore(points):
    global score 
    global color
    score += points
    if score < 0:
        score = 0
    color = "green" if points > 0 else "red"

#testing    
#updateScore(3);
#print "Testing (3): ", score
#print "Testing (green): ", color
#updateScore(-6);
#print "Testing (0): ", score
#print "Testing (red): ", color