package com.bytedance.ee.larkwebview.monitor.webview;

import android.text.TextUtils;
import com.bytedance.ee.larkwebview.monitor.dependency.IMonitorDependency;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.opmonitor.api.AbstractC48906d;
import com.ss.android.lark.opmonitor.api.AbstractC48907e;
import com.ss.android.lark.opmonitor.api.AbstractC48908f;
import com.ss.android.lark.opmonitor.model.C48919b;
import com.ss.android.lark.opmonitor.model.OPMonitorCode;
import com.ss.android.lark.opmonitor.model.OPMonitorLogLevel;
import com.ss.android.lark.opmonitor.service.C48924d;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B'\b\u0007\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R \u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r\u0018\u00010\fX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/BaseMonitor;", "Lcom/ss/android/lark/opmonitor/service/OPMonitor;", "serviceInterface", "Lcom/ss/android/lark/opmonitor/api/OPMonitorServiceInterface;", "code", "Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;", "(Lcom/ss/android/lark/opmonitor/api/OPMonitorServiceInterface;Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;)V", "service", "name", "", "(Lcom/ss/android/lark/opmonitor/api/OPMonitorServiceInterface;Ljava/lang/String;Lcom/ss/android/lark/opmonitor/model/OPMonitorCode;)V", "commonParams", "", "", "getCommonParams", "()Ljava/util/Map;", "flush", "", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.monitor.webview.a */
public abstract class BaseMonitor extends OPMonitor {

    /* renamed from: a */
    public static final Companion f35433a = new Companion(null);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<String, Object> mo49854a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/larkwebview/monitor/webview/BaseMonitor$Companion;", "", "()V", "TAG", "", "logInterface", "Lcom/ss/android/lark/opmonitor/api/OPMonitorLogInterface;", "getLogInterface", "()Lcom/ss/android/lark/opmonitor/api/OPMonitorLogInterface;", "getMonitorConfig", "Lcom/ss/android/lark/opmonitor/model/OPMonitorServiceConfig;", "monitorDependency", "Lcom/bytedance/ee/larkwebview/monitor/dependency/IMonitorDependency;", "getReportInterface", "Lcom/ss/android/lark/opmonitor/api/OPMonitorReportInterface;", "dependency", "getService", "Lcom/ss/android/lark/opmonitor/service/OPMonitorService;", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.monitor.webview.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        private final AbstractC48906d m54631a() {
            return C13444b.f35435a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        private final AbstractC48907e m54633c(IMonitorDependency aVar) {
            return new C13443a(aVar);
        }

        /* renamed from: a */
        public final C48924d mo49856a(IMonitorDependency aVar) {
            C48924d dVar = new C48924d();
            dVar.mo170861b(m54632b(aVar));
            return dVar;
        }

        /* renamed from: b */
        private final C48919b m54632b(IMonitorDependency aVar) {
            Companion aVar2 = this;
            return new C48919b(aVar2.m54633c(aVar), aVar2.m54631a());
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032F\u0010\u0005\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u00062F\u0010\b\u001aB\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007 \u0004* \u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "name", "", "kotlin.jvm.PlatformType", "metrics", "Ljava/util/HashMap;", "", "categories", "report"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkwebview.monitor.webview.a$a$a */
        public static final class C13443a implements AbstractC48907e {

            /* renamed from: a */
            final /* synthetic */ IMonitorDependency f35434a;

            C13443a(IMonitorDependency aVar) {
                this.f35434a = aVar;
            }

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48907e
            public final void report(String str, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
                HashMap hashMap3 = new HashMap();
                if (hashMap != null) {
                    HashMap<String, Object> hashMap4 = hashMap;
                    if (!hashMap4.isEmpty()) {
                        hashMap3.putAll(hashMap4);
                    }
                }
                if (hashMap2 != null) {
                    HashMap<String, Object> hashMap5 = hashMap2;
                    if (!hashMap5.isEmpty()) {
                        hashMap3.putAll(hashMap5);
                    }
                }
                HashMap hashMap6 = hashMap3;
                if (!hashMap6.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(hashMap6);
                    IMonitorDependency aVar = this.f35434a;
                    if (aVar != null) {
                        Intrinsics.checkExpressionValueIsNotNull(str, "name");
                        aVar.mo49729a(str, jSONObject);
                        return;
                    }
                    return;
                }
                Log.m165383e("BaseMonitor", "eventName = " + str + " , but eventData is null so return");
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u000e\u0010\b\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\f"}, d2 = {"<anonymous>", "", "level", "Lcom/ss/android/lark/opmonitor/model/OPMonitorLogLevel;", "kotlin.jvm.PlatformType", "tag", "", "filePath", "func", "line", "", "content", "log"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.bytedance.ee.larkwebview.monitor.webview.a$a$b */
        public static final class C13444b implements AbstractC48906d {

            /* renamed from: a */
            public static final C13444b f35435a = new C13444b();

            C13444b() {
            }

            @Override // com.ss.android.lark.opmonitor.api.AbstractC48906d
            public final void log(OPMonitorLogLevel oPMonitorLogLevel, String str, String str2, String str3, int i, String str4) {
                StringBuilder sb = new StringBuilder();
                if (!TextUtils.isEmpty(str2)) {
                    sb.append("filePath: ");
                    sb.append(str2);
                    sb.append(", ");
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb.append("func: ");
                    sb.append(str3);
                    sb.append(", ");
                }
                if (i > 0) {
                    sb.append("line: ");
                    sb.append(i);
                    sb.append(", ");
                }
                sb.append(str4);
                if (oPMonitorLogLevel != null) {
                    int i2 = C13445b.f35436a[oPMonitorLogLevel.ordinal()];
                    if (i2 == 1) {
                        Log.m165379d(str, sb.toString());
                        return;
                    } else if (i2 == 2) {
                        Log.m165389i(str, sb.toString());
                        return;
                    } else if (i2 == 3) {
                        Log.m165397w(str, sb.toString());
                        return;
                    } else if (i2 == 4) {
                        Log.m165383e(str, sb.toString());
                        return;
                    }
                }
                Log.m165383e(str, sb.toString());
            }
        }
    }

    @Override // com.ss.android.lark.opmonitor.service.OPMonitor
    public synchronized void flush() {
        Map<String, Object> a = mo49854a();
        if (a != null && (!a.isEmpty())) {
            addMap(a);
        }
        super.flush();
    }

    public BaseMonitor(AbstractC48908f fVar, String str, OPMonitorCode oPMonitorCode) {
        super(fVar, str, oPMonitorCode);
    }
}
