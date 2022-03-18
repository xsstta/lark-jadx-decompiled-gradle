package com.ss.android.lark.safetynet.inhouse;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a;
import com.ss.android.lark.safetynet.inhouse.p2580b.C53220a;

/* renamed from: com.ss.android.lark.safetynet.inhouse.a */
public class C53215a {

    /* renamed from: b */
    private static volatile AbstractC53217a f131554b;

    /* renamed from: a */
    public C53220a f131555a;

    /* renamed from: a */
    public static AbstractC53217a m205848a() {
        return f131554b;
    }

    /* renamed from: d */
    public boolean mo181670d() {
        return this.f131555a.mo181676c();
    }

    /* renamed from: e */
    private boolean m205849e() {
        return f131554b.mo178247b().mo178251a("feature_key_safetynet_inhouse");
    }

    /* renamed from: b */
    public void mo181668b() {
        C53220a a = C53220a.m205864a();
        this.f131555a = a;
        a.mo181675b();
    }

    /* renamed from: c */
    public void mo181669c() {
        if (m205849e()) {
            f131554b.mo178246a(new AbstractC53217a.AbstractC53219b() {
                /* class com.ss.android.lark.safetynet.inhouse.C53215a.C532161 */

                @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a.AbstractC53219b
                /* renamed from: a */
                public void mo181671a(String str) {
                    C53215a.this.f131555a.mo181673a(str);
                }

                @Override // com.ss.android.lark.safetynet.inhouse.p2579a.AbstractC53217a.AbstractC53219b
                /* renamed from: b */
                public void mo181672b(String str) {
                    Log.m165383e("SafetyNetInhouseModule", "get device id failed " + str);
                }
            });
        }
    }

    public C53215a(AbstractC53217a aVar) {
        f131554b = aVar;
    }
}
