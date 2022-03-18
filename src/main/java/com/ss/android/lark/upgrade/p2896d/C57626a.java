package com.ss.android.lark.upgrade.p2896d;

import android.text.TextUtils;
import com.ss.android.lark.upgrade.C57607a;
import com.ss.android.lark.upgrade.p2893a.AbstractC57608a;
import com.ss.android.lark.upgrade.p2895c.AbstractC57623a;
import com.ss.android.lark.upgrade.p2895c.AbstractC57624b;
import com.ss.android.lark.upgrade.p2895c.AbstractC57625c;
import com.ss.android.lark.utils.C57881t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.upgrade.d.a */
public class C57626a {

    /* renamed from: a */
    private List<AbstractC57625c> f141984a;

    /* renamed from: b */
    private String f141985b;

    /* renamed from: c */
    private long f141986c;

    /* renamed from: d */
    private long f141987d;

    /* renamed from: e */
    private AbstractC57624b f141988e;

    /* renamed from: f */
    private AbstractC57623a f141989f;

    /* renamed from: g */
    private AbstractC57608a f141990g;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.upgrade.d.a$a */
    public static class C57629a {

        /* renamed from: a */
        public static final C57626a f141993a = new C57626a();
    }

    /* renamed from: a */
    public static C57626a m223732a() {
        return C57629a.f141993a;
    }

    /* renamed from: b */
    private void m223734b() {
        this.f141990g.mo177715i().mo177728a(this.f141988e);
        this.f141990g.mo177715i().mo177727a(this.f141989f);
    }

    private C57626a() {
        this.f141984a = new ArrayList();
        this.f141990g = C57607a.m223662a();
        this.f141988e = new AbstractC57624b() {
            /* class com.ss.android.lark.upgrade.p2896d.C57626a.C576271 */

            @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57624b
            /* renamed from: a */
            public void mo195614a(String str, boolean z) {
                C57626a.this.mo195621a(str, z);
            }
        };
        this.f141989f = new AbstractC57623a() {
            /* class com.ss.android.lark.upgrade.p2896d.C57626a.C576282 */

            @Override // com.ss.android.lark.upgrade.p2895c.AbstractC57623a
            /* renamed from: a */
            public void mo195613a(String str, int i, long j, long j2) {
                C57626a.this.mo195619a(str, i, j, j2);
            }
        };
        m223734b();
    }

    /* renamed from: a */
    public void mo195618a(AbstractC57625c cVar) {
        if (cVar != null && !this.f141984a.contains(cVar)) {
            this.f141984a.add(cVar);
        }
    }

    /* renamed from: a */
    public static String m223733a(String str) {
        String c = C57881t.m224628c(C57607a.m223662a().mo177704a());
        String format = String.format("lark_android_%s.apk", str);
        return c + format;
    }

    /* renamed from: c */
    private String m223735c(String str, String str2) {
        return str + str2.hashCode();
    }

    /* renamed from: b */
    public void mo195622b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            C57607a.m223662a().mo177707b(m223735c(str, str2));
        }
    }

    /* renamed from: a */
    public void mo195620a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            AbstractC57608a a = C57607a.m223662a();
            String c = m223735c(str, str2);
            this.f141985b = c;
            a.mo177705a(c, m223733a(str), str2);
        }
    }

    /* renamed from: a */
    public void mo195621a(String str, boolean z) {
        String str2 = this.f141985b;
        if (str2 != null && TextUtils.equals(str2, str)) {
            for (AbstractC57625c cVar : this.f141984a) {
                long j = this.f141987d - this.f141986c;
                if (z) {
                    cVar.mo195616a(j);
                } else {
                    cVar.mo195617b(j);
                }
            }
            this.f141986c = 0;
            this.f141987d = 0;
            this.f141985b = null;
        }
    }

    /* renamed from: a */
    public void mo195619a(String str, int i, long j, long j2) {
        this.f141987d = j2;
        if (this.f141986c == 0) {
            this.f141986c = j2;
        }
        String str2 = this.f141985b;
        if (str2 != null && TextUtils.equals(str2, str)) {
            for (AbstractC57625c cVar : this.f141984a) {
                cVar.mo195615a(i, j2, j);
            }
        }
    }
}
