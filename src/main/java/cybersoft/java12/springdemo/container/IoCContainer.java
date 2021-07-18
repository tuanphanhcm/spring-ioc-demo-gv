package cybersoft.java12.springdemo.container;

import cybersoft.java12.springdemo.dbconnection.DbDataSource;
import cybersoft.java12.springdemo.dbconnection.MySqlConnection;
import cybersoft.java12.springdemo.dbconnection.PgConnection;
import cybersoft.java12.springdemo.repository.AuthorRepository;
import cybersoft.java12.springdemo.repository.AuthorRepositoryImpl;

public class IoCContainer {
	private static MySqlConnection mySqlConnection = null;
	private static PgConnection pgConnection = null;
	private static DbDataSource dataSource = null;
	private static AuthorRepository authorRepository = null;
	
	static public Object getBean(String beanName) {
		switch (beanName) {
		case "mySqlConnection":
			return getMySqlConnection();
		case "pgConnection":
			return getPgConnection();
		case "dataSource":
			return getDataSource();
		case "authorRepository":
			return getAuthorRepository();
		default:
			break;
		}
		return null;
	}

	private static Object getAuthorRepository() {
		return authorRepository == null 
				? new AuthorRepositoryImpl() 
				: authorRepository;
	}

	private static Object getDataSource() {
		return dataSource == null
				? new DbDataSource("","","") : dataSource;
	}

	private static Object getPgConnection() {
		return pgConnection == null 
				? new PgConnection((DbDataSource) getDataSource()) 
				: pgConnection;
	}

	private static Object getMySqlConnection() {
		return mySqlConnection == null 
				? new MySqlConnection((DbDataSource) getDataSource()) 
				: mySqlConnection;
	}
	
	
}
