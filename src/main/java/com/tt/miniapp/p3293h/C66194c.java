package com.tt.miniapp.p3293h;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.errorcode.Flow;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.toast.ToastManager;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapp.view.swipeback.C67224a;
import com.tt.miniapphost.AbstractC67497e;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.MiniappHostBase;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67434b;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.ProcessUtil;
import com.tt.refer.common.base.AppType;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.h.c */
public class C66194c {
    /* renamed from: a */
    public static void m259173a(String str, IAppContext iAppContext) {
        m259175a(str, true, iAppContext);
    }

    /* renamed from: a */
    public static void m259171a(Context context, String str, IAppContext iAppContext) {
        m259172a(context, str, true, iAppContext);
    }

    /* renamed from: a */
    public static void m259174a(String str, String str2, IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errCode", str);
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, str2);
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("LoadHelper", "openMiniAppActivity", e);
        }
        C67509b.m262587a("mp_start_error", 5000, jSONObject, iAppContext);
    }

    /* renamed from: a */
    public static void m259175a(final String str, boolean z, final IAppContext iAppContext) {
        int i;
        if (ProcessUtil.isMiniappProcess() && AppType.GadgetAPP == iAppContext.getAppType()) {
            final MiniappHostBase miniappHostBase = (MiniappHostBase) iAppContext.getCurrentActivity();
            if (miniappHostBase != null) {
                m259174a(str, "", iAppContext);
                if (C67432a.m262319a(iAppContext).getAppInfo() == null || TextUtils.isEmpty(C67432a.m262319a(iAppContext).getSchema()) || !HostDependManager.getInst().handleAppbrandDisablePage(miniappHostBase, C67432a.m262319a(iAppContext).getSchema())) {
                    if (z) {
                        final StringBuilder sb = new StringBuilder();
                        if (AppbrandContext.getInst().isGame()) {
                            i = R.string.microapp_m_microgame;
                        } else {
                            i = R.string.microapp_m_microapp;
                        }
                        String a = C67590h.m263073a(i);
                        if (!C67053q.m261325a(miniappHostBase)) {
                            sb.append(C67590h.m263073a((int) R.string.microapp_m_network_bad_check));
                        } else if (TextUtils.equals(str, ErrorCode.META.PERMISSION_DENY.getCode())) {
                            sb.append(C67590h.m263073a((int) R.string.microapp_m_load_failed_no_permission));
                        } else if (TextUtils.equals(str, ErrorCode.META.EXPIRED.getCode())) {
                            sb.append(C67590h.m263073a((int) R.string.microapp_m_load_failed_preview_expired));
                        } else {
                            sb.append(a);
                            sb.append(C67590h.m263073a((int) R.string.microapp_m_load_failed));
                        }
                        if (DebugUtil.debug()) {
                            sb.append("(");
                            sb.append(str);
                            sb.append(")");
                        }
                        AppBrandLogger.m52829e("LoadHelper", "showLoadFailDialog fail", new Throwable());
                        AppbrandContext.getMainHandler().post(new Runnable(true) {
                            /* class com.tt.miniapp.p3293h.C66194c.RunnableC661951 */

                            public void run() {
                                AbstractC67497e activityProxy;
                                boolean z = true;
                                if (!miniappHostBase.isFinishing() && (activityProxy = miniappHostBase.getActivityProxy()) != null && activityProxy.mo231005a(sb.toString(), true)) {
                                    z = false;
                                }
                                if (z) {
                                    C66194c.m259170a(miniappHostBase, sb.toString(), str, iAppContext);
                                }
                            }
                        });
                    }
                    String str2 = "code: " + str;
                    C66036d.m258597b(C66037e.m258610a(iAppContext).mo231117b(), "fail", str2, C66037e.m258610a(iAppContext).mo231120c(), C66037e.m258610a(iAppContext).mo231114a(), iAppContext);
                    AppBrandLogger.m52828d("LoadHelper", "load fail! " + str2);
                } else if (TextUtils.isEmpty(str) || !str.startsWith(Flow.Meta.getCode())) {
                    C67070z.m261391a(miniappHostBase, 4, iAppContext);
                } else {
                    C67070z.m261391a(miniappHostBase, 3, iAppContext);
                }
            }
        } else if (iAppContext instanceof AbstractC67433a) {
            AbstractC67434b a2 = ((AbstractC67433a) iAppContext).mo234156a();
            if (a2 instanceof AbstractC67497e) {
                ((AbstractC67497e) a2).mo231005a(str, true);
            }
        }
    }

    /* renamed from: a */
    public static void m259170a(final Activity activity, String str, String str2, final IAppContext iAppContext) {
        StringBuilder sb = new StringBuilder(str);
        if (DebugUtil.debug()) {
            sb.append(":");
            sb.append(str2);
        }
        HostDependManager.getInst().showModal(activity, null, null, sb.toString(), false, null, null, C67590h.m263073a((int) R.string.microapp_m_confirm), null, new AbstractC67550j.AbstractC67551a<Integer>() {
            /* class com.tt.miniapp.p3293h.C66194c.C661983 */

            /* renamed from: a */
            public void onNativeModuleCall(Integer num) {
                if (num.intValue() == 1) {
                    C67224a.f169674a = "others";
                    C67224a.f169675b = true;
                    C67070z.m261391a(activity, 1, iAppContext);
                }
            }
        }, activity);
    }

    /* renamed from: a */
    public static void m259172a(final Context context, String str, boolean z, final IAppContext iAppContext) {
        if (ProcessUtil.isMainProcess(context)) {
            AppBrandLogger.m52829e("LoadHelper", "showLoadFailDialog fail", new Throwable());
            m259174a(str, "", iAppContext);
            if (z) {
                final StringBuilder sb = new StringBuilder();
                sb.append(C67590h.m263073a((int) R.string.microapp_m_little_app_load_failed_retry_late));
                sb.append(str);
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.tt.miniapp.p3293h.C66194c.RunnableC661962 */

                    public void run() {
                        Context context = context;
                        if (context != null) {
                            if (!(context instanceof Activity) || ((Activity) context).isFinishing()) {
                                ToastManager.showToast(context, sb.toString(), 0, null);
                            } else {
                                HostDependManager.getInst().showModal(context, null, null, sb.toString(), false, null, null, C67590h.m263073a((int) R.string.microapp_m_determine), null, new AbstractC67550j.AbstractC67551a<Integer>() {
                                    /* class com.tt.miniapp.p3293h.C66194c.RunnableC661962.C661971 */

                                    /* renamed from: a */
                                    public void onNativeModuleCall(Integer num) {
                                    }
                                }, iAppContext.getCurrentActivity());
                            }
                        }
                    }
                });
            }
        }
    }
}
