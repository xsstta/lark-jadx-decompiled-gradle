package com.ss.lark.android.passport.biz.feature.user_info.p3233a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.NetworkErrorResult;
import com.ss.android.lark.passport.signinsdk_api.base.network.ICallback;
import com.ss.android.lark.passport.signinsdk_api.base.network.ResponseModel;
import com.ss.android.lark.passport.signinsdk_api.country.CountryBean;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetUserInfoStepInfo;
import com.ss.lark.android.passport.biz.feature.FeatureCApi;
import com.ss.lark.android.passport.biz.feature.country.C64741g;
import com.ss.lark.android.passport.biz.feature.country.Country;
import com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a;
import java.lang.reflect.Type;

/* renamed from: com.ss.lark.android.passport.biz.feature.user_info.a.d */
public class C65095d extends C49020a implements C65086a.AbstractC65087a {
    @RouterFieldAnno

    /* renamed from: c */
    private SetUserInfoStepInfo f163932c;

    @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65087a
    /* renamed from: c */
    public SetUserInfoStepInfo mo224240c() {
        return this.f163932c;
    }

    public C65095d(Intent intent) {
        C49092f.m193525a(this, intent);
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65087a
    /* renamed from: a */
    public void mo224238a(int i, String str, String str2, final AbstractC49352d<BaseStepData> dVar) {
        mo171171a(FeatureCApi.m253693a(i, str, str2, this.f163932c.mSource, this.f163932c.mFlowType, this.f123074a, this.f163932c.usePackageDomain, new ICallback<BaseStepData>() {
            /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65095d.C650961 */

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public Type mo101474a() {
                return BaseStepData.class;
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101475a(NetworkErrorResult networkErrorResult) {
                dVar.mo145178a(networkErrorResult);
            }

            @Override // com.ss.android.lark.passport.signinsdk_api.base.network.ICallback
            /* renamed from: a */
            public void mo101476a(ResponseModel<BaseStepData> responseModel) {
                dVar.mo145179a(responseModel.getData());
            }
        }));
    }

    /* renamed from: a */
    private CountryBean m255636a(Context context, String str, boolean z, String str2) {
        Country a = C64741g.m254275a().mo223604a(context, false);
        if (a == null || a.getData() == null) {
            this.f123075b.mo171465b("SetUserInfoModel", "country is empty");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            return C64741g.m254275a().mo223603a(a, z, str2, this.f123074a);
        } else {
            return C64741g.m254275a().mo223602a(a, str, this.f123074a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m255637a(AbstractC49352d dVar, Context context, String str, boolean z, String str2) {
        if (dVar != null) {
            dVar.mo145179a(m255636a(context, str, z, str2));
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.user_info.p3233a.C65086a.AbstractC65087a
    /* renamed from: a */
    public void mo224239a(Context context, String str, boolean z, String str2, AbstractC49352d<CountryBean> dVar) {
        CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(dVar, context, str, z, str2) {
            /* class com.ss.lark.android.passport.biz.feature.user_info.p3233a.$$Lambda$d$v9kacqKwuCsKt4_oInZ5Ufltt0 */
            public final /* synthetic */ AbstractC49352d f$1;
            public final /* synthetic */ Context f$2;
            public final /* synthetic */ String f$3;
            public final /* synthetic */ boolean f$4;
            public final /* synthetic */ String f$5;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
            }

            public final void run() {
                C65095d.this.m255637a((C65095d) this.f$1, (AbstractC49352d) this.f$2, (Context) this.f$3, (String) this.f$4, (boolean) this.f$5);
            }
        });
    }
}
