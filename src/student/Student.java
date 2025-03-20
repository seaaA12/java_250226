package student;

import java.util.ArrayList;

public class Student {

	private String stdNum;
	private String stdName;
	private String stdAge;
	private String stdPhone;
	private String stdAddress;
	private ArrayList<Subject>subList = new ArrayList<>();
	private int cnt;
	private int score;
	
	public Student() {}

	public Student(String stdNum, String stdName, String stdAge, String stdPhone, String stdAddress) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
		this.stdAddress = stdAddress;
	}

	public Student(String stdNum, String stdName) {
		this.stdNum = stdNum;
		this.stdName = stdName;
	}
	
	public void insertSub(Subject s) {
		subList.add(s);
		cnt++;
	}
	public void deleteSub(Subject subNum) {
		int index =-1;
		if(subNum == null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(subList.get(i).getSubNum().equals(subNum)) {
				index = i;
				break;
			}
		}
		for(int i=index; i<cnt-1; i++) {
			subList.remove(i);
			System.out.println("수강철회 완료");
		}
	}

	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAge() {
		return stdAge;
	}

	public void setStdAge(String stdAge) {
		this.stdAge = stdAge;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public String getStdAddress() {
		return stdAddress;
	}

	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "[학번:" + stdNum + ", 이름:" + stdName + ", 나이:" + stdAge + ", 전화번호:" + stdPhone
				+ ", 주소:" + stdAddress + ", 수강중인 과목:" + subList.stream()+ "]";
	}
	
	
}
