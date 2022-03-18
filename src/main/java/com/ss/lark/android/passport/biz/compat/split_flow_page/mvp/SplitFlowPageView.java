package com.ss.lark.android.passport.biz.compat.split_flow_page.mvp;

import android.app.Activity;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import com.alibaba.fastjson.JSONObject;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49153af;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.statistics.Statistics;
import com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.SpliteStepInfo;
import org.json.JSONException;

public class SplitFlowPageView implements C64450a.AbstractC64452b {

    /* renamed from: a */
    public C64450a.AbstractC64452b.AbstractC64453a f162762a;

    /* renamed from: b */
    private final Activity f162763b;

    /* renamed from: c */
    private AbstractC64449a f162764c;

    /* renamed from: d */
    private PassportLog f162765d;
    @BindView(6567)
    public ImageView ivBack;
    @BindView(6670)
    public LinearLayout llFaceVerify;
    @BindView(7220)
    public TextView tvBottomTitle;
    @BindView(7193)
    public TextView tvFaceVerify;
    @BindView(7243)
    public TextView tvSubTitle;
    @BindView(7246)
    public TextView tvTitle;

    /* renamed from: com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.SplitFlowPageView$a */
    public interface AbstractC64449a {
        /* renamed from: a */
        void mo223020a(SplitFlowPageView splitFlowPageView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public /* synthetic */ void mo171186a(UniContext uniContext) {
        AbstractC49027g.CC.$default$a(this, uniContext);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public /* synthetic */ UniContext mo171187c() {
        return AbstractC49027g.CC.$default$c(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f162764c.mo223020a(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f162762a = null;
        this.f162764c = null;
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b
    /* renamed from: f */
    public void mo223029f() {
        this.f162763b.finish();
    }

    /* renamed from: g */
    public void mo223030g() {
        this.f162763b.finish();
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b
    /* renamed from: d */
    public void mo223027d() {
        Activity activity = this.f162763b;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b
    /* renamed from: e */
    public void mo223028e() {
        Activity activity = this.f162763b;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171185a(PassportLog passportLog) {
        this.f162765d = passportLog;
    }

    /* renamed from: b */
    public int mo223026b(SpliteStepInfo spliteStepInfo) {
        if (spliteStepInfo == null || spliteStepInfo.next == null || spliteStepInfo.next.verifyFace == null) {
            return 0;
        }
        return spliteStepInfo.next.verifyFace.sourceType;
    }

    /* renamed from: c */
    private void m253269c(SpliteStepInfo spliteStepInfo) {
        switch (mo223026b(spliteStepInfo)) {
            case HwBuildEx.VersionCodes.EMUI_5_1:
            case 13:
                C49226y.m194061a(this.f162763b, this.tvBottomTitle, spliteStepInfo.bottomTitle, null, this.f162765d);
                return;
            case 14:
                C49226y.m194062a(this.f162763b, this.tvBottomTitle, spliteStepInfo.bottomTitle, (JSONObject) null, mo171187c(), this.f162765d, new C49226y.AbstractC49228a() {
                    /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.SplitFlowPageView.C644483 */

                    @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                    /* renamed from: a */
                    public /* synthetic */ boolean mo171752a(TextPaint textPaint) {
                        return C49226y.AbstractC49228a.CC.$default$a(this, textPaint);
                    }

                    @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                    /* renamed from: a */
                    public boolean mo171753a(String str) {
                        if (TextUtils.isEmpty(str)) {
                            return false;
                        }
                        SplitFlowPageView.this.f162762a.mo223043b();
                        return true;
                    }
                });
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public void mo171188a(C64450a.AbstractC64452b.AbstractC64453a aVar) {
        this.f162762a = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b
    /* renamed from: a */
    public void mo223023a(final SpliteStepInfo spliteStepInfo) {
        if (spliteStepInfo == null) {
            this.f162765d.mo171471d("SplitFlowPageView", "The info is null");
            return;
        }
        mo223024a(spliteStepInfo, "FaceVerification_Show", false);
        ak.m193850a(this.llFaceVerify, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.SplitFlowPageView.View$OnClickListenerC644461 */

            public void onClick(View view) {
                SplitFlowPageView.this.mo223024a(spliteStepInfo, "Face_Verification_Click", false);
                SplitFlowPageView.this.f162762a.mo223042a();
            }
        });
        ak.m193850a(this.ivBack, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.SplitFlowPageView.View$OnClickListenerC644472 */

            public void onClick(View view) {
                if (SplitFlowPageView.this.mo223026b(spliteStepInfo) == 12 || SplitFlowPageView.this.mo223026b(spliteStepInfo) == 13) {
                    SplitFlowPageView.this.mo223021a(new BaseStepData(), false);
                } else {
                    SplitFlowPageView.this.mo223030g();
                }
            }
        });
        this.tvTitle.setText(spliteStepInfo.title);
        if (!TextUtils.isEmpty(spliteStepInfo.buttonTitle)) {
            this.tvFaceVerify.setText(spliteStepInfo.buttonTitle);
        }
        mo223025a(spliteStepInfo.name, spliteStepInfo.subTitle);
        if (!TextUtils.isEmpty(spliteStepInfo.bottomTitle)) {
            this.tvBottomTitle.setText(spliteStepInfo.bottomTitle);
            this.tvBottomTitle.setVisibility(0);
            m253269c(spliteStepInfo);
        }
    }

    public SplitFlowPageView(Activity activity, AbstractC64449a aVar) {
        this.f162763b = activity;
        this.f162764c = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b
    /* renamed from: a */
    public void mo223021a(BaseStepData baseStepData, boolean z) {
        if (!z) {
            this.f162763b.setResult(0, null);
        } else if (baseStepData != null) {
            LKUIToast.show(this.f162763b, baseStepData.message);
            this.f162763b.setResult(-1, null);
        } else {
            return;
        }
        this.f162763b.finish();
    }

    /* renamed from: a */
    public void mo223025a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                this.tvSubTitle.setText(str2);
            }
        } else if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String a = C49153af.m193826a(this.f162763b, str2, "user_name", str, this.f162765d);
            SpannableString spannableString = new SpannableString(a);
            int indexOf = a.indexOf(str);
            if (indexOf >= 0 && str.length() + indexOf <= spannableString.length()) {
                spannableString.setSpan(new ForegroundColorSpan(C49154ag.m193840c(this.f162763b, R.color.text_title)), indexOf, str.length() + indexOf, 33);
                spannableString.setSpan(new StyleSpan(1), indexOf, str.length() + indexOf, 33);
            }
            this.tvSubTitle.setText(spannableString);
        }
    }

    @Override // com.ss.lark.android.passport.biz.compat.split_flow_page.mvp.C64450a.AbstractC64452b
    /* renamed from: a */
    public void mo223024a(SpliteStepInfo spliteStepInfo, String str, boolean z) {
        String str2;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("source_type", mo223026b(spliteStepInfo));
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -612341308) {
                if (hashCode != -80756444) {
                    if (hashCode == 600765286) {
                        if (str.equals("Face_Verification_Click")) {
                            c = 1;
                        }
                    }
                } else if (str.equals("FaceVerification_Result")) {
                    c = 2;
                }
            } else if (str.equals("FaceVerification_Show")) {
                c = 0;
            }
            if (c == 0) {
                Statistics.sendEvent("passport_FaceVerification_Show", jSONObject);
            } else if (c == 1) {
                Statistics.sendEvent("face_verification_click", jSONObject);
            } else if (c == 2) {
                if (z) {
                    str2 = "success";
                } else {
                    str2 = "fail";
                }
                jSONObject.put("result", str2);
                Statistics.sendEvent("passport_FaceVerification_Result", jSONObject);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
