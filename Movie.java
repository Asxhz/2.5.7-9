public class Movie{
  private String title;
  private double time;
  private int rating;
  private Movie m;
  public Movie(String t, double time, int r){
    title = t;
    this.time = time;
    rating = r;
  }
  public void addMovie(Movie m){
    this.m = m;
    MediaLib.numEntries++;
  }
}