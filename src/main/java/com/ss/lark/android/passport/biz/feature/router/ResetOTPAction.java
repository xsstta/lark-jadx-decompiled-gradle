package com.ss.lark.android.passport.biz.feature.router;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a;
import com.ss.lark.android.passport.biz.utils.C65251f;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@RouterAnno(name = "reset_otp")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002JJ\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/router/ResetOTPAction;", "Lcom/ss/android/lark/passport/infra/base/router/BaseRouterAction;", "()V", "KEY_JSON_FILED_URL", "", "TAG", "getName", "loge", "", "msg", "run", "context", "Landroid/content/Context;", "nextStep", "stepInfo", "Lcom/alibaba/fastjson/JSONObject;", "scene", "", "backFirst", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/router/IRouterCallback;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.b.c */
public final class ResetOTPAction extends AbstractC49088b {

    /* renamed from: b */
    public static final ResetOTPAction f163150b = new ResetOTPAction();

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "OTP_RESET";
    }

    private ResetOTPAction() {
    }

    /* renamed from: a */
    private final void m254027a(String str) {
        this.f123291a.mo171471d("OTP_RESET", str);
    }

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    public void mo171380a(Context context, String str, JSONObject jSONObject, int i, boolean z, UniContext uniContext, AbstractC49336a aVar) {
        boolean z2;
        if (context == null) {
            m254027a("context is null");
        } else if (jSONObject != null) {
            String string = jSONObject.getString("url");
            String str2 = string;
            if (str2 == null || StringsKt.isBlank(str2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                m254027a("url is null or blank");
                return;
            }
            C65251f.m256142b(context, string, this.f123291a);
            if (aVar != null) {
                aVar.onRouterResult(-100, null);
            }
        } else {
            m254027a("step info is null");
        }
    }
}
