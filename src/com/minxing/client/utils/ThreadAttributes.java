package com.minxing.client.utils;

import java.util.HashMap;
import java.util.Map;

public class ThreadAttributes {

    private static ThreadLocal<Map<String, Object>> threadAttribues = new ThreadLocal<Map<String, Object>>() {

            protected synchronized Map<String, Object> initialValue() {
                    return new HashMap<String, Object>();
            }
    };

    public static Object getThreadAttribute(String name) {

            return threadAttribues.get().get(name);

    }

    public static Object setThreadAttribute(String name, Object value) {

            return threadAttribues.get().put(name, value);

    }

}