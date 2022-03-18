package com.ss.android.lark.mail.impl.home.aggregation.label;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.bytedance.lark.pb.email.client.v1.MailAddLabelResponse;
import com.bytedance.lark.pb.email.client.v1.MailUpdateLabelResponse;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.colorpicker.UDColorItem;
import com.larksuite.component.universe_design.colorpicker.UDColorPicker;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.core.Watchers;
import com.ss.android.lark.mail.impl.entity.MailLabelEntity;
import com.ss.android.lark.mail.impl.home.aggregation.AbstractC42401a;
import com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity;
import com.ss.android.lark.mail.impl.home.aggregation.label.p2180a.C42432a;
import com.ss.android.lark.mail.impl.home.aggregation.label.p2181b.C42433a;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.p2168g.p2169a.C42130j;
import com.ss.android.lark.mail.impl.p2171h.C42187a;
import com.ss.android.lark.mail.impl.p2171h.p2172a.C42209j;
import com.ss.android.lark.mail.impl.p2171h.p2173b.C42295n;
import com.ss.android.lark.mail.impl.p2171h.p2175c.C42344d;
import com.ss.android.lark.mail.impl.p2195i.C42699a;
import com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d;
import com.ss.android.lark.mail.impl.utils.C43761d;
import com.ss.android.lark.mail.impl.utils.C43849u;
import com.ss.android.lark.mail.impl.utils.toast.MailToast;
import com.ss.android.lark.mail.impl.view.dialog.DialogC43910a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LabelEditActivity extends BaseEditActivity implements AbstractC43317d, DialogC43910a.AbstractC43914a {

    /* renamed from: u */
    private static final Map<String, Boolean> f107987u;

    /* renamed from: n */
    public UDColorPicker f107988n;

    /* renamed from: o */
    public ArrayList<C42432a> f107989o = new ArrayList<>();

    /* renamed from: p */
    public C42432a f107990p;

    /* renamed from: q */
    public MailLabelEntity f107991q;

    /* renamed from: t */
    private final String f107992t = "LabelEditActivity";

    /* renamed from: v */
    private View f107993v;

    /* renamed from: w */
    private C42430a f107994w = new C42430a();

    /* renamed from: a */
    public Context mo152674a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo152675a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m169341a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m169339a(this, configuration);
    }

    public AssetManager getAssets() {
        return m169343c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m169340a(this);
    }

    /* renamed from: k */
    public Resources mo152647k() {
        return super.getResources();
    }

    /* renamed from: l */
    public void mo152679l() {
        super.onStop();
    }

    /* renamed from: m */
    public AssetManager mo152680m() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onStop() {
        m169342b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: d */
    public AbstractC42401a mo152561d() {
        return this.f107994w;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        Watchers.m167209b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: h */
    public boolean mo152565h() {
        boolean z;
        C42432a aVar = this.f107990p;
        if (aVar == null || aVar.mo152715b() == this.f107882h.mo151515e()) {
            z = false;
        } else {
            z = true;
        }
        if (super.mo152565h() || z) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: e */
    public void mo150716e() {
        super.mo150716e();
        View findViewById = findViewById(R.id.mail_aggregation_edit_color_tips);
        this.f107993v = findViewById;
        findViewById.setVisibility(0);
        UDColorPicker uDColorPicker = (UDColorPicker) findViewById(R.id.mail_aggregation_color_grid);
        this.f107988n = uDColorPicker;
        uDColorPicker.setVisibility(0);
        C42433a.m169436a().mo152719a(this, new IGetDataCallback() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelEditActivity.C424211 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IRequestCallback
            public void onError(ErrorResult errorResult) {
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public void onSuccess(Object obj) {
                C43849u.m173826a(new Runnable() {
                    /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelEditActivity.C424211.RunnableC424221 */

                    public void run() {
                        String str;
                        LabelEditActivity.this.f107989o.clear();
                        LabelEditActivity.this.f107989o.addAll(C42433a.m169436a().mo152720b());
                        if (!LabelEditActivity.this.f107883i) {
                            int i = 0;
                            while (true) {
                                if (i >= C42433a.f108031a.length) {
                                    break;
                                }
                                String a = C43761d.m173470a(LabelEditActivity.this.getResources().getColor(C42433a.f108031a[i]));
                                String a2 = C43761d.m173470a(LabelEditActivity.this.getResources().getColor(C42433a.f108033c[i]));
                                String a3 = C43761d.m173470a(LabelEditActivity.this.getResources().getColor(C42433a.f108032b[i]));
                                if (LabelEditActivity.this.f107991q != null) {
                                    str = LabelEditActivity.this.f107991q.mo151518f();
                                } else {
                                    str = "#2B2F36";
                                }
                                if (TextUtils.equals(str, a) || TextUtils.equals(str, a2) || TextUtils.equals(str, a3)) {
                                    LabelEditActivity.this.f107989o.get(i).mo152714a(true);
                                    LabelEditActivity.this.f107990p = LabelEditActivity.this.f107989o.get(i);
                                } else {
                                    LabelEditActivity.this.f107989o.get(i).mo152714a(false);
                                    i++;
                                }
                            }
                            LabelEditActivity.this.f107989o.get(i).mo152714a(true);
                            LabelEditActivity.this.f107990p = LabelEditActivity.this.f107989o.get(i);
                        } else if (LabelEditActivity.this.f107989o.size() > 0) {
                            LabelEditActivity.this.f107990p = LabelEditActivity.this.f107989o.get(0);
                            LabelEditActivity.this.f107989o.get(0).mo152714a(true);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < C42433a.f108032b.length; i2++) {
                            arrayList.add(new UDColorItem(LabelEditActivity.this.getResources().getColor(C42433a.f108032b[i2])));
                        }
                        LabelEditActivity.this.f107988n.setColorItems(arrayList);
                        if (LabelEditActivity.this.f107990p != null) {
                            LabelEditActivity.this.f107988n.mo90392a(LabelEditActivity.this.f107989o.indexOf(LabelEditActivity.this.f107990p));
                        }
                        LabelEditActivity.this.f107988n.setOnItemClickListener(new UDColorPicker.OnColorItemClickListener() {
                            /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelEditActivity.C424211.RunnableC424221.C424231 */

                            @Override // com.larksuite.component.universe_design.colorpicker.UDColorPicker.OnColorItemClickListener
                            /* renamed from: a */
                            public void mo90399a(int i, UDColorItem dVar) {
                                if (i >= 0 && i < LabelEditActivity.this.f107989o.size()) {
                                    C42432a aVar = LabelEditActivity.this.f107989o.get(i);
                                    LabelEditActivity.this.f107990p = aVar;
                                    for (int i2 = 0; i2 < LabelEditActivity.this.f107989o.size(); i2++) {
                                        LabelEditActivity.this.f107989o.get(i2).mo152714a(false);
                                    }
                                    aVar.mo152714a(true);
                                }
                            }
                        });
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    /* renamed from: a */
    public String mo150444a() {
        if (this.f107883i) {
            return C42187a.C42190b.f107408k;
        }
        return C42187a.C42190b.f107407j;
    }

    static {
        HashMap hashMap = new HashMap();
        f107987u = hashMap;
        hashMap.put("INBOX".toLowerCase(), true);
        hashMap.put("ARCHIVED".toLowerCase(), true);
        hashMap.put("SPAM".toLowerCase(), true);
        hashMap.put("TRASH".toLowerCase(), true);
        hashMap.put("RECEIVED".toLowerCase(), true);
        hashMap.put("SENT".toLowerCase(), true);
        hashMap.put("DRAFT".toLowerCase(), true);
        hashMap.put("UNREAD".toLowerCase(), true);
        hashMap.put("READ".toLowerCase(), true);
        hashMap.put("SHARE".toLowerCase(), true);
        hashMap.put("FLAGGED".toLowerCase(), true);
        hashMap.put("IMPORTANT".toLowerCase(), true);
        hashMap.put("OTHER".toLowerCase(), true);
        hashMap.put("OUTBOX".toLowerCase(), true);
    }

    /* renamed from: a */
    public static Resources m169340a(LabelEditActivity labelEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelEditActivity);
        }
        return labelEditActivity.mo152647k();
    }

    /* renamed from: c */
    public static AssetManager m169343c(LabelEditActivity labelEditActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelEditActivity);
        }
        return labelEditActivity.mo152680m();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.ss.android.lark.mail.impl.view.BaseMailFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Watchers.m167206a(this);
        if (this.f107882h != null) {
            this.f107991q = mo152561d().mo152615a(this.f107882h.mo151527k());
        }
    }

    /* renamed from: b */
    public static void m169342b(LabelEditActivity labelEditActivity) {
        labelEditActivity.mo152679l();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LabelEditActivity labelEditActivity2 = labelEditActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    labelEditActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m169341a(LabelEditActivity labelEditActivity, Context context) {
        labelEditActivity.mo152675a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(labelEditActivity);
        }
    }

    /* renamed from: a */
    public static Context m169339a(LabelEditActivity labelEditActivity, Configuration configuration) {
        Context a = labelEditActivity.mo152674a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: a */
    public void mo152554a(MailLabelEntity mailLabelEntity, String str) {
        String str2;
        if (mailLabelEntity != null) {
            str2 = mailLabelEntity.mo151527k();
        } else {
            str2 = null;
        }
        C42699a.m170266b(this, str2, str);
    }

    @Override // com.ss.android.lark.mail.impl.service.p2217b.p2218a.AbstractC43317d
    /* renamed from: a */
    public void mo152676a(final MailLabelEntity mailLabelEntity, final boolean z) {
        C43849u.m173826a(new Runnable() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelEditActivity.RunnableC424264 */

            public void run() {
                if (z && LabelEditActivity.this.f107882h != null && TextUtils.equals(LabelEditActivity.this.f107882h.mo151527k(), mailLabelEntity.mo151527k())) {
                    LabelEditActivity.this.finish();
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: b */
    public void mo152558b(final String str, String str2, final IGetDataCallback<MailLabelEntity> iGetDataCallback) {
        String str3;
        String str4;
        String str5;
        C42187a.m168545j();
        C42432a aVar = this.f107990p;
        if (aVar != null) {
            str5 = aVar.mo152712a();
            str4 = C43761d.m173470a(this.f107990p.mo152715b());
            str3 = C43761d.m173470a(this.f107990p.mo152717c());
        } else {
            str5 = "";
            str4 = "#3370FF";
            str3 = "#E1EAFF";
        }
        final C42295n nVar = (C42295n) C42344d.m169091a(C42295n.class, this);
        nVar.mo152418b(null, "create", "label");
        C42176e.m168344a().mo152210a(str5, str4, str3, str, str2, true, (IGetDataCallback<MailAddLabelResponse>) new IGetDataCallback<MailAddLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelEditActivity.C424253 */

            /* renamed from: a */
            public void onSuccess(MailAddLabelResponse mailAddLabelResponse) {
                nVar.mo152372a("success", 0);
                iGetDataCallback.onSuccess(C42130j.m168150a().mo152079a(mailAddLabelResponse.label));
                MailToast.m173704a(LabelEditActivity.this.getString(R.string.Mail_CustomLabels_Add_Label_Notification).replace("{{name}}", str), MailToast.Type.SUCCESS);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult != null) {
                    nVar.mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                }
                nVar.mo152372a("rust_fail", 0);
                iGetDataCallback.onError(errorResult);
                MailToast.m173698a((int) R.string.Mail_CustomLabels_FailedToast, MailToast.Type.FAIL);
                C42209j.m168612a("label_create_custom_fail", "toast");
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.home.aggregation.BaseEditActivity
    /* renamed from: a */
    public void mo152555a(final String str, String str2, final IGetDataCallback<MailLabelEntity> iGetDataCallback) {
        String str3;
        String str4;
        String str5;
        String str6;
        int i = 0;
        while (true) {
            if (i >= this.f107989o.size()) {
                str3 = "#3370FF";
                str4 = "#E1EAFF";
                str5 = "";
                break;
            } else if (this.f107989o.get(i).mo152718d()) {
                String a = this.f107989o.get(i).mo152712a();
                str3 = C43761d.m173470a(this.f107989o.get(i).mo152715b());
                str4 = C43761d.m173470a(this.f107989o.get(i).mo152717c());
                str5 = a;
                break;
            } else {
                i++;
            }
        }
        if (TextUtils.equals("0", str2)) {
            str6 = "";
        } else {
            str6 = str2;
        }
        final C42295n nVar = (C42295n) C42344d.m169091a(C42295n.class, this);
        nVar.mo152418b(null, "edit", "label");
        C42176e.m168344a().mo152209a(this.f107882h.mo151527k(), str6, str5, str3, str4, str, true, new IGetDataCallback<MailUpdateLabelResponse>() {
            /* class com.ss.android.lark.mail.impl.home.aggregation.label.LabelEditActivity.C424242 */

            /* renamed from: a */
            public void onSuccess(MailUpdateLabelResponse mailUpdateLabelResponse) {
                nVar.mo152372a("success", 0);
                iGetDataCallback.onSuccess(C42130j.m168150a().mo152079a(mailUpdateLabelResponse.label));
                MailToast.m173704a(LabelEditActivity.this.mo152561d().mo152616a(R.string.Mail_Manage_FolderLabelModifiedSuccessfully, new Pair<>("name", str)), MailToast.Type.SUCCESS);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (errorResult != null) {
                    nVar.mo152369a(errorResult.getErrorCode(), errorResult.getDebugMsg());
                }
                nVar.mo152372a("rust_fail", 0);
                iGetDataCallback.onError(errorResult);
                MailToast.m173704a(LabelEditActivity.this.mo152561d().mo152616a(R.string.Mail_Manage_FolderLabelModifyFailed, new Pair<>("name", str)), MailToast.Type.FAIL);
                C42209j.m168612a("label_modify_custom_fail", "toast");
            }
        });
    }
}
