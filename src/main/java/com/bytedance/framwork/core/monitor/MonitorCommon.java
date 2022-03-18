package com.bytedance.framwork.core.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.C2785b;
import com.bytedance.apm.alog.AbstractC2784e;
import com.bytedance.apm.alog.C2781c;
import com.bytedance.apm.alog.IALogActiveUploadObserver;
import com.bytedance.apm.config.C2888d;
import com.bytedance.apm.core.AbstractC2908b;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p137c.C2880c;
import com.bytedance.apm.p153n.C3047b;
import com.bytedance.apm.util.C3117e;
import com.bytedance.apm.util.C3122i;
import com.bytedance.apm.util.C3133q;
import com.bytedance.article.common.monitor.p202a.AbstractC3471a;
import com.bytedance.article.common.monitor.stack.C3474b;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class MonitorCommon {
    private static volatile AbstractC2784e sAlogUploadStrategy = new C2781c();
    private static final MonitorCommon sInstance = new MonitorCommon();

    /* renamed from: com.bytedance.framwork.core.monitor.MonitorCommon$a */
    public interface AbstractC14123a {
        /* renamed from: a */
        Map<String, String> mo51892a();

        /* renamed from: b */
        String mo51893b();

        /* renamed from: c */
        long mo51894c();
    }

    public static MonitorCommon getInstance() {
        if (ApmDelegate.m12591a().mo12794g()) {
            return sInstance;
        }
        return null;
    }

    public static void setStopWhenInBackground(boolean z) {
        C2785b.m11751b(z);
    }

    public static void setConfigUrl(List<String> list) {
        if (!C3122i.m13009a(list)) {
            ApmDelegate.m12591a().mo12781a(list);
        }
    }

    public static void setDefaultReportUrlList(List<String> list) {
        if (!C3122i.m13009a(list)) {
            ApmDelegate.m12591a().mo12784b(list);
        }
    }

    private static boolean checkParamsForUploadRequest(C2880c cVar) {
        if (TextUtils.isEmpty(cVar.mo12360b()) || TextUtils.isEmpty(cVar.mo12356a()) || TextUtils.isEmpty(cVar.mo12362c()) || cVar.mo12364d() == null || cVar.mo12364d().size() == 0) {
            return false;
        }
        return true;
    }

    private static String getZipFileName(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return str + ".zip";
        }
        return str.substring(0, lastIndexOf) + ".zip";
    }

    public static void setExceptionUploadUrl(String str) {
        if (!ApmDelegate.m12591a().mo12785b()) {
            C3474b.m14698b(str);
        }
        if (!TextUtils.isEmpty(str)) {
            ApmDelegate.m12591a().mo12789c(Arrays.asList(str));
        }
    }

    private static String zipUploadFile(List<String> list) {
        File file = new File(list.get(0));
        File file2 = new File(file.getParent(), getZipFileName(file.getName()));
        if (file2.exists()) {
            file2.delete();
        }
        try {
            C3117e.m12983a(list, file2.getAbsolutePath());
            return file2.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    private static C2880c buildUploadRequest(List<String> list) {
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

    public boolean addHeaderInfo(String str, String str2) {
        return C2785b.m11748a(str, str2);
    }

    public static boolean Init(Context context, JSONObject jSONObject, AbstractC14123a aVar) {
        return init(context, jSONObject, aVar);
    }

    public static boolean init(Context context, JSONObject jSONObject, final AbstractC14123a aVar) {
        ApmDelegate.m12591a().mo12778a(C2888d.m12186a().mo12464a(jSONObject).mo12453a(new AbstractC2908b() {
            /* class com.bytedance.framwork.core.monitor.MonitorCommon.C141211 */

            @Override // com.bytedance.apm.core.AbstractC2908b
            /* renamed from: a */
            public Map<String, String> mo12551a() {
                AbstractC14123a aVar = aVar;
                if (aVar == null) {
                    return Collections.emptyMap();
                }
                return aVar.mo51892a();
            }

            @Override // com.bytedance.apm.core.AbstractC2908b
            /* renamed from: b */
            public String mo12552b() {
                AbstractC14123a aVar = aVar;
                if (aVar == null) {
                    return "";
                }
                return aVar.mo51893b();
            }

            @Override // com.bytedance.apm.core.AbstractC2908b
            /* renamed from: c */
            public long mo12553c() {
                AbstractC14123a aVar = aVar;
                if (aVar == null) {
                    return 0;
                }
                return aVar.mo51894c();
            }
        }).mo12466a());
        return true;
    }

    public static void activeUploadAlog(String str, long j, long j2, String str2, IALogActiveUploadObserver iALogActiveUploadObserver) {
        ApmAgent.activeUploadAlog(str, j, j2, str2, iALogActiveUploadObserver, null);
    }

    public static void activeUploadAlog(final String str, final long j, final long j2, final String str2, final AbstractC3471a aVar) {
        C3047b.m12756a().mo12890b(new Runnable() {
            /* class com.bytedance.framwork.core.monitor.MonitorCommon.RunnableC141222 */

            public void run() {
                MonitorCommon.tryUploadAlog(str, j, j2, str2, aVar);
            }
        });
    }

    public static void tryUploadAlog(String str, long j, long j2, String str2, AbstractC3471a aVar) {
        if (C2785b.m11735a() != null && !TextUtils.isEmpty(str) && new File(str).exists()) {
            if (aVar != null) {
                aVar.mo13914a();
            }
            activeUploadAlogInternal(str, j, j2, str2, null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e6 A[SYNTHETIC, Splitter:B:32:0x00e6] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void activeUploadAlogInternal(java.lang.String r9, long r10, long r12, java.lang.String r14, com.bytedance.apm.alog.AbstractC2783d r15) {
        /*
        // Method dump skipped, instructions count: 234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.framwork.core.monitor.MonitorCommon.activeUploadAlogInternal(java.lang.String, long, long, java.lang.String, com.bytedance.apm.alog.d):void");
    }
}
