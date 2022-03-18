package com.ss.lark.android.passport.biz.feature.bio_auth.mvp;

import android.app.Activity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import com.alibaba.fastjson.JSONObject;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.statistics.StatisticsHelper;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.widget.CommonTitleBar;
import com.ss.android.lark.passport.signinsdk_api.base.BaseStepData;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.BioStepInfo;
import com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c;

public class BioAuthView extends AbstractC49023c<C64675c.AbstractC64677b.AbstractC64678a> implements C64675c.AbstractC64677b {
    @BindView(6297)
    public Button btnFaceVerify;

    /* renamed from: c */
    public C64675c.AbstractC64677b.AbstractC64678a f163156c;

    /* renamed from: d */
    private final Activity f163157d;

    /* renamed from: e */
    private AbstractC64667a f163158e;
    @BindView(7040)
    public CommonTitleBar titleBar;
    @BindView(7220)
    public TextView tvBottomTitle;
    @BindView(7243)
    public TextView tvSubTitle;
    @BindView(7246)
    public TextView tvTitle;

    /* renamed from: com.ss.lark.android.passport.biz.feature.bio_auth.mvp.BioAuthView$a */
    public interface AbstractC64667a {
        /* renamed from: a */
        void mo223455a(BioAuthView bioAuthView);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        this.f163158e.mo223455a(this);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163156c = null;
        this.f163158e = null;
    }

    /* renamed from: f */
    public void mo223461f() {
        this.f163157d.finish();
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64677b
    /* renamed from: g */
    public void mo223462g() {
        this.f163157d.finish();
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64677b
    /* renamed from: d */
    public void mo223459d() {
        Activity activity = this.f163157d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64677b
    /* renamed from: e */
    public void mo223460e() {
        Activity activity = this.f163157d;
        if (activity instanceof BaseActivity) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: a */
    public void mo171188a(C64675c.AbstractC64677b.AbstractC64678a aVar) {
        this.f163156c = aVar;
    }

    /* renamed from: c */
    private String m254046c(BioStepInfo bioStepInfo) {
        if (bioStepInfo == null || bioStepInfo.mSwitchButton == null) {
            return "";
        }
        return bioStepInfo.mSwitchButton.text;
    }

    /* renamed from: b */
    private void m254045b(final BioStepInfo bioStepInfo) {
        String str = bioStepInfo.mFlowType;
        str.hashCode();
        if (str.equals("bio_unbind") || str.equals("bio_bind")) {
            C49226y.m194061a(this.f163157d, this.tvBottomTitle, bioStepInfo.mAgreeDoc, null, this.f123085b);
        } else if (bioStepInfo.mSwitchButton != null) {
            C49226y.m194062a(this.f163157d, this.tvBottomTitle, m254046c(bioStepInfo), (JSONObject) null, (UniContext) null, this.f123085b, new C49226y.AbstractC49228a() {
                /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.BioAuthView.C646663 */

                @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                /* renamed from: a */
                public /* synthetic */ boolean mo171752a(TextPaint textPaint) {
                    return C49226y.AbstractC49228a.CC.$default$a(this, textPaint);
                }

                @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                /* renamed from: a */
                public boolean mo171753a(String str) {
                    if (bioStepInfo.mSwitchButton == null || bioStepInfo.mSwitchButton.next == null) {
                        return false;
                    }
                    BioAuthView.this.f163156c.mo223476b();
                    return true;
                }
            });
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64677b
    /* renamed from: a */
    public void mo223457a(final BioStepInfo bioStepInfo) {
        if (bioStepInfo == null) {
            this.f123085b.mo171471d("SplitFlowPageView", "The info is null");
            return;
        }
        ak.m193850a(this.btnFaceVerify, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.BioAuthView.View$OnClickListenerC646641 */

            public void onClick(View view) {
                StatisticsHelper.m193775a(new StatisticsHelper.StatisticsEvent("passport_face_verify_click").mo171607a("click", "face_verify").mo171607a("target", "none"));
                BioAuthView.this.f163156c.mo223474a();
            }
        });
        this.titleBar.setTitleClickListener(new CommonTitleBar.AbstractC49238b() {
            /* class com.ss.lark.android.passport.biz.feature.bio_auth.mvp.BioAuthView.C646652 */

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: b */
            public void mo171770b() {
            }

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: c */
            public void mo171771c() {
            }

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: d */
            public void mo171772d() {
            }

            @Override // com.ss.android.lark.passport.infra.widget.CommonTitleBar.AbstractC49238b
            /* renamed from: a */
            public void mo171769a() {
                if ("bio_unbind".equals(bioStepInfo.mFlowType)) {
                    BioAuthView.this.mo223456a(new BaseStepData(), false);
                } else {
                    BioAuthView.this.mo223461f();
                }
            }
        });
        this.tvTitle.setText(bioStepInfo.mTitle);
        if (!TextUtils.isEmpty(bioStepInfo.mNextButton.text)) {
            this.btnFaceVerify.setText(bioStepInfo.mNextButton.text);
        }
        this.tvSubTitle.setText(bioStepInfo.mSubTitle);
        if (!TextUtils.isEmpty(bioStepInfo.mAgreeDoc) || bioStepInfo.mSwitchButton != null) {
            this.tvBottomTitle.setVisibility(0);
            m254045b(bioStepInfo);
        }
    }

    public BioAuthView(Activity activity, AbstractC64667a aVar) {
        this.f163157d = activity;
        this.f163158e = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.bio_auth.mvp.C64675c.AbstractC64677b
    /* renamed from: a */
    public void mo223456a(BaseStepData baseStepData, boolean z) {
        if (!z) {
            this.f163157d.setResult(0, null);
        } else if (baseStepData != null) {
            this.f163157d.setResult(-1, null);
        } else {
            return;
        }
        this.f163157d.finish();
    }
}
