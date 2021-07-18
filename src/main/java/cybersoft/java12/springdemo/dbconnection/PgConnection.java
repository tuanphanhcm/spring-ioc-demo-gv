package cybersoft.java12.springdemo.dbconnection;

public class PgConnection implements DatabaseConnection {
	private DbDataSource dataSource;
	
	public PgConnection(DbDataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void getConnection() {
		System.out.println("Got PostgreSQL Connection.");
	}

}
