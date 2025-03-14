package day12;

public class VIPCustomer extends Customer{

	//할인율 / 전담 상담사 이름/ 상담사 번호
	private double saleRatio;
	private String agentName;
	private int agentNum;
	
	public VIPCustomer() {}

	//생성자 
	public VIPCustomer(int id, String name, int agentNum ,String agentName) {
		super(id,name);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.03;
		this.saleRatio = 0.1;
		this.agentNum = agentNum;
		this.agentName = agentName;
	}
	
	// 매서드 오버라이딩
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += (int)(price*bonusRatio);
		return price- (int)(price * saleRatio);
	}
	@Override
	public void customerInfo() {
		// TODO Auto-generated method stub
		super.customerInfo();
		System.out.println("담당 상담사는"+ agentName+"("+ agentNum+") 입니다");
	}

	
	public double getSaleRatio() {
		return saleRatio;
	}


	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public int getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(int agentNum) {
		this.agentNum = agentNum;
	}
	
	
}
