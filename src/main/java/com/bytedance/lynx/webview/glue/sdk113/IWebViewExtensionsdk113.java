package com.bytedance.lynx.webview.glue.sdk113;

import android.graphics.Canvas;
import com.bytedance.lynx.webview.extension.C19932a;

public interface IWebViewExtensionsdk113 {

    public interface BlankDetectAsyncCallbackImpl {
        void onResult(String str);
    }

    public interface DownloadFileCallback {
        void onDownloadFinish(String str, boolean z, String str2);
    }

    public interface GrabSnapshotAsyncCallback {
        void onResult(Canvas canvas, boolean z);
    }

    boolean blankDetectAsyncImpl(Object obj, int i) throws Exception;

    void downloadFileImpl(String str, Object obj) throws Exception;

    boolean grabSnapshotAsyncImpl(Canvas canvas, Object obj) throws Exception;

    boolean isFeatureSupport(String str);

    boolean isFeatureSupport(String str, int i);

    void notifyV8ToGC();

    void resetWebView();

    void setIsolateCookieInfo(C19932a aVar);

    void setMemoryEventListener(Object obj);

    void setWebContentsDebuggingEnabled(boolean z);
}
