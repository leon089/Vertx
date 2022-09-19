/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vertx;

import io.vertx.core.AbstractVerticle;

public class HelloVerticle extends AbstractVerticle {


    @Override
    public void stop() {
        System.out.println("Shutting down HelloVerticle");
    }

    @Override
    public void start() throws Exception {
        System.out.println("Starting HelloVerticle");
        super.start();
    }



    
}