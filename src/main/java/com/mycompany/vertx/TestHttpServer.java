/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vertx;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.core.AbstractVerticle;
public class TestHttpServer extends AbstractVerticle {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new TestHttpServer());
    }

    @Override
    public void start() throws Exception {
  
      Router router = Router.router(vertx);
  
      router.route().handler(routingContext -> {
        routingContext.response().putHeader("content-type", "text/html").end("Hello World!");
      });
  
      vertx.createHttpServer().requestHandler(router).listen(8080);
    }

}