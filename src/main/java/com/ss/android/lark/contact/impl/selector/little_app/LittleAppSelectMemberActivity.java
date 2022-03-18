package com.ss.android.lark.contact.impl.selector.little_app;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.contact.C35358a;
import com.ss.android.lark.contact.impl.p1761f.C35883b;
import com.ss.android.lark.contact.impl.selector.bean.C35968a;
import com.ss.android.lark.contact.impl.selector.little_app.AbstractC35977a;
import com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.List;
import java.util.Map;

public class LittleAppSelectMemberActivity extends BaseFragmentActivity {

    /* renamed from: a */
    C35985c f92996a;

    /* renamed from: b */
    LittleAppSelectMemberView.AbstractC35976a f92997b = new LittleAppSelectMemberView.AbstractC35976a() {
        /* class com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberActivity.C359701 */

        @Override // com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.AbstractC35976a
        /* renamed from: a */
        public void mo132325a() {
            LittleAppSelectMemberActivity.this.finish();
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.AbstractC35976a
        /* renamed from: b */
        public FragmentManager mo132330b() {
            return LittleAppSelectMemberActivity.this.getSupportFragmentManager();
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.AbstractC35976a
        /* renamed from: a */
        public void mo132326a(Intent intent) {
            LittleAppSelectMemberActivity.this.setResult(-1, intent);
            mo132325a();
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.AbstractC35976a
        /* renamed from: b */
        public void mo132331b(Intent intent) {
            LittleAppSelectMemberActivity.this.setResult(SmEvents.EVENT_NT, intent);
            mo132325a();
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.AbstractC35976a
        /* renamed from: a */
        public void mo132327a(AbstractC35977a.AbstractC35979b bVar) {
            ButterKnife.bind(bVar, LittleAppSelectMemberActivity.this);
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.AbstractC35976a
        /* renamed from: a */
        public void mo132328a(List<SearchBaseInfo> list) {
            C35883b.m140625a().mo130266a(LittleAppSelectMemberActivity.this, C35968a.m140984a(list), HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
        }

        @Override // com.ss.android.lark.contact.impl.selector.little_app.LittleAppSelectMemberView.AbstractC35976a
        /* renamed from: a */
        public void mo132329a(List<String> list, UIGetDataCallback<Map<String, Chatter>> uIGetDataCallback) {
            C35358a.m138143a().mo130165j().mo130201a(list, uIGetDataCallback);
        }
    };

    /* renamed from: a */
    public Context mo132318a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo132319a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo132320a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m140988a(this, context);
    }

    /* renamed from: b */
    public void mo132321b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo132322c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m140986a(this, configuration);
    }

    public AssetManager getAssets() {
        return m140990c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m140987a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m140989b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f92996a.mo132379f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        KeyboardUtils.hideKeyboard(this);
        super.onPause();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.getBoolean("key_specific_transition")) {
            return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
        }
        return new ActivityAnimationManager.AnimationConfig(new int[]{extras.getInt("key_activity_enter_transition"), extras.getInt("key_activity_exit_transition")});
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        this.f92996a.mo132375a(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public static Resources m140987a(LittleAppSelectMemberActivity littleAppSelectMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(littleAppSelectMemberActivity);
        }
        return littleAppSelectMemberActivity.mo132319a();
    }

    /* renamed from: c */
    public static AssetManager m140990c(LittleAppSelectMemberActivity littleAppSelectMemberActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(littleAppSelectMemberActivity);
        }
        return littleAppSelectMemberActivity.mo132322c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_little_app_select_member);
        C35985c cVar = new C35985c(this, getIntent(), bundle, this.f92997b);
        this.f92996a = cVar;
        cVar.create();
    }

    /* renamed from: b */
    public static void m140989b(LittleAppSelectMemberActivity littleAppSelectMemberActivity) {
        littleAppSelectMemberActivity.mo132321b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LittleAppSelectMemberActivity littleAppSelectMemberActivity2 = littleAppSelectMemberActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    littleAppSelectMemberActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m140988a(LittleAppSelectMemberActivity littleAppSelectMemberActivity, Context context) {
        littleAppSelectMemberActivity.mo132320a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(littleAppSelectMemberActivity);
        }
    }

    /* renamed from: a */
    public static Context m140986a(LittleAppSelectMemberActivity littleAppSelectMemberActivity, Configuration configuration) {
        Context a = littleAppSelectMemberActivity.mo132318a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f92996a.mo132374a(intent);
        }
    }
}
