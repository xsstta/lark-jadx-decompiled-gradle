package com.ss.android.lark.ug.p2874e;

import android.content.Context;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.guidemgr.C38700a;
import com.ss.android.lark.guidemgr.p1934a.AbstractC38701a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.ug.e.a */
public class C57480a {

    /* renamed from: com.ss.android.lark.ug.e.a$a */
    public static class C57482a {

        /* renamed from: a */
        public static final AbstractC38701a f141652a = C57480a.m223133b();
    }

    /* renamed from: a */
    public static C38700a m223132a() {
        return new C38700a(C57482a.f141652a);
    }

    /* renamed from: b */
    public static AbstractC38701a m223133b() {
        return new AbstractC38701a() {
            /* class com.ss.android.lark.ug.p2874e.C57480a.C574811 */

            @Override // com.ss.android.lark.guidemgr.p1934a.AbstractC38701a
            /* renamed from: a */
            public Context mo141834a() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.lark.guidemgr.p1934a.AbstractC38701a
            /* renamed from: a */
            public boolean mo141835a(String str) {
                return C37239a.m146648b().mo136952a(str, C38700a.m152833a(str));
            }
        };
    }
}
