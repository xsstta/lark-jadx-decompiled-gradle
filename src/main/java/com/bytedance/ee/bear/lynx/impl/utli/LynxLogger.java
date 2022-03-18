package com.bytedance.ee.bear.lynx.impl.utli;

import com.bytedance.ee.log.C13479a;
import com.bytedance.ies.bullet.service.base.ILoggerConfig;
import com.bytedance.ies.bullet.service.base.ILoggerService;
import com.bytedance.ies.bullet.service.base.api.LogLevel;
import com.bytedance.ies.bullet.service.base.impl.BaseBulletService;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u00012\u00020\u0002:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/LynxLogger;", "Lcom/bytedance/ies/bullet/service/base/impl/BaseBulletService;", "Lcom/bytedance/ies/bullet/service/base/ILoggerService;", "loggerConfig", "Lcom/bytedance/ies/bullet/service/base/ILoggerConfig;", "(Lcom/bytedance/ies/bullet/service/base/ILoggerConfig;)V", "getLoggerConfig", "()Lcom/bytedance/ies/bullet/service/base/ILoggerConfig;", "onLog", "", "msg", "", "level", "Lcom/bytedance/ies/bullet/service/base/api/LogLevel;", "onReject", "e", "", "extraMsg", "Companion", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.lynx.impl.c.c */
public final class LynxLogger extends BaseBulletService implements ILoggerService {

    /* renamed from: a */
    public static final Companion f23769a = new Companion(null);

    /* renamed from: b */
    private final ILoggerConfig f23770b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/lynx/impl/utli/LynxLogger$Companion;", "", "()V", "TAG", "", "lynx-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.lynx.impl.c.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LynxLogger(ILoggerConfig cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "loggerConfig");
        this.f23770b = cVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.ILoggerService
    /* renamed from: a */
    public void mo33919a(String str, LogLevel logLevel) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        Intrinsics.checkParameterIsNotNull(logLevel, "level");
        int i = C8831d.f23771a[logLevel.ordinal()];
        if (i == 1) {
            C13479a.m54768c("ccm-lynx: LynxLogger", str);
        } else if (i == 2) {
            C13479a.m54772d("ccm-lynx: LynxLogger", str);
        } else if (i == 3) {
            C13479a.m54775e("ccm-lynx: LynxLogger", str);
        } else if (i != 4) {
            C13479a.m54764b("ccm-lynx: LynxLogger", str);
        } else {
            C13479a.m54758a("ccm-lynx: LynxLogger", str);
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.ILoggerService
    /* renamed from: a */
    public void mo33920a(Throwable th, String str) {
        Intrinsics.checkParameterIsNotNull(th, "e");
        Intrinsics.checkParameterIsNotNull(str, "extraMsg");
        C13479a.m54758a("ccm-lynx: LynxLogger", "onReject: " + th.getMessage() + ", extra: " + str);
    }
}
