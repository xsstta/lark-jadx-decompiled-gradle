package com.bytedance.ee.bear.debug.fgpreview;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.C1382h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.document.security.SecurityUtils;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewActivity;", "Lcom/bytedance/ee/bear/facade/common/BaseActivity;", "()V", "infoProvideService", "Lcom/bytedance/ee/bear/contract/InfoProvideService;", "getInfoProvideService", "()Lcom/bytedance/ee/bear/contract/InfoProvideService;", "buildRequestInfo", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "did", "", "uid", "tenantId", "onDoCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class FGPreviewActivity extends BaseActivity {

    /* renamed from: a */
    public static final Companion f15164a = new Companion(null);

    /* renamed from: b */
    private HashMap f15165b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0011\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewActivity$Companion;", "", "()V", "APP_ID", "", "APP_VERSION_ONLINE", "", "GA_DID", "GA_TENANT_ID", "GA_UID", "NET_CONFIG_URL", "PLATFORM", "RC_DID", "RC_TENANT_ID", "RC_UID", "SDK_VERSION_ONLINE", "TAG", "FGConfigResult", "NetConfigParser", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewActivity$Companion$FGConfigResult;", "Lcom/bytedance/ee/bear/contract/NetService$Result;", "Ljava/util/HashMap;", "", "jsonObj", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getJsonObj", "()Lorg/json/JSONObject;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        public static final class FGConfigResult extends NetService.Result<HashMap<String, String>> {
            private final JSONObject jsonObj;

            public final JSONObject getJsonObj() {
                return this.jsonObj;
            }

            public FGConfigResult(JSONObject jSONObject) {
                this.jsonObj = jSONObject;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewActivity$Companion$NetConfigParser;", "Lcom/bytedance/ee/bear/contract/NetService$Parser;", "Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewActivity$Companion$FGConfigResult;", "()V", "parse", "json", "", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.debug.fgpreview.FGPreviewActivity$Companion$a */
        public static final class NetConfigParser implements NetService.AbstractC5074c<FGConfigResult> {
            /* renamed from: a */
            public FGConfigResult parse(String str) {
                Intrinsics.checkParameterIsNotNull(str, "json");
                HashMap<String, String> hashMap = new HashMap<>();
                JSONObject jSONObject = null;
                try {
                    if (new JSONObject(str).optInt("code") == 0) {
                        jSONObject = new JSONObject(str).optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                        C13479a.m54764b("FGPreviewActivity", "parse: data = " + jSONObject);
                        hashMap = JsonToMapUtil.f15206a.mo21314a(jSONObject);
                    } else {
                        C13479a.m54758a("FGPreviewActivity", "parse: request fail, json = " + str);
                    }
                } catch (JSONException e) {
                    C13479a.m54759a("FGPreviewActivity", "parse: error", e);
                }
                FGConfigResult fGConfigResult = new FGConfigResult(jSONObject);
                fGConfigResult.data = hashMap;
                return fGConfigResult;
            }
        }
    }

    /* renamed from: a */
    public Context mo21280a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo21281a() {
        return super.getResources();
    }

    /* renamed from: a */
    public View mo21282a(int i) {
        if (this.f15165b == null) {
            this.f15165b = new HashMap();
        }
        View view = (View) this.f15165b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15165b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void mo21283a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.bytedance.ee.bear.facade.common.BaseActivity
    public void attachBaseContext(Context context) {
        m21645a(this, context);
    }

    /* renamed from: b */
    public void mo21284b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo21285c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m21642a(this, configuration);
    }

    public AssetManager getAssets() {
        return m21647c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m21643a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m21646b(this);
    }

    /* renamed from: d */
    private final al m21648d() {
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        return d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.FGPreviewActivity$c */
    static final class C5296c<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ FGPreviewActivity f15168a;

        C5296c(FGPreviewActivity fGPreviewActivity) {
            this.f15168a = fGPreviewActivity;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C13742g.m55705a(new Runnable(this) {
                /* class com.bytedance.ee.bear.debug.fgpreview.FGPreviewActivity.C5296c.RunnableC52971 */

                /* renamed from: a */
                final /* synthetic */ C5296c f15169a;

                {
                    this.f15169a = r1;
                }

                public final void run() {
                    Toast.showText(this.f15169a.f15168a, "请求失败了.....", 0);
                }
            });
            C13479a.m54761a("FGPreviewActivity", th);
        }
    }

    /* renamed from: a */
    public static Resources m21643a(FGPreviewActivity fGPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fGPreviewActivity);
        }
        return fGPreviewActivity.mo21281a();
    }

    /* renamed from: c */
    public static AssetManager m21647c(FGPreviewActivity fGPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fGPreviewActivity);
        }
        return fGPreviewActivity.mo21285c();
    }

    /* renamed from: b */
    public static void m21646b(FGPreviewActivity fGPreviewActivity) {
        fGPreviewActivity.mo21284b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            FGPreviewActivity fGPreviewActivity2 = fGPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    fGPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/debug/fgpreview/FGConfigModel;", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.FGPreviewActivity$b */
    static final class C5295b<T> implements Consumer<FGConfigModel> {

        /* renamed from: a */
        final /* synthetic */ FGPreviewActivity f15167a;

        C5295b(FGPreviewActivity fGPreviewActivity) {
            this.f15167a = fGPreviewActivity;
        }

        /* renamed from: a */
        public final void accept(FGConfigModel aVar) {
            Intrinsics.checkExpressionValueIsNotNull(aVar, "it");
            FGPreviewAdapter bVar = new FGPreviewAdapter(aVar);
            RecyclerView recyclerView = (RecyclerView) this.f15167a.mo21282a(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
            recyclerView.setAdapter(bVar);
            ((RecyclerView) this.f15167a.mo21282a(R.id.recyclerView)).addItemDecoration(new C1382h(this.f15167a, 1));
            RecyclerView recyclerView2 = (RecyclerView) this.f15167a.mo21282a(R.id.recyclerView);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "recyclerView");
            recyclerView2.setLayoutManager(new LinearLayoutManager(this.f15167a));
            C13479a.m54772d("FGPreviewActivity", "rc result: " + aVar.mo21303i() + ", ga result: " + aVar.mo21304j());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.BaseActivity
    /* renamed from: a */
    public void mo16851a(Bundle bundle) {
        super.mo16851a(bundle);
        if (!SecurityUtils.m23555a(this, m21648d())) {
            finish();
        }
        setContentView(R.layout.activity_fg_preview);
        NetService netService = (NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null);
        AbstractC68307f.m265092a(netService.mo20117a(new Companion.NetConfigParser()).mo20141a(m21644a("68617655291", "6641719470769307912", "1")), netService.mo20117a(new Companion.NetConfigParser()).mo20141a(m21644a("61893416078", "6650021622726017288", "2")), C5294a.f15166a).mo237985a(C11678b.m48481e()).mo238001b(new C5295b(this), new C5296c(this));
    }

    /* renamed from: a */
    public static void m21645a(FGPreviewActivity fGPreviewActivity, Context context) {
        fGPreviewActivity.mo21283a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(fGPreviewActivity);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/debug/fgpreview/FGConfigModel;", "rcConfig", "Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewActivity$Companion$FGConfigResult;", "gaConfig", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.FGPreviewActivity$a */
    static final class C5294a<T1, T2, R> implements BiFunction<Companion.FGConfigResult, Companion.FGConfigResult, FGConfigModel> {

        /* renamed from: a */
        public static final C5294a f15166a = new C5294a();

        C5294a() {
        }

        /* renamed from: a */
        public final FGConfigModel apply(Companion.FGConfigResult fGConfigResult, Companion.FGConfigResult fGConfigResult2) {
            Intrinsics.checkParameterIsNotNull(fGConfigResult, "rcConfig");
            Intrinsics.checkParameterIsNotNull(fGConfigResult2, "gaConfig");
            JSONObject jsonObj = fGConfigResult.getJsonObj();
            JSONObject jsonObj2 = fGConfigResult2.getJsonObj();
            Serializable serializable = fGConfigResult.data;
            Intrinsics.checkExpressionValueIsNotNull(serializable, "rcConfig.data");
            Serializable serializable2 = fGConfigResult2.data;
            Intrinsics.checkExpressionValueIsNotNull(serializable2, "gaConfig.data");
            return new FGConfigModel(jsonObj, jsonObj2, (HashMap) serializable, (HashMap) serializable2);
        }
    }

    /* renamed from: a */
    public static Context m21642a(FGPreviewActivity fGPreviewActivity, Configuration configuration) {
        Context a = fGPreviewActivity.mo21280a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    private final NetService.C5076e m21644a(String str, String str2, String str3) {
        boolean z;
        String str4;
        al d = C4511g.m18594d();
        Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
        if (d.mo17344E() == 1) {
            z = true;
        } else {
            z = false;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = hashMap;
        hashMap2.put("appId", String.valueOf(2));
        if (z) {
            str4 = "online-1.0";
        } else {
            str4 = "larkDocs-online-v1.0.0";
        }
        hashMap2.put(HiAnalyticsConstant.HaKey.BI_KEY_VERSION, str4);
        hashMap2.put("platform", "android");
        hashMap2.put("device_id", str);
        hashMap2.put("user_id", str2);
        hashMap2.put("tenant_id", str3);
        NetService.C5077f fVar = new NetService.C5077f("/api/appconfig/get/");
        fVar.mo20143a(1);
        fVar.mo20147a(hashMap2);
        C13479a.m54764b("FGPreviewActivity", "buildRequestInfo: " + hashMap);
        return fVar;
    }
}
