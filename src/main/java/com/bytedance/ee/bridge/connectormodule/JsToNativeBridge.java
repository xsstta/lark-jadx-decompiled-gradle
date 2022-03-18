package com.bytedance.ee.bridge.connectormodule;

import com.bytedance.ee.log.C13479a;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "JsToNativeBridge")
public class JsToNativeBridge extends ReactContextBaseJavaModule {
    private C12603a mConnector;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JsToNativeBridge";
    }

    public JsToNativeBridge(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public void setConnector(C12603a aVar) {
        this.mConnector = aVar;
    }

    @ReactMethod
    public void responseFromDocs(String str) {
        C12603a aVar = this.mConnector;
        if (aVar == null || str == null) {
            C13479a.m54775e("JsToNativeBridge", "responseFromDocs: mConnector is null");
        } else {
            aVar.mo47892b(str);
        }
    }

    @ReactMethod
    public void responseFromJs(String str) {
        C12603a aVar = this.mConnector;
        if (aVar == null || str == null) {
            C13479a.m54775e("JsToNativeBridge", "responseFromJs: mConnector is null");
        } else {
            aVar.mo47890a(str);
        }
    }
}
