package com.ss.android.lark.team.page.create_chat;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.common.piece.ChatModeSettingPiece;
import com.ss.android.lark.team.common.piece.ClearNameInputFocusPiece;
import com.ss.android.lark.team.common.piece.SettingDividerPiece;
import com.ss.android.lark.team.common.piece.SettingJumpPiece;
import com.ss.android.lark.team.common.piece.TeamChatTypePiece;
import com.ss.android.lark.team.entity.Team;
import com.ss.android.lark.team.page.create_team.CreateItemDescriptionPiece;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/page/create_chat/CreateTeamChatActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateTeamChatActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private LinearPieceGroup f136951a;

    /* renamed from: b */
    private PieceManager f136952b;

    /* renamed from: a */
    public Context mo189280a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189281a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189282a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215212a(this, context);
    }

    /* renamed from: b */
    public void mo189283b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189284c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215210a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215214c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215211a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215213b(this);
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
        PieceManager cVar = this.f136952b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pieceManager");
        }
        if (!cVar.mo177231c()) {
            finish();
        }
    }

    /* renamed from: a */
    public static Resources m215211a(CreateTeamChatActivity createTeamChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamChatActivity);
        }
        return createTeamChatActivity.mo189281a();
    }

    /* renamed from: c */
    public static AssetManager m215214c(CreateTeamChatActivity createTeamChatActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamChatActivity);
        }
        return createTeamChatActivity.mo189284c();
    }

    /* renamed from: b */
    public static void m215213b(CreateTeamChatActivity createTeamChatActivity) {
        createTeamChatActivity.mo189283b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CreateTeamChatActivity createTeamChatActivity2 = createTeamChatActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    createTeamChatActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Serializable serializableExtra = getIntent().getSerializableExtra("intent_team");
        if (!(serializableExtra instanceof Team)) {
            serializableExtra = null;
        }
        if (((Team) serializableExtra) != null) {
            CreateTeamChatActivity createTeamChatActivity = this;
            LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new ClearNameInputFocusPiece().mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) createTeamChatActivity)), new CreateTeamChatTitlePiece(), false, 2, null), (Piece) new SettingDividerPiece().mo177196b((Context) createTeamChatActivity, 0, 9, 0, 0), false, 2, null), new CreateTeamChatNamePiece(), false, 2, null), new SettingDividerPiece(), false, 2, null), (Piece) ((CreateItemDescriptionPiece) ((CreateItemDescriptionPiece) new CreateItemDescriptionPiece(false).mo189003a(DividerType.FULL_WIDTH)).mo189005b(DividerType.FULL_WIDTH)).mo189291a(C51468a.m199493c(R.string.Project_MV_DescriptionOfGroup, createTeamChatActivity)).mo189293b(C51468a.m199493c(R.string.Project_MV_AddDescriptionLearnMore, createTeamChatActivity)).mo189290a(100).mo177196b((Context) createTeamChatActivity, 0, 9, 0, 0), false, 2, null), (Piece) new SettingDividerPiece().mo177196b((Context) createTeamChatActivity, 0, 9, 0, 0), false, 2, null), new ChatModeSettingPiece(), false, 2, null), (Piece) ((SettingJumpPiece) new TeamChatTypePiece().mo189003a(DividerType.MARGIN_START)).mo189005b(DividerType.FULL_WIDTH), false, 2, null);
            setContentView(linearPieceGroup.mo177214a(createTeamChatActivity));
            this.f136951a = linearPieceGroup;
            if (linearPieceGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pieceGroup");
            }
            PieceManager.Builder a = new PieceManager.Builder(linearPieceGroup, createTeamChatActivity).mo177234a(this);
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            this.f136952b = a.mo177233a(intent.getExtras()).mo177238e();
            TeamHitPoint.m215090h();
            return;
        }
        Log.m165383e("CreateTeamChat", "team in intent is null");
        finish();
    }

    /* renamed from: a */
    public static void m215212a(CreateTeamChatActivity createTeamChatActivity, Context context) {
        createTeamChatActivity.mo189282a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamChatActivity);
        }
    }

    /* renamed from: a */
    public static Context m215210a(CreateTeamChatActivity createTeamChatActivity, Configuration configuration) {
        Context a = createTeamChatActivity.mo189280a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
