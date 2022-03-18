package com.ss.android.lark.apihandler.basic.jsapi.device.p1353b;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Build;
import android.provider.MediaStore;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.b.b */
public class C28767b {

    /* renamed from: a */
    static final String[] f72327a = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* renamed from: b */
    static final String[] f72328b = {"_data", "datetaken"};

    /* renamed from: c */
    private volatile boolean f72329c;

    /* renamed from: d */
    private AbstractC28768a f72330d;

    /* renamed from: e */
    private ContentObserver f72331e;

    /* renamed from: f */
    private ContentObserver f72332f;

    /* renamed from: g */
    private Context f72333g;

    /* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.b.b$a */
    public interface AbstractC28768a {
        /* renamed from: a */
        void mo102240a(String str, long j);
    }

    /* renamed from: b */
    public void mo102265b() {
        if (!this.f72329c) {
            Log.m165379d("TakeScreenshotManager", "observer has already unregister");
            return;
        }
        if (this.f72331e != null) {
            this.f72333g.getContentResolver().unregisterContentObserver(this.f72331e);
        }
        if (this.f72332f != null) {
            this.f72333g.getContentResolver().unregisterContentObserver(this.f72332f);
        }
        this.f72331e = null;
        this.f72332f = null;
        this.f72329c = false;
    }

    /* renamed from: a */
    public void mo102264a() {
        boolean z;
        if (this.f72329c) {
            Log.m165379d("TakeScreenshotManager", "observers is register");
            return;
        }
        if (this.f72331e == null) {
            this.f72331e = new C28766a(MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.f72330d, this.f72333g);
        }
        if (this.f72332f == null) {
            this.f72332f = new C28766a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f72330d, this.f72333g);
        }
        if (Build.VERSION.SDK_INT > 28) {
            z = true;
        } else {
            z = false;
        }
        this.f72333g.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, z, this.f72331e);
        this.f72333g.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, z, this.f72332f);
        this.f72329c = true;
    }

    public C28767b(AbstractC28768a aVar, Context context) {
        this.f72330d = aVar;
        this.f72333g = context.getApplicationContext();
    }
}
