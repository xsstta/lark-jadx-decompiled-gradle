package com.ss.android.lark.search.widget.selectedview;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.widget.BasePicker;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.p2637e.C53897a;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/widget/selectedview/SelectedMoreActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "adapter", "Lcom/ss/android/lark/searchcommon/staging/SelectedMoreAdapter;", "moreList", "Lcom/ss/android/lark/widget/recyclerview/CommonRecyclerView;", "removedData", "", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "selectedData", "titleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SelectedMoreActivity extends BaseFragmentActivity {

    /* renamed from: d */
    public static final Companion f133100d = new Companion(null);

    /* renamed from: a */
    public final List<SearchBaseInfo> f133101a = new ArrayList();

    /* renamed from: b */
    public C53897a f133102b;

    /* renamed from: c */
    public final List<SearchBaseInfo> f133103c = new ArrayList();

    /* renamed from: e */
    private CommonTitleBar f133104e;

    /* renamed from: f */
    private CommonRecyclerView f133105f;

    /* renamed from: a */
    public Context mo183773a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo183774a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo183775a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m208715a(this, context);
    }

    /* renamed from: b */
    public void mo183776b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo183777c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m208713a(this, configuration);
    }

    public AssetManager getAssets() {
        return m208718d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m208716b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m208717c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/search/widget/selectedview/SelectedMoreActivity$Companion;", "", "()V", "SELECTED_DATA", "", "_TAG", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.selectedview.SelectedMoreActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C53897a m208714a(SelectedMoreActivity selectedMoreActivity) {
        C53897a aVar = selectedMoreActivity.f133102b;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        }
        return aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/search/widget/selectedview/SelectedMoreActivity$onCreate$2", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "performAction", "", "view", "Landroid/view/View;", "search-widget_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.selectedview.SelectedMoreActivity$b */
    public static final class C53871b extends IActionTitlebar.TextAction {

        /* renamed from: a */
        final /* synthetic */ SelectedMoreActivity f133106a;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            super.performAction(view);
            Log.m165379d("LarkSearch.SearchWidget.SelectedMoreActivity", "performAction");
            BasePicker.f132957x.mo183625a().addAll(this.f133106a.f133103c);
            this.f133106a.finish();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C53871b(SelectedMoreActivity selectedMoreActivity, String str, int i) {
            super(str, i);
            this.f133106a = selectedMoreActivity;
        }
    }

    /* renamed from: b */
    public static Resources m208716b(SelectedMoreActivity selectedMoreActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectedMoreActivity);
        }
        return selectedMoreActivity.mo183774a();
    }

    /* renamed from: d */
    public static AssetManager m208718d(SelectedMoreActivity selectedMoreActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectedMoreActivity);
        }
        return selectedMoreActivity.mo183777c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "onItemRemove"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.widget.selectedview.SelectedMoreActivity$c */
    static final class C53872c implements C53897a.AbstractC53900a {

        /* renamed from: a */
        final /* synthetic */ SelectedMoreActivity f133107a;

        C53872c(SelectedMoreActivity selectedMoreActivity) {
            this.f133107a = selectedMoreActivity;
        }

        @Override // com.ss.android.lark.searchcommon.p2637e.C53897a.AbstractC53900a
        /* renamed from: a */
        public final void mo183780a(SearchBaseInfo searchBaseInfo) {
            Intrinsics.checkParameterIsNotNull(searchBaseInfo, "item");
            int indexOf = this.f133107a.f133101a.indexOf(searchBaseInfo);
            if (indexOf >= 0 && indexOf < this.f133107a.f133101a.size() && this.f133107a.f133101a.remove(searchBaseInfo)) {
                this.f133107a.f133103c.add(searchBaseInfo);
                SelectedMoreActivity.m208714a(this.f133107a).remove(searchBaseInfo);
            }
        }
    }

    /* renamed from: c */
    public static void m208717c(SelectedMoreActivity selectedMoreActivity) {
        selectedMoreActivity.mo183776b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SelectedMoreActivity selectedMoreActivity2 = selectedMoreActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    selectedMoreActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        setContentView(R.layout.view_picker_selected_more);
        View findViewById = findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.title_bar)");
        this.f133104e = (CommonTitleBar) findViewById;
        View findViewById2 = findViewById(R.id.more_list);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.more_list)");
        this.f133105f = (CommonRecyclerView) findViewById2;
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        Boolean bool = null;
        if (extras != null) {
            obj = extras.get("selected.data");
        } else {
            obj = null;
        }
        if (obj != null) {
            if (((SearchBaseInfo[]) obj) != null) {
                bool = Boolean.valueOf(CollectionsKt.addAll(this.f133101a, (Object[]) obj));
            }
            bool.booleanValue();
            CommonTitleBar commonTitleBar = this.f133104e;
            if (commonTitleBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleBar");
            }
            commonTitleBar.addAction(new C53871b(this, getString(R.string.Lark_Legacy_Save), R.color.primary_pri_500));
            SelectedMoreActivity selectedMoreActivity = this;
            this.f133102b = new C53897a(selectedMoreActivity);
            CommonRecyclerView commonRecyclerView = this.f133105f;
            if (commonRecyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("moreList");
            }
            C53897a aVar = this.f133102b;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            commonRecyclerView.setAdapter(aVar);
            CommonRecyclerView commonRecyclerView2 = this.f133105f;
            if (commonRecyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("moreList");
            }
            commonRecyclerView2.setLayoutManager(new LinearLayoutManager(selectedMoreActivity, 1, false));
            C53897a aVar2 = this.f133102b;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            aVar2.mo184285a(new C53872c(this));
            C53897a aVar3 = this.f133102b;
            if (aVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            }
            aVar3.addAll(this.f133101a);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo>");
    }

    /* renamed from: a */
    public static void m208715a(SelectedMoreActivity selectedMoreActivity, Context context) {
        selectedMoreActivity.mo183775a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(selectedMoreActivity);
        }
    }

    /* renamed from: a */
    public static Context m208713a(SelectedMoreActivity selectedMoreActivity, Configuration configuration) {
        Context a = selectedMoreActivity.mo183773a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
