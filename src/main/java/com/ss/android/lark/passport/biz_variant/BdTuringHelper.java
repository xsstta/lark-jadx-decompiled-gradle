package com.ss.android.lark.passport.biz_variant;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import com.bytedance.bdturing.AbstractC3526b;
import com.bytedance.bdturing.AbstractC3527c;
import com.bytedance.bdturing.AbstractC3541d;
import com.bytedance.bdturing.BdTuringConfig;
import com.bytedance.bdturing.C3520a;
import com.bytedance.bdturing.setting.ServiceInterceptor;
import com.bytedance.bdturing.verify.request.AbstractRequest;
import com.bytedance.bdturing.verify.request.ImageRequest;
import com.bytedance.bdturing.verify.request.RiskInfoRequest;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.service.ICommonService;
import com.ss.android.lark.passport.infra.service.IDomainService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.infra.util.C49159b;
import com.ss.android.lark.passport.infra.util.C49185d;
import com.ss.android.lark.statistics.Statistics;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3469d.C69094e;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0007J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0006H\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002J\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u001f\u001a\u00020\u0006H\u0002J\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0007J\b\u0010#\u001a\u00020\u0015H\u0002J\u0018\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001aH\u0002J\u0010\u0010$\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u001aH\u0002J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010)\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010*\u001a\u00020\u0015H\u0002J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u0004H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/ss/android/lark/passport/biz_variant/BdTuringHelper;", "", "()V", "CHANNEL_NORMAL", "", "FAKE_INSTALL_ID_MAX", "", "FAKE_INSTALL_ID_MIN", "FEEDBACKBTNCOLOR", "FEEDBACKBTNOPACITY", "FEEDBACKSELECTEDICONCOLOR", "KEY_CHALLENGE_CODE", "KEY_DECISION_CONF", "SDLIDINGSLOTCOLOR", "TAG", "THEME", "TRANSPRENCY", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "generateRandomInstallId", "init", "", "initTheme", "isVa", "", "newRequestByChallengeId", "Lcom/bytedance/bdturing/verify/request/AbstractRequest;", "challengeId", "newRequestByDecision", "riskInfo", "parseHexColor", "res", "processBDTuringResp", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/alibaba/fastjson/JSONObject;", "resetTheme", "showTuringDialog", "activity", "Landroid/app/Activity;", "request", "showTuringDialogByChallengeId", "showTuringDialogByDecision", "turingShowEvent", "turingVerifyResult", "state", "updateConfig", "passport-biz-variant_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.biz_variant.a */
public final class BdTuringHelper {

    /* renamed from: a */
    public static final BdTuringHelper f122933a = new BdTuringHelper();

    /* renamed from: b */
    private static final PassportLog f122934b = PassportLog.f123351c.mo171474a();

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/app/Activity;", "getActivity"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.biz_variant.a$b */
    public static final class C48946b implements AbstractC3541d {

        /* renamed from: a */
        public static final C48946b f122936a = new C48946b();

        C48946b() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/passport/biz_variant/BdTuringHelper$init$config$3", "Lcom/bytedance/bdturing/setting/ServiceInterceptor;", "UpdateServiceUrl", "Lorg/json/JSONObject;", "service", "", "jsonObj", "passport-biz-variant_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.biz_variant.a$c */
    public static final class C48947c implements ServiceInterceptor {
        C48947c() {
        }

        @Override // com.bytedance.bdturing.setting.ServiceInterceptor
        /* renamed from: a */
        public JSONObject mo14394a(String str, JSONObject jSONObject) {
            Object obj;
            Intrinsics.checkParameterIsNotNull(str, "service");
            Intrinsics.checkParameterIsNotNull(jSONObject, "jsonObj");
            if (Intrinsics.areEqual("verify", str)) {
                JSONObject optJSONObject = jSONObject.optJSONObject("host");
                if (optJSONObject != null) {
                    for (Map.Entry<IDomainService.TuringRegion, String> entry : ServiceFinder.m193751f().getTuringHosts().entrySet()) {
                        if (StringsKt.isBlank(entry.getValue())) {
                            BdTuringHelper aVar = BdTuringHelper.f122933a;
                            PassportLog passportLog = BdTuringHelper.f122934b;
                            passportLog.mo171465b("n_action_bdturing", "UpdateServiceUrl, " + entry.getKey() + "'s host is blank");
                        } else {
                            BdTuringHelper aVar2 = BdTuringHelper.f122933a;
                            PassportLog passportLog2 = BdTuringHelper.f122934b;
                            passportLog2.mo171465b("n_action_bdturing", "UpdateServiceUrl, " + entry.getKey() + "'s host is " + entry.getValue());
                            try {
                                Result.Companion aVar3 = Result.Companion;
                                C48947c cVar = this;
                                obj = Result.m271569constructorimpl(optJSONObject.put(entry.getKey().getRegion(), entry.getValue()));
                            } catch (Throwable th) {
                                Result.Companion aVar4 = Result.Companion;
                                obj = Result.m271569constructorimpl(C69097g.m265890a(th));
                            }
                            Throwable r3 = Result.m271572exceptionOrNullimpl(obj);
                            if (r3 != null) {
                                r3.printStackTrace();
                                BdTuringHelper aVar5 = BdTuringHelper.f122933a;
                                PassportLog passportLog3 = BdTuringHelper.f122934b;
                                passportLog3.mo171462a("n_action_bdturing", "UpdateServiceUrl, put " + entry.getKey() + " failed", r3);
                            }
                        }
                    }
                } else {
                    BdTuringHelper aVar6 = BdTuringHelper.f122933a;
                    BdTuringHelper.f122934b.mo171471d("n_action_bdturing", "UpdateServiceUrl, opt host failed");
                }
            }
            return jSONObject;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/passport/biz_variant/BdTuringHelper$initTheme$1", "Landroid/content/ComponentCallbacks2;", "onConfigurationChanged", "", "newConfig", "Landroid/content/res/Configuration;", "onLowMemory", "onTrimMemory", "level", "", "passport-biz-variant_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.biz_variant.a$d */
    public static final class ComponentCallbacks2C48948d implements ComponentCallbacks2 {
        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
        }

        ComponentCallbacks2C48948d() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            Intrinsics.checkParameterIsNotNull(configuration, "newConfig");
            BdTuringHelper.f122933a.mo170954b();
        }
    }

    private BdTuringHelper() {
    }

    /* renamed from: g */
    private final void m192826g() {
        Statistics.sendEvent("passport_turing_show");
    }

    /* renamed from: e */
    private final boolean m192824e() {
        return ServiceFinder.m193748c().isVaUnit();
    }

    /* renamed from: d */
    private final String m192823d() {
        return String.valueOf(C69094e.m265882a(C69094e.m265885a(System.currentTimeMillis()), new IntRange(1, 10000000)));
    }

    /* renamed from: f */
    private final void m192825f() {
        ServiceFinder.m193748c().getApplicationContext().registerComponentCallbacks(new ComponentCallbacks2C48948d());
        mo170954b();
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m192814a() {
        Context applicationContext = ServiceFinder.m193748c().getApplicationContext();
        String valueOf = String.valueOf(ServiceFinder.m193752g().getAppId());
        String b = C49159b.m193852b(applicationContext);
        String a = C49185d.m193926a(applicationContext);
        String buildPackageChannel = ServiceFinder.m193752g().getBuildPackageChannel(applicationContext);
        if (buildPackageChannel == null) {
            buildPackageChannel = "normal";
        }
        C3520a.m14831a().mo14271a(new BdTuringConfig.C3511a().mo14238a(valueOf).mo14240b(b).mo14241c(a).mo14242d(buildPackageChannel).mo14235a(C48945a.f122935a).mo14236a(C48946b.f122936a).mo14237a(new C48947c()).mo14239a(applicationContext));
        f122933a.m192825f();
    }

    /* renamed from: c */
    private final void m192822c() {
        BdTuringConfig.RegionType regionType;
        C3520a a = C3520a.m14831a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BdTuring.getInstance()");
        BdTuringConfig c = a.mo14275c();
        if (c != null) {
            Intrinsics.checkExpressionValueIsNotNull(c, "BdTuring.getInstance().config ?: return");
            if (m192824e()) {
                regionType = BdTuringConfig.RegionType.REGION_USA_EAST;
            } else {
                regionType = BdTuringConfig.RegionType.REGION_CN;
            }
            String installId = ServiceFinder.m193762q().getInstallId();
            if (installId == null) {
                installId = m192823d();
            }
            BdTuringConfig a2 = c.mo14206a(regionType).mo14211b(ServiceFinder.m193762q().getDeviceId()).mo14207a(installId);
            Locale languageSetting = ServiceFinder.m193752g().getLanguageSetting();
            Intrinsics.checkExpressionValueIsNotNull(languageSetting, "ServiceFinder.getIntegra…Service().languageSetting");
            a2.mo14213c(languageSetting.getLanguage());
        }
    }

    /* renamed from: b */
    public final void mo170954b() {
        C3520a a = C3520a.m14831a();
        Intrinsics.checkExpressionValueIsNotNull(a, "BdTuring.getInstance()");
        BdTuringConfig c = a.mo14275c();
        if (c != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            BdTuringHelper aVar = f122933a;
            String c2 = aVar.m192821c(R.color.primary_pri_200);
            if (c2 != null) {
                jSONObject2.put("slidingSlotBgColor", c2);
            }
            String c3 = aVar.m192821c(R.color.primary_pri_500);
            if (c3 != null) {
                jSONObject2.put("feedbackBtnBgColor", c3);
            }
            jSONObject2.put("feedbackBtnBgOpacity", "0.34");
            String c4 = aVar.m192821c(R.color.primary_pri_500);
            if (c4 != null) {
                jSONObject2.put("feedbackOnSelectedIconColor", c4);
            }
            jSONObject.put("theme", jSONObject2);
            c.mo14208a(jSONObject, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/passport/biz_variant/BdTuringHelper$showTuringDialog$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Landroid/app/Activity;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "activity", "passport-biz-variant_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.biz_variant.a$e */
    public static final class C48949e implements IGetDataCallback<Activity> {

        /* renamed from: a */
        final /* synthetic */ AbstractRequest f122937a;

        C48949e(AbstractRequest aVar) {
            this.f122937a = aVar;
        }

        /* renamed from: a */
        public void onSuccess(Activity activity) {
            if (activity != null) {
                BdTuringHelper.f122933a.mo170953a(activity, this.f122937a);
                return;
            }
            BdTuringHelper aVar = BdTuringHelper.f122933a;
            BdTuringHelper.f122934b.mo171471d("n_action_bdturing", "async get last top activity is null");
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            BdTuringHelper aVar = BdTuringHelper.f122933a;
            BdTuringHelper.f122934b.mo171462a("n_action_bdturing", "async get last top activity failed", errorResult);
        }
    }

    /* renamed from: b */
    private final AbstractRequest m192819b(int i) {
        return new ImageRequest(i);
    }

    /* renamed from: a */
    private final void m192817a(AbstractRequest aVar) {
        Activity topActivity = ServiceFinder.m193748c().getTopActivity();
        if (topActivity != null) {
            mo170953a(topActivity, aVar);
        } else {
            ServiceFinder.m193752g().getLastTopActivity(new C48949e(aVar));
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m192815a(int i) {
        PassportLog passportLog = f122934b;
        passportLog.mo171465b("n_action_bdturing", "show turing dialog by challenge id, challengeId: " + i);
        BdTuringHelper aVar = f122933a;
        aVar.m192817a(aVar.m192819b(i));
    }

    /* renamed from: c */
    private final AbstractRequest m192820c(String str) {
        boolean z;
        String str2 = str;
        if (str2 == null || StringsKt.isBlank(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new RiskInfoRequest(str);
        }
        f122934b.mo171471d("n_action_bdturing", "newRequestByDecision get empty risk info");
        return null;
    }

    /* renamed from: b */
    public final void mo170955b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result_value", str);
            Statistics.sendEvent("turing_verify_result", jSONObject);
        } catch (Throwable th) {
            PassportLog passportLog = f122934b;
            passportLog.mo171471d("n_action_bdturing", "turingVerifyResult " + th.getMessage());
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m192816a(com.alibaba.fastjson.JSONObject jSONObject) {
        boolean z;
        if (jSONObject != null) {
            boolean containsKey = jSONObject.containsKey(ShareHitPoint.f121869d);
            int intValue = jSONObject.getIntValue(ShareHitPoint.f121869d);
            String string = jSONObject.getString("decision");
            String str = string;
            if (str == null || StringsKt.isBlank(str)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                m192818a(string);
            } else if (containsKey) {
                m192815a(intValue);
            } else {
                PassportLog passportLog = f122934b;
                passportLog.mo171471d("n_action_bdturing", "decision is empty and no challenge code, data keys: " + jSONObject.keySet());
            }
        } else {
            f122934b.mo171471d("n_action_bdturing", "bdturing resp data is null");
        }
    }

    /* renamed from: c */
    private final String m192821c(int i) {
        Activity activity;
        Object obj;
        Activity topActivity = ServiceFinder.m193748c().getTopActivity();
        if (topActivity != null) {
            activity = topActivity;
        } else {
            activity = ServiceFinder.m193748c().getApplicationContext();
        }
        try {
            Result.Companion aVar = Result.Companion;
            BdTuringHelper aVar2 = this;
            obj = Result.m271569constructorimpl(Integer.valueOf(UDColorUtils.getColor(activity, i)));
        } catch (Throwable th) {
            Result.Companion aVar3 = Result.Companion;
            obj = Result.m271569constructorimpl(C69097g.m265890a(th));
        }
        if (Result.m271575isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(Color.red(intValue))}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format, "java.lang.String.format(this, *args)");
        sb.append(format);
        String format2 = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(Color.green(intValue))}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format2, "java.lang.String.format(this, *args)");
        sb.append(format2);
        String format3 = String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(Color.blue(intValue))}, 1));
        Intrinsics.checkExpressionValueIsNotNull(format3, "java.lang.String.format(this, *args)");
        sb.append(format3);
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m192818a(String str) {
        boolean z;
        PassportLog passportLog = f122934b;
        StringBuilder sb = new StringBuilder();
        sb.append("show turing dialog by decision, is risk info empty? ");
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        passportLog.mo171465b("n_action_bdturing", sb.toString());
        BdTuringHelper aVar = f122933a;
        AbstractRequest c = aVar.m192820c(str);
        if (c != null) {
            aVar.m192817a(c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/passport/biz_variant/BdTuringHelper$showTuringDialog$2", "Lcom/bytedance/bdturing/BdTuringCallback;", "onFail", "", "result", "", "extras", "Lorg/json/JSONObject;", "onSuccess", "passport-biz-variant_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.biz_variant.a$f */
    public static final class C48950f implements AbstractC3526b {

        /* renamed from: a */
        final /* synthetic */ Activity f122938a;

        /* renamed from: b */
        final /* synthetic */ C3520a f122939b;

        C48950f(Activity activity, C3520a aVar) {
            this.f122938a = activity;
            this.f122939b = aVar;
        }

        @Override // com.bytedance.bdturing.AbstractC3526b
        /* renamed from: a */
        public void mo14293a(int i, JSONObject jSONObject) {
            BdTuringHelper aVar = BdTuringHelper.f122933a;
            PassportLog passportLog = BdTuringHelper.f122934b;
            passportLog.mo171465b("n_action_bdturing", "verify failed, code: " + i);
            BdTuringHelper.f122933a.mo170955b("fail");
            if (!this.f122938a.isFinishing() && !this.f122938a.isDestroyed()) {
                this.f122939b.mo14274b();
            }
        }

        @Override // com.bytedance.bdturing.AbstractC3526b
        /* renamed from: b */
        public void mo14294b(int i, JSONObject jSONObject) {
            BdTuringHelper aVar = BdTuringHelper.f122933a;
            PassportLog passportLog = BdTuringHelper.f122934b;
            passportLog.mo171465b("n_action_bdturing", "verify success, code: " + i);
            BdTuringHelper.f122933a.mo170955b("succ");
            if (!this.f122938a.isFinishing() && !this.f122938a.isDestroyed()) {
                this.f122939b.mo14274b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "event", "", "kotlin.jvm.PlatformType", "params", "Lorg/json/JSONObject;", "onEvent"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.biz_variant.a$a */
    public static final class C48945a implements AbstractC3527c {

        /* renamed from: a */
        public static final C48945a f122935a = new C48945a();

        C48945a() {
        }

        @Override // com.bytedance.bdturing.AbstractC3527c
        /* renamed from: a */
        public final void mo14301a(String str, JSONObject jSONObject) {
            ICommonService c = ServiceFinder.m193748c();
            Intrinsics.checkExpressionValueIsNotNull(str, "event");
            c.onAppLogEventV3(str, jSONObject);
        }
    }

    /* renamed from: a */
    public final void mo170953a(Activity activity, AbstractRequest aVar) {
        m192826g();
        m192822c();
        C3520a a = C3520a.m14831a();
        a.mo14272a(activity, aVar, new C48950f(activity, a));
    }
}
