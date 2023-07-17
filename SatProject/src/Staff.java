public class Staff {
    private long sales;

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


    public void offerPay(long nikeSneakersPrice) {

            System.out.println("직원: 고객님 신발 주문 도와드리겠습니다. " + nikeSneakersPrice + " 입니다.");

    }

    public void deliveryInfo(int daysForDeliver, int costForDeliver) {
        System.out.println("직원: 고객님 배송은 " + daysForDeliver + "일 걸릴 예정이고, 배송 금액은 " + costForDeliver + "소요되십니다");
    }



}
