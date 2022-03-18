package com.ss.android.lark.team.page.upgrade_chat;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.data.DataObserver;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.team.common.piece.MetadataPiece;
import com.ss.android.lark.team.common.piece.SettingDividerPiece;
import com.ss.android.lark.team.common.piece.TeamNameInputPiece;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeToTeamActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "searchChatInfoObserver", "com/ss/android/lark/team/page/upgrade_chat/UpgradeToTeamActivity$searchChatInfoObserver$1", "Lcom/ss/android/lark/team/page/upgrade_chat/UpgradeToTeamActivity$searchChatInfoObserver$1;", "showGroupMember", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UpgradeToTeamActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public LinearPieceGroup f137256a;

    /* renamed from: b */
    public boolean f137257b;

    /* renamed from: c */
    private PieceManager f137258c;

    /* renamed from: d */
    private final C55639a f137259d = new C55639a(this, true);

    /* renamed from: a */
    public Context mo189601a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189602a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189603a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215569a(this, context);
    }

    /* renamed from: b */
    public void mo189604b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189605c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215567a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215572d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215570b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215571c(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        PieceManager cVar = this.f137258c;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceManager");
        }
        if (!cVar.mo177231c()) {
            finish();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ LinearPieceGroup m215568a(UpgradeToTeamActivity upgradeToTeamActivity) {
        LinearPieceGroup linearPieceGroup = upgradeToTeamActivity.f137256a;
        if (linearPieceGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        return linearPieceGroup;
    }

    /* renamed from: b */
    public static Resources m215570b(UpgradeToTeamActivity upgradeToTeamActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(upgradeToTeamActivity);
        }
        return upgradeToTeamActivity.mo189602a();
    }

    /* renamed from: d */
    public static AssetManager m215572d(UpgradeToTeamActivity upgradeToTeamActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(upgradeToTeamActivity);
        }
        return upgradeToTeamActivity.mo189605c();
    }

    /* renamed from: c */
    public static void m215571c(UpgradeToTeamActivity upgradeToTeamActivity) {
        upgradeToTeamActivity.mo189604b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            UpgradeToTeamActivity upgradeToTeamActivity2 = upgradeToTeamActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    upgradeToTeamActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/team/page/upgrade_chat/UpgradeToTeamActivity$searchChatInfoObserver$1", "Lcom/ss/android/lark/piece/data/DataObserver;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchChatInfo;", "onValue", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.page.upgrade_chat.UpgradeToTeamActivity$a */
    public static final class C55639a extends DataObserver<SearchChatInfo> {

        /* renamed from: a */
        final /* synthetic */ UpgradeToTeamActivity f137260a;

        /* renamed from: a */
        public void mo127664a(SearchChatInfo searchChatInfo) {
            boolean z;
            if (searchChatInfo != null) {
                String id = searchChatInfo.getId();
                if (id == null || id.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && !this.f137260a.f137257b) {
                    LinearPieceGroup a = UpgradeToTeamActivity.m215568a(this.f137260a);
                    PieceGroup.m199535a(a, new UpgradeChatMemberPiece(), false, 2, null);
                    PieceGroup.m199535a(a, new SettingDividerPiece(), false, 2, null);
                    PieceGroup.m199535a(a, (Piece) new MetadataPiece(R.string.Project_MV_MembersBecomeTeam).mo177196b((Context) this.f137260a, 16, 2, 16, 8), false, 2, null);
                    this.f137260a.f137257b = true;
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55639a(UpgradeToTeamActivity upgradeToTeamActivity, boolean z) {
            super(z);
            this.f137260a = upgradeToTeamActivity;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UpgradeToTeamActivity upgradeToTeamActivity = this;
        LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new UpgradeToTeamRootPiece().mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) upgradeToTeamActivity)), new UpgradeToTeamTitlePiece(), false, 2, null), new SettingDividerPiece(), false, 2, null), (Piece) new SettingDividerPiece().mo177196b((Context) upgradeToTeamActivity, 0, 8, 0, 0), false, 2, null), new PickGroupPiece().mo189009a(C51468a.m199493c(R.string.Project_MV_DiffSelectGroups, upgradeToTeamActivity)), false, 2, null), new SettingDividerPiece(), false, 2, null), (Piece) new MetadataPiece(R.string.Project_T_GroupMembersAddSomething).mo177196b((Context) upgradeToTeamActivity, 16, 0, 16, 14), false, 2, null), (Piece) new MetadataPiece(R.string.Project_MV_AsteriskTeamName).mo177196b((Context) upgradeToTeamActivity, 16, 14, 16, 2), false, 2, null), new SettingDividerPiece(), false, 2, null), new TeamNameInputPiece().mo189036b(C51468a.m199493c(R.string.Project_MV_NameYourTeamHere, upgradeToTeamActivity)).mo189038c(C51468a.m199493c(R.string.Project_T_NameAlreadyTaken, upgradeToTeamActivity)), false, 2, null), (Piece) new SettingDividerPiece().mo177198c(R.id.upgrade_to_team_name_bottom_divider), false, 2, null);
        setContentView(linearPieceGroup.mo177214a(upgradeToTeamActivity));
        this.f137256a = linearPieceGroup;
        if (linearPieceGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        PieceManager.Builder a = new PieceManager.Builder(linearPieceGroup, upgradeToTeamActivity).mo177234a(this);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        this.f137258c = a.mo177233a(intent.getExtras()).mo177238e();
        LinearPieceGroup linearPieceGroup2 = this.f137256a;
        if (linearPieceGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
        }
        linearPieceGroup2.mo177190a("intent_search_info", this.f137259d);
    }

    /* renamed from: a */
    public static void m215569a(UpgradeToTeamActivity upgradeToTeamActivity, Context context) {
        upgradeToTeamActivity.mo189603a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(upgradeToTeamActivity);
        }
    }

    /* renamed from: a */
    public static Context m215567a(UpgradeToTeamActivity upgradeToTeamActivity, Configuration configuration) {
        Context a = upgradeToTeamActivity.mo189601a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
