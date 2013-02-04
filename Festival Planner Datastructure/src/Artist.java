import java.io.Serializable;

/**
 * Data class. Has an artist's name, genre and anything extra. Try using a larger input box for misc information.
 * @author Julian G. West
 *
 */
public class Artist implements Serializable {

	private static final long serialVersionUID = 3223044006510097311L;
	private String name;
	private String genre;
	private String misc;
	
	
	public Artist(String name, String genre, String misc) {
		this.name = name;
		this.genre = genre;
		this.misc = misc;
	}
	public Artist(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getMisc() {
		return misc;
	}
	public void setMisc(String misc) {
		this.misc = misc;
	}
	
	public String toString(){
		return "\n Artist: " + name + "\n \t Plays: " + genre + "\n \t Misc: " + misc;
	}	
}
