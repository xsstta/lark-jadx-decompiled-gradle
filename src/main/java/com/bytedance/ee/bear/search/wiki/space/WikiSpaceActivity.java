package com.bytedance.ee.bear.search.wiki.space;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.search.C10824g;
import com.bytedance.ee.bear.search.C10841k;
import com.bytedance.ee.bear.search.C10870n;
import com.bytedance.ee.bear.search.model.SearchResponse;
import com.bytedance.ee.bear.search.wiki.space.C10902a;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEmptyState;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p712o.p713a.C13716b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.koin.java.KoinJavaComponent;

public class WikiSpaceActivity extends BaseActivity {

    /* renamed from: a */
    private BaseTitleBar f29354a;

    /* renamed from: b */
    private SpaceEditText f29355b;

    /* renamed from: c */
    private BaseRecyclerView f29356c;

    /* renamed from: d */
    private SpaceEmptyState f29357d;

    /* renamed from: e */
    private BearLottieView f29358e;

    /* renamed from: f */
    private C10870n f29359f;

    /* renamed from: g */
    private C10902a f29360g;

    /* renamed from: h */
    private Disposable f29361h;

    /* renamed from: a */
    public Context mo41439a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo41441a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m45352a(this, context);
    }

    /* renamed from: b */
    public Resources mo41443b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo41444c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m45349a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo41446d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m45357c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m45350a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m45356b(this);
    }

    /* renamed from: a */
    public void mo41442a(List<SearchResponse.Data.SpaceData> list) {
        this.f29358e.setVisibility(8);
        this.f29356c.setVisibility(0);
        this.f29357d.setVisibility(8);
        this.f29360g.mo41454a(list);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.facade_slide_bottom_out);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.f29361h;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    /* renamed from: e */
    private void m45358e() {
        BaseTitleBar baseTitleBar = (BaseTitleBar) findViewById(R.id.search_title_layout);
        this.f29354a = baseTitleBar;
        baseTitleBar.setTitle(R.string.Doc_Search_SelectRepository);
        this.f29354a.setDividerVisible(false);
        SpaceEditText spaceEditText = (SpaceEditText) findViewById(R.id.search_bar_item_search_bar);
        this.f29355b = spaceEditText;
        spaceEditText.setHint(R.string.Doc_Search_SearchRepository);
        View findViewById = findViewById(R.id.search_bar_item_cancel_button);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        BaseRecyclerView baseRecyclerView = (BaseRecyclerView) findViewById(R.id.search_result_recycler);
        this.f29356c = baseRecyclerView;
        baseRecyclerView.setSceneTag("wiki_space_rv");
        this.f29356c.setLayoutManager(new LinearLayoutManager(this));
        this.f29357d = (SpaceEmptyState) findViewById(R.id.search_space_not_found_empty_state);
        this.f29358e = (BearLottieView) findViewById(R.id.search_loading);
        C10902a aVar = new C10902a(this);
        this.f29360g = aVar;
        aVar.mo41452a(new C10902a.AbstractC10904a() {
            /* class com.bytedance.ee.bear.search.wiki.space.WikiSpaceActivity.C109001 */

            @Override // com.bytedance.ee.bear.search.wiki.space.C10902a.AbstractC10904a
            /* renamed from: a */
            public void mo41449a(SearchResponse.Data.SpaceData spaceData) {
                Intent intent = new Intent();
                intent.putExtra("key_type_space_item", spaceData);
                WikiSpaceActivity.this.setResult(-1, intent);
                WikiSpaceActivity.this.finish();
            }
        });
        this.f29356c.setAdapter(this.f29360g);
    }

    /* renamed from: f */
    private void m45359f() {
        this.f29361h = C13716b.m55614a(this.f29355b).debounce(300, TimeUnit.MILLISECONDS, C11678b.m48480d()).observeOn(C11678b.m48481e()).subscribe(new Consumer() {
            /* class com.bytedance.ee.bear.search.wiki.space.$$Lambda$WikiSpaceActivity$7k2q6PyPKxSl2JG04kbQa47HIM */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                WikiSpaceActivity.this.m45353a((WikiSpaceActivity) ((CharSequence) obj));
            }
        }, $$Lambda$WikiSpaceActivity$3my3aEGpC978xjLIVuPyU2_4Ekc.INSTANCE);
        C10870n nVar = (C10870n) aj.m5367a(this, C10824g.m44896a(C10841k.m44952a((NetService) KoinJavaComponent.m268610a(NetService.class)))).mo6005a(C10870n.class);
        this.f29359f = nVar;
        nVar.getSearchWikiSpaceResult().mo5923a(this, new AbstractC1178x<List<SearchResponse.Data.SpaceData>>() {
            /* class com.bytedance.ee.bear.search.wiki.space.WikiSpaceActivity.C109012 */

            /* renamed from: a */
            public void onChanged(List<SearchResponse.Data.SpaceData> list) {
                if (list == null || list.isEmpty()) {
                    WikiSpaceActivity.this.mo41440a();
                } else {
                    WikiSpaceActivity.this.mo41442a(list);
                }
            }
        });
        this.f29354a.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.search.wiki.space.$$Lambda$WikiSpaceActivity$uF_VhuQdmz7za4BuTZpBgKYRk3I */

            public final void onClick(View view) {
                WikiSpaceActivity.this.m45351a((WikiSpaceActivity) view);
            }
        });
    }

    /* renamed from: a */
    public void mo41440a() {
        this.f29358e.setVisibility(8);
        this.f29356c.setVisibility(8);
        this.f29357d.setVisibility(0);
        this.f29357d.setDesc(getString(R.string.Doc_Search_SearchNotFoundTip));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45351a(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45353a(CharSequence charSequence) throws Exception {
        m45354a(charSequence.toString());
    }

    /* renamed from: a */
    public static Resources m45350a(WikiSpaceActivity wikiSpaceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceActivity);
        }
        return wikiSpaceActivity.mo41443b();
    }

    /* renamed from: c */
    public static AssetManager m45357c(WikiSpaceActivity wikiSpaceActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceActivity);
        }
        return wikiSpaceActivity.mo41446d();
    }

    /* renamed from: b */
    public static void m45356b(WikiSpaceActivity wikiSpaceActivity) {
        wikiSpaceActivity.mo41444c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            WikiSpaceActivity wikiSpaceActivity2 = wikiSpaceActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    wikiSpaceActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m45354a(String str) {
        if (C5084ad.m20847d().mo20038b().mo20041b()) {
            this.f29359f.searchWikiSpace(str);
        } else {
            mo41440a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        C13479a.m54764b("WikiSpaceActivity", "onDoCreate()...");
        setContentView(R.layout.wiki_space_activity);
        m45358e();
        m45359f();
        m45354a("");
    }

    /* renamed from: a */
    public static void m45352a(WikiSpaceActivity wikiSpaceActivity, Context context) {
        wikiSpaceActivity.mo41441a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(wikiSpaceActivity);
        }
    }

    /* renamed from: a */
    public static Context m45349a(WikiSpaceActivity wikiSpaceActivity, Configuration configuration) {
        Context a = wikiSpaceActivity.mo41439a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
