package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;

@ReactModule(name = "JSCHeapCapture", needsEagerInit = true)
public class JSCHeapCapture extends ReactContextBaseJavaModule {
    private AbstractC21115a mCaptureInProgress;

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    /* renamed from: com.facebook.react.devsupport.JSCHeapCapture$a */
    public interface AbstractC21115a {
        /* renamed from: a */
        void mo71782a(CaptureException captureException);

        /* renamed from: a */
        void mo71783a(File file);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "JSCHeapCapture";
    }

    public static class CaptureException extends Exception {
        CaptureException(String str) {
            super(str);
        }

        CaptureException(String str, Throwable th) {
            super(str, th);
        }
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public synchronized void captureComplete(String str, String str2) {
        AbstractC21115a aVar = this.mCaptureInProgress;
        if (aVar != null) {
            if (str2 == null) {
                aVar.mo71783a(new File(str));
            } else {
                aVar.mo71782a(new CaptureException(str2));
            }
            this.mCaptureInProgress = null;
        }
    }

    public synchronized void captureHeap(String str, AbstractC21115a aVar) {
        if (this.mCaptureInProgress != null) {
            aVar.mo71782a(new CaptureException("Heap capture already in progress."));
            return;
        }
        File file = new File(str + "/capture.json");
        file.delete();
        HeapCapture heapCapture = (HeapCapture) getReactApplicationContext().getJSModule(HeapCapture.class);
        if (heapCapture == null) {
            aVar.mo71782a(new CaptureException("Heap capture js module not registered."));
            return;
        }
        this.mCaptureInProgress = aVar;
        heapCapture.captureHeap(file.getPath());
    }
}
