package com.larksuite.component.openplatform.plugins.device.usercapture;

import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.provider.MediaStore;
import com.larksuite.component.openplatform.plugins.device.usercapture.C25604a;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.component.openplatform.plugins.device.usercapture.b */
public class C25606b {

    /* renamed from: a */
    private volatile boolean f62300a;

    /* renamed from: b */
    private C25604a.AbstractC25605a f62301b;

    /* renamed from: c */
    private ContentObserver f62302c;

    /* renamed from: d */
    private ContentObserver f62303d;

    /* renamed from: e */
    private Application f62304e;

    /* renamed from: a */
    public void mo88824a() {
        if (!this.f62300a) {
            Log.m165389i("TakeScreenshotManager", "observers is unregister");
            return;
        }
        if (this.f62302c != null) {
            this.f62304e.getContentResolver().unregisterContentObserver(this.f62302c);
        }
        if (this.f62303d != null) {
            this.f62304e.getContentResolver().unregisterContentObserver(this.f62303d);
        }
        this.f62302c = null;
        this.f62303d = null;
        this.f62300a = false;
    }

    /* renamed from: a */
    public void mo88825a(Context context) {
        boolean z;
        if (this.f62300a) {
            Log.m165389i("TakeScreenshotManager", "observers is register");
            return;
        }
        if (this.f62302c == null) {
            this.f62302c = new C25604a(context, MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.f62301b);
        }
        if (this.f62303d == null) {
            this.f62303d = new C25604a(context, MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f62301b);
        }
        if (Build.VERSION.SDK_INT > 28) {
            z = true;
        } else {
            z = false;
        }
        this.f62304e.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, z, this.f62302c);
        this.f62304e.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, z, this.f62303d);
        this.f62300a = true;
    }

    public C25606b(C25604a.AbstractC25605a aVar, Application application) {
        this.f62301b = aVar;
        this.f62304e = application;
    }
}
