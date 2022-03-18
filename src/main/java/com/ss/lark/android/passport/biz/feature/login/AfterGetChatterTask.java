package com.ss.lark.android.passport.biz.feature.login;

import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.lark.android.passport.biz.feature.login.ILoginInitTask;
import com.ss.lark.android.passport.biz.feature.login.LoginInitializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/AfterGetChatterTask;", "Lcom/ss/lark/android/passport/biz/feature/login/ILoginInitTask;", "()V", "name", "", "getName", "()Ljava/lang/String;", "invoke", "", "params", "Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;", "(Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;)Ljava/lang/Boolean;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.a */
final class AfterGetChatterTask implements ILoginInitTask {
    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public String mo223750a() {
        return "AfterGetChatterTask";
    }

    /* renamed from: a */
    public void mo223751a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ILoginInitTask.C64847a.m254649a(this, str);
    }

    /* renamed from: a */
    public Boolean invoke(LoginInitializer.LoginInitParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        mo223751a("after get chatter task start");
        ServiceFinder.m193748c().deliverLegacyLoginEvent();
        mo223751a("deliver legacy login event success");
        aVar.mo223771e().mo223766b();
        mo223751a("after get chatter task end");
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public void mo223752a(String str, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ILoginInitTask.C64847a.m254650a(this, str, th);
    }
}
