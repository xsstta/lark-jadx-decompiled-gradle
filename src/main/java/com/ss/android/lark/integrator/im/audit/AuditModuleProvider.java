package com.ss.android.lark.integrator.im.audit;

import android.app.Application;
import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.account_provider.integrator.C28513a;
import com.ss.android.lark.audit.AbstractC29324f;
import com.ss.android.lark.auditsdk.C29385a;
import com.ss.android.lark.auditsdk.IAuditModuleDependency;
import com.ss.android.lark.dynamicconfig.DynamicConfigModule;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.integrator.im.C39603g;
import com.ss.android.lark.integrator.im.dependency.AbstractC39572n;
import com.ss.android.lark.integrator.im.dependency.AbstractC39573p;
import com.ss.android.lark.integrator.im.dependency.AbstractC39579v;
import com.ss.android.lark.larkconfig.export.p2103a.C41152a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceId;
import com.ss.android.lark.passport.signinsdk_api.entity.LoginInfo;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49380b;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49381c;
import com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.C49382d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49389b;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.LarkContext;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/integrator/im/audit/AuditModuleProvider;", "", "()V", "Companion", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.im.b.a */
public class AuditModuleProvider {

    /* renamed from: a */
    public static volatile C29385a f100782a;

    /* renamed from: b */
    public static final ConcurrentHashMap<IAuditModuleDependency.OnAccountChangedListener, AbstractC49379a> f100783b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final Companion f100784c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/integrator/im/audit/AuditModuleProvider$Companion;", "", "()V", "mAccountChangeListenersMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$OnAccountChangedListener;", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/OnUserSwitchListener;", "module", "Lcom/ss/android/lark/auditsdk/AuditModule;", "getModule", "()Lcom/ss/android/lark/auditsdk/AuditModule;", "sModule", "getModuleDependency", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency;", "context", "Landroid/app/Application;", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.im.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u0012\u0010\u001e\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016J\u0012\u0010$\u001a\u00020\u00162\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0005R\u0014\u0010\u000b\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0005R\u0014\u0010\r\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0005R\u0014\u0010\u000f\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0005¨\u0006("}, d2 = {"com/ss/android/lark/integrator/im/audit/AuditModuleProvider$Companion$getModuleDependency$1", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency;", "domain", "", "getDomain", "()Ljava/lang/String;", "isLogin", "", "()Z", "session", "getSession", "tenantId", "getTenantId", "userAgent", "getUserAgent", "userId", "getUserId", "getConfig", "name", "getContext", "Landroid/content/Context;", "getDeviceId", "", "callback", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$IGetDeviceIdCallback;", "getLoginAppId", "", "isFeatureEnable", "featureName", "defaultValue", "registerAccountChangeListener", "onAccountChangeListener", "Lcom/ss/android/lark/audit/IAuditDependency$OnAccountChangeListener;", "registerAccountChangedListener", "listener", "Lcom/ss/android/lark/auditsdk/IAuditModuleDependency$OnAccountChangedListener;", "registerLoginStatusListener", "onLoginStatusListener", "Lcom/ss/android/lark/audit/IAuditDependency$OnLoginStatusListener;", "unRegisterAccountChangedListener", "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.integrator.im.b.a$a$a */
        public static final class C39431a implements IAuditModuleDependency {

            /* renamed from: a */
            final /* synthetic */ Application f100785a;

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: a */
            public Context mo104090a() {
                return this.f100785a;
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: c */
            public String mo104098c() {
                String a = DynamicConfigModule.m145551a(DomainSettings.Alias.SUITE_MAIN_DOMAIN);
                Intrinsics.checkExpressionValueIsNotNull(a, "DynamicConfigModule\n    ….Alias.SUITE_MAIN_DOMAIN)");
                return a;
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: b */
            public int mo104097b() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                return a.getPassportDependency().mo143688s();
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: e */
            public String mo104100e() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39579v passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "IMModule.getDependency().passportDependency");
                String e = passportDependency.mo143674e();
                if (e != null) {
                    return e;
                }
                return "";
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: f */
            public String mo104101f() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39579v passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "IMModule.getDependency().passportDependency");
                String b = passportDependency.mo143668b();
                if (b != null) {
                    return b;
                }
                return "";
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: g */
            public String mo104102g() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39579v passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "IMModule.getDependency().passportDependency");
                String c = passportDependency.mo143672c();
                if (c != null) {
                    return c;
                }
                return "";
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: h */
            public boolean mo104103h() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39579v passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "IMModule.getDependency().passportDependency");
                return passportDependency.mo143667a();
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: d */
            public String mo104099d() {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39572n coreDependency = a.getCoreDependency();
                Intrinsics.checkExpressionValueIsNotNull(coreDependency, "IMModule.getDependency().coreDependency");
                String a2 = C57824f.m224460a(LarkContext.getApplication(), null, coreDependency.mo143609q());
                Intrinsics.checkExpressionValueIsNotNull(a2, "BuildUtils.getLarkUserAg…pendency.languageSetting)");
                return a2;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/im/audit/AuditModuleProvider$Companion$getModuleDependency$1$getDeviceId$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/DeviceId;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.integrator.im.b.a$a$a$a */
            public static final class C39432a implements IGetDataCallback<DeviceId> {

                /* renamed from: a */
                final /* synthetic */ IAuditModuleDependency.IGetDeviceIdCallback f100786a;

                C39432a(IAuditModuleDependency.IGetDeviceIdCallback aVar) {
                    this.f100786a = aVar;
                }

                /* renamed from: a */
                public void onSuccess(DeviceId deviceId) {
                    String str;
                    IAuditModuleDependency.IGetDeviceIdCallback aVar = this.f100786a;
                    if (deviceId != null) {
                        str = deviceId.getDeviceId();
                    } else {
                        str = null;
                    }
                    aVar.mo104104a(str);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Intrinsics.checkParameterIsNotNull(errorResult, "err");
                    this.f100786a.mo104105b(errorResult.getDisplayMsg());
                }
            }

            C39431a(Application application) {
                this.f100785a = application;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/passport/signinsdk_api/feature/listener/user_switch/UserSwitchSuccessContext;", "onUserSwitchSuccess"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.integrator.im.b.a$a$a$c */
            static final class C39434c implements AbstractC49379a {

                /* renamed from: a */
                final /* synthetic */ IAuditModuleDependency.OnAccountChangedListener f100788a;

                C39434c(IAuditModuleDependency.OnAccountChangedListener bVar) {
                    this.f100788a = bVar;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102549a(C49380b bVar) {
                    AbstractC49379a.CC.$default$a(this, bVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                /* renamed from: a */
                public /* synthetic */ void mo102550a(C49381c cVar) {
                    AbstractC49379a.CC.$default$a(this, cVar);
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.feature.listener.user_switch.AbstractC49379a
                public final void onUserSwitchSuccess(C49382d dVar) {
                    Intrinsics.checkParameterIsNotNull(dVar, "it");
                    IAuditModuleDependency.OnAccountChangedListener bVar = this.f100788a;
                    String str = dVar.f123937c.userId;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it.currentActiveUser.userId");
                    bVar.mo104106a(str);
                }
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: a */
            public void mo104093a(AbstractC29324f.AbstractC29328d dVar) {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                a.getPassportDependency().mo143661a(new C39435d(dVar));
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "loginInfo", "Lcom/ss/android/lark/passport/signinsdk_api/entity/LoginInfo;", "kotlin.jvm.PlatformType", "onAccountChange"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.integrator.im.b.a$a$a$b */
            static final class C39433b implements IAccountChangeObserver.AbstractC49385a {

                /* renamed from: a */
                final /* synthetic */ AbstractC29324f.AbstractC29327c f100787a;

                C39433b(AbstractC29324f.AbstractC29327c cVar) {
                    this.f100787a = cVar;
                }

                @Override // com.ss.android.lark.passport.signinsdk_api.interfaces.IAccountChangeObserver.AbstractC49385a
                public final void onAccountChange(LoginInfo loginInfo) {
                    if (this.f100787a != null) {
                        JSONObject jSONObject = null;
                        if (loginInfo != null) {
                            try {
                                jSONObject = new JSONObject(JSON.toJSONString(loginInfo));
                            } catch (JSONException e) {
                                Log.m165384e("AuditModuleProvider", "parse loginInfo failed", e);
                            }
                        }
                        this.f100787a.mo103832a(jSONObject);
                    }
                }
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: a */
            public String mo104091a(String str) {
                Intrinsics.checkParameterIsNotNull(str, "name");
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                C41152a a2 = a.getCoreDependency().mo143409a(str, new C39437c());
                Intrinsics.checkExpressionValueIsNotNull(a2, "IMModule.getDependency()…me, StringConfigParser())");
                String a3 = ((C39436b) a2).mo143322a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "stringConfig.config");
                return a3;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "loginType", "", "onLoginStatusChanged"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.integrator.im.b.a$a$a$d */
            static final class C39435d implements C28513a.AbstractC28514a {

                /* renamed from: a */
                final /* synthetic */ AbstractC29324f.AbstractC29328d f100789a;

                C39435d(AbstractC29324f.AbstractC29328d dVar) {
                    this.f100789a = dVar;
                }

                @Override // com.ss.android.lark.account_provider.integrator.C28513a.AbstractC28514a
                public final void onLoginStatusChanged(int i) {
                    if (this.f100789a != null) {
                        JSONObject jSONObject = null;
                        if (i == 1) {
                            try {
                                AbstractC39573p a = C39603g.m157159a();
                                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                                AbstractC39579v passportDependency = a.getPassportDependency();
                                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "IMModule.getDependency().passportDependency");
                                AbstractC49389b i2 = passportDependency.mo143678i();
                                Intrinsics.checkExpressionValueIsNotNull(i2, "IMModule.getDependency()…Dependency.accountManager");
                                LoginInfo a2 = i2.mo172419a();
                                if (a2 != null) {
                                    jSONObject = new JSONObject(JSON.toJSONString(a2));
                                }
                            } catch (Throwable th) {
                                Log.m165384e("AuditModuleProvider", "parse loginType failed", th);
                            }
                        }
                        this.f100789a.mo103836b(jSONObject);
                    }
                }
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: a */
            public void mo104092a(AbstractC29324f.AbstractC29327c cVar) {
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                AbstractC39579v passportDependency = a.getPassportDependency();
                Intrinsics.checkExpressionValueIsNotNull(passportDependency, "IMModule.getDependency().passportDependency");
                passportDependency.mo143679j().mo172398a(new C39433b(cVar));
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: a */
            public void mo104094a(IAuditModuleDependency.IGetDeviceIdCallback aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "callback");
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                a.getPassportDependency().mo143658a(this.f100785a, new C39432a(aVar));
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: a */
            public void mo104095a(IAuditModuleDependency.OnAccountChangedListener bVar) {
                Intrinsics.checkParameterIsNotNull(bVar, "listener");
                C39434c cVar = new C39434c(bVar);
                AuditModuleProvider.f100783b.put(bVar, cVar);
                AbstractC39573p a = C39603g.m157159a();
                Intrinsics.checkExpressionValueIsNotNull(a, "IMModule.getDependency()");
                a.getPassportDependency().mo143662a(cVar);
            }

            @Override // com.ss.android.lark.auditsdk.IAuditModuleDependency
            /* renamed from: a */
            public boolean mo104096a(String str, boolean z) {
                Intrinsics.checkParameterIsNotNull(str, "featureName");
                return C37239a.m146648b().mo136952a(str, z);
            }
        }

        /* renamed from: a */
        public final C29385a mo143320a() {
            if (AuditModuleProvider.f100782a == null) {
                synchronized (AuditModuleProvider.class) {
                    if (AuditModuleProvider.f100782a == null) {
                        Companion aVar = AuditModuleProvider.f100784c;
                        Application application = LarkContext.getApplication();
                        Intrinsics.checkExpressionValueIsNotNull(application, "LarkContext.getApplication()");
                        AuditModuleProvider.f100782a = new C29385a(aVar.m155720a(application));
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return AuditModuleProvider.f100782a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        private final IAuditModuleDependency m155720a(Application application) {
            return new C39431a(application);
        }
    }
}
