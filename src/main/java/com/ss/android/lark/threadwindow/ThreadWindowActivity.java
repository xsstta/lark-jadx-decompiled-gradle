package com.ss.android.lark.threadwindow;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.aj;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.im.api.ChatBundle;
import com.ss.android.lark.chat.chatwindow.chat.message.p1631f.p1633b.C33360a;
import com.ss.android.lark.chatwindow.AvatarKeyIconFactory;
import com.ss.android.lark.dependency.AbstractC36450aa;
import com.ss.android.lark.dependency.AbstractC36474h;
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
import com.ss.android.lark.threadwindow.fragment.C56089g;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.light.layout.TextLayoutBuilder;

public class ThreadWindowActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private static String f138388a;

    /* renamed from: b */
    private final AbstractC36474h f138389b = C29990c.m110930b();

    /* renamed from: c */
    private C56089g f138390c = null;

    /* renamed from: d */
    private MultitaskHelper f138391d;

    /* renamed from: a */
    public Context mo190876a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo190877a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo190878a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m217627a(this, context);
    }

    /* renamed from: b */
    public void mo190879b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo190880c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m217623a(this, configuration);
    }

    public AssetManager getAssets() {
        return m217630c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m217624a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isSlideEnable() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m217629b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        TextLayoutBuilder.m226861b();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        C29990c.m110930b().ad().mo134633b();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isDoAnimationWithDefault() {
        Intent intent = getIntent();
        if (intent == null || intent.getBooleanExtra("DoAnimationWithDefault", true)) {
            return true;
        }
        intent.removeExtra("DoAnimationWithDefault");
        return false;
    }

    /* renamed from: d */
    private void m217631d() {
        C56089g gVar = new C56089g();
        this.f138390c = gVar;
        gVar.setArguments(getIntent().getExtras());
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(16908290, this.f138390c, C56089g.class.getName());
        beginTransaction.commitNowAllowingStateLoss();
    }

    /* renamed from: a */
    private AbstractC48369g m217625a(final Intent intent) {
        return new AbstractC48369g() {
            /* class com.ss.android.lark.threadwindow.ThreadWindowActivity.C559901 */

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
                return ThreadWindowActivity.this;
            }

            @Override // com.ss.android.lark.multitask.task.AbstractC48379u
            /* renamed from: b */
            public AbstractC48378t mo23783b() {
                return new C48367d(ThreadWindowActivity.class);
            }

            /* renamed from: h */
            public C48366c mo23782a() {
                return new C48366c(ThreadWindowActivity.this, intent) {
                    /* class com.ss.android.lark.threadwindow.ThreadWindowActivity.C559901.C559911 */

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: c */
                    public String mo23791c() {
                        return "circle";
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: a */
                    public Task.IconFactory mo23788a() {
                        return new AvatarKeyIconFactory(((MultitaskSharedThreadPropertiesViewModel) aj.m5366a(ThreadWindowActivity.this).mo6005a(MultitaskSharedThreadPropertiesViewModel.class)).getChatId());
                    }

                    @Override // com.ss.android.lark.multitask.task.C48366c, com.ss.android.lark.multitask.task.Task
                    /* renamed from: b */
                    public CharSequence mo23790b() {
                        return ((MultitaskSharedThreadPropertiesViewModel) aj.m5366a(ThreadWindowActivity.this).mo6005a(MultitaskSharedThreadPropertiesViewModel.class)).getChatName();
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

    /* renamed from: b */
    private void m217628b(Intent intent) {
        this.f138391d = this.f138391d.mo169042a(m217625a(intent));
    }

    /* renamed from: a */
    public static Resources m217624a(ThreadWindowActivity threadWindowActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadWindowActivity);
        }
        return threadWindowActivity.mo190877a();
    }

    /* renamed from: c */
    public static AssetManager m217630c(ThreadWindowActivity threadWindowActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadWindowActivity);
        }
        return threadWindowActivity.mo190880c();
    }

    /* renamed from: b */
    public static void m217629b(ThreadWindowActivity threadWindowActivity) {
        threadWindowActivity.mo190879b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ThreadWindowActivity threadWindowActivity2 = threadWindowActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    threadWindowActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.m165383e("threadwindow", "open thread failed，bundle is null!!!");
            return;
        }
        ChatBundle a = ChatBundle.m109260a(extras);
        if (TextUtils.isEmpty(f138388a) || !f138388a.equals(a.f74027a)) {
            m217626a(extras, true);
            m217628b(intent);
            return;
        }
        Log.m165389i("threadwindow", "open same thread");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        PerfLog.end("open_thread_activity", "");
        super.onCreate(bundle);
        C33360a.m125899a(this);
        AbstractC36450aa N = this.f138389b.mo134515N();
        if (!N.mo134404g()) {
            N.mo134395a(this);
            finish();
        } else if (bundle != null) {
            finish();
        } else {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            m217626a(extras, false);
            this.f138391d = MultitaskHelper.m190621a(m217625a(getIntent()), true, true);
        }
    }

    /* renamed from: a */
    public static void m217627a(ThreadWindowActivity threadWindowActivity, Context context) {
        threadWindowActivity.mo190878a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(threadWindowActivity);
        }
    }

    /* renamed from: a */
    public static Context m217623a(ThreadWindowActivity threadWindowActivity, Configuration configuration) {
        Context a = threadWindowActivity.mo190876a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private void m217626a(Bundle bundle, boolean z) {
        f138388a = bundle.getString("chatID");
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag(C56089g.class.getName());
        if (findFragmentByTag == null || !z) {
            m217631d();
            return;
        }
        findFragmentByTag.setArguments(bundle);
        ((C56089g) findFragmentByTag).mo191358a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C56089g gVar = this.f138390c;
        if (gVar != null) {
            gVar.onActivityResult(i, i2, intent);
        }
    }
}
