package guermann.sample.wssample;

	/*
	 * Транспортное средство
	 */
	public class Vehicle {
		
		private long id;
		private int objectType;
		private int category;
		private String vehicleName;
		private long activeBKO;
		
		public Vehicle() {
			
		}
		
		public Vehicle (long id, int vehicleType, int category, 
							String vehicleName, long activeBKO) {
			this.id = id;
			this.objectType = vehicleType;
			this.category = category;
			this.vehicleName = vehicleName;
			this.activeBKO = activeBKO;
		}
		
		public long getId() {
			return id;
		}
		
		public void setId(long id) {
			this.id = id;
		}
		
		public int getObjectType() {
			return objectType;
		}
		
		public void setObjectType(int objectType) {
			this.objectType = objectType;
		}
		
		public int getCategory() {
			return category;
		}
		
		public void setCategory(int category) {
			this.category = category;
		}
		
		public String getVehicleName() {
			return vehicleName;
		}
		
		public void setVehicleName(String vehicleName) {
			this.vehicleName = vehicleName;
		}

		public long getActiveBKO() {
			return activeBKO;
		}

		public void setActiveBKO(long activeBKO) {
			this.activeBKO = activeBKO;
		}

}
