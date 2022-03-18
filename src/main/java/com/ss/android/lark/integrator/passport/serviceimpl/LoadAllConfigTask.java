package com.ss.android.lark.integrator.passport.serviceimpl;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49219v;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/LoadAllConfigTask;", "", "()V", "invoke", "", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "callback", "Lkotlin/Function1;", "", "loadAllConfig", "userId", "", "taskFinishCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.e */
public final class LoadAllConfigTask {

    /* renamed from: a */
    public static final LoadAllConfigTask f101760a = new LoadAllConfigTask();

    private LoadAllConfigTask() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.e$b */
    public static final class RunnableC40014b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C49219v f101762a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f101763b;

        RunnableC40014b(C49219v vVar, IGetDataCallback iGetDataCallback) {
            this.f101762a = vVar;
            this.f101763b = iGetDataCallback;
        }

        public final void run() {
            int i;
            Bundle bundle;
            C49219v.C49222a a = this.f101762a.mo171743a("onboarding");
            boolean z = false;
            if (a == null || (bundle = (Bundle) a.mo171750a()) == null) {
                i = 0;
            } else {
                i = bundle.size();
            }
            IGetDataCallback iGetDataCallback = this.f101763b;
            if (i > 0) {
                z = true;
            }
            iGetDataCallback.onSuccess(Boolean.valueOf(z));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/integrator/passport/serviceimpl/LoadAllConfigTask$invoke$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.e$a */
    public static final class C40013a implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Function1 f101761a;

        C40013a(Function1 function1) {
            this.f101761a = function1;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f101761a.invoke(false);
            PassportLog.f123351c.mo171474a().mo171462a("n_action_after_login_outer_task_LoadAllConfigTask", "load failed", errorResult);
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            boolean z;
            Function1 function1 = this.f101761a;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171465b("n_action_after_login_outer_task_LoadAllConfigTask", "load success: " + bool);
        }
    }

    /* renamed from: a */
    public final void mo145312a(User user, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        Intrinsics.checkParameterIsNotNull(function1, "callback");
        String str = user.userId;
        Intrinsics.checkExpressionValueIsNotNull(str, "user.userId");
        m158662a(str, new C40013a(function1));
    }

    /* renamed from: a */
    private final void m158662a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        String str2;
        User e;
        IUserService a = ServiceFinder.m193745a(str);
        if (a == null || (e = a.mo171597e()) == null) {
            str2 = null;
        } else {
            str2 = e.getTenantId();
        }
        C49219v vVar = new C49219v(5000);
        RunnableC40014b bVar = new RunnableC40014b(vVar, iGetDataCallback);
        vVar.mo171745a(bVar, bVar);
        vVar.mo171747c();
        IGetDataCallback<Bundle> a2 = vVar.mo171742a("onboarding", Bundle.class);
        IGetDataCallback<Boolean> a3 = vVar.mo171742a("dynamic-tab", Boolean.TYPE);
        IGetDataCallback<Boolean> a4 = vVar.mo171742a("appconfig", Boolean.TYPE);
        ServiceFinder.m193752g().checkNewOnBoardingStatus(a2);
        ServiceFinder.m193752g().loadTabConfigFromServer(str, str2, a3);
        ServiceFinder.m193752g().loadAppConfig(a4);
    }
}
