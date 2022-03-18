package com.huawei.updatesdk.p1029a.p1039b.p1044d;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.updatesdk.p1029a.p1030a.p1031a.C23829b;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23841g;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.AbstractC23865a;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23868c;
import com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d;
import com.huawei.updatesdk.p1046b.p1053e.p1054a.C23887a;
import com.huawei.updatesdk.p1046b.p1053e.p1054a.C23888b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.updatesdk.a.b.d.b */
public class AsyncTaskC23864b extends AsyncTask<C23868c, Void, C23869d> {

    /* renamed from: a */
    protected C23868c f59093a = null;

    /* renamed from: b */
    private C23869d f59094b = null;

    /* renamed from: c */
    private AbstractC23865a f59095c = null;

    /* renamed from: d */
    private C23829b f59096d = null;

    /* renamed from: e */
    private int f59097e = 0;

    public AsyncTaskC23864b(C23868c cVar, AbstractC23865a aVar) {
        this.f59093a = cVar;
        this.f59095c = aVar;
    }

    /* renamed from: a */
    private C23869d m87250a(String str, String str2, C23869d dVar) {
        try {
            dVar.fromJson(new JSONObject(str2));
            dVar.mo85640b(0);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | JSONException e) {
            C23834a.m87117a("StoreTask", "parse json error", e);
        }
        return dVar;
    }

    /* renamed from: a */
    private void m87251a(C23869d dVar, int i, C23869d.EnumC23870a aVar, Throwable th) {
        if (dVar != null) {
            dVar.mo85640b(i);
            dVar.mo85637a(aVar);
            dVar.mo85638a(th.toString());
        }
    }

    /* renamed from: a */
    private void m87252a(C23869d dVar, Throwable th, String str) {
        C23869d.EnumC23870a aVar;
        int i = 1;
        if (th instanceof ConnectException) {
            aVar = C23869d.EnumC23870a.CONNECT_EXCEPTION;
        } else if ((th instanceof SocketTimeoutException) || (th instanceof ConnectTimeoutException)) {
            aVar = C23869d.EnumC23870a.CONNECT_EXCEPTION;
            i = 2;
        } else if (th instanceof IllegalArgumentException) {
            aVar = C23869d.EnumC23870a.PARAM_ERROR;
            i = 5;
        } else if (th instanceof IllegalAccessException) {
            aVar = C23869d.EnumC23870a.UNKNOWN_EXCEPTION;
        } else if (th instanceof ArrayIndexOutOfBoundsException) {
            aVar = C23869d.EnumC23870a.NO_PROGUARD;
            i = 6;
        } else if ((th instanceof InterruptedException) || (th instanceof InterruptedIOException)) {
            m87251a(dVar, 0, C23869d.EnumC23870a.NORMAL, th);
            Log.e("StoreTask", "UpdateSDK task is canceled");
            m87253a(str, th);
        } else if (th instanceof IOException) {
            aVar = C23869d.EnumC23870a.IO_EXCEPTION;
        } else {
            if (dVar != null) {
                dVar.mo85638a(th.toString());
            }
            m87253a(str, th);
        }
        m87251a(dVar, i, aVar, th);
        m87253a(str, th);
    }

    /* renamed from: a */
    private void m87253a(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("invoke store error");
        sb.append(", exceptionType:");
        sb.append(th.getClass().getName());
        sb.append(", url:");
        sb.append(str);
        sb.append(", method:");
        sb.append(this.f59093a.mo85630b());
        sb.append(", retryTimes:" + this.f59097e);
        String sb2 = sb.toString();
        C23834a.m87117a("StoreTask", sb2, th);
        Log.e("StoreTask", "UpdateSDK call store error: " + sb2);
    }

    /* renamed from: a */
    private boolean m87254a(String str) {
        return TextUtils.isEmpty(str) || !AbstractC23841g.m87142d(str);
    }

    /* renamed from: b */
    private void m87255b(String str) {
        Log.e("StoreTask", TextUtils.isEmpty(str) ? "UpdateSDK response error, resData == null" : "UpdateSDK response error, resData is not json string");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m87256c(com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d r5) {
        /*
            r4 = this;
            java.lang.String r0 = "notifyResult, create response error, method:"
            boolean r1 = r4.isCancelled()
            if (r1 != 0) goto L_0x005a
            com.huawei.updatesdk.a.b.d.c.a r1 = r4.f59095c
            if (r1 == 0) goto L_0x005a
            if (r5 != 0) goto L_0x0053
            java.lang.String r1 = "StoreTask"
            java.lang.String r2 = "notifyResult, response is null"
            com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a.m87118b(r1, r2)
            com.huawei.updatesdk.a.b.d.c.c r2 = r4.f59093a     // Catch:{ InstantiationException -> 0x0027, IllegalAccessException -> 0x0020 }
            java.lang.String r2 = r2.mo85630b()     // Catch:{ InstantiationException -> 0x0027, IllegalAccessException -> 0x0020 }
            com.huawei.updatesdk.a.b.d.c.d r5 = com.huawei.updatesdk.p1029a.p1039b.p1044d.C23863a.m87249a(r2)     // Catch:{ InstantiationException -> 0x0027, IllegalAccessException -> 0x0020 }
            goto L_0x0040
        L_0x0020:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            goto L_0x002d
        L_0x0027:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
        L_0x002d:
            r3.append(r0)
            com.huawei.updatesdk.a.b.d.c.c r0 = r4.f59093a
            java.lang.String r0 = r0.mo85630b()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a.m87117a(r1, r0, r2)
        L_0x0040:
            if (r5 != 0) goto L_0x004a
            com.huawei.updatesdk.a.b.d.c.d r5 = new com.huawei.updatesdk.a.b.d.c.d
            r5.<init>()
            com.huawei.updatesdk.a.b.d.c.d$a r0 = com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d.EnumC23870a.PARAM_ERROR
            goto L_0x004c
        L_0x004a:
            com.huawei.updatesdk.a.b.d.c.d$a r0 = com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d.EnumC23870a.UNKNOWN_EXCEPTION
        L_0x004c:
            r5.mo85637a(r0)
            r0 = 1
            r5.mo85640b(r0)
        L_0x0053:
            com.huawei.updatesdk.a.b.d.c.a r0 = r4.f59095c
            com.huawei.updatesdk.a.b.d.c.c r1 = r4.f59093a
            r0.mo85621b(r1, r5)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1039b.p1044d.AsyncTaskC23864b.m87256c(com.huawei.updatesdk.a.b.d.c.d):void");
    }

    /* renamed from: d */
    private boolean m87257d(C23869d dVar) {
        if (isCancelled()) {
            return false;
        }
        if (dVar.mo85642d() != 1 && dVar.mo85642d() != 2) {
            return false;
        }
        int i = this.f59097e;
        this.f59097e = i + 1;
        if (i >= 3) {
            C23834a.m87116a("StoreTask", "retry completed total times = " + this.f59097e + ",response.responseCode = " + dVar.mo85642d());
            return false;
        }
        C23834a.m87116a("StoreTask", "retry times = " + this.f59097e + ",response.responseCode = " + dVar.mo85642d());
        return true;
    }

    /* renamed from: e */
    private void m87258e() {
        m87256c(this.f59094b);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.huawei.updatesdk.p1029a.p1039b.p1044d.p1045c.C23869d mo85610a() {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.p1029a.p1039b.p1044d.AsyncTaskC23864b.mo85610a():com.huawei.updatesdk.a.b.d.c.d");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C23869d doInBackground(C23868c... cVarArr) {
        C23834a.m87116a("StoreTask", "doInBackground, method:" + this.f59093a.mo85630b());
        C23888b.m87348a(this);
        C23869d c = mo85616c();
        AbstractC23865a aVar = this.f59095c;
        if (aVar != null) {
            aVar.mo85620a(this.f59093a, c);
        }
        return c;
    }

    /* renamed from: a */
    public void mo85612a(C23869d dVar) {
    }

    /* renamed from: a */
    public final void mo85613a(Executor executor) {
        executeOnExecutor(executor, this.f59093a);
    }

    /* renamed from: b */
    public void mo85614b() {
        C23829b bVar = this.f59096d;
        if (bVar != null) {
            bVar.mo85556a();
            this.f59096d = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(C23869d dVar) {
        C23834a.m87116a("StoreTask", "onPostExecute, method:" + this.f59093a.mo85630b());
        C23888b.m87347a().remove(this);
        m87258e();
    }

    /* renamed from: c */
    public final C23869d mo85616c() {
        C23869d dVar = null;
        do {
            if (this.f59097e > 0 && dVar != null) {
                C23834a.m87116a("StoreTask", "call store error! responseCode:" + dVar.mo85642d() + ", retryTimes:" + this.f59097e);
            }
            dVar = mo85610a();
            mo85612a(dVar);
        } while (m87257d(dVar));
        this.f59094b = dVar;
        return dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo85617d() {
        String a = C23887a.m87344a();
        return TextUtils.isEmpty(a) ? "Android/1.0" : a;
    }
}
