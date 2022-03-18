package com.android.volley.toolbox;

import com.android.volley.AbstractC1921a;
import com.android.volley.AbstractC1931f;
import com.android.volley.AbstractC1940l;
import com.android.volley.C1930e;
import com.android.volley.C1941m;
import com.android.volley.Request;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: com.android.volley.toolbox.c */
public class C1948c implements AbstractC1931f {

    /* renamed from: a */
    protected static final boolean f6636a = C1941m.f6618b;

    /* renamed from: b */
    protected final AbstractC1958i f6637b;

    /* renamed from: c */
    protected final C1949d f6638c;

    /* renamed from: d */
    private final AbstractC1947b f6639d;

    public C1948c(AbstractC1947b bVar) {
        this(bVar, new C1949d(4096));
    }

    public C1948c(AbstractC1958i iVar) {
        this(iVar, new C1949d(4096));
    }

    /* renamed from: a */
    private Map<String, String> m8618a(AbstractC1921a.C1922a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        if (aVar.f6562b != null) {
            hashMap.put("If-None-Match", aVar.f6562b);
        }
        if (aVar.f6564d > 0) {
            hashMap.put("If-Modified-Since", C1956g.m8660a(aVar.f6564d));
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r15 = null;
        r2 = r12;
        r19 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b4, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b5, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r19 = r1;
        r15 = null;
        r2 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00bd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00be, code lost:
        r19 = r1;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c3, code lost:
        r0 = r2.mo9845a();
        com.android.volley.C1941m.m8605c("Unexpected response code %d for %s", java.lang.Integer.valueOf(r0), r29.getUrl());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00dc, code lost:
        if (r15 != null) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00de, code lost:
        r1 = new com.android.volley.C1933h(r0, r15, false, android.os.SystemClock.elapsedRealtime() - r9, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ef, code lost:
        if (r0 == 401) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f8, code lost:
        if (r0 < 400) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0104, code lost:
        throw new com.android.volley.ClientError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0107, code lost:
        if (r0 < 500) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0111, code lost:
        if (r29.shouldRetryServerErrors() != false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0113, code lost:
        m8620a("server", r29, new com.android.volley.ServerError(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0124, code lost:
        throw new com.android.volley.ServerError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012a, code lost:
        throw new com.android.volley.ServerError(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x012b, code lost:
        m8620a("auth", r29, new com.android.volley.AuthFailureError(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0137, code lost:
        m8620a("network", r29, new com.android.volley.NetworkError());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0148, code lost:
        throw new com.android.volley.NoConnectionError(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0149, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0164, code lost:
        throw new java.lang.RuntimeException("Bad URL " + r29.getUrl(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0165, code lost:
        m8620a("socket", r29, new com.android.volley.TimeoutError());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0149 A[ExcHandler: MalformedURLException (r0v1 'e' java.net.MalformedURLException A[CUSTOM_DECLARE]), Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:2:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0143 A[SYNTHETIC] */
    @Override // com.android.volley.AbstractC1931f
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.android.volley.C1933h mo9804a(com.android.volley.Request<?> r29) throws com.android.volley.VolleyError {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C1948c.mo9804a(com.android.volley.Request):com.android.volley.h");
    }

    public C1948c(AbstractC1947b bVar, C1949d dVar) {
        this.f6639d = bVar;
        this.f6637b = bVar;
        this.f6638c = dVar;
    }

    public C1948c(AbstractC1958i iVar, C1949d dVar) {
        this.f6637b = iVar;
        this.f6639d = new C1946a(iVar);
        this.f6638c = dVar;
    }

    /* renamed from: a */
    private static List<C1930e> m8617a(List<C1930e> list, AbstractC1921a.C1922a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            for (C1930e eVar : list) {
                treeSet.add(eVar.mo9799a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        if (aVar.f6568h != null) {
            if (!aVar.f6568h.isEmpty()) {
                for (C1930e eVar2 : aVar.f6568h) {
                    if (!treeSet.contains(eVar2.mo9799a())) {
                        arrayList.add(eVar2);
                    }
                }
            }
        } else if (!aVar.f6567g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.f6567g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new C1930e(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private byte[] m8621a(InputStream inputStream, int i) throws IOException, ServerError {
        C1973o oVar = new C1973o(this.f6638c, i);
        if (inputStream != null) {
            try {
                byte[] a = this.f6638c.mo9831a(1024);
                while (true) {
                    int read = inputStream.read(a);
                    if (read == -1) {
                        break;
                    }
                    oVar.write(a, 0, read);
                }
                byte[] byteArray = oVar.toByteArray();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        C1941m.m8602a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f6638c.mo9830a(a);
                oVar.close();
                return byteArray;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        C1941m.m8602a("Error occurred when closing InputStream", new Object[0]);
                    }
                }
                this.f6638c.mo9830a((byte[]) null);
                oVar.close();
                throw th;
            }
        } else {
            throw new ServerError();
        }
    }

    /* renamed from: a */
    private static void m8620a(String str, Request<?> request, VolleyError volleyError) throws VolleyError {
        AbstractC1940l retryPolicy = request.getRetryPolicy();
        int timeoutMs = request.getTimeoutMs();
        try {
            retryPolicy.mo9791a(volleyError);
            request.addMarker(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(timeoutMs)));
        } catch (VolleyError e) {
            request.addMarker(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(timeoutMs)));
            throw e;
        }
    }

    /* renamed from: a */
    private void m8619a(long j, Request<?> request, byte[] bArr, int i) {
        Object obj;
        if (f6636a || j > 3000) {
            Object[] objArr = new Object[5];
            objArr[0] = request;
            objArr[1] = Long.valueOf(j);
            if (bArr != null) {
                obj = Integer.valueOf(bArr.length);
            } else {
                obj = "null";
            }
            objArr[2] = obj;
            objArr[3] = Integer.valueOf(i);
            objArr[4] = Integer.valueOf(request.getRetryPolicy().mo9792b());
            C1941m.m8604b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", objArr);
        }
    }
}
