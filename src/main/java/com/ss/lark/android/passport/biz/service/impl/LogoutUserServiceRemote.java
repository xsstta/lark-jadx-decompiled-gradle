package com.ss.lark.android.passport.biz.service.impl;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.manis.annotation.RemoteServiceImpl;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49224w;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@RemoteServiceImpl(service = ILogoutUserServiceRemote.class)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LogoutUserServiceRemote;", "Lcom/ss/android/lark/passport/infra/service/ILogoutUserServiceRemote;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "logout", "", "callback", "Lcom/ss/android/lark/passport/infra/service/ILogoutUserServiceRemote$ILogoutCallBack;", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class LogoutUserServiceRemote implements ILogoutUserServiceRemote {
    public static final Companion Companion = new Companion(null);
    public static final PassportLog log = PassportLog.f123351c.mo171474a();
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/lark/android/passport/biz/service/impl/LogoutUserServiceRemote$Companion;", "", "()V", "TAG", "", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "getLog", "()Lcom/ss/android/lark/passport/infra/log/PassportLog;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserServiceRemote$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Context getContext() {
        return this.context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/lark/android/passport/biz/service/impl/LogoutUserServiceRemote$logout$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/logout/LogoutEndContext;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "logoutEndContext", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.service.impl.LogoutUserServiceRemote$b */
    public static final class C65212b implements IGetDataCallback<C49376b> {

        /* renamed from: a */
        final /* synthetic */ ILogoutUserServiceRemote.ILogoutCallBack f164185a;

        C65212b(ILogoutUserServiceRemote.ILogoutCallBack aVar) {
            this.f164185a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(C49376b bVar) {
            ILogoutUserServiceRemote.ILogoutCallBack aVar = this.f164185a;
            if (aVar != null) {
                aVar.onResult(true);
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ILogoutUserServiceRemote.ILogoutCallBack aVar = this.f164185a;
            if (aVar != null) {
                aVar.onResult(false);
            }
        }
    }

    public LogoutUserServiceRemote(Context context2) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
    }

    @Override // com.ss.android.lark.passport.infra.service.ILogoutUserServiceRemote
    public void logout(ILogoutUserServiceRemote.ILogoutCallBack aVar) {
        PassportLog passportLog = log;
        passportLog.mo171465b("n_action_logout_start", "all_logout, remote call process is" + C49224w.m194051a(this.context));
        ServiceFinder.m193757l().logoutAll(this.context, new C65212b(aVar));
    }
}
