package com.ss.android.lark.calendar.impl.features.common.p1498d;

import android.content.Context;
import android.database.ContentObserver;
import android.provider.MediaStore;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.calendar.impl.features.common.d.b */
public class C31129b {

    /* renamed from: a */
    static final String[] f78623a = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* renamed from: b */
    static final String[] f78624b = {"_data", "datetaken"};

    /* renamed from: c */
    private volatile boolean f78625c;

    /* renamed from: d */
    private AbstractC31130a f78626d;

    /* renamed from: e */
    private ContentObserver f78627e;

    /* renamed from: f */
    private ContentObserver f78628f;

    /* renamed from: g */
    private Context f78629g;

    /* renamed from: com.ss.android.lark.calendar.impl.features.common.d.b$a */
    public interface AbstractC31130a {
        /* renamed from: a */
        void mo112737a(String str, long j);
    }

    /* renamed from: b */
    public void mo112736b() {
        if (!this.f78625c) {
            Log.m165379d("TakeScreenshotManager", "observer has already unregister");
            return;
        }
        if (this.f78627e != null) {
            this.f78629g.getContentResolver().unregisterContentObserver(this.f78627e);
        }
        if (this.f78628f != null) {
            this.f78629g.getContentResolver().unregisterContentObserver(this.f78628f);
        }
        this.f78627e = null;
        this.f78628f = null;
        this.f78625c = false;
    }

    /* renamed from: a */
    public void mo112735a() {
        if (this.f78625c) {
            Log.m165379d("TakeScreenshotManager", "observers is register");
            return;
        }
        if (this.f78627e == null) {
            this.f78627e = new C31128a(MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.f78626d, this.f78629g);
        }
        if (this.f78628f == null) {
            this.f78628f = new C31128a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f78626d, this.f78629g);
        }
        this.f78629g.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.f78627e);
        this.f78629g.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f78628f);
        this.f78625c = true;
    }

    public C31129b(AbstractC31130a aVar, Context context) {
        this.f78626d = aVar;
        this.f78629g = context.getApplicationContext();
    }
}
