package com.bytedance.ee.bear.lark.route;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.leanmode.AbstractC5197b;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.lark.C7958a;
import com.bytedance.ee.bear.lark.p414b.AbstractC7993f;
import com.bytedance.ee.bear.list.C8292f;
import com.bytedance.ee.bear.list.analysis.ListAnalysis;
import com.bytedance.ee.bear.list.config.SpaceFeatureGatingV2;
import com.bytedance.ee.bear.list.create.C8238f;
import com.bytedance.ee.bear.list.create.C8254n;
import com.bytedance.ee.bear.list.create.SelectCreationMenuConfig;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.folder.C8387z;
import com.bytedance.ee.bear.list.homepage.AbstractC8476f;
import com.bytedance.ee.bear.list.homepage.navigation.NavigationEnum;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.bear.list.homepage.title.HomeMainTitleBar;
import com.bytedance.ee.bear.list.manualoffline.C8599a;
import com.bytedance.ee.bear.list.mine.C8616e;
import com.bytedance.ee.bear.list.share.C8731h;
import com.bytedance.ee.bear.list.share.C8735j;
import com.bytedance.ee.bear.list.star.C8805h;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.route.RouteBean;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.bear.wiki.homepage.C11971c;
import com.bytedance.ee.bear.wikiv2.home.C12278c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

public class SpaceRouteActivity extends BaseActivity implements AbstractC8476f {

    /* renamed from: a */
    public HomeMainTitleBar f21580a;

    /* renamed from: b */
    public int f21581b;

    /* renamed from: c */
    public String f21582c;

    /* renamed from: d */
    public String f21583d;

    /* renamed from: a */
    public Context mo31154a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo31155a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo31156a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m32206a(this, context);
    }

    /* renamed from: b */
    public void mo31157b() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m32204a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo31159d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m32210c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m32205a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m32209b(this);
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8476f
    /* renamed from: c */
    public AbstractC8505c mo30786c() {
        return this.f21580a;
    }

    /* renamed from: g */
    private void m32213g() {
        ((C8254n) aj.m5366a(this).mo6005a(C8254n.class)).getSelectedCreationTypeLiveData().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.lark.route.$$Lambda$SpaceRouteActivity$gpPFOYjMKnG3zoAtQkNzVZA1mE */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                SpaceRouteActivity.this.m32207a((SpaceRouteActivity) ((Integer) obj));
            }
        });
    }

    /* renamed from: h */
    private void m32214h() {
        C13479a.m54764b("SpaceRouteActivity", "closePopupMenu()...");
        C8238f i = m32215i();
        if (i != null) {
            C13479a.m54764b("SpaceRouteActivity", "creationMenuPanel is exist");
            i.mo5513b();
        }
    }

    /* renamed from: i */
    private C8238f m32215i() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("CreationMenuPanel");
        if (!(findFragmentByTag instanceof C8238f)) {
            return null;
        }
        C13479a.m54764b("SpaceRouteActivity", "getCreationMenuPanel()...success");
        return (C8238f) findFragmentByTag;
    }

    /* renamed from: e */
    private void m32211e() {
        this.f21581b = getIntent().getIntExtra("extra_destination", NavigationEnum.MY_SPACE.id);
        C13479a.m54764b("SpaceRouteActivity", "initData()...mDestination = " + this.f21581b);
    }

    /* renamed from: f */
    private void m32212f() {
        final String str;
        String str2;
        String str3;
        boolean a = SpaceFeatureGatingV2.m32622a();
        C13479a.m54764b("SpaceRouteActivity", "initView()...singleContainerEnable = " + a);
        HomeMainTitleBar homeMainTitleBar = (HomeMainTitleBar) findViewById(R.id.home_title_bar);
        this.f21580a = homeMainTitleBar;
        homeMainTitleBar.mo33179b();
        if (this.f21581b == NavigationEnum.MY_SPACE.id) {
            if (a) {
                str3 = C8387z.class.getName();
            } else {
                str3 = C8616e.class.getName();
            }
            str2 = getString(R.string.Doc_List_My_Space);
            this.f21582c = "personal";
            this.f21583d = "belongtome";
            str = "ccm_space_personal_page_click";
        } else if (this.f21581b == NavigationEnum.SHARED_SPACE.id) {
            if (a) {
                str3 = C8731h.class.getName();
            } else {
                str3 = C8735j.class.getName();
            }
            if (SpaceFeatureGatingV2.m32622a()) {
                str2 = getString(R.string.CreationMobile_ECM_ShareWithMe_Tab);
            } else {
                str2 = getString(R.string.Doc_List_Shared_Space);
            }
            this.f21582c = "shared";
            this.f21583d = "sharetome";
            str = "ccm_space_shared_page_click";
        } else if (this.f21581b == NavigationEnum.WIKI.id) {
            if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
                str3 = C12278c.class.getName();
            } else {
                str3 = C11971c.class.getName();
            }
            str2 = getString(R.string.Doc_Facade_Wiki);
            this.f21582c = "wiki_home";
            this.f21583d = "recent";
            str = "ccm_space_wiki_page_click";
        } else if (this.f21581b == NavigationEnum.FAVORITE.id) {
            str3 = C8805h.class.getName();
            str2 = getString(R.string.Doc_List_MainTabHomeFavorite);
            this.f21582c = "favorites";
            str = "ccm_space_favorites_page_click";
        } else {
            str3 = C8599a.class.getName();
            str2 = getString(R.string.Doc_List_OfflineTitle);
            this.f21582c = "offline";
            str = "ccm_space_offline_page_click";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", this.f21582c);
        hashMap.put("sub_module", this.f21583d);
        BaseTitleBar titleBar = this.f21580a.getTitleBar();
        if (titleBar != null) {
            titleBar.setTag(R.id.title_bar_common_params, hashMap);
        }
        this.f21580a.setTitle(str2);
        this.f21580a.setOnSearchBtnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.lark.route.SpaceRouteActivity.C80601 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                if (SpaceRouteActivity.this.f21581b == NavigationEnum.WIKI.id) {
                    RouteBean routeBean = new RouteBean();
                    routeBean.mo40622h("/search/activity");
                    routeBean.mo40623i("wiki");
                    ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17293a("/search/activity", routeBean);
                } else {
                    C8292f.m34146a(SpaceRouteActivity.this.f21580a.getTitleSnapshot());
                    ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/search/space_search/activity").mo17308a("KEY_SEARCH_BAR_DY", SpaceRouteActivity.this.f21580a.getTitleBarHeight()).mo17314a("module", ModuleUtil.m32225a(SpaceRouteActivity.this.f21581b)).mo17306a(R.anim.facade_hold, R.anim.facade_hold).mo17317a();
                }
                ListAnalysis.m32533d(C5234y.m21391b(), SpaceRouteActivity.this.f21582c);
                ListAnalysis.m32523a(str, SpaceRouteActivity.this.f21582c, SpaceRouteActivity.this.f21583d, "search", "search_main_view", "", "", C8275a.f22369b.mo32555b(), "", "", false, false, false, 0, null, "");
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, Fragment.instantiate(this, str3)).commitAllowingStateLoss();
        m32208a(str);
    }

    /* renamed from: a */
    public static Resources m32205a(SpaceRouteActivity spaceRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(spaceRouteActivity);
        }
        return spaceRouteActivity.mo31155a();
    }

    /* renamed from: c */
    public static AssetManager m32210c(SpaceRouteActivity spaceRouteActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(spaceRouteActivity);
        }
        return spaceRouteActivity.mo31159d();
    }

    /* renamed from: b */
    public static void m32209b(SpaceRouteActivity spaceRouteActivity) {
        spaceRouteActivity.mo31157b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            SpaceRouteActivity spaceRouteActivity2 = spaceRouteActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    spaceRouteActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m32207a(Integer num) {
        C13479a.m54764b("SpaceRouteActivity", "on select creation type = " + num);
        if (num != null) {
            m32214h();
        }
    }

    /* renamed from: a */
    private void m32208a(final String str) {
        CommonCreateButton commonCreateButton = (CommonCreateButton) findViewById(R.id.common_create_button);
        if (SpaceFeatureGatingV2.m32622a() && this.f21581b == NavigationEnum.SHARED_SPACE.id) {
            commonCreateButton.setVisibility(8);
        } else if (this.f21581b == NavigationEnum.WIKI.id) {
            commonCreateButton.setVisibility(8);
        } else {
            AppCompatImageView createButton = commonCreateButton.getCreateButton();
            createButton.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.lark.route.SpaceRouteActivity.C80612 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    SpaceRouteActivity.this.onMenuCreateClick(view);
                    if (SpaceRouteActivity.this.f21581b != NavigationEnum.WIKI.id) {
                        ListAnalysis.m32523a(str, SpaceRouteActivity.this.f21582c, SpaceRouteActivity.this.f21583d, "create", "ccm_space_create_new_view", "", "", C8275a.f22369b.mo32555b(), "", "", false, false, false, 0, null, "");
                    }
                }
            });
            C7958a.m31810a(createButton, C7958a.m31809a(0.1f, (int) R.color.lkui_N1000));
            m32213g();
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.AbstractC8476f
    public void onMenuCreateClick(View view) {
        boolean z;
        boolean z2;
        C13479a.m54764b("SpaceRouteActivity", "onMenuCreateClick()...");
        boolean z3 = ((AbstractC5197b) KoinJavaComponent.m268610a(AbstractC5197b.class)).mo20801b().mo20777c().f14914a;
        if (this.f21581b == NavigationEnum.SHARED_SPACE.id) {
            z = true;
        } else {
            z = false;
        }
        boolean e = ((AbstractC7993f) KoinJavaComponent.m268610a(AbstractC7993f.class)).mo30993e();
        SelectCreationMenuConfig selectCreationMenuConfig = new SelectCreationMenuConfig();
        SelectCreationMenuConfig h = selectCreationMenuConfig.mo32290g(true).mo32292h(C8292f.m34174b());
        if (!e || C4211a.m17514a().mo16536a("ccm.spacekit.bitable.enable", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        h.mo32294i(z2).mo32296j(C4211a.m17514a().mo16538b("spacekit.mobile.docx_create_enable", false)).mo32298k(z3).mo32281c(!z).mo32286e(!z).mo32288f(!z);
        Bundle bundle = new Bundle();
        bundle.putString("key_module", this.f21582c);
        bundle.putString("key_sub_module", this.f21583d);
        bundle.putString("key_src_module", "home");
        bundle.putBoolean("key_folder_version", SpaceFeatureGatingV2.m32622a());
        bundle.putParcelable("key_config", selectCreationMenuConfig);
        C8238f.m33821a(this, bundle);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.lark_activity_space_route);
        m32211e();
        m32212f();
    }

    /* renamed from: a */
    public static void m32206a(SpaceRouteActivity spaceRouteActivity, Context context) {
        spaceRouteActivity.mo31156a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(spaceRouteActivity);
        }
    }

    /* renamed from: a */
    public static Context m32204a(SpaceRouteActivity spaceRouteActivity, Configuration configuration) {
        Context a = spaceRouteActivity.mo31154a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
