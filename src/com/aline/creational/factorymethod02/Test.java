package com.aline.creational.factorymethod02;


/**
 * 工厂方法核心： 创建对象的动作 延迟到 子类
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();

        // 只需要将 videoFactory 指向 PythonVideoFactory 实例对象
        videoFactory = new PythonVideoFactory();
        video = videoFactory.getVideo();
        video.product();

        // 扩展性：如果要添加新的 Video，则新建对象的 Video 和 对象的工厂类就可以
        videoFactory = new PhpVideoFactory() ;
        video = videoFactory.getVideo();
        video.product();
    }
}
