package com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.base.architecture.BaseActivity;
import com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.util.C49154ag;
import com.ss.android.lark.passport.infra.util.C49157ai;
import com.ss.android.lark.passport.infra.util.C49203q;
import com.ss.android.lark.passport.infra.util.C49226y;
import com.ss.android.lark.passport.signinsdk_api.base.log.UniContext;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.lark.android.passport.biz.base.ui.CommonUiContainer;
import com.ss.lark.android.passport.biz.compat.v2.featurec.model.JoinTenantCodeInfo;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.InputTeamCodeStatisticsHelper;
import com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a;
import com.ss.lark.android.passport.biz.widget.AbstractC65288b;
import com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText;

/* renamed from: com.ss.lark.android.passport.biz.feature.join_team.tenant_code.a.d */
public class C64840d extends AbstractC49023c<C64832a.AbstractC64834b.AbstractC64835a> implements C64832a.AbstractC64834b {

    /* renamed from: c */
    protected final Activity f163447c;

    /* renamed from: d */
    public C64832a.AbstractC64834b.AbstractC64835a f163448d;

    /* renamed from: e */
    public String f163449e = "";

    /* renamed from: f */
    public final CommonUiContainer f163450f;

    /* renamed from: g */
    private UniContext f163451g;

    /* renamed from: h */
    private TextView f163452h;

    /* renamed from: i */
    private TeamCodeEditText f163453i;

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    public void cn_() {
        this.f163448d = null;
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49024d
    /* renamed from: a */
    public void mo171169a() {
        m254609g();
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: c */
    public UniContext mo171187c() {
        return this.f163451g;
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a.AbstractC64834b
    /* renamed from: f */
    public void mo223736f() {
        C49203q.m193973a((Context) this.f163447c);
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a.AbstractC64834b
    /* renamed from: d */
    public void mo223734d() {
        Activity activity = this.f163447c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171141m();
        }
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a.AbstractC64834b
    /* renamed from: e */
    public void mo223735e() {
        Activity activity = this.f163447c;
        if (activity != null && (activity instanceof BaseActivity)) {
            ((BaseActivity) activity).mo171143o();
        }
    }

    /* renamed from: g */
    private void m254609g() {
        this.f163452h = (TextView) this.f163447c.findViewById(R.id.tvChangeQr);
        TeamCodeEditText teamCodeEditText = (TeamCodeEditText) this.f163447c.findViewById(R.id.et_tenant_code);
        this.f163453i = teamCodeEditText;
        teamCodeEditText.mo224761a(new TeamCodeEditText.C65355f(this.f163447c).mo224787a(true).mo224789b(true).mo224785a(26).mo224786a(C49154ag.m193830a((Context) this.f163447c, (int) R.string.Lark_Login_V3_Input_Tenant_Code_Placeholder)).mo224788b(17).mo224790c(0).mo224792d(8).mo224793e(0).mo224791c(true).mo224794f(SmEvents.EVENT_UA_SUCCESS));
        this.f163453i.setOnTextChangeListener(new TeamCodeEditText.AbstractC65353d() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64840d.C648433 */

            @Override // com.ss.lark.android.passport.biz.widget.teamcode.TeamCodeEditText.AbstractC65353d
            /* renamed from: a */
            public void mo223744a(String str) {
                boolean z;
                if (str == null) {
                    str = "";
                }
                C64840d.this.f163449e = str;
                CommonUiContainer commonUiContainer = C64840d.this.f163450f;
                if (str.length() == 8) {
                    z = true;
                } else {
                    z = false;
                }
                commonUiContainer.mo222876a(z);
            }
        });
        this.f163453i.setOnKeyboardDetectorListener(new AbstractC65288b.AbstractC65292d() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64840d.C648444 */

            @Override // com.ss.lark.android.passport.biz.widget.AbstractC65288b.AbstractC65292d
            /* renamed from: a */
            public void mo222966a() {
                C64840d.this.f163450f.mo222880c().performClick();
            }
        });
        this.f163450f.mo222873a((View.OnClickListener) new View.OnClickListener() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64840d.View$OnClickListenerC648455 */

            public void onClick(View view) {
                C64840d.this.f123085b.mo171460a("n_action_click_next_button");
                C64840d.this.f163448d.mo223737a(C64840d.this.f163449e);
            }
        });
        this.f163450f.mo222876a(false);
    }

    @Override // com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49023c, com.ss.android.lark.passport.infra.base.architecture.p2424a.AbstractC49027g
    /* renamed from: a */
    public void mo171186a(UniContext uniContext) {
        this.f163451g = uniContext;
    }

    /* renamed from: a */
    public void mo171188a(C64832a.AbstractC64834b.AbstractC64835a aVar) {
        this.f163448d = aVar;
    }

    @Override // com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64832a.AbstractC64834b
    /* renamed from: a */
    public void mo223733a(final JoinTenantCodeInfo joinTenantCodeInfo) {
        if (joinTenantCodeInfo == null) {
            this.f123085b.mo171471d("n_page_input_team_code", "stepInfo is null");
            return;
        }
        boolean z = false;
        if (joinTenantCodeInfo.next == null || joinTenantCodeInfo.next.openQrStepInfo == null) {
            z = true;
        }
        UniContext uniContext = this.f163451g;
        if (uniContext != null) {
            uniContext.appendOneTimeParam("title", joinTenantCodeInfo.title).appendOneTimeParam("subTitle", joinTenantCodeInfo.subTitle).appendOneTimeParam("missNextStep", String.valueOf(z));
        }
        this.f123085b.mo171465b("n_page_input_team_code", "showView");
        this.f163450f.mo222871a((CharSequence) joinTenantCodeInfo.title);
        JSONObject jSONObject = new JSONObject();
        if (joinTenantCodeInfo.switchButton != null) {
            jSONObject = (JSONObject) JSON.toJSON(joinTenantCodeInfo.switchButton.next);
        }
        this.f163450f.mo222872a(joinTenantCodeInfo.subTitle, jSONObject, this.f163451g, new C49226y.AbstractC49228a() {
            /* class com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64840d.C648411 */

            @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
            /* renamed from: a */
            public /* synthetic */ boolean mo171752a(TextPaint textPaint) {
                return C49226y.AbstractC49228a.CC.$default$a(this, textPaint);
            }

            @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
            /* renamed from: a */
            public boolean mo171753a(String str) {
                if (!TextUtils.isEmpty(str)) {
                    PassportLog passportLog = C64840d.this.f123085b;
                    passportLog.mo171465b("n_page_input_team_code", "click subTitle url:" + str);
                    C49157ai.m193846a(C64840d.this.f163447c, str);
                    return true;
                }
                C64840d.this.f123085b.mo171471d("n_page_input_team_code", "subtitleLinkText href is empty");
                return true;
            }
        });
        if (joinTenantCodeInfo.switchButton != null) {
            C49226y.m194062a(this.f163447c, this.f163452h, joinTenantCodeInfo.switchButton.text, jSONObject, this.f163451g, this.f123085b, new C49226y.AbstractC49228a() {
                /* class com.ss.lark.android.passport.biz.feature.join_team.tenant_code.p3229a.C64840d.C648422 */

                @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                /* renamed from: a */
                public /* synthetic */ boolean mo171752a(TextPaint textPaint) {
                    return C49226y.AbstractC49228a.CC.$default$a(this, textPaint);
                }

                @Override // com.ss.android.lark.passport.infra.util.C49226y.AbstractC49228a
                /* renamed from: a */
                public boolean mo171753a(String str) {
                    C64840d.this.mo223736f();
                    InputTeamCodeStatisticsHelper.m254589a(joinTenantCodeInfo.flowType);
                    C64840d.this.f123085b.mo171460a("n_action_click_scan_qrcode");
                    return false;
                }
            });
        } else {
            this.f123085b.mo171468c("n_page_input_team_code", "stepInfo.switchButton is empty");
        }
        this.f163450f.mo222870a(joinTenantCodeInfo.nextButton);
        if (joinTenantCodeInfo.codeInput != null) {
            this.f163453i.mo224762a(joinTenantCodeInfo.codeInput.placeHolder);
        } else {
            this.f123085b.mo171468c("n_page_input_team_code", "stepInfo.codInput is empty");
        }
        this.f163453i.mo224759a();
    }

    public C64840d(Activity activity, CommonUiContainer commonUiContainer) {
        this.f163447c = activity;
        this.f163450f = commonUiContainer;
    }
}
