package com.google.android.datatransport.runtime.scheduling.p974a;

import com.google.android.datatransport.runtime.AbstractC21433h;
import com.google.android.datatransport.runtime.AbstractC21439l;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.scheduling.a.b */
public final class C21460b extends AbstractC21467h {

    /* renamed from: a */
    private final long f52097a;

    /* renamed from: b */
    private final AbstractC21439l f52098b;

    /* renamed from: c */
    private final AbstractC21433h f52099c;

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21467h
    /* renamed from: a */
    public long mo72720a() {
        return this.f52097a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21467h
    /* renamed from: b */
    public AbstractC21439l mo72721b() {
        return this.f52098b;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.p974a.AbstractC21467h
    /* renamed from: c */
    public AbstractC21433h mo72722c() {
        return this.f52099c;
    }

    public int hashCode() {
        long j = this.f52097a;
        return this.f52099c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f52098b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f52097a + ", transportContext=" + this.f52098b + ", event=" + this.f52099c + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21467h)) {
            return false;
        }
        AbstractC21467h hVar = (AbstractC21467h) obj;
        if (this.f52097a != hVar.mo72720a() || !this.f52098b.equals(hVar.mo72721b()) || !this.f52099c.equals(hVar.mo72722c())) {
            return false;
        }
        return true;
    }

    C21460b(long j, AbstractC21439l lVar, AbstractC21433h hVar) {
        this.f52097a = j;
        Objects.requireNonNull(lVar, "Null transportContext");
        this.f52098b = lVar;
        Objects.requireNonNull(hVar, "Null event");
        this.f52099c = hVar;
    }
}
