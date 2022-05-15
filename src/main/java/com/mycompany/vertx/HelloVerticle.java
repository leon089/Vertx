/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vertx;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.logging.Logger;

public class HelloVerticle extends AbstractVerticle {

    
    private static final Logger LOGGER = null;

    // @Override
    // public void start(Future<Void> future) {
        // vertx.createHttpServer()
        //   .requestHandler(r -> r.response().end("Welcome to Vert.x Intro");
        //   }).listen(9090), 
        //     result -> {
        //       if (result.succeeded()) {
        //           future.complete();
        //       } else {
        //           future.fail(result.cause());
        //       }
        //   });
        
    // }


    @Override
    public void stop() {
        System.out.println("Shutting down application");
    }

    @Override
    public void start() throws Exception {
        // TODO Auto-generated method stub
        super.start();
    }



    
}