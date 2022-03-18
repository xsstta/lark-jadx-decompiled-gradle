package com.google.android.datatransport.cct.p970a;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.a.h */
public final class C21368h extends AbstractC21382r {

    /* renamed from: a */
    private final long f51960a;

    @Override // com.google.android.datatransport.cct.p970a.AbstractC21382r
    /* renamed from: a */
    public long mo72578a() {
        return this.f51960a;
    }

    public int hashCode() {
        long j = this.f51960a;
        return 1000003 ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f51960a + "}";
    }

    C21368h(long j) {
        this.f51960a = j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21382r) || this.f51960a != ((AbstractC21382r) obj).mo72578a()) {
            return false;
        }
        return true;
    }
}
