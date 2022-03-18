package com.ss.android.lark.main.splash;

import android.content.Context;
import android.widget.ImageView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26246a;
import com.larksuite.framework.utils.DeviceUtils;
import com.ss.android.ad.splash.AbstractC27231aa;
import com.ss.android.ad.splash.AbstractC27233b;
import com.ss.android.ad.splash.AbstractC27445f;
import com.ss.android.ad.splash.AbstractC27452l;
import com.ss.android.ad.splash.AbstractC27455o;
import com.ss.android.ad.splash.AbstractC27470u;
import com.ss.android.ad.splash.AbstractC27490x;
import com.ss.android.ad.splash.C27446g;
import com.ss.android.ad.splash.C27453m;
import com.ss.android.ad.splash.C27465r;
import com.ss.android.ad.splash.C27491y;
import com.ss.android.ad.splash.core.p1252g.C27317i;
import com.ss.android.ad.splash.p1243a.C27229a;
import com.ss.android.lark.appsetting.api.SettingManager;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.main.p2231a.AbstractC44136a;
import com.ss.android.lark.main.splash.SplashAdLoadResult;
import com.ss.android.lark.main.statistics.MainHitPointHelper;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.vc.statistics.p3180a.C63690d;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executors;
import kotlin.C69097g;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C69389f;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0011\u0010\u001c\u001a\u00020\u001dH@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/main/splash/SplashAdManagerHolder;", "", "()V", "CHANNEL", "", "DATA", "FEISHU_AID", "FEISHU_APP_NAME", "GA_ID", "LARK_AID", "LARK_APP_NAME", "LOG_TAG", "SPLASH", "isGooglePlay", "", "screenHeight", "", "screenWidth", "clearAndReloadSplashAd", "", "context", "Landroid/content/Context;", "getSplashAdManager", "Lcom/ss/android/ad/splash/SplashAdManager;", "initSplashAdManager", "initSplashAdSdk", "initSplashAdService", "initSplashAdUIConfigurations", "loadAdFromServer", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.splash.b */
public final class SplashAdManagerHolder {

    /* renamed from: a */
    public static final SplashAdManagerHolder f112876a = new SplashAdManagerHolder();

    /* renamed from: b */
    private static final boolean f112877b;

    /* renamed from: c */
    private static int f112878c;

    /* renamed from: d */
    private static int f112879d;

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"loadAdFromServer", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.main.splash.SplashAdManagerHolder", mo239173f = "SplashAdManagerHolder.kt", mo239174i = {0}, mo239175l = {75}, mo239176m = "loadAdFromServer", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.main.splash.b$f */
    public static final class C44521f extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SplashAdManagerHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44521f(SplashAdManagerHolder bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo157977a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J0\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J0\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J0\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/main/splash/SplashAdManagerHolder$initSplashAdManager$2", "Lcom/ss/android/ad/splash/AbsSplashAdLogListener;", C63690d.f160779a, "", "tag", "", "msg", "tr", "", "json", "Lorg/json/JSONObject;", "e", "i", "w", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.b$a */
    public static final class C44514a extends AbstractC27233b {
        C44514a() {
        }

        @Override // com.ss.android.ad.splash.AbstractC27233b
        /* renamed from: a */
        public void mo97114a(String str, String str2, Throwable th, JSONObject jSONObject) {
            Log.m165379d("SplashAd_ManagerHolder_i18n", "tag: " + str + ", msg: " + str2 + ", tr: " + th + ", json: " + jSONObject);
        }

        @Override // com.ss.android.ad.splash.AbstractC27233b
        /* renamed from: b */
        public void mo97115b(String str, String str2, Throwable th, JSONObject jSONObject) {
            Log.m165389i("SplashAd_ManagerHolder_i18n", "tag: " + str + ", msg: " + str2 + ", tr: " + th + ", json: " + jSONObject);
        }

        @Override // com.ss.android.ad.splash.AbstractC27233b
        /* renamed from: c */
        public void mo97116c(String str, String str2, Throwable th, JSONObject jSONObject) {
            Log.m165397w("SplashAd_ManagerHolder_i18n", "tag: " + str + ", msg: " + str2 + ", tr: " + th + ", json: " + jSONObject);
        }

        @Override // com.ss.android.ad.splash.AbstractC27233b
        /* renamed from: d */
        public void mo97117d(String str, String str2, Throwable th, JSONObject jSONObject) {
            Log.m165383e("SplashAd_ManagerHolder_i18n", "tag: " + str + ", msg: " + str2 + ", tr: " + th + ", json: " + jSONObject);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/main/splash/SplashAdManagerHolder$initSplashAdManager$3", "Lcom/ss/android/ad/splash/SplashAdEventListener;", "onEvent", "", "tag", "", "label", "value", "", "ext_value", "extJson", "Lorg/json/JSONObject;", "onV3Event", "v3EventModel", "Lcom/ss/android/ad/splash/event/SplashAdV3EventModel;", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.b$b */
    public static final class C44515b implements AbstractC27452l {
        C44515b() {
        }

        @Override // com.ss.android.ad.splash.AbstractC27452l
        /* renamed from: a */
        public void mo98022a(C27229a aVar) {
            Log.m165389i("SplashAd_ManagerHolder_i18n", "v3 ads are not supported");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
            if (r2.equals("show") != false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
            if (r2.equals("play") != false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
            com.ss.android.lark.main.statistics.MainHitPointHelper.m176666a(r3);
         */
        @Override // com.ss.android.ad.splash.AbstractC27452l
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo98023a(java.lang.String r1, java.lang.String r2, long r3, long r5, org.json.JSONObject r7) {
            /*
            // Method dump skipped, instructions count: 102
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.splash.SplashAdManagerHolder.C44515b.mo98023a(java.lang.String, java.lang.String, long, long, org.json.JSONObject):void");
        }
    }

    private SplashAdManagerHolder() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\n \u000f*\u0004\u0018\u00010\u00030\u0003H\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016¨\u0006\u0017"}, d2 = {"com/ss/android/lark/main/splash/SplashAdManagerHolder$initSplashAdService$initServiceBuilder$1", "Lcom/ss/android/ad/splash/CommonParamsCallBack;", "getAbClient", "", "getAbFeature", "getAbGroup", "getAbVersion", "getAid", "getAppName", "getChannel", "getDeviceId", "getGaid", "getInstallId", "getLanguage", "getManifestVersionCode", "kotlin.jvm.PlatformType", "getOpenUdid", "getUUID", "getUpdateVersionCode", "getUserId", "", "getVersionCode", "getVersionName", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.b$e */
    public static final class C44520e implements AbstractC27445f {

        /* renamed from: a */
        final /* synthetic */ Context f112882a;

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: f */
        public String mo97997f() {
            return "local_test";
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: i */
        public String mo98000i() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: j */
        public String mo98001j() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: k */
        public String mo98002k() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: l */
        public String mo98003l() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: m */
        public long mo98004m() {
            return 0;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: n */
        public String mo98005n() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: o */
        public String mo98006o() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: p */
        public String mo98007p() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: q */
        public String mo98008q() {
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: r */
        public String mo98009r() {
            return "38400000-8cf0-11bd-b23e-10b96e40000d";
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: g */
        public String mo97998g() {
            return C57824f.m224459a(this.f112882a);
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: a */
        public String mo97992a() {
            SplashAdManagerHolder bVar = SplashAdManagerHolder.f112876a;
            if (SplashAdManagerHolder.f112877b) {
                return "1664";
            }
            return "1161";
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: b */
        public String mo97993b() {
            SplashAdManagerHolder bVar = SplashAdManagerHolder.f112876a;
            if (SplashAdManagerHolder.f112877b) {
                return "lark";
            }
            return "feishu";
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: c */
        public String mo97994c() {
            return String.valueOf(C26246a.m94978b(this.f112882a));
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: d */
        public String mo97995d() {
            String a = C26246a.m94977a(this.f112882a);
            Intrinsics.checkExpressionValueIsNotNull(a, "ApkUtil.getAppVersionName(context)");
            return a;
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: e */
        public String mo97996e() {
            return String.valueOf(C57824f.m224468c(this.f112882a));
        }

        @Override // com.ss.android.ad.splash.AbstractC27445f
        /* renamed from: h */
        public String mo97999h() {
            AbstractC44136a a = C44134a.m174959a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
            Locale X = a.mo133204X();
            Intrinsics.checkExpressionValueIsNotNull(X, "MainModule.getDependency().languageSetting");
            String language = X.getLanguage();
            Intrinsics.checkExpressionValueIsNotNull(language, "MainModule.getDependency….languageSetting.language");
            return language;
        }

        C44520e(Context context) {
            this.f112882a = context;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Y\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0017J*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000eH\u0017J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\tH\u0016J8\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001e2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010#\u001a\u0004\u0018\u00010\u00152\u0006\u0010$\u001a\u00020\u000eH\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020\u000eH\u0017R\u001b\u0010\u0002\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006("}, d2 = {"com/ss/android/lark/main/splash/SplashAdManagerHolder$initSplashAdManager$4", "Lcom/ss/android/ad/splash/SplashNetWork;", "mOkHttpClient", "Lokhttp3/OkHttpClient;", "getMOkHttpClient", "()Lokhttp3/OkHttpClient;", "mOkHttpClient$delegate", "Lkotlin/Lazy;", "downloadAdExtra", "", "downloadExtras", "Lcom/ss/android/ad/splash/DownloadExtras;", "downloadFile", "url", "", "localPath", "downloadFileAsync", "", "callback", "Lcom/ss/android/ad/splash/SplashNetWork$SplashAdDownloadAysncCallback;", "loadAdMessage", "Lcom/ss/android/ad/splash/SplashAdResponse;", "preloadUrl", "cacheList", "adStatusList", "preloadMicroApp", "microUrl", "isGame", "sendSplashAckUrl", "requestType", "", "paramMap", "Ljava/util/HashMap;", "contentJson", "Lorg/json/JSONObject;", "sendStockUrl", "stockUrl", "sendTrackUrl", "Lcom/ss/android/ad/splash/core/track/TrackUrlResponse;", "trackUrl", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.b$c */
    public static final class C44516c implements AbstractC27231aa {

        /* renamed from: a */
        private final Lazy f112880a = LazyKt.lazy(C44518b.INSTANCE);

        /* renamed from: a */
        private final OkHttpClient m176630a() {
            return (OkHttpClient) this.f112880a.getValue();
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: a */
        public C27491y mo97107a(String str, int i, HashMap<String, String> hashMap, JSONObject jSONObject) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(jSONObject, "contentJson");
            return null;
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: a */
        public void mo97109a(String str, String str2, C27446g gVar, AbstractC27231aa.AbstractC27232a aVar) {
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(str2, "localPath");
            Intrinsics.checkParameterIsNotNull(gVar, "downloadExtras");
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: a */
        public boolean mo97110a(C27446g gVar) {
            Intrinsics.checkParameterIsNotNull(gVar, "downloadExtras");
            return false;
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: a */
        public boolean mo97112a(String str, boolean z) {
            Intrinsics.checkParameterIsNotNull(str, "microUrl");
            return false;
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: b */
        public C27491y mo97113b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "stockUrl");
            return null;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/OkHttpClient;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.main.splash.b$c$b */
        static final class C44518b extends Lambda implements Function0<OkHttpClient> {
            public static final C44518b INSTANCE = new C44518b();

            C44518b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final OkHttpClient invoke() {
                return new OkHttpClient();
            }
        }

        C44516c() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/main/splash/SplashAdLoadResult;", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
        @DebugMetadata(mo239172c = "com.ss.android.lark.main.splash.SplashAdManagerHolder$initSplashAdManager$4$loadAdMessage$splashAdLoadResult$1", mo239173f = "SplashAdManagerHolder.kt", mo239174i = {0}, mo239175l = {242}, mo239176m = "invokeSuspend", mo239177n = {"$this$runBlocking"}, mo239178s = {"L$0"})
        /* renamed from: com.ss.android.lark.main.splash.b$c$a */
        static final class C44517a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SplashAdLoadResult>, Object> {
            Object L$0;
            int label;
            private CoroutineScope p$;

            C44517a(Continuation cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
                Intrinsics.checkParameterIsNotNull(cVar, "completion");
                C44517a aVar = new C44517a(cVar);
                aVar.p$ = (CoroutineScope) obj;
                return aVar;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope ahVar, Continuation<? super SplashAdLoadResult> cVar) {
                return ((C44517a) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object a = C69086a.m265828a();
                int i = this.label;
                if (i == 0) {
                    C69097g.m265891a(obj);
                    CoroutineScope ahVar = this.p$;
                    SplashAdManagerHolder bVar = SplashAdManagerHolder.f112876a;
                    this.L$0 = ahVar;
                    this.label = 1;
                    obj = bVar.mo157977a(this);
                    if (obj == a) {
                        return a;
                    }
                } else if (i == 1) {
                    CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                    C69097g.m265891a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: a */
        public C27317i mo97106a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "trackUrl");
            try {
                Request build = new Request.Builder().url(str).build();
                if (build == null) {
                    Intrinsics.throwNpe();
                }
                Response execute = m176630a().newCall(build).execute();
                Intrinsics.checkExpressionValueIsNotNull(execute, "mOkHttpClient.newCall(request).execute()");
                return new C27317i.C27318a().mo97376a(execute.code()).mo97377a("ua").mo97378a();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: a */
        public C27491y mo97108a(String str, String str2, String str3) {
            JSONArray jSONArray;
            Intrinsics.checkParameterIsNotNull(str, "preloadUrl");
            boolean z = false;
            MainHitPointHelper.m176663a(0);
            SplashAdLoadResult aVar = (SplashAdLoadResult) C69389f.m266835a(null, new C44517a(null), 1, null);
            try {
                if (aVar instanceof SplashAdLoadResult.SplashAdLoadError) {
                    Log.m165389i("SplashAd_ManagerHolder_i18n", "loadSplashAd failed: ad is null, no ad is used");
                    return null;
                } else if (aVar instanceof SplashAdLoadResult.SplashAdData) {
                    JSONObject jSONObject = new JSONObject(((SplashAdLoadResult.SplashAdData) aVar).mo157969a());
                    StringBuilder sb = new StringBuilder();
                    sb.append("loadSplashAd success, has data = ");
                    JSONObject optJSONObject = jSONObject.optJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                    if (optJSONObject != null) {
                        jSONArray = optJSONObject.optJSONArray("splash");
                    } else {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        z = true;
                    }
                    sb.append(z);
                    sb.append(", data is ");
                    sb.append(jSONObject);
                    Log.m165389i("SplashAd_ManagerHolder_i18n", sb.toString());
                    MainHitPointHelper.m176663a(1);
                    return new C27491y(new C27491y.C27492a().mo98089a(true).mo98088a(jSONObject));
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Exception e) {
                Log.m165389i("SplashAd_ManagerHolder_i18n", "loadSplashAd exception: " + e.getMessage() + ", no ad is used");
                return null;
            }
        }

        @Override // com.ss.android.ad.splash.AbstractC27231aa
        /* renamed from: a */
        public boolean mo97111a(String str, String str2, C27446g gVar) {
            boolean z;
            InputStream inputStream;
            Intrinsics.checkParameterIsNotNull(str, "url");
            Intrinsics.checkParameterIsNotNull(str2, "localPath");
            Intrinsics.checkParameterIsNotNull(gVar, "downloadExtras");
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
            File file = new File(str2);
            if (file.exists()) {
                return true;
            }
            File file2 = new File(str2 + ".tmp");
            Request build = new Request.Builder().url(str).build();
            long currentTimeMillis = System.currentTimeMillis();
            MainHitPointHelper.m176664a(0, 0);
            Response execute = m176630a().newCall(build).execute();
            Intrinsics.checkExpressionValueIsNotNull(execute, "response");
            if (!execute.isSuccessful()) {
                return false;
            }
            MainHitPointHelper.m176664a(1, System.currentTimeMillis() - currentTimeMillis);
            ResponseBody body = execute.body();
            if (body != null) {
                inputStream = body.byteStream();
            } else {
                inputStream = null;
            }
            if (inputStream == null) {
                Intrinsics.throwNpe();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[2048];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            if (file2.renameTo(file)) {
                return true;
            }
            if (file2.exists()) {
                file2.delete();
            }
            return false;
        }
    }

    static {
        AbstractC44136a a = C44134a.m174959a();
        Intrinsics.checkExpressionValueIsNotNull(a, "MainModule.getDependency()");
        f112877b = a.mo133254j();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016J*\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/main/splash/SplashAdManagerHolder$initSplashAdManager$5", "Lcom/ss/android/ad/splash/SplashAdResourceLoader;", "setEncryptSplashAdImageDrawable", "", "splashView", "Landroid/widget/ImageView;", "localPath", "", "imageType", "", "decryptKey", "imageLoadedCallBack", "Lcom/ss/android/ad/splash/SplashAdImageLoadedCallBack;", "setSplashAdImageDrawable", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.splash.b$d */
    public static final class C44519d implements AbstractC27490x {

        /* renamed from: a */
        final /* synthetic */ Context f112881a;

        @Override // com.ss.android.ad.splash.AbstractC27490x
        /* renamed from: a */
        public void mo98085a(ImageView imageView, String str, int i, String str2, AbstractC27455o oVar) {
            Intrinsics.checkParameterIsNotNull(imageView, "splashView");
            Intrinsics.checkParameterIsNotNull(str2, "decryptKey");
            Intrinsics.checkParameterIsNotNull(oVar, "imageLoadedCallBack");
        }

        C44519d(Context context) {
            this.f112881a = context;
        }

        @Override // com.ss.android.ad.splash.AbstractC27490x
        /* renamed from: a */
        public void mo98084a(ImageView imageView, String str, int i, AbstractC27455o oVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(imageView, "splashView");
            Intrinsics.checkParameterIsNotNull(oVar, "imageLoadedCallBack");
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (((long) i) == 1) {
                    Log.m165389i("SplashAd_ManagerHolder_i18n", "gif is not supported");
                    return;
                }
                IRequestCreator load = ImageLoader.with(this.f112881a).load(str);
                SplashAdManagerHolder bVar = SplashAdManagerHolder.f112876a;
                int i2 = SplashAdManagerHolder.f112878c;
                SplashAdManagerHolder bVar2 = SplashAdManagerHolder.f112876a;
                load.override(i2, SplashAdManagerHolder.f112879d).centerCrop().into(imageView);
            }
        }
    }

    /* renamed from: f */
    private final void m176620f(Context context) {
        C27453m.m100201b(context).mo97614b(1).mo97611a(1);
    }

    /* renamed from: b */
    public final AbstractC27470u mo157979b(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        AbstractC27470u a = C27453m.m100199a(context);
        Intrinsics.checkExpressionValueIsNotNull(a, "SplashAdFactory.getSplashAdManager(context)");
        return a;
    }

    @JvmStatic
    /* renamed from: c */
    public static final void m176617c(Context context) {
        if (context != null) {
            C27453m.m100202c(context).mo97612a();
            C27453m.m100199a(context).mo97618e();
            return;
        }
        Log.m165383e("SplashAd_ManagerHolder_i18n", "context is null in clearAndReloadSplashAd");
    }

    /* renamed from: a */
    public final void mo157978a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        f112878c = DeviceUtils.getScreenWidth(context);
        f112879d = DeviceUtils.getScreenHeight(context);
        m176618d(context);
        m176619e(context);
        m176620f(context);
    }

    /* renamed from: e */
    private final void m176619e(Context context) {
        AbstractC27470u a = C27453m.m100199a(context);
        Intrinsics.checkExpressionValueIsNotNull(a, "SplashAdFactory.getSplashAdManager(context)");
        File externalFilesDir = context.getExternalFilesDir(null);
        StringBuilder sb = new StringBuilder();
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
            Intrinsics.checkExpressionValueIsNotNull(externalFilesDir, "context.filesDir");
        }
        sb.append(externalFilesDir.getAbsolutePath());
        sb.append("/splashCache/");
        a.mo97609a(sb.toString(), true).mo97606a(new C44514a()).mo97607a(new C44515b()).mo97605a(new C44516c()).mo97608a(new C44519d(context)).mo97610a(true);
    }

    /* renamed from: d */
    private final void m176618d(Context context) {
        C27465r.C27467a b = new C27465r.C27467a().mo98070a(Executors.newSingleThreadExecutor()).mo98074b(Executors.newSingleThreadExecutor());
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        C27465r.C27467a d = b.mo98075c(coreThreadPool.getCachedThreadPool()).mo98076d(Executors.newFixedThreadPool(5));
        boolean z = true;
        C27465r.C27467a a = d.mo98072a(true).mo98069a(new C44520e(context));
        Intrinsics.checkExpressionValueIsNotNull(a, "SplashAdInitServiceBuild…ng = GA_ID\n            })");
        try {
            String string = SettingManager.getInstance().getString(SplashAdSDKConfig.class);
            Intrinsics.checkExpressionValueIsNotNull(string, "SettingManager.getInstan…hAdSDKConfig::class.java)");
            if (string.length() != 0) {
                z = false;
            }
            if (z) {
                Log.m165389i("SplashAd_ManagerHolder_i18n", "SplashAdSDKConfig is empty");
            } else {
                a.mo98071a(new JSONObject(string));
                Log.m165389i("SplashAd_ManagerHolder_i18n", "parse SplashAdSDKConfig success: " + string);
            }
        } catch (Exception unused) {
            Log.m165383e("SplashAd_ManagerHolder_i18n", "parse SplashAdSDKConfig failed");
        }
        C27453m.m100200a(context, a.mo98073a());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo157977a(kotlin.coroutines.Continuation<? super com.ss.android.lark.main.splash.SplashAdLoadResult> r11) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.main.splash.SplashAdManagerHolder.mo157977a(kotlin.coroutines.c):java.lang.Object");
    }
}
