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
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.piece.core.Piece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.core.PieceManager;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import com.ss.android.lark.piece.p2465b.C51468a;
import com.ss.android.lark.team.common.piece.SettingDividerPiece;
import com.ss.android.lark.team.picker.confirm.ConfirmChatInfoPiece;
import com.ss.android.lark.team.picker.confirm.ConfirmChatTypePiece;
import com.ss.android.lark.team.picker.confirm.ConfirmTitlePiece;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/team/picker/TeamPickerConfirmActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class TeamPickerConfirmActivity extends BaseFragmentActivity {
    /* renamed from: a */
    public Context mo189626a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo189627a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo189628a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215601a(this, context);
    }

    /* renamed from: b */
    public void mo189629b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo189630c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215599a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215603c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215600a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215602b(this);
    }

    /* renamed from: a */
    public static Resources m215600a(TeamPickerConfirmActivity teamPickerConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamPickerConfirmActivity);
        }
        return teamPickerConfirmActivity.mo189627a();
    }

    /* renamed from: c */
    public static AssetManager m215603c(TeamPickerConfirmActivity teamPickerConfirmActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamPickerConfirmActivity);
        }
        return teamPickerConfirmActivity.mo189630c();
    }

    /* renamed from: b */
    public static void m215602b(TeamPickerConfirmActivity teamPickerConfirmActivity) {
        teamPickerConfirmActivity.mo189629b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TeamPickerConfirmActivity teamPickerConfirmActivity2 = teamPickerConfirmActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    teamPickerConfirmActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TeamPickerConfirmActivity teamPickerConfirmActivity = this;
        LinearPieceGroup linearPieceGroup = (LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) PieceGroup.m199535a((LinearPieceGroup) ((LinearPieceGroup) new LinearPieceGroup(1).mo177184a(-1, -1)).mo177200e(C51468a.m199487a((int) R.color.bg_base, (Context) teamPickerConfirmActivity)), new ConfirmTitlePiece(), false, 2, null), new SettingDividerPiece(), false, 2, null), (Piece) new ConfirmChatInfoPiece().mo177196b((Context) teamPickerConfirmActivity, 0, 8, 0, 0), false, 2, null), (Piece) new ConfirmChatTypePiece().mo177196b((Context) teamPickerConfirmActivity, 0, 8, 0, 0), false, 2, null);
        setContentView(linearPieceGroup.mo177214a(teamPickerConfirmActivity));
        PieceManager.Builder a = new PieceManager.Builder(linearPieceGroup, teamPickerConfirmActivity).mo177234a(this);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        a.mo177233a(intent.getExtras()).mo177237d().mo177230b();
    }

    /* renamed from: a */
    public static void m215601a(TeamPickerConfirmActivity teamPickerConfirmActivity, Context context) {
        teamPickerConfirmActivity.mo189628a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(teamPickerConfirmActivity);
        }
    }

    /* renamed from: a */
    public static Context m215599a(TeamPickerConfirmActivity teamPickerConfirmActivity, Configuration configuration) {
        Context a = teamPickerConfirmActivity.mo189626a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
