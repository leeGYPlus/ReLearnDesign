package com.aline.creational.factorymethod02;

public class PhpVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PhpVideo();
    }
}
