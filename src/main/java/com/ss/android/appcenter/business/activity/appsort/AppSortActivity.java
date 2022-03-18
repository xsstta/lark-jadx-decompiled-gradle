package com.ss.android.appcenter.business.activity.appsort;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appbadge.AppBadgeSettingActivity;
import com.ss.android.appcenter.business.activity.appsort.AppSortActivity;
import com.ss.android.appcenter.business.activity.appsort.SortAdapter;
import com.ss.android.appcenter.business.monitor.p1269a.C27700a;
import com.ss.android.appcenter.business.monitor.p1269a.C27702b;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.useritems.UserItemsData;
import com.ss.android.appcenter.business.p1265a.C27569b;
import com.ss.android.appcenter.business.p1265a.C27582j;
import com.ss.android.appcenter.business.tab.business.view.SafeLinearLayoutManager;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.base.BaseActivity;
import com.ss.android.appcenter.common.util.C28177b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28207o;
import com.ss.android.appcenter.common.view.biz.WorkplaceGuideView;
import com.ss.android.appcenter.common.view.biz.WorkplaceLoadingView;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class AppSortActivity extends BaseActivity {

    /* renamed from: a */
    public SortAdapter f69131a;

    /* renamed from: b */
    public C27682a f69132b;

    /* renamed from: c */
    public C28207o.C28208a f69133c;

    /* renamed from: d */
    public WorkplaceLoadingView f69134d;

    /* renamed from: e */
    private StatusController f69135e;

    /* renamed from: f */
    private View f69136f;

    /* renamed from: g */
    private View f69137g;

    /* renamed from: h */
    private boolean f69138h = true;

    /* renamed from: a */
    public Context mo98601a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m101115a(this, context);
    }

    /* renamed from: b */
    public void mo98604b(Context context) {
        super.attachBaseContext(context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m101109a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo98608e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo98609f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo98610g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m101119c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m101110a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m101118b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        m101127n();
    }

    /* renamed from: m */
    private boolean m101126m() {
        return this.f69131a.mo98623f();
    }

    /* renamed from: d */
    public void mo98607d() {
        View view = this.f69137g;
        if (view != null) {
            view.setVisibility(0);
        }
        this.f69138h = false;
        this.f69135e.mo100033a(StatusController.Status.GUIDE);
    }

    /* renamed from: i */
    private void m101122i() {
        this.f69134d = (WorkplaceLoadingView) findViewById(R.id.loading);
        this.f69135e = new StatusController(findViewById(R.id.recycler_wrapper), findViewById(R.id.error), new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.activity.appsort.AppSortActivity.C276731 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                AppSortActivity.this.f69134d.setVisibility(0);
                C27582j.m100671a(true, AppSortActivity.this.f69134d.getLottieAnimationView());
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                C27582j.m100671a(false, AppSortActivity.this.f69134d.getLottieAnimationView());
                AppSortActivity.this.f69134d.setVisibility(8);
            }
        });
        WorkplaceGuideView workplaceGuideView = (WorkplaceGuideView) findViewById(R.id.guide);
        workplaceGuideView.mo100452a();
        this.f69135e.mo100032a(workplaceGuideView, StatusController.Status.GUIDE);
        this.f69135e.mo100036a(true);
    }

    /* renamed from: k */
    private void m101124k() {
        C27682a aVar = (C27682a) aj.m5366a(this).mo6005a(C27682a.class);
        this.f69132b = aVar;
        aVar.getSortPageLiveData().mo5923a(this, new AbstractC1178x<UserItemsData>() {
            /* class com.ss.android.appcenter.business.activity.appsort.AppSortActivity.C276742 */

            /* renamed from: a */
            public void onChanged(UserItemsData userItemsData) {
                if (userItemsData == null) {
                    C28184h.m103250d("App_Sort_Page", "UserItemData is null. showError.");
                    AppSortActivity.this.mo98603b();
                    return;
                }
                C27686c a = C27686c.m101189a(userItemsData);
                if (a.mo98639a()) {
                    C28184h.m103250d("App_Sort_Page", "UserItemData is empty. showGuide");
                    AppSortActivity.this.mo98607d();
                } else {
                    C28184h.m103250d("App_Sort_Page", "Get UserItemData. refresh adapter. showContent");
                    AppSortActivity.this.f69131a.mo98616a(a);
                    AppSortActivity.this.mo98268a();
                }
                AppSortActivity.this.mo98602a(a.mo98639a());
            }
        });
        this.f69132b.requestUserItemListFromLocal();
        this.f69132b.requestUserItemListFromNet();
    }

    /* renamed from: l */
    private void m101125l() {
        C28207o.C28208a aVar = this.f69133c;
        if (aVar == null) {
            this.f69133c = C28207o.m103285a(this, (ViewGroup) findViewById(R.id.container), getString(R.string.OpenPlatform_AppCenter_SavingSetting));
        } else {
            aVar.mo100416c();
        }
        this.f69131a.mo98615a(new SortAdapter.AbstractC27679a() {
            /* class com.ss.android.appcenter.business.activity.appsort.AppSortActivity.C276753 */

            @Override // com.ss.android.appcenter.business.activity.appsort.SortAdapter.AbstractC27679a
            /* renamed from: a */
            public void mo98613a(boolean z) {
                C28184h.m103250d("App_Sort_Page", "updateItemList onResult success:" + z);
                UICallbackExecutor.post(new Runnable(z) {
                    /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$AppSortActivity$3$OHE7K0R75cvQZOdkrupbBaucEDk */
                    public final /* synthetic */ boolean f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        AppSortActivity.C276753.this.m101141b(this.f$1);
                    }
                });
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m101141b(boolean z) {
                C28207o.m103287a(AppSortActivity.this.f69133c);
                if (z) {
                    AppSortActivity appSortActivity = AppSortActivity.this;
                    LKUIToast.show(appSortActivity, (int) R.drawable.appcenter_ok_img, appSortActivity.getString(R.string.OpenPlatform_AppCenter_SettingSuccess));
                    AppSortActivity.this.setResult(-1);
                    AppSortActivity.this.f69132b.requestUserItemListFromNet();
                    AppSortActivity.this.finish();
                    return;
                }
                AppSortActivity appSortActivity2 = AppSortActivity.this;
                LKUIToast.show(appSortActivity2, appSortActivity2.getString(R.string.OpenPlatform_AppCenter_SettingFail));
            }
        });
    }

    /* renamed from: n */
    private void m101127n() {
        if (this.f69135e.mo100038b() || this.f69135e.mo100041e() || !m101126m()) {
            finish();
        } else {
            C28177b.m103224a(this, "", getString(R.string.OpenPlatform_AppCenter_CancelEditTips), getString(R.string.AppDetail_Application_Mechanism_Confirm), getString(R.string.OpenPlatform_AppCenter_Cancel), new DialogInterface.OnClickListener() {
                /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$AppSortActivity$bZr6ddiy8niReT_d4EWunRaQh8 */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    AppSortActivity.this.m101116b(dialogInterface, i);
                }
            }, $$Lambda$AppSortActivity$pycCmk7Irpnr0m4N3I2VAczUhZM.INSTANCE);
        }
    }

    /* renamed from: c */
    public void mo98605c() {
        View view = this.f69137g;
        if (view != null) {
            view.setVisibility(0);
        }
        this.f69135e.mo100033a(StatusController.Status.LOADING);
    }

    /* renamed from: b */
    public void mo98603b() {
        if (this.f69137g != null && !this.f69135e.mo100040d()) {
            this.f69137g.setVisibility(0);
        }
        this.f69138h = false;
        C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69244o).flush();
        this.f69135e.mo100033a(StatusController.Status.ERROR);
    }

    /* renamed from: j */
    private void m101123j() {
        int i;
        this.f69136f = findViewById(R.id.confirm);
        this.f69137g = findViewById(R.id.ll_settings_wrapper);
        findViewById(R.id.close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$AppSortActivity$8nHljxcP3hrgpLZ8kf1cNdpDJ7I */

            public final void onClick(View view) {
                AppSortActivity.this.m101121d(view);
            }
        });
        findViewById(R.id.error).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$AppSortActivity$49QWEqN5Gskm60tHIiohCUJWAJk */

            public final void onClick(View view) {
                AppSortActivity.this.m101120c((AppSortActivity) view);
            }
        });
        findViewById(R.id.confirm).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.activity.appsort.$$Lambda$AppSortActivity$qtqnZrQUrbycNJ6Tk5Q2JBNdac */

            public final void onClick(View view) {
                AppSortActivity.this.m101117b((AppSortActivity) view);
            }
        });
        View findViewById = findViewById(R.id.ll_sort_adapter_header);
        if (C27569b.m100618a()) {
            i = 0;
        } else {
            i = 8;
        }
        findViewById.setVisibility(i);
        findViewById(R.id.ll_app_badge_settings).setOnClickListener($$Lambda$AppSortActivity$qIbNinQs4Cr3frUJF_ypmaruNEs.INSTANCE);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C27687d());
        itemTouchHelper.attachToRecyclerView(recyclerView);
        SortAdapter sortAdapter = new SortAdapter(this, itemTouchHelper, (TouchDetectFrameLayout) findViewById(R.id.recycler_wrapper));
        this.f69131a = sortAdapter;
        recyclerView.setAdapter(sortAdapter);
        recyclerView.setLayoutManager(new SafeLinearLayoutManager(this));
    }

    /* renamed from: a */
    public void mo98268a() {
        View view = this.f69137g;
        if (view != null) {
            view.setVisibility(8);
        }
        if (this.f69138h) {
            C27700a.m101232a("op_workplace_event").setMonitorCode(C27702b.f69243n).flush();
        }
        this.f69138h = false;
        this.f69135e.mo100033a(StatusController.Status.CONTENT);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m101121d(View view) {
        m101127n();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101113a(View view) {
        AppBadgeSettingActivity.f68883c.mo98362a(view.getContext());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m101120c(View view) {
        C28184h.m103250d("App_Sort_Page", "click retry. showLoading.");
        this.f69132b.requestUserItemListFromNet();
        mo98605c();
    }

    /* renamed from: a */
    public static Resources m101110a(AppSortActivity appSortActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSortActivity);
        }
        return appSortActivity.mo98608e();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101117b(View view) {
        if (!m101126m()) {
            C28184h.m103250d("App_Sort_Page", "click complete. no data changed. finish.");
            finish();
            return;
        }
        C28184h.m103250d("App_Sort_Page", "click complete. updateItemList.");
        m101125l();
    }

    /* renamed from: c */
    public static AssetManager m101119c(AppSortActivity appSortActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSortActivity);
        }
        return appSortActivity.mo98610g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.appcenter.common.base.BaseActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.workplace_sort_activity);
        m101122i();
        m101123j();
        m101124k();
        mo98605c();
        C27710b.m101306k();
        C28184h.m103250d("App_Sort_Page", "finish init. showLoading.");
    }

    /* renamed from: b */
    public static void m101118b(AppSortActivity appSortActivity) {
        appSortActivity.mo98609f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            AppSortActivity appSortActivity2 = appSortActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    appSortActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m101111a(Context context) {
        C28184h.m103250d("App_Sort_Page", "startActivity without result");
        context.startActivity(new Intent(context, AppSortActivity.class));
    }

    /* renamed from: a */
    public static void m101114a(Fragment fragment) {
        C28184h.m103250d("App_Sort_Page", "startActivity for result");
        fragment.startActivityForResult(new Intent(fragment.getContext(), AppSortActivity.class), 101);
    }

    /* renamed from: a */
    public void mo98602a(boolean z) {
        int i;
        View view = this.f69136f;
        if (view != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m101116b(DialogInterface dialogInterface, int i) {
        finish();
    }

    /* renamed from: a */
    public static Context m101109a(AppSortActivity appSortActivity, Configuration configuration) {
        Context a = appSortActivity.mo98601a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public static void m101115a(AppSortActivity appSortActivity, Context context) {
        appSortActivity.mo98604b(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(appSortActivity);
        }
    }
}
