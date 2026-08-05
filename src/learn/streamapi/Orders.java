package learn.streamapi;

public record Orders(int orderid,String itemname,OrderStatus status) {

}
enum OrderStatus {
	PACKING,DELIVERED,NOT_DELIVERED,RETURN1;
}

