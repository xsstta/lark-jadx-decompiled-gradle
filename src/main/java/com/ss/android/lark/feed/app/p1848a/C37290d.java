package com.ss.android.lark.feed.app.p1848a;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.ss.android.lark.appreciablelib.AppreciableKit;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.ErrorLevel;
import com.ss.android.lark.appreciablelib.ErrorParams;
import com.ss.android.lark.appreciablelib.ErrorType;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.feed.app.a.d */
public class C37290d {

    /* renamed from: a */
    private String f95781a;

    /* renamed from: b */
    private long f95782b;

    /* renamed from: c */
    private long f95783c;

    /* renamed from: com.ss.android.lark.feed.app.a.d$a */
    private static class C37291a {

        /* renamed from: a */
        public static C37290d f95784a = new C37290d();
    }

    /* renamed from: a */
    public static C37290d m146907a() {
        return C37291a.f95784a;
    }

    /* renamed from: f */
    private void m146908f() {
        this.f95781a = null;
        this.f95782b = 0;
        this.f95783c = 0;
    }

    /* renamed from: d */
    public void mo137120d() {
        this.f95782b = System.currentTimeMillis();
        Log.m165379d("FeedLoadMoreHitHelper", "spanStart:" + this.f95782b);
    }

    /* renamed from: e */
    public void mo137121e() {
        this.f95783c = System.currentTimeMillis();
        Log.m165379d("FeedLoadMoreHitHelper", "spanEnd:" + this.f95783c);
    }

    /* renamed from: b */
    public void mo137118b() {
        this.f95781a = AppreciableKit.m107394b().mo103510a(Biz.Messenger, Scene.Feed, Event.feed_load_more, "FeedListFragment", true, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        Log.m165379d("FeedLoadMoreHitHelper", "start:" + this.f95781a);
    }

    /* renamed from: c */
    public void mo137119c() {
        HashMap hashMap = new HashMap();
        long j = this.f95783c - this.f95782b;
        hashMap.put("sdk_get_feed_cards", Long.valueOf(j));
        if (this.f95781a == null) {
            Log.m165379d("FeedLoadMoreHitHelper", "endFake:-1:" + j);
            mo137118b();
            AppreciableKit.m107394b().mo103516a(this.f95781a, -1, hashMap, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null, (Map<String, ? extends Object>) null);
        } else {
            Log.m165379d("FeedLoadMoreHitHelper", "endReal:" + this.f95781a + ":" + j);
            AppreciableKit.m107394b().mo103523c(this.f95781a, hashMap, null, null, null);
        }
        m146908f();
    }

    /* renamed from: a */
    public void mo137117a(ErrorResult errorResult) {
        Log.m165379d("FeedLoadMoreHitHelper", "errorResult:" + errorResult);
        AppreciableKit.m107394b().mo103514a(new ErrorParams(Biz.Messenger, Scene.Feed, Event.feed_load_more, ErrorType.SDK, ErrorLevel.Fatal, 1, null, "FeedListFragment", errorResult.getDisplayMsg(), true, null, null, null));
        m146908f();
    }
}
