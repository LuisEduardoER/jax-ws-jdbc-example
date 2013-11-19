package guermann.sample.wssample;
import java.sql.Connection;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
   public class VehicleService {
     	
		@WebMethod
		public List<Vehicle> getVehicleList() {
			List<Vehicle> vehicleList = null;
			try {
				LogUtils.logInfo(this, "In getVehicleList");
				DatasourceHolder datasourceHolder = DatasourceHolder.getInstance();
				try (Connection	conn = datasourceHolder.getDataSource().getConnection()) {
					LogUtils.logInfo(this, "After get Connection");
					vehicleList = new VehicleDBService().getVehicleList(conn);
				}
				LogUtils.logInfo(this, "Before return");
				return vehicleList;
			} catch (Exception e) {
				LogUtils.logInfo(this, "In Exception");
				LogUtils.logSevere(this, e.toString());
				return null;
			}
		}
}