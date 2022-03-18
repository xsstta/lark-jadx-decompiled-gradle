package com.ss.android.lark.preload.p2518a;

import android.text.TextUtils;
import android.util.Log;
import com.ss.android.lark.preload.PreloadTarget;
import com.ss.android.lark.preload.moment.PreloadMoment;
import com.ss.android.lark.preload.p2519b.AbstractC52229a;
import com.tencent.mmkv.MMKV;

/* renamed from: com.ss.android.lark.preload.a.a */
public class C52221a {

    /* renamed from: a */
    private final String f129553a = "last_launch_index";

    /* renamed from: b */
    private final String f129554b = "app_launch_count";

    /* renamed from: c */
    private final String f129555c = "first_screen_";

    /* renamed from: d */
    private final String f129556d = "idle_";

    /* renamed from: e */
    private MMKV f129557e;

    /* renamed from: f */
    private float f129558f = 0.3f;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.preload.a.a$a */
    public static class C52223a {

        /* renamed from: a */
        public long f129559a;

        /* renamed from: b */
        public long f129560b;

        /* renamed from: c */
        public long f129561c;

        /* renamed from: d */
        public long f129562d;

        private C52223a() {
        }

        public String toString() {
            return this.f129559a + "#" + this.f129560b + "#" + this.f129561c + "#" + this.f129562d;
        }

        /* renamed from: a */
        public static C52223a m202588a(String str) {
            if (TextUtils.isEmpty(str)) {
                Log.w("PreloadEngine", "LaunchPreloadItem# format return default item!!!!!");
                return new C52223a();
            }
            String[] split = str.split("#");
            C52223a aVar = new C52223a();
            aVar.f129559a = Long.parseLong(split[0]);
            aVar.f129560b = Long.parseLong(split[1]);
            aVar.f129561c = Long.parseLong(split[2]);
            aVar.f129562d = Long.parseLong(split[3]);
            return aVar;
        }
    }

    /* renamed from: b */
    private int m202577b() {
        return m202579c().getInt("last_launch_index", -1);
    }

    /* renamed from: c */
    private MMKV m202579c() {
        if (this.f129557e == null) {
            this.f129557e = MMKV.mmkvWithID("launch_preload_config", 4);
        }
        return this.f129557e;
    }

    /* renamed from: a */
    public void mo178795a() {
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        int b = (m202577b() + 1) % 50;
        m202574a(b);
        C52223a a = m202573a(String.valueOf(b));
        C52223a aVar = new C52223a();
        aVar.f129559a = valueOf.longValue();
        m202576a(String.valueOf(b), aVar);
        int b2 = m202578b("app_launch_count");
        if (b2 < 50) {
            m202575a("app_launch_count", b2 + 1);
        }
        if (a != null) {
            if ((a.f129560b & ((long) (1 << PreloadTarget.MINI_APP.getValue()))) != 0) {
                String c = m202580c(PreloadTarget.MINI_APP);
                m202575a(c, m202578b(c) - 1);
            }
            if ((a.f129561c & ((long) (1 << PreloadTarget.MINI_APP.getValue()))) != 0) {
                String d = m202581d(PreloadTarget.MINI_APP);
                m202575a(d, m202578b(d) - 1);
            }
        }
    }

    /* renamed from: a */
    public void mo178796a(float f) {
        this.f129558f = f;
    }

    /* renamed from: a */
    private C52223a m202573a(String str) {
        return C52223a.m202588a(m202579c().getString(str, ""));
    }

    /* renamed from: a */
    private void m202574a(int i) {
        m202579c().putInt("last_launch_index", i);
    }

    /* renamed from: b */
    private int m202578b(String str) {
        return m202579c().getInt(str, 0);
    }

    /* renamed from: c */
    private String m202580c(PreloadTarget preloadTarget) {
        return "first_screen_" + preloadTarget.getValue();
    }

    /* renamed from: d */
    private String m202581d(PreloadTarget preloadTarget) {
        return "idle_" + preloadTarget.getValue();
    }

    /* renamed from: b */
    public void mo178800b(PreloadTarget preloadTarget) {
        C52223a a = m202573a(String.valueOf(m202577b()));
        if ((a.f129562d & ((long) (1 << preloadTarget.getValue()))) == 0) {
            a.f129562d |= (long) (1 << preloadTarget.getValue());
            m202576a(String.valueOf(m202577b()), a);
        }
    }

    /* renamed from: a */
    public boolean mo178798a(PreloadTarget preloadTarget) {
        if ((m202573a(String.valueOf(m202577b())).f129562d & ((long) (1 << preloadTarget.getValue()))) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m202575a(String str, int i) {
        m202579c().putInt(str, i);
    }

    /* renamed from: a */
    private void m202576a(String str, C52223a aVar) {
        m202579c().putString(str, aVar.toString());
    }

    /* renamed from: a */
    public void mo178797a(PreloadTarget preloadTarget, long j) {
        boolean z;
        C52223a a = m202573a(String.valueOf(m202577b()));
        if (a.f129559a + 60000 <= j || (a.f129560b & ((long) (1 << preloadTarget.getValue()))) != 0) {
            z = false;
        } else {
            a.f129560b |= (long) (1 << preloadTarget.getValue());
            z = true;
        }
        if ((a.f129561c & ((long) (1 << preloadTarget.getValue()))) == 0) {
            a.f129561c |= (long) (1 << preloadTarget.getValue());
            z = true;
        }
        if (z) {
            m202576a(String.valueOf(m202577b()), a);
            if ((a.f129560b & ((long) (1 << preloadTarget.getValue()))) != 0) {
                String c = m202580c(preloadTarget);
                m202575a(c, m202578b(c) + 1);
            }
            if ((a.f129561c & ((long) (1 << preloadTarget.getValue()))) != 0) {
                String d = m202581d(preloadTarget);
                m202575a(d, m202578b(d) + 1);
            }
        }
    }

    /* renamed from: a */
    public boolean mo178799a(AbstractC52229a aVar, PreloadMoment preloadMoment) {
        int i;
        if (mo178798a(aVar.mo144980b())) {
            Log.i("PreloadEngine", "checkNeedLoad: had been preloaded! target=" + aVar.mo144980b() + " moment=" + preloadMoment);
            return false;
        }
        int b = m202578b("app_launch_count");
        if (preloadMoment == PreloadMoment.FIRST_SCREEN_SHOWED) {
            i = m202578b(m202580c(aVar.mo144980b()));
        } else if (preloadMoment == PreloadMoment.IDLE) {
            i = m202578b(m202581d(aVar.mo144980b()));
        } else {
            i = Integer.MAX_VALUE;
        }
        Log.i("PreloadEngine", "checkNeedLoad:  launch count=" + b + " targetLaunchCount=" + i);
        if (((double) i) / ((double) b) > ((double) this.f129558f)) {
            return true;
        }
        return false;
    }
}
