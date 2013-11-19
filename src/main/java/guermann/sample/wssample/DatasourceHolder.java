package guermann.sample.wssample;

import java.sql.SQLException;

import javax.enterprise.context.ApplicationScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DatasourceHolder {
	
	private static String ENV_CONTEXT_NAME = "java:/comp/env";
	private static String DATASOURCE_NAME = "jdbc/teledb";
	
	private DataSource dataSource;
	
	private static DatasourceHolder instance = new DatasourceHolder (); 
	
	public DatasourceHolder ()  {
		initDataSource();
	}
	
	private void initDataSource() {
		
		try {
			LogUtils.logInfo(this,"Init DataSource");
			InitialContext initContext = new InitialContext();
			Context envContext = (javax.naming.Context) 
				initContext.lookup(ENV_CONTEXT_NAME);
		    
			dataSource = (DataSource) 
				envContext.lookup(DATASOURCE_NAME);
			LogUtils.logInfo(this,"Datasource created");
		}
		catch (Exception e) {
			LogUtils.logSevere(this, e.toString());
		}
	}
	
	public static DatasourceHolder getInstance() {
		return instance;
	}
	
	public DataSource getDataSource() {
		return dataSource;
	}
}
