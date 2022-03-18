package com.ss.android.lark.member_manage.impl.show_member.common_group;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;

public class ShowGroupMemberActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C45197e f114387a;

    /* renamed from: a */
    public Context mo159735a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159736a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159737a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m179340a(this, context);
    }

    /* renamed from: b */
    public void mo159738b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159739c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m179338a(this, configuration);
    }

    public AssetManager getAssets() {
        return m179343c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m179339a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m179342b(this);
    }

    /* renamed from: d */
    private void m179344d() {
        C45197e eVar = new C45197e();
        this.f114387a = eVar;
        eVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f114387a, (String) null);
        beginTransaction.commitAllowingStateLoss();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m179339a(ShowGroupMemberActivity showGroupMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(showGroupMemberActivity);
        }
        return showGroupMemberActivity.mo159736a();
    }

    /* renamed from: c */
    public static AssetManager m179343c(ShowGroupMemberActivity showGroupMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(showGroupMemberActivity);
        }
        return showGroupMemberActivity.mo159739c();
    }

    /* renamed from: b */
    public static void m179342b(ShowGroupMemberActivity showGroupMemberActivity) {
        showGroupMemberActivity.mo159738b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ShowGroupMemberActivity showGroupMemberActivity2 = showGroupMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    showGroupMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        C48211b.m190252a("ShowGroupMemberActivity").mo168688b();
        super.onCreate(bundle);
        if (!m179341a(getIntent().getExtras())) {
            finish();
        } else {
            m179344d();
        }
    }

    /* renamed from: a */
    private boolean m179341a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("key_chat_id");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("key_chatter_ids");
        if (!TextUtils.isEmpty(string) || !CollectionUtils.isEmpty(stringArrayList)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m179340a(ShowGroupMemberActivity showGroupMemberActivity, Context context) {
        showGroupMemberActivity.mo159737a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(showGroupMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m179338a(ShowGroupMemberActivity showGroupMemberActivity, Configuration configuration) {
        Context a = showGroupMemberActivity.mo159735a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C45197e eVar = this.f114387a;
        if (eVar != null) {
            eVar.onActivityResult(i, i2, intent);
        }
    }
}
