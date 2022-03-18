package com.ss.android.lark.passport.infra.watcher;

import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTrace;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.passport.infra.d.c */
public final class WatcherHelper {

    /* renamed from: a */
    public static final WatcherHelper f123334a = new WatcherHelper();

    /* renamed from: a */
    public static final void m193664a(UniContext uniContext, OPMonitorCode oPMonitorCode) {
        m193666a(uniContext, oPMonitorCode, null, 4, null);
    }

    /* renamed from: b */
    public static final C49114b m193667b(UniContext uniContext, OPMonitorCode oPMonitorCode) {
        return m193669b(uniContext, oPMonitorCode, null, 4, null);
    }

    private WatcherHelper() {
    }

    /* renamed from: a */
    public static final OPTrace m193663a() {
        return WatcherTraceHelper.f123335a.mo171432a().subTrace();
    }

    /* renamed from: a */
    public static final OPMonitor m193661a(OPMonitor oPMonitor) {
        String str;
        User user;
        Intrinsics.checkParameterIsNotNull(oPMonitor, "opMonitor");
        if (ServiceFinder.m193748c().isLogin()) {
            str = "login";
        } else {
            str = "logout";
        }
        oPMonitor.addCategoryValue("env", ServiceFinder.m193749d().getHostEnv().userUnit).addCategoryValue("device_id", ServiceFinder.m193762q().getDeviceId()).addCategoryValue("login_status", str);
        IUserService e = ServiceFinder.m193750e();
        if (e != null) {
            user = e.mo171597e();
        } else {
            user = null;
        }
        if (user != null) {
            String str2 = user.userId;
            if (str2 != null) {
                oPMonitor.addCategoryValue("user_id", str2);
            }
            String tenantId = user.getTenantId();
            if (tenantId != null) {
                oPMonitor.addCategoryValue("tenant_id", tenantId);
            }
        }
        return oPMonitor;
    }

    /* renamed from: a */
    private final OPMonitor m193662a(OPMonitor oPMonitor, UniContext uniContext) {
        OPMonitor addCategoryValue = oPMonitor.addCategoryValue("uni_trace_id", uniContext.getTraceId());
        String monitorScene = uniContext.getMonitorScene();
        if (monitorScene == null) {
            monitorScene = "";
        }
        addCategoryValue.addCategoryValue("monitor_scene", monitorScene);
        if (uniContext.getOPTraceScene() != null) {
            oPMonitor.tracing(uniContext.getOPTraceScene());
        }
        if (uniContext.getOneSceneMonitorParams() != null) {
            oPMonitor.addMap(uniContext.getOneSceneMonitorParams());
        }
        return oPMonitor;
    }

    /* renamed from: a */
    public static final void m193665a(UniContext uniContext, OPMonitorCode oPMonitorCode, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(oPMonitorCode, "monitorCode");
        C49114b b = m193669b(uniContext, oPMonitorCode, null, 4, null);
        if (map != null) {
            b.addMap(map);
        }
        b.mo171429b();
    }

    /* renamed from: b */
    public static final C49114b m193668b(UniContext uniContext, OPMonitorCode oPMonitorCode, Map<String, ? extends Object> map) {
        Intrinsics.checkParameterIsNotNull(oPMonitorCode, "monitorCode");
        C49114b bVar = new C49114b(oPMonitorCode);
        if (uniContext == null) {
            uniContext = WatcherUniContext.f123348l.mo171434b();
        }
        f123334a.m193662a(bVar, uniContext);
        if (map != null) {
            bVar.addMap(map);
        }
        return bVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C49114b m193669b(UniContext uniContext, OPMonitorCode oPMonitorCode, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        return m193668b(uniContext, oPMonitorCode, map);
    }

    /* renamed from: a */
    public static /* synthetic */ void m193666a(UniContext uniContext, OPMonitorCode oPMonitorCode, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        m193665a(uniContext, oPMonitorCode, map);
    }
}
