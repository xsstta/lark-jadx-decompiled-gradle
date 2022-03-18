package com.ss.android.lark.threaddetail;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.aj;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chatwindow.AvatarKeyIconFactory;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.MultitaskHelper;
import com.ss.android.lark.multitask.task.AbstractC48369g;
import com.ss.android.lark.multitask.task.AbstractC48375n;
import com.ss.android.lark.multitask.task.AbstractC48378t;
import com.ss.android.lark.multitask.task.C48366c;
import com.ss.android.lark.multitask.task.C48367d;
import com.ss.android.lark.multitask.task.EventTracker;
import com.ss.android.lark.multitask.task.GlobalTaskContainer;
import com.ss.android.lark.multitask.task.Task;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.lark.threaddetail.p2749a.C55772a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;

public class ThreadDetailActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C55772a f137590a;

    /* renamed from: b */
    private MultitaskHelper f137591b;

    /* renamed from: a */
    public Context mo190036a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo190037a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo190038a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m215995a(this, context);
    }

    /* renamed from: b */
    public void mo190039b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo190040c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m215992a(this, configuration);
    }

    public AssetManager getAssets() {
        return m215997c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m215993a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m215996b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (!this.f137590a.mo190261a()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        this.f137590a = null;
        TextLayoutBuilder.m226861b();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        C29990c.m110930b().ad().mo134633b();
    }

    /* renamed from: d */
    private void m215998d() {
        C55772a aVar = new C55772a();
        this.f137590a = aVar;
        aVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f137590a, (String) null);
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    private AbstractC48369g m215994a(final Intent intent) {
        return new AbstractC48369g() {
            /* class com.ss.android.lark.threaddetail.ThreadDetailActivity.C557641 */

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u, com.ss.android.lark.multitask.task.AbstractC48369g
            public /* synthetic */ EventTracker O_() {
                return AbstractC48369g.CC.$default$O_(this);
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48369g
            public /* synthetic */ FragmentActivity p_() {
                return AbstractC48369g.CC.$default$p_(this);
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: e */
            public AbstractC48375n mo23786e() {
                return GlobalTaskContainer.f121801b;
            }

            /* renamed from: g */
            public AppCompatActivity mo23785d() {
                return ThreadDetailActivity.this;
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: b */
            public AbstractC48378t mo23783b() {
                return new C48367d(ThreadDetailActivity.class);
            }

            /* renamed from: h */
            public C48366c mo23782a() {
                return new C48366c(ThreadDetailActivity.this, intent) {
                    /* class com.ss.android.lark.threaddetail.ThreadDetailActivity.C557641.C557651 */

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: c */
                    public String mo23791c() {
                        return ChatTypeStateKeeper.f135670e;
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: a */
                    public Task.IconFactory mo23788a() {
                        return new AvatarKeyIconFactory(((ThreadDetailTitleViewModel) aj.m5366a(ThreadDetailActivity.this).mo6005a(ThreadDetailTitleViewModel.class)).getChatId());
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: b */
                    public CharSequence mo23790b() {
                        return ((ThreadDetailTitleViewModel) aj.m5366a(ThreadDetailActivity.this).mo6005a(ThreadDetailTitleViewModel.class)).getTitle();
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: a */
                    public void mo23789a(Bundle bundle) {
                        bundle.putAll(intent.getExtras());
                    }
                };
            }
        };
    }

    /* renamed from: a */
    public static Resources m215993a(ThreadDetailActivity threadDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadDetailActivity);
        }
        return threadDetailActivity.mo190037a();
    }

    /* renamed from: c */
    public static AssetManager m215997c(ThreadDetailActivity threadDetailActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadDetailActivity);
        }
        return threadDetailActivity.mo190040c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C33360a.m125899a(this);
        m215998d();
        this.f137591b = MultitaskHelper.m190621a(m215994a(getIntent()), true, true);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C29990c.m110930b().mo134577e().mo120963b(getApplicationContext());
        }
    }

    /* renamed from: b */
    public static void m215996b(ThreadDetailActivity threadDetailActivity) {
        threadDetailActivity.mo190039b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ThreadDetailActivity threadDetailActivity2 = threadDetailActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    threadDetailActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m215995a(ThreadDetailActivity threadDetailActivity, Context context) {
        threadDetailActivity.mo190038a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadDetailActivity);
        }
    }

    /* renamed from: a */
    public static Context m215992a(ThreadDetailActivity threadDetailActivity, Configuration configuration) {
        Context a = threadDetailActivity.mo190036a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C55772a aVar = this.f137590a;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}
