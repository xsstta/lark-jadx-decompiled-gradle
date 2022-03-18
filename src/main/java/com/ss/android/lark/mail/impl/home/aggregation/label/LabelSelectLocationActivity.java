package com.ss.android.lark.mail.impl.home.aggregation.label;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;
import com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity;
import com.ss.android.lark.mail.impl.home.aggregation.label.LabelSelectLocationActivity;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class LabelSelectLocationActivity extends BaseSelectLocationActivity {

    /* renamed from: e */
    C42429a f108020e = new C42429a();

    /* renamed from: a */
    public Context mo152704a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152705a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169407a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169405a(this, configuration);
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
    public AssetManager mo152707g() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m169409c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169406a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169408b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.mail.impl.home.aggregation.label.LabelSelectLocationActivity$a */
    public class C42429a extends C42430a {

        /* renamed from: a */
        C1177w<List<MailLabelEntity>> f108021a = new C1177w<>();

        @Override // com.ss.android.lark.mail.impl.home.aggregation.label.C42430a, com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a
        /* renamed from: b */
        public C1177w<List<MailLabelEntity>> mo152619b() {
            return this.f108021a;
        }

        public C42429a() {
            super.mo152619b().mo5923a(LabelSelectLocationActivity.this, new AbstractC1178x() {
                /* class com.ss.android.lark.mail.impl.home.aggregation.label.$$Lambda$LabelSelectLocationActivity$a$Dx2YdN758RH1bDyeDmKLzGuIq1E */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    LabelSelectLocationActivity.C42429a.lambda$Dx2YdN758RH1bDyeDmKLzGuIq1E(LabelSelectLocationActivity.C42429a.this, (List) obj);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m169417a(List list) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(mo152614a());
            arrayList.addAll(list);
            this.f108021a.mo5926a(arrayList);
        }
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107410m;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectLocationActivity
    /* renamed from: d */
    public AbstractC42401a mo152604d() {
        return this.f108020e;
    }

    /* renamed from: a */
    public static Resources m169406a(LabelSelectLocationActivity labelSelectLocationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelSelectLocationActivity);
        }
        return labelSelectLocationActivity.mo150716e();
    }

    /* renamed from: c */
    public static AssetManager m169409c(LabelSelectLocationActivity labelSelectLocationActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelSelectLocationActivity);
        }
        return labelSelectLocationActivity.mo152707g();
    }

    /* renamed from: b */
    public static void m169408b(LabelSelectLocationActivity labelSelectLocationActivity) {
        labelSelectLocationActivity.mo152668f();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LabelSelectLocationActivity labelSelectLocationActivity2 = labelSelectLocationActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    labelSelectLocationActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m169407a(LabelSelectLocationActivity labelSelectLocationActivity, Context context) {
        labelSelectLocationActivity.mo152705a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelSelectLocationActivity);
        }
    }

    /* renamed from: a */
    public static Context m169405a(LabelSelectLocationActivity labelSelectLocationActivity, Configuration configuration) {
        Context a = labelSelectLocationActivity.mo152704a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
