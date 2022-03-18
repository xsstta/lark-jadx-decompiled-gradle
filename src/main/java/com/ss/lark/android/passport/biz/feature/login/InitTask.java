package com.ss.lark.android.passport.biz.feature.login;

import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.listenermanage.LoginListenerManager;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.p2440b.C49160a;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.lark.android.passport.biz.feature.login.ILoginInitTask;
import com.ss.lark.android.passport.biz.feature.login.LoginInitializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/InitTask;", "Lcom/ss/lark/android/passport/biz/feature/login/ILoginInitTask;", "()V", "name", "", "getName", "()Ljava/lang/String;", "invoke", "", "params", "Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;", "(Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;)Ljava/lang/Boolean;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.e */
final class InitTask implements ILoginInitTask {
    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public String mo223750a() {
        return "InitTask";
    }

    /* renamed from: a */
    public void mo223758a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ILoginInitTask.C64847a.m254649a(this, str);
    }

    /* renamed from: a */
    public Boolean invoke(LoginInitializer.LoginInitParams aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        User b = aVar.mo223768b();
        String session = b.getSession();
        if (session == null || StringsKt.isBlank(session)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ILoginInitTask.C64847a.m254651a(this, "target user session is null or blank", null, 2, null);
            return false;
        }
        mo223758a("target user session: " + C49160a.m193857b(b.getSession()));
        String str = b.userId;
        if (str == null || StringsKt.isBlank(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            LKUIToast.show(aVar.mo223767a(), (int) R.string.Lark_Legacy_GetUserInfoFail);
            ILoginInitTask.C64847a.m254651a(this, "target user or userId is null or blank", null, 2, null);
            return false;
        }
        String logoutToken = b.getLogoutToken();
        if (logoutToken == null || StringsKt.isBlank(logoutToken)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            ILoginInitTask.C64847a.m254651a(this, "target user logout token is null or blank", null, 2, null);
            return false;
        }
        mo223758a("init task start");
        LoginListenerManager.m193627a(false, aVar.mo223769c(), aVar.mo223768b());
        mo223758a("dispatch login status end");
        ServiceFinder.m193764s().executeLoginInitTasks(aVar.mo223768b());
        mo223758a("init task end");
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public void mo223752a(String str, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ILoginInitTask.C64847a.m254650a(this, str, th);
    }
}
