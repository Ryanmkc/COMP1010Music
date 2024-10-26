_____________________________________________________________________________________________________________________________
What does this application solve / achieve?
- This program runs a playlist of defined songs and albums. Using methods and functions it is able to generate this playlist, and then perform basic functions commonly found in music players, such as "Skip", "Previous" and "Shuffle". These functions are shown as successful by the output of "Now Playing" text in the terminal

_____________________________________________________________________________________________________________________________
What is the structure of this program?
- Main Class : Houses the Main functions, and is the starting and operating point of the program. The Main class reads user inputs from the console, scanning for defined operating terms. Capitalisation of said terms is ignored.
- Playlist Class : Manages playlist of songs and the functions affecting them. Manages indexing of Playlist array list through CSV I/O file
- Song Class : Represents Song attributes, including defining whether or not it may be a single. Songs are stored as nodes within an Album.
- Artist Class : Represent an Artist or Band, the creators of Songs. 
- Album Class : Represents a collection of Songs made by an Arist or Band. Stores albums of songs as a linked-list structure. Songs are stored as nodes within an album. In Main class, the first calling of addSong is set as the First Song of the node list.
_____________________________________________________________________________________________________________________________

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
+++++++ HOW TO RUN THE PROGRAM +++++++
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. Initiate the program by opening Main and pressing Run
2. Upon running, an instruction line will be printed in the Console, prompting user to enter a command
3. By typing listed commands in the Console and pressing Enter, the user can show the "Current" playing song, "Skip" songs, go to "Previous" songs, "Shuffle" the playlist.
4. Upon finishing usage of the program, the user should type "Stop" to stop the program loop/scanner and delete the CSV file
_______________________________________________________________________________________________________________________________

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
+++++Student Numbers & Percentages+++++
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Kieran Trenchuk : 48273287 // 25%
Andrey Yermolenko : 48429724 // 25%
Aiden : 47873523 // 25%
Ryan Mckee :