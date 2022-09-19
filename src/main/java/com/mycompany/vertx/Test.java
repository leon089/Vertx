/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vertx;

import io.vertx.core.Vertx;
import io.vertx.core.AbstractVerticle;
public class Test extends AbstractVerticle {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new HelloVerticle());

        System.out.println("start timer for 2 sec");
        vertx.setTimer(2000, handler -> {
            System.out.println("timer over, close vertx");
            vertx.close().onComplete(handler2 -> System.out.println("vertx closed!"));
        });
    }

}