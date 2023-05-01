package com.driver;

public class Pizza {



    private int cheesePrice;
    private int basePrice;
    private int toppingPrice;
    private int paperBagPrice;
    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean isCheeseAdded ;
    private boolean isToppingsAdded;
    private boolean isPaperbagAdded;

    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            basePrice = 300;

            toppingPrice = 70;
        }
        else{
            basePrice = 400;
            toppingPrice = 120;


        }
        price = basePrice;
        cheesePrice = 80;
        paperBagPrice = 20;
        isCheeseAdded = false;
        isToppingsAdded = false;
        isPaperbagAdded = false;
        bill = "Base Price Of The Pizza: "+basePrice +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            isCheeseAdded = true;// so prevent it from adding again
            this.price = this.price + cheesePrice;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            isToppingsAdded = true;
            this.price = this.price + toppingPrice;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isPaperbagAdded == false){

            this.price = this.price + paperBagPrice;
            isPaperbagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){


               if(isCheeseAdded==true){
                   bill = bill + "Extra Cheese Added: "+cheesePrice + "\n";
               }
               if(isToppingsAdded == true){
                   bill = bill + "Extra Toppings Added: "+toppingPrice + "\n";
               }
               if(isPaperbagAdded == true){
                   bill = bill +"Paperbag Added: "+paperBagPrice+"\n";
               }

               bill = bill + "Total Price: "+price +"\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
