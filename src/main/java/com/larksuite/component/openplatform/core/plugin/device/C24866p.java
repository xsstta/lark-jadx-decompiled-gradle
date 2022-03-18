package com.larksuite.component.openplatform.core.plugin.device;

import android.app.Application;
import android.database.ContentObserver;
import android.os.Build;
import android.provider.MediaStore;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.AppbrandContext;

/* renamed from: com.larksuite.component.openplatform.core.plugin.device.p */
public class C24866p {

    /* renamed from: a */
    static final String[] f61021a = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "截屏"};

    /* renamed from: b */
    static final String[] f61022b = {"_data", "datetaken"};

    /* renamed from: c */
    private volatile boolean f61023c;

    /* renamed from: d */
    private AbstractC24867a f61024d;

    /* renamed from: e */
    private ContentObserver f61025e;

    /* renamed from: f */
    private ContentObserver f61026f;

    /* renamed from: g */
    private Application f61027g = AppbrandContext.getInst().getApplicationContext();

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.openplatform.core.plugin.device.p$a */
    public interface AbstractC24867a {
        /* renamed from: a */
        void mo87871a(String str, long j);
    }

    /* renamed from: b */
    public void mo87917b() {
        if (!this.f61023c) {
            AppBrandLogger.m52828d("TakeScreenshotManager", "observers is unregister");
            return;
        }
        if (this.f61025e != null) {
            this.f61027g.getContentResolver().unregisterContentObserver(this.f61025e);
        }
        if (this.f61026f != null) {
            this.f61027g.getContentResolver().unregisterContentObserver(this.f61026f);
        }
        this.f61025e = null;
        this.f61026f = null;
        this.f61023c = false;
    }

    /* renamed from: a */
    public void mo87916a() {
        boolean z = false;
        if (this.f61023c) {
            AppBrandLogger.m52828d("TakeScreenshotManager", "observers is register");
            return;
        }
        if (this.f61025e == null) {
            this.f61025e = new C24839k(MediaStore.Images.Media.INTERNAL_CONTENT_URI, this.f61024d);
        }
        if (this.f61026f == null) {
            this.f61026f = new C24839k(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f61024d);
        }
        if (Build.VERSION.SDK_INT > 28) {
            z = true;
        }
        this.f61027g.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, z, this.f61025e);
        this.f61027g.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, z, this.f61026f);
        this.f61023c = true;
    }

    public C24866p(AbstractC24867a aVar) {
        this.f61024d = aVar;
    }
}
