package com.ss.android.lark.platform.statistics.p2502b;

import android.app.Application;
import android.content.Context;
import android.os.Process;
import com.ss.android.lark.biz.im.api.AbstractC29620m;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.p1772j.C36149a;
import com.ss.android.lark.maincore.AbstractC44544a;
import com.ss.android.lark.platform.statistics.C51989f;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.sdk.AbstractC53235b;
import com.ss.android.lark.sdk.C53241h;
import com.ss.android.lark.sdk.C53254m;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.statistics.b.a */
public class C51959a {

    /* renamed from: a */
    private static final String f129015a = String.valueOf(Process.myPid());

    /* renamed from: b */
    private static Context f129016b;

    /* renamed from: c */
    private static AbstractC53235b f129017c;

    /* renamed from: a */
    public static void m201528a() {
        C51980i.m201618a();
    }

    /* renamed from: f */
    public static void m201537f() {
        m201546o();
    }

    /* renamed from: j */
    public static void m201541j() {
        m201546o();
    }

    /* renamed from: o */
    private static void m201546o() {
        C51995b.m201714a();
    }

    /* renamed from: b */
    public static void m201533b() {
        C51995b.m201724b("to_first_render", f129015a);
    }

    /* renamed from: c */
    public static void m201534c() {
        C51995b.m201726c("to_first_render", f129015a);
    }

    /* renamed from: d */
    public static void m201535d() {
        C51995b.m201724b("to_feed_render", f129015a);
    }

    /* renamed from: g */
    public static void m201538g() {
        C51995b.m201716a("application_on_create");
    }

    /* renamed from: i */
    public static void m201540i() {
        C51995b.m201716a("init_doc_sdk");
    }

    /* renamed from: m */
    private static void m201544m() {
        C51995b.m201716a("application_launch");
    }

    /* renamed from: n */
    private static void m201545n() {
        C51995b.m201714a();
        C51973e.m201585c();
    }

    /* renamed from: e */
    public static void m201536e() {
        m201532a(true);
        m201544m();
        C51995b.m201716a("attach_base_context");
    }

    /* renamed from: l */
    private static void m201543l() {
        C519601 r0 = new AbstractC53235b() {
            /* class com.ss.android.lark.platform.statistics.p2502b.C51959a.C519601 */

            @Override // com.ss.android.lark.sdk.AbstractC53235b
            /* renamed from: b */
            public void mo102658b() {
                C51995b.m201714a();
            }

            @Override // com.ss.android.lark.sdk.AbstractC53235b
            /* renamed from: a */
            public void mo102657a() {
                C51995b.m201718a("init_rust_sdk_api", null, 1);
            }
        };
        f129017c = r0;
        C53254m.m205921a(r0);
    }

    /* renamed from: h */
    public static void m201539h() {
        m201546o();
        m201545n();
        Context context = f129016b;
        if (context != null && C51963b.m201564a(context)) {
            NonMainProcessTraces.m201601a().mo178154a((Application) f129016b.getApplicationContext());
        }
    }

    /* renamed from: k */
    public static void m201542k() {
        C36149a.m142162a().mo157090a(new AbstractC44544a() {
            /* class com.ss.android.lark.platform.statistics.p2502b.C51959a.C519612 */

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102546a() {
                C51959a.m201534c();
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: b */
            public void mo102548b() {
                C51995b.m201719a(C36083a.m141486a().getIMDependency().mo132881a(FeedCard.FeedType.INBOX));
            }

            @Override // com.ss.android.lark.maincore.AbstractC44544a
            /* renamed from: a */
            public void mo102547a(String str) {
                C51959a.m201530a(str);
                C36149a.m142162a().mo157103b(this);
            }
        });
        C36149a.m142162a().mo157089a($$Lambda$a$x4YVwhERnFIv6j1DxlqzBlX0.INSTANCE);
        C36083a.m141486a().getIMDependency().mo132844a(new AbstractC29620m() {
            /* class com.ss.android.lark.platform.statistics.p2502b.C51959a.C519623 */

            @Override // com.ss.android.lark.biz.im.api.AbstractC29620m
            /* renamed from: a */
            public void mo106729a() {
                C51995b.m201721b();
            }
        });
    }

    /* renamed from: a */
    public static void m201530a(String str) {
        C51973e.m201589g();
        C51995b.m201726c("to_feed_render", f129015a);
        C51995b.m201723b(str);
    }

    /* renamed from: a */
    public static void m201532a(boolean z) {
        if (!z) {
            C51973e.m201584b();
        }
        C51995b.m201720a(z, C51973e.m201586d());
        if (z) {
            m201535d();
            m201533b();
        }
    }

    /* renamed from: a */
    public static void m201529a(Context context, boolean z) {
        f129016b = context;
        try {
            C51973e.m201583a();
            C51980i.m201619a(C51973e.m201593k(), C51973e.m201592j(), z);
            m201543l();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m201531a(String str, String str2, int i) {
        if (C51973e.m201587e()) {
            C53241h.m205898b("AppLauncherTraces", "endFirstPageContentShowV2: changed to background");
            return;
        }
        long currentTimeMillis = (System.currentTimeMillis() - C51973e.m201594l()) + C51973e.m201595m();
        C53241h.m205898b("AppLauncherTraces", "endFirstPageContentShowV2: pageName=" + str + ", launchCost=" + currentTimeMillis + ", pageCreateRecord=" + str2);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("latency", currentTimeMillis);
            jSONObject.put("pct2cet", C51973e.m201595m());
            jSONObject2.put("page_name", str);
            jSONObject2.put("page_create_count", i);
            jSONObject2.put("page_create_record", str2);
            jSONObject2.put("warm_launch", C51973e.m201586d());
        } catch (Exception e) {
            C53241h.m205895a("AppLauncherTraces", "endFirstPageContentShowV2", e);
        }
        C51989f.m201663a(jSONObject, jSONObject2);
    }
}
