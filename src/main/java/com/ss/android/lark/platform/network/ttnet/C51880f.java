package com.ss.android.lark.platform.network.ttnet;

import android.app.Application;
import android.content.Context;
import com.bytedance.apm.ApmAgent;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.NetworkParams;
import com.bytedance.frameworks.baselib.network.http.p741a.C13979a;
import com.bytedance.frameworks.baselib.network.http.p741a.C13981b;
import com.bytedance.ttnet.HttpClient;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.http.HttpRequestInfo;
import com.bytedance.ttnet.utils.C20793d;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.framework.utils.C26252ad;
import com.ss.android.lark.applogbridge.AppLogProxy;
import com.ss.android.lark.core.C36083a;
import com.ss.android.lark.core.language.C36235a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57765ac;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.LarkContext;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.platform.network.ttnet.f */
public class C51880f {
    /* renamed from: a */
    private static boolean m201209a() {
        return false;
    }

    /* renamed from: c */
    public static boolean m201212c(Context context) {
        return true;
    }

    /* renamed from: b */
    private static Locale m201210b() {
        return C36235a.m142710a().mo148282c().mo148297b();
    }

    /* renamed from: a */
    public static void m201207a(Context context) {
        if (m201212c(context)) {
            m201213d(context);
        } else {
            TTNetInit.setTTNetDepend(new C51877c(context));
        }
    }

    /* renamed from: b */
    public static void m201211b(Context context) {
        if (m201212c(context)) {
            TTNetInit.setCookieHandler(context);
        }
    }

    /* renamed from: d */
    private static void m201213d(Context context) {
        C518811 r2 = new NetworkParams.AbstractC13968b<HttpRequestInfo>() {
            /* class com.ss.android.lark.platform.network.ttnet.C51880f.C518811 */

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public String mo51364a(String str, boolean z, Object... objArr) {
                return null;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public Map<String, String> mo51365a(int i) {
                return null;
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public void mo51366a() {
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public void mo51369a(Map<String, String> map, boolean z) {
            }

            @Override // com.bytedance.frameworks.baselib.network.http.NetworkParams.AbstractC13968b
            /* renamed from: a */
            public String mo51363a(String str, boolean z) {
                if (C36083a.m141486a().getPassportDependency().mo133082b()) {
                    AppLogProxy.setCustomNetParams("uuid", C57859q.m224565a(C36083a.m141486a().getPassportDependency().mo133085d()));
                }
                return AppLogProxy.addNetCommonParams(LarkContext.getApplication(), str, z);
            }

            /* renamed from: a */
            public void mo51367a(String str, long j, HttpRequestInfo httpRequestInfo) {
                Log.m165379d("NetworkParams.ApiProcessHook", "handleApiOk : " + str);
            }

            /* renamed from: a */
            public void mo51368a(String str, Throwable th, long j, HttpRequestInfo httpRequestInfo) {
                Log.m165380d("NetworkParams.ApiProcessHook", str, th);
            }
        };
        C518822 r3 = new NetworkParams.AbstractC13974h<HttpRequestInfo>() {
            /* class com.ss.android.lark.platform.network.ttnet.C51880f.C518822 */

            /* renamed from: a */
            public void mo51379a(long j, long j2, String str, String str2, HttpRequestInfo httpRequestInfo) {
                try {
                    String[] strArr = new String[1];
                    JSONObject jSONObject = new JSONObject();
                    if (StringUtils.isEmpty(strArr[0])) {
                        strArr[0] = httpRequestInfo.remoteIp;
                    }
                    C51880f.m201208a(httpRequestInfo, jSONObject);
                    ApmAgent.monitorSLA(j, j2, str, strArr[0], str2, LocationRequest.PRIORITY_HD_ACCURACY, jSONObject);
                } catch (Throwable th) {
                    Log.m165384e("TTNET_INIT", "monitorApiOk", th);
                }
            }

            /* renamed from: a */
            public void mo51380a(long j, long j2, String str, String str2, HttpRequestInfo httpRequestInfo, Throwable th) {
                try {
                    String[] strArr = new String[1];
                    JSONObject jSONObject = new JSONObject();
                    if (th != null && !StringUtils.isEmpty(th.getClass().getName())) {
                        jSONObject.put("ex_name", th.getClass().getName());
                        if (ApmDelegate.m12591a().mo12782a("debug_ex_message_open")) {
                            String a = C20793d.m75743a(th);
                            if (!StringUtils.isEmpty(a)) {
                                jSONObject.put("ex_message", a);
                            }
                            String cronetExceptionMessage = HttpClient.getCronetExceptionMessage();
                            if (!StringUtils.isEmpty(cronetExceptionMessage)) {
                                jSONObject.put("cronet_init_ex_message", cronetExceptionMessage);
                            }
                        }
                    }
                    if (StringUtils.isEmpty(strArr[0])) {
                        strArr[0] = httpRequestInfo.remoteIp;
                    }
                    C51880f.m201208a(httpRequestInfo, jSONObject);
                    ApmAgent.monitorApiError(j, j2, str, strArr[0], str2, 0, jSONObject);
                    ApmAgent.monitorSLA(j, j2, str, strArr[0], str2, 0, jSONObject);
                } catch (Throwable th2) {
                    Log.m165384e("TTNET_INIT", "monitorApiError", th2);
                }
            }
        };
        try {
            C51875a.m201177a();
            if (C57765ac.m224189c(context) || C57765ac.m224187a(context)) {
                TTNetInit.setListenAppStateIndependently(true);
            }
            TTNetInit.setTTNetDepend(new C51877c(context));
            TTNetInit.trySetDefaultUserAgent(C57824f.m224460a(context, null, m201210b()));
            TTNetInit.triggerGetDomain(context, true);
            if (!C26252ad.m94993b(context)) {
                C13981b.m56538a().mo51398a(C13979a.m56522a().mo51395a(true).mo51396a());
            }
            TTNetInit.setBypassOfflineCheck(true);
            TTNetInit.tryInitTTNet(context, (Application) context.getApplicationContext(), r2, r3, null, m201209a(), true);
            TTNetInit.preInitCronetKernel();
        } catch (Throwable th) {
            Log.m165385e("TTNET_INIT", "initTTNet", th, true);
        }
    }

    /* renamed from: a */
    public static void m201208a(HttpRequestInfo httpRequestInfo, JSONObject jSONObject) {
        if (httpRequestInfo != null && jSONObject != null) {
            try {
                jSONObject.put("cronet_plugin_install", TTNetInit.getTTNetDepend().mo69991b());
                jSONObject.put("appLevelRequestStart", httpRequestInfo.appLevelRequestStart);
                jSONObject.put("beforeAllInterceptors", httpRequestInfo.beforeAllInterceptors);
                jSONObject.put("requestStart", httpRequestInfo.requestStart);
                jSONObject.put("responseBack", httpRequestInfo.responseBack);
                jSONObject.put("completeReadResponse", httpRequestInfo.completeReadResponse);
                jSONObject.put("requestEnd", httpRequestInfo.requestEnd);
                jSONObject.put("recycleCount", httpRequestInfo.recycleCount);
                if (httpRequestInfo.httpClientType == 0) {
                    jSONObject.put("timing_dns", httpRequestInfo.dnsTime);
                    jSONObject.put("timing_connect", httpRequestInfo.connectTime);
                    jSONObject.put("timing_ssl", httpRequestInfo.sslTime);
                    jSONObject.put("timing_send", httpRequestInfo.sendTime);
                    jSONObject.put("timing_waiting", httpRequestInfo.ttfbMs);
                    jSONObject.put("timing_receive", httpRequestInfo.receiveTime);
                    jSONObject.put("timing_total", httpRequestInfo.totalTime);
                    jSONObject.put("timing_isSocketReused", httpRequestInfo.isSocketReused);
                    jSONObject.put("timing_totalSendBytes", httpRequestInfo.sentByteCount);
                    jSONObject.put("timing_totalReceivedBytes", httpRequestInfo.receivedByteCount);
                    jSONObject.put("timing_remoteIP", httpRequestInfo.remoteIp);
                    jSONObject.put("request_log", httpRequestInfo.requestLog);
                }
                if (httpRequestInfo.extraInfo != null) {
                    jSONObject.put("req_info", httpRequestInfo.extraInfo);
                }
                jSONObject.put("streaming", httpRequestInfo.downloadFile);
            } catch (JSONException e) {
                Log.m165398w("TTNET_INIT", "[packageRequestParamters] json op error. ", e);
            }
        }
    }
}
