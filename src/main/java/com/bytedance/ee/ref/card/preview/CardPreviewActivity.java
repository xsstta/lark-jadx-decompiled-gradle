package com.bytedance.ee.ref.card.preview;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.bytedance.ee.ref.card.C13518b;
import com.bytedance.ee.ref.card.meta.CardAppInfo;
import com.bytedance.ee.ref.card.p686a.AbstractC13508d;
import com.bytedance.ee.ref.card.p686a.C13500a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapphost.view.BaseActivity;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public class CardPreviewActivity extends BaseActivity {

    /* renamed from: a */
    private int f35674a;

    /* renamed from: b */
    private String f35675b;

    /* renamed from: c */
    private Button f35676c;

    /* renamed from: d */
    private Button f35677d;

    /* renamed from: e */
    private Button f35678e;

    /* renamed from: f */
    private FrameLayout f35679f;

    /* renamed from: g */
    private C13500a f35680g;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OpenType {
    }

    /* renamed from: a */
    public Context mo50356a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo50358a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m55025a(this, context);
    }

    /* renamed from: c */
    public Resources mo50360c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m55022a(this, configuration);
    }

    /* renamed from: d */
    public void mo50362d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo50363e() {
        return super.getAssets();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m55027c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m55023a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m55026b(this);
    }

    /* renamed from: f */
    private void m55028f() {
        this.f35676c.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.View$OnClickListenerC135601 */

            public void onClick(View view) {
                CardPreviewActivity.this.mo50357a();
            }
        });
        this.f35677d.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.View$OnClickListenerC135612 */

            public void onClick(View view) {
                CardPreviewActivity.this.mo50359b();
            }
        });
        this.f35678e.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.View$OnClickListenerC135623 */

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("sslocal://card?app_id=cli_9e8b73cd563f9107&card_id=card_9e3959fbc3f8900e");
                arrayList.add("sslocal://card?app_id=cli_9e5aedb56a20500e&card_id=card_9e45ebfa24b4d00e");
                C13518b.m54919a(CardPreviewActivity.this, arrayList, new C13518b.AbstractC13520a() {
                    /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.View$OnClickListenerC135623.C135631 */

                    @Override // com.bytedance.ee.ref.card.C13518b.AbstractC13520a
                    /* renamed from: a */
                    public void mo50274a(List<CardAppInfo> list) {
                        if (list != null) {
                            AppBrandLogger.m52830i("card_app_preview", list);
                        }
                    }
                });
            }
        });
    }

    /* renamed from: g */
    private void m55029g() {
        C13500a aVar = new C13500a(this);
        this.f35680g = aVar;
        aVar.mo50253a(this.f35679f);
        this.f35680g.mo50254a(new AbstractC13508d.AbstractC13510b() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.C135644 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50261a() {
                AppBrandLogger.m52830i("card_app_preview", "onLoadSuccess:");
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: b */
            public void mo50263b(String str) {
                AppBrandLogger.m52830i("card_app_preview", "onLoadFailed:");
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: c */
            public void mo50264c(String str) {
                AppBrandLogger.m52830i("card_app_preview", "onReceivedError:");
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50262a(String str) {
                AppBrandLogger.m52830i("card_app_preview", "onPageStart:", str);
            }
        });
        this.f35680g.mo50224a(new AbstractC13508d.AbstractC13509a() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.C135655 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13509a
            /* renamed from: a */
            public void mo50258a(CardAppInfo cardAppInfo) {
                AppBrandLogger.m52830i("card_app_preview", "onGetAppInfoResult...success!", cardAppInfo);
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13509a
            /* renamed from: a */
            public void mo50259a(String str) {
                AppBrandLogger.m52830i("card_app_preview", "onGetCardConfig...success!", str);
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13509a
            /* renamed from: a */
            public void mo50260a(String str, Object... objArr) {
                AppBrandLogger.m52830i("card_app_preview", "onCardInfoError..reason:", str);
            }
        });
        this.f35680g.mo50255a(new AbstractC13508d.AbstractC13511c() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.C135666 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13511c
            /* renamed from: a */
            public void mo50265a(int i, int i2) {
                AppBrandLogger.m52830i("card_app_preview", "width:", Integer.valueOf(i), "height:", Integer.valueOf(i2));
            }
        });
        if (!TextUtils.isEmpty(this.f35675b)) {
            this.f35680g.mo50227a(this.f35675b);
        }
    }

    /* renamed from: b */
    public void mo50359b() {
        C13500a aVar = this.f35680g;
        if (aVar != null) {
            aVar.mo50229c();
        }
        this.f35679f.removeAllViews();
        C13500a aVar2 = new C13500a(this);
        this.f35680g = aVar2;
        aVar2.mo50253a(this.f35679f);
        this.f35680g.mo50254a(new AbstractC13508d.AbstractC13510b() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.C135677 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50261a() {
                AppBrandLogger.m52830i("card_app_preview", "localCard->onLoadSuccess");
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: b */
            public void mo50263b(String str) {
                AppBrandLogger.m52830i("card_app_preview", "localCard->onLoadFailed");
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: c */
            public void mo50264c(String str) {
                AppBrandLogger.m52830i("card_app_preview", "localCard->onReceivedError");
            }

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13510b
            /* renamed from: a */
            public void mo50262a(String str) {
                AppBrandLogger.m52830i("card_app_preview", "localCard->onPageStart:", str);
            }
        });
        this.f35680g.mo50255a(new AbstractC13508d.AbstractC13511c() {
            /* class com.bytedance.ee.ref.card.preview.CardPreviewActivity.C135688 */

            @Override // com.bytedance.ee.ref.card.p686a.AbstractC13508d.AbstractC13511c
            /* renamed from: a */
            public void mo50265a(int i, int i2) {
                AppBrandLogger.m52830i("card_app_preview", "width:", Integer.valueOf(i), "height:", Integer.valueOf(i2));
            }
        });
        this.f35680g.mo50256a(IOUtils.getFromAssetsByte(this, "template.js"));
    }

    /* renamed from: a */
    public void mo50357a() {
        String fromAssets = IOUtils.getFromAssets(this, "template.json");
        AppBrandLogger.m52830i("card_app_preview", "updateCurrentCardData:" + fromAssets);
        if (!TextUtils.isEmpty(fromAssets)) {
            this.f35680g.mo50257b(fromAssets);
        }
    }

    /* renamed from: a */
    public static Resources m55023a(CardPreviewActivity cardPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardPreviewActivity);
        }
        return cardPreviewActivity.mo50360c();
    }

    /* renamed from: c */
    public static AssetManager m55027c(CardPreviewActivity cardPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardPreviewActivity);
        }
        return cardPreviewActivity.mo50363e();
    }

    /* renamed from: b */
    public static void m55026b(CardPreviewActivity cardPreviewActivity) {
        cardPreviewActivity.mo50362d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CardPreviewActivity cardPreviewActivity2 = cardPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    cardPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    private String m55024a(String str) {
        String decode = Uri.decode(str);
        if (decode.startsWith("sslocal://card?")) {
            return decode;
        }
        if (decode.startsWith("sslocal://lynxview?")) {
            return Uri.parse(decode).getQueryParameter("compile_path");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_card_preview_layout);
        this.f35677d = (Button) findViewById(R.id.btn_local);
        this.f35676c = (Button) findViewById(R.id.btn_update);
        this.f35678e = (Button) findViewById(R.id.btn_install);
        this.f35679f = (FrameLayout) findViewById(R.id.container);
        int intExtra = getIntent().getIntExtra("openType", 0);
        this.f35674a = intExtra;
        if (intExtra == 1) {
            AppBrandLogger.m52830i("card_app_preview", "online mode...");
            this.f35677d.setVisibility(8);
            String stringExtra = getIntent().getStringExtra("url");
            this.f35675b = stringExtra;
            String a = m55024a(stringExtra);
            this.f35675b = a;
            AppBrandLogger.m52830i("card_app_preview", "preview url:", a);
            m55029g();
        }
        m55028f();
    }

    /* renamed from: a */
    public static void m55025a(CardPreviewActivity cardPreviewActivity, Context context) {
        cardPreviewActivity.mo50358a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(cardPreviewActivity);
        }
    }

    /* renamed from: a */
    public static Context m55022a(CardPreviewActivity cardPreviewActivity, Configuration configuration) {
        Context a = cardPreviewActivity.mo50356a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
