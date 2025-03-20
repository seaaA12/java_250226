package student;

public class Subject {

	private String subNum;
	private String subName;
	private int subPoint;
	private int subTime;
	private String subProfessor;
	private String subTimeTable;
	private String subRoom;
	
	public Subject() {}

	public Subject(String subNum, String subName, int subPoint, int subTime, String subProfessor, String subTimeTable,
			String subRoom) {
		this.subNum = subNum;
		this.subName = subName;
		this.subPoint = subPoint;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subTimeTable = subTimeTable;
		this.subRoom = subRoom;
	}

	@Override
	public String toString() {
		return "[과목번호:" + subNum + ", 과목명:" + subName + ", 학점:" + subPoint + ", 수업시" + subTime
				+ ", 교수님:" + subProfessor + ", 시간표:" + subTimeTable + ", 강의실:" + subRoom + "]";
	}
	public String getSubNum() {
		return subNum;
	}

	public void setSubNum(String subNum) {
		this.subNum = subNum;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubPoint() {
		return subPoint;
	}

	public void setSubPoint(int subPoint) {
		this.subPoint = subPoint;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubTimeTable() {
		return subTimeTable;
	}

	public void setSubTimeTable(String subTimeTable) {
		this.subTimeTable = subTimeTable;
	}

	public String getSubRoom() {
		return subRoom;
	}

	public void setSubRoom(String subRoom) {
		this.subRoom = subRoom;
	}


	public Subject(String subNum, String subName) {
		super();
		this.subNum = subNum;
		this.subName = subName;
	}
}
