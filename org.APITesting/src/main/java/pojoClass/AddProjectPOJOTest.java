package pojoClass;

public class AddProjectPOJOTest {
	
		String createdBy;
		String projectName;
		String status;
		String teamSize;
		public AddProjectPOJOTest(String createdBy, String projectName, String status, String teamSize) {
			super();
			this.createdBy = createdBy;
			this.projectName = projectName;
			this.status = status;
			this.teamSize = teamSize;
		}
		public AddProjectPOJOTest() {
			super();
		}
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getTeamSize() {
			return teamSize;
		}
		public void setTeamSize(String teamSize) {
			this.teamSize = teamSize;
		}
		
		
	}
