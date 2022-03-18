package com.bytedance.ee.larkbrand.hostbridge.async;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.littleapp.AbstractC41371j;
import com.tt.miniapphost.process.data.CrossProcessDataEntity;
import com.tt.miniapphost.process.p3378d.AbstractC67570a;
import com.tt.miniapphost.process.p3379e.C67577a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/larkbrand/hostbridge/async/GetUserInfoExHandler;", "Lcom/tt/miniapphost/process/handler/IAsyncHostDataHandler;", "miniAppCallback", "Lcom/ss/android/lark/littleapp/MiniAppCallback;", "(Lcom/ss/android/lark/littleapp/MiniAppCallback;)V", "getMiniAppCallback", "()Lcom/ss/android/lark/littleapp/MiniAppCallback;", "action", "", "callData", "Lcom/tt/miniapphost/process/data/CrossProcessDataEntity;", "asyncIpcHandler", "Lcom/tt/miniapphost/process/helper/AsyncIpcHandler;", "getType", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.d */
public final class GetUserInfoExHandler implements AbstractC67570a {

    /* renamed from: a */
    private final AbstractC41371j f34768a;

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public String mo49145a() {
        return "lark_get_userInfo_ex";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/larkbrand/hostbridge/async/GetUserInfoExHandler$action$1", "Lcom/ss/android/lark/littleapp/MiniAppCallback$IGetUserInfoExCallback;", "onError", "", "error", "", "onSuccess", "userInfoEx", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.hostbridge.a.d$a */
    public static final class C13085a implements AbstractC41371j.AbstractC41377f {

        /* renamed from: a */
        final /* synthetic */ C67577a f34769a;

        C13085a(C67577a aVar) {
            this.f34769a = aVar;
        }

        @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41377f
        /* renamed from: a */
        public void mo49152a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "userInfoEx");
            AppBrandLogger.m52830i("GetUserInfoExHandler", "getUserInfoEx: " + str);
            this.f34769a.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("user_info_ex", (Object) str).mo234763b(), true);
        }

        @Override // com.ss.android.lark.littleapp.AbstractC41371j.AbstractC41377f
        /* renamed from: b */
        public void mo49153b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "error");
            AppBrandLogger.m52829e("GetUserInfoExHandler", "getUserInfoEx: " + str);
            this.f34769a.mo234768a(CrossProcessDataEntity.C67574a.m263013a().mo234760a("user_info_ex_error", (Object) str).mo234763b(), true);
        }
    }

    public GetUserInfoExHandler(AbstractC41371j jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "miniAppCallback");
        this.f34768a = jVar;
    }

    @Override // com.tt.miniapphost.process.p3378d.AbstractC67570a
    /* renamed from: a */
    public void mo49146a(CrossProcessDataEntity crossProcessDataEntity, C67577a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "asyncIpcHandler");
        this.f34768a.mo148990a(new C13085a(aVar));
    }
}
