package com.bytedance.ee.lark.infra.network.p633e;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.dependency.DependencyMgr;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import okhttp3.Request;
import okhttp3.Response;

/* renamed from: com.bytedance.ee.lark.infra.network.e.a */
public class C12834a {
    /* renamed from: b */
    private static String m53004b(String str) {
        return str == null ? "" : str;
    }

    /* renamed from: a */
    private static String m53001a(Request request) {
        return m53000a(request.url().toString());
    }

    /* renamed from: a */
    public static String m53000a(String str) {
        int indexOf;
        if (TextUtils.isEmpty(str) || (indexOf = str.indexOf("?")) == -1) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: a */
    public static void m53003a(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            String[] split = str2.split(";");
            StringBuilder sb = new StringBuilder();
            for (String str3 : split) {
                String[] split2 = str3.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split2.length > 0) {
                    sb.append(split2[0]);
                    sb.append(";");
                }
            }
            AppBrandLogger.m52830i("REQUEST COOKIES NAME", "url:", str, "request cookie names:", sb.toString());
        }
    }

    /* renamed from: a */
    public static void m53002a(IAppContext iAppContext, Request request, Response response) {
        if (response == null) {
            AppBrandLogger.m52829e("HttpUtil", "logResponseHeader, response is null");
            return;
        }
        if (request == null) {
            request = response.request();
        }
        if (request == null) {
            AppBrandLogger.m52829e("HttpUtil", "logResponseHeader, request is null");
            return;
        }
        String a = m53001a(request);
        String header = request.header("x-request-id");
        String header2 = request.header("x-request-id-op");
        String header3 = response.header("EENet-XRequest-Id");
        OPMonitor a2 = DependencyMgr.m52811b().mo48305a("mp_network_rust_trace", new OPMonitorCode("client.open_platform.common", 10005, OPMonitorLevel.NORMAL, ""), iAppContext);
        if (!TextUtils.isEmpty(header2)) {
            a2.tracing(header2);
        }
        a2.addCategoryValue("request_id", m53004b(header)).addCategoryValue("url", m53004b(a)).addCategoryValue("rust_task_id", m53004b(header3)).addCategoryValue("http_code", Integer.valueOf(response.code())).flush();
    }
}
