This is the instructions to my game.

The program reads in a text file called "rooms.txt" to create a map for a player to navigate through.
"items.txt" is also read in to get item names and descriptions. "puzzles.txt" is also read in to get
puzzle IDs, questions, answers, pass response, fail response, no. of attempts, and a checker whether solved or not.

1. Open the "rooms.txt" file to see the contents of the map.

Inside, each room is split into 7 parts (roomNumber, roomName, roomDesc, isFamiliar, roomsNearby, items, pzlID)

[roomNumber]
roomNumber is the String value given to each room.

[roomName]
roomName is the String value labeling each room.

[roomDesc]
roomDesc is the String value containing the description of each room.

[isFamiliar]
isFamiliar is a boolean value used for whether a room has been visited or not.

[roomsNearby]
roomsNearby is a list of String values determining the nearby rooms to the current room. The order is in North, South,
East, West.

[items]
items is a Arraylist<String> value for the name of the item in each room.

[pzlID]
pzlID is a String value given to each puzzle as an identifier.

2. Open the "items.txt" file to see the contents of each item.

Each item is split into 2 parts (itemName, itemDesc)

[itemName]
itemName is the String value denoting each item.

[itemDesc]
itemDesc is the String value giving a short description for each item.

3. Open the "puzzles.txt" file to see the contents of each puzzle.

Each puzzle is split into 7 parts (pzlID, pzlQues, pzlAns, pzlPassed, pzlFailed, attempts, pzlSolved)

[pzlID]
pzlID is the String value given to each puzzle as an identifier.

[pzlQues]
pzlQues is the String value containing the actual puzzle/question.

[pzlAns]
pzlAns is the String value containing the answer to the puzzle/question.

[pzlPassed]
pzlPassed is the String value containing a message when the puzzle is solved.

[pzlFailed]
pzlFailed is the String value containing a message when the puzzle is failed.

[attempts]
attempts is the int value given to each puzzle for the number of attempts allowed.

[pzlSolved]
pzlSolved is a boolean value set to identify whether a puzzle has been solved or not.

A visual depiction of the map is below:
 __________ ___________
|  Office  |    Bank   |
|_____1__________2_____|
|Restaurant|  Police   |
|____3_____|_____4_____|
| Pharmacy |   School  |
|____5_____|_____6_____|