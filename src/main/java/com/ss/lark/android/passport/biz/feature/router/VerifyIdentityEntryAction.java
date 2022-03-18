package com.ss.lark.android.passport.biz.feature.router;

import com.ss.android.lark.passport.infra.base.router.AbstractC49088b;
import com.ss.android.lark.passport.infra.base.router.RouterAnno;
import kotlin.Metadata;

@RouterAnno(name = "verify_identity_new")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016JJ\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/lark/android/passport/biz/feature/router/VerifyIdentityEntryAction;", "Lcom/ss/android/lark/passport/infra/base/router/BaseRouterAction;", "()V", "TAG", "", "getName", "run", "", "context", "Landroid/content/Context;", "nextStep", "stepInfo", "Lcom/alibaba/fastjson/JSONObject;", "scene", "", "backFirst", "", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/router/IRouterCallback;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.feature.b.d */
public final class VerifyIdentityEntryAction extends AbstractC49088b {

    /* renamed from: b */
    public static final VerifyIdentityEntryAction f163151b = new VerifyIdentityEntryAction();

    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: c */
    public String mo171383c() {
        return "VerifyIdentityEntryAction";
    }

    private VerifyIdentityEntryAction() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r8.equals("verify_identity_new") == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        if (r8.equals("verify_code") != false) goto L_0x004b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061  */
    @Override // com.ss.android.lark.passport.infra.base.router.AbstractC49088b, com.ss.android.lark.passport.infra.base.router.AbstractC49090d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo171380a(android.content.Context r7, java.lang.String r8, com.alibaba.fastjson.JSONObject r9, int r10, boolean r11, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext r12, com.ss.android.lark.passport.signinsdk_api.p2453a.AbstractC49336a r13) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.lark.android.passport.biz.feature.router.VerifyIdentityEntryAction.mo171380a(android.content.Context, java.lang.String, com.alibaba.fastjson.JSONObject, int, boolean, com.ss.android.lark.passport.signinsdk_api.base.log.UniContext, com.ss.android.lark.passport.signinsdk_api.a.a):void");
    }
}
