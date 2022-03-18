package com.ss.lark.android.passport.biz.compat.reset_pwd;

import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49025e;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SetPwdStepInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese.SetPwdData;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract;", "", "()V", "IModel", "IView", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a */
public final class ISetPasswordContract {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH&¨\u0006\u000b"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract$IModel;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IModel;", "getStepInfo", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/model/SetPwdStepInfo;", "setPwdFinish", "", "password", "", "callback", "Lcom/ss/android/lark/passport/signinsdk_api/base/IGetDataCallback;", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/network/responese/SetPwdData;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a$a */
    public interface IModel extends AbstractC49025e {
        /* renamed from: a */
        void mo222999a(String str, AbstractC49352d<SetPwdData> dVar);

        SetPwdStepInfo ce_();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eJ\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0004H&J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0004H&¨\u0006\u000f"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract$IView;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView;", "Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract$IView$Delegate;", "clearPwd", "", "clearTextFocus", "hideLoadingView", "initView", "stepInfo", "Lcom/ss/lark/android/passport/biz/compat/v2/featurec/model/SetPwdStepInfo;", "showCommonToast", "content", "", "showLoadingView", "Delegate", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a$b */
    public interface IView extends AbstractC49027g<Delegate> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/compat/reset_pwd/ISetPasswordContract$IView$Delegate;", "Lcom/ss/android/lark/passport/infra/base/architecture/mvp/IView$IViewDelegate;", "clickFinish", "", "pwd", "", "pwdAgain", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.lark.android.passport.biz.compat.reset_pwd.a$b$a */
        public interface Delegate extends AbstractC49027g.AbstractC49028a {
            /* renamed from: a */
            void mo223006a(String str, String str2);
        }

        /* renamed from: a */
        void mo223001a(SetPwdStepInfo setPwdStepInfo);

        /* renamed from: d */
        void mo223002d();

        /* renamed from: e */
        void mo223003e();

        /* renamed from: f */
        void mo223004f();

        /* renamed from: g */
        void mo223005g();
    }
}
