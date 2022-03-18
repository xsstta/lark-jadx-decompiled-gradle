package com.ss.lark.android.passport.biz.feature.user_item_list.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.lark.android.passport.biz.entity.UserItemListStep;
import com.ss.lark.android.passport.biz.feature.LoginApi;
import com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_item_list.mvp.b */
public class C65116b extends C49020a implements C65112a.AbstractC65113a {
    @RouterFieldAnno

    /* renamed from: c */
    private UserItemListStep f164005c;

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65113a
    /* renamed from: c */
    public UserItemListStep mo224295c() {
        return this.f164005c;
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65113a
    public String cz_() {
        return this.f164005c.flowType;
    }

    public C65116b(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65113a
    /* renamed from: a */
    public void mo224292a(ICallback<BaseStepData> aVar) {
        mo171171a(LoginApi.m253955a(cz_(), this.f164005c.usePackageDomain, aVar));
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65113a
    /* renamed from: b */
    public void mo224294b(String str, ICallback<BaseStepData> aVar) {
        mo171171a(LoginApi.m253956b(str, cz_(), this.f164005c.usePackageDomain, aVar));
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_item_list.mvp.C65112a.AbstractC65113a
    /* renamed from: a */
    public void mo224293a(String str, ICallback<BaseStepData> aVar) {
        mo171171a(LoginApi.m253954a(str, cz_(), this.f164005c.usePackageDomain, aVar));
    }
}
