package com.tt.miniapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.ref.impl.host.HostExtensionManager;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.ProcessIntentConfig;
import com.larksuite.suite.R;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.preload.C52224b;
import com.ss.android.lark.preload.PreloadTarget;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.C66020b;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66437h;
import com.tt.miniapp.manager.C66452l;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapp.p3279e.C66004a;
import com.tt.miniapp.p3293h.C66194c;
import com.tt.miniapp.process.info.C66643a;
import com.tt.miniapp.process.info.api.ISandboxEnvInfo;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.process.p3316a.C66613b;
import com.tt.miniapp.settings.v2.handler.C66771f;
import com.tt.miniapp.settings.v2.model.ConfigSchemaParameterList;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67467b;
import com.tt.miniapphost.C67475d;
import com.tt.miniapphost.C67548h;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.appbase.C67466a;
import com.tt.miniapphost.appbase.IAppbrandSupport;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.DisableStateEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3368b.AbstractC67469b;
import com.tt.miniapphost.p3371e.C67509b;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.AppbrandUtil;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.p3256b.AbstractC65679a;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.AbstractC67796c;
import com.tt.refer.common.util.C67866g;
import com.tt.refer.impl.business.api.diagnose.entity.C67892a;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public class AppbrandOpenImpl implements IAppbrandSupport {
    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public boolean isSDKSupport() {
        try {
            return C67467b.m262425b().mo234216a(0);
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_AppbrandOpenImpl", e);
            return false;
        }
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public void preloadEmptyProcess() {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            iAppSandboxEnvProcessor.preloadEmptySandboxEnv();
        }
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public void switchLang(Locale locale) {
        AppbrandUtil.setLanguage(locale);
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public boolean isSDKSupport(Context context) {
        return isSDKSupport();
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public String getTmaJssdkVersion(IAppContext iAppContext) {
        try {
            return C66399c.m259608a().mo231922b(AppbrandContext.getInst().getApplicationContext(), iAppContext);
        } catch (Exception e) {
            AppBrandLogger.m52829e("tma_AppbrandOpenImpl", e);
            return "";
        }
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public boolean openShortcut(Intent intent) {
        if (intent == null) {
            AppBrandLogger.m52829e("tma_AppbrandOpenImpl", "shortcut intent is null");
            return false;
        }
        Uri data = intent.getData();
        if (data == null) {
            AppBrandLogger.m52829e("tma_AppbrandOpenImpl", "shortcut intent data null");
            return false;
        }
        String uri = data.toString();
        if (TextUtils.isEmpty(uri)) {
            AppBrandLogger.m52829e("tma_AppbrandOpenImpl", "shortcut intent schemaStr null");
            return false;
        }
        openAppbrand(new C67466a(uri));
        return true;
    }

    private Uri appendQueryParameterFromSettings(Uri uri) {
        List<ConfigSchemaParameterList.C66815b> list;
        ConfigSchemaParameterList b = C66771f.m260614a().mo232677b();
        ArrayList arrayList = new ArrayList();
        if (b == null || b.configAppList == null || b.configAppList.size() <= 0) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        String queryParameter = uri.getQueryParameter("app_id");
        String str = null;
        boolean z = false;
        for (int i = 0; i < b.configAppList.size(); i++) {
            ConfigSchemaParameterList.C66814a aVar = b.configAppList.get(i);
            if (!(aVar == null || (list = aVar.f168549b) == null || !queryParameter.equals(aVar.f168548a))) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    String str2 = list.get(i2).f168550a;
                    String str3 = list.get(i2).f168551b;
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !arrayList.contains(str2)) {
                        if ("least_version".equals(str2)) {
                            boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.leastversioncheck.enable");
                            String a = C66375a.m259516a(uri);
                            if (featureGating && (TextUtils.isEmpty(a) || (!TextUtils.isEmpty(a) && C66375a.m259526b(str3, a)))) {
                                arrayList.add(str2);
                                str = str3;
                                z = true;
                            }
                        } else if (TextUtils.isEmpty(uri.getQueryParameter(str2))) {
                            buildUpon.appendQueryParameter(str2, str3);
                            arrayList.add(str2);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        Uri build = buildUpon.build();
        if (!z) {
            return build;
        }
        Uri.Builder buildUpon2 = Uri.parse(removeParam(String.valueOf(build), "least_version")).buildUpon();
        buildUpon2.appendQueryParameter("least_version", str);
        return buildUpon2.build();
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public void openAppbrand(C67466a aVar) {
        int i;
        long j;
        Throwable th;
        Throwable th2;
        String a = aVar.mo234204a();
        AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "openAppbrand scheme == ", a);
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        AbstractC67433a i2 = C67448a.m262353a().mo234190i();
        if (!i2.mo234162b()) {
            if (DebugUtil.debug()) {
                Toast.makeText(applicationContext, "没有初始化完成，【测试弹窗】", 0).show();
            }
            AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "openAppbrand context null");
            new C67500a(C67501b.f170234b, i2).setResultTypeFail().addCategoryValue("url", a).setErrorMessage("applicationContext is not init").flush();
        } else if (TextUtils.isEmpty(a)) {
            C66194c.m259171a(applicationContext, ErrorCode.MAIN.SCHEME_NULL_ERROR.getCode(), i2);
            new C67500a(C67501b.f170244l, i2).setResultTypeFail().setErrorMessage("schema is empty").flush();
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("mp_open_app_schema_timestamp", System.currentTimeMillis());
            bundle.putLong("mp_open_app_schema_cputime", SystemClock.elapsedRealtime());
            for (Map.Entry<String, Serializable> entry : aVar.mo234206b().entrySet()) {
                if (entry.getValue() != null) {
                    bundle.putSerializable(entry.getKey(), entry.getValue());
                }
            }
            long currentMillis = TimeMeter.currentMillis();
            Uri parse = Uri.parse(a);
            long entranceClickTimestamp = getEntranceClickTimestamp(parse, currentMillis);
            bundle.putLong("entrance_click_timestamp", entranceClickTimestamp);
            String host = parse.getHost();
            if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
                AbstractC67469b b = C67467b.m262425b();
                if (TextUtils.equals(host, "microapp")) {
                    i = 1;
                } else {
                    i = 2;
                }
                DisableStateEntity b2 = b.mo234217b(i);
                if (b2 != null) {
                    if (applicationContext == null || TextUtils.isEmpty(a) || !HostDependManager.getInst().handleAppbrandDisablePage(applicationContext, a)) {
                        AppbrandUtil.handleAppbrandDisableState(applicationContext, b2);
                    }
                    OPMonitor addCategoryValue = new C67500a(C67501b.am, i2).setResultTypeFail().addCategoryValue("url", a);
                    addCategoryValue.setErrorMessage("disable: " + b2.getHintMessage()).flush();
                    C66194c.m259174a(ErrorCode.MAIN.DEVICE_BLACK_LIST.getCode(), ErrorCode.MAIN.DEVICE_BLACK_LIST.getDesc(), i2);
                    return;
                }
                String queryParameter = parse.getQueryParameter("app_id");
                if (TextUtils.isEmpty(queryParameter)) {
                    OPMonitor addCategoryValue2 = new C67500a(C67501b.ae, i2).setResultTypeFail().addCategoryValue("url", a);
                    addCategoryValue2.setErrorMessage("app_id is empty: " + queryParameter).flush();
                    C66194c.m259171a(applicationContext, ErrorCode.MAIN.SCHEME_APPID_NULL.getCode(), i2);
                    return;
                }
                try {
                    Uri appendQueryParameterFromSettings = appendQueryParameterFromSettings(parse);
                    AppInfoEntity a2 = C66375a.m259513a(a);
                    AbstractC12887b a3 = C67440a.m262344a(AppType.GadgetAPP, queryParameter);
                    AbstractC67433a b3 = C67448a.m262353a().mo234181b(a3);
                    if (b3 == null) {
                        try {
                            i2.mo234157a(a3);
                            b3 = i2;
                        } catch (Throwable th3) {
                            th = th3;
                            j = entranceClickTimestamp;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "openMiniAppActivity 异常：" + th.toString());
                            } catch (Exception e) {
                                AppBrandLogger.eWithThrowable("tma_AppbrandOpenImpl", "openMiniAppActivity", e);
                            }
                            C67509b.m262587a("mp_start_error", 5000, jSONObject, i2);
                            AppBrandLogger.m52829e("tma_AppbrandOpenImpl", "openMiniAppActivity", th);
                            OPMonitor addCategoryValue3 = new C67500a(C67501b.ax, i2).mo234325a(queryParameter).setResultTypeFail().addCategoryValue("url", a);
                            addCategoryValue3.setErrorMessage("openMiniAppActivity fail: " + th.getMessage()).setError(th).flush();
                            long nowDiff = TimeMeter.nowDiff(j);
                            C67475d.m262459a(queryParameter, (String) null, (String) null, (String) null, false, nowDiff, "fail", "openMiniAppActivity fail scheme:" + a + " error:" + th.getMessage(), (IAppContext) i2);
                            C66194c.m259171a(applicationContext, ErrorCode.MAIN.START_MINI_APP_ERROR.getCode(), i2);
                        }
                    }
                    try {
                        C67448a.m262353a().mo234182b(b3);
                        C66020b.m258531a("mp_entrance_click", a2, b3).mo231092a();
                        AbstractC67796c cVar = (AbstractC67796c) b3.findServiceByInterface(AbstractC67796c.class);
                        if (cVar != null) {
                            try {
                                cVar.mo88673a(GadgetBeanConverter.convertAppInfoEntityToSchemaEntity(a2));
                            } catch (Throwable th4) {
                                th = th4;
                                j = entranceClickTimestamp;
                            }
                        }
                        j = entranceClickTimestamp;
                        try {
                            openMiniAppActivity(applicationContext, a2, appendQueryParameterFromSettings, bundle, b3);
                            C66004a.m258478a(applicationContext, b3, a2.appId);
                        } catch (Throwable th5) {
                            th2 = th5;
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        j = entranceClickTimestamp;
                        th = th2;
                        i2 = b3;
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(ApiHandler.API_CALLBACK_ERRMSG, "openMiniAppActivity 异常：" + th.toString());
                        C67509b.m262587a("mp_start_error", 5000, jSONObject2, i2);
                        AppBrandLogger.m52829e("tma_AppbrandOpenImpl", "openMiniAppActivity", th);
                        OPMonitor addCategoryValue32 = new C67500a(C67501b.ax, i2).mo234325a(queryParameter).setResultTypeFail().addCategoryValue("url", a);
                        addCategoryValue32.setErrorMessage("openMiniAppActivity fail: " + th.getMessage()).setError(th).flush();
                        long nowDiff2 = TimeMeter.nowDiff(j);
                        C67475d.m262459a(queryParameter, (String) null, (String) null, (String) null, false, nowDiff2, "fail", "openMiniAppActivity fail scheme:" + a + " error:" + th.getMessage(), (IAppContext) i2);
                        C66194c.m259171a(applicationContext, ErrorCode.MAIN.START_MINI_APP_ERROR.getCode(), i2);
                    }
                } catch (Throwable th7) {
                    j = entranceClickTimestamp;
                    th = th7;
                    JSONObject jSONObject22 = new JSONObject();
                    jSONObject22.put(ApiHandler.API_CALLBACK_ERRMSG, "openMiniAppActivity 异常：" + th.toString());
                    C67509b.m262587a("mp_start_error", 5000, jSONObject22, i2);
                    AppBrandLogger.m52829e("tma_AppbrandOpenImpl", "openMiniAppActivity", th);
                    OPMonitor addCategoryValue322 = new C67500a(C67501b.ax, i2).mo234325a(queryParameter).setResultTypeFail().addCategoryValue("url", a);
                    addCategoryValue322.setErrorMessage("openMiniAppActivity fail: " + th.getMessage()).setError(th).flush();
                    long nowDiff22 = TimeMeter.nowDiff(j);
                    C67475d.m262459a(queryParameter, (String) null, (String) null, (String) null, false, nowDiff22, "fail", "openMiniAppActivity fail scheme:" + a + " error:" + th.getMessage(), (IAppContext) i2);
                    C66194c.m259171a(applicationContext, ErrorCode.MAIN.START_MINI_APP_ERROR.getCode(), i2);
                }
            } else {
                OPMonitor addCategoryValue4 = new C67500a(C67501b.af, i2).setResultTypeFail().addCategoryValue("url", a);
                addCategoryValue4.setErrorMessage("scheme is not match, invalid host: " + host).flush();
                C66194c.m259171a(applicationContext, ErrorCode.MAIN.SCHEME_NOT_MATCH.getCode(), i2);
            }
        }
    }

    @Override // com.tt.miniapphost.appbase.IAppbrandSupport
    public String getTmaJssdkVersion(Context context, IAppContext iAppContext) {
        return getTmaJssdkVersion(iAppContext);
    }

    private long getEntranceClickTimestamp(Uri uri, long j) {
        if (uri == null) {
            return j;
        }
        String queryParameter = uri.getQueryParameter("entranceClickTs");
        if (TextUtils.isEmpty(queryParameter)) {
            return j;
        }
        try {
            return Long.parseLong(queryParameter);
        } catch (RuntimeException e) {
            AppBrandLogger.eWithThrowable("tma_AppbrandOpenImpl", "load plugin & clickTs err", e);
            return j;
        }
    }

    private String removeParam(String str, String... strArr) {
        for (String str2 : strArr) {
            str = str.replaceAll("&?" + str2 + "=[^&]*", "");
        }
        return str;
    }

    private void checkAndRemoveTaskActivity(Context context, AppInfoEntity appInfoEntity, C66643a aVar) {
        List<ActivityManager.AppTask> appTasks;
        Intent intent;
        ComponentName component;
        boolean featureGating = LarkExtensionManager.getInstance().getExtension().getFeatureGating("openplatform.gadget.enable_check_task");
        AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "enableCheckTask: ", Boolean.valueOf(featureGating));
        if (featureGating && (appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks()) != null) {
            for (ActivityManager.AppTask appTask : appTasks) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (!(taskInfo == null || (component = (intent = taskInfo.baseIntent).getComponent()) == null)) {
                    String className = component.getClassName();
                    Bundle extras = intent.getExtras();
                    if (extras != null) {
                        extras.setClassLoader(getClass().getClassLoader());
                        AppInfoEntity appInfoEntity2 = (AppInfoEntity) extras.getParcelable("microapp_appinfo");
                        if (appInfoEntity2 == null) {
                            AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "not miniApp", ",activity name ", className);
                        } else {
                            AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "appId:", appInfoEntity2.appId, ", activity name ", className);
                            if (appInfoEntity.appId.equals(appInfoEntity2.appId) && !aVar.mo232275c().getName().equals(className)) {
                                AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "found activity with same appId ", className);
                                appTask.finishAndRemoveTask();
                            }
                        }
                    }
                }
            }
        }
    }

    public void uploadOpenMiniAppError(Context context, Throwable th, AppInfoEntity appInfoEntity, Bundle bundle, IAppContext iAppContext) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ApiHandler.API_CALLBACK_ERRMSG, "openMiniAppActivity 异常：" + th.toString());
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("tma_AppbrandOpenImpl", "openMiniAppActivity", e);
        }
        C67509b.m262587a("mp_start_error", 5000, jSONObject, iAppContext);
        AppBrandLogger.eWithThrowable("tma_AppbrandOpenImpl", "openMiniAppActivity", th);
        OPMonitor resultTypeFail = new C67500a(C67501b.ax, iAppContext).mo234324a(appInfoEntity).setResultTypeFail();
        resultTypeFail.setErrorMessage("openMiniAppActivity error: " + th.getMessage()).setError(th).flush();
        C67475d.m262459a(appInfoEntity.appId, appInfoEntity.launchFrom, appInfoEntity.scene, appInfoEntity.subScene, appInfoEntity.isGame(), TimeMeter.nowDiff(bundle.getLong("entrance_click_timestamp")), "fail", "openMiniAppActivity exp", iAppContext);
        C66194c.m259171a(context, ErrorCode.MAIN.START_MINI_APP_ERROR.getCode(), iAppContext);
    }

    private void openMiniAppActivity(final Context context, final AppInfoEntity appInfoEntity, final Uri uri, final Bundle bundle, final AbstractC67433a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "openMiniAppActivity context:", context);
        final IAppSandboxEnvProcessor a = C66645a.m260337a().mo232355a(appInfoEntity.sandBoxEnvType);
        boolean isAppSandBoxEnvExistByAppId = a.isAppSandBoxEnvExistByAppId(context, appInfoEntity.appId);
        if (!TextUtils.isEmpty(uri.getQueryParameter("ws_for_debug"))) {
            z2 = true;
            z = false;
        } else {
            z2 = false;
            z = true;
        }
        boolean b = C25529d.m91153b(context);
        if (C66375a.m259524b(uri) || b) {
            z3 = true;
        } else {
            z3 = false;
        }
        final C66643a launchClass = a.getLaunchClass(context, appInfoEntity, z3, !z2, z2, aVar);
        if (launchClass == null) {
            new C67500a(C67501b.f170233a, aVar).mo234324a(appInfoEntity).addCategoryValue("url", uri.toString()).setResultTypeFail().setErrorMessage("launchInfo is null").flush();
            C67475d.m262459a(appInfoEntity.appId, appInfoEntity.launchFrom, appInfoEntity.scene, appInfoEntity.subScene, appInfoEntity.isGame(), TimeMeter.nowDiff(bundle.getLong("entrance_click_timestamp")), "fail", "launchInfo is null", aVar);
            return;
        }
        ISandboxEnvInfo e = launchClass.mo232277e();
        if (z && isAppSandBoxEnvExistByAppId && e.hasBindSchema()) {
            z = false;
        }
        e.setSchema(uri.toString());
        aVar.mo234160a(e.getSandboxName());
        bundle.putBoolean("is_magic_window", b);
        OPTrace a2 = OPTraceService.m192757a();
        a2.clientDurationTagStart("from_app_launch_start_duration");
        mpAppLaunchStart(e, appInfoEntity, uri, context, a2.getTracingID(), aVar, HostExtensionManager.getInstance().getHostInterface().isAOTTaskRunning());
        AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "appbrandOpenTracing.toString(): " + a2.toString());
        bundle.putParcelable("tracing", (Parcelable) a2.getTracingSpanImpl());
        bundle.putString("trace_id", a2.getTracingID());
        if (!z2) {
            a.finishServiceSticky(context, launchClass.mo232276d(), a2.getTracingID(), aVar, appInfoEntity);
        }
        AbstractC65679a miniAppLifeCycleInstance = HostDependManager.getInst().getMiniAppLifeCycleInstance(aVar);
        if (miniAppLifeCycleInstance != null) {
            miniAppLifeCycleInstance.mo49080a(appInfoEntity.appId, launchClass.mo232273a());
        }
        if (z) {
            doOnMainProcessBeforeColdLaunch(context, launchClass, appInfoEntity, uri.toString(), aVar, a);
        }
        if (!HostDependManager.getInst().getFeatureGating("open.platform.disable.preload.task", false)) {
            C52224b.m202589a().mo178802a(PreloadTarget.MINI_APP, (IGetDataCallback) null);
        }
        C67866g.m264027a(new Runnable() {
            /* class com.tt.miniapp.AppbrandOpenImpl.RunnableC657091 */

            public void run() {
                try {
                    AppbrandOpenImpl.this.startMiniAppActivity(context, uri, launchClass, appInfoEntity, bundle, aVar);
                    a.preloadEmptySandboxEnv(CommonCode.StatusCode.API_CLIENT_EXPIRED, "inner preload process", null, 5000, aVar);
                } catch (Throwable th) {
                    AppbrandOpenImpl.this.uploadOpenMiniAppError(context, th, appInfoEntity, bundle, aVar);
                }
            }
        });
        checkAndRemoveTaskActivity(context, appInfoEntity, launchClass);
        C66452l.m259767a();
    }

    private void doOnMainProcessBeforeColdLaunch(final Context context, final C66643a aVar, final AppInfoEntity appInfoEntity, final String str, IAppContext iAppContext, final IAppSandboxEnvProcessor iAppSandboxEnvProcessor) {
        C67866g.m264025a(new Action() {
            /* class com.tt.miniapp.AppbrandOpenImpl.C657102 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                ISandboxEnvInfo e = aVar.mo232277e();
                iAppSandboxEnvProcessor.startSandboxEnvMonitor(context, e, appInfoEntity.appId);
                try {
                    AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "doOnMainProcessBeforeColdLaunch, prepareLaunch, schema: " + str);
                    C66613b.m260245a(e.getProcessIdentity(), appInfoEntity, str, aVar.mo232277e().getSandboxName());
                } catch (Exception e2) {
                    AppBrandLogger.eWithThrowable("tma_AppbrandOpenImpl", "prepareLaunch error: " + e2.getMessage(), e2);
                }
            }
        }, C67554l.m262725b());
    }

    public void startMiniAppActivity(Context context, Uri uri, C66643a aVar, AppInfoEntity appInfoEntity, Bundle bundle, IAppContext iAppContext) {
        Intent intent = new Intent();
        intent.setClass(context, aVar.mo232275c());
        intent.putExtra("microapp_url", uri.toString());
        intent.putExtra("microapp_appinfo", appInfoEntity);
        intent.putExtra("sandbox_env_name", aVar.mo232277e().getSandboxName());
        intent.putExtra("app_type", appInfoEntity.type);
        ProcessIntentConfig.f64838a.mo93358a(intent, uri.getQueryParameter("scene"));
        if (aVar.mo232274b()) {
            intent.addFlags(67108864);
            if (!aVar.mo232273a()) {
                intent.addFlags(536870912);
            }
        } else if (aVar.mo232273a()) {
            intent.addFlags(32768);
        }
        bundle.putLong("mp_start_activity_timestamp", System.currentTimeMillis());
        bundle.putLong("mp_start_activity_cputime", SystemClock.elapsedRealtime());
        bundle.putParcelableArrayList("dump_list", (ArrayList) C67892a.m264173a().mo235548b());
        intent.putExtra("mp_launch_extra", bundle);
        intent.addFlags(268435456);
        AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "startMiniAppActivity context:", context);
        HostDependManager.getInst().preHandleIntent(context, intent, 2, -1, null);
        C67548h.mpAppContainerStart(System.currentTimeMillis() - bundle.getLong("mp_open_app_schema_timestamp"), bundle.getString("trace_id"), iAppContext);
        HostDependManager.getInst().startMiniAppActivity(context, intent);
        boolean parseBoolean = Boolean.parseBoolean(uri.getQueryParameter("pluginLoading"));
        if (!(context instanceof Activity)) {
            return;
        }
        if (parseBoolean) {
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            ((Activity) context).overridePendingTransition(R.anim.microapp_i_slide_in_top, R.anim.microapp_i_slide_in_no);
        }
    }

    private void mpAppLaunchStart(ISandboxEnvInfo iSandboxEnvInfo, AppInfoEntity appInfoEntity, Uri uri, Context context, String str, IAppContext iAppContext, boolean z) {
        AppBrandLogger.m52830i("tma_AppbrandOpenImpl", "tracing process: " + iSandboxEnvInfo.getSandboxName() + ", traceId: " + str);
        long processStartTime = AppbrandContext.getInst().getProcessStartTime();
        boolean b = C66437h.m259720b(context, appInfoEntity.appId);
        String tenantId = HostDependManager.getInst().getTenantId();
        String userId = HostDependManager.getInst().getUserId();
        TimeLogger.getInstance(iAppContext).logTimeDuration("mpAppLaunchStart");
        C67548h.mpAppLaunchStart(str, processStartTime, null, null, uri.toString(), null, null, appInfoEntity.startPage, b ? 1 : 0, tenantId, userId, z ? 1 : 0, iAppContext);
    }
}
