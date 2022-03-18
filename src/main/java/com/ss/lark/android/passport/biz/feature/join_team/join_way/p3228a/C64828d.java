package com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.entity.MenuInfo;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinTenantChooseInfo;
import com.ss.lark.android.passport.biz.entity.RegisterItem;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.CreateWayDialogFragment;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.JoinTeamStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64821a;
import com.ss.lark.android.passport.biz.widget.JoinWayItemView;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.join_way.a.d */
public class C64828d extends AbstractC49023c<C64821a.AbstractC64823b.AbstractC64824a> implements C64821a.AbstractC64823b {

    /* renamed from: c */
    public final FragmentActivity f163426c;

    /* renamed from: d */
    public C64821a.AbstractC64823b.AbstractC64824a f163427d;

    /* renamed from: e */
    public UniContext f163428e;

    /* renamed from: f */
    TextView f163429f;

    /* renamed from: g */
    TextView f163430g;

    /* renamed from: h */
    LinearLayout f163431h;

    /* renamed from: i */
    TextView f163432i;

    /* renamed from: j */
    TextView f163433j;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163427d = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m254563d();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163428e;
    }

    /* renamed from: d */
    private void m254563d() {
        this.f163429f = (TextView) this.f163426c.findViewById(R.id.tv_title);
        this.f163430g = (TextView) this.f163426c.findViewById(R.id.tv_sub_title);
        this.f163431h = (LinearLayout) this.f163426c.findViewById(R.id.llContainer);
        this.f163433j = (TextView) this.f163426c.findViewById(R.id.tvDescription);
        this.f163432i = (TextView) this.f163426c.findViewById(R.id.tvRegister);
    }

    public C64828d(FragmentActivity fragmentActivity) {
        this.f163426c = fragmentActivity;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163428e = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C64821a.AbstractC64823b.AbstractC64824a aVar) {
        this.f163427d = aVar;
    }

    /* renamed from: a */
    private void m254562a(List<MenuInfo> list) {
        this.f163431h.removeAllViews();
        for (final MenuInfo menuInfo : list) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C49154ag.m193828a((Context) this.f163426c, 80.0f));
            layoutParams.leftMargin = (int) this.f163426c.getResources().getDimension(R.dimen.signin_sdk_margin_16);
            layoutParams.rightMargin = (int) this.f163426c.getResources().getDimension(R.dimen.signin_sdk_margin_16);
            JoinWayItemView joinWayItemView = new JoinWayItemView(this.f163426c);
            joinWayItemView.setContent(menuInfo);
            this.f163431h.addView(joinWayItemView, layoutParams);
            joinWayItemView.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64828d.View$OnClickListenerC648302 */

                public void onClick(View view) {
                    C64828d.this.f163427d.mo223717a(menuInfo);
                }
            });
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64821a.AbstractC64823b
    /* renamed from: a */
    public void mo223716a(final JoinTenantChooseInfo joinTenantChooseInfo) {
        if (joinTenantChooseInfo != null) {
            this.f123085b.mo171465b("n_page_tenant_join_way", "showView");
            String str = joinTenantChooseInfo.title;
            if (!TextUtils.isEmpty(str)) {
                this.f163429f.setText(str);
            }
            C49226y.m194061a(this.f163426c, this.f163430g, joinTenantChooseInfo.subTitle, null, this.f123085b);
            if (joinTenantChooseInfo.dispatchList != null) {
                m254562a(joinTenantChooseInfo.dispatchList);
            }
            ButtonInfo buttonInfo = joinTenantChooseInfo.registerButton;
            RegisterItem registerItem = joinTenantChooseInfo.registerItem;
            if (buttonInfo == null || TextUtils.isEmpty(buttonInfo.text) || registerItem == null) {
                HashMap hashMap = new HashMap();
                hashMap.put("visible", "gone");
                if (buttonInfo == null) {
                    this.f123085b.mo171467b("n_action_show_bottom_button", "registerButton is null", hashMap);
                } else if (TextUtils.isEmpty(buttonInfo.text)) {
                    this.f123085b.mo171467b("n_action_show_bottom_button", "registerButton text is empty", hashMap);
                } else {
                    this.f123085b.mo171467b("n_action_show_bottom_button", "registerItem text is null", hashMap);
                }
                this.f163432i.setVisibility(8);
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("visible", "visible");
            this.f123085b.mo171467b("n_action_show_bottom_button", "", hashMap2);
            this.f163432i.setVisibility(0);
            this.f163432i.setText(buttonInfo.text);
            this.f163432i.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.lark.android.passport.biz.feature.join_team.join_way.p3228a.C64828d.View$OnClickListenerC648291 */

                public void onClick(View view) {
                    C64828d.this.f123085b.mo171460a("n_action_click_personal_user_or_create_team");
                    JoinTeamStatisticsHelper.m254572c(joinTenantChooseInfo.flowType);
                    CreateWayDialogFragment.m254540a(joinTenantChooseInfo.registerItem, C64828d.this.f163428e, joinTenantChooseInfo.flowType).mo5511a(C64828d.this.f163426c.getSupportFragmentManager(), "register way");
                }
            });
        }
    }
}
