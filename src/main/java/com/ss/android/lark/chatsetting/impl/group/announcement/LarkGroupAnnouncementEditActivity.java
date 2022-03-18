package com.ss.android.lark.chatsetting.impl.group.announcement;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class LarkGroupAnnouncementEditActivity extends BaseFragmentActivity {

    /* renamed from: a */
    AbstractC34461c.AbstractC34464c f89212a = ChatSettingModule.m133639a().mo127272c();

    /* renamed from: b */
    private C34557c f89213b;

    /* renamed from: c */
    private GroupAnnouncementView.AbstractC34547b f89214c = new GroupAnnouncementView.AbstractC34547b() {
        /* class com.ss.android.lark.chatsetting.impl.group.announcement.LarkGroupAnnouncementEditActivity.C345481 */

        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.AbstractC34547b
        /* renamed from: a */
        public void mo127693a() {
            KeyboardUtils.showKeyboard(LarkGroupAnnouncementEditActivity.this);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.AbstractC34547b
        /* renamed from: a */
        public void mo127695a(GroupAnnouncementView groupAnnouncementView) {
            ButterKnife.bind(groupAnnouncementView, LarkGroupAnnouncementEditActivity.this);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.AbstractC34547b
        /* renamed from: b */
        public void mo127697b(String str) {
            ChatSettingModule.m133639a().mo127266a(LarkGroupAnnouncementEditActivity.this, str);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.AbstractC34547b
        /* renamed from: a */
        public void mo127694a(EditText editText) {
            InputMethodManager inputMethodManager = (InputMethodManager) LarkGroupAnnouncementEditActivity.this.getSystemService("input_method");
            if (editText == null) {
                KeyboardUtils.hideKeyboard(LarkGroupAnnouncementEditActivity.this);
                LarkGroupAnnouncementEditActivity.this.finish();
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.AbstractC34547b
        /* renamed from: c */
        public void mo127698c(String str) {
            Intent intent = new Intent();
            intent.putExtra("group_annou", str);
            LarkGroupAnnouncementEditActivity.this.setResult(-1, intent);
            LarkGroupAnnouncementEditActivity.this.finish();
        }

        @Override // com.ss.android.lark.chatsetting.impl.group.announcement.GroupAnnouncementView.AbstractC34547b
        /* renamed from: a */
        public void mo127696a(String str) {
            ChatSettingModule.m133639a().mo127269b().mo127250a();
            LarkGroupAnnouncementEditActivity.this.f89212a.mo127303a(LarkGroupAnnouncementEditActivity.this, str, "group_announcement");
        }
    };

    /* renamed from: a */
    public Context mo127699a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo127700a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo127701a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m134219a(this, context);
    }

    /* renamed from: b */
    public void mo127702b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo127703c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m134217a(this, configuration);
    }

    public AssetManager getAssets() {
        return m134222c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m134218a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m134221b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f89213b.destroy();
    }

    /* renamed from: d */
    private String m134223d() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return "";
        }
        return extras.getString("chatID");
    }

    /* renamed from: a */
    public static Resources m134218a(LarkGroupAnnouncementEditActivity larkGroupAnnouncementEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupAnnouncementEditActivity);
        }
        return larkGroupAnnouncementEditActivity.mo127700a();
    }

    /* renamed from: c */
    public static AssetManager m134222c(LarkGroupAnnouncementEditActivity larkGroupAnnouncementEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupAnnouncementEditActivity);
        }
        return larkGroupAnnouncementEditActivity.mo127703c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_group_announcement);
        String d = m134223d();
        if (TextUtils.isEmpty(d)) {
            finish();
        } else {
            m134220a(d);
        }
    }

    /* renamed from: b */
    public static void m134221b(LarkGroupAnnouncementEditActivity larkGroupAnnouncementEditActivity) {
        larkGroupAnnouncementEditActivity.mo127702b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LarkGroupAnnouncementEditActivity larkGroupAnnouncementEditActivity2 = larkGroupAnnouncementEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    larkGroupAnnouncementEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m134220a(String str) {
        C34557c cVar = new C34557c(new C34550b(str), new GroupAnnouncementView(this.f89214c, this));
        this.f89213b = cVar;
        cVar.create();
    }

    /* renamed from: a */
    public static void m134219a(LarkGroupAnnouncementEditActivity larkGroupAnnouncementEditActivity, Context context) {
        larkGroupAnnouncementEditActivity.mo127701a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(larkGroupAnnouncementEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m134217a(LarkGroupAnnouncementEditActivity larkGroupAnnouncementEditActivity, Configuration configuration) {
        Context a = larkGroupAnnouncementEditActivity.mo127699a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
