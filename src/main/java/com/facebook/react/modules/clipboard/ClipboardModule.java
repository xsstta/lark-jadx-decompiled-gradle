package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "Clipboard")
public class ClipboardModule extends ContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Clipboard";
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    public ClipboardModule(Context context) {
        super(context);
    }

    @ReactMethod
    public void setString(String str) {
        getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                promise.resolve("");
                return;
            }
            ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
            promise.resolve("" + ((Object) itemAt.getText()));
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
