package com.ss.android.lark.member_manage.impl.atselector;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.impl.atselector.bean.AtSelectInitData;
import com.ss.android.lark.member_manage.impl.atselector.view.AtView;
import com.ss.android.lark.member_manage.impl.statistics.AtSelectPerceptionErrorCostTimeHitPoint;
import com.ss.android.lark.monitor.p2372a.C48211b;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.List;

public class AtSelectActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C44962a f113846a;

    /* renamed from: b */
    private AtView.AbstractC45018a f113847b = new AtView.AbstractC45018a() {
        /* class com.ss.android.lark.member_manage.impl.atselector.AtSelectActivity.C449611 */

        @Override // com.ss.android.lark.member_manage.impl.atselector.view.AtView.AbstractC45018a
        /* renamed from: a */
        public void mo159090a() {
            AtSelectActivity.this.finish();
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.view.AtView.AbstractC45018a
        /* renamed from: a */
        public void mo159091a(AtView atView) {
            ButterKnife.bind(atView, AtSelectActivity.this);
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.view.AtView.AbstractC45018a
        /* renamed from: a */
        public void mo159092a(String str) {
            LKUIToast.show(AtSelectActivity.this, str);
        }

        @Override // com.ss.android.lark.member_manage.impl.atselector.view.AtView.AbstractC45018a
        /* renamed from: a */
        public void mo159093a(List<ChatChatter> list) {
            Intent intent = new Intent();
            GroupMemberManageModule.m177902a().getChatDependency().mo143747a(intent, list);
            AtSelectActivity.this.setResult(-1, intent);
            AtSelectActivity.this.finish();
        }
    };

    /* renamed from: a */
    public Context mo159082a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo159083a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo159084a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m178306a(this, context);
    }

    /* renamed from: b */
    public void mo159085b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo159086c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m178304a(this, configuration);
    }

    public AssetManager getAssets() {
        return m178308c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m178305a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m178307b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C44962a aVar = this.f113846a;
        if (aVar != null) {
            aVar.destroy();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159946i();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C48211b.m190251a().mo168690c();
    }

    /* renamed from: a */
    public static Resources m178305a(AtSelectActivity atSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(atSelectActivity);
        }
        return atSelectActivity.mo159083a();
    }

    /* renamed from: c */
    public static AssetManager m178308c(AtSelectActivity atSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(atSelectActivity);
        }
        return atSelectActivity.mo159086c();
    }

    /* renamed from: b */
    public static void m178307b(AtSelectActivity atSelectActivity) {
        atSelectActivity.mo159085b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AtSelectActivity atSelectActivity2 = atSelectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    atSelectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AtSelectPerceptionErrorCostTimeHitPoint.f114602a.mo159945h();
        C48211b.m190252a("AtSelectActivity").mo168688b();
        C48211b.m190251a().mo168689b("setContentView");
        setContentView(R.layout.activity_chat_at_select);
        C48211b.m190251a().mo168691c("setContentView");
        AtSelectInitData atSelectInitData = (AtSelectInitData) getIntent().getSerializableExtra("extra.init.data");
        if (atSelectInitData == null) {
            Log.m165382e("initData is null");
            finish();
            return;
        }
        C48211b.m190251a().mo168689b("initPresenter");
        C44962a aVar = new C44962a(atSelectInitData, new AtView(this, this.f113847b));
        this.f113846a = aVar;
        aVar.create();
        C48211b.m190251a().mo168691c("initPresenter");
    }

    /* renamed from: a */
    public static void m178306a(AtSelectActivity atSelectActivity, Context context) {
        atSelectActivity.mo159084a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(atSelectActivity);
        }
    }

    /* renamed from: a */
    public static Context m178304a(AtSelectActivity atSelectActivity, Configuration configuration) {
        Context a = atSelectActivity.mo159082a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
