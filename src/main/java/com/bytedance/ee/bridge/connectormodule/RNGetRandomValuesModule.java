package com.bytedance.ee.bridge.connectormodule;

import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@ReactModule(name = "RNGetRandomValues")
public class RNGetRandomValuesModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGetRandomValues";
    }

    public RNGetRandomValuesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public String getRandomBase64(int i) throws NoSuchAlgorithmException {
        Log.d("RNGetRandomValuesModule", "get by rn");
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 2);
    }
}
