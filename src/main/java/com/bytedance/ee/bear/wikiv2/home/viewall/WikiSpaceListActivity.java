package com.bytedance.ee.bear.wikiv2.home.viewall;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wikiv2.home.C12267b;
import com.bytedance.ee.bear.wikiv2.home.viewall_multitab.WikiSpaceTabFragment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\"\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\u0006H\u0014J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0010\u001a\u00020\u0006H\u0002¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "args", "Landroid/os/Bundle;", "fragmentActivityResult", "", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onActivityResult", "onDestroy", "onDoCreate", "savedInstanceState", "setupContent", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiSpaceListActivity extends BaseActivity {

    /* renamed from: a */
    public static final Companion f33010a = new Companion(null);

    /* renamed from: a */
    public Context mo46883a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo46884a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo46885a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m51253a(this, context);
    }

    /* renamed from: b */
    public void mo46886b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo46887c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m51250a(this, configuration);
    }

    public AssetManager getAssets() {
        return m51255c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m51251a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m51254b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/home/viewall/WikiSpaceListActivity$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.home.viewall.WikiSpaceListActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        C13479a.m54764b("WikiSpaceListActivity", "onDestroy");
    }

    /* renamed from: d */
    private final void m51256d() {
        Fragment fragment;
        if (C12267b.m51040a()) {
            fragment = new WikiSpaceTabFragment();
        } else {
            fragment = new WikiSpaceListFragment();
        }
        Fragment fragment2 = fragment;
        fragment2.setArguments(m51257e());
        getSupportFragmentManager().beginTransaction().replace(16908290, fragment2, fragment2.getClass().getSimpleName()).commitAllowingStateLoss();
    }

    /* renamed from: e */
    private final Bundle m51257e() {
        String name = WikiSpaceListArgs.class.getName();
        Intrinsics.checkExpressionValueIsNotNull(name, "WikiSpaceListArgs::class.java.name");
        WikiSpaceListArgs wikiSpaceListArgs = (WikiSpaceListArgs) getIntent().getParcelableExtra(name);
        if (wikiSpaceListArgs == null) {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("space_list_data");
            int intExtra = getIntent().getIntExtra("EXTRA_PAGE_MODE", 0);
            Intent intent = getIntent();
            C8275a aVar = C8275a.f22371d;
            Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
            wikiSpaceListArgs = new WikiSpaceListArgs(parcelableArrayListExtra, intExtra, intent.getIntExtra("createDocumentType", aVar.mo32555b()), getIntent().getStringExtra("src_token"), getIntent().getIntExtra("src_obj_type", -1), getIntent().getStringExtra("src_parent_token"), getIntent().getIntExtra("srcIsLock", -1));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(name, wikiSpaceListArgs);
        return bundle;
    }

    /* renamed from: a */
    public static Resources m51251a(WikiSpaceListActivity wikiSpaceListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceListActivity);
        }
        return wikiSpaceListActivity.mo46884a();
    }

    /* renamed from: c */
    public static AssetManager m51255c(WikiSpaceListActivity wikiSpaceListActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceListActivity);
        }
        return wikiSpaceListActivity.mo46887c();
    }

    /* renamed from: b */
    public static void m51254b(WikiSpaceListActivity wikiSpaceListActivity) {
        wikiSpaceListActivity.mo46886b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiSpaceListActivity wikiSpaceListActivity2 = wikiSpaceListActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiSpaceListActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        C13479a.m54764b("WikiSpaceListActivity", "onDoCreate");
        if (bundle == null) {
            m51256d();
        }
    }

    /* renamed from: a */
    public static void m51253a(WikiSpaceListActivity wikiSpaceListActivity, Context context) {
        wikiSpaceListActivity.mo46885a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceListActivity);
        }
    }

    /* renamed from: a */
    public static Context m51250a(WikiSpaceListActivity wikiSpaceListActivity, Configuration configuration) {
        Context a = wikiSpaceListActivity.mo46883a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13479a.m54764b("WikiSpaceListActivity", "onActivityResult");
        m51252a(i, i2, intent);
    }

    /* renamed from: a */
    private final void m51252a(int i, int i2, Intent intent) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "supportFragmentManager");
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
