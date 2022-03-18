package com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveFragment;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "Companion", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class JoinLeaveHistoryActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f89654a = new Companion(null);

    /* renamed from: b */
    private JoinLeaveFragment f89655b;

    /* renamed from: a */
    public Context mo128196a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo128197a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo128198a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134980a(this, context);
    }

    /* renamed from: b */
    public void mo128199b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo128200c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134978a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134982c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134979a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134981b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/group/ownership/join_leave_history/JoinLeaveHistoryActivity$Companion;", "", "()V", "KEY_PARAM_CHAT_ID", "", "KEY_PARAM_IS_THREAD", "TAG", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chatsetting.impl.group.ownership.join_leave_history.JoinLeaveHistoryActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m134983d() {
        this.f89655b = new JoinLeaveFragment();
        Bundle bundle = new Bundle();
        bundle.putString("param_chat_id", getIntent().getStringExtra("param_chat_id"));
        bundle.putBoolean("param_is_thread", getIntent().getBooleanExtra("param_is_thread", false));
        JoinLeaveFragment cVar = this.f89655b;
        if (cVar != null) {
            cVar.setArguments(bundle);
        }
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        JoinLeaveFragment cVar2 = this.f89655b;
        if (cVar2 == null) {
            Intrinsics.throwNpe();
        }
        beginTransaction.add(16908290, cVar2, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    public static Resources m134979a(JoinLeaveHistoryActivity joinLeaveHistoryActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(joinLeaveHistoryActivity);
        }
        return joinLeaveHistoryActivity.mo128197a();
    }

    /* renamed from: c */
    public static AssetManager m134982c(JoinLeaveHistoryActivity joinLeaveHistoryActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(joinLeaveHistoryActivity);
        }
        return joinLeaveHistoryActivity.mo128200c();
    }

    /* renamed from: b */
    public static void m134981b(JoinLeaveHistoryActivity joinLeaveHistoryActivity) {
        joinLeaveHistoryActivity.mo128199b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            JoinLeaveHistoryActivity joinLeaveHistoryActivity2 = joinLeaveHistoryActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    joinLeaveHistoryActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.bg_base);
        if (TextUtils.isEmpty(getIntent().getStringExtra("param_chat_id"))) {
            Log.m165383e(this.TAG, "chat id is null");
            finish();
            return;
        }
        m134983d();
    }

    /* renamed from: a */
    public static void m134980a(JoinLeaveHistoryActivity joinLeaveHistoryActivity, Context context) {
        joinLeaveHistoryActivity.mo128198a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(joinLeaveHistoryActivity);
        }
    }

    /* renamed from: a */
    public static Context m134978a(JoinLeaveHistoryActivity joinLeaveHistoryActivity, Configuration configuration) {
        Context a = joinLeaveHistoryActivity.mo128196a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
