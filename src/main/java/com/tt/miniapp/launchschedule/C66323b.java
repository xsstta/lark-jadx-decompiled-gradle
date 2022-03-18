package com.tt.miniapp.launchschedule;

import android.util.Log;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.he.jsbinding.snapshot.ISnapshotService;
import com.he.jsbinding.snapshot.SnapshotServiceImpl;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapp.AbstractC66328m;
import com.tt.miniapp.AppbrandApplicationImpl;
import com.tt.miniapp.debug.C65983a;
import com.tt.miniapp.event.C66036d;
import com.tt.miniapp.event.C66037e;
import com.tt.miniapp.event.lark.LarkInnerEventHelper;
import com.tt.miniapp.jsbridge.C66240d;
import com.tt.miniapp.jsbridge.JsRuntimeManager;
import com.tt.miniapp.p3299l.C66284a;
import com.tt.miniapp.util.C67049n;
import com.tt.miniapp.util.MpTimeLineReporter;
import com.tt.miniapp.util.TimeLogger;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.TimeMeter;
import com.tt.refer.common.util.C67866g;

/* renamed from: com.tt.miniapp.launchschedule.b */
public class C66323b extends AbstractC66322a {

    /* renamed from: c */
    public IAppContext f167395c;

    /* renamed from: a */
    public void mo231810a() {
        if (!C66240d.m259242a()) {
            ISnapshotService iSnapshotService = (ISnapshotService) AppbrandApplicationImpl.getInst(this.f167395c).getService(SnapshotServiceImpl.class);
            AppInfoEntity appInfo = C67432a.m262319a(this.f167395c).getAppInfo();
            if (iSnapshotService.needCreateSnapshot(appInfo.version, appInfo.isPreview())) {
                iSnapshotService.startCreatingSnapshot();
            }
        }
    }

    @Override // com.tt.miniapp.launchschedule.AbstractC66322a
    /* renamed from: a */
    public void mo231807a(final AbstractC66328m mVar) {
        final MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(this.f167395c).getService(MpTimeLineReporter.class);
        mpTimeLineReporter.addPoint("begin_load_app-service");
        ((JsRuntimeManager) AppbrandApplicationImpl.getInst(this.f167395c).getService(JsRuntimeManager.class)).getCurrentRuntime().loadMainJs(new AbstractC66328m() {
            /* class com.tt.miniapp.launchschedule.C66323b.C663241 */

            /* renamed from: a */
            TimeMeter f167396a;

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87263a() {
                mpTimeLineReporter.addPoint("before_load_app-service");
                LarkInnerEventHelper.mpJsCoreAppLoadStart(C66323b.this.f167395c);
                C66037e.m258610a(C66323b.this.f167395c).mo231116a("cp_js_loading");
                TimeLogger.getInstance(C66323b.this.f167395c).logTimeDuration("JsTMARuntime_startLoadAppServiceJs");
                this.f167396a = TimeMeter.newAndStart();
                mVar.mo87263a();
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: b */
            public void mo87265b() {
                mpTimeLineReporter.addPoint("after_load_app-service");
                TimeLogger.getInstance(C66323b.this.f167395c).logTimeDuration("JsTMARuntime_loadAppServiceSuccess");
                C66036d.m258599b("success", TimeMeter.stop(this.f167396a), "", C66323b.this.f167395c);
                LarkInnerEventHelper.mpJsCoreAppLoadResult("success", null, 0, null, null, C66323b.this.f167395c);
                C66037e.m258610a(C66323b.this.f167395c).mo231121d();
                C66037e.m258610a(C66323b.this.f167395c).mo231116a("rendering");
                AppbrandApplicationImpl.getInst(C66323b.this.f167395c).onJsCoreReady();
                AppbrandApplicationImpl.getInst(C66323b.this.f167395c).onMainJsLoadCompleted();
                C67049n.m261317d(C66323b.this.f167395c);
                C67866g.m264027a(new Runnable() {
                    /* class com.tt.miniapp.launchschedule.C66323b.C663241.RunnableC663251 */

                    public void run() {
                        C66284a.m259350a(AppbrandContext.getInst().getApplicationContext(), C66323b.this.f167395c);
                    }
                });
                mVar.mo87265b();
                C66323b.this.mo231810a();
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87264a(Exception exc) {
                C66036d.m258599b("fail", TimeMeter.stop(this.f167396a), Log.getStackTraceString(exc), C66323b.this.f167395c);
                OPMonitor resultTypeFail = new C67500a("mp_jscore_app_load_result", C67501b.f170243k, C66323b.this.f167395c).setResultTypeFail();
                resultTypeFail.setErrorMessage("loadMainJs error: " + exc.getMessage()).setError(exc).flush();
                AppBrandLogger.m52828d("falcon", "loadMainJs evalException");
                TimeLogger.getInstance(C66323b.this.f167395c).logError("JsTMARuntime_loadAppServiceError", Log.getStackTraceString(exc));
                mVar.mo87264a(exc);
            }
        });
    }

    @Override // com.tt.miniapp.launchschedule.AbstractC66322a
    /* renamed from: a */
    public void mo231809a(AppInfoEntity appInfoEntity) {
        if (!C65983a.m258415a().f166555e) {
            JsRuntimeManager jsRuntimeManager = (JsRuntimeManager) this.f167394b.getService(JsRuntimeManager.class);
            jsRuntimeManager.initTMARuntime(AppbrandContext.getInst().getApplicationContext());
            if (jsRuntimeManager.isRuntimePreloaded()) {
                LaunchScheduler.preInitSnapshotEngine(this.f167395c, appInfoEntity);
            }
        }
    }

    @Override // com.tt.miniapp.launchschedule.AbstractC66322a
    /* renamed from: a */
    public void mo231808a(final AbstractC66328m mVar, final String str) {
        final MpTimeLineReporter mpTimeLineReporter = (MpTimeLineReporter) AppbrandApplicationImpl.getInst(this.f167395c).getService(MpTimeLineReporter.class);
        mpTimeLineReporter.addPoint("begin_load_" + str + "/app-service");
        ((JsRuntimeManager) AppbrandApplicationImpl.getInst(this.f167395c).getService(JsRuntimeManager.class)).getCurrentRuntime().loadSubPackageMainJs(new AbstractC66328m() {
            /* class com.tt.miniapp.launchschedule.C66323b.C663262 */

            /* renamed from: a */
            TimeMeter f167401a;

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87263a() {
                MpTimeLineReporter mpTimeLineReporter = mpTimeLineReporter;
                mpTimeLineReporter.addPoint("before_load_" + str + "/app-service");
                LarkInnerEventHelper.mpJsCoreAppLoadStart(C66323b.this.f167395c);
                C66037e.m258610a(C66323b.this.f167395c).mo231116a("cp_js_loading");
                TimeLogger.getInstance(C66323b.this.f167395c).logTimeDuration("JsTMARuntime_startLoadAppServiceJs");
                this.f167401a = TimeMeter.newAndStart();
                mVar.mo87263a();
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: b */
            public void mo87265b() {
                MpTimeLineReporter mpTimeLineReporter = mpTimeLineReporter;
                mpTimeLineReporter.addPoint("after_load_" + str + "/app-service");
                TimeLogger.getInstance(C66323b.this.f167395c).logTimeDuration("JsTMARuntime_loadAppServiceSuccess");
                C66036d.m258599b("success", TimeMeter.stop(this.f167401a), "", C66323b.this.f167395c);
                LarkInnerEventHelper.mpJsCoreAppLoadResult("success", null, 0, null, null, C66323b.this.f167395c);
                C66037e.m258610a(C66323b.this.f167395c).mo231121d();
                C66037e.m258610a(C66323b.this.f167395c).mo231116a("rendering");
                AppbrandApplicationImpl.getInst(C66323b.this.f167395c).onJsCoreReady();
                AppbrandApplicationImpl.getInst(C66323b.this.f167395c).onMainJsLoadCompleted();
                C67866g.m264027a(new Runnable() {
                    /* class com.tt.miniapp.launchschedule.C66323b.C663262.RunnableC663271 */

                    public void run() {
                        C66284a.m259350a(AppbrandContext.getInst().getApplicationContext(), C66323b.this.f167395c);
                    }
                });
                ((LaunchScheduler) C66323b.this.f167394b.getService(LaunchScheduler.class)).mAlreadyAppServiceLoadedList.add(str);
                mVar.mo87265b();
            }

            @Override // com.tt.miniapp.AbstractC66328m
            /* renamed from: a */
            public void mo87264a(Exception exc) {
                C66036d.m258599b("fail", TimeMeter.stop(this.f167401a), Log.getStackTraceString(exc), C66323b.this.f167395c);
                OPMonitor resultTypeFail = new C67500a("mp_jscore_app_load_result", C67501b.f170243k, C66323b.this.f167395c).setResultTypeFail();
                resultTypeFail.setErrorMessage("loadSubPackageMainJs error: " + exc.getMessage()).setError(exc).flush();
                AppBrandLogger.m52828d("falcon", "loadSubPackageMainJs evalException");
                TimeLogger.getInstance(C66323b.this.f167395c).logError("JsTMARuntime_loadAppServiceError", Log.getStackTraceString(exc));
                mVar.mo87264a(exc);
            }
        }, str);
    }

    C66323b(LaunchScheduler launchScheduler, AppbrandApplicationImpl appbrandApplicationImpl, IAppContext iAppContext) {
        super(launchScheduler, appbrandApplicationImpl);
        this.f167395c = iAppContext;
    }
}
