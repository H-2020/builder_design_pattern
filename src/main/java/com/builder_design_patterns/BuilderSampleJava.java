package com.builder_design_patterns;

public class BuilderSampleJava {
    public String field1;
    public int field2;
    public double field3;
    public boolean field4;

    public String field5;
    public int field6;
    public double field7;
    public boolean field8;

    public String field9;
    public int field10;
    public double field11;
    public boolean field12;

    public String field13;
    public int field14;
    public double field15;
    public boolean field16;

    public String field17;
    public int field18;
    public double field19;
    public boolean field20;



    public BuilderSampleJava(Builder builder){
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
        this.field5 = builder.field5;
        this.field6 = builder.field6;
        this.field7 = builder.field7;
        this.field8 = builder.field8;
        this.field9 = builder.field9;
        this.field10 = builder.field10;
        this.field11 = builder.field11;
        this.field12 = builder.field12;
        this.field13 = builder.field13;
        this.field14 = builder.field14;
        this.field15 = builder.field15;
        this.field16 = builder.field16;
        this.field17 = builder.field17;
        this.field18 = builder.field18;
        this.field19 = builder.field19;
        this.field20 = builder.field20;
    }
    public static void main(String[] args) {

        BuilderSampleJava builderSample = new BuilderSampleJava.
                Builder().

                setField1("field1").
                setField2(22).
                setField3(2.1).
                setField4(true).
                setField5("field1").
                setField6(22).
                setField8(true).
                setField9("field1").
                setField10(22).
                setField12(true).
                setField13("field1").
                setField14(22).
                setField15(2.1).
                setField16(true).
                setField17("field1").
                setField18(22).
                setField19(2.1).
                setField20(true).

                build();


        System.out.println(builderSample.field1);
        System.out.println(builderSample.field2);
        System.out.println(builderSample.field3);
        System.out.println(builderSample.field4);
        System.out.println(builderSample.field5);
        System.out.println(builderSample.field6);
        System.out.println(builderSample.field7);
        System.out.println(builderSample.field8);
        System.out.println(builderSample.field9);
        System.out.println(builderSample.field10);
        System.out.println(builderSample.field11);
        System.out.println(builderSample.field12);
        System.out.println(builderSample.field13);
        System.out.println(builderSample.field14);
        System.out.println(builderSample.field15);
        System.out.println(builderSample.field16);
        System.out.println(builderSample.field17);
        System.out.println(builderSample.field18);
        System.out.println(builderSample.field19);
        System.out.println(builderSample.field20);
    }

    public static class Builder{

        private String field1;
        private int field2;
        private double field3;
        private boolean field4;

        private String field5;
        private int field6;
        private double field7;
        private boolean field8;

        private String field9;
        private int field10;
        private double field11;
        private boolean field12;

        private String field13;
        private int field14;
        private double field15;
        private boolean field16;

        private String field17;
        private int field18;
        private double field19;
        private boolean field20;

        public Builder(){

        }

        public Builder setField1(String field1) {
            this.field1 = field1;
            return this;
        }

        public Builder setField2(int field2) {
            this.field2 = field2;
            return this;
        }

        public Builder setField3(double field2) {
            this.field3 = field3;
            return this;
        }

        public Builder setField4(boolean field4) {
            this.field4 = field4;
            return this;
        }

        public Builder setField5(String field5) {
            this.field5 = field5;
            return this;
        }

        public Builder setField6(int field6) {
            this.field6 = field6;
            return this;
        }

        public Builder setField7(double field7) {
            this.field7 = field7;
            return this;
        }

        public Builder setField8(boolean field8) {
            this.field8 = field8;
            return this;
        }

        public Builder setField9(String field9) {
            this.field9 = field9;
            return this;
        }

        public Builder setField10(int field10) {
            this.field10 = field10;
            return this;
        }

        public Builder setField11(double field11) {
            this.field11 = field11;
            return this;
        }

        public Builder setField12(boolean field12) {
            this.field12 = field12;
            return this;
        }

        public Builder setField13(String field13) {
            this.field13 = field13;
            return this;
        }

        public Builder setField14(int field14) {
            this.field14 = field14;
            return this;
        }

        public Builder setField15(double field15) {
            this.field15 = field15;
            return this;
        }

        public Builder setField16(boolean field16) {
            this.field16 = field16;
            return this;
        }

        public Builder setField17(String field17) {
            this.field17 = field17;
            return this;
        }

        public Builder setField18(int field18) {
            this.field18 = field18;
            return this;
        }

        public Builder setField19(double field19) {
            this.field19 = field19;
            return this;
        }

        public Builder setField20(boolean field20) {
            this.field20 = field20;
            return this;
        }

        public BuilderSampleJava build(){
            return new BuilderSampleJava(this);
        }


    }

}
