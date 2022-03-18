package com.ss.lark.android.passport.biz.service.impl;

import com.bytedance.i18n.claymore.ClaymoreImpl;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.AbstractC49125i;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;

@ClaymoreImpl(AbstractC49125i.class)
public class MakeUserOfflineServiceImpl implements AbstractC49125i {
    public static final PassportLog log = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49125i
    public void clearEnvAndInfo() {
        ServiceFinder.m193752g().featureGatingClear();
    }

    @Override // com.ss.android.lark.passport.infra.service.AbstractC49125i
    public void asyncMakeUserOffline(final IGetDataCallback<Boolean> iGetDataCallback) {
        UniContext uniContext = UniContext.CONTEXT_SWITCH;
        if (iGetDataCallback == null) {
            log.mo171471d("n_action_make_user_offline_start", "callback is null");
        } else {
            ServiceFinder.m193752g().asyncMakeUserOffline(new IGetDataCallback<Boolean>() {
                /* class com.ss.lark.android.passport.biz.service.impl.MakeUserOfflineServiceImpl.C652131 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    MakeUserOfflineServiceImpl.this.clearEnvAndInfo();
                    MakeUserOfflineServiceImpl.this.dealError("n_action_offline_fail", "asyncMakeUserOffline onError", iGetDataCallback);
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    MakeUserOfflineServiceImpl.this.clearEnvAndInfo();
                    if (bool.booleanValue()) {
                        MakeUserOfflineServiceImpl.log.mo171465b("n_action_offline_succ", "asyncMakeUserOffline success");
                        iGetDataCallback.onSuccess(true);
                        return;
                    }
                    MakeUserOfflineServiceImpl.this.dealError("n_action_offline_succ", "asyncMakeUserOffline fail", iGetDataCallback);
                }
            });
        }
    }

    public void dealError(String str, String str2, IGetDataCallback<Boolean> iGetDataCallback) {
        log.mo171471d(str, str2);
        iGetDataCallback.onError(new ErrorResult(-101, str2));
    }
}
