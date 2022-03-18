package com.bytedance.ee.bear.middleground.permission.setting.doc;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.setting.doc.p490a.C9946b;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.DocPermissionSetFragment;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.comment.DocPermCommentFragment;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.managercollaborator.DocPermManagerCollaboratorFragment;
import com.bytedance.ee.bear.middleground.permission.setting.doc.v2.security.DocPermSecurityFragment;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class DocumentPermissionSetActivity extends BaseActivity implements IDocPermissionSetPageTrigger {

    /* renamed from: a */
    private DocPermSetInfo f26886a;

    /* renamed from: b */
    private String f26887b;

    /* renamed from: a */
    public Context mo38124a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo38126a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m41387a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m41384a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo38130d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo38131e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo38132f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m41389c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m41385a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m41388b(this);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger
    /* renamed from: b */
    public void mo38127b() {
        m41386a(DocPermSecurityFragment.f27013a.mo38219a(this.f26886a));
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger
    /* renamed from: c */
    public void mo38128c() {
        m41386a(DocPermCommentFragment.f26934a.mo38161a(this.f26886a));
    }

    /* renamed from: j */
    private void m41393j() {
        getSupportFragmentManager().beginTransaction().replace(16908290, DocPermissionSetFragment.m41452a(this.f26886a)).commitAllowingStateLoss();
    }

    /* renamed from: g */
    private void m41390g() {
        DocPermSetInfo docPermSetInfo = (DocPermSetInfo) getIntent().getParcelableExtra("permission_doc_info");
        this.f26886a = docPermSetInfo;
        if (docPermSetInfo == null) {
            C13479a.m54758a("DocumentPermissionSetActivity", "mPermSetInfo is null");
            finish();
            return;
        }
        this.f26887b = getIntent().getStringExtra("permission_module");
    }

    /* renamed from: h */
    private void m41391h() {
        boolean z;
        boolean b = PermFGUtils.m39533b();
        if (this.f26886a.mo38825b() == C8275a.f22379l.mo32555b()) {
            z = true;
        } else {
            z = false;
        }
        C13479a.m54764b("DocumentPermissionSetActivity", "permissionRevisionEnable = " + b + ", isMinutes = " + z);
        if (z || !b) {
            m41392i();
        } else {
            m41393j();
        }
    }

    /* renamed from: i */
    private void m41392i() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("permission_doc_info", this.f26886a);
        bundle.putString("permission_module", this.f26887b);
        getSupportFragmentManager().beginTransaction().replace(16908290, Fragment.instantiate(this, C9946b.class.getName(), bundle)).commitAllowingStateLoss();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.doc.v2.IDocPermissionSetPageTrigger
    /* renamed from: a */
    public void mo38125a() {
        m41386a(DocPermManagerCollaboratorFragment.f26964a.mo38179a(this.f26886a));
    }

    /* renamed from: a */
    public static Resources m41385a(DocumentPermissionSetActivity documentPermissionSetActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(documentPermissionSetActivity);
        }
        return documentPermissionSetActivity.mo38130d();
    }

    /* renamed from: c */
    public static AssetManager m41389c(DocumentPermissionSetActivity documentPermissionSetActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(documentPermissionSetActivity);
        }
        return documentPermissionSetActivity.mo38132f();
    }

    /* renamed from: b */
    public static void m41388b(DocumentPermissionSetActivity documentPermissionSetActivity) {
        documentPermissionSetActivity.mo38131e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            DocumentPermissionSetActivity documentPermissionSetActivity2 = documentPermissionSetActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    documentPermissionSetActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private void m41386a(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(16908290, fragment).addToBackStack(null).commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        mo30078b(R.color.bg_base);
        m41390g();
        m41391h();
    }

    /* renamed from: a */
    public static void m41387a(DocumentPermissionSetActivity documentPermissionSetActivity, Context context) {
        documentPermissionSetActivity.mo38126a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(documentPermissionSetActivity);
        }
    }

    /* renamed from: a */
    public static Context m41384a(DocumentPermissionSetActivity documentPermissionSetActivity, Configuration configuration) {
        Context a = documentPermissionSetActivity.mo38124a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
