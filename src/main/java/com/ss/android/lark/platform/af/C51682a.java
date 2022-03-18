package com.ss.android.lark.platform.af;

import android.app.Activity;
import com.ss.android.lark.biz.core.api.AbstractC29571p;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.p1382b.C29410a;

/* renamed from: com.ss.android.lark.platform.af.a */
public class C51682a {
    /* renamed from: a */
    public static void m200447a() {
        Activity c;
        if (m200448b() && (c = C29410a.m108289c().mo104289c()) != null) {
            C51684b.m200451a().mo195869a(c, new AbstractC29571p() {
                /* class com.ss.android.lark.platform.af.C51682a.C516831 */

                @Override // com.ss.android.lark.biz.core.api.AbstractC29571p
                /* renamed from: a */
                public void mo105814a(boolean z) {
                }
            });
        }
    }

    /* renamed from: b */
    public static boolean m200448b() {
        boolean a = C37239a.m146648b().mo136951a("suite_software_user_agreement");
        boolean a2 = C37239a.m146648b().mo136951a("suite_software_privacy_agreement");
        if (!a || !a2) {
            return false;
        }
        return true;
    }
}
