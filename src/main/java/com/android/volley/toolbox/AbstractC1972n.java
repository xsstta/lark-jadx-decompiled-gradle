package com.android.volley.toolbox;

import com.android.volley.C1933h;
import com.android.volley.C1936j;
import com.android.volley.C1941m;
import com.android.volley.Request;
import java.io.UnsupportedEncodingException;

/* renamed from: com.android.volley.toolbox.n */
public abstract class AbstractC1972n<T> extends Request<T> {
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", "utf-8");
    private C1936j.AbstractC1938b<T> mListener;
    private final Object mLock;
    private final String mRequestBody;

    /* access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public abstract C1936j<T> parseNetworkResponse(C1933h hVar);

    @Override // com.android.volley.Request
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.Request
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.Request
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // com.android.volley.Request
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.Request
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            C1941m.m8606d("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, "utf-8");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.android.volley.Request
    public void deliverResponse(T t) {
        C1936j.AbstractC1938b<T> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(t);
        }
    }

    public AbstractC1972n(String str, String str2, C1936j.AbstractC1938b<T> bVar, C1936j.AbstractC1937a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    public AbstractC1972n(int i, String str, String str2, C1936j.AbstractC1938b<T> bVar, C1936j.AbstractC1937a aVar) {
        super(i, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }
}
