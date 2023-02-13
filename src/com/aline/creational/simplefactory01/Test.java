package com.aline.creational.simplefactory01;

public class Test {
    public static void main(String[] args) {
        Video javaVideo = new JavaVideo();
        javaVideo.product();

        Video pythonVideo = new PythonVideo();
        pythonVideo.product();

        // 应用层(Test) 依赖各个 Video 类(JavaVideo\PythonVideo)，为了移除这种依赖，可以使用简单工厂模式
        // 应用层只依赖 VideoFactory
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.product();

        video = videoFactory.getVideo("python");
        video.product();

        // 简单工厂  使用反射,在新增类型时，可以做到不修改工厂类，一定程度上满足 开闭原则
        Video video2 = videoFactory.getVideo(JavaVideo.class);
        video2.product();
        video2 = videoFactory.getVideo(PythonVideo.class);
        video2.product();
    }
}
