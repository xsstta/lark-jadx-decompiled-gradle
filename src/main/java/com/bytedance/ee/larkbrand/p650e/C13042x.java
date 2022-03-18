package com.bytedance.ee.larkbrand.p650e;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ee.appstrategy.OpenAppStrategyDataWrapper;
import com.bytedance.ee.appstrategy.p240a.C4143a;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.utils.C12782a;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.abtest.C12956a;
import com.bytedance.ee.larkbrand.business.update.PreHelper;
import com.bytedance.ee.larkbrand.p649d.C12988a;
import com.bytedance.ee.larkbrand.p654h.C13074b;
import com.bytedance.ee.larkbrand.utils.C13328a;
import com.bytedance.ee.larkbrand.utils.C13374s;
import com.bytedance.ee.larkbrand.utils.C13377u;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.preload.PreloadManager;
import com.tt.miniapp.settings.v2.handler.C66802u;
import com.tt.miniapp.util.C67070z;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3376b.AbstractC67565b;
import com.tt.p3256b.AbstractC65679a;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.e.x */
public class C13042x extends AbstractC65679a {

    /* renamed from: a */
    public IAppContext f34675a;

    /* renamed from: b */
    private boolean f34676b = true;

    /* renamed from: c */
    private int m53514c(int i) {
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    /* renamed from: a */
    public String mo49076a() {
        AppInfoEntity appInfo = C67432a.m262319a(this.f34675a).getAppInfo();
        if (appInfo != null) {
            return appInfo.appId;
        }
        return "-1";
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: e */
    public void mo49085e() {
        AppBrandLogger.m52830i("MiniAppLifeCycle", "MiniAppLifeCycle:", "METHOD_ON_HIDE");
        C13374s.m54391a(mo49076a(), "METHOD_ON_HIDE", -1);
    }

    /* renamed from: g */
    private void m53515g() {
        AppInfoEntity appInfo = C67432a.m262319a(this.f34675a).getAppInfo();
        if (appInfo == null || !"preview".equals(appInfo.versionType)) {
            final long currentTimeMillis = System.currentTimeMillis();
            C13374s.m54387a(mo49076a(), (AbstractC67565b) new AbstractC67565b() {
                /* class com.bytedance.ee.larkbrand.p650e.C13042x.C130442 */

                @Override // com.tt.miniapphost.process.p3376b.AbstractC67565b
                /* renamed from: a */
                public void mo48980a(CrossProcessDataEntity crossProcessDataEntity) {
                    boolean z = true;
                    if (C13042x.this.f34675a == null || C13042x.this.f34675a.isDestroying() || C13042x.this.f34675a.isDestroyed()) {
                        Object[] objArr = new Object[1];
                        StringBuilder sb = new StringBuilder();
                        sb.append("hot load appContext is invalid on ipc callback isNull=");
                        if (C13042x.this.f34675a != null) {
                            z = false;
                        }
                        sb.append(z);
                        objArr[0] = sb.toString();
                        AppBrandLogger.m52831w("MiniAppLifeCycle", objArr);
                    } else if (crossProcessDataEntity != null) {
                        String b = crossProcessDataEntity.mo234744b("hostExternalCheckData");
                        HashMap<String, Serializable> a = C4143a.m17242a(10101, "client.open_platform.gadget.app_strategy.ma", System.currentTimeMillis() - currentTimeMillis, 0, 0, "data is null", C13042x.this.mo49076a(), "ma", true, null);
                        if (TextUtils.isEmpty(b)) {
                            C13328a.m54245a(C13042x.this.f34675a, a);
                            return;
                        }
                        try {
                            OpenAppStrategyDataWrapper a2 = OpenAppStrategyDataWrapper.m17241a(new JSONObject(b));
                            if (a2 != null && !TextUtils.isEmpty(a2.f12591d)) {
                                if (a2.f12592e == null || a2.f12592e.isEmpty()) {
                                    C13328a.m54245a(C13042x.this.f34675a, a);
                                } else {
                                    C13328a.m54245a(C13042x.this.f34675a, a2.f12592e);
                                }
                                C13328a.m54248b(C13042x.this.f34675a.getCurrentActivity(), b, C13042x.this.mo49076a(), new C13328a.AbstractC13334a() {
                                    /* class com.bytedance.ee.larkbrand.p650e.C13042x.C130442.C130451 */

                                    @Override // com.bytedance.ee.larkbrand.utils.C13328a.AbstractC13334a
                                    /* renamed from: a */
                                    public void mo48981a(boolean z) {
                                        boolean z2 = true;
                                        if (C13042x.this.f34675a == null || C13042x.this.f34675a.isDestroying() || C13042x.this.f34675a.isDestroyed()) {
                                            Object[] objArr = new Object[1];
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("hot load appContext is invalid on user action callback isNull=");
                                            if (C13042x.this.f34675a != null) {
                                                z2 = false;
                                            }
                                            sb.append(z2);
                                            objArr[0] = sb.toString();
                                            AppBrandLogger.m52831w("MiniAppLifeCycle", objArr);
                                        } else if (z) {
                                            C67070z.m261391a(C13042x.this.f34675a.getCurrentActivity(), 1, C13042x.this.f34675a);
                                        }
                                    }
                                }, C13042x.this.f34675a);
                                AppBrandLogger.m52830i("MiniAppLifeCycle", "host callback", b);
                            } else if (a2 == null || a2.f12592e == null || a2.f12592e.isEmpty()) {
                                a.put("error_msg", "data wrapper key field null");
                                C13328a.m54245a(C13042x.this.f34675a, a);
                            } else {
                                C13328a.m54245a(C13042x.this.f34675a, a2.f12592e);
                            }
                        } catch (JSONException e) {
                            AppBrandLogger.eWithThrowable("MiniAppLifeCycle", "requestExternalCheck", e);
                            a.put("code", 10100);
                            a.put("error_msg", "mini app container resp to json err");
                            C13328a.m54245a(C13042x.this.f34675a, a);
                        }
                    }
                }
            }, false);
            return;
        }
        AppBrandLogger.m52830i("MiniAppLifeCycle", "do not check preview");
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: b */
    public void mo49081b() {
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.p650e.C13042x.C130431 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                String b = C66802u.m260678a().mo232710b();
                if (!TextUtils.isEmpty(b)) {
                    try {
                        JSONObject jSONObject = new JSONObject(b);
                        if (C13042x.this.f34675a.getAppId() != null && !HostDependManager.getInst().getFeatureGating("openplatform.gadget.prelocation")) {
                            PreHelper.m53347a(C13042x.this.f34675a.getApplicationContext(), C13042x.this.f34675a.getAppId(), jSONObject);
                        }
                        PreHelper.m53349a(jSONObject, C13042x.this.f34675a);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
        AppBrandLogger.m52830i("MiniAppLifeCycle", "MiniAppLifeCycle:", "METHOD_ON_START");
        C13074b.m53604a(this.f34675a);
        C13374s.m54391a(mo49076a(), "METHOD_ON_START", -1);
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: c */
    public void mo49083c() {
        if (this.f34676b) {
            AppBrandLogger.m52830i("MiniAppLifeCycle", "MiniAppLifeCycle:", "METHOD_ON_ENV_READY");
            String a = mo49076a();
            C13374s.m54391a(a, "METHOD_ON_ENV_READY", -1);
            m53513a(a);
            C13074b.m53608b(this.f34675a);
        }
        this.f34676b = false;
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: d */
    public void mo49084d() {
        AppBrandLogger.m52830i("MiniAppLifeCycle", "MiniAppLifeCycle:", "METHOD_ON_SHOW");
        C13374s.m54391a(mo49076a(), "METHOD_ON_SHOW", -1);
        if (!this.f34676b) {
            m53515g();
        }
    }

    public C13042x(IAppContext iAppContext) {
        this.f34675a = iAppContext;
    }

    /* renamed from: a */
    public static C13042x m53512a(IAppContext iAppContext) {
        return C12988a.m53439a(iAppContext).mo48907c();
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: b */
    public void mo49082b(Intent intent) {
        PreloadManager.testActivityOnCreateTime = System.currentTimeMillis();
        C12956a.m53359a().mo48858a(this.f34675a, intent);
        LarkExtensionManager.getInstance().getExtension().onMiniappActivityCreate(intent);
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: a */
    public void mo49078a(Intent intent) {
        LarkExtensionManager.getInstance().getExtension().onMiniappServiceBind(intent);
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: a */
    public void mo49077a(int i) {
        if (i == 3 || i == 4 || i == 5 || i == 6 || i == 7 || i == 8 || i == 11) {
            AppBrandLogger.m52830i("MiniAppLifeCycle", "MiniAppLifeCycle:", "METHOD_ON_FAILURE", "reason:", Integer.valueOf(i));
            C13374s.m54391a(mo49076a(), "METHOD_ON_FAILURE", m53514c(i));
            return;
        }
        AppBrandLogger.m52830i("MiniAppLifeCycle", "MiniAppLifeCycle:", "METHOD_ON_CANCEL", "reason:", Integer.valueOf(i));
        C13374s.m54391a(mo49076a(), "METHOD_ON_CANCEL", i);
    }

    /* renamed from: a */
    private void m53513a(String str) {
        if (AppbrandApplicationImpl.getInst(this.f34675a).getAppInfo() != null) {
            AppInfoEntity appInfo = AppbrandApplicationImpl.getInst(this.f34675a).getAppInfo();
            int b = C12782a.m52836b("meta_hit_times_" + str, 0);
            if (b > 0) {
                C12782a.m52832a("meta_hit_times_" + str, 0);
                AppBrandLogger.m52830i("MiniAppLifeCycle", "clean meta push times:current times:", Integer.valueOf(b));
            }
            int b2 = C12782a.m52836b("one_app_download_times_" + str, 0);
            if (b2 > 0) {
                C12782a.m52832a("one_app_download_times_" + str, 0);
                C13377u.m54416a("preload_clean", str, appInfo.version, b2, this.f34675a);
                AppBrandLogger.m52830i("MiniAppLifeCycle", "clean app download times:current download times:", Integer.valueOf(b2));
            }
            String b3 = C12782a.m52838b("preload_version_" + str, "");
            if (!TextUtils.isEmpty(b3)) {
                AppBrandLogger.m52830i("MiniAppLifeCycle", "preload app version:", b3);
                if (TextUtils.equals(b3, appInfo.version)) {
                    C13377u.m54416a("preload_used", str, appInfo.version, b2, this.f34675a);
                    AppBrandLogger.m52830i("MiniAppLifeCycle", "preload app used. version:", b3);
                }
                C12782a.m52834a("preload_version_" + str, "");
            }
            String b4 = C12782a.m52838b("push_version_" + str, "");
            if (!TextUtils.isEmpty(b4)) {
                AppBrandLogger.m52830i("MiniAppLifeCycle", "push meta version:", b4);
                if (TextUtils.equals(b4, appInfo.version)) {
                    C13377u.m54417a("used", appInfo.appId, b4, this.f34675a);
                    AppBrandLogger.m52830i("MiniAppLifeCycle", "push meta used. version:", b4);
                }
                C12782a.m52834a("push_version_" + str, "");
            }
        }
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: a */
    public void mo49080a(String str, boolean z) {
        LarkExtensionManager.getInstance().getExtension().onOpen(str, z);
    }

    @Override // com.tt.p3256b.AbstractC65679a
    /* renamed from: a */
    public void mo49079a(Intent intent, int i, int i2) {
        if (PreloadManager.testPreloadServiceInitTime == 0) {
            PreloadManager.testPreloadServiceInitTime = System.currentTimeMillis();
        }
        C12956a.m53359a().mo48858a(this.f34675a, intent);
        LarkExtensionManager.getInstance().getExtension().onMiniappServiceStart(intent, i, i2);
    }
}
