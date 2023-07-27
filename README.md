
# Chess Game with AI

This is a desktop chess game implemented in Java, featuring an AI player that uses the Minimax algorithm with Alpha-Beta pruning to make intelligent moves. The game allows users to play against the AI. Additionally, users can request help from the AI or the ChatGPT API to get the best move explanations when they are stuck and want to learn more about chess strategies.
## Features

- Play chess against an AI player that uses Minimax with Alpha-Beta pruning for intelligent moves.
- Choose the AI difficulty level and challenge yourself with different levels of play.
- Request help from the ChatGPT API to get the best move explanations and improve your chess skills.
- Implement special moves and rules such as castling, en passant, and promotion.
- Checkmate and stalemate detection.
- Captured pieces display on the side of the board



## Getting Started

- Clone this repository to your local machine.
- Open the project in your preferred Java development environment (e.g., IntelliJ, Eclipse).
- Compile and run the **ChessGameMain** class to start the game.
- Enjoy playing chess against the AI!

## Tasks

- [ ] **Set up the Chessboard representation**:
	- [ ] Create a class to represent the chessboard.
    - [ ] Define the data structure to store the state of the chessboard (e.g., 2D array or a list of lists).
	- [ ] Implement methods to initialize the board with the starting positions of pieces.
	- [ ] Write methods to display the current state of the board.
	
- [ ] **Implement the Chess Rules**:
  - [ ] Create separate classes for each chess piece (e.g., King, Queen, Rook, etc.).
  - [ ] Implement methods in each class to calculate valid moves for the respective pieces.
  - [ ] Ensure pieces cannot move through other pieces or to invalid squares.
    
- [ ] **Create the AI Player using Minimax with Alpha-Beta Pruning**:
	- [ ]  Implement the Minimax algorithm for the AI player to evaluate possible moves and determine the best move.
    - [ ]   Add a depth limit to the Minimax algorithm to control the search depth.
    - [ ]   Integrate Alpha-Beta pruning to optimize the Minimax search and improve performance.
    
- [ ] **Implement the User Interface**:
	- [ ]  Create a graphical representation of the chessboard using Java Swing or JavaFX.
    - [ ]   Display the chess pieces on the board.
    - [ ]  Implement user interactions like selecting a piece and highlighting valid move squares.
    - [ ]   Add a "Get Help" button or a similar mechanism to trigger the help request.
    
- [ ]  **Add game logic and user input handling**:
	- [ ]   Implement a game manager class to handle game logic, turns, and move validation.
    - [ ]   Listen for user input events and translate them into chess moves.
    - [ ]   Validate user moves based on the rules of chess.
    
- [ ] **Integrate with User Interface**:
	- [ ]   Connect the "Get Help" button or similar user input mechanism with the help request function.
    
	- [ ]   Trigger the API call when the user requests help.

- [ ] **Set up API Access**:
	- [ ]   Sign up for access to the ChatGPT API from OpenAI.
	- [ ]   Retrieve the API key or access token required for making API requests.

- [ ] **Implement a Function to Request Help from ChatGPT API**:
	- [ ]   Create a method in your Java code to trigger the help request from the user interface.
    - [ ]   Serialize the current board state into a format suitable for sending to the API (e.g., JSON).

- [ ] **Make API Request and Handle Response**:
	- [ ]   Create a function to make a POST request to the ChatGPT API.
    - [ ]   Pass the serialized board state as input to the API request.
    - [ ]   Handle the response from the API and extract the best move explanation.

- [ ] **Display the Explanation to the User**:
	- [ ]   Implement a user-friendly way to display the best move explanation (e.g., popup, tooltip, or dedicated help panel).
    - [ ]   Show the explanation to the user when they request help.
    
- [ ] **Error Handling and Edge Cases**:
	- [ ]   Implement error handling for API requests to deal with potential issues (e.g., API not responding or returning errors).
    - [ ]  Provide appropriate messages if the AI move cannot be explained clearly.
    
- [ ] **Optional: Limit API Usage**:
	- [ ]   Since API calls may be rate-limited based on your API plan, consider implementing a rate-limiting mechanism to avoid exceeding your allowed limits.
    
- [ ] **Test the Game**:
	- [ ]  Thoroughly test the game for different scenarios, including different AI depth levels, user moves, and edge cases.
	- [ ]  Test the "Get Help" functionality to ensure the AI move explanations are provided correctly.
