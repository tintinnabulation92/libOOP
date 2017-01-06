import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee("John", 25, "Wall Street 1/A");
		Reader reader1 = new Reader("Paul", 30, "Champions Alee 23-4-3/C");
		
		
		
		
		//create an object - book
		Book book1 = new Book("Java Podstawy", 123456, "Cay Horstmann","24/12/2016");
		
		LinkedList<Book> listOfBooks = new LinkedList<Book>();
		listOfBooks.add(book1);
		for(int a=0; a<listOfBooks.size(); a++){
			System.out.println(listOfBooks.get(a).getName() + listOfBooks.get(a).getAutthor() 
					+ " " + listOfBooks.get(a).getDate() + " " + listOfBooks.get(a).getISBN()); 
		}
	}//main ends here

} // class ends here



/*
LinkedList<String> listOfNumbers = new LinkedList<String>();
listOfNumbers.add("1");
listOfNumbers.add("2");
listOfNumbers.add("Extreme example");

for (int y=0; y<15; y++){
	listOfNumbers.add("" + y);
}

for(int x=0; x<listOfNumbers.size(); x++){
	System.out.println(listOfNumbers.get(x));
}

for(int z=0; z<7; z++){
	listOfNumbers.remove(z);
}

Iterator<String> listIterator = listOfNumbers.iterator();

while(listIterator.hasNext()){
	System.out.println(listIterator.next());
}*/