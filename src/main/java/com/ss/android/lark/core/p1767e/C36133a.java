package com.ss.android.lark.core.p1767e;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.corrupt.C36239a;
import com.ss.android.lark.corrupt.p1776a.AbstractC36240a;
import com.ss.android.lark.p1382b.C29410a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.core.e.a */
public class C36133a {

    /* renamed from: a */
    private static C36239a f93323a;

    /* renamed from: com.ss.android.lark.core.e.a$a */
    public static class C36135a {

        /* renamed from: a */
        public static final AbstractC36240a f93325a = C36133a.m142080a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C36239a m142081a() {
        if (f93323a == null) {
            synchronized (C36133a.class) {
                if (f93323a == null) {
                    f93323a = new C36239a(C36135a.f93325a);
                }
            }
        }
        return f93323a;
    }

    /* renamed from: a */
    public static AbstractC36240a m142080a(final Context context) {
        return new AbstractC36240a() {
            /* class com.ss.android.lark.core.p1767e.C36133a.C361341 */

            @Override // com.ss.android.lark.corrupt.p1776a.AbstractC36240a
            /* renamed from: a */
            public Context mo133152a() {
                return context;
            }

            @Override // com.ss.android.lark.corrupt.p1776a.AbstractC36240a
            /* renamed from: b */
            public Activity mo133153b() {
                return C29410a.m108289c().mo104289c();
            }
        };
    }
}
