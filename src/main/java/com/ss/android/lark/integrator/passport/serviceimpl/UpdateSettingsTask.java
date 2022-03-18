package com.ss.android.lark.integrator.passport.serviceimpl;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.integrator.passport.serviceimpl.IInitializeTask;
import com.ss.android.lark.passport.infra.service.AbstractC49127k;
import com.ss.android.lark.passport.infra.service.IUserService;
import com.ss.android.lark.passport.infra.service.ServiceFinder;
import com.ss.android.lark.passport.signinsdk_api.account.User;
import com.ss.android.lark.passport.signinsdk_api.entity.DeviceSetting;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.C57859q;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/integrator/passport/serviceimpl/UpdateSettingsTask;", "Lcom/ss/android/lark/integrator/passport/serviceimpl/IInitializeTask;", "()V", "taskName", "", "getTaskName", "()Ljava/lang/String;", "invoke", "", "user", "Lcom/ss/android/lark/passport/signinsdk_api/account/User;", "loadSystemMessageTemplate", "updateTeaAgent", "userId", "uploadLanguageSetting", "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.i */
public final class UpdateSettingsTask implements IInitializeTask {

    /* renamed from: a */
    public static final UpdateSettingsTask f101770a = new UpdateSettingsTask();

    /* renamed from: b */
    private static final String f101771b = f101771b;

    private UpdateSettingsTask() {
    }

    @Override // com.ss.android.lark.integrator.passport.serviceimpl.IInitializeTask
    /* renamed from: a */
    public String mo145307a() {
        return f101771b;
    }

    /* renamed from: c */
    private final void m158679c() {
        ServiceFinder.m193752g().loadSystemMessageTemplates(ServiceFinder.m193752g().getLanguageLocalTag(ServiceFinder.m193752g().getLanguageSetting()), false);
    }

    /* renamed from: b */
    private final void m158677b() {
        Locale languageSetting = ServiceFinder.m193752g().getLanguageSetting();
        String languageLocalTag = ServiceFinder.m193752g().getLanguageLocalTag(languageSetting);
        ServiceFinder.m193761p().putDeviceSetting(ServiceFinder.m193762q().getDeviceId(), languageLocalTag, new C40015a(languageSetting));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/integrator/passport/serviceimpl/UpdateSettingsTask$uploadLanguageSetting$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/passport/signinsdk_api/entity/DeviceSetting;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "passport_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.passport.serviceimpl.i$a */
    public static final class C40015a implements IGetDataCallback<DeviceSetting> {

        /* renamed from: a */
        final /* synthetic */ Locale f101772a;

        C40015a(Locale locale) {
            this.f101772a = locale;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UpdateSettingsTask iVar = UpdateSettingsTask.f101770a;
            IInitializeTask.C40012a.m158654a(iVar, "put languageSetting failed when login successed: " + errorResult, null, 2, null);
        }

        /* renamed from: a */
        public void onSuccess(DeviceSetting deviceSetting) {
            Locale locale = null;
            if (deviceSetting != null) {
                AbstractC49127k g = ServiceFinder.m193752g();
                if (!ServiceFinder.m193752g().isFollowSystemLanguage()) {
                    locale = this.f101772a;
                }
                g.saveLanguageSetting(locale);
                return;
            }
            IInitializeTask.C40012a.m158654a(UpdateSettingsTask.f101770a, "put languageSetting failed when login successed", null, 2, null);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* synthetic */ Unit invoke(User user) {
        mo145321a(user);
        return Unit.INSTANCE;
    }

    /* renamed from: a */
    public void mo145322a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        IInitializeTask.C40012a.m158652a(this, str);
    }

    /* renamed from: b */
    private final void m158678b(String str) {
        String str2;
        User e;
        IUserService a = ServiceFinder.m193745a(str);
        if (a == null || (e = a.mo171597e()) == null || (str2 = e.getTenantId()) == null) {
            IInitializeTask.C40012a.m158654a(f101770a, "update tea agent, cannot find user / user info", null, 2, null);
            str2 = "";
        }
        String a2 = C57859q.m224565a(str);
        String a3 = C57859q.m224565a(str2);
        String deviceId = ServiceFinder.m193762q().getDeviceId();
        RomUtils.C26241a i = RomUtils.m94954i();
        Intrinsics.checkExpressionValueIsNotNull(i, "RomUtils.getRomInfo()");
        String b = i.mo93345b();
        RomUtils.C26241a i2 = RomUtils.m94954i();
        Intrinsics.checkExpressionValueIsNotNull(i2, "RomUtils.getRomInfo()");
        Statistics.resetTeaAgentCustomHeader(a2, deviceId, a3, b, i2.mo93346c());
    }

    /* renamed from: a */
    public void mo145321a(User user) {
        Intrinsics.checkParameterIsNotNull(user, "user");
        m158677b();
        mo145322a("update language setting success");
        m158679c();
        mo145322a("load system message template success");
        String str = user.userId;
        Intrinsics.checkExpressionValueIsNotNull(str, "user.userId");
        m158678b(str);
        mo145322a("update tea agent success");
        ServiceFinder.m193752g().initWaterMark();
        mo145322a("init watermark success");
        ServiceFinder.m193749d().updateStdLark(user.userUnit);
        mo145322a("update std lark success, user unit: " + user.userUnit);
    }

    @Override // com.ss.android.lark.integrator.passport.serviceimpl.IInitializeTask
    /* renamed from: a */
    public void mo145308a(String str, Throwable th) {
        Intrinsics.checkParameterIsNotNull(str, "msg");
        IInitializeTask.C40012a.m158653a(this, str, th);
    }
}
