package testing_Interview_Programs;

	import java.util.ArrayList;
	import java.util.List;

	public class PlayList {
	    private List<String> songs;
	    private int capacity;

	    public PlayList(int capacity) {
	        this.capacity = capacity;
	        songs = new ArrayList<>();
	    }

	    public void addSong(String song) {
	        if (songs.size() >= capacity) {
	            songs.remove(0);
	        }
	        songs.add(song);
	    }

	    public void playSong(String song) {
	        if (songs.contains(song)) {
	            songs.remove(song);
	        }
	        songs.add(song);
	    }

	    public void printPlaylist() {
	        for (String song : songs) {
	            System.out.print(song + ",");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	    	PlayList playlist = new PlayList(3);
	        playlist.addSong("S1");
	        playlist.addSong("S2");
	        playlist.addSong("S3");
	        playlist.printPlaylist();

	        playlist.addSong("S4");
	        playlist.printPlaylist();

	        playlist.playSong("S2");
	        playlist.printPlaylist();

	        playlist.playSong("S1");
	        playlist.printPlaylist();
	    }
	}


