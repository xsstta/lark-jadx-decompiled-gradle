package com.ss.lark.android.passport.biz.feature.set;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.AbstractC0203c;
import androidx.activity.OnBackPressedDispatcher;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.C49029b;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49202p;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.entity.PwdSetPwdStepInfo;
import com.ss.lark.android.passport.biz.feature.set.mvp.C64979b;
import com.ss.lark.android.passport.biz.feature.set.mvp.C64980c;
import com.ss.lark.android.passport.biz.feature.set.mvp.SetNewPasswordView;
import java.util.Map;

/* renamed from: com.ss.lark.android.passport.biz.feature.set.a */
public class C64965a extends C49029b {

    /* renamed from: e */
    public SetNewPasswordView f163696e;

    /* renamed from: f */
    private C64980c f163697f;

    /* renamed from: g */
    private CommonUiContainer f163698g;

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.passport.infra.base.architecture.C49029b
    /* renamed from: b */
    public String mo171190b() {
        return "SetNewPasswordFragment";
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C64980c cVar = this.f163697f;
        if (cVar != null) {
            cVar.cn_();
        }
        super.onDestroy();
    }

    /* renamed from: d */
    private void m255090d() {
        PwdSetPwdStepInfo pwdSetPwdStepInfo = (PwdSetPwdStepInfo) m255089a(getArguments(), PwdSetPwdStepInfo.class, null, this.f123087b);
        this.f163696e = new SetNewPasswordView(getActivity(), this.f163698g, pwdSetPwdStepInfo);
        C64980c cVar = new C64980c(new C64979b(pwdSetPwdStepInfo), this.f163696e, getActivity(), this.f123086a, pwdSetPwdStepInfo, this.f123087b);
        this.f163697f = cVar;
        cVar.mo171169a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m255090d();
        final OnBackPressedDispatcher onBackPressedDispatcher = getActivity().getOnBackPressedDispatcher();
        onBackPressedDispatcher.addCallback(new AbstractC0203c(true) {
            /* class com.ss.lark.android.passport.biz.feature.set.C64965a.C649661 */

            @Override // androidx.activity.AbstractC0203c
            public void handleOnBackPressed() {
                if (!C64965a.this.f163696e.mo223999i()) {
                    setEnabled(false);
                    onBackPressedDispatcher.onBackPressed();
                }
            }
        });
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CommonUiContainer a = CommonUiContainer.m252968a(requireActivity(), (int) R.layout.fragment_set_new_password, viewGroup, false);
        this.f163698g = a;
        return a.f162613b;
    }

    /* renamed from: a */
    private static <T> T m255089a(Bundle bundle, Class<T> cls, UniContext uniContext, PassportLog passportLog) {
        if (bundle == null) {
            passportLog.mo171465b("PwdManagerRouterAction", "getStepInfo, null bundle");
            return null;
        }
        Map map = (Map) bundle.getSerializable("step_info");
        if (map != null) {
            return (T) C49202p.m193967a(new JSONObject(map), cls);
        }
        passportLog.mo171465b("PwdManagerRouterAction", "map, null bundle");
        return null;
    }
}
