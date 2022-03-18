package com.ss.android.lark.browser.biz.basic.jsapi.device.p1417b;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.provider.MediaStore;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.b.b */
public class C29700b {

    /* renamed from: a */
    static final String[] f74395a = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* renamed from: b */
    static final String[] f74396b = {"_data", "datetaken"};

    /* renamed from: c */
    private volatile boolean f74397c;

    /* renamed from: d */
    private AbstractC29701a f74398d;

    /* renamed from: e */
    private ContentObserver f74399e;

    /* renamed from: f */
    private ContentObserver f74400f;

    /* renamed from: g */
    private Context f74401g;

    /* renamed from: com.ss.android.lark.browser.biz.basic.jsapi.device.b.b$a */
    public interface AbstractC29701a {
        /* renamed from: a */
        void mo106993a(String str, long j);
    }

    /* renamed from: b */
    public void mo107018b() {
        if (!this.f74397c) {
            Log.m165379d("TakeScreenshotManager", "observer has already unregister");
            return;
        }
        if (this.f74399e != null) {
            this.f74401g.getContentResolver().unregisterContentObserver(this.f74399e);
        }
        if (this.f74400f != null) {
            this.f74401g.getContentResolver().unregisterContentObserver(this.f74400f);
        }
        this.f74399e = null;
        this.f74400f = null;
        this.f74397c = false;
    }

    /* renamed from: a */
    public void mo107017a() {
        boolean z;
        if (this.f74397c) {
            Log.m165379d("TakeScreenshotManager", "observers is register");
            return;
        }
        if (this.f74399e == null) {
            this.f74399e = new C29699a(MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.f74398d, this.f74401g);
        }
        if (this.f74400f == null) {
            this.f74400f = new C29699a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f74398d, this.f74401g);
        }
        if (Build.VERSION.SDK_INT > 28) {
            z = true;
        } else {
            z = false;
        }
        this.f74401g.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, z, this.f74399e);
        this.f74401g.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, z, this.f74400f);
        this.f74397c = true;
    }

    public C29700b(AbstractC29701a aVar, Context context) {
        this.f74398d = aVar;
        this.f74401g = context.getApplicationContext();
    }
}
