package com.ss.android.lark.mail.impl.home.aggregation.folder;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.bytedance.lark.pb.email.client.v1.MailAddFolderResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateFolderResponse;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42295n;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.dialog.DialogC43910a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;

public class FolderEditActivity extends BaseEditActivity implements DialogC43910a.AbstractC43914a {

    /* renamed from: n */
    C42419a f107963n = new C42419a();

    /* renamed from: o */
    private final String f107964o = "FolderEditActivity";

    /* renamed from: a */
    public Context mo152643a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152644a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169270a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169268a(this, configuration);
    }

    public AssetManager getAssets() {
        return m169272c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169269a(this);
    }

    /* renamed from: l */
    public Resources mo152648l() {
        return super.getResources();
    }

    /* renamed from: m */
    public void mo152649m() {
        super.onStop();
    }

    /* renamed from: n */
    public AssetManager mo152650n() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169271b(this);
    }

    /* renamed from: k */
    public C42419a mo152561d() {
        return this.f107963n;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: g */
    public void mo152564g() {
        C42187a.m168460D();
        super.mo152564g();
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        if (this.f107883i) {
            return C42187a.C42190b.f107393C;
        }
        return C42187a.C42190b.f107394D;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static Resources m169269a(FolderEditActivity folderEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderEditActivity);
        }
        return folderEditActivity.mo152648l();
    }

    /* renamed from: c */
    public static AssetManager m169272c(FolderEditActivity folderEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderEditActivity);
        }
        return folderEditActivity.mo152650n();
    }

    /* renamed from: b */
    public static void m169271b(FolderEditActivity folderEditActivity) {
        folderEditActivity.mo152649m();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderEditActivity folderEditActivity2 = folderEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m169270a(FolderEditActivity folderEditActivity, Context context) {
        folderEditActivity.mo152644a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m169268a(FolderEditActivity folderEditActivity, Configuration configuration) {
        Context a = folderEditActivity.mo152643a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: a */
    public void mo152554a(MailLabelEntity mailLabelEntity, String str) {
        String str2;
        C42187a.m168461E();
        if (mailLabelEntity != null) {
            str2 = mailLabelEntity.mo151527k();
        } else {
            str2 = null;
        }
        C42699a.m170234a(this, str2, str);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: b */
    public void mo152558b(final String str, String str2, final IGetDataCallback<MailLabelEntity> iGetDataCallback) {
        String str3;
        Log.m165389i("FolderEditActivity", "createEntity");
        if (this.f107884k == 0 || this.f107884k == 2) {
            str3 = C42187a.C42191c.f107439P;
        } else if (this.f107884k == 1) {
            str3 = C42187a.C42191c.f107440Q;
        } else {
            str3 = "";
        }
        C42187a.m168574v(str3);
        final C42295n nVar = (C42295n) C42344d.m169091a(C42295n.class, this);
        nVar.mo152418b(null, "create", "folder");
        C42176e.m168344a().mo152259h(str, str2, new IGetDataCallback<MailAddFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.folder.FolderEditActivity.C424142 */

            /* renamed from: a */
            public void onSuccess(MailAddFolderResponse mailAddFolderResponse) {
                nVar.mo152372a("success", 0);
                iGetDataCallback.onSuccess(C42130j.m168150a().mo152079a(mailAddFolderResponse.folder));
                MailToast.m173704a(C43819s.m173686a(R.string.Mail_Manage_CreateFolderSuccessfully, "FolderName", str), MailToast.Type.SUCCESS);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult != null) {
                    nVar.mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                }
                nVar.mo152372a("rust_fail", 0);
                iGetDataCallback.onError(errorResult);
                MailToast.m173698a((int) R.string.Mail_Manage_FailedToCreateFolder, MailToast.Type.FAIL);
                C42209j.m168612a("folder_create_custom_fail", "toast");
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: a */
    public void mo152555a(final String str, String str2, final IGetDataCallback<MailLabelEntity> iGetDataCallback) {
        Log.m165389i("FolderEditActivity", "updateEntity");
        final C42295n nVar = (C42295n) C42344d.m169091a(C42295n.class, this);
        nVar.mo152418b(null, "edit", "folder");
        C42176e.m168344a().mo152208a(this.f107882h.mo151527k(), str, str2, (Long) null, new IGetDataCallback<MailUpdateFolderResponse>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.folder.FolderEditActivity.C424131 */

            /* renamed from: a */
            public void onSuccess(MailUpdateFolderResponse mailUpdateFolderResponse) {
                nVar.mo152372a("success", 0);
                iGetDataCallback.onSuccess(C42130j.m168150a().mo152079a(mailUpdateFolderResponse.folder));
                MailToast.m173704a(FolderEditActivity.this.mo152561d().mo152616a(R.string.Mail_Manage_FolderLabelModifiedSuccessfully, new Pair<>("name", str)), MailToast.Type.SUCCESS);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult != null) {
                    nVar.mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                }
                nVar.mo152372a("rust_fail", 0);
                iGetDataCallback.onError(errorResult);
                MailToast.m173704a(FolderEditActivity.this.mo152561d().mo152616a(R.string.Mail_Manage_FolderLabelModifyFailed, new Pair<>("name", str)), MailToast.Type.FAIL);
                C42209j.m168612a("label_modify_custom_fail", "toast");
            }
        });
    }
}
