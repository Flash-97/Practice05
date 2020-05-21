package com.javaex.ex03;

public class Song {
	
	
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	public Song() {
		System.out.println("Song(�뙆�씪誘명꽣0媛�");
	}
	
	public Song (String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.title = artist;
		this.title = album;
		this.title = composer;
		this.title = year;
		System.out.println("Song(�뙆�씪誘명꽣5媛�)");
	}
	
	public Song (String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(�뙆�씪誘명꽣6媛�)");
	}
	
	
	
	
	
}

