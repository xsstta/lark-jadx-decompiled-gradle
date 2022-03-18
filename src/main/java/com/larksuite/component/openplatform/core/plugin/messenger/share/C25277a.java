package com.larksuite.component.openplatform.core.plugin.messenger.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12830f;
import com.google.android.gms.common.ConnectionResult;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.suite.R;
import com.tt.frontendapiinterface.ApiCallResultHelper;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.entity.C66013d;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.C67531h;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.util.C67587d;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.option.ext.AbstractC67619e;
import com.tt.option.p3392m.C67657c;
import com.tt.option.share.AbstractC67678b;
import com.tt.option.share.AbstractC67682e;
import com.tt.option.share.AbstractC67683f;
import com.tt.option.share.AbstractC67684g;
import com.tt.option.share.ShareInfoModel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.share.a */
public class C25277a extends ApiHandler {

    /* renamed from: A */
    private String f61716A;

    /* renamed from: B */
    private boolean f61717B = true;

    /* renamed from: C */
    private String f61718C;

    /* renamed from: D */
    private Dialog f61719D;

    /* renamed from: E */
    private long f61720E;

    /* renamed from: F */
    private AppbrandApplicationImpl.AbstractC65697c f61721F = new AppbrandApplicationImpl.AbstractC65697c() {
        /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252781 */

        @Override // com.tt.miniapp.AppbrandApplicationImpl.AbstractC65697c
        /* renamed from: a */
        public void mo88401a() {
            C25277a.this.f61737p = false;
        }

        @Override // com.tt.miniapp.AppbrandApplicationImpl.AbstractC65697c
        /* renamed from: b */
        public void mo88402b() {
            C25277a.this.f61737p = true;
            if (C25277a.this.f61738q && C25277a.this.f61733l != null) {
                C25277a.this.f61738q = false;
                AppbrandContext.getMainHandler().postDelayed(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252781.RunnableC252791 */

                    public void run() {
                        C25277a.this.mo88391a(C25277a.this.f61733l, C25277a.this.f61729h, C25277a.this.f61730i);
                    }
                }, 200);
            }
        }
    };

    /* renamed from: a */
    public String f61722a;

    /* renamed from: b */
    public boolean f61723b;

    /* renamed from: c */
    public boolean f61724c;

    /* renamed from: d */
    public String f61725d = "";

    /* renamed from: e */
    public String f61726e;

    /* renamed from: f */
    public String f61727f;

    /* renamed from: g */
    public boolean f61728g;

    /* renamed from: h */
    public String f61729h;

    /* renamed from: i */
    public String f61730i;

    /* renamed from: j */
    public Call f61731j;

    /* renamed from: k */
    public Call f61732k;

    /* renamed from: l */
    public C66013d f61733l;

    /* renamed from: m */
    public volatile boolean f61734m;

    /* renamed from: n */
    public String f61735n = "inside";

    /* renamed from: o */
    public long f61736o;

    /* renamed from: p */
    public boolean f61737p = true;

    /* renamed from: q */
    public boolean f61738q;

    /* renamed from: r */
    public AtomicBoolean f61739r;

    /* renamed from: s */
    public AtomicBoolean f61740s;

    /* renamed from: t */
    public AbstractC25291b f61741t;

    /* renamed from: u */
    private String f61742u = "shareAppMessageDirectly";

    /* renamed from: v */
    private String f61743v = "";

    /* renamed from: w */
    private String f61744w;

    /* renamed from: x */
    private String f61745x;

    /* renamed from: y */
    private String f61746y;

    /* renamed from: z */
    private String f61747z;

    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.share.a$a */
    public interface AbstractC25290a {
        /* renamed from: a */
        void mo88412a();

        /* renamed from: a */
        void mo88413a(ShareInfoModel shareInfoModel);
    }

    /* renamed from: com.larksuite.component.openplatform.core.plugin.messenger.share.a$b */
    public interface AbstractC25291b {
        /* renamed from: a */
        void mo88405a();
    }

    /* renamed from: a */
    public static void m90741a(int i) {
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean shouldHandleActivityResult() {
        return true;
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public String getActionName() {
        return this.f61742u;
    }

    /* renamed from: a */
    public void mo88393a(String str, String str2, String str3) {
        if (this.f61719D != null && this.f61734m) {
            this.f61734m = false;
            this.f61719D.dismiss();
            C66036d.m258588a(this.f61727f, this.f61735n, this.f61736o, str, str3, mo88399d(), getAppContext());
        }
    }

    /* renamed from: a */
    public void mo88392a(final String str) {
        if (TextUtils.isEmpty(str)) {
            this.f61723b = false;
            return;
        }
        final C12827e g = m90749g(str);
        if (g == null) {
            this.f61723b = false;
            return;
        }
        this.f61723b = true;
        final long currentMillis = TimeMeter.currentMillis();
        Observable.create(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252812 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    C12830f postMultiPart = HostDependManager.getInst().postMultiPart(g, C25277a.this.getAppContext());
                    if (postMultiPart != null) {
                        if (postMultiPart.mo48466d() != null) {
                            C25277a.this.f61723b = false;
                            if (postMultiPart.mo48466d() != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(postMultiPart.mo48466d());
                                    int optInt = jSONObject.optInt("err_no", -1);
                                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                                    if (optInt != 0 || optJSONObject == null) {
                                        String str = C25277a.this.f61735n;
                                        long j = currentMillis;
                                        C66036d.m258583a(str, j, "fail", "server response code: " + optInt, C25277a.this.mo88399d(), C25277a.this.getAppContext());
                                    } else {
                                        C25277a.this.f61722a = optJSONObject.optString("uri");
                                        C66036d.m258583a(C25277a.this.f61735n, currentMillis, "success", (String) null, C25277a.this.mo88399d(), C25277a.this.getAppContext());
                                    }
                                } catch (JSONException e) {
                                    AppBrandLogger.m52829e("ApiShareMessageDirectlyCtrl", "sendUploadRequestByOuter", e);
                                }
                            }
                            if (C25277a.this.f61741t != null) {
                                C25277a.this.f61741t.mo88405a();
                                C25277a.this.f61741t = null;
                                return;
                            }
                            return;
                        }
                    }
                    if (C25277a.this.f61723b && !C25277a.this.f61724c) {
                        C25277a.this.f61724c = true;
                        C25277a.this.mo88392a(str);
                    } else if (C25277a.this.f61723b) {
                        C25277a.this.f61723b = false;
                        if (C25277a.this.f61741t != null) {
                            C25277a.this.f61741t.mo88405a();
                            C25277a.this.f61741t = null;
                        }
                    }
                } catch (Exception unused) {
                    if (C25277a.this.f61723b && !C25277a.this.f61724c) {
                        C25277a.this.f61724c = true;
                        C25277a.this.mo88392a(str);
                    } else if (C25277a.this.f61723b) {
                        C25277a.this.f61723b = false;
                        if (C25277a.this.f61741t != null) {
                            C25277a.this.f61741t.mo88405a();
                            C25277a.this.f61741t = null;
                        }
                    }
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    public C25277a() {
    }

    /* renamed from: a */
    public void mo88389a() {
        AppbrandContext.getMainHandler().postDelayed(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AnonymousClass13 */

            public void run() {
                if (C25277a.this.f61723b && C25277a.this.f61741t != null) {
                    C25277a.this.f61741t.mo88405a();
                    C25277a.this.f61741t = null;
                    AppBrandLogger.m52828d("ApiShareMessageDirectlyCtrl", "upload img timeout, forward...");
                }
            }
        }, 6000);
    }

    /* renamed from: d */
    public boolean mo88399d() {
        if (!TextUtils.isEmpty(this.f61725d) && this.f61725d.equals("token")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private void m90750g() {
        ShareInfoModel parse = ShareInfoModel.parse(this.mArgs, getAppContext());
        if (parse == null) {
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("shareInfoModel"));
            return;
        }
        parse.channel = this.f61725d;
        parse.withShareTicket = this.f61717B;
        final Dialog c = mo88396c(C67590h.m263073a((int) R.string.microapp_m_generating_share_content));
        if (c != null) {
            c.show();
            this.f61734m = true;
        }
        HostDependManager.getInst().getShareToken(parse, new AbstractC67682e() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AnonymousClass12 */

            @Override // com.tt.option.share.AbstractC67682e
            /* renamed from: a */
            public void mo88407a(String str) {
                Dialog dialog = c;
                if (dialog != null && dialog.isShowing()) {
                    C25277a.this.f61734m = false;
                    c.dismiss();
                }
                C25277a.this.callbackFail(str);
            }

            @Override // com.tt.option.share.AbstractC67682e
            /* renamed from: a */
            public void mo88406a(final ShareInfoModel shareInfoModel) {
                final String str;
                Dialog dialog = c;
                if (dialog != null && dialog.isShowing()) {
                    C25277a.this.f61734m = false;
                    c.dismiss();
                }
                if (TextUtils.isEmpty(shareInfoModel.channel) || !shareInfoModel.channel.equals("video") || !shareInfoModel.isExtraContainVideoPath) {
                    str = C25277a.this.f61725d;
                } else {
                    str = "screen_record";
                }
                HostDependManager.getInst().share(C25277a.this.getAppContext().getCurrentActivity(), shareInfoModel, new AbstractC67684g() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AnonymousClass12.C252801 */

                    @Override // com.tt.option.share.AbstractC67684g
                    /* renamed from: a */
                    public void mo88408a(String str) {
                        C66036d.m258590a(C25277a.this.f61735n, str, C25277a.this.getAppContext());
                        if (TextUtils.isEmpty(str)) {
                            str = ApiCallResultHelper.generateUnknownErrorExtraInfo("onFail");
                        }
                        C25277a.this.callbackFail(str);
                        C25277a.this.mo88395b(shareInfoModel.token);
                    }
                });
                AppbrandApplicationImpl.getInst(C25277a.this.getAppContext()).getForeBackgroundManager().mo231968j();
            }
        });
    }

    @Override // com.tt.frontendapiinterface.ApiHandler
    public void act() {
        AppbrandApplicationImpl.getInst(getAppContext()).registerLifecycleObserver(this.f61721F);
        try {
            JSONObject jSONObject = new JSONObject(this.mArgs);
            AppbrandApplicationImpl.getInst(getAppContext()).registerLifecycleObserver(this.f61721F);
            jSONObject.optString("channel");
            m90746e();
        } catch (JSONException unused) {
            callbackFail(ApiCallResultHelper.generateIllegalArgExtraInfo(this.mArgs));
        }
    }

    /* renamed from: h */
    private C12827e m90751h() {
        C12827e eVar = new C12827e(AppbrandConstant.C65701b.m257612c().mo230147l(), "POST");
        m90744a(eVar);
        eVar.mo48433a("title", (Object) this.f61744w);
        eVar.mo48433a("description", (Object) this.f61745x);
        if (!TextUtils.isEmpty(this.f61722a)) {
            eVar.mo48433a("uri", (Object) this.f61722a);
        }
        eVar.mo48433a(SearchIntents.EXTRA_QUERY, (Object) this.f61726e);
        eVar.mo48433a("channel", (Object) this.f61725d);
        eVar.mo48433a("template_id", (Object) this.f61743v);
        eVar.mo48429a(6000);
        eVar.mo48439c(6000);
        eVar.mo48438b(6000);
        return eVar;
    }

    /* renamed from: i */
    private String m90752i() {
        String str;
        C67531h initParams = AppbrandContext.getInst().getInitParams();
        if (initParams != null) {
            str = initParams.mo234510j();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("ApiShareMessageDirectlyCtrl", "host id is empty");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "host id is empty");
            } catch (JSONException e) {
                AppBrandLogger.stacktrace(6, "ApiShareMessageDirectlyCtrl", e.getStackTrace());
            }
            C67509b.m262587a("mp_start_error", 2003, jSONObject, getAppContext());
        }
        return str;
    }

    /* renamed from: b */
    public void mo88394b() {
        Dialog c = mo88396c(C67590h.m263073a((int) R.string.microapp_m_generating_publish_content));
        this.f61719D = c;
        if (c != null) {
            c.setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AnonymousClass14 */

                public void onCancel(DialogInterface dialogInterface) {
                    if (C25277a.this.f61731j != null && !C25277a.this.f61731j.isCanceled()) {
                        C25277a.this.f61731j.cancel();
                    }
                    if (C25277a.this.f61732k != null && !C25277a.this.f61732k.isCanceled()) {
                        C25277a.this.f61732k.cancel();
                    }
                    C25277a.this.mo88398d("分享失败, 请稍后重试");
                    C66036d.m258588a(C25277a.this.f61727f, C25277a.this.f61735n, C25277a.this.f61736o, "cancel", (String) null, C25277a.this.mo88399d(), C25277a.this.getAppContext());
                }
            });
            this.f61719D.show();
            this.f61734m = true;
        }
    }

    /* renamed from: c */
    public void mo88397c() {
        this.f61722a = null;
        this.f61723b = false;
        this.f61724c = false;
        this.f61716A = null;
        this.f61744w = null;
        this.f61746y = null;
        this.f61745x = null;
        this.f61747z = null;
        this.f61726e = null;
        this.f61727f = null;
        this.f61728g = false;
        this.f61731j = null;
        this.f61732k = null;
        this.f61719D = null;
        this.f61740s = null;
        this.f61739r = null;
        this.f61741t = null;
    }

    /* renamed from: e */
    private void m90746e() {
        String str;
        if (!m90748f()) {
            this.f61735n = "inside";
            JSONObject a = new C67587d(this.mArgs).mo234784a();
            this.f61725d = a.optString("channel");
            this.f61717B = a.optBoolean("withShareTicket", true);
            this.f61743v = a.optString("templateId");
            this.f61716A = a.optString("path");
            this.f61744w = a.optString("title");
            this.f61746y = a.optString("imageUrl");
            this.f61745x = a.optString("desc");
            this.f61747z = a.optString(SearchIntents.EXTRA_QUERY);
            if (C67432a.m262319a(getAppContext()).getAppInfo().isGame()) {
                str = this.f61747z;
            } else {
                str = this.f61716A;
            }
            this.f61726e = str;
            AppBrandLogger.m52828d("ApiShareMessageDirectlyCtrl", "jsonObject ", a.toString());
            if (TextUtils.isEmpty(this.f61725d) || this.f61725d.equals("token")) {
                C66036d.m258593a(this.f61735n, mo88399d(), getAppContext());
                m90747f(this.f61746y);
                m90742a(getAppContext().getCurrentActivity());
                return;
            }
            m90750g();
        }
    }

    /* renamed from: f */
    private boolean m90748f() {
        final String str;
        AbstractC67678b.AbstractC67679a obtainShareInfoCallback = HostDependManager.getInst().obtainShareInfoCallback();
        if (obtainShareInfoCallback != null) {
            this.f61735n = "top";
            try {
                JSONObject jSONObject = new JSONObject(this.mArgs);
                jSONObject.put("entryPath", AppbrandApplicationImpl.getInst(getAppContext()).getAppConfig().f165497d);
                this.f61725d = jSONObject.optString("channel");
                this.f61717B = jSONObject.optBoolean("withShareTicket", true);
                this.f61743v = jSONObject.optString("templateId");
                ShareInfoModel parse = ShareInfoModel.parse(this.mArgs, getAppContext());
                if (parse == null) {
                    return false;
                }
                if (TextUtils.isEmpty(this.f61725d) || !this.f61725d.equals("video") || !parse.isExtraContainVideoPath) {
                    str = this.f61725d;
                } else {
                    str = "screen_record";
                }
                obtainShareInfoCallback.mo231837a(jSONObject.toString(), new AbstractC67684g() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252867 */

                    @Override // com.tt.option.share.AbstractC67684g
                    /* renamed from: a */
                    public void mo88408a(String str) {
                        C66036d.m258590a(C25277a.this.f61735n, str, C25277a.this.getAppContext());
                        if (TextUtils.isEmpty(str)) {
                            str = ApiCallResultHelper.generateUnknownErrorExtraInfo("onFail");
                        }
                        C25277a.this.callbackFail(str);
                        ShareInfoModel obtainShareInfo = HostDependManager.getInst().obtainShareInfo();
                        if (obtainShareInfo != null) {
                            C25277a.this.mo88395b(obtainShareInfo.token);
                        }
                    }
                });
                return true;
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiShareMessageDirectlyCtrl", "callbackHostShare", e);
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m90747f(String str) {
        mo88392a(str);
    }

    /* renamed from: d */
    public void mo88398d(final String str) {
        AppbrandContext.getMainHandler().post(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.RunnableC252856 */

            public void run() {
                Activity currentActivity = C25277a.this.getAppContext().getCurrentActivity();
                if (currentActivity != null) {
                    HostDependManager.getInst().showToast(currentActivity, new C67587d().mo234783a("title", str).mo234783a("duration", Integer.valueOf((int) ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED)).mo234784a().toString(), str, 1000, null);
                }
            }
        });
    }

    /* renamed from: a */
    private void m90742a(Activity activity) {
        ShareInfoModel parse = ShareInfoModel.parse(this.mArgs, getAppContext());
        if (parse == null) {
            callbackFail(ApiCallResultHelper.generateDataNullExtraInfo("shareInfoModel"));
            return;
        }
        parse.channel = this.f61725d;
        parse.withShareTicket = this.f61717B;
        C252878 r0 = new AbstractC67683f() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252878 */
        };
        if (!mo88399d() || !HostDependManager.getInst().isHostOptionShareDialogDependEnable()) {
            m90743a(activity, r0);
        } else {
            m90745b(activity, r0);
        }
    }

    /* renamed from: c */
    public Dialog mo88396c(String str) {
        Activity currentActivity = getAppContext().getCurrentActivity();
        if (currentActivity == null || currentActivity.isFinishing()) {
            return null;
        }
        Dialog loadingDialog = HostDependManager.getInst().getLoadingDialog(currentActivity, str);
        if (loadingDialog != null) {
            loadingDialog.setCancelable(true);
            loadingDialog.setCanceledOnTouchOutside(false);
        }
        return loadingDialog;
    }

    /* renamed from: a */
    private void m90744a(C12827e eVar) {
        eVar.mo48433a("host_id", Integer.valueOf(Integer.parseInt(m90752i())));
        eVar.mo48433a("app_id", C67432a.m262319a(getAppContext()).getAppInfo().appId);
        eVar.mo48433a("os", "android");
        eVar.mo48433a("did", C67657c.m263250a());
        String a = C66612a.m260219a(C67432a.m262319a(getAppContext()).getAppInfo().appId);
        if (!TextUtils.isEmpty(a)) {
            eVar.mo48433a("session", (Object) a);
        }
    }

    /* renamed from: g */
    private C12827e m90749g(String str) {
        C12827e eVar = new C12827e(AppbrandConstant.C65701b.m257612c().mo230144i(), "POST");
        eVar.mo48433a("host_id", (Object) m90752i());
        eVar.mo48433a("app_id", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appId);
        eVar.mo48433a("os", (Object) "android");
        eVar.mo48433a("did", (Object) C67657c.m263250a());
        if (str.startsWith("http")) {
            eVar.mo48433a("image_url", (Object) str);
        } else {
            String c = getApiDependency().mo235044c(str);
            File file = new File(c);
            if (!getApiDependency().mo235035a(file) || !file.exists()) {
                return null;
            }
            File file2 = new File(mo88400e(c));
            if (!getApiDependency().mo235035a(file2) || !file2.exists()) {
                file2 = new File(c);
            }
            eVar.mo48432a("image_file", file2, "image/*");
        }
        eVar.mo48429a(6000);
        eVar.mo48439c(6000);
        eVar.mo48438b(6000);
        return eVar;
    }

    /* renamed from: b */
    public void mo88395b(String str) {
        if (!TextUtils.isEmpty(str)) {
            final C12827e eVar = new C12827e(AppbrandConstant.C65701b.m257612c().mo230136B(), "POST");
            m90744a(eVar);
            eVar.mo48433a("share_token", (Object) str);
            Observable.create(new Action() {
                /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252834 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
                public void act() {
                    AppBrandLogger.m52828d("ApiShareMessageDirectlyCtrl", "clean useless share");
                    C12830f doPostBody = HostDependManager.getInst().doPostBody(eVar, C25277a.this.getAppContext());
                    if (TextUtils.isEmpty(doPostBody.mo48466d())) {
                        AppBrandLogger.m52828d("ApiShareMessageDirectlyCtrl", "cleanUselessShare fail,response data " + doPostBody.mo48466d());
                        return;
                    }
                    try {
                        String optString = new JSONObject(doPostBody.mo48466d()).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).optString(UpdateKey.STATUS);
                        if (TextUtils.equals("success", optString)) {
                            AppBrandLogger.m52828d("ApiShareMessageDirectlyCtrl", "cleanUselessShare success");
                            return;
                        }
                        AppBrandLogger.m52828d("ApiShareMessageDirectlyCtrl", "cleanUselessShare fail, " + optString);
                    } catch (JSONException e) {
                        AppBrandLogger.m52828d("ApiShareMessageDirectlyCtrl", "", e);
                    }
                }
            }).schudleOn(Schedulers.longIO()).subscribeSimple();
        }
    }

    /* renamed from: a */
    public Map mo88388a(ShareInfoModel shareInfoModel) {
        C12827e g;
        C12830f postMultiPart;
        String str = shareInfoModel.queryString;
        String str2 = shareInfoModel.title;
        String str3 = shareInfoModel.desc;
        String str4 = shareInfoModel.imageUrl;
        String str5 = shareInfoModel.linkTitle;
        this.f61743v = shareInfoModel.templateId;
        String str6 = shareInfoModel.extra;
        if (!TextUtils.isEmpty(str6)) {
            try {
                this.f61718C = new JSONObject(str6).optString("alias_id");
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        HashMap hashMap = new HashMap();
        try {
            if (!(TextUtils.isEmpty(str4) || (g = m90749g(str4)) == null || (postMultiPart = HostDependManager.getInst().postMultiPart(g, getAppContext())) == null)) {
                this.f61723b = false;
                if (postMultiPart.mo48466d() != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(postMultiPart.mo48466d());
                        int optInt = jSONObject.optInt("err_no", -1);
                        JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        if (optInt == 0 && optJSONObject != null) {
                            this.f61722a = optJSONObject.optString("uri");
                        }
                    } catch (JSONException e2) {
                        AppBrandLogger.stacktrace(6, "ApiShareMessageDirectlyCtrl", e2.getStackTrace());
                    }
                }
            }
            C12830f doPostBody = HostDependManager.getInst().doPostBody(m90740a(str, str2, str3, str5, this.f61722a, this.f61727f, shareInfoModel.channel), getAppContext());
            if (doPostBody == null) {
                mo88397c();
                return hashMap;
            }
            C66013d a = C66013d.m258505a(doPostBody.mo48466d());
            if (a.f166664a != 0) {
                mo88397c();
                return null;
            }
            hashMap.put("token", a.f166666c.f166667a);
            hashMap.put("imageUrl", a.f166666c.f166671e);
            hashMap.put("miniImageUrl", a.f166666c.f166672f);
            hashMap.put("title", a.f166666c.f166669c);
            hashMap.put("desc", a.f166666c.f166670d);
            hashMap.put("ugUrl", a.f166666c.f166668b);
            if (!TextUtils.isEmpty(a.f166666c.f166673g)) {
                hashMap.put("linkTitle", new JSONObject(a.f166666c.f166673g).optString("link_title"));
            }
            mo88397c();
            return hashMap;
        } catch (Exception e3) {
            AppBrandLogger.stacktrace(6, "ApiShareMessageDirectlyCtrl", e3.getStackTrace());
        }
    }

    /* renamed from: e */
    public String mo88400e(String str) {
        File file = new File(str);
        if (file.length() / 1024 < 200) {
            return str;
        }
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = (int) (20000000 / file.length());
        decodeFile.compress(Bitmap.CompressFormat.JPEG, length, byteArrayOutputStream);
        while (byteArrayOutputStream.toByteArray().length / 1024 > 200 && length > 0) {
            byteArrayOutputStream.reset();
            decodeFile.compress(Bitmap.CompressFormat.JPEG, length, byteArrayOutputStream);
            length -= 10;
        }
        String str2 = file.getAbsoluteFile().getParent() + "/com_" + file.getName();
        try {
            byteArrayOutputStream.writeTo(new FileOutputStream(new File(str2)));
        } catch (Exception e) {
            AppBrandLogger.m52829e("ApiShareMessageDirectlyCtrl", "getCompressImg", e);
        }
        return str2;
    }

    /* renamed from: a */
    public void mo88390a(final AbstractC25290a aVar) {
        final C12827e h = m90751h();
        Observable.create(new Action() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252823 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                int i;
                try {
                    C12830f doPostBody = HostDependManager.getInst().doPostBody(h, C25277a.this.getAppContext());
                    if (doPostBody.mo48466d() == null) {
                        C25277a aVar = C25277a.this;
                        aVar.mo88393a("fail", C67432a.m262319a(aVar.getAppContext()).getAppInfo().appId, "get default share info, response is null");
                        C25277a.this.callbackFail(ApiCallResultHelper.generateTmaNetRequestFailInfo(doPostBody));
                        C25277a.this.mo88398d("分享失败, 请稍后重试");
                        AbstractC25290a aVar2 = aVar;
                        if (aVar2 != null) {
                            aVar2.mo88412a();
                        }
                        C25277a.this.mo88397c();
                        return;
                    }
                    C66013d b = C66013d.m258506b(doPostBody.mo48466d());
                    if (b.f166664a != 0) {
                        C25277a aVar3 = C25277a.this;
                        String str = C67432a.m262319a(aVar3.getAppContext()).getAppInfo().appId;
                        aVar3.mo88393a("fail", str, "response errNo " + b.f166664a);
                        C25277a.this.mo88398d("分享失败, 请稍后重试");
                        C25277a.this.callbackFail(ApiCallResultHelper.generateInnerNetRequestResultErrorInfo(b.f166664a));
                        AbstractC25290a aVar4 = aVar;
                        if (aVar4 != null) {
                            aVar4.mo88412a();
                        }
                        C25277a.this.mo88397c();
                        return;
                    }
                    C66013d.C66014a aVar5 = b.f166666c;
                    ShareInfoModel shareInfoModel = new ShareInfoModel();
                    shareInfoModel.channel = "token";
                    shareInfoModel.title = aVar5.f166669c;
                    shareInfoModel.desc = aVar5.f166670d;
                    shareInfoModel.imageUrl = aVar5.f166671e;
                    shareInfoModel.appInfo = C67432a.m262319a(C25277a.this.getAppContext()).getAppInfo();
                    String str2 = "portrait";
                    if (AppbrandApplicationImpl.getInst(C25277a.this.getAppContext()).getAppConfig() != null) {
                        str2 = AppbrandApplicationImpl.getInst(C25277a.this.getAppContext()).getAppConfig().f165498e;
                    }
                    if (TextUtils.equals(str2, "landscape")) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    shareInfoModel.orientation = i;
                    C25277a.this.mo88393a("success", (String) null, (String) null);
                    AbstractC25290a aVar6 = aVar;
                    if (aVar6 != null) {
                        aVar6.mo88413a(shareInfoModel);
                    }
                    C25277a.this.mo88397c();
                } catch (Exception e) {
                    C25277a aVar7 = C25277a.this;
                    String str3 = C67432a.m262319a(aVar7.getAppContext()).getAppInfo().appId;
                    aVar7.mo88393a("fail", str3, "get share info exception: " + e.toString());
                    C25277a.this.mo88398d("分享失败, 请稍后重试");
                    C25277a.this.callbackFail(e);
                    AbstractC25290a aVar8 = aVar;
                    if (aVar8 != null) {
                        aVar8.mo88412a();
                    }
                    C25277a.this.mo88397c();
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    /* renamed from: a */
    private void m90743a(Activity activity, AbstractC67683f fVar) {
        this.f61740s = new AtomicBoolean(false);
        HostDependManager.getInst().showShareDialog(activity, fVar);
    }

    /* renamed from: b */
    private void m90745b(final Activity activity, final AbstractC67683f fVar) {
        final C252889 r0 = new AbstractC25290a() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252889 */

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AbstractC25290a
            /* renamed from: a */
            public void mo88412a() {
                if (C25277a.this.f61739r != null) {
                    C25277a.this.f61739r.set(true);
                }
                C25277a aVar = C25277a.this;
                aVar.mo88393a("fail", C67432a.m262319a(aVar.getAppContext()).getAppInfo().appId, "showPictureTokenShareDialog fail");
            }

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AbstractC25290a
            /* renamed from: a */
            public void mo88413a(final ShareInfoModel shareInfoModel) {
                AppbrandContext.getMainHandler().post(new Runnable() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252889.RunnableC252891 */

                    public void run() {
                        if (C25277a.this.f61739r != null) {
                            C25277a.this.f61739r.set(true);
                        }
                        HostDependManager.getInst().openShareDialog(activity, shareInfoModel, fVar);
                    }
                });
            }
        };
        this.f61739r = new AtomicBoolean(false);
        AppbrandContext.getMainHandler().postDelayed(new Runnable() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AnonymousClass10 */

            public void run() {
                if (C25277a.this.f61739r != null && !C25277a.this.f61739r.get()) {
                    C25277a.this.mo88394b();
                }
            }
        }, 1000);
        if (!this.f61723b) {
            mo88390a(r0);
            return;
        }
        this.f61741t = new AbstractC25291b() {
            /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AnonymousClass11 */

            @Override // com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.AbstractC25291b
            /* renamed from: a */
            public void mo88405a() {
                C25277a.this.mo88390a(r0);
            }
        };
        mo88389a();
    }

    @Override // com.tt.frontendapiinterface.ApiHandler, com.larksuite.framework.apiplugin.AbstractC25937e
    public boolean handleActivityResult(int i, int i2, Intent intent) {
        return HostDependManager.getInst().handleActivityShareResult(i, i2, intent);
    }

    public C25277a(String str, int i, AbstractC67619e eVar) {
        super(str, i, eVar);
    }

    /* renamed from: a */
    public void mo88391a(C66013d dVar, final String str, String str2) {
        String str3;
        if (dVar.f166666c == null) {
            AppBrandLogger.m52829e("ApiShareMessageDirectlyCtrl", "data == null");
        } else if (!this.f61737p) {
            this.f61738q = true;
            this.f61733l = dVar;
            this.f61729h = str;
            this.f61730i = str2;
        } else {
            ShareInfoModel shareInfoModel = new ShareInfoModel();
            final C66013d.C66014a aVar = dVar.f166666c;
            shareInfoModel.channel = this.f61725d;
            shareInfoModel.withShareTicket = this.f61717B;
            shareInfoModel.title = aVar.f166669c;
            shareInfoModel.imageUrl = aVar.f166671e;
            shareInfoModel.miniImageUrl = aVar.f166672f;
            shareInfoModel.token = aVar.f166667a;
            shareInfoModel.ugUrl = aVar.f166668b;
            shareInfoModel.shareType = str;
            AppInfoEntity appInfo = C67432a.m262319a(getAppContext()).getAppInfo();
            shareInfoModel.queryString = str2;
            shareInfoModel.desc = aVar.f166670d;
            shareInfoModel.appInfo = appInfo;
            shareInfoModel.extra = aVar.f166673g;
            if (AppbrandApplicationImpl.getInst(getAppContext()).getAppConfig() != null) {
                str3 = AppbrandApplicationImpl.getInst(getAppContext()).getAppConfig().f165498e;
            } else {
                str3 = "portrait";
            }
            shareInfoModel.orientation = TextUtils.equals(str3, "landscape") ? 1 : 0;
            if (!this.f61728g) {
                callbackOk();
            }
            Activity currentActivity = getAppContext().getCurrentActivity();
            if (currentActivity != null) {
                HostDependManager.getInst().share(currentActivity, shareInfoModel, new AbstractC67684g() {
                    /* class com.larksuite.component.openplatform.core.plugin.messenger.share.C25277a.C252845 */

                    @Override // com.tt.option.share.AbstractC67684g
                    /* renamed from: a */
                    public void mo88408a(String str) {
                        if (TextUtils.isEmpty(str)) {
                            str = ApiCallResultHelper.generateUnknownErrorExtraInfo("onFail");
                        }
                        C25277a.this.callbackFail(str);
                        C25277a.this.mo88395b(aVar.f166667a);
                        C66036d.m258591a(str, C25277a.this.f61735n, "fail", (String) null, C25277a.this.mo88399d(), C25277a.this.getAppContext());
                    }
                });
                AppbrandApplicationImpl.getInst(getAppContext()).getForeBackgroundManager().mo231968j();
            }
            C66036d.m258592a(str, this.f61735n, mo88399d(), getAppContext());
            AppbrandApplicationImpl.getInst(getAppContext()).ungisterLifecycleObserver(this.f61721F);
        }
    }

    /* renamed from: a */
    private C12827e m90740a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C12827e eVar = new C12827e(AppbrandConstant.C65701b.m257612c().mo230146k(), "POST");
        eVar.mo48433a("host_id", Integer.valueOf(Integer.parseInt(m90752i())));
        eVar.mo48433a("app_id", (Object) C67432a.m262319a(getAppContext()).getAppInfo().appId);
        eVar.mo48433a("title", (Object) str2);
        eVar.mo48433a("description", (Object) str3);
        if (!TextUtils.isEmpty(str5)) {
            eVar.mo48433a("uri", (Object) str5);
        }
        String a = C66612a.m260219a(C67432a.m262319a(getAppContext()).getAppInfo().appId);
        if (!TextUtils.isEmpty(a)) {
            eVar.mo48433a("session", (Object) a);
        }
        eVar.mo48433a("os", (Object) "android");
        eVar.mo48433a("did", (Object) C67657c.m263250a());
        eVar.mo48433a(SearchIntents.EXTRA_QUERY, (Object) str);
        eVar.mo48433a("share_channel", (Object) str6);
        eVar.mo48433a("channel", (Object) str7);
        eVar.mo48433a("template_id", (Object) this.f61743v);
        if (!TextUtils.isEmpty(str4)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("link_title", str4);
                eVar.mo48433a("share_extra", jSONObject);
            } catch (JSONException e) {
                AppBrandLogger.m52829e("ApiShareMessageDirectlyCtrl", "getShareInfoTmaRequest", e);
            }
        }
        long j = 6000 - (this.f61720E - this.f61736o);
        if (j < 3000) {
            j = 3000;
        }
        eVar.mo48429a(j);
        eVar.mo48439c(j);
        eVar.mo48438b(j);
        return eVar;
    }
}
