package com.ss.android.lark.platform.statistics.p2502b;

import android.text.TextUtils;
import com.bytedance.apm.trace.C3088b;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.main.app.MainActivity;
import com.ss.android.lark.platform.network.C51869i;
import com.ss.android.lark.platform.statistics.perf.C51995b;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.platform.statistics.b.i */
public class C51980i {

    /* renamed from: a */
    private static C51995b.AbstractC51996a f129069a;

    /* renamed from: a */
    public static void m201618a() {
        C51995b.m201722b(f129069a);
    }

    /* renamed from: a */
    public static void m201619a(long j, long j2, boolean z) {
        C3088b.m12865a();
        C51984k.m201635a(z);
        C51963b.m201556a(j, j2);
        C519811 r0 = new C51995b.AbstractC51996a() {
            /* class com.ss.android.lark.platform.statistics.p2502b.C51980i.C519811 */

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: b */
            public void mo178172b() {
                C51974f.m201596b().mo106729a();
                C51966c.m201571a().mo178147b();
            }

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: a */
            public void mo178166a() {
                String a = C51963b.m201555a();
                if (!TextUtils.isEmpty(a)) {
                    C3088b.m12872b("lark", a);
                    C51979h.m201611b(a);
                }
                C51984k.m201637b();
            }

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: a */
            public void mo178170a(boolean z) {
                C51963b.m201562a(z);
                C51966c.m201571a().mo178148c();
            }

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: a */
            public void mo178167a(String str) {
                long a = C51963b.m201554a(str);
                C51966c.m201571a().mo178143a(a);
                if (C51973e.m201586d() || C51973e.m201591i()) {
                    C3088b.m12871b();
                    C51979h.m201611b("app_launch_to_content_show");
                    return;
                }
                C3088b.m12867a(2, MainActivity.class.getName(), 100000);
                C51974f.m201596b().mo178151a(a);
                C51979h.m201611b("app_launch_to_content_show");
            }

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: a */
            public void mo178168a(String str, String str2) {
                if (str2 == null) {
                    str2 = "";
                }
                C51963b.m201560a(str, str2);
                C51984k.m201638b(8, str, str2.hashCode());
                C51979h.m201611b(str);
            }

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: a */
            public void mo178171a(boolean z, boolean z2) {
                if (z) {
                    C51869i.m201155b();
                    C51869i.m201154a("startup");
                    if (C26252ad.m94993b(LarkContext.getApplication())) {
                        C51979h.m201608a("app_launch_to_content_show");
                    }
                }
                C51963b.m201563a(z, z2);
                C51966c.m201571a().mo178146a(z, z2);
            }

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: b */
            public void mo178173b(String str, String str2, int i) {
                C51984k.m201633a(8, str, str2.hashCode());
                C51963b.m201567b(str, str2, i);
                C51979h.m201609a("app_launch_to_content_show", str);
            }

            @Override // com.ss.android.lark.platform.statistics.perf.C51995b.AbstractC51996a
            /* renamed from: a */
            public void mo178169a(String str, String str2, int i) {
                C51984k.m201634a(str);
                if ((i & 2) != 0) {
                    C3088b.m12870a("lark", str);
                    C51979h.m201609a("app_launch_to_content_show", str);
                }
                C51963b.m201561a(str, str2, i);
            }
        };
        f129069a = r0;
        C51995b.m201715a(r0);
    }
}
