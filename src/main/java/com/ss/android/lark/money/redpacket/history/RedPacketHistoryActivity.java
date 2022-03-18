package com.ss.android.lark.money.redpacket.history;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.component.universe_design.tab.UDTabLayout;
import com.larksuite.component.universe_design.tab.UDTabLayoutCoordinator;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.history.fragment.C48125a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;

public class RedPacketHistoryActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public List<C48124a> f121120a = new ArrayList();

    /* renamed from: b */
    private PagerAdapter f121121b;
    @BindView(7083)
    public View mBackIV;
    @BindView(7108)
    public View mTitleBarLayout;
    @BindView(7107)
    public UDTabLayout mUDTabLayout;
    @BindView(7515)
    public ViewPager mViewPager;

    /* renamed from: a */
    public Context mo168505a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo168506a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo168507a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189988a(this, context);
    }

    /* renamed from: b */
    public void mo168508b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo168509c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189986a(this, configuration);
    }

    public AssetManager getAssets() {
        return m189990c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189987a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189989b(this);
    }

    /* renamed from: f */
    private void m189993f() {
        StatusBarUtil.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.ud_R500));
        this.mBackIV.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.money.redpacket.history.RedPacketHistoryActivity.View$OnClickListenerC481233 */

            public void onClick(View view) {
                RedPacketHistoryActivity.this.finish();
            }
        });
    }

    /* renamed from: d */
    private void m189991d() {
        this.f121120a.add(new C48124a(C48125a.m189999a(0), UIHelper.getString(R.string.Lark_Legacy_ReceivedHistory)));
        this.f121120a.add(new C48124a(C48125a.m189999a(1), UIHelper.getString(R.string.Lark_Legacy_SendHistory)));
    }

    /* renamed from: e */
    private void m189992e() {
        C481211 r0 = new FragmentPagerAdapter(getSupportFragmentManager()) {
            /* class com.ss.android.lark.money.redpacket.history.RedPacketHistoryActivity.C481211 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return RedPacketHistoryActivity.this.f121120a.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return RedPacketHistoryActivity.this.f121120a.get(i).f121126a;
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public CharSequence getPageTitle(int i) {
                return RedPacketHistoryActivity.this.f121120a.get(i).f121127b;
            }
        };
        this.f121121b = r0;
        this.mViewPager.setAdapter(r0);
        this.mViewPager.setOffscreenPageLimit(1);
        new UDTabLayoutCoordinator(this.mUDTabLayout, this.mViewPager).attach();
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.money.redpacket.history.RedPacketHistoryActivity.C481222 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                KeyboardUtils.hideKeyboard(RedPacketHistoryActivity.this);
            }
        });
    }

    /* renamed from: a */
    public static Resources m189987a(RedPacketHistoryActivity redPacketHistoryActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketHistoryActivity);
        }
        return redPacketHistoryActivity.mo168506a();
    }

    /* renamed from: c */
    public static AssetManager m189990c(RedPacketHistoryActivity redPacketHistoryActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketHistoryActivity);
        }
        return redPacketHistoryActivity.mo168509c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.activity_red_packet_history);
        ButterKnife.bind(this);
        m189991d();
        m189993f();
        m189992e();
    }

    /* renamed from: b */
    public static void m189989b(RedPacketHistoryActivity redPacketHistoryActivity) {
        redPacketHistoryActivity.mo168508b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RedPacketHistoryActivity redPacketHistoryActivity2 = redPacketHistoryActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    redPacketHistoryActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m189988a(RedPacketHistoryActivity redPacketHistoryActivity, Context context) {
        redPacketHistoryActivity.mo168507a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketHistoryActivity);
        }
    }

    /* renamed from: a */
    public static Context m189986a(RedPacketHistoryActivity redPacketHistoryActivity, Configuration configuration) {
        Context a = redPacketHistoryActivity.mo168505a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
