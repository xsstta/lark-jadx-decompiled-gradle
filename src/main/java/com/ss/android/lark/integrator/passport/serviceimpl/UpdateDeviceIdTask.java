package com.ss.android.lark.integrator.passport.serviceimpl;

import com.ss.android.lark.integrator.passport.serviceimpl.IInitializeTask;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/UpdateDeviceIdTask;", "Lcom/ss/android/lark/integrator/passport/serviceimpl/IInitializeTask;", "()V", "taskName", "", "getTaskName", "()Ljava/lang/String;", "invoke", "", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.h */
public final class UpdateDeviceIdTask implements IInitializeTask {

    /* renamed from: a */
    public static final UpdateDeviceIdTask f101768a = new UpdateDeviceIdTask();

    /* renamed from: b */
    private static final String f101769b = f101769b;

    private UpdateDeviceIdTask() {
    }

    @Override // com.ss.android.lark.integrator.passport.serviceimpl.IInitializeTask
    /* renamed from: a */
    public String mo145307a() {
        return f101769b;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(User user) {
        mo145319a(user);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public void mo145320a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        IInitializeTask.C40012a.m158652a(this, str);
    }

    /* renamed from: a */
    public void mo145319a(User user) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        String deviceId = ServiceFinder.m193762q().getDeviceId();
        ServiceFinder rVar = ServiceFinder.f123386a;
        ((IDeviceService) ServiceFinder.m193746a(IDeviceService.class)).setDeviceId(deviceId);
        mo145320a("update device id success");
    }

    @Override // com.ss.android.lark.integrator.passport.serviceimpl.IInitializeTask
    /* renamed from: a */
    public void mo145308a(String str, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        IInitializeTask.C40012a.m158653a(this, str, th);
    }
}
