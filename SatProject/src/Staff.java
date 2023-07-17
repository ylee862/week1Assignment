public class Staff {
    private long sales;

    private boolean havingNikeSneakersInStore;

    private String nikeSneakersFeature;

    private long nikeSneakersPrice;



    public void respondType(String shoeType, String nikeSneakersFeature, long nikeSneakersPrice, boolean havingNikeSneakersInStore) {
        if (havingNikeSneakersInStore == true) {
            System.out.println("직원: " + shoeType + "의 운동화는 " + nikeSneakersFeature + " 특징과 " + nikeSneakersPrice + " 가격을 가지고 있습니다.");
            System.out.println("직원: 현재 매장에 제고가 존재하네요. 바로 주문 진행 가능합니다");
        }
        else {
            System.out.println("직원: " + shoeType + "의 운동화는 " + nikeSneakersFeature + " 특징과 " + nikeSneakersPrice + " 가격을 가지고 있습니다.");
            System.out.println("직원: 현재 매장에 재고가 존재하지 않네요, 배송주문 가능합니다");
        }
    }


    public void setSalesAmount(long sales) {
        this.sales = sales;
    }

    public void addAmount (long cash) {
        long sales =+ cash;
    }



    public void offerPay(long nikeSneakersPrice) {

            System.out.println("직원: 고객님 신발 주문 도와드리겠습니다. " + nikeSneakersPrice + " 입니다.");

    }



}
