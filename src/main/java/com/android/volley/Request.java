package com.android.volley;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.AbstractC1921a;
import com.android.volley.C1936j;
import com.android.volley.C1941m;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Map;

public abstract class Request<T> implements Comparable<Request<T>> {
    private AbstractC1921a.C1922a mCacheEntry;
    private boolean mCanceled;
    private final int mDefaultTrafficStatsTag;
    private C1936j.AbstractC1937a mErrorListener;
    public final C1941m.C1942a mEventLog;
    private final Object mLock;
    private final int mMethod;
    private AbstractC1920a mRequestCompleteListener;
    private C1934i mRequestQueue;
    private boolean mResponseDelivered;
    private AbstractC1940l mRetryPolicy;
    private Integer mSequence;
    private boolean mShouldCache;
    private boolean mShouldRetryServerErrors;
    private Object mTag;
    private final String mUrl;

    public enum Priority {
        LOW,
        NORMAL,
        HIGH,
        IMMEDIATE
    }

    /* renamed from: com.android.volley.Request$a */
    interface AbstractC1920a {
        /* renamed from: a */
        void mo9776a(Request<?> request);

        /* renamed from: a */
        void mo9777a(Request<?> request, C1936j<?> jVar);
    }

    /* access modifiers changed from: protected */
    public abstract void deliverResponse(T t);

    /* access modifiers changed from: protected */
    public Map<String, String> getParams() throws AuthFailureError {
        return null;
    }

    /* access modifiers changed from: protected */
    public String getParamsEncoding() {
        return "UTF-8";
    }

    /* access modifiers changed from: protected */
    public VolleyError parseNetworkError(VolleyError volleyError) {
        return volleyError;
    }

    /* access modifiers changed from: protected */
    public abstract C1936j<T> parseNetworkResponse(C1933h hVar);

    public AbstractC1921a.C1922a getCacheEntry() {
        return this.mCacheEntry;
    }

    public int getMethod() {
        return this.mMethod;
    }

    public Priority getPriority() {
        return Priority.NORMAL;
    }

    public AbstractC1940l getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public Object getTag() {
        return this.mTag;
    }

    public int getTrafficStatsTag() {
        return this.mDefaultTrafficStatsTag;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public final boolean shouldCache() {
        return this.mShouldCache;
    }

    public final boolean shouldRetryServerErrors() {
        return this.mShouldRetryServerErrors;
    }

    public Map<String, String> getHeaders() throws AuthFailureError {
        return Collections.emptyMap();
    }

    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    /* access modifiers changed from: protected */
    public Map<String, String> getPostParams() throws AuthFailureError {
        return getParams();
    }

    /* access modifiers changed from: protected */
    public String getPostParamsEncoding() {
        return getParamsEncoding();
    }

    public void cancel() {
        synchronized (this.mLock) {
            this.mCanceled = true;
            this.mErrorListener = null;
        }
    }

    public C1936j.AbstractC1937a getErrorListener() {
        C1936j.AbstractC1937a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        return aVar;
    }

    public final int getTimeoutMs() {
        return getRetryPolicy().mo9790a();
    }

    public boolean hasHadResponseDelivered() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mResponseDelivered;
        }
        return z;
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this.mLock) {
            z = this.mCanceled;
        }
        return z;
    }

    public void markDelivered() {
        synchronized (this.mLock) {
            this.mResponseDelivered = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyListenerResponseNotUsable() {
        AbstractC1920a aVar;
        synchronized (this.mLock) {
            aVar = this.mRequestCompleteListener;
        }
        if (aVar != null) {
            aVar.mo9776a(this);
        }
    }

    public byte[] getBody() throws AuthFailureError {
        Map<String, String> params = getParams();
        if (params == null || params.size() <= 0) {
            return null;
        }
        return encodeParameters(params, getParamsEncoding());
    }

    public String getBodyContentType() {
        return "application/x-www-form-urlencoded; charset=" + getParamsEncoding();
    }

    public byte[] getPostBody() throws AuthFailureError {
        Map<String, String> postParams = getPostParams();
        if (postParams == null || postParams.size() <= 0) {
            return null;
        }
        return encodeParameters(postParams, getPostParamsEncoding());
    }

    public final int getSequence() {
        Integer num = this.mSequence;
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("getSequence called before setSequence");
    }

    public String getCacheKey() {
        String url = getUrl();
        int method = getMethod();
        if (method == 0 || method == -1) {
            return url;
        }
        return Integer.toString(method) + '-' + url;
    }

    public String toString() {
        String str;
        String str2 = "0x" + Integer.toHexString(getTrafficStatsTag());
        StringBuilder sb = new StringBuilder();
        if (isCanceled()) {
            str = "[X] ";
        } else {
            str = "[ ] ";
        }
        sb.append(str);
        sb.append(getUrl());
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(getPriority());
        sb.append(" ");
        sb.append(this.mSequence);
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.android.volley.Request<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setCacheEntry(AbstractC1921a.C1922a aVar) {
        this.mCacheEntry = aVar;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.android.volley.Request<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRequestQueue(C1934i iVar) {
        this.mRequestQueue = iVar;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.android.volley.Request<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setRetryPolicy(AbstractC1940l lVar) {
        this.mRetryPolicy = lVar;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.android.volley.Request<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldCache(boolean z) {
        this.mShouldCache = z;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.android.volley.Request<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setShouldRetryServerErrors(boolean z) {
        this.mShouldRetryServerErrors = z;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.android.volley.Request<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public Request<?> setTag(Object obj) {
        this.mTag = obj;
        return this;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((Request) ((Request) obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.android.volley.Request<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final Request<?> setSequence(int i) {
        this.mSequence = Integer.valueOf(i);
        return this;
    }

    public void deliverError(VolleyError volleyError) {
        C1936j.AbstractC1937a aVar;
        synchronized (this.mLock) {
            aVar = this.mErrorListener;
        }
        if (aVar != null) {
            aVar.onErrorResponse(volleyError);
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyListenerResponseReceived(C1936j<?> jVar) {
        AbstractC1920a aVar;
        synchronized (this.mLock) {
            aVar = this.mRequestCompleteListener;
        }
        if (aVar != null) {
            aVar.mo9777a(this, jVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void setNetworkRequestCompleteListener(AbstractC1920a aVar) {
        synchronized (this.mLock) {
            this.mRequestCompleteListener = aVar;
        }
    }

    private static int findDefaultTrafficStatsTag(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public void addMarker(String str) {
        if (C1941m.C1942a.f6620a) {
            this.mEventLog.mo9818a(str, Thread.currentThread().getId());
        }
    }

    public int compareTo(Request<T> request) {
        Priority priority = getPriority();
        Priority priority2 = request.getPriority();
        if (priority == priority2) {
            return this.mSequence.intValue() - request.mSequence.intValue();
        }
        return priority2.ordinal() - priority.ordinal();
    }

    /* access modifiers changed from: package-private */
    public void finish(final String str) {
        C1934i iVar = this.mRequestQueue;
        if (iVar != null) {
            iVar.mo9811b(this);
        }
        if (C1941m.C1942a.f6620a) {
            final long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    /* class com.android.volley.Request.RunnableC19191 */

                    public void run() {
                        Request.this.mEventLog.mo9818a(str, id);
                        Request.this.mEventLog.mo9817a(Request.this.toString());
                    }
                });
                return;
            }
            this.mEventLog.mo9818a(str, id);
            this.mEventLog.mo9817a(toString());
        }
    }

    public Request(String str, C1936j.AbstractC1937a aVar) {
        this(-1, str, aVar);
    }

    private byte[] encodeParameters(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() == null || entry.getValue() == null) {
                    throw new IllegalArgumentException(String.format("Request#getParams() or Request#getPostParams() returned a map containing a null key or value: (%s, %s). All keys and values must be non-null.", entry.getKey(), entry.getValue()));
                }
                sb.append(URLEncoder.encode(entry.getKey(), str));
                sb.append('=');
                sb.append(URLEncoder.encode(entry.getValue(), str));
                sb.append('&');
            }
            return sb.toString().getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Encoding not supported: " + str, e);
        }
    }

    public Request(int i, String str, C1936j.AbstractC1937a aVar) {
        C1941m.C1942a aVar2;
        if (C1941m.C1942a.f6620a) {
            aVar2 = new C1941m.C1942a();
        } else {
            aVar2 = null;
        }
        this.mEventLog = aVar2;
        this.mLock = new Object();
        this.mShouldCache = true;
        this.mCanceled = false;
        this.mResponseDelivered = false;
        this.mShouldRetryServerErrors = false;
        this.mCacheEntry = null;
        this.mMethod = i;
        this.mUrl = str;
        this.mErrorListener = aVar;
        setRetryPolicy(new C1926c());
        this.mDefaultTrafficStatsTag = findDefaultTrafficStatsTag(str);
    }
}
