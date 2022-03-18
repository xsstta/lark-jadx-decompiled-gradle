package com.huawei.hms.site.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.site.ActivityC23764o;
import com.huawei.hms.site.C23761m;
import com.huawei.hms.site.C23765p;
import com.huawei.hms.site.C23766q;
import com.huawei.hms.site.C23768s;
import com.huawei.hms.site.C23771v;
import com.huawei.hms.site.api.SearchResultListener;
import com.huawei.hms.site.api.SearchService;
import com.huawei.hms.site.api.SearchServiceFactory;
import com.huawei.hms.site.api.model.Coordinate;
import com.huawei.hms.site.api.model.CoordinateBounds;
import com.huawei.hms.site.api.model.DetailSearchRequest;
import com.huawei.hms.site.api.model.DetailSearchResponse;
import com.huawei.hms.site.api.model.LocationType;
import com.huawei.hms.site.api.model.QuerySuggestionRequest;
import com.huawei.hms.site.api.model.QuerySuggestionResponse;
import com.huawei.hms.site.api.model.SearchStatus;
import com.huawei.hms.site.api.model.Site;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends ActivityC23764o {

    /* renamed from: b */
    public SearchService f58851b;

    /* renamed from: c */
    public SiteRecyclerView f58852c;

    /* renamed from: d */
    public List<Site> f58853d = new ArrayList();

    /* renamed from: e */
    public C23771v f58854e;

    /* renamed from: f */
    public boolean f58855f;

    /* renamed from: g */
    public SiteSearchView f58856g;

    /* renamed from: h */
    public String f58857h;

    /* renamed from: i */
    public Coordinate f58858i;

    /* renamed from: j */
    public Integer f58859j;

    /* renamed from: k */
    public List<LocationType> f58860k;

    /* renamed from: l */
    public CoordinateBounds f58861l;

    /* renamed from: m */
    public String f58862m;

    /* renamed from: n */
    public String f58863n;

    /* renamed from: o */
    public String f58864o;

    /* renamed from: p */
    public String f58865p;

    /* renamed from: q */
    public boolean f58866q;

    /* renamed from: r */
    public Boolean f58867r;

    /* renamed from: s */
    public final Handler f58868s = new Handler();

    /* renamed from: t */
    public final Runnable f58869t = new RunnableC23774a();

    /* renamed from: u */
    public SearchResultListener f58870u = new C23777d();

    /* renamed from: com.huawei.hms.site.widget.SearchActivity$a */
    public class RunnableC23774a implements Runnable {
        public RunnableC23774a() {
        }

        public void run() {
            SearchActivity.this.mo85183a();
        }
    }

    /* renamed from: com.huawei.hms.site.widget.SearchActivity$b */
    public class View$OnClickListenerC23775b implements View.OnClickListener {
        public View$OnClickListenerC23775b() {
        }

        public void onClick(View view) {
            SearchActivity.this.onBackPressed();
        }
    }

    public void SearchActivity__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    public Context SearchActivity__createConfigurationContext$___twin___(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    public AssetManager SearchActivity__getAssets$___twin___() {
        return super.getAssets();
    }

    public Resources SearchActivity__getResources$___twin___() {
        return super.getResources();
    }

    public void SearchActivity__onStop$___twin___() {
        super.onStop();
    }

    /* renamed from: a */
    public final void mo85183a() {
        QuerySuggestionRequest querySuggestionRequest = new QuerySuggestionRequest();
        if (!TextUtils.isEmpty(this.f58863n)) {
            querySuggestionRequest.setLanguage(this.f58863n);
        }
        if (!TextUtils.isEmpty(this.f58857h)) {
            querySuggestionRequest.setQuery(this.f58857h);
        }
        if (!TextUtils.isEmpty(this.f58862m)) {
            querySuggestionRequest.setCountryCode(this.f58862m);
        }
        Integer num = this.f58859j;
        if (num != null) {
            querySuggestionRequest.setRadius(num);
        }
        CoordinateBounds coordinateBounds = this.f58861l;
        if (coordinateBounds != null) {
            querySuggestionRequest.setBounds(coordinateBounds);
        }
        Coordinate coordinate = this.f58858i;
        if (coordinate != null) {
            querySuggestionRequest.setLocation(coordinate);
        }
        Boolean bool = this.f58867r;
        if (bool != null) {
            querySuggestionRequest.setStrictBounds(bool);
        }
        querySuggestionRequest.setPoiTypes(this.f58860k);
        this.f58851b.querySuggestion(querySuggestionRequest, new C23778e(querySuggestionRequest.getQuery(), this));
    }

    /* renamed from: a */
    public final void mo85184a(String str) {
        DetailSearchRequest detailSearchRequest = new DetailSearchRequest();
        detailSearchRequest.setSiteId(str);
        detailSearchRequest.setChildren(this.f58866q);
        if (!TextUtils.isEmpty(this.f58863n)) {
            detailSearchRequest.setLanguage(this.f58863n);
        }
        SearchService searchService = this.f58851b;
        if (searchService == null) {
            C23761m.m86935b("SearchActivity", "detailSearch API key is null. Search service is null.");
        } else {
            searchService.detailSearch(detailSearchRequest, this.f58870u);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_setting_service_common_LancetHooker_attachBaseContext(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_integrator_lancet_LancetHooker_createConfigurationContext(this, configuration);
    }

    public AssetManager getAssets() {
        return com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_setting_service_common_LancetHooker_getAssets(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_setting_service_common_LancetHooker_getResources(this);
    }

    @Override // androidx.activity.ComponentActivity, com.huawei.hms.site.ActivityC23764o
    public void onBackPressed() {
        C23766q qVar = new C23766q(new Intent());
        qVar.putExtra("searchStatus", new SearchStatus("070100", "QUERY CANCELED"));
        setResult(1, qVar);
        finish();
        super.onBackPressed();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.huawei.hms.site.ActivityC23764o
    public void onDestroy() {
        super.onDestroy();
        this.f58851b = null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.huawei.hms.site.ActivityC23764o
    public void onStop() {
        com_huawei_hms_site_widget_SearchActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(this);
    }

    /* renamed from: com.huawei.hms.site.widget.SearchActivity$c */
    public class C23776c implements SearchView.AbstractC0407b {
        public C23776c() {
        }

        @Override // androidx.appcompat.widget.SearchView.AbstractC0407b
        public boolean onQueryTextSubmit(String str) {
            SearchActivity searchActivity = SearchActivity.this;
            searchActivity.f58857h = str;
            searchActivity.mo85183a();
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.AbstractC0407b
        public boolean onQueryTextChange(String str) {
            SearchActivity searchActivity;
            Runnable runnable;
            SearchActivity searchActivity2 = SearchActivity.this;
            Runnable runnable2 = searchActivity2.f58869t;
            if (runnable2 != null) {
                searchActivity2.f58868s.removeCallbacks(runnable2);
            }
            if (str.isEmpty() || (runnable = (searchActivity = SearchActivity.this).f58869t) == null) {
                SearchActivity.this.f58855f = true;
                SearchActivity.this.f58852c.setVisibility(4);
            } else {
                searchActivity.f58857h = str;
                searchActivity.f58868s.postDelayed(runnable, 200);
                SearchActivity.this.f58855f = false;
            }
            return false;
        }
    }

    /* renamed from: com.huawei.hms.site.widget.SearchActivity$e */
    public static class C23778e implements SearchResultListener<QuerySuggestionResponse> {

        /* renamed from: a */
        public WeakReference<SearchActivity> f58875a;

        /* renamed from: b */
        public String f58876b;

        public C23778e(String str, SearchActivity searchActivity) {
            this.f58876b = str;
            this.f58875a = new WeakReference<>(searchActivity);
        }

        @Override // com.huawei.hms.site.api.SearchResultListener
        public void onSearchError(SearchStatus searchStatus) {
            new C23766q(new Intent()).putExtra("searchStatus", searchStatus);
            WeakReference<SearchActivity> weakReference = this.f58875a;
            if (weakReference != null) {
                weakReference.get().f58852c.setVisibility(4);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.huawei.hms.site.api.SearchResultListener
        public void onSearchResult(QuerySuggestionResponse querySuggestionResponse) {
            QuerySuggestionResponse querySuggestionResponse2 = querySuggestionResponse;
            WeakReference<SearchActivity> weakReference = this.f58875a;
            if (weakReference != null) {
                SearchActivity searchActivity = weakReference.get();
                if (this.f58876b.equals(searchActivity.f58857h)) {
                    searchActivity.f58853d.clear();
                    if (querySuggestionResponse2 != null && !searchActivity.f58855f) {
                        searchActivity.f58852c.setVisibility(0);
                        if (querySuggestionResponse2.getSites() != null) {
                            searchActivity.f58853d.addAll(querySuggestionResponse2.getSites());
                            searchActivity.f58854e.notifyDataSetChanged();
                            return;
                        }
                        C23761m.m86935b("SearchActivity", "null == results.getSites()");
                        searchActivity.f58852c.setVisibility(4);
                    }
                }
            }
        }
    }

    public static AssetManager com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_setting_service_common_LancetHooker_getAssets(SearchActivity searchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
        return searchActivity.SearchActivity__getAssets$___twin___();
    }

    public static Resources com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_setting_service_common_LancetHooker_getResources(SearchActivity searchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
        return searchActivity.SearchActivity__getResources$___twin___();
    }

    /* renamed from: com.huawei.hms.site.widget.SearchActivity$d */
    public class C23777d implements SearchResultListener<DetailSearchResponse> {
        public C23777d() {
        }

        @Override // com.huawei.hms.site.api.SearchResultListener
        public void onSearchError(SearchStatus searchStatus) {
            SearchActivity.this.f58852c.setVisibility(4);
            C23766q qVar = new C23766q(new Intent());
            qVar.putExtra("searchStatus", searchStatus);
            SearchActivity.this.setResult(1, qVar);
            SearchActivity.this.finish();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.huawei.hms.site.api.SearchResultListener
        public void onSearchResult(DetailSearchResponse detailSearchResponse) {
            Site site = detailSearchResponse.getSite();
            C23766q qVar = new C23766q(new Intent());
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArray("child", site.getPoi().getChildrenNodes());
            bundle.putParcelable("site", site);
            qVar.putExtra(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, bundle);
            qVar.putExtra("childData", bundle2);
            SearchActivity.this.setResult(0, qVar);
            SearchActivity.this.finish();
        }
    }

    public static void com_huawei_hms_site_widget_SearchActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(SearchActivity searchActivity) {
        searchActivity.SearchActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SearchActivity searchActivity2 = searchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    searchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.huawei.hms.site.ActivityC23764o
    public void onCreate(Bundle bundle) {
        SiteSearchView siteSearchView;
        String str;
        int i;
        C23761m.m86935b("SearchActivity", "onCreate.");
        super.onCreate(bundle);
        int i2 = Build.VERSION.SDK_INT;
        Window window = getWindow();
        if (i2 >= 23) {
            try {
                window.getDecorView().setSystemUiVisibility(8192);
                window.setStatusBarColor(0);
            } catch (Exception unused) {
                C23761m.m86933a("SearchActivity", "Set status bar color failure.");
            }
        } else if (i2 >= 21) {
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            View childAt = ((ViewGroup) findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                ViewCompat.m4059b(childAt, true);
            }
        } else if (i2 >= 19) {
            window.addFlags(67108864);
            ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
            View childAt2 = viewGroup.getChildAt(0);
            if (childAt2 != null) {
                ViewCompat.m4059b(childAt2, true);
            }
            Resources resources = getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            if (childAt2 == null || childAt2.getLayoutParams().height != i || childAt2.getLayoutParams() == null) {
                View view = new View(this);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, i);
                view.setBackgroundColor(-65536);
                viewGroup.addView(view, 0, layoutParams);
            } else {
                childAt2.setBackgroundColor(-65536);
            }
        } else {
            C23761m.m86933a("SearchActivity", "Current version is under API 19.");
        }
        setContentView(R.layout.activity_search_in_sdk);
        C23766q qVar = new C23766q(getIntent());
        C23765p pVar = new C23765p(qVar.getExtras());
        String stringExtra = qVar.getStringExtra("apiKey");
        this.f58864o = stringExtra;
        this.f58851b = SearchServiceFactory.create(this, stringExtra);
        this.f58865p = qVar.getStringExtra("hint");
        this.f58857h = qVar.getStringExtra(SearchIntents.EXTRA_QUERY);
        this.f58858i = (Coordinate) pVar.mo85127a("location");
        this.f58859j = (Integer) pVar.mo85128b("radius");
        this.f58861l = (CoordinateBounds) pVar.mo85127a("bounds");
        this.f58862m = qVar.getStringExtra("countryCode");
        this.f58863n = qVar.getStringExtra("language");
        this.f58860k = (List) qVar.getSerializableExtra("poiType");
        this.f58866q = qVar.getBooleanExtra("children", false);
        this.f58867r = (Boolean) pVar.mo85128b("strictBounds");
        SiteSearchView siteSearchView2 = (SiteSearchView) findViewById(R.id.activitySearchView);
        this.f58856g = siteSearchView2;
        ((ImageView) siteSearchView2.findViewById(R.id.hwsearchview_back_button)).setOnClickListener(new View$OnClickListenerC23775b());
        this.f58856g.setOnQueryTextListener(new C23776c());
        SiteRecyclerView siteRecyclerView = (SiteRecyclerView) findViewById(R.id.activitySearchListView);
        this.f58852c = siteRecyclerView;
        siteRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        C23771v vVar = new C23771v(this.f58853d);
        this.f58854e = vVar;
        this.f58852c.setAdapter(vVar);
        this.f58854e.f58847b = new C23768s(this);
        String str2 = this.f58865p;
        if (!(str2 == null || str2.length() == 0)) {
            this.f58856g.setQueryHint(this.f58865p);
        }
        String str3 = this.f58857h;
        if (str3 == null || str3.length() == 0) {
            siteSearchView = this.f58856g;
            str = "";
        } else {
            siteSearchView = this.f58856g;
            str = this.f58857h;
        }
        siteSearchView.setQuery(str, false);
        this.f58856g.requestFocus();
    }

    public static void com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_setting_service_common_LancetHooker_attachBaseContext(SearchActivity searchActivity, Context context) {
        searchActivity.SearchActivity__attachBaseContext$___twin___(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchActivity);
        }
    }

    public static Context com_huawei_hms_site_widget_SearchActivity_com_ss_android_lark_integrator_lancet_LancetHooker_createConfigurationContext(SearchActivity searchActivity, Configuration configuration) {
        Context SearchActivity__createConfigurationContext$___twin___ = searchActivity.SearchActivity__createConfigurationContext$___twin___(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", SearchActivity__createConfigurationContext$___twin___);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(SearchActivity__createConfigurationContext$___twin___);
    }
}
