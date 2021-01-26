package com.hello.di;

public class HelloWorldDI {

    public static void main(String[] args) {
        MessageProvider provider = new HelloWorldMessageProvider();
        MessageRenderer renderer = new StandardOutMessageRenderer();

        renderer.setMessageProvider(provider);
        renderer.render();
    }
}
