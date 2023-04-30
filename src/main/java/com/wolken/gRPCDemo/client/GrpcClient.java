package com.wolken.gRPCDemo.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.wolken.gRPCDemo.HelloRequest;
import org.wolken.gRPCDemo.HelloResponse;
import org.wolken.gRPCDemo.HelloServiceGrpc;

public class GrpcClient {
    public static void main(String args[]){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",8080)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("Syed")
                .setLastName("Asif")
                .build());

        System.out.println("Response received from server:\n" + helloResponse);

        channel.shutdown();
    }
}
