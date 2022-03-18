package com.ss.android.lark.invite_new_tenant.invite.all;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.base.fragment.C29527a;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.invite_new_tenant.invite.all.link.C40554b;
import com.ss.android.lark.invite_new_tenant.invite.all.qrcode.C40570c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.List;
import net.lucode.hackware.magicindicator.C69634c;
import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.C69619a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69623c;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69624d;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.p3483b.C69625a;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.titles.C69627a;

public class InviteAllActivity extends BaseFragmentActivity {

    /* renamed from: a */
    CommonTitleBar f102953a;

    /* renamed from: b */
    MagicIndicator f102954b;

    /* renamed from: c */
    ViewPager f102955c;

    /* renamed from: d */
    public List<C29527a> f102956d;

    /* renamed from: e */
    private FragmentManager f102957e;

    /* renamed from: f */
    private AbstractC69621a f102958f = new AbstractC69621a() {
        /* class com.ss.android.lark.invite_new_tenant.invite.all.InviteAllActivity.C405431 */

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public int mo16055a() {
            return InviteAllActivity.this.f102956d.size();
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69623c mo16056a(Context context) {
            C69625a aVar = new C69625a(InviteAllActivity.this);
            aVar.setColors(Integer.valueOf(UIHelper.getColor(R.color.lkui_B500)));
            aVar.setMode(0);
            aVar.setLineHeight((float) UIHelper.dp2px(2.0f));
            return aVar;
        }

        @Override // net.lucode.hackware.magicindicator.buildins.commonnavigator.p3482a.AbstractC69621a
        /* renamed from: a */
        public AbstractC69624d mo16057a(Context context, final int i) {
            C69627a aVar = new C69627a(InviteAllActivity.this);
            aVar.setTextSize(14.0f);
            aVar.setNormalColor(UIHelper.getColor(R.color.lkui_N600));
            aVar.setSelectedColor(UIHelper.getColor(R.color.lkui_B500));
            aVar.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.invite_new_tenant.invite.all.InviteAllActivity.C405431.View$OnClickListenerC405441 */

                public void onClick(View view) {
                    InviteAllActivity.this.f102955c.setCurrentItem(i);
                }
            });
            aVar.setText(InviteAllActivity.this.f102956d.get(i).f73821b);
            return aVar;
        }
    };

    /* renamed from: a */
    public Context mo146658a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo146659a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo146660a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m160471a(this, context);
    }

    /* renamed from: b */
    public void mo146661b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo146662c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m160469a(this, configuration);
    }

    public AssetManager getAssets() {
        return m160473c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m160470a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m160472b(this);
    }

    /* renamed from: d */
    private void m160474d() {
        m160475e();
        m160476f();
    }

    /* renamed from: e */
    private void m160475e() {
        this.f102953a.setDividerVisible(false);
    }

    /* renamed from: f */
    private void m160476f() {
        this.f102955c.setAdapter(new FragmentPagerAdapter(this.f102957e) {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.InviteAllActivity.C405452 */

            @Override // androidx.viewpager.widget.PagerAdapter
            public int getCount() {
                return InviteAllActivity.this.f102956d.size();
            }

            @Override // androidx.fragment.app.FragmentPagerAdapter
            public Fragment getItem(int i) {
                return InviteAllActivity.this.f102956d.get(i).f73820a;
            }
        });
        C69619a aVar = new C69619a(this);
        aVar.setAdjustMode(true);
        aVar.setAdapter(this.f102958f);
        this.f102954b.setNavigator(aVar);
        C69634c.m267483a(this.f102954b, this.f102955c);
    }

    /* renamed from: g */
    private void m160477g() {
        this.f102953a = (CommonTitleBar) findViewById(R.id.share_invite_to_all_title_bar);
        this.f102954b = (MagicIndicator) findViewById(R.id.share_invite_to_all_indicator);
        this.f102955c = (ViewPager) findViewById(R.id.share_invite_to_all_vp);
    }

    /* renamed from: a */
    public static Resources m160470a(InviteAllActivity inviteAllActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteAllActivity);
        }
        return inviteAllActivity.mo146659a();
    }

    /* renamed from: c */
    public static AssetManager m160473c(InviteAllActivity inviteAllActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteAllActivity);
        }
        return inviteAllActivity.mo146662c();
    }

    /* renamed from: b */
    public static void m160472b(InviteAllActivity inviteAllActivity) {
        inviteAllActivity.mo146661b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            InviteAllActivity inviteAllActivity2 = inviteAllActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    inviteAllActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_share_invite_link);
        this.f102957e = getSupportFragmentManager();
        ArrayList arrayList = new ArrayList();
        this.f102956d = arrayList;
        arrayList.add(new C29527a(new C40554b(), UIHelper.getString(R.string.Lark_UserGrowth_InviteTenantMyLink)));
        this.f102956d.add(new C29527a(new C40570c(), UIHelper.getString(R.string.Lark_UserGrowth_InviteTenantMyQrcode)));
        m160477g();
        m160474d();
        this.f102955c.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.ss.android.lark.invite_new_tenant.invite.all.InviteAllActivity.C405463 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i == 0) {
                    InviteAllActivity.this.f102953a.setTitle(R.string.Lark_UserGrowth_InviteTenantViaLinkTab);
                } else {
                    InviteAllActivity.this.f102953a.setTitle(R.string.Lark_UserGrowth_InviteTenantViaQrcode);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m160471a(InviteAllActivity inviteAllActivity, Context context) {
        inviteAllActivity.mo146660a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(inviteAllActivity);
        }
    }

    /* renamed from: a */
    public static Context m160469a(InviteAllActivity inviteAllActivity, Configuration configuration) {
        Context a = inviteAllActivity.mo146658a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
