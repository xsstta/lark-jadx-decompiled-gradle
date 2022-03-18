package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.time.AbstractC21523a;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.backends.c */
public final class C21410c extends AbstractC21416h {

    /* renamed from: a */
    private final Context f52007a;

    /* renamed from: b */
    private final AbstractC21523a f52008b;

    /* renamed from: c */
    private final AbstractC21523a f52009c;

    /* renamed from: d */
    private final String f52010d;

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21416h
    /* renamed from: a */
    public Context mo72649a() {
        return this.f52007a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21416h
    /* renamed from: b */
    public AbstractC21523a mo72650b() {
        return this.f52008b;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21416h
    /* renamed from: c */
    public AbstractC21523a mo72651c() {
        return this.f52009c;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC21416h
    /* renamed from: d */
    public String mo72652d() {
        return this.f52010d;
    }

    public int hashCode() {
        return ((((((this.f52007a.hashCode() ^ 1000003) * 1000003) ^ this.f52008b.hashCode()) * 1000003) ^ this.f52009c.hashCode()) * 1000003) ^ this.f52010d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f52007a + ", wallClock=" + this.f52008b + ", monotonicClock=" + this.f52009c + ", backendName=" + this.f52010d + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC21416h)) {
            return false;
        }
        AbstractC21416h hVar = (AbstractC21416h) obj;
        if (!this.f52007a.equals(hVar.mo72649a()) || !this.f52008b.equals(hVar.mo72650b()) || !this.f52009c.equals(hVar.mo72651c()) || !this.f52010d.equals(hVar.mo72652d())) {
            return false;
        }
        return true;
    }

    C21410c(Context context, AbstractC21523a aVar, AbstractC21523a aVar2, String str) {
        Objects.requireNonNull(context, "Null applicationContext");
        this.f52007a = context;
        Objects.requireNonNull(aVar, "Null wallClock");
        this.f52008b = aVar;
        Objects.requireNonNull(aVar2, "Null monotonicClock");
        this.f52009c = aVar2;
        Objects.requireNonNull(str, "Null backendName");
        this.f52010d = str;
    }
}
