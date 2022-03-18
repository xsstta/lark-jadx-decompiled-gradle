package com.ss.android.lark.member_manage.impl.select_ding_member;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class SelectDingMemberActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C45170h f114336a;

    /* renamed from: a */
    public Context mo159683a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159684a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159685a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m179212a(this, context);
    }

    /* renamed from: b */
    public void mo159686b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159687c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m179210a(this, configuration);
    }

    public AssetManager getAssets() {
        return m179215c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m179211a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m179214b(this);
    }

    /* renamed from: a */
    public static Resources m179211a(SelectDingMemberActivity selectDingMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectDingMemberActivity);
        }
        return selectDingMemberActivity.mo159684a();
    }

    /* renamed from: c */
    public static AssetManager m179215c(SelectDingMemberActivity selectDingMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectDingMemberActivity);
        }
        return selectDingMemberActivity.mo159687c();
    }

    /* renamed from: b */
    public static void m179214b(SelectDingMemberActivity selectDingMemberActivity) {
        selectDingMemberActivity.mo159686b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SelectDingMemberActivity selectDingMemberActivity2 = selectDingMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    selectDingMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!m179213a(intent.getExtras())) {
            finish();
            return;
        }
        C45170h hVar = new C45170h();
        this.f114336a = hVar;
        hVar.setArguments(intent.getExtras());
        getSupportFragmentManager().beginTransaction().add(16908290, this.f114336a).commitAllowingStateLoss();
    }

    /* renamed from: a */
    private boolean m179213a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("key_chat_id");
        String string2 = bundle.getString("key_message_id");
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m179212a(SelectDingMemberActivity selectDingMemberActivity, Context context) {
        selectDingMemberActivity.mo159685a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectDingMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m179210a(SelectDingMemberActivity selectDingMemberActivity, Configuration configuration) {
        Context a = selectDingMemberActivity.mo159683a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C45170h hVar = this.f114336a;
        if (hVar != null) {
            hVar.onActivityResult(i, i2, intent);
        }
    }
}
