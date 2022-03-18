package com.bytedance.ee.bear.wikiv2.wikitreev2.main;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.view.WikiEmptyView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiDefaultRouteActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "errorCode", "", "getErrorCode", "()I", "setErrorCode", "(I)V", "onDoCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "parseBundle", "transferErrorCodeToEmptyStatus", "errCode", "updateView", "errorState", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class WikiDefaultRouteActivity extends BaseActivity {

    /* renamed from: a */
    public static final Companion f33344a = new Companion(null);

    /* renamed from: b */
    private int f33345b = -1;

    /* renamed from: c */
    private HashMap f33346c;

    /* renamed from: a */
    public final int mo47342a(int i) {
        if (i == -2) {
            return 1;
        }
        if (i != 920004002) {
            return i != 920004004 ? 3 : 99;
        }
        return 5;
    }

    /* renamed from: a */
    public Context mo47343a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo47345a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m51683a(this, context);
    }

    /* renamed from: b */
    public Resources mo47346b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo47347c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m51681a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo47350d() {
        return super.getAssets();
    }

    /* renamed from: d */
    public View mo47351d(int i) {
        if (this.f33346c == null) {
            this.f33346c = new HashMap();
        }
        View view = (View) this.f33346c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f33346c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public AssetManager getAssets() {
        return m51685c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m51682a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m51684b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/wikitreev2/main/WikiDefaultRouteActivity$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.main.WikiDefaultRouteActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo47344a() {
        int intExtra = getIntent().getIntExtra("wiki_space_error_code", -1);
        this.f33345b = intExtra;
        mo47342a(intExtra);
    }

    /* renamed from: a */
    public static Resources m51682a(WikiDefaultRouteActivity wikiDefaultRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiDefaultRouteActivity);
        }
        return wikiDefaultRouteActivity.mo47346b();
    }

    /* renamed from: c */
    public static AssetManager m51685c(WikiDefaultRouteActivity wikiDefaultRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiDefaultRouteActivity);
        }
        return wikiDefaultRouteActivity.mo47350d();
    }

    /* renamed from: b */
    public static void m51684b(WikiDefaultRouteActivity wikiDefaultRouteActivity) {
        wikiDefaultRouteActivity.mo47347c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiDefaultRouteActivity wikiDefaultRouteActivity2 = wikiDefaultRouteActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiDefaultRouteActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo47348c(int i) {
        WikiEmptyView wikiEmptyView = (WikiEmptyView) mo47351d(R.id.wiki_empty_view);
        Intrinsics.checkExpressionValueIsNotNull(wikiEmptyView, "wiki_empty_view");
        wikiEmptyView.setVisibility(0);
        ((WikiEmptyView) mo47351d(R.id.wiki_empty_view)).mo47687a(i);
        ((BaseTitleBar) mo47351d(R.id.common_title)).setTitle("");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.wiki_default_route_activity_v2);
        WikiEmptyView wikiEmptyView = (WikiEmptyView) mo47351d(R.id.wiki_empty_view);
        if (wikiEmptyView != null) {
            WikiEmptyView.m52057a(wikiEmptyView, null, null, 2, null);
        }
        mo47344a();
        mo47348c(mo47342a(this.f33345b));
    }

    /* renamed from: a */
    public static void m51683a(WikiDefaultRouteActivity wikiDefaultRouteActivity, Context context) {
        wikiDefaultRouteActivity.mo47345a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiDefaultRouteActivity);
        }
    }

    /* renamed from: a */
    public static Context m51681a(WikiDefaultRouteActivity wikiDefaultRouteActivity, Configuration configuration) {
        Context a = wikiDefaultRouteActivity.mo47343a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
