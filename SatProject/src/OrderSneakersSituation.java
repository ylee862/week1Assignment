/*
1. '고객'은 '매장 직원'에게 "Nike 운동화에 대해 알려주세요"라고 물어봅니다.
        2. '매장 직원'은 Nike 운동화를 확인하고, 해당 운동화의 특징(편안함|가벼움 등)과 가격을 자세히 설명해줍니다.
        3. '고객'은 '매장 직원'에게 가격을 얻어낸 후, 자신의 결제 가능 여부를 확인한다.
        3- 1. 만약 잔액 부족으로 결제 가능하지 않다면, '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
        4. '고객'이 결제가 가능하다면 '매장 직원'은 Nike 브랜드의 운동화의 재고 여부를 확인합니다.
        4-1.  만약 재고가 있는 경우, '매장 직원'은 재고 있음을 말합니다.
        4-1-0: '고객'은 주문 계속 진행합니다.
        4-1-0: '매장 직원'은 '고객'에게 신발가격 결제를 안내합니다.
        4-1-1: '고객'은 결제를 진행합니다.
        4-1-2: '매장 직원'은 자신의 매상에 돈을 더합니다.
        4-1-3: '매장 직원'은 운동화를 찾아 '고객'에게 전달합니다.
        4-1-4: '고객'은 신규 구매한 Nike 브랜드의 운동화를 신고, 운동화의 특징(편안함| 가벼움 등)을 경험하며 기분이 좋아집니다. 자신의 상태를 말하고 상황이 종료됩니다.
        5. '매장 직원'은 '고객'에게 재고 부족을 안내하고 물품배송 요청 여부를 안내합니다.
        5-1: 만약 '고객'의 배송 주문을 선호하지 않는 사람일 경우
        5-1-0: '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
        6. '고객'의 배송 주문을 선호하는 사람일 경우, '고객'은 주문 계속 진행합니다.
        6-0:	'매장 직원'은 '고객'에게 신발가격 결제를 안내합니다.
        6-1: '고객'은 결제를 진행합니다.
        6-2: '매장 직원'은 자신의 매상에 돈을 더합니다.
        6-3: '매장 직원'은 운동화를 배송하기 위해 '배송 담당자'에게  Nike 운동화 요청합니다.
        6-4: '배송 담당자'는 택배 패키지의 배송 예정소요 일자와 배송료를 '매장직원'에게 응답 해줍니다.
        6-5: '매장 직원'은 배송 예정 소요일자와 배송료를 말해주고, 배송료 + 신발가격을 '고객'에게 전달합니다.
        6-5-1: 만약 배송료 + 신발가격이 고객의 잔고보다 많은 경우
        6-5-1-0: '고객'은 신발 가격을 환불 요청합니다.
        6-5-1-1: '매장 직원'은 신발 가격을 다시 매상에서 빼고, '고객'은 환불 받습니다.
        6-5-1-2 '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
        6-5-2: 만약 배송료 + 신발가격이 고객의 잔고보다 많지 않은 경우
        6-5-2-0: '고객'은 주문 계속 진행합니다.
        6-5-2-1: '배송 담당자'는 Nike 운동화 요청 받아 운동화가 들어있는 택배 패키지를 만듭니다.
        6-5-2-2: '배송 담당자'는 '고객'에게 택배 패키지를 전달합니다.
        6-5-2-3: '고객'은 '배송 담당자' 에게 배송료를 지불합니다.
        6-5-2-4: '배송 담당자'는 '자신의 매상'에 돈을 더합니다.
        6-5-2-5: '고객'은 택배 패키지의 운동화를 신고, 운동화의 특징(편안함| 가벼움 등)을 경험하며 기분이 좋아집니다. 자신의 상태를 말하고 상황이 종료됩니다.
*/
public class OrderSneakersSituation {

    public static void main(String[] args){
        // 변수 변경 가능
        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.

        String shoeType = "Nike";
        boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부

        String nikeSneakersFeature = "편안함"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        long nikeSneakersPrice = 90_000;
        boolean havingNikeSneakersInStore = false; // 매장 Nike sneakers 재고 여부

        int daysForDeliver = 3;
        int costForDeliver = 15_000;


        Customer customer = new Customer();
        customer.setCashAmount(100_000);
        long customerMoney = customer.getCash();

        Staff staff = new Staff();
        staff.setSalesAmount(100_000);


        //logic start
        customer.askShoe(shoeType);

        staff.respondType(shoeType, nikeSneakersFeature, nikeSneakersPrice, havingNikeSneakersInStore);

        customer.checkCost(customerMoney, nikeSneakersPrice, isCustomerLikeDelivery);

        if ((customerMoney >= nikeSneakersPrice) && isCustomerLikeDelivery) {
            staff.offerPay(nikeSneakersPrice);
            long cash = customer.amountLeft(nikeSneakersPrice);

            if (!havingNikeSneakersInStore) {
                staff.deliveryInfo(daysForDeliver, costForDeliver);
                customer.checkCostDelivery(customerMoney, nikeSneakersPrice, costForDeliver);
            }
            customer.shoeWearing(nikeSneakersFeature, cash);

        }
    }
}
