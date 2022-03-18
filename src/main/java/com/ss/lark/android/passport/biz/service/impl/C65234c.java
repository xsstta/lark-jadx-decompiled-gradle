package com.ss.lark.android.passport.biz.service.impl;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.p2069j.p2070a.C40655v;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49125i;
import com.ss.android.lark.passport.infra.service.ILogoutUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.watcher.WatcherHelper;
import com.ss.android.lark.passport.infra.watcher.WatcherUniContext;
import com.ss.android.lark.passport.signinsdk_api.account.AbstractC49338a;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.service.impl.c */
public class C65234c implements IGetDataCallback<BaseStepData> {

    /* renamed from: a */
    public final UniContext f164272a;

    /* renamed from: b */
    public final AbstractC49125i f164273b;

    /* renamed from: c */
    public final PassportLog f164274c = PassportLog.f123351c.mo171474a();

    /* renamed from: d */
    private final AbstractC49338a f164275d;

    /* renamed from: e */
    private final List<String> f164276e;

    /* renamed from: f */
    private final ILogoutUserService f164277f;

    /* renamed from: g */
    private final boolean f164278g;

    /* renamed from: b */
    private void m256086b(boolean z) {
        if (this.f164278g) {
            m256087c(z);
        } else {
            mo224469a(z);
        }
    }

    /* renamed from: c */
    private void m256087c(final boolean z) {
        C652351 r0 = new IGetDataCallback<Boolean>() {
            /* class com.ss.lark.android.passport.biz.service.impl.C65234c.C652351 */

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C65234c.this.f164274c.mo171465b("n_action_logout_rust_offline", "rust request succ");
                WatcherHelper.m193664a(C65234c.this.f164272a, C40655v.f103217n);
                C65234c.this.mo224469a(z);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                String str;
                if (TextUtils.isEmpty(errorResult.getDebugMsg())) {
                    str = "rust offline error";
                } else {
                    str = errorResult.getDebugMsg();
                }
                PassportLog passportLog = C65234c.this.f164274c;
                passportLog.mo171471d("n_action_logout_rust_offline", "rust request fail, errMsg is " + str);
                WatcherHelper.m193664a(C65234c.this.f164272a, C40655v.f103218o);
                C65234c.this.f164273b.clearEnvAndInfo();
                C65234c.this.mo224469a(z);
            }
        };
        this.f164274c.mo171465b("n_action_logout_rust_offline", "rust request start");
        WatcherHelper.m193664a(this.f164272a, C40655v.f103216m);
        this.f164273b.asyncMakeUserOffline(r0);
    }

    /* renamed from: a */
    public void onSuccess(BaseStepData baseStepData) {
        PassportLog passportLog = this.f164274c;
        passportLog.mo171465b("n_action_logout_request_succ", "mIsNeedRustOffline=" + this.f164278g);
        m256086b(false);
    }

    /* renamed from: a */
    public void mo224469a(boolean z) {
        List<String> list;
        if (z && (list = this.f164276e) != null && !list.isEmpty()) {
            this.f164274c.mo171465b("n_action_logout_offline_start", "reason:logout_request_fail");
            UniContext c = WatcherUniContext.m193674c();
            c.appendOneSceneMonitorParam("task_type", "after_logout");
            this.f164277f.startOfflineLogout(c, this.f164276e);
        }
        AbstractC49338a aVar = this.f164275d;
        if (aVar != null) {
            aVar.onResult(true);
        }
    }

    @Override // com.larksuite.framework.callback.IGetDataCallback
    public void onError(ErrorResult errorResult) {
        PassportLog passportLog = this.f164274c;
        passportLog.mo171471d("n_action_logout_request_fail", "mIsNeedRustOffline=" + this.f164278g + ",errMsg is " + errorResult.getDisplayMsg(String.valueOf(errorResult.getErrorCode())));
        m256086b(true);
    }

    public C65234c(UniContext uniContext, AbstractC49338a aVar, List<String> list, boolean z) {
        this.f164275d = aVar;
        this.f164272a = uniContext;
        this.f164276e = list;
        this.f164277f = (ILogoutUserService) ServiceFinder.m193746a(ILogoutUserService.class);
        this.f164273b = (AbstractC49125i) ServiceFinder.m193746a(AbstractC49125i.class);
        this.f164278g = z;
    }
}
