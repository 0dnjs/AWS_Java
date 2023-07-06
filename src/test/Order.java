package test;

public class Order {
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
    private int stock;
	
	public void showOrderInfo() {
		
		System.out.println("주문 번호: " + orderId);
		System.out.println("상품명: " + productName);
		System.out.println("구매자: " + consumerName);
		System.out.println("가격: " + price);
		System.out.println("수량: " + stock);
		
	}
	
	public static Order builder() {
		
		return new Order();
	}
		
		public Order build() {
			
			return new Order();
		}
		
		public Order orderId(int orderId) {
			
			this.orderId = orderId;
			return this;
			
		}
		
		public Order productName(String productName) {
			
			this.productName = productName;
			return this;
		}
		
		public Order consumerName(String consumerName) {
			
			this.consumerName = consumerName;
			return this;
		}
		
		public Order price(int price) {
			
			this.price = price;
			return this;
		}
		
		Order stock(int stock) {
			
			this.stock = stock;
			return this;
		}
	}


	
	
