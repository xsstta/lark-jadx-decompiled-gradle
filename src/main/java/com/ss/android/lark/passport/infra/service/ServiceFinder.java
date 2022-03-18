package com.ss.android.lark.passport.infra.service;

import com.ss.android.lark.passport.signinsdk_api.env.AbstractC49370a;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49390d;
import com.ss.android.lark.passport.signinsdk_api.interfaces.IDeviceService;
import com.ss.android.lark.passport.signinsdk_api.interfaces.ILoginSourceService;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.ttvecamera.p3038g.C60375c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0012\u001a\u0002H\u0013\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u0001H\b¢\u0006\u0002\u0010\u0014J%\u0010\u0012\u001a\u0002H\u0013\"\b\b\u0000\u0010\u0013*\u00020\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u001cH\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0007J\b\u0010\u001f\u001a\u00020 H\u0007J\b\u0010!\u001a\u00020\"H\u0007J\b\u0010#\u001a\u00020$H\u0007J\b\u0010%\u001a\u00020&H\u0007J\b\u0010'\u001a\u00020(H\u0007J\b\u0010)\u001a\u00020*H\u0007J\b\u0010+\u001a\u00020,H\u0007J\b\u0010-\u001a\u00020.H\u0007J\b\u0010/\u001a\u000200H\u0007J\b\u00101\u001a\u000202H\u0007J\b\u00103\u001a\u000204H\u0007J\b\u00105\u001a\u000206H\u0007J\b\u00107\u001a\u000208H\u0007J\b\u00109\u001a\u00020:H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\t8FX\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000e8FX\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011¨\u0006;"}, d2 = {"Lcom/ss/android/lark/passport/infra/service/ServiceFinder;", "", "()V", "foregroundUserService", "Lcom/ss/android/lark/passport/infra/service/IUserService;", "foregroundUserService$annotations", "getForegroundUserService", "()Lcom/ss/android/lark/passport/infra/service/IUserService;", "listenerManagerService", "Lcom/ss/android/lark/passport/infra/service/IListenerManagerService;", "listenerManagerService$annotations", "getListenerManagerService", "()Lcom/ss/android/lark/passport/infra/service/IListenerManagerService;", "userListService", "Lcom/ss/android/lark/passport/infra/service/IUserListService;", "userListService$annotations", "getUserListService", "()Lcom/ss/android/lark/passport/infra/service/IUserListService;", "findService", "T", "()Ljava/lang/Object;", C60375c.f150914a, "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "findUserService", "userId", "", "getCommonService", "Lcom/ss/android/lark/passport/infra/service/ICommonService;", "getCrossEnvService", "Lcom/ss/android/lark/passport/infra/service/ICrossEnvService;", "getDeviceIdService", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IDeviceIdService;", "getDeviceService", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/IDeviceService;", "getDomainService", "Lcom/ss/android/lark/passport/infra/service/IDomainService;", "getEnvService", "Lcom/ss/android/lark/passport/signinsdk_api/env/IEnvService;", "getInitTaskManagerService", "Lcom/ss/android/lark/passport/infra/service/IInitializeTaskManagerService;", "getIntegrateService", "Lcom/ss/android/lark/passport/infra/service/IPassportIntegrateService;", "getKaService", "Lcom/ss/android/lark/passport/infra/service/IKaService;", "getLoginSourceService", "Lcom/ss/android/lark/passport/signinsdk_api/interfaces/ILoginSourceService;", "getLogoutUserService", "Lcom/ss/android/lark/passport/infra/service/ILogoutUserService;", "getMakeUserOfflineService", "Lcom/ss/android/lark/passport/infra/service/IMakeUserOfflineService;", "getMakeUserOnlineService", "Lcom/ss/android/lark/passport/infra/service/IMakeUserOnlineService;", "getSessionInvalidService", "Lcom/ss/android/lark/passport/infra/service/ISessionInvalidService;", "getSwitchUserService", "Lcom/ss/android/lark/passport/infra/service/ISwitchUserService;", "getTenantManageServiceCompat", "Lcom/ss/android/lark/passport/infra/service/ITenantManageServiceCompat;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.service.r */
public final class ServiceFinder {

    /* renamed from: a */
    public static final ServiceFinder f123386a = new ServiceFinder();

    private ServiceFinder() {
    }

    /* renamed from: a */
    public static final IUserListService m193744a() {
        return (IUserListService) m193746a(IUserListService.class);
    }

    /* renamed from: b */
    public static final IListenerManagerService m193747b() {
        return (IListenerManagerService) m193746a(IListenerManagerService.class);
    }

    @JvmStatic
    /* renamed from: c */
    public static final ICommonService m193748c() {
        return (ICommonService) m193746a(ICommonService.class);
    }

    @JvmStatic
    /* renamed from: d */
    public static final AbstractC49370a m193749d() {
        return (AbstractC49370a) m193746a(AbstractC49370a.class);
    }

    /* renamed from: e */
    public static final IUserService m193750e() {
        return m193744a().getForegroundUserService();
    }

    @JvmStatic
    /* renamed from: f */
    public static final IDomainService m193751f() {
        return (IDomainService) m193746a(IDomainService.class);
    }

    @JvmStatic
    /* renamed from: g */
    public static final AbstractC49127k m193752g() {
        return (AbstractC49127k) m193746a(AbstractC49127k.class);
    }

    @JvmStatic
    /* renamed from: h */
    public static final AbstractC49128n m193753h() {
        return (AbstractC49128n) m193746a(AbstractC49128n.class);
    }

    @JvmStatic
    /* renamed from: i */
    public static final AbstractC49129o m193754i() {
        return (AbstractC49129o) m193746a(AbstractC49129o.class);
    }

    @JvmStatic
    /* renamed from: j */
    public static final AbstractC49126j m193755j() {
        return (AbstractC49126j) m193746a(AbstractC49126j.class);
    }

    @JvmStatic
    /* renamed from: k */
    public static final AbstractC49125i m193756k() {
        return (AbstractC49125i) m193746a(AbstractC49125i.class);
    }

    @JvmStatic
    /* renamed from: l */
    public static final ILogoutUserService m193757l() {
        return (ILogoutUserService) m193746a(ILogoutUserService.class);
    }

    @JvmStatic
    /* renamed from: m */
    public static final ISessionInvalidService m193758m() {
        return (ISessionInvalidService) m193746a(ISessionInvalidService.class);
    }

    @JvmStatic
    /* renamed from: n */
    public static final ILoginSourceService m193759n() {
        return (ILoginSourceService) m193746a(ILoginSourceService.class);
    }

    @JvmStatic
    /* renamed from: o */
    public static final AbstractC49124b m193760o() {
        return (AbstractC49124b) m193746a(AbstractC49124b.class);
    }

    @JvmStatic
    /* renamed from: p */
    public static final IDeviceService m193761p() {
        return (IDeviceService) m193746a(IDeviceService.class);
    }

    @JvmStatic
    /* renamed from: q */
    public static final AbstractC49390d m193762q() {
        return (AbstractC49390d) m193746a(AbstractC49390d.class);
    }

    @JvmStatic
    /* renamed from: r */
    public static final IKaService m193763r() {
        return (IKaService) m193746a(IKaService.class);
    }

    @JvmStatic
    /* renamed from: s */
    public static final IInitializeTaskManagerService m193764s() {
        return (IInitializeTaskManagerService) m193746a(IInitializeTaskManagerService.class);
    }

    @JvmStatic
    /* renamed from: a */
    public static final IUserService m193745a(String str) {
        return m193744a().getUserService(str);
    }

    @JvmStatic
    /* renamed from: a */
    public static final <T> T m193746a(Class<T> cls) {
        Intrinsics.checkParameterIsNotNull(cls, C60375c.f150914a);
        T t = (T) ApiUtils.getApi(cls);
        Intrinsics.checkExpressionValueIsNotNull(t, "ApiUtils.getApi(c)");
        return t;
    }
}
