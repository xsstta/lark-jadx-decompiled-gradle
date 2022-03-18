package com.bytedance.apm6.foundation.safety;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.apm.p139e.C2921a;
import com.bytedance.apm6.foundation.p182a.AbstractC3319b;
import com.bytedance.apm6.foundation.p182a.C3318a;
import com.bytedance.apm6.p187i.p190c.C3337a;
import com.bytedance.apm6.util.C3354d;
import com.bytedance.apm6.util.C3355e;
import com.bytedance.apm6.util.C3361k;
import com.bytedance.apm6.util.p195b.C3350b;
import com.bytedance.apm6.util.timetask.AbstractRunnableC3362a;
import com.bytedance.apm6.util.timetask.AsyncTaskManagerType;
import com.bytedance.apm6.util.timetask.C3363b;
import com.bytedance.common.utility.NetworkUtils;
import com.google.firebase.messaging.Constants;
import com.tt.frontendapiinterface.ApiHandler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm6.foundation.safety.a */
public class C3321a {

    /* renamed from: a */
    private static AtomicInteger f10603a = new AtomicInteger(0);

    /* renamed from: b */
    private static boolean f10604b = true;

    /* renamed from: c */
    private static String f10605c;

    /* renamed from: a */
    public static void m13864a(boolean z) {
        f10604b = z;
    }

    /* renamed from: a */
    public static void m13861a(String str) {
        if (!TextUtils.isEmpty(str)) {
            f10605c = str;
        }
    }

    /* renamed from: a */
    private static byte[] m13865a(byte[] bArr) throws IOException {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr);
                C3354d.m13949a(gZIPOutputStream2);
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream = gZIPOutputStream2;
                C3354d.m13949a(gZIPOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            C3354d.m13949a(gZIPOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    private static String m13860a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        Throwable cause = th.getCause();
        if (cause != null) {
            cause.printStackTrace(printWriter);
            Throwable cause2 = cause.getCause();
            if (cause2 != null) {
                cause2.printStackTrace(printWriter);
            }
        }
        String stringWriter2 = stringWriter.toString();
        printWriter.close();
        return stringWriter2;
    }

    /* renamed from: b */
    private static C3337a m13866b(String str, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (bArr.length > 128) {
            try {
                byte[] a = m13865a(bArr);
                hashMap.put("Content-Encoding", "gzip");
                bArr = a;
            } catch (IOException unused) {
            }
        }
        return new C3337a(C3361k.m13995a(str, C3318a.m13842t()), hashMap, bArr);
    }

    /* renamed from: a */
    private static void m13863a(String str, byte[] bArr) {
        if (!NetworkUtils.isNetworkAvailable(C3318a.m13917w())) {
            if (C3318a.m13915u()) {
                C3350b.m13932a("APM-CustomException", "network unreachable");
            }
        } else if (bArr != null && bArr.length != 0) {
            try {
                C3337a b = m13866b(str, bArr);
                if (C3318a.m13915u()) {
                    C3350b.m13932a("APM-CustomException", "http request:url:" + b.f10629a + " headers:" + b.f10630b);
                }
                C3318a.m13818a(b.f10629a, b.f10630b, b.f10631c);
            } catch (Throwable th) {
                if (C3318a.m13915u()) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    static void m13862a(final String str, final String str2, final Throwable th) {
        C2921a.m12358b(str, str2);
        if (f10604b && f10603a.get() < 3) {
            f10603a.incrementAndGet();
            C3363b.m13999a(AsyncTaskManagerType.IO).mo13585a(new AbstractRunnableC3362a() {
                /* class com.bytedance.apm6.foundation.safety.C3321a.C33221 */

                public void run() {
                    C3321a.m13867b(str, str2, th);
                }
            });
        }
    }

    /* renamed from: b */
    public static void m13867b(String str, String str2, Throwable th) {
        ApmInternalException apmInternalException = new ApmInternalException("tag=" + str + " message=" + str2, th);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_type", ApiHandler.API_CALLBACK_EXCEPTION);
            jSONObject.put("timestamp", System.currentTimeMillis());
            jSONObject.put("stack", m13860a(apmInternalException));
            jSONObject.put("exception_type", 1);
            jSONObject.put("message", str + "_" + str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("apm_sdk", "apm6_error");
            jSONObject2.put("host_aid", String.valueOf(C3318a.m13829g()));
            jSONObject.put("filters", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject);
            jSONObject3.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONArray);
            JSONObject jSONObject4 = new JSONObject();
            C3355e.m13954a(jSONObject4, C3318a.m13837o());
            AbstractC3319b b = C3318a.m13822b();
            if (b != null) {
                C3355e.m13954a(jSONObject4, b.mo13083r());
            }
            jSONObject4.put("os", "Android");
            jSONObject4.put("aid", 2085);
            jSONObject4.put("device_id", C3318a.m13838p());
            jSONObject4.put("channel", C3318a.m13830h());
            jSONObject4.put("version_code", C3318a.m13833k());
            jSONObject4.put("update_version_code", C3318a.m13831i());
            jSONObject4.put("device_id", C3318a.m13838p());
            jSONObject4.put("uid", C3318a.m13840r());
            jSONObject4.put("process_name", C3318a.m13828f());
            jSONObject3.put("header", jSONObject4);
            if (C3318a.m13915u()) {
                Log.e("APM-CustomException", "tag:" + str + " message:" + str2, apmInternalException);
            }
            m13863a(f10605c, jSONObject3.toString().getBytes());
        } catch (Throwable unused) {
        }
    }
}
