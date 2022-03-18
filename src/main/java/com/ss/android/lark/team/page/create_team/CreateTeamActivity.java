package com.ss.android.lark.team.page.create_team;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.C55356a;
import com.ss.android.lark.team.bean.CurrentUserTeamMember;
import com.ss.android.lark.team.common.DividerType;
import com.ss.android.lark.team.common.piece.ClearNameInputFocusPiece;
import com.ss.android.lark.team.common.piece.SettingDividerPiece;
import com.ss.android.lark.team.stastics.TeamHitPoint;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/page/create_team/CreateTeamActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CreateTeamActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private LinearPieceGroup f136974a;

    /* renamed from: b */
    private PieceManager f136975b;

    /* renamed from: a */
    public Context mo189300a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189301a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189302a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215242a(this, context);
    }

    /* renamed from: b */
    public void mo189303b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189304c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215240a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215244c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215241a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215243b(this);
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
        PieceManager cVar = this.f136975b;
        if (cVar == null || !cVar.mo177231c()) {
            finish();
        }
    }

    /* renamed from: a */
    public static Resources m215241a(CreateTeamActivity createTeamActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamActivity);
        }
        return createTeamActivity.mo189301a();
    }

    /* renamed from: c */
    public static AssetManager m215244c(CreateTeamActivity createTeamActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamActivity);
        }
        return createTeamActivity.mo189304c();
    }

    /* renamed from: b */
    public static void m215243b(CreateTeamActivity createTeamActivity) {
        createTeamActivity.mo189303b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CreateTeamActivity createTeamActivity2 = createTeamActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    createTeamActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CreateTeamActivity createTeamActivity = this;
        LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new ClearNameInputFocusPiece().mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) createTeamActivity)), new CreateTeamTitlePiece(), false, 2, null), new CreateTeamAvatarPiece(), false, 2, null), new SettingDividerPiece(), false, 2, null), (Piece) new SettingDividerPiece().mo177196b((Context) createTeamActivity, 0, 9, 0, 0), false, 2, null), new CreateTeamNamePiece(), false, 2, null), new SettingDividerPiece(), false, 2, null), (Piece) ((CreateItemDescriptionPiece) ((CreateItemDescriptionPiece) new CreateItemDescriptionPiece(true).mo189003a(DividerType.FULL_WIDTH)).mo189005b(DividerType.FULL_WIDTH)).mo189291a(C51468a.m199493c(R.string.Project_MV_TeamDescriptionHere, createTeamActivity)).mo189293b(C51468a.m199493c(R.string.Project_MV_SetTeamDescribe, createTeamActivity)).mo189290a(LocationRequest.PRIORITY_HD_ACCURACY).mo177196b((Context) createTeamActivity, 0, 9, 0, 0), false, 2, null);
        setContentView(linearPieceGroup.mo177214a(createTeamActivity));
        LoginInfo c = C55356a.m214819a().mo144123b().mo144132c();
        if (c != null) {
            getIntent().putExtra("intent_current_user_team_member", new CurrentUserTeamMember(c));
        }
        PieceManager.Builder a = new PieceManager.Builder(linearPieceGroup, createTeamActivity).mo177234a(this);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        this.f136975b = a.mo177233a(intent.getExtras()).mo177238e();
        this.f136974a = linearPieceGroup;
        TeamHitPoint.m215069a();
    }

    /* renamed from: a */
    public static void m215242a(CreateTeamActivity createTeamActivity, Context context) {
        createTeamActivity.mo189302a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(createTeamActivity);
        }
    }

    /* renamed from: a */
    public static Context m215240a(CreateTeamActivity createTeamActivity, Configuration configuration) {
        Context a = createTeamActivity.mo189300a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
