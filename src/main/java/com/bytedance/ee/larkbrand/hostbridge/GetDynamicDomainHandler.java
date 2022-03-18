package com.bytedance.ee.larkbrand.hostbridge;

import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67571b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/GetDynamicDomainHandler;", "Lcom/tt/miniapphost/process/handler/ISyncHostDataHandler;", "miniAppCallback", "Lcom/ss/android/lark/littleapp/MiniAppCallback;", "(Lcom/ss/android/lark/littleapp/MiniAppCallback;)V", "getMiniAppCallback", "()Lcom/ss/android/lark/littleapp/MiniAppCallback;", "action", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "callData", "getType", "", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.d */
public final class GetDynamicDomainHandler implements AbstractC67571b {

    /* renamed from: a */
    public static final Companion f34790a = new Companion(null);

    /* renamed from: b */
    private final AbstractC41371j f34791b;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public String mo49139a() {
        return "lark_get_domain";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/GetDynamicDomainHandler$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public GetDynamicDomainHandler(AbstractC41371j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "miniAppCallback");
        this.f34791b = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67571b
    /* renamed from: a */
    public CrossProcessDataEntity mo49138a(CrossProcessDataEntity crossProcessDataEntity) {
        AppBrandLogger.m52830i("GetDynamicDomainHandler", "params " + crossProcessDataEntity);
        if (crossProcessDataEntity != null) {
            int e = crossProcessDataEntity.mo234748e("domain_alias");
            if (e != 0) {
                String a = this.f34791b.mo148978a(DomainSettings.Alias.fromValue(e));
                AppBrandLogger.m52830i("GetDynamicDomainHandler", "get domain: " + a + " for alias: " + DomainSettings.Alias.fromValue(e));
                CrossProcessDataEntity b = CrossProcessDataEntity.C67574a.m263013a().mo234760a("domain", (Object) a).mo234763b();
                Intrinsics.checkExpressionValueIsNotNull(b, "CrossProcessDataEntity.B…                ).build()");
                return b;
            }
            String b2 = crossProcessDataEntity.mo234744b("domain_key");
            if (!TextUtils.isEmpty(b2)) {
                String i = this.f34791b.mo149026i(b2);
                AppBrandLogger.m52830i("GetDynamicDomainHandler", "get domain: " + i + " for key: " + b2);
                CrossProcessDataEntity b3 = CrossProcessDataEntity.C67574a.m263013a().mo234760a("domain", (Object) i).mo234763b();
                Intrinsics.checkExpressionValueIsNotNull(b3, "CrossProcessDataEntity.B…                ).build()");
                return b3;
            }
            AppBrandLogger.m52829e("GetDynamicDomainHandler", "key is empty");
        }
        CrossProcessDataEntity b4 = CrossProcessDataEntity.C67574a.m263013a().mo234763b();
        Intrinsics.checkExpressionValueIsNotNull(b4, "CrossProcessDataEntity.Builder.create().build()");
        return b4;
    }
}
