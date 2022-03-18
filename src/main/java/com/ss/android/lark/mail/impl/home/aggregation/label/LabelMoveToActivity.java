package com.ss.android.lark.mail.impl.home.aggregation.label;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;
import com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43374f;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.List;

public class LabelMoveToActivity extends BaseSelectActivity {

    /* renamed from: i */
    private static final String[] f108014i = {"INBOX", "ARCHIVED", "TRASH", "SPAM"};

    /* renamed from: h */
    C42430a f108015h = new C42430a();

    /* renamed from: a */
    public Context mo152690a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152691a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169371a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169369a(this, configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: f */
    public boolean mo152591f() {
        return false;
    }

    public AssetManager getAssets() {
        return m169373c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169370a(this);
    }

    /* renamed from: l */
    public Resources mo152694l() {
        return super.getResources();
    }

    /* renamed from: m */
    public void mo152695m() {
        super.onStop();
    }

    /* renamed from: n */
    public AssetManager mo152696n() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169372b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107405h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: e */
    public AbstractC42401a mo150716e() {
        return this.f108015h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: g */
    public String mo152592g() {
        return C43819s.m173684a((int) R.string.Mail_CustomLabels_MoveTo);
    }

    /* renamed from: a */
    public static Resources m169370a(LabelMoveToActivity labelMoveToActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelMoveToActivity);
        }
        return labelMoveToActivity.mo152694l();
    }

    /* renamed from: c */
    public static AssetManager m169373c(LabelMoveToActivity labelMoveToActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelMoveToActivity);
        }
        return labelMoveToActivity.mo152696n();
    }

    /* renamed from: b */
    public static void m169372b(LabelMoveToActivity labelMoveToActivity) {
        labelMoveToActivity.mo152695m();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LabelMoveToActivity labelMoveToActivity2 = labelMoveToActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    labelMoveToActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: a */
    public List<MailLabelEntity> mo152586a(List<MailLabelEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            MailLabelEntity mailLabelEntity = list.get(i);
            if (mailLabelEntity.mo151529m()) {
                String q = C43374f.m172264f().mo155129q();
                int i2 = 0;
                while (true) {
                    String[] strArr = f108014i;
                    if (i2 >= strArr.length) {
                        break;
                    } else if (!mailLabelEntity.mo151527k().equals(strArr[i2]) || (mailLabelEntity.mo151527k().equals(q) && !TextUtils.equals(this.f107911f, "SEARCH"))) {
                        i2++;
                    }
                }
                if ((!"IMPORTANT".equals(q) && !"OTHER".equals(q)) || !"INBOX".equals(mailLabelEntity.mo151527k())) {
                    arrayList.add(mailLabelEntity);
                }
            } else if (!mailLabelEntity.mo151527k().equals(C43374f.m172264f().mo155129q()) || TextUtils.equals(this.f107911f, "SEARCH")) {
                arrayList.add(mailLabelEntity);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m169371a(LabelMoveToActivity labelMoveToActivity, Context context) {
        labelMoveToActivity.mo152691a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelMoveToActivity);
        }
    }

    /* renamed from: a */
    public static Context m169369a(LabelMoveToActivity labelMoveToActivity, Configuration configuration) {
        Context a = labelMoveToActivity.mo152690a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
