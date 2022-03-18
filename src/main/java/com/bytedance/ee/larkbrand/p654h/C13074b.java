package com.bytedance.ee.larkbrand.p654h;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.google.firebase.messaging.Constants;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapphost.C67432a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.h.b */
public class C13074b {
    /* renamed from: a */
    private static boolean m53605a() {
        if (LarkExtensionManager.getInstance().getExtension() == null || !LarkExtensionManager.getInstance().getExtension().getFeatureGating("microapp.ide.logger")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m53608b(IAppContext iAppContext) {
        if (m53605a() && C67432a.m262319a(iAppContext).getAppInfo() != null && C67432a.m262319a(iAppContext).getAppInfo().isLocalTest()) {
            C13073a.m53598a(iAppContext);
        }
    }

    /* renamed from: a */
    public static void m53604a(IAppContext iAppContext) {
        if (m53605a() && C67432a.m262319a(iAppContext).getAppInfo() != null && C67432a.m262319a(iAppContext).getAppInfo().isLocalTest()) {
            String b = C12782a.m52838b("vscode_connect_state", "");
            AppBrandLogger.m52830i("VsCodeDebugger", "MiniAppLifeCycle: pre vsLog config ", b);
            if (!TextUtils.isEmpty(b)) {
                try {
                    C13073a.m53599a(new JSONObject(b), iAppContext);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m53603a(final Context context, final JSONObject jSONObject) {
        if (jSONObject != null) {
            Schedulers.longIO().execute(new Runnable() {
                /* class com.bytedance.ee.larkbrand.p654h.C13074b.RunnableC130751 */

                public void run() {
                    C12782a.m52834a("vscode_connect_state", jSONObject.toString());
                    for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
                        if (iAppSandboxEnvProcessor != null) {
                            for (Class cls : iAppSandboxEnvProcessor.getRunningServiceClass(context)) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, jSONObject);
                                    Intent intent = new Intent(context, cls);
                                    intent.putExtra("command", "hostActionCommand");
                                    intent.putExtra("hostAction", "updateVsLogState");
                                    intent.putExtra("hostActionParams", jSONObject.toString());
                                    context.startService(intent);
                                } catch (Exception e) {
                                    AppBrandLogger.stacktrace(6, "VsCodeDebugger", e.getStackTrace());
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private static void m53607b(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(Uri.decode(str));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("wsUrl", String.format("%s://%s%s", parse.getScheme(), parse.getAuthority(), parse.getPath()));
                String queryParameter = parse.getQueryParameter("token");
                if (!TextUtils.isEmpty(queryParameter)) {
                    jSONObject.put("token", queryParameter);
                }
                jSONObject.put("allow", parse.getBooleanQueryParameter("allow", false));
                m53603a(context, jSONObject);
            } catch (JSONException e) {
                Log.e("VsCodeDebugger", "openVsLog error ", e);
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static boolean m53606a(Context context, String str) {
        if (!m53605a()) {
            return false;
        }
        Uri parse = Uri.parse(str);
        List<String> pathSegments = parse.getPathSegments();
        if (pathSegments == null || pathSegments.size() != 2 || !"mpdt".equals(pathSegments.get(0)) || !"log".equals(pathSegments.get(1))) {
            String queryParameter = parse.getQueryParameter("url");
            if (TextUtils.isEmpty(queryParameter)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(queryParameter);
                if (jSONObject.has("wsUrl")) {
                    m53607b(context, jSONObject.getString("wsUrl"));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return false;
        }
        m53607b(context, parse.getQueryParameter("wsUrl"));
        return true;
    }
}
