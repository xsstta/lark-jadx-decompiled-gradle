package com.ss.android.lark.core.language;

import android.app.Application;
import android.content.Context;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.language.C41115a;
import com.ss.android.lark.language.p2095a.AbstractC41116a;
import com.ss.android.lark.mira.MiraModule;
import com.ss.android.lark.platform.aa.C51657a;
import com.ss.android.lark.utils.LarkContext;

/* renamed from: com.ss.android.lark.core.language.a */
public class C36235a {

    /* renamed from: a */
    private static volatile C41115a f93520a;

    /* renamed from: com.ss.android.lark.core.language.a$a */
    public static class C36238a {

        /* renamed from: a */
        public static final AbstractC41116a f93523a = C36235a.m142709a(LarkContext.getApplication());
    }

    /* renamed from: a */
    public static C41115a m142710a() {
        if (f93520a == null) {
            synchronized (C36235a.class) {
                if (f93520a == null) {
                    f93520a = new C41115a(C36238a.f93523a);
                }
            }
        }
        return f93520a;
    }

    /* renamed from: a */
    public static AbstractC41116a m142709a(final Context context) {
        return new AbstractC41116a() {
            /* class com.ss.android.lark.core.language.C36235a.C362361 */

            @Override // com.ss.android.lark.language.p2095a.AbstractC41116a
            /* renamed from: a */
            public Context mo133670a() {
                return context;
            }

            @Override // com.ss.android.lark.language.p2095a.AbstractC41116a
            /* renamed from: c */
            public AbstractC41116a.AbstractC41117a mo133674c() {
                return new AbstractC41116a.AbstractC41117a() {
                    /* class com.ss.android.lark.core.language.C36235a.C362361.C362371 */

                    @Override // com.ss.android.lark.language.p2095a.AbstractC41116a.AbstractC41117a
                    /* renamed from: a */
                    public boolean mo133675a() {
                        return C37239a.m146649c().mo136941a("japan_lang");
                    }

                    @Override // com.ss.android.lark.language.p2095a.AbstractC41116a.AbstractC41117a
                    /* renamed from: a */
                    public boolean mo133676a(String str) {
                        return C37239a.m146648b().mo136951a(str);
                    }
                };
            }

            @Override // com.ss.android.lark.language.p2095a.AbstractC41116a
            /* renamed from: b */
            public boolean mo133673b() {
                return C36083a.m141487b().isUsPackage();
            }

            @Override // com.ss.android.lark.language.p2095a.AbstractC41116a
            /* renamed from: a */
            public void mo133671a(Application application) {
                MiraModule.m205157a(application);
            }

            @Override // com.ss.android.lark.language.p2095a.AbstractC41116a
            /* renamed from: a */
            public void mo133672a(Context context) {
                C51657a.m200381a().mo194414d(context);
            }
        };
    }
}
