package com.bytedance.applog.p197a;

import com.bytedance.applog.C3368a;
import com.bytedance.applog.manager.C3436h;
import com.bytedance.applog.p199c.AbstractC3388a;
import com.bytedance.applog.p199c.C3389b;
import com.bytedance.applog.util.C3469r;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import org.json.JSONObject;

/* renamed from: com.bytedance.applog.a.j */
public class C3381j extends AbstractC3371c {

    /* renamed from: b */
    public int f10727b;

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: a */
    public boolean mo13590a() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: b */
    public long mo13591b() {
        return 60000;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: c */
    public long[] mo13592c() {
        return new long[CalendarSearchResultRv.f82652c];
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: e */
    public String mo13594e() {
        return "up";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.applog.p197a.AbstractC3371c
    /* renamed from: d */
    public boolean mo13593d() {
        try {
            C3436h d = this.f10672a.mo13610d();
            final JSONObject q = C3368a.m14054q();
            if (d.mo13873n() == 0 || q == null || this.f10727b == q.hashCode()) {
                return true;
            }
            C3389b.m14162a(this.f10672a, 1, new JSONObject(), new AbstractC3388a() {
                /* class com.bytedance.applog.p197a.C3381j.C33821 */

                @Override // com.bytedance.applog.p199c.AbstractC3388a
                /* renamed from: a */
                public void mo13627a() {
                    C3381j.this.f10727b = q.hashCode();
                }

                @Override // com.bytedance.applog.p199c.AbstractC3388a
                /* renamed from: a */
                public void mo13628a(int i) {
                    C3469r.m14670d("sync error: " + i, null);
                }
            }, null, true);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    C3381j(C3373e eVar) {
        super(eVar);
    }
}
