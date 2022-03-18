package com.bytedance.ee.webapp.v2;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.bytedance.ee.larkbrand.utils.C13360l;
import com.ss.android.lark.opmonitor.api.AbstractC48904a;
import com.ss.android.lark.opmonitor.api.C48905c;
import com.ss.android.lark.opmonitor.model.C48918a;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.p2069j.p2070a.C40648o;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.p3362a.p3367e.C67462h;
import com.tt.miniapphost.p3371e.AbstractC67514d;
import com.tt.miniapphost.p3371e.C67515e;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.refer.common.meta.AbstractC67796c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ$\u0010\u0010\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0014\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/webapp/v2/WebContainerDelegateLogUtils;", "", "()V", "EVENT_NAME_COMPLETE_IDENTIFY", "", "EVENT_NAME_CONTAINER_MENU_CLICK", "EVENT_NAME_PAGE_VIEW", "getFinalReportUrl", "url", "tryPrintWebAppConfigLog", "", "isConfigedFromOnCreate", "", "appId", "webAppContent", "Lcom/tt/miniapphost/appcontainer/impl/WebAppContext;", "tryPrintWebPageShowLog", "tryRegisterHeartBeat", "appContext", "tryStopHeartBeat", "tryUploadClickMonitorLog", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.webapp.v2.i */
public final class WebContainerDelegateLogUtils {

    /* renamed from: a */
    public static final WebContainerDelegateLogUtils f36209a = new WebContainerDelegateLogUtils();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "getCurrentHeartBeatStatus"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.webapp.v2.i$a */
    public static final class C13849a implements AbstractC48904a {

        /* renamed from: a */
        public static final C13849a f36210a = new C13849a();

        C13849a() {
        }

        @Override // com.ss.android.lark.opmonitor.api.AbstractC48904a
        public final int getCurrentHeartBeatStatus(String str) {
            return 0;
        }
    }

    private WebContainerDelegateLogUtils() {
    }

    /* renamed from: a */
    private final String m56152a(String str) {
        String str2;
        String str3;
        Uri parse = Uri.parse(str);
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        String str4 = "";
        if (parse.getAuthority() != null) {
            str2 = parse.getEncodedAuthority();
        } else {
            str2 = str4;
        }
        if (parse.getEncodedPath() != null) {
            str3 = parse.getEncodedPath();
        } else {
            str3 = str4;
        }
        if (parse.getEncodedFragment() != null) {
            str4 = parse.getEncodedFragment();
        }
        String b = C13360l.m54358b(str2 + str3 + str4);
        Intrinsics.checkExpressionValueIsNotNull(b, "EncryptUtil.md5(finalPath)");
        return b;
    }

    /* renamed from: b */
    public final void mo51086b(C67462h hVar) {
        if (hVar != null) {
            String appId = hVar.getAppId();
            AbstractC67514d a = new C67500a(C40648o.f103131a, hVar).mo234325a(appId);
            Intrinsics.checkExpressionValueIsNotNull(a, "GadgetMonitor(\n         …        ).setAppId(appId)");
            AbstractC67514d dVar = a;
            IBaseService findServiceByInterface = hVar.findServiceByInterface(AbstractC67796c.class);
            Intrinsics.checkExpressionValueIsNotNull(findServiceByInterface, "appContext.findServiceBy…nInfoService::class.java)");
            AbstractC67796c cVar = (AbstractC67796c) findServiceByInterface;
            if (cVar != null) {
                dVar.addMap(cVar.mo88674b());
                dVar.addCategoryValue("version_type", "current");
            }
            C48918a aVar = new C48918a();
            aVar.mo170798a(dVar);
            aVar.mo170799a(appId + C67475d.m262448a(hVar.getAppType()) + hVar.getAppIdentify() + "current");
            C48905c.m192681a(hVar.getApplicationContext(), aVar, C13849a.f36210a);
        }
    }

    /* renamed from: c */
    public final void mo51087c(C67462h hVar) {
        if (hVar != null) {
            OPMonitor reportPlatform = new C67500a(C40648o.f103131a, hVar).reportPlatform(6);
            AppbrandContext inst = AppbrandContext.getInst();
            Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
            reportPlatform.tracing(inst.getTraceId()).flush();
            C48905c.m192682a(hVar.getApplicationContext(), hVar.getAppId() + C67475d.m262448a(hVar.getAppType()) + hVar.getAppIdentify() + "current");
        }
    }

    /* renamed from: a */
    public final void mo51083a(C67462h hVar) {
        String str;
        String str2;
        IMonitorCreator a = C67515e.m262603a(hVar);
        if (a != null) {
            String str3 = null;
            OPMonitor createOPMonitor = a.createOPMonitor("openplatform_web_container_menu_click", null);
            if (createOPMonitor != null) {
                if (hVar != null) {
                    str = hVar.getAppId();
                } else {
                    str = null;
                }
                boolean z = !TextUtils.isEmpty(str);
                if (z) {
                    str2 = "web_app";
                } else {
                    str2 = "web";
                }
                createOPMonitor.addCategoryValue("click", "app_share");
                createOPMonitor.addCategoryValue("target", "openplatform_application_share_view");
                createOPMonitor.addCategoryValue("identify_status", str2);
                if (!z) {
                    str3 = "none";
                } else if (hVar != null) {
                    str3 = hVar.getAppId();
                }
                createOPMonitor.addCategoryValue("application_id", str3);
                createOPMonitor.addCategoryValue("scene_type", "none");
                createOPMonitor.addCategoryValue("solution_id", "none");
                createOPMonitor.reportPlatform(4);
                createOPMonitor.flush();
            }
        }
    }

    /* renamed from: a */
    public final void mo51084a(String str, String str2, C67462h hVar) {
        IMonitorCreator a;
        String str3;
        String str4;
        String str5;
        if (str != null && (a = C67515e.m262603a(hVar)) != null) {
            String a2 = f36209a.m56152a(str);
            if (hVar == null || (str3 = hVar.getTraceId()) == null) {
                str3 = "";
            }
            if (hVar != null) {
                str4 = hVar.getAppId();
            } else {
                str4 = null;
            }
            if (TextUtils.isEmpty(str4)) {
                str5 = "none";
            } else if (hVar != null) {
                str5 = hVar.getAppId();
            } else {
                str5 = null;
            }
            if (!TextUtils.isEmpty(str5)) {
                str2 = str5;
            }
            a.createOPMonitor("openplatform_web_app_page_view", null).addCategoryValue("page_path", a2).addCategoryValue("lifecycle_id", str3).addCategoryValue("application_id", str2).reportPlatform(4).flush();
        }
    }

    /* renamed from: a */
    public final void mo51085a(boolean z, String str, String str2, C67462h hVar) {
        IMonitorCreator a;
        String str3;
        Intrinsics.checkParameterIsNotNull(str2, "appId");
        if (str != null && (a = C67515e.m262603a(hVar)) != null) {
            String a2 = f36209a.m56152a(str);
            if (z) {
                str3 = "launch";
            } else {
                str3 = "runtime";
            }
            a.createOPMonitor("openplatform_web_app_complete_identify_view", null).addCategoryValue("url", a2).addCategoryValue("identify_type", str3).addCategoryValue("application_id", str2).reportPlatform(4).flush();
        }
    }
}
