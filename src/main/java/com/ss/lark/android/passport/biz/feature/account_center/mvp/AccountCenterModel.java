package com.ss.lark.android.passport.biz.feature.account_center.mvp;

import android.content.Context;
import android.content.Intent;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.entity.SwitchEntity;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.account_center.UserOperationCenterInfo;
import com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J \u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J(\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/AccountCenterModel;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseModel;", "Lcom/ss/lark/android/passport/biz/feature/account_center/mvp/IAccountCenterContract$IModel;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "stepInfo", "Lcom/ss/lark/android/passport/biz/feature/account_center/UserOperationCenterInfo;", "getStepInfo", "officialEmailInit", "", "tenantId", "", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/network/ICallback;", "Lcom/ss/android/lark/passport/signinsdk_api/base/BaseStepData;", "switchUser", "context", "Landroid/content/Context;", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.account_center.a.a */
public final class AccountCenterModel extends C49020a implements IAccountCenterContract.IModel {
    @RouterFieldAnno

    /* renamed from: c */
    private final UserOperationCenterInfo f163013c;

    @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IModel
    /* renamed from: g */
    public UserOperationCenterInfo mo223319g() {
        return this.f163013c;
    }

    public AccountCenterModel(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IModel
    /* renamed from: a */
    public void mo223318a(String str, ICallback<BaseStepData> aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        UserOperationCenterInfo userOperationCenterInfo = this.f163013c;
        if (userOperationCenterInfo != null) {
            z = userOperationCenterInfo.usePackageDomain;
        } else {
            z = false;
        }
        PassportLog passportLog = this.f123075b;
        Intrinsics.checkExpressionValueIsNotNull(passportLog, "logger");
        mo171171a(FeatureCApi.AccountCenter.m253711a(str, z, passportLog, aVar));
    }

    @Override // com.ss.lark.android.passport.biz.feature.account_center.mvp.IAccountCenterContract.IModel
    /* renamed from: a */
    public void mo223317a(Context context, User user, IGetDataCallback<C49382d> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ServiceFinder.m193753h().switchUser(context, new SwitchEntity(user, 7, true), iGetDataCallback);
    }
}
