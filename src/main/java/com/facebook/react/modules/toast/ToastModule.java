package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.C21108a;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "ToastAndroid")
public class ToastModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ToastAndroid";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap a = C21108a.m76727a();
        a.put("SHORT", 0);
        a.put("LONG", 1);
        a.put("TOP", 49);
        a.put("BOTTOM", 81);
        a.put("CENTER", 17);
        return a;
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void show(final String str, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.toast.ToastModule.RunnableC212581 */

            public void run() {
                Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i).show();
            }
        });
    }

    @ReactMethod
    public void showWithGravity(final String str, final int i, final int i2) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.toast.ToastModule.RunnableC212592 */

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                makeText.show();
            }
        });
    }

    @ReactMethod
    public void showWithGravityAndOffset(final String str, final int i, final int i2, final int i3, final int i4) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.toast.ToastModule.RunnableC212603 */

            public void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, i3, i4);
                makeText.show();
            }
        });
    }
}
