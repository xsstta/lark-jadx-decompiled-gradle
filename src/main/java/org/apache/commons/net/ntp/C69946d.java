package org.apache.commons.net.ntp;

import java.util.List;

/* renamed from: org.apache.commons.net.ntp.d */
public class C69946d {

    /* renamed from: a */
    private final AbstractC69945c f174817a;

    /* renamed from: b */
    private List<String> f174818b;

    /* renamed from: c */
    private Long f174819c;

    /* renamed from: d */
    private Long f174820d;

    /* renamed from: e */
    private final long f174821e;

    /* renamed from: f */
    private boolean f174822f;

    /* renamed from: b */
    public AbstractC69945c mo245857b() {
        return this.f174817a;
    }

    public int hashCode() {
        return (((int) this.f174821e) * 31) + this.f174817a.hashCode();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo245856a() {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.net.ntp.C69946d.mo245856a():void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C69946d dVar = (C69946d) obj;
        if (this.f174821e != dVar.f174821e || !this.f174817a.equals(dVar.f174817a)) {
            return false;
        }
        return true;
    }

    public C69946d(AbstractC69945c cVar, long j, boolean z) {
        this(cVar, j, null, z);
    }

    public C69946d(AbstractC69945c cVar, long j, List<String> list, boolean z) {
        if (cVar != null) {
            this.f174821e = j;
            this.f174817a = cVar;
            this.f174818b = list;
            if (z) {
                mo245856a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("message cannot be null");
    }
}
