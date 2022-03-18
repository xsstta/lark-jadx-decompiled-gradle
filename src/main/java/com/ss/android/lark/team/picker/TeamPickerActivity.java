package com.ss.android.lark.team.picker;

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
import com.ss.android.lark.team.picker.base.BaseTeamPickerPiece;
import com.ss.android.lark.team.picker.base.BaseTeamPickerTitlePiece;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/team/picker/TeamPickerActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "pieceGroup", "Lcom/ss/android/lark/piece/layout/LinearPieceGroup;", "pieceManager", "Lcom/ss/android/lark/piece/core/PieceManager;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamPickerActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private LinearPieceGroup f137269a;

    /* renamed from: b */
    private PieceManager f137270b;

    /* renamed from: a */
    public Context mo189619a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189620a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189621a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215591a(this, context);
    }

    /* renamed from: b */
    public void mo189622b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189623c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215589a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215593c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215590a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215592b(this);
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
        PieceManager cVar = this.f137270b;
        if (cVar == null || !cVar.mo177231c()) {
            finish();
        }
    }

    /* renamed from: a */
    public static Resources m215590a(TeamPickerActivity teamPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamPickerActivity);
        }
        return teamPickerActivity.mo189620a();
    }

    /* renamed from: c */
    public static AssetManager m215593c(TeamPickerActivity teamPickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamPickerActivity);
        }
        return teamPickerActivity.mo189623c();
    }

    /* renamed from: b */
    public static void m215592b(TeamPickerActivity teamPickerActivity) {
        teamPickerActivity.mo189622b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamPickerActivity teamPickerActivity2 = teamPickerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamPickerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            i = extras.getInt("intent_picker_type");
        } else {
            i = 0;
        }
        Pair<BaseTeamPickerTitlePiece, BaseTeamPickerPiece> a = TeamPickerPieceBuilder.f137272a.mo189633a(i);
        if (a != null) {
            TeamPickerActivity teamPickerActivity = this;
            LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new LinearPieceGroup(1).mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) teamPickerActivity)), a.getFirst(), false, 2, null), (Piece) a.getSecond().mo177184a(-1, -1), false, 2, null);
            setContentView(linearPieceGroup.mo177214a(teamPickerActivity));
            this.f137269a = linearPieceGroup;
            if (linearPieceGroup == null) {
                Intrinsics.throwNpe();
            }
            PieceManager.Builder a2 = new PieceManager.Builder(linearPieceGroup, teamPickerActivity).mo177234a(this);
            Intent intent2 = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
            this.f137270b = a2.mo177233a(intent2.getExtras()).mo177237d().mo177230b();
        }
    }

    /* renamed from: a */
    public static void m215591a(TeamPickerActivity teamPickerActivity, Context context) {
        teamPickerActivity.mo189621a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamPickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m215589a(TeamPickerActivity teamPickerActivity, Configuration configuration) {
        Context a = teamPickerActivity.mo189619a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
