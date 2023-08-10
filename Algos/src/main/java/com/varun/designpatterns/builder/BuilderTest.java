package com.varun.designpatterns.builder;

public class BuilderTest {
    public static void main(String[] args) {
        URLBuilder.Builder builder = new URLBuilder.Builder();

        URLBuilder urlBuilder = builder.protocol("https")
                .queryParam("varun")
                .port("8080")
                .hostName("google.com")
                .build();

        System.out.println(urlBuilder);
    }
}
