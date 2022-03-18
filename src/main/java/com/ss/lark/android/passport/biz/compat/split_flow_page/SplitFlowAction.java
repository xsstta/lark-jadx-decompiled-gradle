package com.ss.lark.android.passport.biz.compat.split_flow_page;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import kotlin.Metadata;

@RouterAnno(name = "recover_account_choose")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016JJ\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/split_flow_page/SplitFlowAction;", "Lcom/ss/android/lark/passport/infra/base/router/BaseRouterAction;", "()V", "TAG", "", "getName", "run", "", "context", "Landroid/content/Context;", "nextStep", "stepInfo", "Lcom/alibaba/fastjson/JSONObject;", "scene", "", "backFirst", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/router/IRouterCallback;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.a */
public final class SplitFlowAction extends AbstractC49088b {

    /* renamed from: b */
    public static final SplitFlowAction f162761b = new SplitFlowAction();

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "SplitFlowAction";
    }

    private SplitFlowAction() {
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        C49092f.m193532a(context, "verify_choose", jSONObject, i, uniContext, this.f123291a, aVar);
    }
}
