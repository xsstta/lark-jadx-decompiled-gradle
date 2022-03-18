package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "JSDevSupport")
public class JSDevSupport extends ReactContextBaseJavaModule {
    private volatile AbstractC21116a mCurrentCallback;

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    /* renamed from: com.facebook.react.devsupport.JSDevSupport$a */
    public interface AbstractC21116a {
        /* renamed from: a */
        void mo71789a(int i, Exception exc);

        /* renamed from: a */
        void mo71790a(String str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JSDevSupport";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ERROR_CODE_EXCEPTION", 0);
        hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", 1);
        return hashMap;
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public synchronized void onSuccess(String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.mo71790a(str);
        }
    }

    public synchronized void computeDeepestJSHierarchy(View view, AbstractC21116a aVar) {
        getJSHierarchy(Integer.valueOf(((View) C21127e.m76802a(view).first).getId()).intValue(), aVar);
    }

    @ReactMethod
    public synchronized void onFailure(int i, String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.mo71789a(i, new RuntimeException(str));
        }
    }

    public synchronized void getJSHierarchy(int i, AbstractC21116a aVar) {
        JSDevSupportModule jSDevSupportModule = (JSDevSupportModule) getReactApplicationContext().getJSModule(JSDevSupportModule.class);
        if (jSDevSupportModule == null) {
            aVar.mo71789a(0, new JSCHeapCapture.CaptureException("JSDevSupport module not registered."));
            return;
        }
        this.mCurrentCallback = aVar;
        jSDevSupportModule.getJSHierarchy(i);
    }
}
