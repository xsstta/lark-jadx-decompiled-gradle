package com.android.volley;

public class VolleyError extends Exception {
    public final C1933h networkResponse;
    private long networkTimeMs;

    public VolleyError() {
    }

    public long getNetworkTimeMs() {
        return this.networkTimeMs;
    }

    /* access modifiers changed from: package-private */
    public void setNetworkTimeMs(long j) {
        this.networkTimeMs = j;
    }

    public VolleyError(C1933h hVar) {
        this.networkResponse = hVar;
    }

    public VolleyError(String str) {
        super(str);
    }

    public VolleyError(Throwable th) {
        super(th);
    }

    public VolleyError(String str, Throwable th) {
        super(str, th);
    }
}
