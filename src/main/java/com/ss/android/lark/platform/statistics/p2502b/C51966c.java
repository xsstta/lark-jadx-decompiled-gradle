package com.ss.android.lark.platform.statistics.p2502b;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.lark.platform.statistics.b.c */
public class C51966c {

    /* renamed from: a */
    private C51968a f129027a;

    /* renamed from: b */
    private String f129028b;

    /* renamed from: c */
    private String f129029c;

    /* renamed from: d */
    private Map<String, Long> f129030d;

    /* renamed from: e */
    private Map<String, Object> f129031e;

    /* renamed from: f */
    private Map<String, Object> f129032f;

    /* renamed from: g */
    private long f129033g;

    /* renamed from: h */
    private long f129034h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.statistics.b.c$b */
    public static class C51969b {

        /* renamed from: a */
        static C51966c f129038a = new C51966c();
    }

    /* renamed from: a */
    public static C51966c m201571a() {
        return C51969b.f129038a;
    }

    private C51966c() {
        this.f129030d = new ConcurrentHashMap();
        this.f129031e = new ConcurrentHashMap();
        this.f129032f = new ConcurrentHashMap();
        this.f129033g = -1;
        this.f129034h = -1;
    }

    /* renamed from: d */
    private void m201572d() {
        AppreciableKit.m107394b().mo103523c(this.f129029c, this.f129030d, null, this.f129032f, this.f129031e);
    }

    /* renamed from: b */
    public void mo178147b() {
        if (!C51973e.m201591i()) {
            this.f129034h = System.currentTimeMillis() - C51973e.m201592j();
            if (this.f129033g != -1) {
                m201572d();
            }
        }
    }

    /* renamed from: c */
    public void mo178148c() {
        long currentTimeMillis = System.currentTimeMillis() - C51973e.m201592j();
        this.f129030d.put("feed_data_ready", Long.valueOf(currentTimeMillis));
        Log.m165389i("FeedAppreciableHitPoint", "onFeedDataReady:" + currentTimeMillis);
    }

    /* renamed from: a */
    public void mo178144a(ErrorResult errorResult) {
        AppreciableKit.m107394b().mo103514a(new ErrorParams(Biz.Messenger, Scene.Feed, Event.first_feed_meaningful_paint, ErrorType.SDK, ErrorLevel.Fatal, errorResult.getErrorCode(), null, "MainActivity", errorResult.getDisplayMsg(), true, null, null, this.f129031e));
    }

    /* renamed from: a */
    public void mo178143a(long j) {
        if (!C51973e.m201591i()) {
            this.f129033g = j;
            this.f129030d.put("main_excute", Long.valueOf(C51973e.m201595m()));
            this.f129030d.put("feed_first_paint", Long.valueOf(j));
            this.f129031e.put("source_type", 1);
            this.f129031e.put("is_cold_startup", Boolean.valueOf(true ^ C51973e.m201586d()));
            AppreciableKit.m107394b().mo103523c(this.f129028b, this.f129030d, null, this.f129032f, this.f129031e);
            if (this.f129034h != -1) {
                m201572d();
            }
        }
    }

    /* renamed from: a */
    public void mo178145a(C51985l lVar) {
        long j;
        if (TextUtils.equals(lVar.mo178184c(), "set_access_token")) {
            this.f129027a = new C51968a(lVar.mo178186e(), lVar.mo178187f());
            this.f129030d.put("sdk_set_access_token", Long.valueOf(lVar.mo178185d()));
            Log.m165389i("FeedAppreciableHitPoint", "saveTraceInfo# sdk_set_access_token:" + lVar.mo178185d());
        }
        if (TextUtils.equals(lVar.mo178184c(), "init_and_load_rust_sdk")) {
            this.f129030d.put("sdk_init", Long.valueOf(lVar.mo178185d()));
            Log.m165389i("FeedAppreciableHitPoint", "saveTraceInfo# sdk_init:" + lVar.mo178185d());
        }
        if (TextUtils.equals(lVar.mo178184c(), "load_feed")) {
            if (this.f129027a.f129036b > lVar.mo178186e()) {
                j = this.f129027a.f129036b;
            } else {
                j = lVar.mo178186e();
            }
            long f = lVar.mo178187f() - j;
            this.f129030d.put("sdk_get_feed_cards", Long.valueOf(f));
            Log.m165389i("FeedAppreciableHitPoint", "saveTraceInfo# sdk_get_feed_cards:" + f);
        }
    }

    /* renamed from: a */
    public void mo178146a(boolean z, boolean z2) {
        if (z || z2) {
            this.f129028b = AppreciableKit.m107394b().mo103510a(Biz.Messenger, Scene.Feed, Event.feed_first_paint, "MainActivity", false, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
            this.f129029c = AppreciableKit.m107394b().mo103510a(Biz.Messenger, Scene.Feed, Event.first_feed_meaningful_paint, "MainActivity", true, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.platform.statistics.b.c$a */
    public class C51968a {

        /* renamed from: a */
        long f129035a;

        /* renamed from: b */
        long f129036b;

        public C51968a(long j, long j2) {
            this.f129035a = j;
            this.f129036b = j2;
        }
    }
}
