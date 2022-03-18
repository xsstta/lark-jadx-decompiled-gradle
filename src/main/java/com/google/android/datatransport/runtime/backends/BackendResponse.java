package com.google.android.datatransport.runtime.backends;

public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    /* renamed from: a */
    public abstract Status mo72635a();

    /* renamed from: b */
    public abstract long mo72636b();

    /* renamed from: c */
    public static BackendResponse m77464c() {
        return new C21409b(Status.TRANSIENT_ERROR, -1);
    }

    /* renamed from: d */
    public static BackendResponse m77465d() {
        return new C21409b(Status.FATAL_ERROR, -1);
    }

    /* renamed from: a */
    public static BackendResponse m77463a(long j) {
        return new C21409b(Status.OK, j);
    }
}
