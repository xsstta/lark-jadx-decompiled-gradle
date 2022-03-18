package com.bytedance.ee.larkbrand.utils;

import android.app.Application;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ee.bear.at.AtObject;
import com.bytedance.ee.bear.atfinder.AbstractC4272g;
import com.bytedance.ee.bear.atfinder.AtFinderResult;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.network.larkbrand.net.C12843b;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.bytedance.ee.util.C13596c;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.miniapp.process.p3316a.C66612a;
import com.tt.miniapphost.AbstractC67538f;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.C67432a;
import com.tt.miniapphost.entity.AppInfoEntity;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.p3456d.C68279a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/EditorAtSearchUtil;", "", "appContext", "Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;", "(Lcom/bytedance/ee/lark/infra/sandbox/context/IAppContext;)V", "doSearch", "", "keyWord", "", ShareHitPoint.f121869d, "callback", "Lcom/bytedance/ee/bear/atfinder/OnSearchCallback;", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkbrand.utils.k */
public final class EditorAtSearchUtil {

    /* renamed from: a */
    public static String f35263a;

    /* renamed from: b */
    public static final Companion f35264b = new Companion(null);

    /* renamed from: c */
    private IAppContext f35265c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/larkbrand/utils/EditorAtSearchUtil$Companion;", "", "()V", "PATH", "", "TAG", "language", "getLanguage", "()Ljava/lang/String;", "setLanguage", "(Ljava/lang/String;)V", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.k$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo49663a() {
            return EditorAtSearchUtil.f35263a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        AppbrandContext inst = AppbrandContext.getInst();
        Intrinsics.checkExpressionValueIsNotNull(inst, "AppbrandContext.getInst()");
        Application applicationContext = inst.getApplicationContext();
        Intrinsics.checkExpressionValueIsNotNull(applicationContext, "AppbrandContext.getInst().applicationContext");
        Resources resources = applicationContext.getResources();
        Intrinsics.checkExpressionValueIsNotNull(resources, "AppbrandContext.getInst(…licationContext.resources");
        Locale locale = resources.getConfiguration().locale;
        Intrinsics.checkExpressionValueIsNotNull(locale, "AppbrandContext.getInst(…rces.configuration.locale");
        String language = locale.getLanguage();
        Intrinsics.checkExpressionValueIsNotNull(language, "AppbrandContext.getInst(…iguration.locale.language");
        f35263a = language;
    }

    public EditorAtSearchUtil(IAppContext iAppContext) {
        this.f35265c = iAppContext;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkbrand.utils.k$b */
    static final class C13359b<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC4272g f35266a;

        /* renamed from: b */
        final /* synthetic */ Ref.ObjectRef f35267b;

        C13359b(AbstractC4272g gVar, Ref.ObjectRef objectRef) {
            this.f35266a = gVar;
            this.f35267b = objectRef;
        }

        /* renamed from: a */
        public final void accept(String str) {
            boolean z;
            boolean z2;
            AtFinderResult atFinderResult = new AtFinderResult();
            atFinderResult.list = new ArrayList();
            if (TextUtils.isEmpty(str)) {
                AppBrandLogger.m52829e("EditorMentionSearch", "search result empty");
                this.f35266a.mo16697a(atFinderResult);
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            atFinderResult.keyword = this.f35267b.element;
            String optString = jSONObject.optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            Intrinsics.checkExpressionValueIsNotNull(optString, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (optString.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z || !(!Intrinsics.areEqual(optString, "null"))) {
                AppBrandLogger.m52829e("EditorMentionSearch", "response data empty");
            } else {
                String optString2 = new JSONObject(optString).optString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                Intrinsics.checkExpressionValueIsNotNull(optString2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (optString2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || !(!Intrinsics.areEqual(optString2, "null"))) {
                    AppBrandLogger.m52829e("EditorMentionSearch", "response data empty: " + optString2);
                } else {
                    JSONArray jSONArray = new JSONArray(optString2);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        AtObject atObject = new AtObject();
                        atObject.setType(jSONObject2.optInt(ShareHitPoint.f121869d));
                        atObject.setName(jSONObject2.optString("name"));
                        atObject.setId(jSONObject2.optString("id"));
                        atObject.setToken(jSONObject2.optString("id"));
                        atObject.setCn_name(jSONObject2.optString("cn_name"));
                        atObject.setEn_name(jSONObject2.optString("en_name"));
                        atObject.setAvatar_url(jSONObject2.optString("avatar_url"));
                        atObject.setDepartment(jSONObject2.optString("department"));
                        atObject.setExternal(jSONObject2.optBoolean("is_external"));
                        atObject.setContent(C13596c.m55177a(EditorAtSearchUtil.f35264b.mo49663a(), atObject.getCn_name(), atObject.getEn_name()));
                        atFinderResult.list.add(atObject);
                    }
                }
            }
            this.f35266a.mo16697a(atFinderResult);
        }
    }

    /* renamed from: a */
    public final void mo49662a(String str, String str2, AbstractC4272g gVar) {
        String str3;
        String str4;
        Intrinsics.checkParameterIsNotNull(str, "keyWord");
        Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(gVar, "callback");
        gVar.mo16696a();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        T t = (T) "";
        objectRef.element = t;
        try {
            String optString = new JSONObject(str).optString("keywords");
            Intrinsics.checkExpressionValueIsNotNull(optString, "JSONObject(keyWord).optString(\"keywords\")");
            t = optString;
        } catch (Exception unused) {
        }
        objectRef.element = t;
        JSONObject jSONObject = new JSONObject();
        AbstractC67538f a = C67432a.m262319a(this.f35265c);
        Intrinsics.checkExpressionValueIsNotNull(a, "AppbrandApplication.getInst(appContext)");
        AppInfoEntity appInfo = a.getAppInfo();
        String str5 = null;
        if (appInfo == null || (str4 = appInfo.appId) == null) {
            str3 = null;
        } else {
            str3 = C66612a.m260219a(str4);
        }
        jSONObject.put("keyword", objectRef.element);
        jSONObject.put("session", str3);
        if (appInfo != null) {
            str5 = appInfo.appId;
        }
        jSONObject.put(HiAnalyticsConstant.HaKey.BI_KEY_APPID, str5);
        HashMap hashMap = new HashMap();
        EnvInfo a2 = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a2 != null && !a2.mo148730a() && a2.mo148731b() == 1) {
            hashMap.put("domain_alias", "open");
        }
        C12843b.m53038a(C13047a.C13049b.m53532a() + "/searchPeople", hashMap, jSONObject, this.f35265c).subscribeOn(C68279a.m265023b()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C13359b(gVar, objectRef));
    }
}
