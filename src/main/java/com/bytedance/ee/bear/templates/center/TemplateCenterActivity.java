package com.bytedance.ee.bear.templates.center;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.C11515d;
import com.bytedance.ee.bear.templates.TemplateReport;
import com.bytedance.ee.bear.templates.TemplateReportV2;
import com.bytedance.ee.bear.templates.TemplateV4;
import com.bytedance.ee.bear.templates.scene.SceneFragment;
import com.bytedance.ee.bear.templates.search.SearchFragment;
import com.bytedance.ee.bear.templates.topic.TopicFragment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0014J\u0012\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "getStringExtra", "", "key", "getTemplateSource", "jumpToTemplateSearch", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onDestroy", "onDoCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class TemplateCenterActivity extends BaseActivity {

    /* renamed from: a */
    public static final Companion f30799a = new Companion(null);

    /* renamed from: a */
    public Context mo44002a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo44004a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m47666a(this, context);
    }

    /* renamed from: b */
    public Resources mo44005b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo44006c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m47663a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo44008d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m47668c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m47664a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m47667b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/templates/center/TemplateCenterActivity$Companion;", "", "()V", "CODE_FINISH_TEMPLATE", "", "DEFAULT_FILTER_TYPE", "KEY_FILTER_TYPE", "", "KEY_TOPIC_ID", "TAG", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.center.TemplateCenterActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final String m47669e() {
        boolean z;
        String str = C11515d.f31005b;
        Intrinsics.checkExpressionValueIsNotNull(str, "TEMPLATE_SOURCE");
        String a = m47665a(str);
        if (a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m47665a("enterSource");
        }
        return a;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.LifeCycleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity
    public void onDestroy() {
        super.onDestroy();
        if (C10929e.f29412b.get()) {
            TemplateReportV2.f31015b.mo44259g();
            TemplateReport.f31011b.mo44226a("");
        }
    }

    /* renamed from: a */
    public final void mo44003a() {
        ConnectionService.NetworkState b;
        ConnectionService d = C5084ad.m20847d();
        if (d == null || (b = d.mo20038b()) == null || !b.mo20041b()) {
            Toast.showFailureText(this, (int) R.string.Doc_Facade_Offline);
            return;
        }
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(R.id.container, SearchFragment.f31295b.mo44618a(this)).addToBackStack(null).commitAllowingStateLoss();
        TemplateReportV2.f31015b.mo44248c();
    }

    /* renamed from: a */
    public static Resources m47664a(TemplateCenterActivity templateCenterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(templateCenterActivity);
        }
        return templateCenterActivity.mo44005b();
    }

    /* renamed from: c */
    public static AssetManager m47668c(TemplateCenterActivity templateCenterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(templateCenterActivity);
        }
        return templateCenterActivity.mo44008d();
    }

    /* renamed from: b */
    public static void m47667b(TemplateCenterActivity templateCenterActivity) {
        templateCenterActivity.mo44006c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TemplateCenterActivity templateCenterActivity2 = templateCenterActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    templateCenterActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private final String m47665a(String str) {
        String str2;
        Serializable serializableExtra;
        Intent intent = getIntent();
        if (intent != null) {
            str2 = intent.getStringExtra(str);
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (serializableExtra = intent2.getSerializableExtra("extra_data_map")) == null) {
            return "";
        }
        if (serializableExtra != null) {
            String str3 = (String) ((Map) serializableExtra).get(str);
            if (str3 != null) {
                return str3;
            }
            return "";
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        String str;
        String str2;
        long j;
        long j2;
        String str3;
        boolean z;
        String str4;
        int i;
        TemplateCenterActivity templateCenterActivity;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        String stringExtra5;
        super.mo22315b(bundle);
        setContentView(R.layout.activity_template_center);
        Intent intent = getIntent();
        if (intent == null || (stringExtra5 = intent.getStringExtra("openTemplateCenter")) == null) {
            str = "";
        } else {
            str = stringExtra5;
        }
        Intent intent2 = getIntent();
        if (intent2 == null || (stringExtra4 = intent2.getStringExtra("enterSource")) == null) {
            str2 = "";
        } else {
            str2 = stringExtra4;
        }
        Intent intent3 = getIntent();
        long j3 = -1;
        if (intent3 != null) {
            j = intent3.getLongExtra("templateCategory", -1);
        } else {
            j = -1;
        }
        Intent intent4 = getIntent();
        if (intent4 != null) {
            j2 = intent4.getLongExtra("topicId", -1);
        } else {
            j2 = -1;
        }
        Intent intent5 = getIntent();
        if (intent5 != null) {
            j3 = intent5.getLongExtra("sceneId", -1);
        }
        Intent intent6 = getIntent();
        if (intent6 == null || (stringExtra3 = intent6.getStringExtra("ROOT_TOKEN")) == null) {
            str3 = "";
        } else {
            str3 = stringExtra3;
        }
        Intent intent7 = getIntent();
        if (intent7 != null) {
            z = intent7.getBooleanExtra("key_folder_version", false);
        } else {
            z = false;
        }
        Intent intent8 = getIntent();
        if (intent8 == null || (stringExtra2 = intent8.getStringExtra("MODULE")) == null) {
            str4 = "";
        } else {
            str4 = stringExtra2;
        }
        Intent intent9 = getIntent();
        if (intent9 != null) {
            i = intent9.getIntExtra("objType", -1);
        } else {
            i = -1;
        }
        TemplateCenterActivity templateCenterActivity2 = this;
        boolean z2 = false;
        getSupportFragmentManager().beginTransaction().add(R.id.container, TemplateCenterFragment.f30814b.mo44016a(templateCenterActivity2, str, j, str2, str3, str4, i, z)).commitAllowingStateLoss();
        String str5 = null;
        if (j2 > 0) {
            FragmentTransaction customAnimations = getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out);
            TopicFragment.Companion aVar = TopicFragment.f31441a;
            String valueOf = String.valueOf(j2);
            templateCenterActivity = templateCenterActivity2;
            customAnimations.add(R.id.container, aVar.mo44750a(templateCenterActivity, valueOf)).addToBackStack(null).commitAllowingStateLoss();
        } else {
            templateCenterActivity = templateCenterActivity2;
        }
        if (j3 > 0) {
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.facade_slide_right_in, R.anim.facade_slide_left_out, R.anim.facade_slide_left_in, R.anim.facade_slide_right_out).add(R.id.container, SceneFragment.f31286a.mo44608a(templateCenterActivity, String.valueOf(j3))).addToBackStack(null).commitAllowingStateLoss();
        }
        TemplateReport.f31011b.mo44226a("");
        Intent intent10 = getIntent();
        if (!(intent10 == null || (stringExtra = intent10.getStringExtra("fromAppLink")) == null)) {
            if (stringExtra.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                str5 = stringExtra;
            }
            if (str5 != null) {
                TemplateReport.f31011b.mo44233c(str5);
                TemplateReport.f31011b.mo44226a(str5);
            }
        }
        TemplateReportV2.f31015b.mo44247b(m47669e());
    }

    /* renamed from: a */
    public static void m47666a(TemplateCenterActivity templateCenterActivity, Context context) {
        templateCenterActivity.mo44004a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(templateCenterActivity);
        }
    }

    /* renamed from: a */
    public static Context m47663a(TemplateCenterActivity templateCenterActivity, Configuration configuration) {
        Context a = templateCenterActivity.mo44002a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 205) {
            C13479a.m54764b("TemplateCenterActivity", "DocActivity return result");
            TemplateV4 selectedTemplate = ((TemplateCenterViewModel) aj.m5366a(this).mo6005a(TemplateCenterViewModel.class)).getSelectedTemplate();
            if (selectedTemplate == null) {
                C13479a.m54758a("TemplateCenterActivity", "onActivityResult(): template == null");
                return;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("templateId", selectedTemplate.getObjToken());
            intent2.putExtra("templateType", selectedTemplate.getObjType());
            setResult(-1, intent);
            finish();
        }
        if (i2 == 100) {
            setResult(-1, intent);
            finish();
        }
    }
}
