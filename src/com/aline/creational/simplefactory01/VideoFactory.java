package com.aline.creational.simplefactory01;


/**
 * 简单工厂的缺点：如果要添加其他可能，那么需要修改 VideoFactory 类，随着业务的增加，Video 类也会增加，
 * 修改 VideoFactory 会增加风险，不符合开闭原则
 */
public class  VideoFactory {
    public Video getVideo(String type){
        if (type.equalsIgnoreCase("java")){
            return new JavaVideo();
        }else if(type.equalsIgnoreCase("python")){
            return new PythonVideo();
        }
        return null;
    }

    public Video getVideo(Class clazz){
        Video video = null;
        try {
             video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
