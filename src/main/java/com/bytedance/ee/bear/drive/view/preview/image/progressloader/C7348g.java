package com.bytedance.ee.bear.drive.view.preview.image.progressloader;

import androidx.collection.ArrayMap;
import com.bytedance.ee.log.C13479a;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.image.progressloader.g */
public class C7348g {

    /* renamed from: a */
    private final ArrayMap<String, WeakReference<Request>> f19661a = new ArrayMap<>();

    /* renamed from: a */
    public void mo28603a(String str) {
        WeakReference<Request> weakReference = this.f19661a.get(str);
        if (weakReference != null) {
            C13479a.m54764b("ProgressiveImageLoader", String.format("cancel request, key = %s", str));
            Request request = weakReference.get();
            if (request != null) {
                request.mo28453b();
            }
            this.f19661a.remove(str);
        }
    }

    /* renamed from: a */
    public void mo28604a(String str, Request request) {
        this.f19661a.put(str, new WeakReference<>(request));
        C13479a.m54764b("ProgressiveImageLoader", String.format("run request, key = %s", str));
        request.mo28452a();
    }
}
