package com.google.android.datatransport.cct.p970a;

import java.util.List;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.cct.a.d */
public final class C21358d extends AbstractC21372j {

    /* renamed from: a */
    private final List<AbstractC21379p> f51927a;

    @Override // com.google.android.datatransport.cct.p970a.AbstractC21372j
    /* renamed from: a */
    public List<AbstractC21379p> mo72531a() {
        return this.f51927a;
    }

    public int hashCode() {
        return this.f51927a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f51927a + "}";
    }

    C21358d(List<AbstractC21379p> list) {
        Objects.requireNonNull(list, "Null logRequests");
        this.f51927a = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC21372j) {
            return this.f51927a.equals(((AbstractC21372j) obj).mo72531a());
        }
        return false;
    }
}
