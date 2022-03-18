package com.bytedance.ee.bridge.connectormodule;

import com.facebook.react.bridge.JavaScriptModule;

public interface NativeToJsBridge extends JavaScriptModule {
    void requestFromDocs(String str);

    void requestFromNative(String str);
}
