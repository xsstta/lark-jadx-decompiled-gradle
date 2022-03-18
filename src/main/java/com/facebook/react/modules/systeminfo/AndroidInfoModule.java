package com.facebook.react.modules.systeminfo;

import android.app.UiModeManager;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.AbstractC21268a;
import com.larksuite.suite.R;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "PlatformConstants")
public class AndroidInfoModule extends ReactContextBaseJavaModule implements AbstractC21268a {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PlatformConstants";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public void invalidate() {
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), "android_id");
    }

    private String getServerHost() {
        return C21253a.m77052a(Integer.valueOf(INVOKEVIRTUAL_com_facebook_react_modules_systeminfo_AndroidInfoModule_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(getReactApplicationContext().getApplicationContext().getResources(), R.integer.react_native_dev_server_port)));
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("androidx.test.rule.ActivityTestRule");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
        if (currentModeType == 1) {
            return "normal";
        }
        if (currentModeType == 2) {
            return "desk";
        }
        if (currentModeType == 3) {
            return "car";
        }
        if (currentModeType == 4) {
            return "tv";
        }
        if (currentModeType != 6) {
            return "unknown";
        }
        return "watch";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        boolean z;
        HashMap hashMap = new HashMap();
        hashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("Release", Build.VERSION.RELEASE);
        hashMap.put("Serial", Build.SERIAL);
        hashMap.put("Fingerprint", Build.FINGERPRINT);
        hashMap.put("Model", Build.MODEL);
        if ("true".equals(System.getProperty("IS_TESTING")) || isRunningScreenshotTest().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        hashMap.put("isTesting", Boolean.valueOf(z));
        hashMap.put("reactNativeVersion", C21254b.f51775a);
        hashMap.put("uiMode", uiMode());
        return hashMap;
    }

    public AndroidInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static int INVOKEVIRTUAL_com_facebook_react_modules_systeminfo_AndroidInfoModule_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(Resources resources, int i) throws Resources.NotFoundException {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
        if (matchConfig == null) {
            return resources.getInteger(i);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i2 = 0; i2 < min; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i);
        }
    }
}
