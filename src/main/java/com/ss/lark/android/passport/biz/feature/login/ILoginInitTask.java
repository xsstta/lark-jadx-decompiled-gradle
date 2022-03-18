package com.ss.lark.android.passport.biz.feature.login;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.lark.android.passport.biz.feature.login.LoginInitializer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\bb\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/login/ILoginInitTask;", "Lkotlin/Function1;", "Lcom/ss/lark/android/passport/biz/feature/login/LoginInitializer$LoginInitParams;", "", "name", "", "getName", "()Ljava/lang/String;", "loge", "", "msg", "throwable", "", "logi", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.login.d */
public interface ILoginInitTask extends Function1<LoginInitializer.LoginInitParams, Boolean> {
    /* renamed from: a */
    String mo223750a();

    /* renamed from: a */
    void mo223752a(String str, Throwable th);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.feature.login.d$a */
    public static final class C64847a {
        /* renamed from: a */
        public static void m254649a(ILoginInitTask dVar, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171465b("n_action_after_login_inner_task_" + dVar.mo223750a(), str);
        }

        /* renamed from: a */
        public static void m254650a(ILoginInitTask dVar, String str, Throwable th) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171462a("n_action_after_login_inner_task_" + dVar.mo223750a(), str, th);
        }

        /* renamed from: a */
        public static /* synthetic */ void m254651a(ILoginInitTask dVar, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                dVar.mo223752a(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loge");
        }
    }
}
