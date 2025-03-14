package day12;

public class CustomerMain {

	public static void main(String[] args) {
		/*백화점
		 * 일반고객/ Gold고객(할인)/vip고객(할인)
		 * 
		 * 고객 -> Customer
		 * 멤버변수
		 * 고객 id: int customerID
		 * 고객이름: String customerName
		 * 고객등급: String customerGrade
		 * 보너스포인트 : int bonusPoint
		 * 보너스포인트 적립비율 : double bonusRatio
		 * 
		 * 등급
		 * silver/ gold/vip
		 * 기본 customerGrade = silver
		 * bonusRatio = 0.01%=>1 %적립
		 * 
		 * 클래스 생성
		 * 매서드
		 * 1. 보너스 적립 계산 매서드(매서드명: calcPrice)
		 * 구매금액의 적립 조너스를 계산-> bonusPoint 누적
		 * 보너스 적립, 할인 여부를 체크해서 구매 price를 리턴
		 * 
		 * 2.출력매서드(매서드명: customerInfo())
		 * -홍길동님은 vip고객이며, 보너스 포인트는 10000점 입니다
		 * -전담 상담사는 000이고, 번호는 1111입니다.<- vip
		 * 
		 * 3.등급별 할인 적립 여부
		 * silver 등급
		 * 제품을 구입할때 0%할인/ 보너스 포인트 1% 적립
		 * gold 등급
		 * 제품을 구입할때 10%할인/ 보너스 포인트 2% 적립
		 * vip 등급
		 * 제품을 구입할때 10%할인/ 보너스 포인트 3% 적립
		 * 전담 상담사를 멤버변수에 추가하여(agentName, agentNum)
		 * 
		 * Customer => Silver
		 * 
		 * GoldCustomer extends Customer{
		 * 	  기본 메서드 오버라이딩 해서 사용
		 * }
		 * 
		 * VIPCustomer extends Customer{
		 *   추가 + 기본 메서드 오버라이딩 해서 사용
		 * } 
		 * 
		 */

		//손님등록
		Customer[] customerList = new Customer[10];
		
		int cnt = 0;
		Customer cLee = new Customer(111, "리정혁");
		Customer cHong = new GoldCustomer(2222, "홍길동");
		Customer cKim = new VIPCustomer(3333, "김철수", 1001,"순이");
		customerList[cnt]= cLee;
		cnt ++;
		customerList[cnt]= cHong;
		cnt ++;
		customerList[cnt]= cKim;
		cnt ++;
		customerList[cnt]= new Customer(4444, "김영이");
		cnt ++;
		customerList[cnt]= new Customer(5555, "최순널");
		cnt ++;
		customerList[cnt]= new VIPCustomer(6666, "짱구", 1002,"영수");
		cnt ++;
		customerList[cnt]= new GoldCustomer(7777, "짱아");
		cnt ++;
		customerList[cnt]= new Customer(8888, "이순신");
		cnt ++;
		customerList[cnt]= new Customer(9999, "김장군");
		cnt ++;
		
		System.out.println("할인율과 포인트 계산");
		
		int price = 100000;
		for(int i=0; i<cnt; i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.println(customerList[i].getCustomerName()+
					"님의 지불금액은"+salePrice+"/보너스 포인트"+
					customerList[i].getBonusPoint());
			System.out.println("-----------------------------");
		}
		System.out.println("고객 정보 리스트");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println("-----------------------------");
		}
		
		//다운캐스팅
		//agentNum = 1001(퇴사) => 1003 변경
		for(int i=0; i<cnt;i++) {
			Customer c = customerList[i];
			if(c instanceof VIPCustomer) {
				VIPCustomer vip = (VIPCustomer)c;
				if(vip.getAgentNum()==1001) {
					vip.setAgentNum(1003);
					vip.setAgentName("아무개");
				}
			}
					
		}
		System.out.println("고객 정보 리스트");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println("-----------------------------");
		}
		
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	