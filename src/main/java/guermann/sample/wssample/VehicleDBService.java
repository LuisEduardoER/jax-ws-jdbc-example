package guermann.sample.wssample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDBService {
	
	private static final String STMT_STR = "select id,	object_type, category, vehicle_name, active_bko from vehicle";
	
	private static final String ID_F = "id";
	private static final String OBJECT_TYPE_F = "object_type";
	private static final String CATEGORY_F = "category";
	private static final String VEHICLE_NAME_F = "vehicle_name";
	private static final String ACTIVE_BKO_F = "active_bko";

	private static Vehicle populate (ResultSet rs)
				throws SQLException {
		
		Vehicle vehicle = new Vehicle (rs.getLong(ID_F),
							rs.getInt(OBJECT_TYPE_F),
							rs.getInt(CATEGORY_F),
							rs.getString(VEHICLE_NAME_F),
							rs.getLong(ACTIVE_BKO_F));
		return vehicle;
	}

	
	public VehicleDBService () {
		
	}
	
	public List<Vehicle> getVehicleList(Connection conn) throws SQLException {
		
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		try (PreparedStatement ps = 
				conn.prepareStatement(STMT_STR)) {
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
		        	Vehicle vehicle = populate(rs);
		        	list.add(vehicle);
		        }
		    }
		}

        return (list);
	}

}
