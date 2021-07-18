package cybersoft.java12.springdemo.service;

import org.springframework.stereotype.Component;

@Component
public class BookServiceImpl implements BookService {

	@Override
	public String[] getBooks() {
		String[] books = {"Design Pattern", "Java Recipe", "How to build a maintainable software"};
		return books;
	}

}
