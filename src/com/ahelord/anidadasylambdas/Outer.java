package com.ahelord.anidadasylambdas;

import com.ahelord.clases.Product;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Outer {


    public void reuseNow() {
        StaticNested myNested = new StaticNested();
        myNested.getNow();
    }

    public void createMember(int quantity) {
        Member member = new Member(quantity);
    }

    // static
    public static class StaticNested {
        void getNow() {
            System.out.println(LocalDateTime.now());
        }
    }

    //member
    class Member {
        private int quantity;

        public Member(int quantity) {
            this.quantity = quantity;
        }
    }

    // Local inner class
    public int getOrder() {
        class Order {
            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            private int id;

            public Order(int id) {
                this.id = id;
            }

        }
        Order order = new Order(5);
        return order.getId();
    }


}
