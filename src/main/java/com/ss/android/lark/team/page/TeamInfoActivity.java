package com.ss.android.lark.team.page;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.common.piece.SettingAvatarPiece;
import com.ss.android.lark.team.common.piece.SettingJumpPiece;
import com.ss.android.lark.team.common.piece.TitleBarPiece;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.p2732b.AbstractC55360c;
import com.ss.android.lark.team.p2737f.C55443e;
import com.ss.android.lark.team.page.info.TeamDescPiece;
import com.ss.android.lark.team.page.info.TeamNamePiece;
import com.ss.android.lark.team.service.TeamPushService;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u001f\u0010\u0018\u001a\u00020\u00102\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100\u001aH\bR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/team/page/TeamInfoActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "pushTeamsChangeListener", "Lcom/ss/android/lark/team/listener/IPushTeamsChangeListener;", "teamAvatarClickListener", "Landroid/view/View$OnClickListener;", "teamDescClickListener", "teamId", "", "teamNameClickListener", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openAvatarEditPage", "openInfoEditPage", "editType", "", "runWithTeam", "block", "Lkotlin/Function1;", "Lcom/ss/android/lark/team/entity/Team;", "Companion", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamInfoActivity extends BaseFragmentActivity {

    /* renamed from: c */
    public static final Companion f136901c = new Companion(null);

    /* renamed from: a */
    public LinearPieceGroup f136902a;

    /* renamed from: b */
    public long f136903b;

    /* renamed from: d */
    private PieceManager f136904d;

    /* renamed from: e */
    private final View.OnClickListener f136905e = new View$OnClickListenerC55456c(this);

    /* renamed from: f */
    private final View.OnClickListener f136906f = new View$OnClickListenerC55458e(this);

    /* renamed from: g */
    private final View.OnClickListener f136907g = new View$OnClickListenerC55457d(this);

    /* renamed from: h */
    private final AbstractC55360c f136908h = new C55455b(this);

    /* renamed from: a */
    public Context mo189234a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo189237a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215151a(this, context);
    }

    /* renamed from: b */
    public Resources mo189238b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo189239c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215149a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo189241d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m215154d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215152b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215153c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/team/page/TeamInfoActivity$Companion;", "", "()V", "LOG_TAG", "", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamInfoActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        TeamPushService.f136810a.mo188936b(this.f136908h);
    }

    /* renamed from: a */
    public final void mo189235a() {
        Object obj = m215150a(this).mo177203q().mo177165a().get("intent_team");
        Team team = null;
        if (obj != null) {
            Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
            if (!(obj instanceof Team)) {
                obj = null;
            }
            team = obj;
        }
        Team team2 = team;
        if (team2 == null) {
            Log.m165397w("TeamInfoActivity", "team null");
        } else if (!C55443e.m215116a(team2)) {
            Log.m165389i("TeamInfoActivity", "openAvatarEditPage not owner");
        } else {
            startActivityForResult(C55356a.m214819a().mo144127f().mo144151a(this, team2.getAvatarKey(), null, team2, null, false), 9);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamInfoActivity$c */
    static final class View$OnClickListenerC55456c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamInfoActivity f136910a;

        View$OnClickListenerC55456c(TeamInfoActivity teamInfoActivity) {
            this.f136910a = teamInfoActivity;
        }

        public final void onClick(View view) {
            this.f136910a.mo189235a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamInfoActivity$d */
    static final class View$OnClickListenerC55457d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamInfoActivity f136911a;

        View$OnClickListenerC55457d(TeamInfoActivity teamInfoActivity) {
            this.f136911a = teamInfoActivity;
        }

        public final void onClick(View view) {
            this.f136911a.mo189236a(2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamInfoActivity$e */
    static final class View$OnClickListenerC55458e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TeamInfoActivity f136912a;

        View$OnClickListenerC55458e(TeamInfoActivity teamInfoActivity) {
            this.f136912a = teamInfoActivity;
        }

        public final void onClick(View view) {
            this.f136912a.mo189236a(1);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearPieceGroup m215150a(TeamInfoActivity teamInfoActivity) {
        LinearPieceGroup linearPieceGroup = teamInfoActivity.f136902a;
        if (linearPieceGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        return linearPieceGroup;
    }

    /* renamed from: b */
    public static Resources m215152b(TeamInfoActivity teamInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamInfoActivity);
        }
        return teamInfoActivity.mo189238b();
    }

    /* renamed from: d */
    public static AssetManager m215154d(TeamInfoActivity teamInfoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamInfoActivity);
        }
        return teamInfoActivity.mo189241d();
    }

    /* renamed from: c */
    public static void m215153c(TeamInfoActivity teamInfoActivity) {
        teamInfoActivity.mo189239c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamInfoActivity teamInfoActivity2 = teamInfoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamInfoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012D\u0010\u0002\u001a@\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005*\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u00060\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "it", "", "", "kotlin.jvm.PlatformType", "Lcom/ss/android/lark/team/entity/Team;", "", "onTeamsChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.TeamInfoActivity$b */
    static final class C55455b implements AbstractC55360c {

        /* renamed from: a */
        final /* synthetic */ TeamInfoActivity f136909a;

        C55455b(TeamInfoActivity teamInfoActivity) {
            this.f136909a = teamInfoActivity;
        }

        @Override // com.ss.android.lark.team.p2732b.AbstractC55360c
        /* renamed from: a */
        public final void mo138689a(Map<Long, Team> map) {
            Intrinsics.checkParameterIsNotNull(map, "it");
            Log.m165389i("TeamInfoActivity", "push team");
            Team team = map.get(Long.valueOf(this.f136909a.f136903b));
            if (team != null) {
                Object obj = TeamInfoActivity.m215150a(this.f136909a).mo177203q().mo177165a().get("intent_team");
                Team team2 = null;
                if (obj != null) {
                    Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
                    if (!(obj instanceof Team)) {
                        obj = null;
                    }
                    team2 = obj;
                }
                Team team3 = team2;
                if (team3 == null || team3.getVersion() < team.getVersion()) {
                    Log.m165389i("TeamInfoActivity", "push changed team");
                    TeamInfoActivity.m215150a(this.f136909a).mo177203q().mo177168a("intent_team", team);
                    return;
                }
                Log.m165389i("TeamInfoActivity", "push same team");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: a */
    public final void mo189236a(int i) {
        Object obj = m215150a(this).mo177203q().mo177165a().get("intent_team");
        Team team = null;
        if (obj != null) {
            Intrinsics.checkExpressionValueIsNotNull(obj, "dataMap[key] ?: return null");
            if (!(obj instanceof Team)) {
                obj = null;
            }
            team = obj;
        }
        Team team2 = team;
        if (team2 == null) {
            Log.m165397w("TeamInfoActivity", "team null");
            return;
        }
        Intent intent = new Intent(this, TeamNameEditActivity.class);
        intent.putExtra("intent_team", team2);
        intent.putExtra("intent_edit_type", i);
        startActivityForResult(intent, 6);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("intent_team");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof Team)) {
            serializable = null;
        }
        Team team = (Team) serializable;
        if (team != null) {
            this.f136903b = team.getId();
            TeamInfoActivity teamInfoActivity = this;
            SettingJumpPiece a = ((SettingJumpPiece) new TeamNamePiece().mo177198c(R.id.piece_team_name)).mo189009a(C51468a.m199493c(R.string.Project_MV_AsteriskTeamName, teamInfoActivity));
            String name = team.getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "team.name");
            TeamDescPiece a2 = ((TeamDescPiece) new TeamDescPiece().mo177198c(R.id.piece_team_desc)).mo189329a(C51468a.m199493c(R.string.Project_MV_TeamDescriptionHere, teamInfoActivity));
            String description = team.getDescription();
            Intrinsics.checkExpressionValueIsNotNull(description, "team.description");
            LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new LinearPieceGroup(1).mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) teamInfoActivity)), new TitleBarPiece(R.string.Project_MV_SubtitleEditTeamInfo, TitleBarPiece.LeftIconType.BACK), false, 2, null), ((SettingAvatarPiece) ((SettingAvatarPiece) new SettingAvatarPiece().mo177198c(R.id.piece_team_avatar)).mo177195b(teamInfoActivity, BitmapDescriptorFactory.HUE_RED, 8.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED)).mo188998a(C51468a.m199493c(R.string.Project_MV_TeamProfilePicture, teamInfoActivity)).mo188997a(DividerType.FULL_WIDTH).mo188999b(DividerType.MARGIN_START).mo188996a(this.f136905e), false, 2, null), ((SettingJumpPiece) a.mo189010b(name).mo189005b(DividerType.MARGIN_START)).mo189002a(this.f136906f), false, 2, null), ((TeamDescPiece) a2.mo189330b(description).mo189005b(DividerType.FULL_WIDTH)).mo189002a(this.f136907g), false, 2, null);
            setContentView(linearPieceGroup.mo177214a(teamInfoActivity));
            this.f136902a = linearPieceGroup;
            if (linearPieceGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
            }
            PieceManager.Builder a3 = new PieceManager.Builder(linearPieceGroup, teamInfoActivity).mo177234a(this);
            Intent intent2 = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
            this.f136904d = a3.mo177233a(intent2.getExtras()).mo177238e();
            TeamPushService.f136810a.mo188933a(this.f136908h);
            return;
        }
        Log.m165397w("TeamInfoActivity", "team null");
        finish();
    }

    /* renamed from: a */
    public static void m215151a(TeamInfoActivity teamInfoActivity, Context context) {
        teamInfoActivity.mo189237a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamInfoActivity);
        }
    }

    /* renamed from: a */
    public static Context m215149a(TeamInfoActivity teamInfoActivity, Configuration configuration) {
        Context a = teamInfoActivity.mo189234a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
