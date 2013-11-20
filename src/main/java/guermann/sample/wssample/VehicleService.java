package guermann.sample.wssample;
import java.net.URL;
import java.sql.Connection;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
   public class VehicleService {
     
		private static final String MEMINFO_SERVICE_WSDL_LOCATION = "http://localhost:8080/MeminfoService-1.0-SNAPSHOT/MeminfoService?wsdl"; 
		
		@WebMethod
		public VehicleServiceResult getVehicleList() {
			List<Vehicle> vehicleList = null;
			try {
				
				DatasourceHolder datasourceHolder = DatasourceHolder.getInstance();
				try (Connection	conn = datasourceHolder.getDataSource().getConnection()) {
					vehicleList = new VehicleDBService().getVehicleList(conn);
				}
				
				MeminfoServiceService miss = new MeminfoServiceService(new URL(MEMINFO_SERVICE_WSDL_LOCATION));
				MeminfoService mis = miss.getMeminfoServicePort();
				long value = mis.getAvailableMemorySize();
				return new VehicleServiceResult(value, vehicleList);
			} catch (Exception e) {
				LogUtils.logInfo(this, "Got exception");
				LogUtils.logSevere(this, e.toString());
				return null;
			}
		}
}