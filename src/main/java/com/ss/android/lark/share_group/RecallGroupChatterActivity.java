package com.ss.android.lark.share_group;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chatwindow.C35228b;
import com.ss.android.lark.dependency.AbstractC36461ah;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.dto.chat.ProfileSource;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.share_group.C54811c;
import com.ss.android.lark.share_group.RecallGroupChatterView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class RecallGroupChatterActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public AbstractC36461ah f135290a = C29990c.m110930b().mo134523V();

    /* renamed from: b */
    private C54816d f135291b;

    /* renamed from: c */
    private RecallGroupChatterView.AbstractC54800a f135292c = new RecallGroupChatterView.AbstractC54800a() {
        /* class com.ss.android.lark.share_group.RecallGroupChatterActivity.C547971 */

        @Override // com.ss.android.lark.share_group.RecallGroupChatterView.AbstractC54800a
        /* renamed from: a */
        public void mo186988a() {
            RecallGroupChatterActivity.this.finish();
        }

        @Override // com.ss.android.lark.share_group.RecallGroupChatterView.AbstractC54800a
        /* renamed from: a */
        public void mo186989a(RecallGroupChatterView recallGroupChatterView) {
            ButterKnife.bind(recallGroupChatterView, RecallGroupChatterActivity.this);
        }

        @Override // com.ss.android.lark.share_group.RecallGroupChatterView.AbstractC54800a
        /* renamed from: a */
        public void mo186990a(String str) {
            RecallGroupChatterActivity.this.f135290a.mo134436a(RecallGroupChatterActivity.this, new ProfileSource.C36868a().mo136066c(str).mo136060a(5).mo136063a());
        }

        @Override // com.ss.android.lark.share_group.RecallGroupChatterView.AbstractC54800a
        /* renamed from: b */
        public void mo186991b(String str) {
            C35228b.m137564a().mo121114a(RecallGroupChatterActivity.this, ChatBundle.m109259a().mo105927a(str).mo105929a());
        }
    };

    /* renamed from: a */
    public Context mo186981a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo186982a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo186983a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m212565a(this, context);
    }

    /* renamed from: b */
    public void mo186984b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo186985c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m212562a(this, configuration);
    }

    public AssetManager getAssets() {
        return m212567c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m212563a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m212566b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        C54816d dVar = this.f135291b;
        if (dVar != null) {
            dVar.destroy();
            this.f135291b = null;
        }
        super.onDestroy();
    }

    /* renamed from: d */
    private void m212568d() {
        C54816d dVar = new C54816d(new C54811c(m212564a(getIntent())), new RecallGroupChatterView(this, this.f135292c));
        this.f135291b = dVar;
        dVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_recall_group_chatter);
        m212568d();
    }

    /* renamed from: a */
    public static Resources m212563a(RecallGroupChatterActivity recallGroupChatterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recallGroupChatterActivity);
        }
        return recallGroupChatterActivity.mo186982a();
    }

    /* renamed from: c */
    public static AssetManager m212567c(RecallGroupChatterActivity recallGroupChatterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recallGroupChatterActivity);
        }
        return recallGroupChatterActivity.mo186985c();
    }

    /* renamed from: b */
    public static void m212566b(RecallGroupChatterActivity recallGroupChatterActivity) {
        recallGroupChatterActivity.mo186984b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RecallGroupChatterActivity recallGroupChatterActivity2 = recallGroupChatterActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    recallGroupChatterActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private C54811c.C54815a m212564a(Intent intent) {
        if (intent != null) {
            return new C54811c.C54815a(intent.getStringExtra("key_chatId"), intent.getParcelableArrayListExtra("key_entities"), intent.getBooleanExtra("key_is_thread", false));
        }
        return null;
    }

    /* renamed from: a */
    public static void m212565a(RecallGroupChatterActivity recallGroupChatterActivity, Context context) {
        recallGroupChatterActivity.mo186983a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(recallGroupChatterActivity);
        }
    }

    /* renamed from: a */
    public static Context m212562a(RecallGroupChatterActivity recallGroupChatterActivity, Configuration configuration) {
        Context a = recallGroupChatterActivity.mo186981a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
