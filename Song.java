public class Song {
  private String title;
  private int rating;
  private Song s;

  public Song(String t, int r){
    title = t;
    rating = r;
  }

  public void addSong(Song s) {
    this.s = s;
    MediaLib.numEntries++;
  }
}