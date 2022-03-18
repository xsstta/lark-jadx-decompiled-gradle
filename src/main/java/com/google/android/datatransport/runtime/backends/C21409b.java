package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.BackendResponse;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.datatransport.runtime.backends.b */
public final class C21409b extends BackendResponse {

    /* renamed from: a */
    private final BackendResponse.Status f52005a;

    /* renamed from: b */
    private final long f52006b;

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    /* renamed from: a */
    public BackendResponse.Status mo72635a() {
        return this.f52005a;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendResponse
    /* renamed from: b */
    public long mo72636b() {
        return this.f52006b;
    }

    public int hashCode() {
        long j = this.f52006b;
        return ((this.f52005a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f52005a + ", nextRequestWaitMillis=" + this.f52006b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BackendResponse)) {
            return false;
        }
        BackendResponse backendResponse = (BackendResponse) obj;
        if (!this.f52005a.equals(backendResponse.mo72635a()) || this.f52006b != backendResponse.mo72636b()) {
            return false;
        }
        return true;
    }

    C21409b(BackendResponse.Status status, long j) {
        Objects.requireNonNull(status, "Null status");
        this.f52005a = status;
        this.f52006b = j;
    }
}
