package net.xdclass.state;

/**
 * 小滴课堂,愿景：让技术不再难学
 *
 * @Description
 * @Author 二当家小D
 * @Remark 有问题直接联系我，源码-笔记-技术交流群
 * @Version 1.0
 **/

public class SendOrderState implements State{

    @Override
    public void handle() {
        System.out.println("订单已经发货");
        System.out.println("调用短信服务，告诉用户已经发货");
        System.out.println("更新物流信息\n");
    }
}
