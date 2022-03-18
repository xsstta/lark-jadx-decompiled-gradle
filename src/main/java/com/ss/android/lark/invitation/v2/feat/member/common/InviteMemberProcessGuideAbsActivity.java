package com.ss.android.lark.invitation.v2.feat.member.common;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.dialog.DialogC25637f;
import com.larksuite.suite.R;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.member.orientation.InviteMemberOrientationActivity;
import com.ss.android.lark.invitation.v2.statistic.C40530a;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.C57832h;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;

public abstract class InviteMemberProcessGuideAbsActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    private Boolean f102463a;

    /* renamed from: b */
    public String f102464b;

    /* renamed from: c */
    public String f102465c;

    /* renamed from: d */
    protected DialogC25637f f102466d;

    /* renamed from: e */
    protected boolean f102467e;

    /* renamed from: b */
    private boolean mo146202b() {
        if ("upgrade".equals(this.f102464b)) {
            return !C40147z.m159160a().isLarkEnv();
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo146223f() {
        Boolean bool = this.f102463a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(!mo146200a());
        this.f102463a = valueOf;
        return valueOf.booleanValue();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (mo146223f()) {
            super.onBackPressed();
        } else if (mo146202b()) {
            super.onBackPressed();
        } else {
            C57832h.m224485a();
        }
    }

    /* renamed from: a */
    private boolean mo146200a() {
        if (("new_guide".equals(this.f102464b) || "upgrade".equals(this.f102464b) || "ug_flow".equals(this.f102464b)) && !InviteMemberOrientationActivity.class.equals(getClass())) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        if (!this.f102467e) {
            return;
        }
        if (C40147z.m159160a().getLoginDependency().mo145589e()) {
            finish();
            return;
        }
        this.f102467e = false;
        ViewUtils.m224145a((int) R.string.Lark_Guide_SetTeamNameSuccess);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo146222e() {
        if (C40147z.m159160a().getLoginDependency().mo145589e()) {
            Log.m165389i("InvitationModule", "current tenant is small b");
            if (this.f102466d == null) {
                this.f102466d = new C25639g(this).mo89248g(R.string.Lark_Guide_UpgradeTeamDialogTitle).mo89254m(R.string.Lark_Guide_UpgradeTeamDialogContent).mo89246d(false).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Invitation_AddMembersRefreshDialogCancel, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity.DialogInterface$OnClickListenerC403336 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        InviteMemberProcessGuideAbsActivity.this.finish();
                        C40530a.m160430c();
                    }
                }).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Guide_UpgradeTeamYes, new DialogInterface.OnClickListener() {
                    /* class com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity.DialogInterface$OnClickListenerC403325 */

                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                        InviteMemberProcessGuideAbsActivity.this.f102467e = true;
                        C40147z.m159160a().openTeamSettingsPage(InviteMemberProcessGuideAbsActivity.this, "user_guide");
                        C40530a.m160429b();
                    }
                }).mo89239c();
                C40530a.m160428a();
            }
        }
    }

    /* renamed from: a */
    public void mo146221a(String str) {
        Intent intent = new Intent();
        intent.putExtra("new_guide", str);
        setResult(-1, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo146220a(CommonTitleBar commonTitleBar) {
        if (!mo146223f()) {
            if (mo146202b()) {
                commonTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Guide_VideoSkip), R.color.text_title) {
                    /* class com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity.C403281 */

                    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                    public void performAction(View view) {
                        C40147z.m159160a().openLdrGuidePage(InviteMemberProcessGuideAbsActivity.this, false, null);
                        InviteMemberProcessGuideAbsActivity.this.finish();
                    }
                });
                return;
            }
            commonTitleBar.getLeftText().setVisibility(8);
            if ("ug_flow".equals(this.f102464b)) {
                String stringExtra = getIntent().getStringExtra("ug_flow_invite_btn_text");
                if (!TextUtils.isEmpty(stringExtra)) {
                    commonTitleBar.addAction(new IActionTitlebar.TextAction(stringExtra, R.color.text_link_hover) {
                        /* class com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity.C403292 */

                        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                        public void performAction(View view) {
                            InviteMemberProcessGuideAbsActivity.this.mo146221a("");
                            InviteMemberProcessGuideAbsActivity.this.finish();
                        }
                    });
                } else {
                    commonTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Guide_VideoSkip), R.color.text_link_hover) {
                        /* class com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity.C403303 */

                        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                        public void performAction(View view) {
                            InviteMemberProcessGuideAbsActivity.this.mo146221a("");
                            InviteMemberProcessGuideAbsActivity.this.finish();
                        }
                    });
                }
            } else {
                commonTitleBar.addAction(new IActionTitlebar.TextAction(UIHelper.getString(R.string.Lark_Guide_VideoSkip), R.color.text_link_hover) {
                    /* class com.ss.android.lark.invitation.v2.feat.member.common.InviteMemberProcessGuideAbsActivity.C403314 */

                    @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                    public void performAction(View view) {
                        InviteMemberProcessGuideAbsActivity.this.mo146221a("jump");
                        InviteMemberProcessGuideAbsActivity.this.finish();
                        InvHitPoint.m160321A(InviteMemberProcessGuideAbsActivity.this.f102464b);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f102464b = getIntent().getStringExtra("from_scenes");
        String stringExtra = getIntent().getStringExtra("departments");
        this.f102465c = stringExtra;
        if (stringExtra == null) {
            this.f102465c = "";
        }
        Log.m165389i("InvitationModule", "onCreate InviteMemberProcessGuideAbsActivity from: " + this.f102464b + ", departments: " + this.f102465c);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 255 && intent != null) {
            mo146221a(intent.getStringExtra("new_guide"));
            finish();
        }
    }
}
