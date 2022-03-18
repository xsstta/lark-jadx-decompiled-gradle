package com.ss.lark.android.passport.biz.compat.reset_pwd.mvp;

import android.content.Intent;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a;
import com.ss.android.lark.passport.infra.base.network.model.RsaInfo;
import com.ss.android.lark.passport.infra.base.router.C49092f;
import com.ss.android.lark.passport.infra.base.router.RouterFieldAnno;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetPwdStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.C64483a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SetPwdData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\tH\u0016J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/mvp/SetPasswordModel;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/BaseModel;", "Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract$IModel;", "intent", "Landroid/content/Intent;", "(Landroid/content/Intent;)V", "getIntent", "()Landroid/content/Intent;", "stepInfo", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/model/SetPwdStepInfo;", "create", "", "getStepInfo", "setPwdFinish", "password", "", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/SetPwdData;", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.a */
public class SetPasswordModel extends C49020a implements ISetPasswordContract.IModel {

    /* renamed from: c */
    public static final Companion f162736c = new Companion(null);

    /* renamed from: f */
    private static final String f162737f = f162737f;
    @RouterFieldAnno

    /* renamed from: d */
    private SetPwdStepInfo f162738d;

    /* renamed from: e */
    private final Intent f162739e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/mvp/SetPasswordModel$Companion;", "", "()V", "TAG", "", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IModel
    public SetPwdStepInfo ce_() {
        return this.f162738d;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d, com.ss.android.lark.passport.infra.base.architecture.p2424a.C49020a
    /* renamed from: a */
    public void mo171169a() {
        super.mo171169a();
        C49092f.m193525a(this, this.f162739e);
    }

    public SetPasswordModel(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        this.f162739e = intent;
    }

    @Override // com.ss.lark.android.passport.biz.compat.reset_pwd.ISetPasswordContract.IModel
    /* renamed from: a */
    public void mo222999a(String str, AbstractC49352d<SetPwdData> dVar) {
        RsaInfo rsaInfo;
        int i;
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, "password");
        C64483a a = C64483a.m253375a();
        SetPwdStepInfo setPwdStepInfo = this.f162738d;
        if (setPwdStepInfo != null) {
            rsaInfo = setPwdStepInfo.rsaInfo;
        } else {
            rsaInfo = null;
        }
        SetPwdStepInfo setPwdStepInfo2 = this.f162738d;
        if (setPwdStepInfo2 != null) {
            i = setPwdStepInfo2.sourceType;
        } else {
            i = 0;
        }
        UniContext ci_ = ci_();
        PassportLog passportLog = this.f123075b;
        SetPwdStepInfo setPwdStepInfo3 = this.f162738d;
        if (setPwdStepInfo3 != null) {
            z = setPwdStepInfo3.fromRecoverAccount;
        } else {
            z = false;
        }
        mo171171a(a.mo223130a(str, rsaInfo, i, ci_, passportLog, z, dVar));
    }
}
