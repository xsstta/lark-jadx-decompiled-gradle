package com.bytedance.ee.bear.middleground.permission.collaborator.manager;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.permission.PermFGUtils;
import com.bytedance.ee.bear.middleground.permission.PermissionAnalyticV2;
import com.bytedance.ee.bear.middleground.permission.collaborator.ShareUserInfoResult;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.bitableshare.BitableShareCollaboratorManagerFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.doc.singlepage.DocCollaboratorManagerFragment;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.folder.C9840d;
import com.bytedance.ee.bear.middleground.permission.collaborator.manager.p478b.C9820c;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.BitableSharePermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.FolderPermSetInfo;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import org.koin.java.KoinJavaComponent;

public class CollaboratorManageActivity extends BaseActivity {
    /* renamed from: a */
    public Context mo37133a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo37134a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo37135a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m40258a(this, context);
    }

    /* renamed from: b */
    public void mo37136b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo37137c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m40254a(this, configuration);
    }

    public AssetManager getAssets() {
        return m40263c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m40255a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m40262b(this);
    }

    /* renamed from: a */
    public static Resources m40255a(CollaboratorManageActivity collaboratorManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(collaboratorManageActivity);
        }
        return collaboratorManageActivity.mo37134a();
    }

    /* renamed from: c */
    public static AssetManager m40263c(CollaboratorManageActivity collaboratorManageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(collaboratorManageActivity);
        }
        return collaboratorManageActivity.mo37137c();
    }

    /* renamed from: a */
    private void m40256a(Intent intent) {
        DocPermSetInfo docPermSetInfo = (DocPermSetInfo) intent.getParcelableExtra("permission_doc_info");
        if (docPermSetInfo == null) {
            C13479a.m54758a("CollaboratorManageActivity", "permSetInfo is null, finish directly");
            finish();
            return;
        }
        if (!docPermSetInfo.mo38844q() || !docPermSetInfo.ab() || !PermFGUtils.m39534c()) {
            m40257a(intent, docPermSetInfo);
            PermissionAnalyticV2.m39635a(false);
        } else {
            m40261b(intent, docPermSetInfo);
        }
        m40259a(docPermSetInfo.mo38827c(), docPermSetInfo.mo38825b());
    }

    /* renamed from: b */
    private void m40260b(Intent intent) {
        String str;
        FolderPermSetInfo folderPermSetInfo = (FolderPermSetInfo) intent.getParcelableExtra("permission_doc_info");
        if (folderPermSetInfo == null) {
            C13479a.m54758a("CollaboratorManageActivity", "permSetInfo is null, finish directly");
            finish();
            return;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.framework_activity_container, C9840d.m40678a((ShareUserInfoResult) intent.getParcelableExtra("share_user_result"), folderPermSetInfo, intent.getStringExtra("permission_module"))).commitAllowingStateLoss();
        if (folderPermSetInfo == null) {
            str = intent.getStringExtra("token");
        } else {
            str = folderPermSetInfo.mo38864c();
        }
        m40259a(str, C8275a.f22370c.mo32555b());
        PermissionAnalyticV2.m39635a(false);
    }

    /* renamed from: c */
    private void m40264c(Intent intent) {
        BitableSharePermSetInfo bitableSharePermSetInfo = (BitableSharePermSetInfo) intent.getParcelableExtra("permission_doc_info");
        if (bitableSharePermSetInfo == null) {
            C13479a.m54758a("CollaboratorManageActivity", "permSetInfo is null, finish directly");
            finish();
            return;
        }
        ShareUserInfoResult shareUserInfoResult = (ShareUserInfoResult) intent.getParcelableExtra("collaborator_users");
        if (shareUserInfoResult == null || C13657b.m55421a(shareUserInfoResult.getUserInfoList())) {
            C13479a.m54758a("CollaboratorManageActivity", "shareUserInfoResult is null or collaborators is empty, finish directly");
            finish();
            return;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.framework_activity_container, BitableShareCollaboratorManagerFragment.m40300a(this, bitableSharePermSetInfo, shareUserInfoResult)).commitAllowingStateLoss();
        m40259a(bitableSharePermSetInfo.mo38783d(), bitableSharePermSetInfo.mo38782c());
    }

    /* renamed from: b */
    public static void m40262b(CollaboratorManageActivity collaboratorManageActivity) {
        collaboratorManageActivity.mo37136b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CollaboratorManageActivity collaboratorManageActivity2 = collaboratorManageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    collaboratorManageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_frame_layout_container);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(ShareHitPoint.f121869d, C8275a.f22371d.mo32555b());
        if (intExtra == C8275a.f22380m.mo32555b()) {
            m40264c(intent);
        } else if (intExtra == C8275a.f22370c.mo32555b()) {
            m40260b(intent);
        } else {
            m40256a(intent);
        }
    }

    /* renamed from: a */
    public static void m40258a(CollaboratorManageActivity collaboratorManageActivity, Context context) {
        collaboratorManageActivity.mo37135a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(collaboratorManageActivity);
        }
    }

    /* renamed from: a */
    public static Context m40254a(CollaboratorManageActivity collaboratorManageActivity, Configuration configuration) {
        Context a = collaboratorManageActivity.mo37133a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: b */
    private void m40261b(Intent intent, DocPermSetInfo docPermSetInfo) {
        if (((ShareUserInfoResult) intent.getParcelableExtra("collaborator_users")) == null) {
            C13479a.m54758a("CollaboratorManageActivity", "shareUserInfoResult is null , finish directly");
            finish();
            return;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.framework_activity_container, DocCollaboratorManagerFragment.m40377a(docPermSetInfo)).commitAllowingStateLoss();
    }

    /* renamed from: a */
    private void m40257a(Intent intent, DocPermSetInfo docPermSetInfo) {
        String stringExtra = intent.getStringExtra("permission_module");
        int intExtra = intent.getIntExtra("permission", 0);
        ShareUserInfoResult shareUserInfoResult = (ShareUserInfoResult) intent.getParcelableExtra("collaborator_users");
        if (shareUserInfoResult == null || C13657b.m55421a(shareUserInfoResult.getUserInfoList())) {
            C13479a.m54758a("CollaboratorManageActivity", "shareUserInfoResult is null or collaborators is empty, finish directly");
            finish();
            return;
        }
        getSupportFragmentManager().beginTransaction().add(R.id.framework_activity_container, C9820c.m40536a(docPermSetInfo, shareUserInfoResult, stringExtra, intExtra)).commitAllowingStateLoss();
    }

    /* renamed from: a */
    private void m40259a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40643a(this);
        } else {
            ((IWatermarkManager) KoinJavaComponent.m268610a(IWatermarkManager.class)).mo40650a(str, String.valueOf(i), this);
        }
    }
}
