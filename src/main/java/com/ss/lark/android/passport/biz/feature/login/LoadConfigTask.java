package com.ss.lark.android.passport.biz.feature.login;

import android.os.Bundle;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.lark.android.passport.biz.feature.login.ILoginInitTask;
import com.ss.lark.android.passport.biz.feature.login.LoginInitializer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/LoadConfigTask;", "Lcom/ss/lark/android/passport/biz/feature/login/ILoginInitTask;", "()V", "name", "", "getName", "()Ljava/lang/String;", "invoke", "", "params", "Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;", "(Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;)Ljava/lang/Boolean;", "processRouter", "", "isOnBoarding", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.f */
public final class LoadConfigTask implements ILoginInitTask {

    /* renamed from: a */
    public static final Companion f163462a = new Companion(null);

    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public String mo223750a() {
        return "LoadConfigTask";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/LoadConfigTask$Companion;", "", "()V", "KEY_FEED_SOURCE_FROM_LOGIN", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.f$a */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.f$b */
    public static final class C64848b extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ LoginInitializer.LoginInitParams $params;
        final /* synthetic */ LoadConfigTask this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64848b(LoadConfigTask fVar, LoginInitializer.LoginInitParams aVar) {
            super(1);
            this.this$0 = fVar;
            this.$params = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            this.this$0.mo223760a(this.$params, z);
            this.$params.mo223771e().mo223762a();
        }
    }

    /* renamed from: a */
    public Boolean invoke(LoginInitializer.LoginInitParams aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "params");
        if (aVar.mo223770d().isLoginFromExternal()) {
            aVar.mo223767a().finish();
            aVar.mo223771e().mo223762a();
        } else {
            ServiceFinder.m193764s().executeLoadAllConfigTask(aVar.mo223768b(), new C64848b(this, aVar));
        }
        return true;
    }

    @Override // com.ss.lark.android.passport.biz.feature.login.ILoginInitTask
    /* renamed from: a */
    public void mo223752a(String str, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        ILoginInitTask.C64847a.m254650a(this, str, th);
    }

    /* renamed from: a */
    public final void mo223760a(LoginInitializer.LoginInitParams aVar, boolean z) {
        if (z) {
            aVar.mo223770d().gotoOnBoarding();
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("key_source_from", 1);
            aVar.mo223770d().gotoFeed(aVar.mo223767a(), aVar.mo223768b(), bundle);
        }
        aVar.mo223767a().finish();
    }
}
