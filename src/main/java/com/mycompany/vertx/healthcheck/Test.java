package com.mycompany.vertx.healthcheck;

import io.vertx.core.Vertx;
import io.vertx.ext.healthchecks.HealthChecks;
import io.vertx.ext.healthchecks.Status;

public class Test {
        public static void main(String[] args) {

                HealthChecks hc = HealthChecks.create(Vertx.vertx());

                // hc.register(
                //                 "my-procedure",
                //                 promise -> promise.complete(Status.OK()));

                // Register with a timeout. The check fails if it does not complete in time.
                // The timeout is given in ms.
                hc.register(
                                "my-procedure",
                                2000,
                                promise -> promise.complete(Status.OK()));

        }
}
