package com.bytedance.ee.bear.search;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;
import org.koin.java.KoinJavaComponent;

public class SearchSelectTypeActivity extends BaseActivity implements SearchByTypeAdapter.AbstractC10800a {

    /* renamed from: a */
    private View f28867a;

    /* renamed from: b */
    private RecyclerView f28868b;

    /* renamed from: c */
    private SearchByTypeAdapter f28869c;

    /* renamed from: d */
    private List<SearchByTypeAdapter.TypeItem> f28870d = new ArrayList();

    /* renamed from: a */
    public Context mo40798a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo40799a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo40800a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m44697a(this, context);
    }

    /* renamed from: b */
    public void mo40801b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo40802c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m44695a(this, configuration);
    }

    public AssetManager getAssets() {
        return m44700c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m44696a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m44699b(this);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.facade_slide_bottom_out);
    }

    /* renamed from: a */
    public static Resources m44696a(SearchSelectTypeActivity searchSelectTypeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchSelectTypeActivity);
        }
        return searchSelectTypeActivity.mo40799a();
    }

    /* renamed from: c */
    public static AssetManager m44700c(SearchSelectTypeActivity searchSelectTypeActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchSelectTypeActivity);
        }
        return searchSelectTypeActivity.mo40802c();
    }

    @Override // com.bytedance.ee.bear.search.adapter.SearchByTypeAdapter.AbstractC10800a
    public void onTypeItemClick(SearchByTypeAdapter.TypeItem typeItem) {
        Intent intent = new Intent();
        intent.putExtra("KEY_TYPE_ITEM", typeItem);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: b */
    public static void m44699b(SearchSelectTypeActivity searchSelectTypeActivity) {
        searchSelectTypeActivity.mo40801b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SearchSelectTypeActivity searchSelectTypeActivity2 = searchSelectTypeActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    searchSelectTypeActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_search_select_type);
        int b = C8275a.f22373f.mo32555b();
        int b2 = C8275a.f22376i.mo32555b();
        int b3 = C8275a.f22375h.mo32555b();
        int b4 = C8275a.f22371d.mo32555b();
        int b5 = C8275a.f22374g.mo32555b();
        int b6 = C8275a.f22372e.mo32555b();
        int b7 = C8275a.f22370c.mo32555b();
        this.f28870d.add(new SearchByTypeAdapter.TypeItem(9999, R.drawable.ud_icon_inbox_outlined, R.string.Doc_Search_All));
        this.f28870d.add(new SearchByTypeAdapter.TypeItem(b4, R.drawable.ud_icon_file_link_word_outlined, R.string.Doc_Facade_Document));
        this.f28870d.add(new SearchByTypeAdapter.TypeItem(b6, R.drawable.ud_icon_file_link_sheet_outlined, R.string.Doc_Facade_CreateSheet));
        if (m44698a(b5, false)) {
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(b5, R.drawable.ud_icon_file_link_mindnote_outlined, R.string.Doc_Facade_MindNote));
        }
        if (m44698a(b, false)) {
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(b, R.drawable.ud_icon_file_link_bitable_outlined, R.string.Doc_Facade_Bitable));
        }
        if (m44698a(b2, false)) {
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(b2, R.drawable.ud_icon_file_link_slide_outlined, R.string.Doc_Facade_Slide));
        }
        if (m44698a(b3, true)) {
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(b3, R.drawable.ud_icon_paperbag_outlined, R.string.Doc_Facade_UploadFile));
        }
        if (((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20782g().f14914a) {
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(b7, R.drawable.ud_icon_folder_outlined, R.string.Doc_Facade_Folder));
        }
        if (m44698a(b3, true)) {
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(2, R.drawable.ud_icon_file_link_video_outlined, R.string.Doc_Search_Videos, true));
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(3, R.drawable.ud_icon_file_link_audio_outlined, R.string.Doc_Search_Audio, true));
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(4, R.drawable.ud_icon_file_link_image_outlined, R.string.Doc_Search_Images, true));
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(5, R.drawable.ud_icon_file_link_pdf_outlined, R.string.Doc_Search_PDFS, true));
            this.f28870d.add(new SearchByTypeAdapter.TypeItem(99, R.drawable.ud_icon_file_link_otherfile_outlined, R.string.Doc_Search_Other, true));
        }
        View findViewById = findViewById(R.id.tv_search_filter_select_type_back);
        this.f28867a = findViewById;
        findViewById.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.search.SearchSelectTypeActivity.C107811 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                SearchSelectTypeActivity.this.setResult(-1);
                SearchSelectTypeActivity.this.finish();
            }
        });
        this.f28868b = (RecyclerView) findViewById(R.id.search_filter_type_recycler);
        this.f28869c = new SearchByTypeAdapter(this.f28870d, R.layout.search_filter_select_type_item);
        this.f28868b.setLayoutManager(new GridLayoutManager(this, 3));
        this.f28868b.setAdapter(this.f28869c);
        this.f28869c.mo40889a(this);
    }

    /* renamed from: a */
    public static void m44697a(SearchSelectTypeActivity searchSelectTypeActivity, Context context) {
        searchSelectTypeActivity.mo40800a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(searchSelectTypeActivity);
        }
    }

    /* renamed from: a */
    public static Context m44695a(SearchSelectTypeActivity searchSelectTypeActivity, Configuration configuration) {
        Context a = searchSelectTypeActivity.mo40798a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private boolean m44698a(int i, boolean z) {
        boolean e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e();
        if (i == 8 && e) {
            return C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false);
        }
        if (i == 15) {
            return C4211a.m17514a().mo16536a("spacekit.mobile.slide_enabled", z);
        }
        if (i == 11) {
            return ((AbstractC8149a) KoinJavaComponent.m268610a(AbstractC8149a.class)).mo31523e();
        }
        return true;
    }
}
