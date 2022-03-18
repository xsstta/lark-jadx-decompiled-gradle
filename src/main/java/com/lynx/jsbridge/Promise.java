package com.lynx.jsbridge;

public interface Promise {
    void reject(String str);

    void reject(String str, String str2);

    void resolve(Object obj);
}
