package com.ss.android.ad.splash.core;

import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.u */
public class C27369u {

    /* renamed from: a */
    private int f68322a;

    /* renamed from: b */
    private boolean f68323b;

    /* renamed from: c */
    private boolean f68324c;

    /* renamed from: d */
    private boolean f68325d;

    /* renamed from: e */
    private boolean f68326e;

    /* renamed from: f */
    private boolean f68327f;

    /* renamed from: g */
    private boolean f68328g;

    /* renamed from: h */
    private boolean f68329h;

    /* renamed from: i */
    private boolean f68330i;

    /* renamed from: j */
    private boolean f68331j;

    /* renamed from: k */
    private boolean f68332k;

    /* renamed from: l */
    private boolean f68333l;

    /* renamed from: m */
    private boolean f68334m;

    /* renamed from: n */
    private boolean f68335n;

    /* renamed from: o */
    private long f68336o = 400;

    /* renamed from: p */
    private boolean f68337p;

    /* renamed from: a */
    public boolean mo97696a() {
        return this.f68323b;
    }

    /* renamed from: b */
    public boolean mo97697b() {
        return this.f68324c;
    }

    /* renamed from: c */
    public boolean mo97698c() {
        return this.f68328g;
    }

    /* renamed from: d */
    public boolean mo97699d() {
        return this.f68327f;
    }

    /* renamed from: e */
    public boolean mo97700e() {
        return this.f68326e;
    }

    /* renamed from: f */
    public boolean mo97701f() {
        return this.f68330i;
    }

    /* renamed from: g */
    public boolean mo97702g() {
        return this.f68325d;
    }

    /* renamed from: h */
    public boolean mo97703h() {
        return this.f68329h;
    }

    /* renamed from: i */
    public boolean mo97704i() {
        return this.f68331j;
    }

    /* renamed from: j */
    public boolean mo97705j() {
        return this.f68332k;
    }

    /* renamed from: k */
    public boolean mo97706k() {
        return this.f68333l;
    }

    /* renamed from: l */
    public boolean mo97707l() {
        return this.f68334m;
    }

    /* renamed from: m */
    public boolean mo97708m() {
        return this.f68335n;
    }

    /* renamed from: n */
    public long mo97709n() {
        return this.f68336o;
    }

    /* renamed from: o */
    public boolean mo97710o() {
        return this.f68337p;
    }

    /* renamed from: a */
    public static C27369u m99790a(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        C27369u uVar = new C27369u();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i = 2;
        int optInt = jSONObject.optInt("max_crash_time", 2);
        if (optInt > 0) {
            i = optInt;
        }
        uVar.f68322a = i;
        boolean z14 = true;
        if (jSONObject.optInt("enable_refactor_track_method", 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        uVar.f68323b = z;
        if (jSONObject.optInt("enable_safe_cache_path") == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        uVar.f68324c = z2;
        if (jSONObject.optInt("enable_add_show_count_for_empty_array", 0) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        uVar.f68325d = z3;
        if (jSONObject.optInt("enable_old_view_align", 1) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        uVar.f68328g = z4;
        if (jSONObject.optInt("enable_new_clean_strategy", 1) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        uVar.f68326e = z5;
        if (jSONObject.optInt("enable_send_event_async", 1) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        uVar.f68327f = z6;
        if (jSONObject.optInt("enable_remove_empty_list_return", 1) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        uVar.f68329h = z7;
        if (jSONObject.optInt("enable_remove_default_language", 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        uVar.f68330i = z8;
        if (jSONObject.optInt("enable_cold_launch_interval", 0) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        uVar.f68331j = z9;
        if (jSONObject.optInt("enable_post_stop_video", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        uVar.f68332k = z10;
        if (jSONObject.optInt("enable_video_engine_release_async", 0) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        uVar.f68334m = z11;
        if (jSONObject.optInt("enable_pause_video_on_background", 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        uVar.f68333l = z12;
        if (jSONObject.optInt("enable_reset_timer_on_render_start", 1) == 1) {
            z13 = true;
        } else {
            z13 = false;
        }
        uVar.f68335n = z13;
        long j = 400;
        long optLong = jSONObject.optLong("reset_count_down_timer_delay", 400);
        if (optLong >= 0) {
            j = optLong;
        }
        uVar.f68336o = j;
        if (jSONObject.optInt("enable_async_video_controller") != 1) {
            z14 = false;
        }
        uVar.f68337p = z14;
        return uVar;
    }
}
