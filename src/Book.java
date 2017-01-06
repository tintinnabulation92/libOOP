

public class Book {
	private String name;
	private int ISBN; //max 10 numbers - an old standard
	private String author;
	private String date; // e.g. 15/10/2016
	
	public Book(String name, int ISBN, String author, String date){
		this.name = name;
		this.ISBN = ISBN;
		this.author = author;
		this.date = date;
	}
	
	
	//creating getters and setters for the properties
	
	public String getName(){
		return name;
	}
	
	public int getISBN(){
		return ISBN;
	}
	
	public String getAutthor(){
		return author;
	}
	public String getDate(){
		return date;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setISBN(int ISBN){
		this.ISBN = ISBN;
	}
	
	public void setAuthor(String author){
		this.author = author;
	}
	
	public void setDate(String date){
		this.date = date;
	}
}//class Book


