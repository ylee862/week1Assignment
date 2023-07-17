public class Customer {
    private long cash;

    public void askShoe(String shoeType) {
        System.out.println("손님: " + shoeType + " 운동화에 대해 알려주세요");
    }

    public void checkCost (long customerMoney, long nikeSneakersPrice, boolean isCustomerLikeDelivery) {

        if (customerMoney < nikeSneakersPrice) {
            System.out.println("손님: 아 그럼, 다음에 올게요. 기분이 보통 이고 잔액이 "  +customerMoney+ " 남았습니다");
        }
        else if (!isCustomerLikeDelivery) {
            System.out.println("손님: 아 그럼, 다음에 올게요. 기분이 보통 이고 잔액이 "  +customerMoney+ " 남았습니다");
        }

        else{
            System.out.println("손님: 네 좋네요, 주문 계속 진행할게요");
        }
    }

    public void checkCostDelivery(long customerMoney, long nikeSneakersPrice, int costForDeliver) {
        if (customerMoney >= (nikeSneakersPrice + costForDeliver)) {
            System.out.println("손님: 네 좋네요, 주문 계속 진행할게요");
        }

        else {
            System.out.println("손님: 배송료가 너무 비싸네요, 신발가격 환불해주새요.");
        }
    }


    public void setCashAmount (long cash) {
        this.cash = cash;
    }

    public long getCash () {
        return this.cash;
    }

    public long amountLeft (long cashUse) {
        this.cash -= cashUse;
        return this.cash;
    }

    public void shoeWearing(String nikeSneakersFeature, long cash) {
        System.out.println("손님: 이 신발은 " + nikeSneakersFeature + " 의 특징이 느껴지네요, 기분이 좋음이고, 잔액 " + cash + " 남았습니다");
    }
















}
