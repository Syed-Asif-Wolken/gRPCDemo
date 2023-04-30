package com.wolken.gRPCDemo.service.impl;

import io.grpc.stub.StreamObserver;
import org.wolken.gRPCDemo.HelloRequest;
import org.wolken.gRPCDemo.HelloResponse;
import org.wolken.gRPCDemo.HelloServiceGrpc;

/**
 * @author Syed Asif
 */
public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder()
                .append("Hello ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

        HelloResponse response = HelloResponse
                .newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
