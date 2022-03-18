package com.bytedance.apm.alog;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.p137c.C2880c;
import com.bytedance.apm.util.C3133q;
import java.io.File;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.alog.a */
public class C2776a {

    /* renamed from: a */
    private static volatile AbstractC2784e f8859a;

    /* renamed from: a */
    private static String m11714a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return str + ".zip";
        }
        return str.substring(0, lastIndexOf) + ".zip";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        r1.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (r1.exists() != false) goto L_0x0038;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0032 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m11715a(java.util.List<java.lang.String> r3) {
        /*
            java.io.File r0 = new java.io.File
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = m11714a(r0)
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0026
            r1.delete()
        L_0x0026:
            java.lang.String r0 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x0032 }
            com.bytedance.apm.util.C3117e.m12983a(r3, r0)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = r1.getAbsolutePath()
            return r3
        L_0x0032:
            boolean r3 = r1.exists()     // Catch:{ Exception -> 0x003b }
            if (r3 == 0) goto L_0x003b
            r1.delete()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.alog.C2776a.m11715a(java.util.List):java.lang.String");
    }

    /* renamed from: b */
    private static C2880c m11720b(List<String> list) {
        String str;
        C2880c cVar = new C2880c();
        JSONObject o = C2785b.m11774o();
        if (o != null) {
            cVar.mo12361b(o.optString("aid"));
            cVar.mo12357a(o.optString("device_id"));
        }
        if (C3133q.m13029a(C2785b.m11735a()).contains(":")) {
            str = C3133q.m13029a(C2785b.m11735a());
        } else {
            str = "main";
        }
        cVar.mo12363c(str);
        cVar.mo12358a(list);
        cVar.mo12359a(o);
        return cVar;
    }

    /* renamed from: a */
    private static boolean m11719a(C2880c cVar) {
        if (TextUtils.isEmpty(cVar.mo12360b()) || TextUtils.isEmpty(cVar.mo12356a()) || TextUtils.isEmpty(cVar.mo12362c()) || cVar.mo12364d() == null || cVar.mo12364d().size() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m11716a(Context context, AbstractC2784e eVar) {
        if (f8859a == null) {
            f8859a = eVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x01aa A[SYNTHETIC, Splitter:B:45:0x01aa] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m11718a(java.lang.String r17, long r18, long r20, java.lang.String r22, final com.bytedance.apm.alog.AbstractC2783d r23) {
        /*
        // Method dump skipped, instructions count: 435
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.alog.C2776a.m11718a(java.lang.String, long, long, java.lang.String, com.bytedance.apm.alog.d):void");
    }

    /* renamed from: a */
    public static void m11717a(String str, long j, long j2, String str2, IALogActiveUploadObserver iALogActiveUploadObserver, AbstractC2783d dVar) {
        int i;
        String str3;
        String str4;
        long currentTimeMillis = System.currentTimeMillis();
        ApmAgent.monitorStatusRate("apm_event_stats_alog", 0, null);
        C2780b.m11727a("begin upload alog:" + str + " startTime:" + j + " endTime:" + j2 + " scene:" + str2);
        boolean z = true;
        if (C2785b.m11735a() == null) {
            str3 = "apm context is null";
            i = 0;
        } else {
            if (!TextUtils.isEmpty(str)) {
                str4 = str;
            } else if (TextUtils.isEmpty(C2785b.m11783x())) {
                str3 = "alog file dir is null";
                i = 1;
            } else {
                str4 = C2785b.m11783x();
            }
            if (!new File(str4).exists()) {
                str3 = "alog file dir do not exist";
                i = 2;
            } else {
                if (iALogActiveUploadObserver != null) {
                    iALogActiveUploadObserver.flushAlogDataToFile();
                    C2780b.m11727a("flush alog data to file");
                } else {
                    ApmAgent.monitorStatusRate("apm_event_stats_alog_fail", 3, null);
                }
                m11718a(str4, j, j2, str2, dVar);
                str3 = "";
                i = -1;
                z = false;
            }
        }
        JSONObject a = C2780b.m11726a(!z, i, null, null);
        if (z && dVar != null) {
            dVar.mo12089a(false, a);
        }
        if (z) {
            ApmAgent.monitorStatusRate("apm_event_stats_alog_fail", i, a);
        }
        C2780b.m11727a("upload end. " + str3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", System.currentTimeMillis() - currentTimeMillis);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ApmAgent.monitorEvent("apm_event_stats_alog_time", null, jSONObject, null);
    }
}
