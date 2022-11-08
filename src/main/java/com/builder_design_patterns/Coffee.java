package com.builder_design_patterns;

public class Coffee {
    public int price;
    public String name;
    public boolean isSugar;
    public boolean isMilk;

    public Coffee(Builder builder) {
        this.isMilk = builder.isMilk;
        this.name = builder.name;
        this.isSugar = builder.isSugar;
        this.price = builder.price;
    }

    public static class Builder {
        private int price;
        private String name;
        private boolean isSugar;
        private boolean isMilk;

        public Builder() {

        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIsSugar(boolean isSugar) {
            this.isSugar = isSugar;
            return this;
        }

        public Builder setIsMilk(boolean isMilk) {
            this.isMilk = isMilk;
            return this;
        }



        public Coffee build() {
            return new Coffee(this);
        }
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee.
                Builder().
                setPrice(1).
                setIsMilk(true).
                setIsSugar(false).
                setName("large").
                build();


        System.out.println(coffee.name);
    }
}
