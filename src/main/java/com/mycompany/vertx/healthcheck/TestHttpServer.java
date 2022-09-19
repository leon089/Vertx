/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vertx.healthcheck;

import io.vertx.core.Vertx;
import io.vertx.ext.healthchecks.HealthCheckHandler;
import io.vertx.ext.healthchecks.HealthChecks;
import io.vertx.ext.healthchecks.Status;
import io.vertx.ext.web.Router;
import io.vertx.core.AbstractVerticle;

public class TestHttpServer extends AbstractVerticle {

  public static void main(String[] args) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle(new TestHttpServer());
  }

  @Override
  public void start() throws Exception {
    // HealthChecks hc = HealthChecks.create(vertx);

    // hc.register(
    // "my-procedure",
    // promise -> promise.complete(Status.OK()));

    Router router = Router.router(vertx);

    HealthCheckHandler healthCheckHandler1 = HealthCheckHandler.create(vertx);

    // Register procedures
    // It can be done after the route registration, or even at runtime
    healthCheckHandler1.register("my-procedure-name", promise -> {
      // Do the check ....
      boolean ok = true;
      // Upon success do
      if (ok)
        promise.complete(Status.OK());
      // In case of failure do:
      else
        promise.complete(Status.KO());
    });

    router.get("/health*").handler(healthCheckHandler1);

    router.route().handler(routingContext -> {
      routingContext.response().putHeader("content-type", "text/html").end("Hello World!");
    });

    vertx.createHttpServer().requestHandler(router).listen(8080);
  }

}