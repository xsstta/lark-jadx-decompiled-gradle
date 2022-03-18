package com.ss.lark.android.passport.biz.feature.create_team.mvp;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1178x;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.p085b.C2219g;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.model.C49121a;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49185d;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.infra.util.ImeObserver;
import com.ss.android.lark.passport.infra.util.ak;
import com.ss.android.lark.passport.infra.util.p2441c.C49173f;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.SigninParams;
import com.ss.android.lark.utils.UIHelper;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.C64482a;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.IndustryInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.TenantCreateStepInfo;
import com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.CommonEditInput;
import com.ss.lark.android.passport.biz.widget.CommonPickInput;
import com.ss.lark.android.passport.biz.widget.picker.C65329b;
import java.util.ArrayList;
import java.util.List;

public class CreateTeamView extends AbstractC49023c<C64767c.AbstractC64769b.AbstractC64770a> implements C64767c.AbstractC64769b {

    /* renamed from: c */
    protected final Activity f163306c;

    /* renamed from: d */
    public C64767c.AbstractC64769b.AbstractC64770a f163307d;

    /* renamed from: e */
    public String f163308e;

    /* renamed from: f */
    public String f163309f;

    /* renamed from: g */
    public C65329b f163310g;

    /* renamed from: h */
    public C65329b f163311h;

    /* renamed from: i */
    public TenantCreateStepInfo f163312i;

    /* renamed from: j */
    private UniContext f163313j;
    @BindView(6681)
    ConstraintLayout llContainer;
    @BindView(6303)
    Button mBtnNext;
    @BindView(6338)
    ViewGroup mContainer;
    @BindView(6574)
    AppCompatImageView mCreateTeamView;
    @BindView(6471)
    CommonEditInput mEtTeam;
    @BindView(6473)
    CommonEditInput mEtUserName;
    @BindView(6865)
    CommonPickInput mGroupScale;
    @BindView(6866)
    CommonPickInput mIndustryDetail;
    @BindView(6567)
    ImageView mIvBack;
    @BindView(7242)
    TextView mTvSubTitle;
    @BindView(7246)
    TextView mTvTitle;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163307d = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163313j;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        ButterKnife.bind(this, this.f163306c);
        m254321g();
    }

    @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64769b
    /* renamed from: d */
    public void mo223622d() {
        Activity activity = this.f163306c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64769b
    /* renamed from: e */
    public void mo223623e() {
        Activity activity = this.f163306c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: f */
    public void mo223624f() {
        this.mBtnNext.setEnabled(this.f163307d.mo223643b(this.mEtTeam.getContent().trim(), this.mEtUserName.getContent().trim(), this.mGroupScale.getContent().trim(), this.mIndustryDetail.getContent().trim()));
    }

    /* renamed from: g */
    private void m254321g() {
        this.mIndustryDetail.setInputHint(this.f163306c.getString(R.string.Lark_Passport_TeamInfoIndustryDropdown));
        this.mGroupScale.setInputHint(this.f163306c.getString(R.string.Lark_Passport_TeamInfoScaleDropdown));
        this.mEtTeam.setInputHint(this.f163306c.getString(R.string.Lark_Login_V3_Input_TenantName_Placeholder));
        this.mEtTeam.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.C647532 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                CreateTeamView.this.mBtnNext.setEnabled(CreateTeamView.this.f163307d.mo223643b(CreateTeamView.this.mEtTeam.getContent().trim(), CreateTeamView.this.mEtUserName.getContent().trim(), CreateTeamView.this.mGroupScale.getContent().trim(), CreateTeamView.this.mIndustryDetail.getContent().trim()));
            }
        });
        this.mEtUserName.setOnInputContentListener(new AbstractC65288b.AbstractC65294f() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.C647543 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65294f
            /* renamed from: a */
            public void mo222970a(String str) {
                CreateTeamView.this.mo223624f();
            }
        });
        String d = C49121a.m193727a().mo171511d(2);
        if (!TextUtils.isEmpty(d)) {
            this.mEtUserName.setInputHint(d);
        } else {
            this.mEtUserName.setInputHint(this.f163306c.getString(R.string.Lark_Login_V3_Input_RealName_Placeholder));
        }
        ak.m193850a(this.mBtnNext, new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.View$OnClickListenerC647554 */

            public void onClick(View view) {
                CreateTeamView.this.f163307d.mo223641a(CreateTeamView.this.mEtUserName.getContent(), CreateTeamView.this.mEtTeam.getContent(), CreateTeamView.this.f163308e, CreateTeamView.this.f163309f);
            }
        });
        this.mBtnNext.setEnabled(false);
        this.mIvBack.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.View$OnClickListenerC647565 */

            public void onClick(View view) {
                if (C49203q.m193977c(CreateTeamView.this.f163306c)) {
                    C49203q.m193973a((Context) CreateTeamView.this.f163306c);
                }
                if (CreateTeamView.this.f163312i != null && CreateTeamView.this.f163312i.fromGuide) {
                    ServiceFinder.m193748c().openLogin(CreateTeamView.this.f163306c, SigninParams.newBuilder().mo172353c(true).mo172351b(true).mo172350a());
                }
                CreateTeamView.this.f163306c.finish();
            }
        });
        this.mIndustryDetail.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.View$OnClickListenerC647576 */

            public void onClick(View view) {
                CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_industry", "click");
                CreateTeamView.this.mEtTeam.clearFocus();
                CreateTeamView.this.mEtUserName.clearFocus();
                C49203q.m193974a(CreateTeamView.this.f163306c, CreateTeamView.this.mEtTeam);
                C49203q.m193974a(CreateTeamView.this.f163306c, CreateTeamView.this.mEtUserName);
                ArrayList arrayList = new ArrayList();
                arrayList.add(CreateTeamView.this.f163306c.getString(R.string.Lark_Passport_TeamInfoMainIndustryDropdownTab));
                arrayList.add(CreateTeamView.this.f163306c.getString(R.string.Lark_Passport_TeamInfoSubIndustryDropdownTab));
                ArrayList arrayList2 = new ArrayList();
                if (CreateTeamView.this.f163307d.mo223642b() == null) {
                    CreateTeamView.this.f123085b.mo171471d("n_action_tenant_prepare_select_industry", "IndustryDetailList is null");
                    return;
                }
                for (IndustryInfo industryInfo : CreateTeamView.this.f163307d.mo223642b()) {
                    arrayList2.add(industryInfo);
                }
                if (CreateTeamView.this.f163311h == null) {
                    CreateTeamView.this.f163311h = new C65329b.C65336a().mo224747a(CreateTeamView.this.f163306c).mo224749a(arrayList2).mo224751b(arrayList).mo224748a(new C65329b.AbstractC65339d() {
                        /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.View$OnClickListenerC647576.C647581 */

                        @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65339d
                        /* renamed from: a */
                        public void mo223629a() {
                            CreateTeamView.this.mIndustryDetail.mo224543a(false);
                            CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_industry", "onCanceled");
                        }

                        @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65339d
                        /* renamed from: a */
                        public void mo223630a(List<C65329b.AbstractC65337b> list) {
                            if (list == null || list.size() < 2) {
                                CreateTeamView.this.f123085b.mo171471d("n_action_tenant_prepare_select_industry", "industry code is Error");
                                return;
                            }
                            String key = list.get(0).getKey();
                            String key2 = list.get(1).getKey();
                            if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(key2)) {
                                CreateTeamView createTeamView = CreateTeamView.this;
                                if (!key.equals(key2)) {
                                    key = key.concat("-").concat(key2);
                                }
                                createTeamView.f163309f = key;
                            }
                            CreateTeamView.this.mIndustryDetail.setInputText(list.get(1).getContent());
                            CreateTeamView.this.mo223624f();
                            CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_industry", "onPicked");
                        }
                    }).mo224750a();
                }
                CreateTeamView.this.mIndustryDetail.mo224543a(true);
                CreateTeamView.this.f163311h.mo224738a(CreateTeamView.this.llContainer);
                CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_industry", "IndustryDetailList show success");
            }
        });
        this.mGroupScale.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.View$OnClickListenerC647597 */

            public void onClick(View view) {
                CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_scale", "click");
                CreateTeamView.this.mEtTeam.clearFocus();
                CreateTeamView.this.mEtUserName.clearFocus();
                C49203q.m193974a(CreateTeamView.this.f163306c, CreateTeamView.this.mEtTeam);
                C49203q.m193974a(CreateTeamView.this.f163306c, CreateTeamView.this.mEtUserName);
                ArrayList arrayList = new ArrayList();
                arrayList.add(CreateTeamView.this.f163306c.getString(R.string.Lark_Passport_TeamInfoScaleDropdownTab));
                ArrayList arrayList2 = new ArrayList();
                if (CreateTeamView.this.f163307d.mo223640a() == null) {
                    CreateTeamView.this.f123085b.mo171471d("n_action_tenant_prepare_select_scale", "GroupScaleList is null");
                    return;
                }
                for (C64482a aVar : CreateTeamView.this.f163307d.mo223640a()) {
                    arrayList2.add(aVar);
                }
                if (CreateTeamView.this.f163310g == null) {
                    CreateTeamView.this.f163310g = new C65329b.C65336a().mo224747a(CreateTeamView.this.f163306c).mo224751b(arrayList).mo224749a(arrayList2).mo224748a(new C65329b.AbstractC65339d() {
                        /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.View$OnClickListenerC647597.C647601 */

                        @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65339d
                        /* renamed from: a */
                        public void mo223629a() {
                            CreateTeamView.this.mGroupScale.mo224543a(false);
                            CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_scale", "onCanceled");
                        }

                        @Override // com.ss.lark.android.passport.biz.widget.picker.C65329b.AbstractC65339d
                        /* renamed from: a */
                        public void mo223630a(List<C65329b.AbstractC65337b> list) {
                            if (list == null || list.size() < 1) {
                                CreateTeamView.this.f123085b.mo171471d("n_action_tenant_prepare_select_scale", "industry code is Error");
                                return;
                            }
                            CreateTeamView.this.f163308e = list.get(0).getKey();
                            CreateTeamView.this.mGroupScale.setInputText(list.get(0).getContent());
                            CreateTeamView.this.mo223624f();
                            CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_scale", "onPicked");
                        }
                    }).mo224750a();
                }
                CreateTeamView.this.mGroupScale.mo224543a(true);
                CreateTeamView.this.f163310g.mo224738a(CreateTeamView.this.llContainer);
                CreateTeamView.this.f123085b.mo171465b("n_action_tenant_prepare_select_scale", "show success");
            }
        });
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163313j = uniContext;
    }

    public CreateTeamView(AppCompatActivity appCompatActivity) {
        this.f163306c = appCompatActivity;
        ImeObserver.m193958a(appCompatActivity).f123495c.mo5923a(appCompatActivity, new AbstractC1178x<ImeObserver.ImeInfo>() {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.C647521 */

            /* renamed from: a */
            public void onChanged(ImeObserver.ImeInfo bVar) {
                CreateTeamView.this.mo223621c(bVar.f123499a);
            }
        });
    }

    /* renamed from: a */
    public void mo171188a(C64767c.AbstractC64769b.AbstractC64770a aVar) {
        this.f163307d = aVar;
    }

    /* renamed from: b */
    public void mo223620b(boolean z) {
        if (z) {
            Activity activity = this.f163306c;
            RomUtils.m94934a(activity, activity.getWindow());
            return;
        }
        Activity activity2 = this.f163306c;
        RomUtils.m94941b(activity2, activity2.getWindow());
    }

    /* renamed from: c */
    public void mo223621c(boolean z) {
        if (this.mCreateTeamView.getVisibility() == 0) {
            if (z) {
                m254320d(true);
            } else {
                m254320d(false);
            }
        }
    }

    /* renamed from: a */
    public void mo223619a(boolean z) {
        int i;
        Drawable drawable = this.mIvBack.getDrawable();
        if (drawable != null) {
            if (z) {
                i = R.color.static_black;
            } else {
                i = R.color.icon_n1;
            }
            drawable.mutate().setTint(UDColorUtils.getColor(this.f163306c, i));
        }
    }

    /* renamed from: d */
    private void m254320d(boolean z) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        if (z) {
            AppCompatImageView appCompatImageView = this.mCreateTeamView;
            objectAnimator = ObjectAnimator.ofFloat(appCompatImageView, "translationY", (float) (-appCompatImageView.getHeight()));
            objectAnimator2 = ObjectAnimator.ofFloat(this.mContainer, "translationY", (float) (-((this.mCreateTeamView.getHeight() - this.mIvBack.getHeight()) - C49154ag.m193838b((Context) this.f163306c, (int) R.dimen.dp_20))));
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.mCreateTeamView, "translationY", 0.0f);
            objectAnimator2 = ObjectAnimator.ofFloat(this.mContainer, "translationY", 0.0f);
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(z) {
            /* class com.ss.lark.android.passport.biz.feature.create_team.mvp.CreateTeamView.C647618 */

            /* renamed from: a */
            final /* synthetic */ boolean f163323a;

            /* renamed from: c */
            private boolean f163325c;

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int a = C49173f.m193885a((View) CreateTeamView.this.mCreateTeamView, true);
                int a2 = C49173f.m193885a((View) CreateTeamView.this.mIvBack, true);
                if (CreateTeamView.this.mIvBack.getDrawable() != null) {
                    if (this.f163323a) {
                        if (a < a2 && this.f163325c) {
                            this.f163325c = false;
                            CreateTeamView.this.mo223619a(false);
                            CreateTeamView createTeamView = CreateTeamView.this;
                            createTeamView.mo223620b(true ^ UDUiModeUtils.m93319a(createTeamView.f163306c));
                        }
                    } else if (a > a2 && !this.f163325c) {
                        this.f163325c = true;
                        CreateTeamView.this.mo223619a(true);
                        CreateTeamView.this.mo223620b(true);
                    }
                }
            }

            {
                this.f163323a = r2;
                this.f163325c = r2;
            }
        });
        objectAnimator.setDuration(300L);
        objectAnimator2.setDuration(300L);
        objectAnimator.start();
        objectAnimator2.start();
    }

    @Override // com.ss.lark.android.passport.biz.feature.create_team.mvp.C64767c.AbstractC64769b
    /* renamed from: a */
    public void mo223617a(TenantCreateStepInfo tenantCreateStepInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        CommonPickInput commonPickInput;
        CommonPickInput commonPickInput2;
        if (tenantCreateStepInfo == null) {
            this.f123085b.mo171471d("n_page_tenant_prepare_start", "stepInfo is null");
            return;
        }
        this.f163312i = tenantCreateStepInfo;
        UniContext uniContext = this.f163313j;
        if (uniContext != null) {
            uniContext.appendOneTimeParam("title", tenantCreateStepInfo.title).appendOneTimeParam("subTitle", tenantCreateStepInfo.subTitle).appendOneTimeParam("missNextStep", "false");
        }
        CommonEditInput commonEditInput = this.mEtTeam;
        if (tenantCreateStepInfo.tenantNameInput != null) {
            i = 0;
        } else {
            i = 8;
        }
        commonEditInput.setVisibility(i);
        CommonEditInput commonEditInput2 = this.mEtUserName;
        if (tenantCreateStepInfo.nameInput != null) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        commonEditInput2.setVisibility(i2);
        CommonPickInput commonPickInput3 = this.mIndustryDetail;
        if (tenantCreateStepInfo.industryTypeInput != null) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        commonPickInput3.setVisibility(i3);
        CommonPickInput commonPickInput4 = this.mGroupScale;
        if (tenantCreateStepInfo.staffSizeInput != null) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        commonPickInput4.setVisibility(i4);
        String str = tenantCreateStepInfo.title;
        String str2 = tenantCreateStepInfo.subTitle;
        if (!TextUtils.isEmpty(str)) {
            this.mTvTitle.setText(str);
        }
        C49226y.m194061a(this.f163306c, this.mTvSubTitle, str2, null, this.f123085b);
        if (!TextUtils.isEmpty(str2)) {
            this.mTvSubTitle.setText(UIHelper.mustacheFormat(str2, "BrandName", C49185d.m193928b(this.f163306c)));
        }
        if (tenantCreateStepInfo.nextButton != null) {
            this.mBtnNext.setText(tenantCreateStepInfo.nextButton.text);
        }
        if (tenantCreateStepInfo.nameInput != null) {
            this.mEtUserName.setInputHint(tenantCreateStepInfo.nameInput.placeHolder);
        }
        if (tenantCreateStepInfo.tenantNameInput != null) {
            this.mEtTeam.setInputHint(tenantCreateStepInfo.tenantNameInput.placeHolder);
        }
        if (!(tenantCreateStepInfo.industryTypeInput == null || (commonPickInput2 = this.mIndustryDetail) == null || commonPickInput2.mContentInput == null)) {
            this.mIndustryDetail.mContentInput.setHint(tenantCreateStepInfo.industryTypeInput.placeHolder);
        }
        if (!(tenantCreateStepInfo.staffSizeInput == null || (commonPickInput = this.mGroupScale) == null || commonPickInput.mContentInput == null)) {
            this.mGroupScale.mContentInput.setHint(tenantCreateStepInfo.staffSizeInput.placeHolder);
        }
        if (TextUtils.isEmpty(tenantCreateStepInfo.img)) {
            this.mCreateTeamView.setVisibility(8);
            return;
        }
        mo223619a(true);
        mo223620b(true);
        ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9139a(this.f163306c).mo10414a(new C2219g(tenantCreateStepInfo.img)).mo11150h()).mo11144c(C49154ag.m193839c(this.f163306c), UIHelper.dp2px(270.0f))).mo11143c(R.drawable.signin_sdk_create_new_team)).mo11145c(false)).mo10399a((ImageView) this.mCreateTeamView);
    }
}
