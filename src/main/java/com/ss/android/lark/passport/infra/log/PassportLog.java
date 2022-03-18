package com.ss.android.lark.passport.infra.log;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.p2069j.p2070a.C40633aa;
import com.ss.android.lark.passport.infra.config.PassportConfigCenter;
import com.ss.android.lark.passport.infra.model.ClientBizConfigData;
import com.ss.android.lark.passport.infra.model.IResponseModel;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ0\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rJ<\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\r2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\"\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J0\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rJ\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\"\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J0\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\"\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J0\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/PassportLog;", "", "code", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "(Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;)V", "getCode", "()Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", C63690d.f160779a, "", "eventName", "", "msg", "params", "", "doLog", "level", "", "e", "tr", "", "h5", "logLevel", "i", "isStandardEventName", "", "w", "Companion", "LogLevel", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PassportLog {

    /* renamed from: a */
    public static final PassportLog f123349a;

    /* renamed from: b */
    public static final ThreadLocal<Integer> f123350b = new ThreadLocal<>();

    /* renamed from: c */
    public static final Companion f123351c = new Companion(null);

    /* renamed from: d */
    private final OPMonitorCode f123352d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/PassportLog$LogLevel;", "", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.RUNTIME)
    public @interface LogLevel {
        public static final Companion Companion = Companion.f123353a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/PassportLog$LogLevel$Companion;", "", "()V", "DEBUG", "", "ERROR", "FATAL", "INFO", "TRACE", "WARN", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.log.PassportLog$LogLevel$a */
        public static final class Companion {

            /* renamed from: a */
            static final /* synthetic */ Companion f123353a = new Companion();

            private Companion() {
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final PassportLog m193684a(OPMonitorCode oPMonitorCode) {
        return f123351c.mo171475a(oPMonitorCode);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m193685a(String str, ErrorResult errorResult) {
        return f123351c.mo171476a(str, errorResult);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m193686a(String str, IResponseModel iResponseModel) {
        return f123351c.mo171477a(str, iResponseModel);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m193687a(String str, NetworkErrorResult networkErrorResult) {
        return f123351c.mo171478a(str, networkErrorResult);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\u001a\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001eH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014XT¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/passport/infra/log/PassportLog$Companion;", "", "()V", "Global", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "getGlobal", "()Lcom/ss/android/lark/passport/infra/log/PassportLog;", "TAG", "", "TAG_ACTION", "TAG_H5LOG", "TAG_PAGE", "TAG_REQUEST", "TAG_RUST", "depth", "Ljava/lang/ThreadLocal;", "", "getDepth", "()Ljava/lang/ThreadLocal;", "useALog", "", "msgFrom", "msg", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "response", "Lcom/ss/android/lark/passport/infra/model/IResponseModel;", "Lcom/ss/android/lark/passport/signinsdk_api/base/NetworkErrorResult;", "newLogger", "code", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.log.PassportLog$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final PassportLog mo171474a() {
            return PassportLog.f123349a;
        }

        /* renamed from: b */
        public final ThreadLocal<Integer> mo171479b() {
            return PassportLog.f123350b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final PassportLog mo171475a(OPMonitorCode oPMonitorCode) {
            Intrinsics.checkParameterIsNotNull(oPMonitorCode, "code");
            return new PassportLog(oPMonitorCode);
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo171476a(String str, ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            if (errorResult != null) {
                return new MsgBuilder(str).mo171486b(errorResult.getDebugMsg()).mo171483a(errorResult.getErrorCode()).mo171485a();
            }
            return str + ", ErrorResult is null";
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo171477a(String str, IResponseModel iResponseModel) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            if (iResponseModel != null) {
                return new MsgBuilder(str).mo171486b(iResponseModel.getMessage()).mo171483a(iResponseModel.getCode()).mo171485a();
            }
            return str + ", IResponseModel is null";
        }

        @JvmStatic
        /* renamed from: a */
        public final String mo171478a(String str, NetworkErrorResult networkErrorResult) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            if (networkErrorResult != null) {
                return new MsgBuilder(str).mo171486b(networkErrorResult.getErrorMessage()).mo171483a(networkErrorResult.getErrorCode()).mo171485a();
            }
            return str + ", ErrorResult is null";
        }
    }

    /* renamed from: a */
    public final OPMonitorCode mo171459a() {
        return this.f123352d;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.log.PassportLog$b */
    public static final class RunnableC49117b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f123354a;

        /* renamed from: b */
        final /* synthetic */ Exception f123355b;

        RunnableC49117b(String str, Exception exc) {
            this.f123354a = str;
            this.f123355b = exc;
        }

        public final void run() {
            Log.m165398w("PassportLog", this.f123354a, this.f123355b);
            Log.m165389i("PassportLog", this.f123354a);
        }
    }

    static {
        C40633aa aaVar = C40633aa.f103061a;
        Intrinsics.checkExpressionValueIsNotNull(aaVar, "EPMClientPassportUnivers…de.PASSPORT_UNIVERSAL_LOG");
        f123349a = new PassportLog(aaVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.log.PassportLog$c */
    public static final class RunnableC49118c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PassportLog f123356a;

        /* renamed from: b */
        final /* synthetic */ Map f123357b;

        /* renamed from: c */
        final /* synthetic */ String f123358c;

        /* renamed from: d */
        final /* synthetic */ int f123359d;

        RunnableC49118c(PassportLog passportLog, Map map, String str, int i) {
            this.f123356a = passportLog;
            this.f123357b = map;
            this.f123358c = str;
            this.f123359d = i;
        }

        public final void run() {
            PassportLog.f123351c.mo171479b().set(1);
            MonitorUtil.m193713a(this.f123356a.mo171459a(), this.f123357b).addCategoryValue("msg", this.f123358c).addCategoryValue("log_level", Integer.valueOf(this.f123359d)).flush();
            PassportLog.f123351c.mo171479b().set(0);
        }
    }

    public PassportLog(OPMonitorCode oPMonitorCode) {
        Intrinsics.checkParameterIsNotNull(oPMonitorCode, "code");
        this.f123352d = oPMonitorCode;
    }

    /* renamed from: b */
    public final void mo171464b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, "", null, 4);
    }

    /* renamed from: c */
    public final boolean mo171470c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        if (StringsKt.startsWith$default(str, "n_page", false, 2, (Object) null) || StringsKt.startsWith$default(str, "n_action", false, 2, (Object) null) || StringsKt.startsWith$default(str, "n_net", false, 2, (Object) null) || StringsKt.startsWith$default(str, "r_action", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo171460a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, "", null, 2);
    }

    /* renamed from: c */
    public final void mo171468c(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, null, 3);
    }

    /* renamed from: d */
    public final void mo171471d(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, null, 4);
    }

    /* renamed from: b */
    public final void mo171465b(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, null, 2);
    }

    /* renamed from: e */
    public final void mo171473e(String str, String str2) {
        int i = 2;
        if (str != null) {
            switch (str.hashCode()) {
                case 2251950:
                    str.equals("INFO");
                    break;
                case 2656902:
                    if (str.equals("WARN")) {
                        i = 3;
                        break;
                    }
                    break;
                case 64921139:
                    if (str.equals("DEBUG")) {
                        i = 1;
                        break;
                    }
                    break;
                case 66247144:
                    if (str.equals("ERROR")) {
                        i = 4;
                        break;
                    }
                    break;
            }
        }
        m193688a("H5Log", str2, null, i);
    }

    /* renamed from: a */
    public final void mo171461a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, null, 1);
    }

    /* renamed from: c */
    public final void mo171469c(String str, String str2, Map<String, Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, map, 3);
    }

    /* renamed from: d */
    public final void mo171472d(String str, String str2, Map<String, Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, map, 4);
    }

    /* renamed from: b */
    public final void mo171466b(String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2 + ' ' + th, null, 2);
    }

    /* renamed from: b */
    public final void mo171467b(String str, String str2, Map<String, Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, map, 2);
    }

    /* renamed from: a */
    public final void mo171462a(String str, String str2, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2 + ' ' + th, null, 4);
    }

    /* renamed from: a */
    public final void mo171463a(String str, String str2, Map<String, Object> map) {
        Intrinsics.checkParameterIsNotNull(str, "eventName");
        m193688a(str, str2, map, 1);
    }

    /* renamed from: a */
    private final void m193688a(String str, String str2, Map<String, Object> map, @LogLevel int i) {
        boolean z;
        String str3 = str + ": " + str2;
        ClientBizConfigData clientBizConfigData = PassportConfigCenter.f123034a.mo171113d().clientBizConfigList;
        int i2 = 0;
        if (clientBizConfigData != null) {
            z = clientBizConfigData.logByOPMonitor;
        } else {
            z = false;
        }
        if (!z || !mo171470c(str)) {
            if (map == null) {
                map = new LinkedHashMap();
            }
            if (i == 1) {
                Log.m165379d("PassportLog", str3 + " params:" + map);
            } else if (i == 2) {
                Log.m165389i("PassportLog", str3 + " params:" + map);
            } else if (i == 3) {
                Log.m165397w("PassportLog", str3 + " params:" + map);
            } else if (i == 4) {
                Log.m165383e("PassportLog", str3 + " params:" + map);
            }
        } else if (1 == i) {
            if (map == null) {
                map = new LinkedHashMap();
            }
            Log.m165379d("PassportLog", str3 + " params:" + map);
        } else {
            Integer num = f123350b.get();
            if (num != null) {
                i2 = num.intValue();
            }
            if (i2 > 0) {
                CoreThreadPool.getBackgroundHandler().post(new RunnableC49117b(str3, new Exception("depthValue > 0")));
                return;
            }
            CoreThreadPool.getBackgroundHandler().post(new RunnableC49118c(this, map, str3, i));
        }
    }
}
