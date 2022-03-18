package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.form.BitableShareLinkShareSettingFragment;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import org.koin.java.KoinJavaComponent;

public class LinkShareSetActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo38289a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo38290a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo38291a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m41664a(this, context);
    }

    /* renamed from: b */
    public void mo38292b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo38293c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m41660a(this, configuration);
    }

    public AssetManager getAssets() {
        return m41668c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m41661a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m41667b(this);
    }

    /* renamed from: a */
    public static Resources m41661a(LinkShareSetActivity linkShareSetActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(linkShareSetActivity);
        }
        return linkShareSetActivity.mo38290a();
    }

    /* renamed from: c */
    public static AssetManager m41668c(LinkShareSetActivity linkShareSetActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(linkShareSetActivity);
        }
        return linkShareSetActivity.mo38293c();
    }

    /* renamed from: b */
    public static void m41667b(LinkShareSetActivity linkShareSetActivity) {
        linkShareSetActivity.mo38292b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LinkShareSetActivity linkShareSetActivity2 = linkShareSetActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    linkShareSetActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m41662a(Intent intent) {
        C13479a.m54764b("LinkShareSetActivity", "initBitableShareLinkShareFragment()...");
        BitableSharePermSetInfo bitableSharePermSetInfo = (BitableSharePermSetInfo) intent.getParcelableExtra("permission_doc_info");
        if (bitableSharePermSetInfo == null) {
            C13479a.m54758a("LinkShareSetActivity", "bitableSharePermSetInfo == null");
            finish();
            return;
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.link_share_set_container, BitableShareLinkShareSettingFragment.m41685a(this, bitableSharePermSetInfo)).commitAllowingStateLoss();
        m41665a(bitableSharePermSetInfo.mo38783d(), bitableSharePermSetInfo.mo38782c());
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        mo30078b(R.color.bg_body_overlay);
        setContentView(R.layout.activity_link_share_set);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(ShareHitPoint.f121869d, C8275a.f22371d.mo32555b());
        String stringExtra = getIntent().getStringExtra("module");
        if (intExtra == C8275a.f22380m.mo32555b()) {
            m41662a(intent);
        } else if (intExtra == C8275a.f22370c.mo32555b()) {
            m41666b(intent, stringExtra);
        } else {
            m41663a(intent, stringExtra);
        }
    }

    /* renamed from: a */
    public static void m41664a(LinkShareSetActivity linkShareSetActivity, Context context) {
        linkShareSetActivity.mo38291a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(linkShareSetActivity);
        }
    }

    /* renamed from: a */
    public static Context m41660a(LinkShareSetActivity linkShareSetActivity, Configuration configuration) {
        Context a = linkShareSetActivity.mo38289a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: b */
    private void m41666b(Intent intent, String str) {
        C13479a.m54764b("LinkShareSetActivity", "initShareFolderLinkShareFragment()...");
        FolderPermSetInfo folderPermSetInfo = (FolderPermSetInfo) intent.getParcelableExtra("permission_doc_info");
        if (folderPermSetInfo == null) {
            C13479a.m54758a("LinkShareSetActivity", "folderPermSetInfo == null");
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("module", str);
        bundle.putParcelable("permission_doc_info", folderPermSetInfo);
        getSupportFragmentManager().beginTransaction().replace(R.id.link_share_set_container, Fragment.instantiate(this, C10076p.class.getName(), bundle)).commitAllowingStateLoss();
        m41665a(folderPermSetInfo.mo38864c(), folderPermSetInfo.mo38863b());
        PermissionAnalyticV2.m39693n();
    }

    /* renamed from: a */
    private void m41663a(Intent intent, String str) {
        C13479a.m54764b("LinkShareSetActivity", "initDocLinkShareFragment()...");
        DocPermSetInfo docPermSetInfo = (DocPermSetInfo) intent.getParcelableExtra("permission_doc_info");
        if (docPermSetInfo == null) {
            C13479a.m54758a("LinkShareSetActivity", "docPermSetInfo == null");
            finish();
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("module", str);
        bundle.putParcelable("permission_doc_info", docPermSetInfo);
        getSupportFragmentManager().beginTransaction().replace(R.id.link_share_set_container, Fragment.instantiate(this, C10028d.class.getName(), bundle)).commitAllowingStateLoss();
        m41665a(docPermSetInfo.mo38827c(), docPermSetInfo.mo38825b());
        PermissionAnalyticV2.m39693n();
    }

    /* renamed from: a */
    private void m41665a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40643a(this);
        } else {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40650a(str, String.valueOf(i), this);
        }
    }
}
