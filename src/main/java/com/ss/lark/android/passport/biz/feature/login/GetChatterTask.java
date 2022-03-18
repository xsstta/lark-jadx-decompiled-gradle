package com.ss.lark.android.passport.biz.feature.login;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.lark.android.passport.biz.feature.login.ILoginInitTask;
import com.ss.lark.android.passport.biz.feature.login.LoginInitializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/GetChatterTask;", "Lcom/ss/lark/android/passport/biz/feature/login/ILoginInitTask;", "()V", "name", "", "getName", "()Ljava/lang/String;", "invoke", "", "params", "Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;", "(Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;)Ljava/lang/Boolean;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.c */
public final class GetChatterTask implements ILoginInitTask {
    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public String mo223750a() {
        return "GetChatterTask";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0015\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/feature/login/GetChatterTask$invoke$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lkotlin/Unit;)V", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.c$a */
    public static final class C64846a implements IGetDataCallback<Unit> {

        /* renamed from: a */
        final /* synthetic */ GetChatterTask f163460a;

        /* renamed from: b */
        final /* synthetic */ LoginInitializer.LoginInitParams f163461b;

        /* renamed from: a */
        public void onSuccess(Unit unit) {
            Intrinsics.checkParameterIsNotNull(unit, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f163460a.mo223755a("get chatter success");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LoginInitializer e = this.f163461b.mo223771e();
            String errorResult2 = errorResult.toString();
            Intrinsics.checkExpressionValueIsNotNull(errorResult2, "err.toString()");
            e.mo223763a(401, errorResult2);
        }

        C64846a(GetChatterTask cVar, LoginInitializer.LoginInitParams aVar) {
            this.f163460a = cVar;
            this.f163461b = aVar;
        }
    }

    /* renamed from: a */
    public void mo223755a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ILoginInitTask.C64847a.m254649a(this, str);
    }

    /* renamed from: a */
    public Boolean invoke(LoginInitializer.LoginInitParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        aVar.mo223770d().getChatterById(aVar.mo223768b(), aVar.mo223767a(), new C64846a(this, aVar));
        aVar.mo223771e().mo223766b();
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public void mo223752a(String str, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ILoginInitTask.C64847a.m254650a(this, str, th);
    }
}
