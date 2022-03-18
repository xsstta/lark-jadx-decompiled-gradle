package com.tt.miniapp.feedback.entrance;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Function;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber;
import com.bytedance.ee.lark.infra.network.p628c.p629a.C12827e;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.AppbrandConstant;
import com.tt.miniapp.chooser.C65817a;
import com.tt.miniapp.feedback.entrance.AbstractC66114a;
import com.tt.miniapp.feedback.entrance.C66119b;
import com.tt.miniapp.feedback.entrance.vo.FAQItemVO;
import com.tt.miniapp.feedback.entrance.vo.FeedbackParam;
import com.tt.miniapp.manager.C66434g;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3362a.p3364b.C67440a;
import com.tt.miniapphost.p3362a.p3365c.C67448a;
import com.tt.miniapphost.p3370d.C67479c;
import com.tt.miniapphost.view.BaseActivity;
import com.tt.refer.common.base.AppType;
import com.tt.refer.common.util.C67866g;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FAQActivity extends BaseActivity implements AbstractC66114a.AbstractC66117a {

    /* renamed from: a */
    public FeedbackParam f166853a;

    /* renamed from: b */
    public AppInfoEntity f166854b;

    /* renamed from: c */
    public long f166855c = -1;

    /* renamed from: d */
    public JSONArray f166856d;

    /* renamed from: e */
    public List<FAQItemVO> f166857e;

    /* renamed from: f */
    public AppType f166858f;

    /* renamed from: g */
    private FragmentManager f166859g;

    /* renamed from: h */
    private C66119b.AbstractC66132a f166860h;

    /* renamed from: a */
    public Context mo231277a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo231279a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m258885a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m258882a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo231288d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo231289e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo231290f() {
        return super.getAssets();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m258888c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m258884a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m258887b(this);
    }

    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66117a
    /* renamed from: a */
    public FeedbackParam mo231278a() {
        return this.f166853a;
    }

    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66117a
    /* renamed from: b */
    public AppInfoEntity mo231285b() {
        return this.f166854b;
    }

    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66117a
    /* renamed from: c */
    public FragmentManager mo231286c() {
        return this.f166859g;
    }

    /* renamed from: a */
    public void mo231284a(JSONArray jSONArray) {
        C66141e eVar;
        if (jSONArray == null) {
            eVar = C66141e.m258964a(false, null, this.f166858f);
        } else {
            eVar = C66141e.m258963a(jSONArray, false, null, this.f166858f);
        }
        this.f166859g.beginTransaction().add(R.id.microapp_m_feedback_faq_container, eVar).addToBackStack(eVar.getClass().getSimpleName()).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public void mo231283a(FAQItemVO fAQItemVO) {
        Fragment fragment;
        JSONArray c = fAQItemVO.mo231391c();
        if (c != null && c.length() > 0) {
            fragment = C66141e.m258963a(c, false, null, this.f166858f);
        } else if (TextUtils.isEmpty(fAQItemVO.mo231392d()) || fAQItemVO.mo231392d().equals("null")) {
            fragment = C66119b.m258917a(fAQItemVO, this.f166854b, this.f166858f);
        } else {
            fragment = View$OnClickListenerC66133c.m258949a(fAQItemVO, this.f166858f);
        }
        this.f166859g.beginTransaction().add(R.id.microapp_m_feedback_faq_container, fragment).addToBackStack(fragment.getClass().getSimpleName()).commitAllowingStateLoss();
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.microapp_i_slide_in_no, R.anim.microapp_i_slide_out_right);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 1) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    /* renamed from: g */
    private void m258889g() {
        if (getIntent() != null) {
            this.f166853a = (FeedbackParam) getIntent().getParcelableExtra("key_request_param");
            this.f166854b = (AppInfoEntity) getIntent().getParcelableExtra("key_appinfo_entity");
            this.f166858f = (AppType) getIntent().getSerializableExtra("key_app_type");
            this.f166855c = getIntent().getLongExtra("key_selected_item_id", this.f166855c);
        }
    }

    /* renamed from: b */
    public static List<FAQItemVO> m258886b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(FAQItemVO.m259005a(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static AssetManager m258888c(FAQActivity fAQActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fAQActivity);
        }
        return fAQActivity.mo231290f();
    }

    /* renamed from: b */
    public static void m258887b(FAQActivity fAQActivity) {
        fAQActivity.mo231289e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FAQActivity fAQActivity2 = fAQActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    fAQActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.microapp_m_activity_feedback_faq);
        m258889g();
        this.f166859g = getSupportFragmentManager();
        if (-1 == this.f166855c) {
            mo231284a((JSONArray) null);
        } else {
            mo231281a(new AbstractC66114a.AbstractC66118b() {
                /* class com.tt.miniapp.feedback.entrance.FAQActivity.C661091 */

                @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66118b
                /* renamed from: a */
                public void mo231291a(List<FAQItemVO> list) {
                    FAQItemVO fAQItemVO = null;
                    if (list == null || list.isEmpty()) {
                        FAQActivity.this.mo231284a((JSONArray) null);
                        return;
                    }
                    Iterator<FAQItemVO> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        FAQItemVO next = it.next();
                        if (FAQActivity.this.f166855c == next.mo231384a()) {
                            fAQItemVO = next;
                            break;
                        }
                    }
                    if (fAQItemVO == null) {
                        FAQActivity fAQActivity = FAQActivity.this;
                        fAQActivity.mo231284a(fAQActivity.f166856d);
                        return;
                    }
                    FAQActivity.this.mo231283a(fAQItemVO);
                }
            });
        }
    }

    /* renamed from: a */
    public static Resources m258884a(FAQActivity fAQActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fAQActivity);
        }
        return fAQActivity.mo231288d();
    }

    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66117a
    /* renamed from: a */
    public void mo231281a(final AbstractC66114a.AbstractC66118b bVar) {
        List<FAQItemVO> list = this.f166857e;
        if (list == null || list.isEmpty()) {
            HostDependManager.getInst().showToast(this, null, getString(R.string.microapp_m_feedback_loading), 10000, "loading");
            Observable.create(new Function<String>() {
                /* class com.tt.miniapp.feedback.entrance.FAQActivity.C661133 */

                /* renamed from: a */
                public String fun() {
                    StringBuilder sb = new StringBuilder();
                    FeedbackParam feedbackParam = new FeedbackParam();
                    feedbackParam.mo231433l(FAQActivity.this.f166853a.mo231434m());
                    feedbackParam.mo231429j(FAQActivity.this.f166853a.mo231430k());
                    feedbackParam.mo231431k(FAQActivity.this.f166853a.mo231432l());
                    feedbackParam.mo231419e(FAQActivity.this.f166853a.mo231418e());
                    feedbackParam.mo231412b(FAQActivity.this.f166853a.mo231411b());
                    feedbackParam.mo231414c(FAQActivity.this.f166853a.mo231413c());
                    sb.append(AppbrandConstant.C65702c.m257640a().mo230162b());
                    sb.append(feedbackParam.mo231407a(FAQActivity.this.f166853a.mo231434m(), FAQActivity.this.f166853a.mo231430k(), FAQActivity.this.f166853a.mo231432l()));
                    Locale c = C67479c.m262467a().mo234230c();
                    if (c != null) {
                        String language = c.getLanguage();
                        sb.append("&lang=");
                        sb.append(language);
                    }
                    return C66434g.m259707a().mo231984a(new C12827e(sb.toString(), "GET", false), C67448a.m262353a().mo234181b(C67440a.m262344a(FAQActivity.this.f166858f, FAQActivity.this.f166854b.appId))).mo48466d();
                }
            }).schudleOn(Schedulers.longIO()).subscribe(new Subscriber.ResultableSubscriber<String>() {
                /* class com.tt.miniapp.feedback.entrance.FAQActivity.C661102 */

                @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Subscriber
                public void onError(Throwable th) {
                    C67866g.m264027a(new Runnable() {
                        /* class com.tt.miniapp.feedback.entrance.FAQActivity.C661102.RunnableC661122 */

                        public void run() {
                            HostDependManager.getInst().hideToast();
                        }
                    });
                    AppBrandLogger.m52829e("tma_FAQActivity", "requestData", th);
                }

                /* renamed from: a */
                public void onSuccess(String str) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        FAQActivity.this.f166856d = jSONObject.optJSONArray("list");
                        FAQActivity fAQActivity = FAQActivity.this;
                        fAQActivity.f166857e = FAQActivity.m258886b(fAQActivity.f166856d);
                        C67866g.m264027a(new Runnable() {
                            /* class com.tt.miniapp.feedback.entrance.FAQActivity.C661102.RunnableC661111 */

                            public void run() {
                                HostDependManager.getInst().hideToast();
                                bVar.mo231291a(FAQActivity.this.f166857e);
                            }
                        });
                    } catch (JSONException e) {
                        AppBrandLogger.m52829e("tma_FAQActivity", e);
                    }
                }
            });
            return;
        }
        bVar.mo231291a(this.f166857e);
    }

    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66117a
    /* renamed from: a */
    public void mo231282a(C66119b.AbstractC66132a aVar) {
        this.f166860h = aVar;
    }

    /* renamed from: a */
    public static void m258885a(FAQActivity fAQActivity, Context context) {
        fAQActivity.mo231279a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fAQActivity);
        }
    }

    /* renamed from: a */
    public static Context m258882a(FAQActivity fAQActivity, Configuration configuration) {
        Context a = fAQActivity.mo231277a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // com.tt.miniapp.feedback.entrance.AbstractC66114a.AbstractC66117a
    /* renamed from: a */
    public void mo231280a(Fragment fragment, Fragment fragment2) {
        this.f166859g.beginTransaction().add(R.id.microapp_m_feedback_faq_container, fragment2).hide(fragment).setCustomAnimations(R.anim.microapp_i_slide_in_right, R.anim.microapp_i_stay_out).addToBackStack(fragment2.getClass().getSimpleName()).commitAllowingStateLoss();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        List<MediaEntity> a = HostDependManager.getInst().handleActivityImageResult(i, i2, intent).mo234480a();
        if (a == null) {
            if (i == 7 && i2 == 19901026) {
                if (intent != null) {
                    a = intent.getParcelableArrayListExtra("select_result");
                }
            } else if (i == 10 && i2 == -1) {
                String str = C65817a.f165870b;
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        a = new ArrayList<>();
                        a.add(new MediaEntity(str, file.getName(), 0, 0, file.length(), 0, ""));
                    }
                }
            }
        }
        C66119b.AbstractC66132a aVar = this.f166860h;
        if (aVar != null) {
            aVar.mo231318a(a);
        }
    }

    /* renamed from: a */
    public static Intent m258883a(Context context, FeedbackParam feedbackParam, AppInfoEntity appInfoEntity, long j, AppType appType) {
        Intent intent = new Intent(context, FAQActivity.class);
        intent.putExtra("key_request_param", feedbackParam);
        intent.putExtra("key_appinfo_entity", appInfoEntity);
        intent.putExtra("key_selected_item_id", j);
        intent.putExtra("key_app_type", appType);
        return intent;
    }
}
