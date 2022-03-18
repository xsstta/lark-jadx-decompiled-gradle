package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

@ReactModule(name = "FileReaderModule")
public class FileReaderModule extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "FileReaderModule";
    }

    private BlobModule getBlobModule() {
        return (BlobModule) getReactApplicationContext().getNativeModule(BlobModule.class);
    }

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void readAsDataURL(ReadableMap readableMap, Promise promise) {
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("data:");
            if (!readableMap.hasKey(ShareHitPoint.f121869d) || readableMap.getString(ShareHitPoint.f121869d).isEmpty()) {
                sb.append("application/octet-stream");
            } else {
                sb.append(readableMap.getString(ShareHitPoint.f121869d));
            }
            sb.append(";base64,");
            sb.append(Base64.encodeToString(resolve, 2));
            promise.resolve(sb.toString());
        } catch (Exception e) {
            promise.reject(e);
        }
    }

    @ReactMethod
    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        byte[] resolve = getBlobModule().resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject("ERROR_INVALID_BLOB", "The specified blob is invalid");
            return;
        }
        try {
            promise.resolve(new String(resolve, str));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
