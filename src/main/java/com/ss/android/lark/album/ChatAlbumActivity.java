package com.ss.android.lark.album;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "mFragment", "Lcom/ss/android/lark/album/ChatAlbumFragment;", "onActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupFragment", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatAlbumActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final String f72056a = f72056a;

    /* renamed from: b */
    public static final Companion f72057b = new Companion(null);

    /* renamed from: c */
    private ChatAlbumFragment f72058c;

    /* renamed from: a */
    public Context mo101897a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo101898a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo101899a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m104986a(this, context);
    }

    /* renamed from: b */
    public void mo101900b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo101901c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m104984a(this, configuration);
    }

    public AssetManager getAssets() {
        return m104988c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m104985a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m104987b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/album/ChatAlbumActivity$Companion;", "", "()V", "LOG_TAG", "", "getLOG_TAG", "()Ljava/lang/String;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.album.ChatAlbumActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d */
    private final void m104989d() {
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            String string = extras.getString(ChatAlbumFragment.f72061c.mo101905a(), "");
            boolean z = extras.getBoolean(ChatAlbumFragment.f72061c.mo101906b(), false);
            if (TextUtils.isEmpty(string)) {
                Log.m165383e(f72056a, "chatid == null");
                finish();
            }
            Bundle bundle = new Bundle();
            bundle.putString(ChatAlbumFragment.f72061c.mo101905a(), string);
            bundle.putBoolean(ChatAlbumFragment.f72061c.mo101906b(), z);
            ChatAlbumFragment aVar = new ChatAlbumFragment();
            this.f72058c = aVar;
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
        m104989d();
    }

    /* renamed from: a */
    public static Resources m104985a(ChatAlbumActivity chatAlbumActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatAlbumActivity);
        }
        return chatAlbumActivity.mo101898a();
    }

    /* renamed from: c */
    public static AssetManager m104988c(ChatAlbumActivity chatAlbumActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatAlbumActivity);
        }
        return chatAlbumActivity.mo101901c();
    }

    /* renamed from: b */
    public static void m104987b(ChatAlbumActivity chatAlbumActivity) {
        chatAlbumActivity.mo101900b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            ChatAlbumActivity chatAlbumActivity2 = chatAlbumActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    chatAlbumActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m104986a(ChatAlbumActivity chatAlbumActivity, Context context) {
        chatAlbumActivity.mo101899a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(chatAlbumActivity);
        }
    }

    /* renamed from: a */
    public static Context m104984a(ChatAlbumActivity chatAlbumActivity, Configuration configuration) {
        Context a = chatAlbumActivity.mo101897a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ChatAlbumFragment aVar = this.f72058c;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        }
    }
}
