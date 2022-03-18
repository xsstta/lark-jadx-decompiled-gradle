package com.ss.android.lark.guide.landing.general.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.guide.C38548a;
import com.ss.android.lark.guide.landing.general.mvp.C38635a;
import com.ss.android.lark.guide.landing.general.mvp.C38636b;
import com.ss.android.lark.guide.landing.general.mvp.C38639c;
import com.ss.android.lark.guide.landing.general.mvp.GuidePageView;
import com.ss.android.lark.guide.landing.general.view.GuidePageItemView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.util.LinkedList;
import org.json.JSONObject;

public class GuidePageActivity extends BaseFragmentActivity {

    /* renamed from: a */
    private C38636b f99319a;

    /* renamed from: a */
    public Context mo141537a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo141538a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo141540a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m152486a(this, context);
    }

    /* renamed from: b */
    public void mo141541b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo141542c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m152484a(this, configuration);
    }

    @Override // com.ss.android.lark.base.watermark.IWatermarkable, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean enableGlobalWatermark() {
        return false;
    }

    public AssetManager getAssets() {
        return m152488c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m152485a(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public boolean isNeedLoginStatus() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m152487b(this);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_PUSH_LEFT_CREAT);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        C38636b bVar = this.f99319a;
        if (bVar != null) {
            bVar.destroy();
        }
        this.f99319a = null;
    }

    /* renamed from: a */
    public static Resources m152485a(GuidePageActivity guidePageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(guidePageActivity);
        }
        return guidePageActivity.mo141538a();
    }

    /* renamed from: c */
    public static AssetManager m152488c(GuidePageActivity guidePageActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(guidePageActivity);
        }
        return guidePageActivity.mo141542c();
    }

    /* renamed from: b */
    public static void m152487b(GuidePageActivity guidePageActivity) {
        guidePageActivity.mo141541b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            GuidePageActivity guidePageActivity2 = guidePageActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    guidePageActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        disableBlackStatusBarBeforeOnCreate();
        super.onCreate(bundle);
        setContentView(R.layout.activity_guide_page);
        this.f99319a = new C38636b(new C38635a(), new GuidePageView(this, new GuidePageView.AbstractC38634c() {
            /* class com.ss.android.lark.guide.landing.general.ui.GuidePageActivity.C386431 */

            @Override // com.ss.android.lark.guide.landing.general.mvp.GuidePageView.AbstractC38634c
            /* renamed from: a */
            public Lifecycle mo141530a() {
                return GuidePageActivity.this.getLifecycle();
            }

            @Override // com.ss.android.lark.guide.landing.general.mvp.GuidePageView.AbstractC38634c
            /* renamed from: a */
            public void mo141531a(C38639c.AbstractC38641b bVar) {
                ButterKnife.bind(bVar, GuidePageActivity.this);
            }

            @Override // com.ss.android.lark.guide.landing.general.mvp.GuidePageView.AbstractC38634c
            /* renamed from: a */
            public void mo141532a(String str, JSONObject jSONObject) {
                C38548a.m152027a().mo141249a(str, jSONObject);
            }
        }));
        this.f99319a.mo141534a(new LinkedList<GuidePageItemView.C38647a>() {
            /* class com.ss.android.lark.guide.landing.general.ui.GuidePageActivity.C386442 */

            {
                add(new GuidePageItemView.C38647a(new int[]{R.drawable.ud_01img_1, R.drawable.ud_01img_2, R.drawable.ud_01img_3, R.drawable.ud_01img_4}, GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideFirstPageTitle), GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideFirstPageContent)));
                add(new GuidePageItemView.C38647a(new int[]{R.drawable.ud_02img_1, R.drawable.ud_02img_2, R.drawable.ud_02img_3, R.drawable.ud_02img_4}, GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideSecondPageTitle), GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideSecondPageContent)));
                add(new GuidePageItemView.C38647a(new int[]{R.drawable.ud_03img_1, R.drawable.ud_03img_2, R.drawable.ud_03img_3, R.drawable.ud_03img_4}, GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideThirdPageTitle), GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideThirdPageContent)));
                add(new GuidePageItemView.C38647a(new int[]{R.drawable.ud_04img_1, R.drawable.ud_04img_2, R.drawable.ud_04img_3, R.drawable.ud_04img_4}, GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideForthPageTitle), GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideForthPageContent)));
                add(new GuidePageItemView.C38647a(new int[]{R.drawable.ud_05img_1, R.drawable.ud_05img_2, R.drawable.ud_05img_3, R.drawable.ud_05img_4}, GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideFifthPageTitle), GuidePageActivity.this.mo141539a(R.string.Lark_UserGrowth_GuideFifthPageContent)));
            }
        });
        this.f99319a.create();
    }

    /* renamed from: a */
    public String mo141539a(int i) {
        return getResources().getString(i);
    }

    /* renamed from: a */
    public static void m152486a(GuidePageActivity guidePageActivity, Context context) {
        guidePageActivity.mo141540a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(guidePageActivity);
        }
    }

    /* renamed from: a */
    public static Context m152484a(GuidePageActivity guidePageActivity, Configuration configuration) {
        Context a = guidePageActivity.mo141537a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
