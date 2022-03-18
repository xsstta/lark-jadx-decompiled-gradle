package com.ss.android.lark.notification.setting.impl.setting.notification_item;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.CompoundButton;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.ui.button.LKUISwitchButton;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.notification.C48398a;
import com.ss.android.lark.notification.dto.NotificationSettingItem;
import com.ss.android.lark.notification.p2378b.AbstractC48407a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class NotificationSettingsItemActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public final AbstractC48407a.AbstractC48427o f122315a = C48398a.m190922a().mo169341d();
    @BindView(7202)
    LKUISwitchButton mSettingSoundSwitch;
    @BindView(7203)
    LKUISwitchButton mSettingVibrateSwitch;
    @BindView(7578)
    View mSettingZone;

    /* renamed from: a */
    public Context mo169798a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo169799a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo169801a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m191735a(this, context);
    }

    /* renamed from: b */
    public void mo169802b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo169803c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m191733a(this, configuration);
    }

    public AssetManager getAssets() {
        return m191737c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m191734a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m191736b(this);
    }

    /* renamed from: a */
    public static Resources m191734a(NotificationSettingsItemActivity notificationSettingsItemActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationSettingsItemActivity);
        }
        return notificationSettingsItemActivity.mo169799a();
    }

    /* renamed from: c */
    public static AssetManager m191737c(NotificationSettingsItemActivity notificationSettingsItemActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationSettingsItemActivity);
        }
        return notificationSettingsItemActivity.mo169803c();
    }

    /* renamed from: b */
    public static void m191736b(NotificationSettingsItemActivity notificationSettingsItemActivity) {
        notificationSettingsItemActivity.mo169802b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            NotificationSettingsItemActivity notificationSettingsItemActivity2 = notificationSettingsItemActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    notificationSettingsItemActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_setting_notification_item);
        ButterKnife.bind(this);
        final String stringExtra = getIntent().getStringExtra("key_message_channel");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        NotificationSettingItem a = mo169800a(stringExtra);
        if (a.isNotificationOn()) {
            this.mSettingZone.setVisibility(0);
        } else {
            this.mSettingZone.setVisibility(8);
        }
        this.mSettingSoundSwitch.setChecked(a.isSoundOn());
        this.mSettingVibrateSwitch.setChecked(a.isVibrateOn());
        this.mSettingSoundSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.notification_item.NotificationSettingsItemActivity.C486401 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NotificationSettingItem a = NotificationSettingsItemActivity.this.mo169800a(stringExtra);
                if (a != null) {
                    a.setSoundOn(z);
                    NotificationSettingsItemActivity.this.f122315a.mo169408a(stringExtra, a);
                }
            }
        });
        this.mSettingVibrateSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            /* class com.ss.android.lark.notification.setting.impl.setting.notification_item.NotificationSettingsItemActivity.C486412 */

            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                NotificationSettingItem a = NotificationSettingsItemActivity.this.mo169800a(stringExtra);
                if (a != null) {
                    a.setVibrateOn(z);
                    NotificationSettingsItemActivity.this.f122315a.mo169408a(stringExtra, a);
                }
            }
        });
    }

    /* renamed from: a */
    public NotificationSettingItem mo169800a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        NotificationSettingItem a = this.f122315a.mo169400a(str);
        if (a == null) {
            return new NotificationSettingItem();
        }
        return a;
    }

    /* renamed from: a */
    public static void m191735a(NotificationSettingsItemActivity notificationSettingsItemActivity, Context context) {
        notificationSettingsItemActivity.mo169801a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(notificationSettingsItemActivity);
        }
    }

    /* renamed from: a */
    public static Context m191733a(NotificationSettingsItemActivity notificationSettingsItemActivity, Configuration configuration) {
        Context a = notificationSettingsItemActivity.mo169798a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
