package com.ss.lark.android.passport.biz.feature.join_team.p3225a;

import android.content.Context;
import com.larksuite.component.ui.toast.LKUIToast;
import com.ss.android.lark.passport.infra.base.network.p2431a.C49069a;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.a.a */
public class C64798a implements AbstractC49407b {

    /* renamed from: a */
    private Context f163383a;

    /* renamed from: b */
    private AbstractC49352d<Boolean> f163384b;

    @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b
    /* renamed from: a */
    public void mo145306a(AbstractC49407b.AbstractC49408a aVar) {
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b
    /* renamed from: a */
    public Context mo145304a() {
        return this.f163383a;
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.qrcode.AbstractC49407b
    /* renamed from: a */
    public void mo145305a(NetworkErrorResult networkErrorResult) {
        if (networkErrorResult != null) {
            Context context = this.f163383a;
            LKUIToast.show(context, C49069a.m193382a(context, networkErrorResult));
        }
        AbstractC49352d<Boolean> dVar = this.f163384b;
        if (dVar != null) {
            dVar.mo145178a(new NetworkErrorResult(0, "continue scan"));
        }
    }

    public C64798a(Context context, AbstractC49352d<Boolean> dVar) {
        this.f163383a = context;
        this.f163384b = dVar;
    }
}
