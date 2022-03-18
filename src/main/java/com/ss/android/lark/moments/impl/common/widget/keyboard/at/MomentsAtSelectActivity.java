package com.ss.android.lark.moments.impl.common.widget.keyboard.at;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsSelectChatterFragment;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\b\u0010\n\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\u0006H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtSelectActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "atSelectFragment", "Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsSelectChatterFragment;", "finish", "", "finishActivityForResult", "info", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MomentsAtSelectActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f119311a = new Companion(null);

    /* renamed from: b */
    private MomentsSelectChatterFragment f119312b;

    /* renamed from: a */
    public Context mo166267a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo166268a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo166269a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m187342a(this, context);
    }

    /* renamed from: b */
    public void mo166271b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo166272c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m187340a(this, configuration);
    }

    public AssetManager getAssets() {
        return m187344c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m187341a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m187343b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/common/widget/keyboard/at/MomentsAtSelectActivity$Companion;", "", "()V", "EXTRA_KEY_CHATTER_INFO", "", "LOG_TAG", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.common.widget.keyboard.at.MomentsAtSelectActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        KeyboardUtils.hideKeyboard(this);
        super.finish();
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        MomentsSelectChatterFragment gVar = this.f119312b;
        if (gVar != null && gVar.mo166291a()) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Log.m165389i("MomentsAtSelectActivity", "onDestroy");
    }

    /* renamed from: a */
    public static Resources m187341a(MomentsAtSelectActivity momentsAtSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsAtSelectActivity);
        }
        return momentsAtSelectActivity.mo166268a();
    }

    /* renamed from: c */
    public static AssetManager m187344c(MomentsAtSelectActivity momentsAtSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsAtSelectActivity);
        }
        return momentsAtSelectActivity.mo166272c();
    }

    /* renamed from: b */
    public static void m187343b(MomentsAtSelectActivity momentsAtSelectActivity) {
        momentsAtSelectActivity.mo166271b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MomentsAtSelectActivity momentsAtSelectActivity2 = momentsAtSelectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    momentsAtSelectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m165389i("MomentsAtSelectActivity", "onCreate");
        MomentsSelectChatterFragment.Companion aVar = MomentsSelectChatterFragment.f119327a;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        MomentsSelectChatterFragment a = aVar.mo166293a(intent.getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
        beginTransaction.add(16908290, a);
        beginTransaction.commitAllowingStateLoss();
        this.f119312b = a;
    }

    /* renamed from: a */
    public final void mo166270a(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        Intent intent = new Intent();
        intent.putExtra("chatter_info", searchBaseInfo);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: a */
    public static void m187342a(MomentsAtSelectActivity momentsAtSelectActivity, Context context) {
        momentsAtSelectActivity.mo166269a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(momentsAtSelectActivity);
        }
    }

    /* renamed from: a */
    public static Context m187340a(MomentsAtSelectActivity momentsAtSelectActivity, Configuration configuration) {
        Context a = momentsAtSelectActivity.mo166267a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
