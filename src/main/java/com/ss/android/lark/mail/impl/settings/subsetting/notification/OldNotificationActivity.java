package com.ss.android.lark.mail.impl.settings.subsetting.notification;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42087a;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.component.settingitem.AbsSettingItemViewModel;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43418b;
import com.ss.android.lark.mail.impl.settings.component.settingitem.C43424g;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class OldNotificationActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    LinearLayout f110494b;

    /* renamed from: c */
    private final List<AbsSettingItemViewModel> f110495c = new ArrayList();

    /* renamed from: a */
    public Context mo155408a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155409a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172775a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172773a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155412f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155413g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172777c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172774a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172776b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107423z;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        super.onResume();
        C43277a.m171921a().mo154953q().mo5923a(this, new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.notification.OldNotificationActivity.C435211 */

            /* renamed from: a */
            public void onChanged(C42088b bVar) {
                OldNotificationActivity.this.mo155410a(bVar);
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        C43277a.m171921a().mo154953q().mo5922a(this);
        for (AbsSettingItemViewModel absSettingItemViewModel : this.f110495c) {
            absSettingItemViewModel.mo155203a();
        }
    }

    /* renamed from: a */
    public static Resources m172774a(OldNotificationActivity oldNotificationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oldNotificationActivity);
        }
        return oldNotificationActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172777c(OldNotificationActivity oldNotificationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oldNotificationActivity);
        }
        return oldNotificationActivity.mo155413g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_old_notification_activity);
        C42187a.m168555m("email_settings_open");
        this.f110494b = (LinearLayout) findViewById(R.id.mail_notification_setting_list);
    }

    /* renamed from: b */
    public static void m172776b(OldNotificationActivity oldNotificationActivity) {
        oldNotificationActivity.mo155412f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OldNotificationActivity oldNotificationActivity2 = oldNotificationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    oldNotificationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public void mo155410a(C42088b bVar) {
        List<C42087a> list;
        if (bVar != null) {
            list = bVar.mo151820b();
        } else {
            list = null;
        }
        if (list == null || list.size() <= 1) {
            finish();
            return;
        }
        this.f110495c.clear();
        for (C42087a aVar : list) {
            this.f110495c.add(new C43424g(this, new C43418b(aVar.f107024a)));
        }
        this.f110494b.removeAllViews();
        for (int i = 0; i < this.f110495c.size(); i++) {
            AbsSettingItemViewModel absSettingItemViewModel = this.f110495c.get(i);
            absSettingItemViewModel.mo155204a(this);
            if (i == 0) {
                absSettingItemViewModel.mo155206a(AbsSettingItemViewModel.DividerStyle.Align);
                absSettingItemViewModel.mo155207a(AbsSettingItemViewModel.ItemBackgroundType.TOP_CIRCLE);
            } else if (i == this.f110495c.size() - 1) {
                absSettingItemViewModel.mo155206a(AbsSettingItemViewModel.DividerStyle.None);
                absSettingItemViewModel.mo155207a(AbsSettingItemViewModel.ItemBackgroundType.BOTTOM_CIRCLE);
            } else {
                absSettingItemViewModel.mo155206a(AbsSettingItemViewModel.DividerStyle.Align);
                absSettingItemViewModel.mo155207a(AbsSettingItemViewModel.ItemBackgroundType.SQUARE);
            }
            this.f110494b.addView(absSettingItemViewModel.mo155215g());
        }
    }

    /* renamed from: a */
    public static void m172775a(OldNotificationActivity oldNotificationActivity, Context context) {
        oldNotificationActivity.mo155409a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(oldNotificationActivity);
        }
    }

    /* renamed from: a */
    public static Context m172773a(OldNotificationActivity oldNotificationActivity, Configuration configuration) {
        Context a = oldNotificationActivity.mo155408a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
