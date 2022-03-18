package com.huawei.hms.framework.network.grs.p1015c;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;

/* renamed from: com.huawei.hms.framework.network.grs.c.g */
public class C23570g {
    /* renamed from: a */
    public static void m85508a(ArrayList<C23568e> arrayList, long j, JSONArray jSONArray, Context context) {
        if (context != null && arrayList != null && arrayList.size() > 0 && HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            HianalyticsHelper.getInstance().getReportExecutor().execute(new RunnableC23569f(j, context, arrayList, jSONArray));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static LinkedHashMap<String, String> m85509b(C23568e eVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception d = eVar.mo82900d();
        if (d != null) {
            linkedHashMapPack.put("error_code", (long) ExceptionCode.getErrorCodeFromException(d));
            linkedHashMapPack.put("exception_name", d.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(d.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", (long) eVar.mo82897b());
            linkedHashMapPack.put("exception_name", (long) eVar.mo82899c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(eVar.mo82907k()).getHost());
        } catch (MalformedURLException e) {
            Logger.m85376w("HaReportHelper", "report host MalformedURLException", e);
        }
        linkedHashMapPack.put("req_start_time", eVar.mo82903g());
        linkedHashMapPack.put("req_end_time", eVar.mo82902f());
        linkedHashMapPack.put("req_total_time", eVar.mo82904h());
        return linkedHashMapPack.getAll();
    }
}
