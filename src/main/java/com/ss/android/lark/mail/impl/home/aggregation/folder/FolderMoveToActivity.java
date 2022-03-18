package com.ss.android.lark.mail.impl.home.aggregation.folder;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;
import com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity;
import com.ss.android.lark.mail.impl.home.aggregation.folder.FolderMoveToActivity;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class FolderMoveToActivity extends BaseSelectActivity {

    /* renamed from: h */
    C42417a f107977h = new C42417a();

    /* renamed from: a */
    public Context mo152658a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152659a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169299a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169297a(this, configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: f */
    public boolean mo152591f() {
        return false;
    }

    public AssetManager getAssets() {
        return m169301c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169298a(this);
    }

    /* renamed from: l */
    public Resources mo152662l() {
        return super.getResources();
    }

    /* renamed from: m */
    public void mo152663m() {
        super.onStop();
    }

    /* renamed from: n */
    public AssetManager mo152664n() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169300b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.home.aggregation.folder.FolderMoveToActivity$a */
    public class C42417a extends C42419a {

        /* renamed from: a */
        C1177w<List<MailLabelEntity>> f107978a = new C1177w<>();

        @Override // com.ss.android.lark.mail.impl.home.aggregation.folder.C42419a, com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
        /* renamed from: b */
        public C1177w<List<MailLabelEntity>> mo152619b() {
            return this.f107978a;
        }

        public C42417a() {
            super.mo152619b().mo5923a(FolderMoveToActivity.this, new AbstractC1178x() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.folder.$$Lambda$FolderMoveToActivity$a$xF88PAuQ5wzdMY4Ed_dTm6XFV08 */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    FolderMoveToActivity.C42417a.lambda$xF88PAuQ5wzdMY4Ed_dTm6XFV08(FolderMoveToActivity.C42417a.this, (List) obj);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m169312a(List list) {
            ArrayList arrayList = new ArrayList();
            MailLabelEntity a = FolderMoveToActivity.this.mo150716e().mo152615a("INBOX");
            if (a != null) {
                arrayList.add(a);
            }
            MailLabelEntity a2 = FolderMoveToActivity.this.mo150716e().mo152615a("SPAM");
            if (a2 != null) {
                arrayList.add(a2);
            }
            arrayList.addAll(list);
            this.f107978a.mo5926a(arrayList);
        }
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107396F;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: e */
    public AbstractC42401a mo150716e() {
        return this.f107977h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: h */
    public void mo152593h() {
        super.mo152593h();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: g */
    public String mo152592g() {
        return C43819s.m173684a((int) R.string.Mail_Folder_MoveToFolder);
    }

    /* renamed from: a */
    public static Resources m169298a(FolderMoveToActivity folderMoveToActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderMoveToActivity);
        }
        return folderMoveToActivity.mo152662l();
    }

    /* renamed from: c */
    public static AssetManager m169301c(FolderMoveToActivity folderMoveToActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderMoveToActivity);
        }
        return folderMoveToActivity.mo152664n();
    }

    /* renamed from: b */
    public static void m169300b(FolderMoveToActivity folderMoveToActivity) {
        folderMoveToActivity.mo152663m();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderMoveToActivity folderMoveToActivity2 = folderMoveToActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderMoveToActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m169299a(FolderMoveToActivity folderMoveToActivity, Context context) {
        folderMoveToActivity.mo152659a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderMoveToActivity);
        }
    }

    /* renamed from: a */
    public static Context m169297a(FolderMoveToActivity folderMoveToActivity, Configuration configuration) {
        Context a = folderMoveToActivity.mo152658a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
