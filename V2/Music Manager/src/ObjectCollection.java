import.V2.*;

public class ObjectCollection {
public static void main(String[] args) {

// we will create all the objects here to not make main more cluttered then nessesery


// Create the artists
Artist arcticMonkeys = new Artist("Arctic Monkeys");
Artist frankOcean = new Artist("Frank Ocean");
Artist theWeeknd = new Artist("The Weeknd");

// Creates Albums / Singles / Songs
Album amAlbum = new Album("AM", arcticMonkeys);
//amAlbum.addSong(new Song("R U Mine?", arcticMonkeys));
//amAlbum.addSong(new Song("Snap Out of It", arcticMonkeys));
//amAlbum.addSong(new Song("Do I Wanna Know?", arcticMonkeys));

Song RUMine = New Song("R U Mine?", arcticMonkeys, amAlbum, False, null, SnapOutofIt);
Song SnapOutofIt = New Song("Snap Out of It", arcticMonkeys, amAlbum, False, RUMine, DoIWannaKnow);
Song DoIWannaKnow = New Song("Do I Wanna Know?", arcticMonkeys, amAlbum, False, SnapOutofIt, null);



Song novacane = new Song("Novacane", frankOcean);

Album afterHours = new Album("After Hours", theWeeknd);
afterHours.addSong(new Song("Blinding Lights", theWeeknd));

// Creates playlist, adds songs / albums
Playlist playlist = new Playlist();
playlist.addAlbum(amAlbum);
playlist.addSong(novacane);
playlist.addAlbum(afterHours);




}
}
