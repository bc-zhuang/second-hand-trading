package com.second.hand.trading.server.Exception;

import java.util.Map;

// 自定义运行时异常类
public class ParamException extends RuntimeException{
    private Map map;

    public ParamException(Map map) {
        this.map = map;
    }

    public Map getMap() {
        return map;
    }
}
