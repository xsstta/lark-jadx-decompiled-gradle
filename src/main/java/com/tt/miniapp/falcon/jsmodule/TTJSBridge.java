package com.tt.miniapp.falcon.jsmodule;

import com.lark.falcon.engine.bridge.WritableMap;
import com.lark.falcon.engine.module.AbstractC24015c;
import com.lark.falcon.engine.module.anonotations.JavaScriptObject;

@JavaScriptObject(name = "ttJSBridge")
public interface TTJSBridge extends AbstractC24015c {
    void callHandler(int i, WritableMap writableMap);

    void invokeHandler(int i, String str);

    void subscribeHandler(String str, WritableMap writableMap);

    void subscribeHandler(String str, String str2);

    void subscribeHandler(String str, String str2, int i);
}
