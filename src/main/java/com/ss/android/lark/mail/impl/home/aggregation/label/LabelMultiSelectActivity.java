package com.ss.android.lark.mail.impl.home.aggregation.label;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.action.CustomLabelThreadListMailAction;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.entity.MailThread;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;
import com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity;
import com.ss.android.lark.mail.impl.p2168g.C42107a;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.service.C43307b;
import com.ss.android.lark.mail.impl.utils.C43819s;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LabelMultiSelectActivity extends BaseSelectActivity {

    /* renamed from: h */
    C42430a f108016h = new C42430a();

    /* renamed from: i */
    boolean f108017i = false;

    /* renamed from: j */
    Map<String, Integer> f108018j = new HashMap();

    /* renamed from: k */
    private final ArrayList<String> f108019k = new ArrayList<>();

    /* renamed from: a */
    public Context mo152697a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152698a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169388a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169384a(this, configuration);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: f */
    public boolean mo152591f() {
        return true;
    }

    public AssetManager getAssets() {
        return m169390c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169385a(this);
    }

    /* renamed from: l */
    public Resources mo152701l() {
        return super.getResources();
    }

    /* renamed from: m */
    public void mo152702m() {
        super.onStop();
    }

    /* renamed from: n */
    public AssetManager mo152703n() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169389b(this);
    }

    @Override // com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        return C42187a.C42190b.f107406i;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: e */
    public AbstractC42401a mo150716e() {
        return this.f108016h;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: g */
    public String mo152592g() {
        return C43819s.m173684a((int) R.string.Mail_CustomLabels_Label);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: i */
    public void mo152594i() {
        int i;
        ArrayList<MailLabelEntity> c = this.f107908c.mo152630c();
        if (!CollectionUtils.isEmpty(c)) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<MailLabelEntity> it = c.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                MailLabelEntity next = it.next();
                Integer num = this.f108018j.get(next.mo151527k());
                if (next.mo151536t() == 2 && (num == null || num.intValue() != 2)) {
                    arrayList.add(next.mo151527k());
                } else if (!(next.mo151536t() != 1 || num == null || num.intValue() == 1)) {
                    arrayList2.add(next.mo151527k());
                }
                if (next.mo151536t() == 2) {
                    i3++;
                }
            }
            if (arrayList.size() == 0 && arrayList2.size() == 0) {
                finish();
                return;
            }
            C43307b.m172030a().mo154977a(new CustomLabelThreadListMailAction(this.f108019k, this.f107911f, arrayList, arrayList2));
            Intent intent = new Intent();
            intent.putExtra("isNeedSaveAndBack", true);
            intent.putStringArrayListExtra("unselList", this.f107908c.mo152627b());
            setResult(-1, intent);
            if (CollectionUtils.isNotEmpty(this.f108018j)) {
                i = 0;
                for (Integer num2 : this.f108018j.values()) {
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        if (intValue == 2) {
                            i2++;
                        } else if (intValue == 3) {
                            i++;
                        }
                    }
                }
            } else {
                i = 0;
            }
            if (this.f108019k.size() > 1) {
                m169387a(i2, i, i3, arrayList2.size());
            } else {
                m169386a(i2, i3);
            }
            C42187a.m168468a(arrayList.size(), true);
            C42187a.m168498b(arrayList2.size(), true);
            finish();
        }
    }

    /* renamed from: a */
    public static Resources m169385a(LabelMultiSelectActivity labelMultiSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelMultiSelectActivity);
        }
        return labelMultiSelectActivity.mo152701l();
    }

    /* renamed from: c */
    public static AssetManager m169390c(LabelMultiSelectActivity labelMultiSelectActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelMultiSelectActivity);
        }
        return labelMultiSelectActivity.mo152703n();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: b */
    public void mo152589b(List<MailLabelEntity> list) {
        if (list != null && !this.f108017i) {
            this.f108017i = true;
            m169391c(list);
        }
        m169392d(list);
        super.mo152589b(list);
    }

    /* renamed from: b */
    public static void m169389b(LabelMultiSelectActivity labelMultiSelectActivity) {
        labelMultiSelectActivity.mo152702m();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LabelMultiSelectActivity labelMultiSelectActivity2 = labelMultiSelectActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    labelMultiSelectActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: d */
    private void m169392d(List<MailLabelEntity> list) {
        int i;
        ArrayList<MailLabelEntity> c = this.f107908c.mo152630c();
        if (CollectionUtils.isEmpty(c)) {
            for (MailLabelEntity mailLabelEntity : list) {
                if (!mailLabelEntity.mo151529m()) {
                    Integer num = this.f108018j.get(mailLabelEntity.mo151527k());
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 1;
                    }
                    mailLabelEntity.mo151516e(i);
                }
            }
            return;
        }
        for (int i2 = 0; i2 < c.size(); i2++) {
            MailLabelEntity mailLabelEntity2 = c.get(i2);
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                MailLabelEntity mailLabelEntity3 = list.get(i3);
                if (!mailLabelEntity3.mo151529m() && TextUtils.equals(mailLabelEntity3.mo151527k(), mailLabelEntity2.mo151527k())) {
                    mailLabelEntity3.mo151516e(mailLabelEntity2.mo151536t());
                    break;
                }
                i3++;
            }
        }
    }

    /* renamed from: c */
    private void m169391c(List<MailLabelEntity> list) {
        int i;
        int i2;
        this.f108018j.clear();
        this.f108019k.clear();
        if (list != null) {
            List arrayList = new ArrayList();
            if (getIntent() != null) {
                arrayList = getIntent().getParcelableArrayListExtra("select_threads");
            }
            if (CollectionUtils.isEmpty(arrayList)) {
                arrayList = (List) C42107a.m168074a().mo152034b("select_threads");
                C42107a.m168074a().mo152031a("select_threads");
            }
            if (arrayList != null) {
                HashMap hashMap = new HashMap();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    MailThread mailThread = (MailThread) arrayList.get(i3);
                    this.f108019k.add(mailThread.mo151676a());
                    for (MailLabelEntity mailLabelEntity : mailThread.mo151723r()) {
                        if (!mailLabelEntity.mo151529m()) {
                            Integer num = (Integer) hashMap.get(mailLabelEntity.mo151527k());
                            String k = mailLabelEntity.mo151527k();
                            if (num == null) {
                                i2 = 1;
                            } else {
                                i2 = num.intValue() + 1;
                            }
                            hashMap.put(k, Integer.valueOf(i2));
                        }
                    }
                }
                int size = this.f108019k.size();
                for (MailLabelEntity mailLabelEntity2 : list) {
                    Integer num2 = (Integer) hashMap.get(mailLabelEntity2.mo151527k());
                    if (num2 == null || num2.intValue() == 0) {
                        i = 1;
                    } else if (num2.intValue() == size) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                    this.f108018j.put(mailLabelEntity2.mo151527k(), Integer.valueOf(i));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseSelectActivity
    /* renamed from: a */
    public List<MailLabelEntity> mo152586a(List<MailLabelEntity> list) {
        ArrayList arrayList = new ArrayList();
        for (MailLabelEntity mailLabelEntity : list) {
            if (!mailLabelEntity.mo151529m()) {
                arrayList.add(mailLabelEntity);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m169388a(LabelMultiSelectActivity labelMultiSelectActivity, Context context) {
        labelMultiSelectActivity.mo152698a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelMultiSelectActivity);
        }
    }

    /* renamed from: a */
    public static Context m169384a(LabelMultiSelectActivity labelMultiSelectActivity, Configuration configuration) {
        Context a = labelMultiSelectActivity.mo152697a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private void m169386a(int i, int i2) {
        if (i2 == 0 && i > 0) {
            MailToast.m173697a((int) R.string.Mail_Toast_RemoveLabelSuccess);
        } else if (i2 > i) {
            MailToast.m173697a((int) R.string.Mail_Toast_AddLabelSuccess);
        } else {
            MailToast.m173697a((int) R.string.Mail_Toast_ModifyLabelSuccess);
        }
    }

    /* renamed from: a */
    private void m169387a(int i, int i2, int i3, int i4) {
        boolean z;
        if (i > 0 || i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == 0 && z) {
            MailToast.m173697a((int) R.string.Mail_Toast_RemoveLabelSuccess);
        } else if (i3 <= i) {
            MailToast.m173697a((int) R.string.Mail_Toast_ModifyLabelSuccess);
        } else if (i4 > 0) {
            MailToast.m173697a((int) R.string.Mail_Toast_ModifyLabelSuccess);
        } else {
            MailToast.m173697a((int) R.string.Mail_Toast_AddLabelSuccess);
        }
    }
}
