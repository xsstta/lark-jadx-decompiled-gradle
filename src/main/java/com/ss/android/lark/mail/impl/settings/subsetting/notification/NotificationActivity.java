package com.ss.android.lark.mail.impl.settings.subsetting.notification;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1178x;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.C42088b;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43277a;
import com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.AbstractC43522a;
import com.ss.android.lark.mail.impl.settings.subsetting.notification.NotificationView;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class NotificationActivity extends BaseMailSettingActivity {

    /* renamed from: b */
    public AbstractC43522a.AbstractC43526c f110483b;

    /* renamed from: c */
    private C43529c f110484c;

    /* renamed from: d */
    private NotificationView.AbstractC43520a f110485d = new NotificationView.AbstractC43520a() {
        /* class com.ss.android.lark.mail.impl.settings.subsetting.notification.NotificationActivity.C435181 */

        @Override // com.ss.android.lark.mail.impl.settings.subsetting.notification.NotificationView.AbstractC43520a
        /* renamed from: a */
        public void mo155398a(NotificationView notificationView) {
            ButterKnife.bind(notificationView, NotificationActivity.this);
        }
    };

    /* renamed from: a */
    public Context mo155392a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo155393a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m172751a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m172749a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo155395f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo155396g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m172753c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m172750a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m172752b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107423z;
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        this.f110484c.mo155420b();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C43529c cVar = this.f110484c;
        if (cVar != null) {
            cVar.destroy();
            this.f110484c = null;
        }
    }

    /* renamed from: h */
    private void m172754h() {
        C43529c cVar = new C43529c(new C43528b(), new NotificationView(this, this.f110485d));
        this.f110484c = cVar;
        cVar.create();
        this.f110483b = this.f110484c.mo155421c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onPause() {
        super.onPause();
        C43277a.m171921a().mo154953q().mo5922a(this);
        this.f110483b.mo155400a();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onResume() {
        super.onResume();
        C43277a.m171921a().mo154953q().mo5923a(this, new AbstractC1178x<C42088b>() {
            /* class com.ss.android.lark.mail.impl.settings.subsetting.notification.NotificationActivity.C435192 */

            /* renamed from: a */
            public void onChanged(C42088b bVar) {
                if (NotificationActivity.this.f110483b != null) {
                    NotificationActivity.this.f110483b.mo155401a(bVar);
                }
            }
        });
    }

    /* renamed from: a */
    public static Resources m172750a(NotificationActivity notificationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationActivity);
        }
        return notificationActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m172753c(NotificationActivity notificationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationActivity);
        }
        return notificationActivity.mo155396g();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.settings.BaseMailSettingActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mail_setting_notification_activity);
        C42187a.m168555m("email_settings_open");
        m172754h();
    }

    /* renamed from: b */
    public static void m172752b(NotificationActivity notificationActivity) {
        notificationActivity.mo155395f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            NotificationActivity notificationActivity2 = notificationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    notificationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m172751a(NotificationActivity notificationActivity, Context context) {
        notificationActivity.mo155393a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationActivity);
        }
    }

    /* renamed from: a */
    public static Context m172749a(NotificationActivity notificationActivity, Configuration configuration) {
        Context a = notificationActivity.mo155392a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
