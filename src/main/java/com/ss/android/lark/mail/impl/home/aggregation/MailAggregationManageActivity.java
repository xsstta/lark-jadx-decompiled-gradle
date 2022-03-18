package com.ss.android.lark.mail.impl.home.aggregation;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.tab.UDTab;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.home.aggregation.folder.FolderManagerPage;
import com.ss.android.lark.mail.impl.home.aggregation.label.LabelManagerPage;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43752b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;

public class MailAggregationManageActivity extends BaseMailFragmentActivity {

    /* renamed from: a */
    public static final String f107925a = C43819s.m173684a((int) R.string.Mail_Folder_FolderTab);

    /* renamed from: b */
    public static final String f107926b = C43819s.m173684a((int) R.string.Mail_Manage_ManageLabelMobile);

    /* renamed from: c */
    UDTabLayout f107927c;

    /* renamed from: d */
    ViewPager f107928d;

    /* renamed from: e */
    BaseManagePage f107929e;

    /* renamed from: f */
    BaseManagePage f107930f;

    /* renamed from: g */
    boolean f107931g;

    /* renamed from: h */
    private final String f107932h = "MailAggregationManageActivity";

    /* renamed from: i */
    private int f107933i;

    /* renamed from: a */
    public Context mo152607a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152608a(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public boolean aL_() {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169230a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169228a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo152610d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo150716e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo152611f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m169232c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169229a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169231b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107409l;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        BaseManagePage baseManagePage = this.f107929e;
        if (baseManagePage != null) {
            baseManagePage.mo152583b();
        }
        BaseManagePage baseManagePage2 = this.f107930f;
        if (baseManagePage2 != null) {
            baseManagePage2.mo152583b();
        }
    }

    /* renamed from: g */
    private void m169233g() {
        setContentView(R.layout.mail_aggregation_manager_layout);
        this.f107933i = 1;
        if (getIntent() != null) {
            this.f107933i = getIntent().getIntExtra("come_from", 1);
        }
        findViewById(R.id.mail_label_close).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.MailAggregationManageActivity.View$OnClickListenerC423981 */

            public void onClick(View view) {
                C43752b.m173435a(MailAggregationManageActivity.this);
            }
        });
        this.f107927c = (UDTabLayout) findViewById(R.id.mail_aggregation_manager_tab);
        this.f107928d = (ViewPager) findViewById(R.id.mail_aggregation_manager_view_pager);
        final ArrayList arrayList = new ArrayList();
        if (!this.f107931g) {
            arrayList.add(f107925a);
        }
        arrayList.add(f107926b);
        this.f107928d.setAdapter(new PagerAdapter() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.MailAggregationManageActivity.C423992 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public boolean isViewFromObject(View view, Object obj) {
                return view == obj;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return arrayList.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public CharSequence getPageTitle(int i) {
                if (arrayList.size() > i) {
                    return (CharSequence) arrayList.get(i);
                }
                return "";
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public Object instantiateItem(ViewGroup viewGroup, int i) {
                if (i == arrayList.indexOf(MailAggregationManageActivity.f107925a)) {
                    MailAggregationManageActivity.this.f107929e = new FolderManagerPage(MailAggregationManageActivity.this);
                    MailAggregationManageActivity.this.f107929e.mo152579a((Activity) MailAggregationManageActivity.this);
                    viewGroup.addView(MailAggregationManageActivity.this.f107929e);
                    return MailAggregationManageActivity.this.f107929e;
                } else if (i != arrayList.indexOf(MailAggregationManageActivity.f107926b)) {
                    return null;
                } else {
                    MailAggregationManageActivity.this.f107930f = new LabelManagerPage(MailAggregationManageActivity.this);
                    MailAggregationManageActivity.this.f107930f.mo152579a((Activity) MailAggregationManageActivity.this);
                    viewGroup.addView(MailAggregationManageActivity.this.f107930f);
                    return MailAggregationManageActivity.this.f107930f;
                }
            }
        });
        this.f107927c.addOnTabSelectedListener(new UDTabLayout.OnTabSelectedListener() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.MailAggregationManageActivity.C424003 */

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: a */
            public void mo53906a(UDTab bVar) {
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: b */
            public void mo53907b(UDTab bVar) {
            }

            @Override // com.larksuite.component.universe_design.tab.UDTabLayout.OnTabSelectedListener
            /* renamed from: c */
            public void mo53908c(UDTab bVar) {
                MailAggregationManageActivity.this.f107928d.setCurrentItem(bVar.mo91343d());
            }
        });
        new UDTabLayoutCoordinator(this.f107927c, this.f107928d).attach();
        if (this.f107931g) {
            this.f107927c.setVisibility(8);
            this.f107927c.getLayoutParams().height = 0;
            this.f107927c.requestLayout();
        } else {
            this.f107927c.setVisibility(0);
        }
        this.f107928d.setCurrentItem(0);
    }

    /* renamed from: a */
    public static Resources m169229a(MailAggregationManageActivity mailAggregationManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mailAggregationManageActivity);
        }
        return mailAggregationManageActivity.mo152610d();
    }

    /* renamed from: c */
    public static AssetManager m169232c(MailAggregationManageActivity mailAggregationManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mailAggregationManageActivity);
        }
        return mailAggregationManageActivity.mo152611f();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f107931g = !C43374f.m172264f().mo155125m();
        m169233g();
        Watchers.m167206a(this);
    }

    /* renamed from: b */
    public static void m169231b(MailAggregationManageActivity mailAggregationManageActivity) {
        mailAggregationManageActivity.mo150716e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            MailAggregationManageActivity mailAggregationManageActivity2 = mailAggregationManageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    mailAggregationManageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m169230a(MailAggregationManageActivity mailAggregationManageActivity, Context context) {
        mailAggregationManageActivity.mo152608a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(mailAggregationManageActivity);
        }
    }

    /* renamed from: a */
    public static Context m169228a(MailAggregationManageActivity mailAggregationManageActivity, Configuration configuration) {
        Context a = mailAggregationManageActivity.mo152607a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
