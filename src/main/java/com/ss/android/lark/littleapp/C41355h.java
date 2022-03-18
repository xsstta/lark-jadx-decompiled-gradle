package com.ss.android.lark.littleapp;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.foundation.utils.IMonitorCreator;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12887b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tt.miniapp.errorcode.ErrorCode;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.manager.C66375a;
import com.tt.miniapp.manager.C66467o;
import com.tt.miniapp.process.manager.C66645a;
import com.tt.miniapp.process.manager.IAppSandboxEnvProcessor;
import com.tt.miniapp.settings.v2.handler.C66802u;
import com.tt.miniapp.util.C67053q;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67554l;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3363a.AbstractC67433a;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.process.C67556a;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.util.DebugUtil;
import com.tt.miniapphost.util.KotlinIOUtil;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.meta.IAppMetaService;
import com.tt.refer.common.pkg.IPkgDownloadInstallListener;
import com.tt.refer.common.pkg.IPkgMgrService;
import com.tt.refer.common.pkg.PackageEntity;
import com.tt.refer.impl.business.meta.GadgetAppInfo;
import com.tt.refer.impl.business.meta.GadgetBeanConverter;
import com.tt.refer.impl.business.meta.GadgetMonitorCreator;
import com.tt.refer.impl.business.meta.GadgetSchema;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.littleapp.h */
public class C41355h {

    /* renamed from: a */
    private HandlerThread f105177a;

    /* renamed from: b */
    private Handler f105178b;

    /* renamed from: c */
    private C41364b f105179c;

    /* renamed from: d */
    private Map<String, C41363a> f105180d;

    /* renamed from: e */
    private final LinkedList<C41363a> f105181e;

    /* renamed from: f */
    private final LinkedList<C41363a> f105182f;

    /* renamed from: g */
    private final AtomicBoolean f105183g;

    /* renamed from: h */
    private long f105184h;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.h$d */
    public static class C41366d {

        /* renamed from: a */
        public static C41355h f105223a = new C41355h();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.h$g */
    public enum EnumC41369g {
        UPDATE_SUCCESS,
        REQ_APP_INFO_FAILED,
        APP_INFO_INVALID,
        APP_INFO_VERSION_EMPTY,
        FEATURE_GATING_OFF,
        PRELOAD_FAILED,
        PRELOAD_STOP
    }

    /* renamed from: c */
    public static HandlerThread m163974c(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.h$a */
    public static class C41363a {

        /* renamed from: a */
        String f105205a;

        /* renamed from: b */
        String f105206b;

        /* renamed from: c */
        long f105207c;

        /* renamed from: d */
        boolean f105208d;

        /* renamed from: e */
        boolean f105209e;

        /* renamed from: f */
        boolean f105210f;

        /* renamed from: g */
        int f105211g;

        /* renamed from: h */
        String f105212h;

        /* renamed from: i */
        int f105213i;

        /* renamed from: j */
        int f105214j;

        /* renamed from: k */
        int f105215k;

        /* renamed from: l */
        int f105216l;

        /* renamed from: m */
        String f105217m;

        /* renamed from: n */
        long f105218n;

        private C41363a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public JSONObject mo148974a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("app_id", this.f105205a);
                jSONObject.put("app_version", this.f105206b);
                jSONObject.put("app_version_code", this.f105207c);
                jSONObject.put("need_clear_cache", this.f105208d);
                jSONObject.put("need_update", this.f105209e);
                jSONObject.put("force_update", this.f105210f);
                jSONObject.put("max_update_times", this.f105211g);
                jSONObject.put("strategy_version", this.f105212h);
                jSONObject.put("priority", this.f105213i);
                jSONObject.put("updated_times", this.f105214j);
                return jSONObject;
            } catch (JSONException e) {
                AppBrandLogger.m52829e("LittleAppPreUpdateManager", e.getMessage(), e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.h$b */
    public static class C41364b {

        /* renamed from: a */
        long f105219a;

        /* renamed from: b */
        Map<String, C41363a> f105220b;

        private C41364b() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.h$c */
    public static class C41365c {

        /* renamed from: a */
        String f105221a;

        /* renamed from: b */
        long f105222b;

        private C41365c() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.littleapp.h$f */
    public static class C41368f {

        /* renamed from: a */
        C41363a f105225a;

        /* renamed from: b */
        EnumC41369g f105226b;

        private C41368f() {
        }
    }

    /* renamed from: a */
    public static C41355h m163961a() {
        return C41366d.f105223a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148954a(C41368f fVar) {
        C41364b bVar;
        if (fVar == null || fVar.f105225a == null) {
            m163965a("LittleAppPreUpdateManager", "handleUpdateDone, result: " + fVar);
            return;
        }
        if (!(fVar.f105226b != EnumC41369g.UPDATE_SUCCESS || (bVar = this.f105179c) == null || bVar.f105220b == null)) {
            this.f105179c.f105219a = System.currentTimeMillis();
            C41363a aVar = this.f105179c.f105220b.get(fVar.f105225a.f105205a);
            if (aVar != null) {
                aVar.f105214j++;
                aVar.f105209e = false;
            }
            m163986l();
            m163966a(fVar.f105225a.f105205a, fVar.f105225a.f105206b, fVar.f105225a.f105217m, fVar.f105225a.f105210f, fVar.f105225a.f105212h);
            m163965a("LittleAppPreUpdateManager", "app: " + fVar.f105225a.f105205a + " preload success.");
        }
        if (fVar.f105225a.f105216l == 1) {
            m163962a(0);
        } else if (fVar.f105225a.f105216l == 2) {
            m163971b(m163980f());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148957a(boolean z) {
        m163965a("LittleAppPreUpdateManager", "updateLittleApps, queue size: " + this.f105182f.size());
        this.f105184h = System.currentTimeMillis();
        String b = C66802u.m260678a().mo232710b();
        long j = 600;
        long j2 = 28800;
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONObject jSONObject = new JSONObject(b);
                j = jSONObject.optLong("minTimeSinceLastCheck", 600);
                j2 = jSONObject.optLong("minTimeSinceLastPullUpdateInfo", 28800);
                AppBrandLogger.m52830i("LittleAppPreUpdateManager", "config: ", Long.valueOf(j), ", minTimeSinceLastPullUpdateInfo: ", Long.valueOf(j2));
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LittleAppPreUpdateManager", "handleUpdateLittleApps, parse preload error: " + e.getMessage(), e);
            }
        }
        if (z) {
            if (System.currentTimeMillis() - C12782a.m52837b("last_pull_update_list_time", 0L) > j2 * 1000) {
                m163987m();
            }
        }
        if (System.currentTimeMillis() - C12782a.m52837b("last_check_pending_update_time", 0L) > j * 1000) {
            boolean j3 = m163984j();
            if (!this.f105183g.get()) {
                this.f105183g.set(true);
            }
            C41364b bVar = this.f105179c;
            if (bVar != null && bVar.f105220b != null) {
                for (String str : this.f105179c.f105220b.keySet()) {
                    C41363a aVar = this.f105179c.f105220b.get(str);
                    if (aVar.f105209e && (j3 || m163978d(aVar.f105205a))) {
                        aVar.f105216l = 2;
                        this.f105182f.add(aVar);
                    }
                }
                m163965a("LittleAppPreUpdateManager", "updateLittleApps, new queue size: " + this.f105182f.size());
                if (this.f105182f.size() > 1) {
                    Collections.sort(this.f105182f, new Comparator<C41363a>() {
                        /* class com.ss.android.lark.littleapp.C41355h.C413594 */

                        /* renamed from: a */
                        public int compare(C41363a aVar, C41363a aVar2) {
                            if (aVar.f105213i > aVar2.f105213i) {
                                return -1;
                            }
                            if (aVar.f105213i < aVar2.f105213i) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                }
                if (this.f105182f.size() > 0) {
                    m163971b(0);
                } else {
                    this.f105183g.set(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo148953a(C41363a aVar) {
        if (!aVar.f105210f && !aVar.f105209e) {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "appId: " + aVar.f105205a + " forceUpdate: " + aVar.f105210f + ", needUpdate: " + aVar.f105209e);
        }
        AbstractC12887b a = C67440a.m262344a(AppType.GadgetAPP, aVar.f105205a);
        AbstractC67433a b = C67448a.m262353a().mo234181b(a);
        if (b == null) {
            b = C67448a.m262353a().mo234192k();
        }
        if (b == null) {
            b = C67448a.m262353a().mo234190i();
            b.mo234157a(a);
        }
        if (b.getApplicationContext() == null) {
            AppBrandLogger.m52829e("LittleAppPreUpdateManager", "application context is null");
            return;
        }
        C13377u.m54417a("keeped", aVar.f105205a, aVar.f105206b, b);
        C13377u.m54416a("preload_check", aVar.f105205a, aVar.f105206b, aVar.f105214j, b);
        if (!m163973b(aVar, b)) {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "appId: " + aVar.f105205a + " no need to update.");
            return;
        }
        m163963a(b, aVar);
        if (m163972b(aVar)) {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "LittleAppPreUpdateManager new request meta!");
            m163964a(aVar, b);
        }
    }

    /* renamed from: a */
    public void mo148952a(final Context context, final AppInfoEntity appInfoEntity, final C41363a aVar, final IAppContext iAppContext, final IMonitorCreator iMonitorCreator, final TimeMeter timeMeter) {
        if (iAppContext == null) {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "appContext is null");
            return;
        }
        final IPkgMgrService iPkgMgrService = (IPkgMgrService) iAppContext.findServiceByInterface(IPkgMgrService.class);
        final PackageEntity convertAppInfoEntityToPackageEntity = GadgetBeanConverter.convertAppInfoEntityToPackageEntity(appInfoEntity, iAppContext);
        iPkgMgrService.downloadAndInstallPackage(iAppContext.getApplicationContext(), convertAppInfoEntityToPackageEntity, 2, new IPkgDownloadInstallListener() {
            /* class com.ss.android.lark.littleapp.C41355h.C413616 */

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloadSuccess(int i, boolean z) {
                AppBrandLogger.m52830i("LittleAppPreUpdateManager", "onDownloadSuccess:requestType:", Integer.valueOf(i), "fromLocal:", Boolean.valueOf(z));
                ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo235256a(context, appInfoEntity.appId, appInfoEntity.version);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onDownloading(int i, float f) {
                if (DebugUtil.debug()) {
                    AppBrandLogger.m52830i("LittleAppPreUpdateManager", "onDownloading:", "requestType:", Integer.valueOf(i), "progress:", Float.valueOf(f));
                }
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onFailed(int i, String str, String str2) {
                AppBrandLogger.m52829e("LittleAppPreUpdateManager", "preload fail appid:", appInfoEntity.appId, "version:", appInfoEntity.version, "code", str, "errMsg:", str2);
                LarkInnerEventHelper.mpInstallUpdateResult(iMonitorCreator, appInfoEntity.appId, 2, false, TimeMeter.stop(timeMeter), str, str2, 0);
                C41368f fVar = new C41368f();
                fVar.f105226b = EnumC41369g.PRELOAD_FAILED;
                fVar.f105225a = aVar;
                C41355h.this.mo148959b(fVar);
            }

            @Override // com.tt.refer.common.pkg.IPkgDownloadInstallListener
            public void onInstallPkgSuccess(int i, String str, String str2) {
                C12782a.m52832a("app_download_times_one_day", C12782a.m52836b("app_download_times_one_day", 0) + 1);
                AppBrandLogger.m52830i("LittleAppPreUpdateManager", "preload success appid:" + appInfoEntity.appId + "version:" + appInfoEntity.version);
                C13377u.m54416a("preload_success", appInfoEntity.appId, appInfoEntity.version, aVar.f105214j + 1, iAppContext);
                LarkInnerEventHelper.mpInstallUpdateResult(iMonitorCreator, appInfoEntity.appId, 2, true, TimeMeter.stop(timeMeter), null, null, 1);
                C41368f fVar = new C41368f();
                fVar.f105226b = EnumC41369g.UPDATE_SUCCESS;
                fVar.f105225a = aVar;
                C41355h.this.mo148959b(fVar);
                if (HostDependManager.getInst().getFeatureGating("openplatform.gadget.package_preload.delete_older_version", false)) {
                    AppBrandLogger.m52830i("LittleAppPreUpdateManager", "enable delete old_version");
                    if (!C41355h.this.mo148962b(context)) {
                        AppBrandLogger.m52830i("LittleAppPreUpdateManager", "unInstallOtherVersionPackage packageEntity: " + convertAppInfoEntityToPackageEntity.toString());
                        iPkgMgrService.unInstallOtherVersionPackage(context, convertAppInfoEntityToPackageEntity);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo148956a(String str, int i, String str2) {
        C41363a put;
        C41363a b = m163969b(str, i, str2);
        if (b != null) {
            this.f105178b.removeMessages(2);
            synchronized (this.f105180d) {
                put = this.f105180d.put(str, b);
            }
            m163965a("LittleAppPreUpdateManager", "appId: " + str + " received new push, old: " + put);
            this.f105178b.sendEmptyMessageDelayed(2, 10000);
        }
    }

    /* renamed from: a */
    public void mo148955a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f105178b.obtainMessage(7, str).sendToTarget();
        }
    }

    /* renamed from: d */
    private void m163977d() {
        this.f105178b.sendEmptyMessage(1);
    }

    /* renamed from: g */
    private void m163981g() {
        m163965a("LittleAppPreUpdateManager", "onPushUpdateDone");
    }

    /* renamed from: i */
    private boolean m163983i() {
        return C67053q.m261325a(AppbrandContext.getInst().getApplicationContext());
    }

    /* renamed from: j */
    private boolean m163984j() {
        return C67053q.m261333d(AppbrandContext.getInst().getApplicationContext());
    }

    /* renamed from: k */
    private String m163985k() {
        return C12782a.m52838b("update_info", "");
    }

    /* renamed from: e */
    private void m163979e() {
        if (this.f105179c == null) {
            C41364b bVar = new C41364b();
            this.f105179c = bVar;
            bVar.f105220b = new LinkedHashMap();
        }
    }

    /* renamed from: h */
    private void m163982h() {
        m163965a("LittleAppPreUpdateManager", "onBatchUpdateDone, use time: " + (System.currentTimeMillis() - this.f105184h));
        C12782a.m52833a("last_check_pending_update_time", System.currentTimeMillis());
        this.f105183g.set(false);
    }

    private C41355h() {
        this.f105181e = new LinkedList<>();
        this.f105182f = new LinkedList<>();
        this.f105183g = new AtomicBoolean(false);
        HandlerThread c = m163974c("littleapp-updater");
        this.f105177a = c;
        c.start();
        this.f105178b = new HandlerC41367e(this.f105177a.getLooper());
        this.f105180d = new LinkedHashMap();
        m163977d();
        m163965a("LittleAppPreUpdateManager", "LittleAppPreUpdateManager init done");
    }

    /* renamed from: f */
    private long m163980f() {
        String b = C66802u.m260678a().mo232710b();
        long j = 30;
        if (!TextUtils.isEmpty(b)) {
            try {
                j = new JSONObject(b).optLong("minTimeSinceLastUpdate", 30);
                AppBrandLogger.m52830i("LittleAppPreUpdateManager", "config: ", "minTimeSinceLastUpdate: ", Long.valueOf(j));
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LittleAppPreUpdateManager", "getMinTimeSinceLastUpdate, parse preload error: " + e.getMessage(), e);
            }
        }
        return j * 1000;
    }

    /* renamed from: l */
    private boolean m163986l() {
        int i;
        if (this.f105179c != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("last_update_time", this.f105179c.f105219a);
                if (this.f105179c.f105220b != null) {
                    JSONArray jSONArray = new JSONArray();
                    boolean c = m163976c(this.f105179c.f105219a);
                    for (String str : this.f105179c.f105220b.keySet()) {
                        C41363a aVar = this.f105179c.f105220b.get(str);
                        if (c) {
                            aVar.f105214j = 0;
                        }
                        JSONObject a = aVar.mo148974a();
                        if (a != null) {
                            jSONArray.put(a);
                        }
                    }
                    jSONObject.put("app_list", jSONArray);
                    i = jSONArray.length();
                } else {
                    i = 0;
                }
                C12782a.m52834a("update_info", jSONObject.toString());
                m163965a("LittleAppPreUpdateManager", "save update info success, app size: " + i);
                return true;
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LittleAppPreUpdateManager", e.getMessage(), e);
            }
        }
        return false;
    }

    /* renamed from: m */
    private void m163987m() {
        m163965a("LittleAppPreUpdateManager", "getUpdateAppInfos enter");
        C41364b bVar = this.f105179c;
        if (!(bVar == null || bVar.f105220b == null || this.f105179c.f105220b.isEmpty())) {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            for (String str : this.f105179c.f105220b.keySet()) {
                try {
                    C41363a aVar = this.f105179c.f105220b.get(str);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("app_id", aVar.f105205a);
                    jSONObject2.put("app_version", aVar.f105206b);
                    jSONArray.put(jSONObject2);
                } catch (Exception e) {
                    AppBrandLogger.m52829e("LittleAppPreUpdateManager", "getUpdateAppInfos error: " + e.getMessage(), e);
                    return;
                }
            }
            jSONObject.put("app_info_list", jSONArray);
            if (jSONArray.length() > 0) {
                m163965a("LittleAppPreUpdateManager", "getUpdateAppInfos, appList size: " + jSONArray.length());
                JSONObject b = m163970b(m163975c("/GetUpdateAppInfos", jSONObject.toString()), "getUpdateAppInfos");
                if (b != null) {
                    JSONArray optJSONArray = b.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        AppBrandLogger.m52829e("LittleAppPreUpdateManager", "getUpdateAppInfos, server appList is empty.");
                        return;
                    }
                    m163965a("LittleAppPreUpdateManager", "getUpdateAppInfos, server appList size: " + optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        C41363a a = m163959a(optJSONArray.optJSONObject(i));
                        C41363a aVar2 = this.f105179c.f105220b.get(a.f105205a);
                        if (aVar2 != null) {
                            a.f105214j = aVar2.f105214j;
                        }
                        this.f105179c.f105220b.put(a.f105205a, a);
                    }
                    m163986l();
                    C12782a.m52833a("last_pull_update_list_time", System.currentTimeMillis());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo148963c() {
        ArrayList<C41363a> arrayList;
        synchronized (this.f105180d) {
            arrayList = new ArrayList(this.f105180d.size());
            for (String str : this.f105180d.keySet()) {
                C41363a aVar = this.f105180d.get(str);
                aVar.f105216l = 1;
                arrayList.add(aVar);
            }
            this.f105180d.clear();
        }
        m163965a("LittleAppPreUpdateManager", "update info size: " + arrayList.size());
        if (!arrayList.isEmpty()) {
            C41364b bVar = this.f105179c;
            if (!(bVar == null || bVar.f105220b == null)) {
                for (C41363a aVar2 : arrayList) {
                    C41363a aVar3 = this.f105179c.f105220b.get(aVar2.f105205a);
                    if (aVar3 != null) {
                        aVar2.f105214j = aVar3.f105214j;
                    }
                    this.f105179c.f105220b.put(aVar2.f105205a, aVar2);
                }
                m163986l();
            }
            m163965a("LittleAppPreUpdateManager", "updateMeta, queue size: " + this.f105181e.size());
            this.f105181e.addAll(arrayList);
            m163965a("LittleAppPreUpdateManager", "updateMeta, new queue size: " + this.f105181e.size());
            if (this.f105181e.size() > 0) {
                m163962a(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo148958b() {
        String k = m163985k();
        m163979e();
        if (!TextUtils.isEmpty(k)) {
            try {
                JSONObject jSONObject = new JSONObject(k);
                this.f105179c.f105219a = jSONObject.optLong("last_update_time", 0);
                JSONArray optJSONArray = jSONObject.optJSONArray("app_list");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            C41363a a = m163959a(jSONObject2);
                            this.f105179c.f105220b.put(a.f105205a, a);
                        }
                    }
                }
            } catch (JSONException e) {
                AppBrandLogger.eWithThrowable("LittleAppPreUpdateManager", e.getMessage(), e);
            }
        }
    }

    /* renamed from: a */
    private void m163962a(long j) {
        m163968a(this.f105181e, j);
    }

    /* renamed from: b */
    private void m163971b(long j) {
        m163968a(this.f105182f, j);
    }

    /* renamed from: c */
    private boolean m163976c(long j) {
        if (System.currentTimeMillis() - j > 86400000) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m163978d(String str) {
        return C41392m.m164164b().mo149059a().contains(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo148959b(C41368f fVar) {
        this.f105178b.obtainMessage(3, fVar).sendToTarget();
    }

    /* renamed from: b */
    public void mo148961b(boolean z) {
        this.f105178b.obtainMessage(5, Boolean.valueOf(z)).sendToTarget();
        C67554l.m262725b().execute(new Runnable() {
            /* class com.ss.android.lark.littleapp.C41355h.RunnableC413627 */

            public void run() {
                try {
                    C41355h.this.mo148951a(AppbrandContext.getInst().getApplicationContext());
                } catch (Exception e) {
                    AppBrandLogger.m52829e("LittleAppPreUpdateManager", e);
                }
            }
        });
    }

    /* renamed from: b */
    public boolean mo148962b(Context context) {
        for (IAppSandboxEnvProcessor iAppSandboxEnvProcessor : C66645a.m260337a().mo232359b()) {
            if (iAppSandboxEnvProcessor != null && iAppSandboxEnvProcessor.hasSandboxExist(context)) {
                AppBrandLogger.m52830i("LittleAppPreUpdateManager", "clearNoUseJSSDK,but has sandBox exist....");
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.lark.littleapp.h$e */
    class HandlerC41367e extends Handler {
        public void handleMessage(Message message) {
            if (message != null) {
                int i = message.what;
                if (i == 1) {
                    C41355h.this.mo148958b();
                } else if (i == 2) {
                    C41355h.this.mo148963c();
                } else if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i == 7 && message.obj != null && (message.obj instanceof String)) {
                                C41355h.this.mo148960b((String) message.obj);
                            }
                        } else if (message.obj != null && (message.obj instanceof C41363a)) {
                            C41355h.this.mo148953a((C41363a) message.obj);
                        }
                    } else if (message.obj == null || !(message.obj instanceof Boolean)) {
                        C41355h.this.mo148957a(false);
                    } else {
                        C41355h.this.mo148957a(((Boolean) message.obj).booleanValue());
                    }
                } else if (message.obj != null && (message.obj instanceof C41368f)) {
                    C41355h.this.mo148954a((C41368f) message.obj);
                }
            }
        }

        public HandlerC41367e(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    private C41363a m163959a(JSONObject jSONObject) {
        C41363a aVar = new C41363a();
        aVar.f105205a = jSONObject.optString("app_id");
        aVar.f105206b = jSONObject.optString("app_version");
        aVar.f105207c = jSONObject.optLong("app_version_code", 0);
        aVar.f105208d = jSONObject.optBoolean("need_clear_cache");
        aVar.f105209e = jSONObject.optBoolean("need_update");
        aVar.f105210f = jSONObject.optBoolean("force_update");
        aVar.f105211g = jSONObject.optInt("max_update_times");
        aVar.f105212h = jSONObject.optString("strategy_version");
        aVar.f105213i = jSONObject.optInt("priority");
        aVar.f105214j = jSONObject.optInt("updated_times");
        return aVar;
    }

    /* renamed from: b */
    private boolean m163972b(C41363a aVar) {
        boolean i = m163983i();
        boolean j = m163984j();
        boolean d = m163978d(aVar.f105205a);
        if (!i) {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "appId: " + aVar.f105205a + " isNetworkAvailable: " + i);
            return false;
        } else if (!j && !d) {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "appId: " + aVar.f105205a + ", isWifi: " + j + ", net type: " + C67053q.m261334e(AppbrandContext.getInst().getApplicationContext()) + "in allow list:" + d);
            return false;
        } else if (aVar.f105214j >= aVar.f105211g) {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "appId: " + aVar.f105205a + " updateTimes: " + aVar.f105214j + ", maxUpdateTimes: " + aVar.f105211g);
            return false;
        } else if (aVar.f105205a == null || aVar.f105205a.length() <= 0 || aVar.f105205a.indexOf(File.separatorChar) < 0) {
            String b = C66802u.m260678a().mo232710b();
            int i2 = 15;
            if (!TextUtils.isEmpty(b)) {
                try {
                    i2 = new JSONObject(b).optInt("maxTimesOneDay", 15);
                    AppBrandLogger.m52830i("LittleAppPreUpdateManager", "config: ", "max times one day:", Integer.valueOf(i2));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            int b2 = C12782a.m52836b("app_download_times_one_day", 0);
            if (m163976c(this.f105179c.f105219a)) {
                AppBrandLogger.m52830i("LittleAppPreUpdateManager", "over 24 hours:last time: ", Long.valueOf(this.f105179c.f105219a), "pass time:", Long.valueOf(System.currentTimeMillis() - this.f105179c.f105219a));
                C12782a.m52832a("app_download_times_one_day", 0);
                b2 = 0;
            }
            if (b2 < i2) {
                return true;
            }
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "appId: " + aVar.f105205a + " downloadTimesOneDay: " + b2 + ", maxDownloadTimesOneDay: " + i2);
            return false;
        } else {
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "app_id Illegal");
            return false;
        }
    }

    /* renamed from: a */
    public void mo148951a(Context context) {
        File[] listFiles;
        if (!(!HostDependManager.getInst().getFeatureGating("openplatform.gadget.package_preload.delete_older_version", false) || mo148962b(context) || (listFiles = new File(((AbstractC67722a) C67448a.m262353a().mo234190i().findServiceByInterface(AbstractC67722a.class)).mo235095g(), "download").listFiles(new FileFilter() {
            /* class com.ss.android.lark.littleapp.C41355h.C413561 */

            public boolean accept(File file) {
                return file.isDirectory();
            }
        })) == null)) {
            for (File file : listFiles) {
                File[] listFiles2 = file.listFiles(new FilenameFilter() {
                    /* class com.ss.android.lark.littleapp.C41355h.C413572 */

                    public boolean accept(File file, String str) {
                        return str.contains("_");
                    }
                });
                if (listFiles2 != null && listFiles2.length > 1) {
                    List asList = Arrays.asList(listFiles2);
                    Collections.sort(asList, new Comparator<File>() {
                        /* class com.ss.android.lark.littleapp.C41355h.C413583 */

                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            int i = ((file.lastModified() - file2.lastModified()) > 0 ? 1 : ((file.lastModified() - file2.lastModified()) == 0 ? 0 : -1));
                            if (i > 0) {
                                return -1;
                            }
                            if (i == 0) {
                                return 0;
                            }
                            return 1;
                        }
                    });
                    for (File file2 : asList.subList(1, asList.size())) {
                        AppBrandLogger.m52830i("LittleAppPreUpdateManager", "delete old pkg file " + file2);
                        KotlinIOUtil.m263057b(file2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo148960b(String str) {
        boolean z;
        AbstractC12887b a = C67440a.m262344a(AppType.GadgetAPP, str);
        AbstractC67433a b = C67448a.m262353a().mo234181b(a);
        if (b == null) {
            b = C67448a.m262353a().mo234190i();
            b.mo234157a(a);
        }
        C41365c a2 = m163960a(str, b);
        if (a2 != null) {
            C41364b bVar = this.f105179c;
            boolean z2 = false;
            boolean z3 = true;
            if (bVar == null || bVar.f105220b == null) {
                m163979e();
                C41363a aVar = new C41363a();
                aVar.f105205a = str;
                aVar.f105206b = a2.f105221a;
                aVar.f105207c = a2.f105222b;
                this.f105179c.f105220b.put(str, aVar);
            } else {
                C41363a aVar2 = this.f105179c.f105220b.get(str);
                if (aVar2 != null) {
                    if ((a2.f105221a == null || a2.f105221a.equals(aVar2.f105206b)) && a2.f105222b == aVar2.f105207c) {
                        z = false;
                    } else {
                        aVar2.f105206b = a2.f105221a;
                        aVar2.f105207c = a2.f105222b;
                        z = true;
                    }
                    if (aVar2.f105214j != 0) {
                        aVar2.f105214j = 0;
                        m163965a("LittleAppPreUpdateManager", "clear updated times for: " + str);
                    } else {
                        z3 = z;
                    }
                    z2 = true;
                } else {
                    C41363a aVar3 = new C41363a();
                    aVar3.f105205a = str;
                    aVar3.f105206b = a2.f105221a;
                    aVar3.f105207c = a2.f105222b;
                    this.f105179c.f105220b.put(aVar3.f105205a, aVar3);
                }
            }
            if (z3) {
                m163986l();
            }
            m163967a(str, a2.f105221a, z2);
        }
    }

    /* renamed from: a */
    private static void m163965a(String str, String str2) {
        AppBrandLogger.m52830i(str, str2);
    }

    /* renamed from: a */
    private void m163963a(IAppContext iAppContext, C41363a aVar) {
        if (aVar.f105208d) {
            ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo235257b(iAppContext.getApplicationContext(), new GadgetSchema.C67943Entity(aVar.f105205a));
        }
    }

    /* renamed from: a */
    private C41365c m163960a(String str, IAppContext iAppContext) {
        AppBrandLogger.m52830i("LittleAppPreUpdateManager", "getCachedMetaInfo:new pkg&meta");
        GadgetAppInfo gadgetAppInfo = (GadgetAppInfo) ((IAppMetaService) iAppContext.findServiceByInterface(IAppMetaService.class)).mo50349a(AppbrandContext.getInst().getApplicationContext(), new GadgetSchema.C67943Entity(str));
        if (gadgetAppInfo != null) {
            C41365c cVar = new C41365c();
            cVar.f105221a = gadgetAppInfo.getAppVersion();
            cVar.f105222b = gadgetAppInfo.getVersionCode();
            AppBrandLogger.m52830i("LittleAppPreUpdateManager", "getCachedMetaInfo:cacheMetaInfo:", cVar.f105221a, "appVersionCode:", Long.valueOf(cVar.f105222b));
            return cVar;
        }
        AppBrandLogger.m52830i("LittleAppPreUpdateManager", "getCachedMetaInfo->no cache!");
        return null;
    }

    /* renamed from: b */
    private JSONObject m163970b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AppBrandLogger.m52829e("LittleAppPreUpdateManager", str2 + ", resp is empty.");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("code", -1) != 0) {
                AppBrandLogger.m52829e("LittleAppPreUpdateManager", str2 + ", server error, code: " + jSONObject.optInt("code", -1) + ", msg: " + jSONObject.optString("msg"));
                return null;
            }
            m163965a("LittleAppPreUpdateManager", str2 + " success.");
            return jSONObject;
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("LittleAppPreUpdateManager", str2 + ", json error: " + e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: c */
    private String m163975c(String str, String str2) {
        String str3;
        C66467o.C66470b bVar = null;
        try {
            CrossProcessDataEntity f = C67556a.m262949f();
            if (f != null) {
                bVar = new C66467o.C66470b(f);
            }
            if (bVar != null) {
                if (!TextUtils.isEmpty(bVar.f167782h)) {
                    String str4 = C13047a.C13049b.m53532a() + str;
                    HashMap hashMap = new HashMap();
                    hashMap.put("EENet-Request-Enable-Complex-Connect", Boolean.TRUE.toString());
                    hashMap.put("X-Session-ID", bVar.f167782h);
                    hashMap.put("Content-Type", "application/json");
                    EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
                    if (a != null && !a.mo148730a() && a.mo148731b() == 1) {
                        hashMap.put("domain_alias", "open");
                    }
                    AbstractC67433a k = C67448a.m262353a().mo234192k();
                    if (k == null) {
                        k = C67448a.m262353a().mo234190i();
                    }
                    return C12843b.m53043a(str4, hashMap, str2, k);
                }
            }
            Object[] objArr = new Object[1];
            if (bVar == null) {
                str3 = "userinfo is null";
            } else {
                str3 = "session id is empty";
            }
            objArr[0] = str3;
            AppBrandLogger.m52829e("LittleAppPreUpdateManager", objArr);
            return "";
        } catch (Exception e) {
            AppBrandLogger.eWithThrowable("LittleAppPreUpdateManager", e.getMessage(), e);
            return "";
        }
    }

    /* renamed from: a */
    private void m163964a(final C41363a aVar, final IAppContext iAppContext) {
        String str = aVar.f105205a;
        String str2 = aVar.f105206b;
        C13377u.m54416a("preload_start", str, str2, C12782a.m52836b("one_app_download_times_" + aVar.f105205a, 0), iAppContext);
        AppInfoEntity appInfoEntity = new AppInfoEntity();
        final String str3 = aVar.f105205a;
        appInfoEntity.appId = str3;
        appInfoEntity.setType(1);
        final GadgetMonitorCreator gadgetMonitorCreator = new GadgetMonitorCreator(iAppContext);
        final TimeMeter newAndStart = TimeMeter.newAndStart();
        LarkInnerEventHelper.mpInstallUpdateStart(gadgetMonitorCreator, aVar.f105205a, 2);
        GadgetBeanConverter.requestAppMeta(iAppContext.getApplicationContext(), iAppContext, GadgetBeanConverter.convertAppInfoEntityToSchemaEntity(appInfoEntity), 2, new C66375a.AbstractC66376a() {
            /* class com.ss.android.lark.littleapp.C41355h.C413605 */

            @Override // com.tt.miniapp.manager.C66375a.AbstractC66376a
            /* renamed from: a */
            public void mo148970a(int i, AppInfoEntity appInfoEntity) {
                AppBrandLogger.m52830i("LittleAppPreUpdateManager", "push update meta request success:", str3, "version:", appInfoEntity.version);
                C13377u.m54417a("updated", str3, appInfoEntity.version, iAppContext);
                if (appInfoEntity == null || !TextUtils.isEmpty(appInfoEntity.version)) {
                    C41355h.this.mo148952a(AppbrandContext.getInst().getApplicationContext(), appInfoEntity, aVar, iAppContext, gadgetMonitorCreator, newAndStart);
                    return;
                }
                C41368f fVar = new C41368f();
                fVar.f105226b = EnumC41369g.APP_INFO_VERSION_EMPTY;
                fVar.f105225a = aVar;
                C41355h.this.mo148959b(fVar);
            }

            @Override // com.tt.miniapp.manager.C66375a.AbstractC66376a
            /* renamed from: a */
            public void mo148972a(int i, String str, String str2) {
                AppBrandLogger.m52829e("LittleAppPreUpdateManager", "push update meta request fail:", str3, str2);
                LarkInnerEventHelper.mpInstallUpdateResult(gadgetMonitorCreator, str3, 2, false, TimeMeter.stop(newAndStart), str, str2, 0);
                C41368f fVar = new C41368f();
                fVar.f105226b = EnumC41369g.REQ_APP_INFO_FAILED;
                fVar.f105225a = aVar;
                C41355h.this.mo148959b(fVar);
            }

            @Override // com.tt.miniapp.manager.C66375a.AbstractC66376a
            /* renamed from: a */
            public void mo148971a(int i, AppInfoEntity appInfoEntity, int i2) {
                AppBrandLogger.m52829e("LittleAppPreUpdateManager", "push update meta invalid:", str3, appInfoEntity.version, Integer.valueOf(i2));
                LarkInnerEventHelper.mpInstallUpdateResult(gadgetMonitorCreator, str3, i, false, TimeMeter.stop(newAndStart), ErrorCode.META.META_INVALID.getCode(), ErrorCode.META.META_INVALID.getDesc(), 0);
                C41368f fVar = new C41368f();
                fVar.f105226b = EnumC41369g.APP_INFO_INVALID;
                fVar.f105225a = aVar;
                C41355h.this.mo148959b(fVar);
            }
        });
    }

    /* renamed from: b */
    private boolean m163973b(C41363a aVar, IAppContext iAppContext) {
        C41365c a = m163960a(aVar.f105205a, iAppContext);
        if (a == null) {
            return true;
        }
        String str = a.f105221a;
        long j = a.f105222b;
        m163965a("LittleAppPreUpdateManager", "checkUpdate, cur version: " + str + ", verCode: " + j + ", new version: " + aVar.f105206b + ", newVerCode: " + aVar.f105207c);
        if (aVar.f105207c <= 0 || j <= 0) {
            if (TextUtils.isEmpty(aVar.f105206b) || aVar.f105206b.equals(str)) {
                return false;
            }
            aVar.f105217m = str;
            aVar.f105218n = j;
            return true;
        } else if (aVar.f105207c <= j) {
            return false;
        } else {
            aVar.f105217m = str;
            aVar.f105218n = j;
            return true;
        }
    }

    /* renamed from: a */
    private void m163968a(LinkedList<C41363a> linkedList, long j) {
        if (linkedList == null || linkedList.isEmpty()) {
            m163965a("LittleAppPreUpdateManager", "scheduleRealUpdate, pending queue is empty.");
            if (linkedList == this.f105181e) {
                m163981g();
            } else if (linkedList == this.f105182f) {
                m163982h();
            }
        } else {
            C41363a removeFirst = linkedList.removeFirst();
            if (removeFirst != null) {
                m163965a("LittleAppPreUpdateManager", "Start preload app: " + removeFirst.f105205a);
            } else {
                AppBrandLogger.m52829e("LittleAppPreUpdateManager", "Start preload, UpdateInfo is null.");
            }
            this.f105178b.sendMessageDelayed(this.f105178b.obtainMessage(6, removeFirst), j);
        }
    }

    /* renamed from: b */
    private C41363a m163969b(String str, int i, String str2) {
        try {
            JSONObject jSONObject = new JSONObject(str2);
            C41363a aVar = new C41363a();
            aVar.f105205a = str;
            aVar.f105215k = i;
            aVar.f105210f = jSONObject.optBoolean("force_update", false);
            aVar.f105211g = jSONObject.optInt("max_update_times", 3);
            aVar.f105208d = jSONObject.optBoolean("need_clear_cache", false);
            aVar.f105209e = jSONObject.optBoolean("need_update", true);
            aVar.f105213i = jSONObject.optInt("priority", 0);
            aVar.f105212h = jSONObject.optString("strategy_version", "");
            aVar.f105206b = jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "");
            aVar.f105207c = jSONObject.optLong("app_version_code", 0);
            return aVar;
        } catch (JSONException e) {
            AppBrandLogger.eWithThrowable("LittleAppPreUpdateManager", e.getMessage(), e);
            AppBrandLogger.m52829e("LittleAppPreUpdateManager", "appId: " + str + ", generate update info failed");
            return null;
        }
    }

    /* renamed from: a */
    private void m163967a(String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("app_version", str2);
            jSONObject.put("load_with_cache", z);
            m163970b(m163975c("/UploadAppLoadInfo", jSONObject.toString()), "uploadAppLoadInfo");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m163966a(String str, String str2, String str3, boolean z, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", str);
            jSONObject.put("app_version", str2);
            jSONObject.put("from_app_version", str3);
            jSONObject.put("force_update", z);
            jSONObject.put("strategy_version", str4);
            m163970b(m163975c("/UploadAppInstallInfo", jSONObject.toString()), "uploadAppInstallInfo");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
