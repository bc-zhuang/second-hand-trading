package com.second.hand.trading.server.utils;

import java.util.concurrent.atomic.AtomicInteger;
// 生成id号
public class IdFactoryUtil {

    private static AtomicInteger orderIdEnd=new AtomicInteger(1);
    private static AtomicInteger fileIdEnd=new AtomicInteger(1);

    // 生成订单号
    public static String getOrderId(){
        int newI;
        int ord;
        do{
            ord=orderIdEnd.get();
            newI=(ord+1)%10000;
        }
        while (!orderIdEnd.compareAndSet(ord,newI));
        return System.currentTimeMillis()+""+(newI+10000);
    }

    // 生成文件id
    public static String getFileId(){
        int newI;
        int ord;
        do{
            ord=fileIdEnd.get();
            newI=(ord+1)%1000;
        }
        while (!fileIdEnd.compareAndSet(ord,newI));
        return System.currentTimeMillis()+""+(newI+1000);
    }
}
