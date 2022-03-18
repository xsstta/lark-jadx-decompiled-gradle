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
import com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity;
import com.ss.android.lark.mail.impl.home.aggregation.folder.FolderSelectLocationActivity;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class FolderSelectLocationActivity extends BaseSelectLocationActivity {

    /* renamed from: e */
    C42418a f107980e = new C42418a();

    /* renamed from: a */
    public Context mo152665a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152666a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169316a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169314a(this, configuration);
    }

    /* renamed from: e */
    public Resources mo150716e() {
        return super.getResources();
    }

    /* renamed from: f */
    public void mo152668f() {
        super.onStop();
    }

    /* renamed from: g */
    public AssetManager mo152669g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m169318c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169315a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169317b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.home.aggregation.folder.FolderSelectLocationActivity$a */
    public class C42418a extends C42419a {

        /* renamed from: a */
        C1177w<List<MailLabelEntity>> f107981a = new C1177w<>();

        @Override // com.ss.android.lark.mail.impl.home.aggregation.folder.C42419a, com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
        /* renamed from: b */
        public C1177w<List<MailLabelEntity>> mo152619b() {
            return this.f107981a;
        }

        public C42418a() {
            super.mo152619b().mo5923a(FolderSelectLocationActivity.this, new AbstractC1178x() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.folder.$$Lambda$FolderSelectLocationActivity$a$W9n1ygg8i3uBtQTVaY9mWGiypQ */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    FolderSelectLocationActivity.C42418a.m270755lambda$W9n1ygg8i3uBtQTVaY9mWGiypQ(FolderSelectLocationActivity.C42418a.this, (List) obj);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m169327a(List list) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo152614a());
            arrayList.addAll(list);
            this.f107981a.mo5926a(arrayList);
        }
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107395E;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity
    /* renamed from: d */
    public AbstractC42401a mo152604d() {
        return this.f107980e;
    }

    /* renamed from: a */
    public static Resources m169315a(FolderSelectLocationActivity folderSelectLocationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderSelectLocationActivity);
        }
        return folderSelectLocationActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m169318c(FolderSelectLocationActivity folderSelectLocationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderSelectLocationActivity);
        }
        return folderSelectLocationActivity.mo152669g();
    }

    /* renamed from: b */
    public static void m169317b(FolderSelectLocationActivity folderSelectLocationActivity) {
        folderSelectLocationActivity.mo152668f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FolderSelectLocationActivity folderSelectLocationActivity2 = folderSelectLocationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    folderSelectLocationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m169316a(FolderSelectLocationActivity folderSelectLocationActivity, Context context) {
        folderSelectLocationActivity.mo152666a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(folderSelectLocationActivity);
        }
    }

    /* renamed from: a */
    public static Context m169314a(FolderSelectLocationActivity folderSelectLocationActivity, Configuration configuration) {
        Context a = folderSelectLocationActivity.mo152665a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity
    /* renamed from: a */
    public void mo152601a(MailLabelEntity mailLabelEntity, int i) {
        int i2;
        MailLabelEntity a = mo152604d().mo152615a(this.f107920c);
        if (a != null) {
            i2 = a.mo151537u();
        } else {
            i2 = 1;
        }
        if (mailLabelEntity.mo151493B() == null || i2 + mailLabelEntity.mo151493B().size() <= 5) {
            super.mo152601a(mailLabelEntity, i);
            return;
        }
        MailToast.m173704a(C43819s.m173684a((int) R.string.Mail_Folder_MaximumFiveLayersMobile), MailToast.Type.SUCCESS);
        C42209j.m168612a("folder_maximumfivelayersmobile", "toast");
    }
}
