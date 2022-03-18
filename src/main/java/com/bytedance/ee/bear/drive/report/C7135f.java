package com.bytedance.ee.bear.drive.report;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.drive.core.model.AbstractC6946a;
import java.io.File;

/* renamed from: com.bytedance.ee.bear.drive.report.f */
public class C7135f {

    /* renamed from: a */
    private String f19219a;

    /* renamed from: b */
    private String f19220b;

    /* renamed from: c */
    private String f19221c;

    /* renamed from: d */
    private Bundle f19222d;

    /* renamed from: e */
    private int f19223e;

    /* renamed from: f */
    private AbstractC6946a f19224f;

    /* renamed from: g */
    private boolean f19225g;

    C7135f() {
    }

    /* renamed from: l */
    public Bundle mo28014l() {
        return this.f19222d;
    }

    /* renamed from: m */
    public int mo28015m() {
        return this.f19223e;
    }

    /* renamed from: n */
    public boolean mo28016n() {
        return this.f19225g;
    }

    /* renamed from: a */
    public String mo27996a() {
        if (!TextUtils.isEmpty(this.f19220b)) {
            return this.f19220b;
        }
        return "";
    }

    /* renamed from: b */
    public String mo28002b() {
        if (!TextUtils.isEmpty(this.f19221c)) {
            return this.f19221c;
        }
        return "";
    }

    /* renamed from: c */
    public String mo28005c() {
        AbstractC6946a aVar = this.f19224f;
        if (aVar != null) {
            return aVar.mo27322a().mo27364g();
        }
        return "";
    }

    /* renamed from: d */
    public long mo28006d() {
        AbstractC6946a aVar = this.f19224f;
        if (aVar != null) {
            return aVar.mo27322a().f18787c;
        }
        return 0;
    }

    /* renamed from: e */
    public int mo28007e() {
        AbstractC6946a aVar = this.f19224f;
        if (aVar != null) {
            return aVar.mo27329c();
        }
        return -1;
    }

    /* renamed from: h */
    public int mo28010h() {
        AbstractC6946a aVar = this.f19224f;
        if (aVar != null) {
            return aVar.mo27344k() ? 1 : 0;
        }
        return -1;
    }

    /* renamed from: i */
    public String mo28011i() {
        AbstractC6946a aVar = this.f19224f;
        if (aVar == null) {
            return "";
        }
        return aVar.mo27352s();
    }

    /* renamed from: j */
    public String mo28012j() {
        AbstractC6946a aVar = this.f19224f;
        if (aVar == null) {
            return "";
        }
        return aVar.mo27353t();
    }

    /* renamed from: k */
    public boolean mo28013k() {
        AbstractC6946a aVar = this.f19224f;
        if (aVar == null) {
            return false;
        }
        return aVar.mo27355u();
    }

    /* renamed from: f */
    public String mo28008f() {
        String str;
        AbstractC6946a aVar = this.f19224f;
        if (aVar != null) {
            str = aVar.mo27333d();
        } else {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            return str.toLowerCase();
        }
        return "";
    }

    /* renamed from: g */
    public long mo28009g() {
        String str;
        AbstractC6946a aVar = this.f19224f;
        if (aVar != null) {
            str = aVar.mo27343j();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        File file = new File(str);
        if (file.exists()) {
            return file.length();
        }
        return 0;
    }

    /* renamed from: a */
    public void mo27997a(int i) {
        this.f19223e = i;
    }

    /* renamed from: b */
    public void mo28003b(String str) {
        this.f19220b = str;
    }

    /* renamed from: c */
    public C7135f mo28004c(String str) {
        this.f19221c = str;
        return this;
    }

    /* renamed from: a */
    public void mo27998a(Bundle bundle) {
        this.f19222d = bundle;
    }

    /* renamed from: a */
    public void mo27999a(AbstractC6946a aVar) {
        if (aVar != null) {
            this.f19224f = aVar;
        }
    }

    /* renamed from: a */
    public void mo28000a(String str) {
        this.f19219a = str;
    }

    /* renamed from: a */
    public void mo28001a(boolean z) {
        this.f19225g = z;
    }

    /* renamed from: a */
    static String m28702a(String str, int i) {
        return str + "_" + i;
    }
}
