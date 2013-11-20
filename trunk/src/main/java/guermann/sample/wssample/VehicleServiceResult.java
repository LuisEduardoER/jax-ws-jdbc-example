package guermann.sample.wssample;

import java.util.List;

public class VehicleServiceResult {
	
	private long memorySize;
	private List<Vehicle> vehicleList;
	
	public VehicleServiceResult () {
		
	}

	public VehicleServiceResult(long memorySize, List<Vehicle> vehicleList) {
		this.memorySize = memorySize;
		this.vehicleList = vehicleList;
	}
	
	public long getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(long memorySize) {
		this.memorySize = memorySize;
	}

	public List<Vehicle> getVehicleList() {
		return vehicleList;
	}

	public void setVehicleList(List<Vehicle> vehicleList) {
		this.vehicleList = vehicleList;
	}
	
}
