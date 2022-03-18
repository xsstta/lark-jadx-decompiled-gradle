package com.bytedance.ee.falcon.openplugin;

import com.lark.falcon.engine.bridge.WritableMap;
import com.lark.falcon.engine.module.AbstractC24015c;
import com.lark.falcon.engine.module.anonotations.JavaScriptObject;

@JavaScriptObject
public interface LarkWebViewJavaScriptBridge extends AbstractC24015c {
    void nativeCallBack(WritableMap writableMap);
}
