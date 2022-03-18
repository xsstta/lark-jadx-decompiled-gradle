package com.ss.android.openbusiness;

import android.content.Context;
import com.bytedance.ee.webapp.Source;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.LarkContext;
import com.ss.android.openbusiness.event.p3008a.C59597e;
import com.ss.android.openbusiness.p3006c.C59541d;
import com.ss.android.openbusiness.p3006c.C59545e;
import java.util.Locale;

/* renamed from: com.ss.android.openbusiness.b */
public class C59480b {

    /* renamed from: a */
    private static volatile AbstractC59446a f147677a;

    /* renamed from: a */
    public static AbstractC59446a m230865a() {
        if (f147677a != null) {
            return f147677a;
        }
        Log.m165389i("Opb_Dependency", "opb dependency null ");
        C59541d.m231037a(C59545e.f147832s).flush();
        return new AbstractC59446a() {
            /* class com.ss.android.openbusiness.C59480b.C594811 */

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public String mo144867a() {
                return "default";
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public String mo144868a(DomainSettings.Alias alias) {
                return "";
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144869a(Context context, String str) {
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144870a(Context context, String str, int i) {
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144871a(Context context, String str, Source source) {
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144872a(Context context, String str, String str2, boolean z) {
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144873a(Context context, String str, String str2, boolean z, String str3, String str4) {
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: a */
            public void mo144874a(OpbScene opbScene, C59597e eVar) {
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: b */
            public String mo144875b() {
                return "zh_CN";
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: b */
            public void mo144876b(Context context, String str, int i) {
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: f */
            public String mo144880f() {
                return "";
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: g */
            public String mo144881g() {
                return "";
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: d */
            public Context mo144878d() {
                return LarkContext.getApplication();
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: c */
            public Locale mo144877c() {
                return new Locale("zh", "CN");
            }

            @Override // com.ss.android.openbusiness.AbstractC59446a
            /* renamed from: e */
            public Locale mo144879e() {
                return new Locale("zh", "cn");
            }
        };
    }

    /* renamed from: a */
    public static void m230866a(AbstractC59446a aVar) {
        Log.m165389i("Opb_Dependency", "init opb dependency, " + aVar);
        if (f147677a == null) {
            f147677a = aVar;
        }
    }
}
