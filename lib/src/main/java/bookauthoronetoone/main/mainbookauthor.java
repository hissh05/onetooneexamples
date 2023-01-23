package bookauthoronetoone.main;

import java.time.LocalDate;

import bookauthoronetoone.dao.bookDAO;
import bookauthoronetoone.entity.Author;
import bookauthoronetoone.entity.Book;

public class mainbookauthor {
	
	public static void main(String[] args) {
		Book ab=new Book();
		LocalDate date = LocalDate.now();
		ab.setTitle("bookno1");
		ab.setPublisheddate(date);
		ab.setDescription("first name");
		
		Author au = new Author();
		au.setName("Hissham");
		au.setEmail("his@gamil.com");
		ab.setAuthorid(au);
		
		bookDAO instrDao = new bookDAO();
		instrDao.insertBook(ab);
		
		//to display all instructor
		instrDao.getAllBook();
		
	}
	
}
