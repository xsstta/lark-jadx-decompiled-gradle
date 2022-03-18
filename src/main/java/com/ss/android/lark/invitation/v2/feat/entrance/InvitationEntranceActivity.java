package com.ss.android.lark.invitation.v2.feat.entrance;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.base.StandAloneParam;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.inv.export.ui.InvBaseFragmentActivity;
import com.ss.android.lark.inv.export.util.C40108g;
import com.ss.android.lark.inv.export.util.C40118l;
import com.ss.android.lark.inv.export.util.C40132r;
import com.ss.android.lark.inv.export.util.C40144w;
import com.ss.android.lark.inv.export.util.C40147z;
import com.ss.android.lark.invitation.v2.feat.external.main.feishu.InviteExternalFeishuActivity;
import com.ss.android.lark.invitation.v2.statistic.InvHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;

public class InvitationEntranceActivity extends InvBaseFragmentActivity {

    /* renamed from: a */
    private CommonTitleBar f102133a;

    /* renamed from: b */
    private TextView f102134b;

    /* renamed from: c */
    private TextView f102135c;

    /* renamed from: d */
    private String f102136d;

    /* renamed from: a */
    public Context mo145855a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo145856a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo145857a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m159342a(this, context);
    }

    /* renamed from: b */
    public void mo145858b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo145859c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m159338a(this, configuration);
    }

    public AssetManager getAssets() {
        return m159344c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m159339a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m159343b(this);
    }

    /* renamed from: d */
    private void m159345d() {
        if (C40147z.m159165e()) {
            this.f102133a.setLeftVisible(false);
            DesktopUtil.m144299a((TextView) findViewById(R.id.mieTeamMembersTv), (TextView) findViewById(R.id.mieExternalContactTv));
            DesktopUtil.m144306b(this.f102134b, this.f102135c, (TextView) findViewById(R.id.mieExternalTv3), (TextView) findViewById(R.id.mieAddMemberTv), (TextView) findViewById(R.id.mieAddExternalContactsTv));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m159341a(View view) {
        C40132r.m159117a();
        InvHitPoint.m160334M(this.f102136d);
    }

    /* renamed from: a */
    public static Resources m159339a(InvitationEntranceActivity invitationEntranceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(invitationEntranceActivity);
        }
        return invitationEntranceActivity.mo145856a();
    }

    /* renamed from: c */
    public static AssetManager m159344c(InvitationEntranceActivity invitationEntranceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(invitationEntranceActivity);
        }
        return invitationEntranceActivity.mo145859c();
    }

    /* renamed from: b */
    public static void m159343b(InvitationEntranceActivity invitationEntranceActivity) {
        invitationEntranceActivity.mo145858b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InvitationEntranceActivity invitationEntranceActivity2 = invitationEntranceActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    invitationEntranceActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.inv_entrance_activity);
        this.f102136d = getIntent().getStringExtra("from_scenes");
        InvHitPoint.m160349a();
        InvHitPoint.m160375d();
        this.f102133a = (CommonTitleBar) findViewById(R.id.mieTitleBar);
        this.f102134b = (TextView) findViewById(R.id.mieInternalTv);
        this.f102135c = (TextView) findViewById(R.id.mieInternalTv2);
        this.f102133a.setRightImage(UIHelper.getDrawable(R.drawable.inv_title_bar_question));
        this.f102133a.getRightView(0).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.entrance.$$Lambda$InvitationEntranceActivity$E0JCzFVOr94nLaS8eFJ6qu7PuWo */

            public final void onClick(View view) {
                InvitationEntranceActivity.this.m159341a((InvitationEntranceActivity) view);
            }
        });
        String d = C40147z.m159160a().getLoginDependency().mo145588d();
        String string = UIHelper.getString(R.string.Lark_Invitation_ChooseMemberNotification);
        SpannableString a = C40144w.m159156a(string.replace("{{TEAM_NAME}}", "{" + d + "}"), new StyleSpan(1));
        this.f102134b.setText(a);
        this.f102135c.setText(a);
        findViewById(R.id.mieTeamCv).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.entrance.InvitationEntranceActivity.View$OnClickListenerC401991 */

            public void onClick(View view) {
                if (C40147z.m159160a().getLoginDependency().mo145589e()) {
                    C40147z.m159163c().openInviteMemberPageSmart(InvitationEntranceActivity.this, "update_dialog");
                } else {
                    C40147z.m159163c().openInviteMemberPageSmart(InvitationEntranceActivity.this, "invite_people_union");
                }
                InvHitPoint.m160369c();
                InvHitPoint.m160378e();
            }
        });
        findViewById(R.id.mieExternalCv).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.invitation.v2.feat.entrance.InvitationEntranceActivity.View$OnClickListenerC402002 */

            public void onClick(View view) {
                InviteExternalFeishuActivity.m159664a(InvitationEntranceActivity.this, "invitation_entrance");
                InvHitPoint.m160362b();
                InvHitPoint.m160378e();
            }
        });
        m159345d();
    }

    /* renamed from: a */
    public static Context m159338a(InvitationEntranceActivity invitationEntranceActivity, Configuration configuration) {
        Context a = invitationEntranceActivity.mo145855a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m159340a(Context context, String str) {
        if (C40147z.m159165e()) {
            Intent intent = new Intent(context, InvitationEntranceActivity.class);
            intent.setFlags(402653184);
            C36512a.m144041a().mo134756a((Activity) context, new StandAloneParam.C36572a(intent, 2).mo134966a(366).mo134968b(670).mo134967a());
            return;
        }
        C40118l.m159074a(context, "//client/invite/unified", C40108g.m159014a(Pair.create("from_scenes", str)));
    }

    /* renamed from: a */
    public static void m159342a(InvitationEntranceActivity invitationEntranceActivity, Context context) {
        invitationEntranceActivity.mo145857a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(invitationEntranceActivity);
        }
    }
}
