_____________________________________________________________________________________________________________________________
What does this application solve / achieve?
- This program runs a playlist of defined songs and albums. Using methods and functions it is able to generate this playlist, and then perform basic functions commonly found in music players, such as "Skip", "Previous" and "Shuffle". These functions are shown as successful by the output of "Now Playing" text in the terminal

_____________________________________________________________________________________________________________________________
What is the structure of this program?
- Main Class : Houses the Main functions, and is the starting and operating point of the program
- Playlist Class : Manages playlist of songs and the functions affecting them. Manages indexing of Playlist array list through CSV I/O file
- Song Class : Represents Song attributes, including defining whether or not it may be a single
- Artist Class : Represent an Artist or Band, the creators of Songs
- Album Class : Represents a collection of Songs made by an Arist or Band
_____________________________________________________________________________________________________________________________

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
+++++++ HOW TO RUN THE PROGRAM +++++++
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. Ensure no CSV file currently exists within VSC zip folder
2. In the Main class, remove "//" in front of the startPlaylist function (uncomment it), and press Run
- This will create a new CSV file, default the playlist Index to 0, and house the playlist within the CSV. The first song of the playlist will be printed in the Terminal
3. Re-comment the startPlaylist class. You may now use the Skip, Previous, and Shuffle functions by removing the "//" in front of them and pressing Run
- NOTE : Only Run 1 function at a time. That is to say, do not remove the "//" from in front of both Skip and Previous functions and then press Run
4. Upon pressing Run, the Terminal will display the currently playing song after the action with dialogue in the format of :
   "Now Playing *SongName* by *ArtistName*  and then *(Single)* or "from the album *AlbumName*"

_______________________________________________________________________________________________________________________________