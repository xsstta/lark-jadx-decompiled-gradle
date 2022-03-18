package com.ss.android.lark.chat.p1660e;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.util.Objects;

/* renamed from: com.ss.android.lark.chat.e.e */
public class C33974e implements AbstractC26248b<C33974e> {

    /* renamed from: a */
    private long f87712a;

    /* renamed from: b */
    private boolean f87713b;

    /* renamed from: c */
    private boolean f87714c;

    /* renamed from: d */
    private String f87715d;

    /* renamed from: e */
    private String f87716e;

    /* renamed from: a */
    public boolean isItemSame(C33974e eVar) {
        return this == eVar;
    }

    /* renamed from: a */
    public long mo124306a() {
        return this.f87712a;
    }

    /* renamed from: c */
    public boolean mo124312c() {
        return this.f87714c;
    }

    /* renamed from: d */
    public String mo124313d() {
        return this.f87715d;
    }

    /* renamed from: e */
    public String mo124314e() {
        return this.f87716e;
    }

    /* renamed from: b */
    public boolean mo124310b() {
        return this.f87713b;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.f87712a), Boolean.valueOf(this.f87714c), Boolean.valueOf(this.f87713b));
    }

    /* renamed from: b */
    public void mo124309b(String str) {
        this.f87716e = str;
    }

    /* renamed from: a */
    public void mo124307a(String str) {
        this.f87715d = str;
    }

    /* renamed from: b */
    public boolean isContentSame(C33974e eVar) {
        return equals(eVar);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C33974e)) {
            return false;
        }
        C33974e eVar = (C33974e) obj;
        if (this.f87712a == eVar.f87712a && this.f87714c == eVar.f87714c && this.f87713b == eVar.f87713b) {
            return true;
        }
        return false;
    }

    public C33974e(long j, boolean z, boolean z2) {
        this.f87712a = j;
        this.f87713b = z;
        this.f87714c = z2;
    }
}
