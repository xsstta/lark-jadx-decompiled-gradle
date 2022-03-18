package com.ss.android.lark.passport.infra.log;

import android.content.Context;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.ss.android.lark.opmonitor.trace.OPTraceService;
import com.ss.android.lark.passport.infra.base.storage.util.IsolateStorageUtil;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49185d;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import ee.android.framework.manis.C68183b;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0007J\u0012\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u001bH\u0007J*\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\u001f\u001a\u00020\u0004H\u0002J\b\u0010 \u001a\u00020\u0004H\u0007J\u0010\u0010!\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0004H\u0007J\u0012\u0010\"\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0006\u0010#\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/MonitorUtil;", "", "()V", "DEFAULT_CODE", "", "LOGIN_STATUS", "TAG", "UNLOGIN_STATUS", "cp", "curMsgId", "", "curProcessTraceId", "isInMainProcess", "", "mainProcessTraceId", "stepName", "addCommonParams", "", "monitor", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "paramMap", "", "confuseSession", "session", "createOPMonitor", "Lcom/ss/android/lark/passport/infra/log/PassportMonitor;", "monitorCode", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "params", "encryptData", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "getDefaultCp", "getTraceId", "setCP", "setStepName", "updateMsgIdAndTraceId", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.log.b */
public final class MonitorUtil {

    /* renamed from: a */
    public static final MonitorUtil f123364a = new MonitorUtil();

    /* renamed from: b */
    private static String f123365b = null;

    /* renamed from: c */
    private static final String f123366c = f123366c;

    /* renamed from: d */
    private static final String f123367d = f123367d;

    /* renamed from: e */
    private static final String f123368e = f123368e;

    /* renamed from: f */
    private static String f123369f = "";

    /* renamed from: g */
    private static final String f123370g = OPTraceService.m192757a().getTracingID();

    /* renamed from: h */
    private static String f123371h = "";

    /* renamed from: i */
    private static int f123372i;

    /* renamed from: j */
    private static final boolean f123373j = C49224w.m194054b(ServiceFinder.m193748c().getApplicationContext());

    private MonitorUtil() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m193716b() {
        return f123370g;
    }

    /* renamed from: c */
    private final String m193718c() {
        String str;
        if (ServiceFinder.m193748c().isLogin()) {
            str = f123367d;
        } else {
            str = f123368e;
        }
        return str + f123366c + C49185d.m193927b();
    }

    static {
        String str = (String) IsolateStorageUtil.f123196a.mo171255c(MonitorKeys.f123360a);
        if (str == null) {
            str = "";
        }
        f123365b = str;
    }

    /* renamed from: a */
    public final void mo171482a() {
        f123372i = MsgIdUtil.m193726a();
        if (TextUtils.isEmpty(f123371h)) {
            f123371h = f123370g;
        }
    }

    @JvmStatic
    /* renamed from: d */
    public static final void m193720d(String str) {
        if (str == null) {
            str = "";
        }
        f123369f = str;
    }

    @JvmStatic
    /* renamed from: b */
    public static final String m193717b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "session");
        String b = C49160a.m193857b(str);
        Intrinsics.checkExpressionValueIsNotNull(b, "EncryptUtil.confuseSession(session)");
        return b;
    }

    @JvmStatic
    /* renamed from: a */
    public static final PassportMonitor m193712a(OPMonitorCode oPMonitorCode) {
        Intrinsics.checkParameterIsNotNull(oPMonitorCode, "monitorCode");
        PassportMonitor eVar = new PassportMonitor(oPMonitorCode);
        f123364a.m193715a(eVar, (Map<String, Object>) null);
        return eVar;
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m193719c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "cp");
        if (TextUtils.isEmpty(str)) {
            f123365b = "";
        }
        f123365b = str;
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m193714a(String str) {
        if (str == null) {
            return "";
        }
        String a = C49160a.m193855a(str, "EE");
        Intrinsics.checkExpressionValueIsNotNull(a, "EncryptUtil.encryptAsymmetric(data, \"EE\")");
        return a;
    }

    @JvmStatic
    /* renamed from: a */
    public static final PassportMonitor m193713a(OPMonitorCode oPMonitorCode, Map<String, Object> map) {
        Intrinsics.checkParameterIsNotNull(oPMonitorCode, "monitorCode");
        PassportMonitor eVar = new PassportMonitor(oPMonitorCode);
        f123364a.m193715a(eVar, map);
        return eVar;
    }

    /* renamed from: a */
    private final void m193715a(OPMonitor oPMonitor, Map<String, Object> map) {
        String str;
        boolean z;
        String str2;
        String str3;
        if (map == null) {
            map = new HashMap();
        }
        Context applicationContext = ServiceFinder.m193748c().getApplicationContext();
        if (!f123373j) {
            try {
                ILogMonitorService iLogMonitorService = (ILogMonitorService) C68183b.m264839a().mo237086a(applicationContext, ILogMonitorService.class);
                if (iLogMonitorService != null) {
                    Integer msgId = iLogMonitorService.getMsgId();
                    Intrinsics.checkExpressionValueIsNotNull(msgId, "monitorServiceImpl.msgId");
                    f123372i = msgId.intValue();
                    if (TextUtils.isEmpty(f123371h)) {
                        String traceId = iLogMonitorService.getTraceId();
                        Intrinsics.checkExpressionValueIsNotNull(traceId, "monitorServiceImpl.traceId");
                        f123371h = traceId;
                    }
                } else {
                    MonitorUtil bVar = this;
                    f123364a.mo171482a();
                }
            } catch (Throwable th) {
                Log.m165386e("MonitorUtil", th);
                mo171482a();
            }
        } else {
            mo171482a();
        }
        map.put("trace_id", f123371h);
        map.put("step", f123369f);
        HostEnvBean hostEnv = ServiceFinder.m193749d().getHostEnv();
        if (hostEnv == null || (str = hostEnv.userUnit) == null) {
            str = "null";
        }
        map.put("env", str);
        map.put("did", ServiceFinder.m193762q().getDeviceId());
        if (f123365b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = m193714a(m193718c());
        } else {
            str2 = f123365b;
        }
        map.put("cp", str2);
        map.put("msg_id", Integer.valueOf(f123372i));
        User foregroundUser = ServiceFinder.m193744a().getForegroundUser();
        if (foregroundUser != null) {
            str3 = foregroundUser.userId;
        } else {
            str3 = null;
        }
        map.put("uid", String.valueOf(str3));
        oPMonitor.addMap(map);
    }
}
