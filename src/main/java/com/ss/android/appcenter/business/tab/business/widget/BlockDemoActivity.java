package com.ss.android.appcenter.business.tab.business.widget;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.air.AirActivity;
import com.larksuite.component.blockit.entity.BlockEntity;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/ss/android/appcenter/business/tab/business/widget/BlockDemoActivity;", "Lcom/larksuite/component/air/AirActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "appcenter_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class BlockDemoActivity extends AirActivity {
    /* renamed from: a */
    public Context mo99579a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo99580a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo99581a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m101980a(this, context);
    }

    /* renamed from: b */
    public void mo99582b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo99583c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m101978a(this, configuration);
    }

    public AssetManager getAssets() {
        return m101982c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m101979a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m101981b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.appcenter.business.tab.business.widget.BlockDemoActivity$a */
    static final class View$OnClickListenerC27934a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BlockDemoActivity f69840a;

        View$OnClickListenerC27934a(BlockDemoActivity blockDemoActivity) {
            this.f69840a = blockDemoActivity;
        }

        public final void onClick(View view) {
            this.f69840a.finish();
        }
    }

    /* renamed from: a */
    public static Resources m101979a(BlockDemoActivity blockDemoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(blockDemoActivity);
        }
        return blockDemoActivity.mo99580a();
    }

    /* renamed from: c */
    public static AssetManager m101982c(BlockDemoActivity blockDemoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(blockDemoActivity);
        }
        return blockDemoActivity.mo99583c();
    }

    /* renamed from: b */
    public static void m101981b(BlockDemoActivity blockDemoActivity) {
        blockDemoActivity.mo99582b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            BlockDemoActivity blockDemoActivity2 = blockDemoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    blockDemoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.block_demo_page);
        String stringExtra = getIntent().getStringExtra("param1");
        String stringExtra2 = getIntent().getStringExtra("param2");
        String stringExtra3 = getIntent().getStringExtra("param3");
        String stringExtra4 = getIntent().getStringExtra("title");
        View findViewById = findViewById(R.id.tv_title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById<TextView>(R.id.tv_title)");
        ((TextView) findViewById).setText(stringExtra4);
        if (!(stringExtra == null || stringExtra2 == null || stringExtra3 == null)) {
            BlockEntity blockEntity = new BlockEntity("123");
            blockEntity.setAppID(stringExtra);
            blockEntity.setBlockTypeID(stringExtra2);
            blockEntity.setSourceData(stringExtra3);
            getSupportFragmentManager().beginTransaction().add(R.id.block_root_view, BlockPageFragment.f69949a.mo99673a(blockEntity)).commitAllowingStateLoss();
        }
        findViewById(R.id.iv_close).setOnClickListener(new View$OnClickListenerC27934a(this));
    }

    /* renamed from: a */
    public static void m101980a(BlockDemoActivity blockDemoActivity, Context context) {
        blockDemoActivity.mo99581a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(blockDemoActivity);
        }
    }

    /* renamed from: a */
    public static Context m101978a(BlockDemoActivity blockDemoActivity, Configuration configuration) {
        Context a = blockDemoActivity.mo99579a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
