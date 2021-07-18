package cybersoft.java12.springdemo.repository;

import cybersoft.java12.springdemo.container.IoCContainer;
import cybersoft.java12.springdemo.dbconnection.DatabaseConnection;

public class AuthorRepositoryImpl implements AuthorRepository {
	private DatabaseConnection dbConnection;
	
	public AuthorRepositoryImpl() {
		dbConnection = (DatabaseConnection) IoCContainer.getBean("pgConnection");
	}
	
	public void getAuthors() {
		dbConnection.getConnection();
		/** **/
	}
}
