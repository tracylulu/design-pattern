package net.xdclass.state;

/**
 * 小滴课堂,愿景：让技术不再难学 https://xdclass.net
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群 微信 xdclass6
 * @Version 1.0
 **/

public class OrderContext {

    private State state;

    public OrderContext(){}

//    public OrderContext(State state){
//        this.state = state;
//    }


    public void setState(State state) {
        this.state = state;
        System.out.println("订单状态边更！！");
        this.state.handle();
    }
}
