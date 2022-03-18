package com.bytedance.ee.bear.guide.option;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.contract.AbstractC5233x;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.guide.option.C7816a;
import com.bytedance.ee.bear.guide.option.UserPropertiesData;
import com.bytedance.ee.bear.guide.p395a.C7810a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OptionResearchActivity extends BaseActivity {

    /* renamed from: a */
    private AbstractC5233x f21108a;

    /* renamed from: b */
    private TextView f21109b;

    /* renamed from: c */
    private Button f21110c;

    /* renamed from: d */
    private C7816a f21111d;

    /* renamed from: e */
    private List<OptionEntity> f21112e = new ArrayList();

    /* renamed from: f */
    private int f21113f;

    /* renamed from: g */
    private int f21114g = 1;

    /* renamed from: h */
    private QuestionnaireEnum[] f21115h = {QuestionnaireEnum.SceneQuestionnaire, QuestionnaireEnum.UsedProductQuestionnaire, QuestionnaireEnum.ChannelQuestionnaire};

    /* renamed from: i */
    private boolean f21116i;

    /* renamed from: a */
    public Context mo30568a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo30569a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo30570a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m31314a(this, context);
    }

    /* renamed from: b */
    public void mo30571b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo30572c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m31311a(this, configuration);
    }

    public AssetManager getAssets() {
        return m31321c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m31312a(this);
    }

    @Override // androidx.activity.ComponentActivity, com.bytedance.ee.bear.facade.common.BaseCommonActivity
    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m31320b(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        setContentView(R.layout.activity_option_research);
        this.f21108a = C5234y.m21391b();
        m31323e();
        m31322d();
        m31325g();
    }

    /* renamed from: j */
    private void m31328j() {
        setResult(-1, new Intent());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m31329k() {
        if (this.f21116i) {
            this.f21111d.notifyDataSetChanged();
            this.f21116i = false;
        }
    }

    public void finish() {
        m31328j();
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: f */
    private QuestionnaireEnum m31324f() {
        QuestionnaireEnum[] questionnaireEnumArr = this.f21115h;
        for (QuestionnaireEnum questionnaireEnum : questionnaireEnumArr) {
            if (questionnaireEnum.pageNum == this.f21114g) {
                return questionnaireEnum;
            }
        }
        return null;
    }

    /* renamed from: i */
    private void m31327i() {
        findViewById(R.id.content_view).setVisibility(8);
        findViewById(R.id.loading_view).setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.guide.option.OptionResearchActivity$1 */
    public static /* synthetic */ class C78151 {

        /* renamed from: a */
        static final /* synthetic */ int[] f21117a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.ee.bear.guide.option.QuestionnaireEnum[] r0 = com.bytedance.ee.bear.guide.option.QuestionnaireEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.guide.option.OptionResearchActivity.C78151.f21117a = r0
                com.bytedance.ee.bear.guide.option.QuestionnaireEnum r1 = com.bytedance.ee.bear.guide.option.QuestionnaireEnum.SceneQuestionnaire     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.guide.option.OptionResearchActivity.C78151.f21117a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.guide.option.QuestionnaireEnum r1 = com.bytedance.ee.bear.guide.option.QuestionnaireEnum.UsedProductQuestionnaire     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.ee.bear.guide.option.OptionResearchActivity.C78151.f21117a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.ee.bear.guide.option.QuestionnaireEnum r1 = com.bytedance.ee.bear.guide.option.QuestionnaireEnum.ChannelQuestionnaire     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.guide.option.OptionResearchActivity.C78151.<clinit>():void");
        }
    }

    /* renamed from: d */
    private void m31322d() {
        int i;
        if (C7820c.f21129a) {
            i = 3;
        } else {
            i = 1;
        }
        this.f21113f = i;
        C13479a.m54764b("OptionResearchActivity", "initQuestionnaireCount()... count = " + this.f21113f);
    }

    /* renamed from: g */
    private void m31325g() {
        QuestionnaireEnum f = m31324f();
        if (f != null) {
            this.f21112e.clear();
            this.f21112e.addAll(f.optionList);
            this.f21111d.mo30587a(f.mutuallyExclusiveOptionKey);
            m31326h();
            this.f21116i = true;
            this.f21109b.setText(f.titleRes);
        }
    }

    /* renamed from: h */
    private void m31326h() {
        int i;
        Button button = this.f21110c;
        if (this.f21114g < this.f21113f) {
            i = R.string.FeishuDocs_Survey_Next_Button;
        } else {
            i = R.string.Onboarding_SelectOptions_Done;
        }
        button.setText(i);
        for (OptionEntity optionEntity : this.f21112e) {
            if (optionEntity.isChecked()) {
                this.f21110c.setEnabled(true);
                return;
            }
        }
        this.f21110c.setEnabled(false);
    }

    /* renamed from: e */
    private void m31323e() {
        this.f21109b = (TextView) findViewById(R.id.title);
        ((TextView) findViewById(R.id.skip)).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.guide.option.$$Lambda$OptionResearchActivity$Mmd6gHwIEG0HsZqiQ7uW_iILqhs */

            public final void onClick(View view) {
                OptionResearchActivity.lambda$Mmd6gHwIEG0HsZqiQ7uW_iILqhs(OptionResearchActivity.this, view);
            }
        });
        Button button = (Button) findViewById(R.id.confirm_btn);
        this.f21110c = button;
        button.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.guide.option.$$Lambda$OptionResearchActivity$rzXaUVz5_Tzxm5yDRCuxBcxJlN8 */

            public final void onClick(View view) {
                OptionResearchActivity.lambda$rzXaUVz5_Tzxm5yDRCuxBcxJlN8(OptionResearchActivity.this, view);
            }
        });
        m31326h();
        C7816a aVar = new C7816a();
        this.f21111d = aVar;
        aVar.mo30588a(this.f21112e);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new C7819b());
        recyclerView.setAdapter(this.f21111d);
        this.f21111d.mo30585a(new C7816a.AbstractC7817a() {
            /* class com.bytedance.ee.bear.guide.option.$$Lambda$OptionResearchActivity$Rd8n4FPlwj41WiG3dNsysy3ZUkk */

            @Override // com.bytedance.ee.bear.guide.option.C7816a.AbstractC7817a
            public final void onSelectItem(String str, boolean z) {
                OptionResearchActivity.lambda$Rd8n4FPlwj41WiG3dNsysy3ZUkk(OptionResearchActivity.this, str, z);
            }
        });
        findViewById(R.id.rv_container).getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.bytedance.ee.bear.guide.option.$$Lambda$OptionResearchActivity$Z3bTBrBaYU4SV3ci1c_mxC9Wi5Y */

            public final void onGlobalLayout() {
                OptionResearchActivity.lambda$Z3bTBrBaYU4SV3ci1c_mxC9Wi5Y(OptionResearchActivity.this);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m31319b(View view) {
        m31327i();
        C7820c.m31345a();
        m31318a(true);
    }

    /* renamed from: a */
    public static Resources m31312a(OptionResearchActivity optionResearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(optionResearchActivity);
        }
        return optionResearchActivity.mo30569a();
    }

    /* renamed from: c */
    public static AssetManager m31321c(OptionResearchActivity optionResearchActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(optionResearchActivity);
        }
        return optionResearchActivity.mo30572c();
    }

    /* renamed from: b */
    public static void m31320b(OptionResearchActivity optionResearchActivity) {
        optionResearchActivity.mo30571b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            OptionResearchActivity optionResearchActivity2 = optionResearchActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    optionResearchActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31313a(View view) {
        m31318a(false);
        int i = this.f21114g;
        if (i < this.f21113f) {
            this.f21114g = i + 1;
            m31325g();
            return;
        }
        m31327i();
        C7820c.m31345a();
    }

    /* renamed from: a */
    private void m31318a(boolean z) {
        UserPropertiesData.OnBoardingData onBoardingData;
        QuestionnaireEnum f = m31324f();
        if (f != null) {
            HashMap hashMap = new HashMap();
            boolean z2 = true;
            if (!z) {
                ArrayList arrayList = new ArrayList();
                for (OptionEntity optionEntity : this.f21112e) {
                    hashMap.put(optionEntity.getKey(), Boolean.valueOf(optionEntity.isChecked()));
                    if (optionEntity.isChecked()) {
                        arrayList.add(optionEntity.getKey());
                    }
                }
                C7810a.m31294a(this.f21108a, f.optionStep, arrayList);
            } else {
                hashMap.put("skip", true);
                C7810a.m31292a(this.f21108a, f.optionStep);
            }
            int i = C78151.f21117a[f.ordinal()];
            if (i == 1) {
                onBoardingData = new UserPropertiesData.SceneData(hashMap);
            } else if (i == 2) {
                onBoardingData = new UserPropertiesData.UsedProductData(hashMap);
            } else if (i == 3) {
                onBoardingData = new UserPropertiesData.ChannelData(hashMap);
            } else {
                return;
            }
            if (!z && f.pageNum != this.f21113f) {
                z2 = false;
            }
            C7820c.m31343a(onBoardingData).mo238001b(new Consumer(f, z2) {
                /* class com.bytedance.ee.bear.guide.option.$$Lambda$OptionResearchActivity$JO6supnzbvKtwn3VAA348cAR64 */
                public final /* synthetic */ QuestionnaireEnum f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OptionResearchActivity.m269526lambda$JO6supnzbvKtwn3VAA348cAR64(OptionResearchActivity.this, this.f$1, this.f$2, (Boolean) obj);
                }
            }, new Consumer(f, z2) {
                /* class com.bytedance.ee.bear.guide.option.$$Lambda$OptionResearchActivity$wQ3TC4YW0l6OF89OrezBBVOIpWU */
                public final /* synthetic */ QuestionnaireEnum f$1;
                public final /* synthetic */ boolean f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    OptionResearchActivity.lambda$wQ3TC4YW0l6OF89OrezBBVOIpWU(OptionResearchActivity.this, this.f$1, this.f$2, (Throwable) obj);
                }
            });
        }
    }

    /* renamed from: a */
    public static void m31314a(OptionResearchActivity optionResearchActivity, Context context) {
        optionResearchActivity.mo30570a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(optionResearchActivity);
        }
    }

    /* renamed from: a */
    public static Context m31311a(OptionResearchActivity optionResearchActivity, Configuration configuration) {
        Context a = optionResearchActivity.mo30568a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31317a(String str, boolean z) {
        m31326h();
        QuestionnaireEnum f = m31324f();
        if (f != null) {
            if (z) {
                C7810a.m31293a(this.f21108a, f.optionStep, str);
            } else {
                C7810a.m31297b(this.f21108a, f.optionStep, str);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31315a(QuestionnaireEnum questionnaireEnum, boolean z, Boolean bool) throws Exception {
        C13479a.m54764b("OptionResearchActivity", "setUserProperties()... " + questionnaireEnum.optionStep + " result = " + bool);
        if (z) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m31316a(QuestionnaireEnum questionnaireEnum, boolean z, Throwable th) throws Exception {
        C13479a.m54758a("OptionResearchActivity", "setUserProperties()...  " + questionnaireEnum.optionStep + " error : " + th.getMessage());
        if (z) {
            finish();
        }
    }
}
