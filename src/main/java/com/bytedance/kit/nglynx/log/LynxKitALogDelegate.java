package com.bytedance.kit.nglynx.log;

import android.util.AndroidRuntimeException;
import com.bytedance.ies.bullet.service.base.IMonitorReportService;
import com.bytedance.ies.bullet.service.base.ReportInfo;
import com.bytedance.ies.bullet.service.base.api.IServiceToken;
import com.bytedance.ies.bullet.service.base.api.LogLevel;
import com.lynx.tasm.base.AbstractC26613a;
import com.lynx.tasm.base.LogSource;
import com.ss.android.agilelogger.ALog;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.statistics.p3180a.C63690d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010\u0016\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016J\u001c\u0010\u001e\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010!\u001a\u00020\u0018H\u0016J\u001c\u0010\"\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001c\u0010#\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/bytedance/kit/nglynx/log/LynxKitALogDelegate;", "Lcom/lynx/tasm/base/AbsLogDelegate;", "serviceToken", "Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", "(Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;)V", "aLogEnable", "", "getALogEnable", "()Z", "setALogEnable", "(Z)V", "monitorService", "Lcom/bytedance/ies/bullet/service/base/IMonitorReportService;", "getMonitorService", "()Lcom/bytedance/ies/bullet/service/base/IMonitorReportService;", "getServiceToken", "()Lcom/bytedance/ies/bullet/service/base/api/IServiceToken;", C63690d.f160779a, "", "tag", "", "msg", "e", "getMinimumLoggingLevel", "", "i", "isLoggable", ShareHitPoint.f121868c, "Lcom/lynx/tasm/base/LogSource;", "level", "k", "log", "priority", ShareHitPoint.f121869d, "v", "w", "Companion", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.kit.nglynx.d.a */
public final class LynxKitALogDelegate extends AbstractC26613a {

    /* renamed from: a */
    public static final String f38587a = f38587a;

    /* renamed from: b */
    public static long f38588b;

    /* renamed from: c */
    public static final Companion f38589c = new Companion(null);

    /* renamed from: e */
    private boolean f38590e;

    /* renamed from: f */
    private final IMonitorReportService f38591f;

    /* renamed from: g */
    private final IServiceToken f38592g;

    @Override // com.lynx.tasm.base.AbstractC26613a
    /* renamed from: a */
    public int mo53791a() {
        return 1;
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: b */
    public int mo53794b() {
        return 8;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bytedance/kit/nglynx/log/LynxKitALogDelegate$Companion;", "", "()V", "ALOGREF", "", "getALOGREF", "()J", "setALOGREF", "(J)V", "LYNX_TAG", "", "getLYNX_TAG", "()Ljava/lang/String;", "x-lynx-kit_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.kit.nglynx.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final long mo53800a() {
            return LynxKitALogDelegate.f38588b;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LynxKitALogDelegate(IServiceToken jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "serviceToken");
        this.f38592g = jVar;
        this.f38591f = (IMonitorReportService) jVar.mo52657a(IMonitorReportService.class);
        try {
            f38588b = ALog.getALogSimpleWriteFuncAddr();
            this.f38590e = true;
        } catch (Throwable unused) {
            new AndroidRuntimeException("Just warning log, No ALog dependency found").printStackTrace();
        }
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: a */
    public void mo53792a(String str, String str2) {
        IServiceToken jVar = this.f38592g;
        jVar.printLog(str + "_" + str2, LogLevel.V, f38587a);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: b */
    public void mo53795b(String str, String str2) {
        IServiceToken jVar = this.f38592g;
        jVar.printLog(str + "_" + str2, LogLevel.D, f38587a);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: c */
    public void mo53796c(String str, String str2) {
        IServiceToken jVar = this.f38592g;
        jVar.printLog(str + "_" + str2, LogLevel.I, f38587a);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: d */
    public void mo53797d(String str, String str2) {
        IServiceToken jVar = this.f38592g;
        jVar.printLog(str + "_" + str2, LogLevel.W, f38587a);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: e */
    public void mo53798e(String str, String str2) {
        IServiceToken jVar = this.f38592g;
        jVar.printLog(str + "_" + str2, LogLevel.E, f38587a);
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: a */
    public boolean mo53793a(LogSource logSource, int i) {
        Intrinsics.checkParameterIsNotNull(logSource, ShareHitPoint.f121868c);
        if ((logSource != LogSource.JAVA || i < this.f65882d) && (logSource != LogSource.Native || i != 8)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.base.AbstractC26616d, com.lynx.tasm.base.AbstractC26613a
    /* renamed from: f */
    public void mo53799f(String str, String str2) {
        IMonitorReportService eVar = this.f38591f;
        if (eVar != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("message", str2);
            eVar.mo52612a(new ReportInfo("LynxLog", null, null, jSONObject, null, null, null, null, 246, null));
        }
    }
}
