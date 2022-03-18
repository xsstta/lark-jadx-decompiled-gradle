package com.ss.android.lark.search.impl.func.chatimage;

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
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceFragment;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatImageResourceActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final String f131949a = f131949a;

    /* renamed from: b */
    public static final Companion f131950b = new Companion(null);

    /* renamed from: c */
    private ChatImageResourceFragment f131951c;

    /* renamed from: a */
    public Context mo182359a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo182360a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo182361a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m206702a(this, context);
    }

    /* renamed from: b */
    public void mo182362b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo182363c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m206700a(this, configuration);
    }

    public AssetManager getAssets() {
        return m206704c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m206701a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m206703b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatimage/ChatImageResourceActivity$Companion;", "", "()V", "LOG_TAG", "", "getLOG_TAG", "()Ljava/lang/String;", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.impl.func.chatimage.ChatImageResourceActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m206705d() {
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString(ChatImageResourceFragment.f131954c.mo182367a(), "");
            boolean z = extras.getBoolean(ChatImageResourceFragment.f131954c.mo182368b(), false);
            if (TextUtils.isEmpty(string)) {
                Log.m165383e(f131949a, "chatid == null");
                finish();
            }
            Bundle bundle = new Bundle();
            bundle.putString(ChatImageResourceFragment.f131954c.mo182367a(), string);
            bundle.putBoolean(ChatImageResourceFragment.f131954c.mo182368b(), z);
            ChatImageResourceFragment aVar = new ChatImageResourceFragment();
            this.f131951c = aVar;
            if (aVar != null) {
                aVar.setArguments(bundle);
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "supportFragmentManager.beginTransaction()");
                beginTransaction.add(16908290, aVar, (String) null);
                beginTransaction.commitNowAllowingStateLoss();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m206705d();
    }

    /* renamed from: a */
    public static Resources m206701a(ChatImageResourceActivity chatImageResourceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatImageResourceActivity);
        }
        return chatImageResourceActivity.mo182360a();
    }

    /* renamed from: c */
    public static AssetManager m206704c(ChatImageResourceActivity chatImageResourceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatImageResourceActivity);
        }
        return chatImageResourceActivity.mo182363c();
    }

    /* renamed from: b */
    public static void m206703b(ChatImageResourceActivity chatImageResourceActivity) {
        chatImageResourceActivity.mo182362b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatImageResourceActivity chatImageResourceActivity2 = chatImageResourceActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatImageResourceActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m206702a(ChatImageResourceActivity chatImageResourceActivity, Context context) {
        chatImageResourceActivity.mo182361a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatImageResourceActivity);
        }
    }

    /* renamed from: a */
    public static Context m206700a(ChatImageResourceActivity chatImageResourceActivity, Configuration configuration) {
        Context a = chatImageResourceActivity.mo182359a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ChatImageResourceFragment aVar = this.f131951c;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}
