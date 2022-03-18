package com.ss.lark.android.passport.biz.service.impl;

import android.content.Context;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49148ac;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.C49376b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.logout.LogoutReason;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.service.impl.b */
public class C65232b implements AbstractC49338a {

    /* renamed from: a */
    public final IGetDataCallback<C49376b> f164265a;

    /* renamed from: b */
    private final Context f164266b;

    /* renamed from: c */
    private final boolean f164267c;

    /* renamed from: d */
    private final ILogoutUserService f164268d = ((ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class));

    /* renamed from: e */
    private final List<User> f164269e;

    @Override // com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a
    public void onResult(final boolean z) {
        ILogoutUserService hVar;
        if (z && (hVar = this.f164268d) != null) {
            if (this.f164267c) {
                hVar.clearForLogoutAll(this.f164266b, this.f164269e);
            } else {
                hVar.clearForLogoutPart(this.f164269e);
            }
        }
        if (this.f164265a != null) {
            C49148ac.m193806a(new Runnable() {
                /* class com.ss.lark.android.passport.biz.service.impl.C65232b.RunnableC652331 */

                public void run() {
                    C65232b bVar = C65232b.this;
                    bVar.mo224466a(z, bVar.f164265a);
                }
            });
        }
    }

    /* renamed from: a */
    public void mo224466a(boolean z, IGetDataCallback<C49376b> iGetDataCallback) {
        if (z) {
            iGetDataCallback.onSuccess(new C49376b(true, LogoutReason.PlaceHolder, this.f164269e, ServiceFinder.m193744a().getAllUserList()));
            return;
        }
        iGetDataCallback.onError(new ErrorResult(UIUtils.getString(this.f164266b, R.string.Lark_Login_ErrorMessageOfOtherStatus)));
    }

    public C65232b(Context context, boolean z, List<User> list, IGetDataCallback<C49376b> iGetDataCallback) {
        this.f164265a = iGetDataCallback;
        this.f164266b = context;
        this.f164269e = list;
        this.f164267c = z;
    }
}
