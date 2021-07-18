package cybersoft.java12.springdemo.service;

import cybersoft.java12.springdemo.container.IoCContainer;
import cybersoft.java12.springdemo.repository.AuthorRepository;

public class AuthorService {
	/*
	 * Hãy cài đặt code sao cho lớp AuthorService
	 * có thể sử dụng AuthorRepository mà không
	 * bị phụ thuộc vào module cấp thấp
	 */
	private AuthorRepository repository;
	
	public AuthorService() {
		repository = (AuthorRepository) IoCContainer.getBean("authorRepository");
	}
	
}
