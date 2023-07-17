public class Customer {
    private long cash;
    private boolean isCustomerLikeDelivery;

    private String shoeType;
    private String myFeeling;

    private boolean buying;



    public void askShoe(String shoeType) {
        System.out.println("손님: " + shoeType + " 운동화에 대해 알려주세요");
    }

    public long amountLeft (long cashUse) {
        this.cash -= cashUse;
        return cashUse;
    }

    public long getCash () {
        return this.cash;
    }

    public String getShoeType() {
        return shoeType;
    }


    public void upgradeFeeling () {
        this.myFeeling = "기분이 좋아졌다";
    }

    public void setCashAmount (long cash) {
        this.cash = cash;
    }


    public void checkCost (long customerMoney, long nikeSneakersPrice) {

        if (customerMoney < nikeSneakersPrice) {
            System.out.println("손님: 아 그럼, 다음에 올게요. 기분이 보통 이고 잔액이 "  +customerMoney+ " 남았습니다");
        }

        else{
            System.out.println("손님: 네 좋네요, 주문 계속 진행할게요");
        }
    }








}
