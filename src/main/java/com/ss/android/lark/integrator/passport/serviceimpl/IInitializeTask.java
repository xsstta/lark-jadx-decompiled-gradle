package com.ss.android.lark.integrator.passport.serviceimpl;

import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0016R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/IInitializeTask;", "Lkotlin/Function1;", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "", "taskName", "", "getTaskName", "()Ljava/lang/String;", "loge", "msg", "throwable", "", "logi", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.b */
public interface IInitializeTask extends Function1<User, Unit> {
    /* renamed from: a */
    String mo145307a();

    /* renamed from: a */
    void mo145308a(String str, Throwable th);

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.b$a */
    public static final class C40012a {
        /* renamed from: a */
        public static void m158652a(IInitializeTask bVar, String str) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171465b("n_action_after_login_outer_task_" + bVar.mo145307a(), str);
        }

        /* renamed from: a */
        public static void m158653a(IInitializeTask bVar, String str, Throwable th) {
            Intrinsics.checkParameterIsNotNull(str, "msg");
            PassportLog a = PassportLog.f123351c.mo171474a();
            a.mo171462a("n_action_after_login_outer_task_" + bVar.mo145307a(), str, th);
        }

        /* renamed from: a */
        public static /* synthetic */ void m158654a(IInitializeTask bVar, String str, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    th = null;
                }
                bVar.mo145308a(str, th);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loge");
        }
    }
}
