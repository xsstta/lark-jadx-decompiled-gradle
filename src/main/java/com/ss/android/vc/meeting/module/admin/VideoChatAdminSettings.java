package com.ss.android.vc.meeting.module.admin;

import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.AdminSettings;
import com.ss.android.vc.entity.RTCProxy;
import com.ss.android.vc.entity.response.C60977k;
import com.ss.android.vc.entity.response.C60980n;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0007J\b\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0006H\u0007J\b\u0010\u0016\u001a\u00020\u0006H\u0007J\b\u0010\u0017\u001a\u00020\u0006H\u0007J\b\u0010\u0018\u001a\u00020\u0006H\u0007J\b\u0010\u0019\u001a\u00020\u0006H\u0007J\b\u0010\u001a\u001a\u00020\u0006H\u0007J\b\u0010\u001b\u001a\u00020\u0006H\u0007J\b\u0010\u001c\u001a\u00020\u0006H\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0007J\u001a\u0010\u001d\u001a\u00020\u00122\u0010\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010 \u0018\u00010\u001fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/vc/meeting/module/admin/VideoChatAdminSettings;", "", "()V", "TAG", "", "adminEnableCheckScreenShare", "", "adminMeetingBackgroundOnOff", "adminMeetingBackgroundUploadOnOff", "adminRecordOnOff", "adminSubtitleOnOff", "adminVirtualAvatarOnOff", "canPersonalInstall", "enterprisePhoneAuthorized", "isMyselfAdmin", "proxy", "Lcom/ss/android/vc/entity/RTCProxy;", "getAdminInfo", "", "getAdminRTCProxy", "getEnterprisePhoneConfig", "isAdminCheckScreenShare", "isAdminMeetingBackgroundOnOff", "isAdminMeetingBackgroundUploadOnOff", "isAdminRecordOnOff", "isAdminSubtitleOnOff", "isAdminVirtualAvatarOnOff", "isCanPersonalInstall", "isEnterprisePhoneAuthorized", "updateAdminSettings", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/AdminSettings;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.a.a */
public final class VideoChatAdminSettings {

    /* renamed from: a */
    public static final VideoChatAdminSettings f153920a = new VideoChatAdminSettings();

    /* renamed from: b */
    private static final String f153921b = f153921b;

    /* renamed from: c */
    private static boolean f153922c = true;

    /* renamed from: d */
    private static boolean f153923d = true;

    /* renamed from: e */
    private static boolean f153924e;

    /* renamed from: f */
    private static boolean f153925f;

    /* renamed from: g */
    private static boolean f153926g;

    /* renamed from: h */
    private static boolean f153927h = true;

    /* renamed from: i */
    private static boolean f153928i;

    /* renamed from: j */
    private static boolean f153929j;

    /* renamed from: k */
    private static boolean f153930k;

    /* renamed from: l */
    private static RTCProxy f153931l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/admin/VideoChatAdminSettings$getAdminInfo$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetAdminPermissionInfoEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "adminPermissionInfoEntity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.a.a$a */
    public static final class C61396a implements AbstractC63598b<C60977k> {
        C61396a() {
        }

        /* renamed from: a */
        public void onSuccess(C60977k kVar) {
            Intrinsics.checkParameterIsNotNull(kVar, "adminPermissionInfoEntity");
            VideoChatAdminSettings aVar = VideoChatAdminSettings.f153920a;
            VideoChatAdminSettings.f153930k = kVar.f152695a;
            VideoChatAdminSettings aVar2 = VideoChatAdminSettings.f153920a;
            String str = VideoChatAdminSettings.f153921b;
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess isAdmin = ");
            VideoChatAdminSettings aVar3 = VideoChatAdminSettings.f153920a;
            sb.append(VideoChatAdminSettings.f153930k);
            C60700b.m235851b(str, "[getAdminInfo]", sb.toString());
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            VideoChatAdminSettings aVar = VideoChatAdminSettings.f153920a;
            String str = VideoChatAdminSettings.f153921b;
            C60700b.m235864f(str, "[getAdminInfo]", "onError " + eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/admin/VideoChatAdminSettings$getEnterprisePhoneConfig$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetEnterprisePhoneConfigEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "entity", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.a.a$b */
    public static final class C61397b implements AbstractC63598b<C60980n> {
        C61397b() {
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            VideoChatAdminSettings aVar = VideoChatAdminSettings.f153920a;
            String str = VideoChatAdminSettings.f153921b;
            C60700b.m235864f(str, "[getEnterprisePhoneConfig]", "onError " + eVar);
        }

        /* renamed from: a */
        public void onSuccess(C60980n nVar) {
            Intrinsics.checkParameterIsNotNull(nVar, "entity");
            VideoChatAdminSettings aVar = VideoChatAdminSettings.f153920a;
            VideoChatAdminSettings.f153929j = nVar.f152709a;
            VideoChatAdminSettings aVar2 = VideoChatAdminSettings.f153920a;
            String str = VideoChatAdminSettings.f153921b;
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess enterprisePhoneAuthorized = ");
            VideoChatAdminSettings aVar3 = VideoChatAdminSettings.f153920a;
            sb.append(VideoChatAdminSettings.f153929j);
            C60700b.m235851b(str, "[getEnterprisePhoneConfig]", sb.toString());
        }
    }

    private VideoChatAdminSettings() {
    }

    @JvmStatic
    /* renamed from: j */
    public static final boolean m239431j() {
        return f153928i;
    }

    @JvmStatic
    /* renamed from: k */
    public static final boolean m239432k() {
        return f153927h;
    }

    @JvmStatic
    /* renamed from: l */
    public static final RTCProxy m239433l() {
        return f153931l;
    }

    @JvmStatic
    /* renamed from: c */
    public static final boolean m239411c() {
        return f153929j;
    }

    @JvmStatic
    /* renamed from: d */
    public static final boolean m239414d() {
        return f153922c;
    }

    @JvmStatic
    /* renamed from: e */
    public static final boolean m239417e() {
        return f153923d;
    }

    @JvmStatic
    /* renamed from: f */
    public static final boolean m239420f() {
        return f153924e;
    }

    @JvmStatic
    /* renamed from: h */
    public static final boolean m239426h() {
        return f153926g;
    }

    @JvmStatic
    /* renamed from: i */
    public static final boolean m239429i() {
        return f153930k;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m239402a() {
        VcBizSender.m249256c(new C61396a());
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m239407b() {
        VcBizSender.m249217a(new C61397b());
    }

    @JvmStatic
    /* renamed from: g */
    public static final boolean m239424g() {
        return f153925f;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/admin/VideoChatAdminSettings$updateAdminSettings$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/AdminSettings;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.a.a$c */
    public static final class C61398c implements AbstractC63598b<AdminSettings> {

        /* renamed from: a */
        final /* synthetic */ AbstractC63598b f153932a;

        C61398c(AbstractC63598b bVar) {
            this.f153932a = bVar;
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            AbstractC63598b bVar = this.f153932a;
            if (bVar != null) {
                bVar.onError(eVar);
            }
        }

        /* renamed from: a */
        public void onSuccess(AdminSettings adminSettings) {
            if (adminSettings != null) {
                VideoChatAdminSettings aVar = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153922c = adminSettings.enableRecord;
                VideoChatAdminSettings aVar2 = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153923d = adminSettings.enableSubtitile;
                VideoChatAdminSettings aVar3 = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153924e = adminSettings.enableMeetingBackground;
                VideoChatAdminSettings aVar4 = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153925f = adminSettings.enableCustomMeetingBackground;
                VideoChatAdminSettings aVar5 = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153926g = adminSettings.enableVirtualAvatar;
                VideoChatAdminSettings aVar6 = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153927h = adminSettings.enableCheckScreenShare;
                VideoChatAdminSettings aVar7 = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153928i = adminSettings.canPersonalInstall;
                VideoChatAdminSettings aVar8 = VideoChatAdminSettings.f153920a;
                VideoChatAdminSettings.f153931l = adminSettings.proxy;
                VideoChatAdminSettings aVar9 = VideoChatAdminSettings.f153920a;
                String str = VideoChatAdminSettings.f153921b;
                StringBuilder sb = new StringBuilder();
                sb.append("onSuccess isAdminRecordOnOff ");
                VideoChatAdminSettings aVar10 = VideoChatAdminSettings.f153920a;
                sb.append(VideoChatAdminSettings.f153922c);
                sb.append(" isAdminSubtitleOnOff ");
                VideoChatAdminSettings aVar11 = VideoChatAdminSettings.f153920a;
                sb.append(VideoChatAdminSettings.f153923d);
                sb.append(' ');
                sb.append("background ");
                VideoChatAdminSettings aVar12 = VideoChatAdminSettings.f153920a;
                sb.append(VideoChatAdminSettings.f153924e);
                sb.append(" virtualAvatar ");
                VideoChatAdminSettings aVar13 = VideoChatAdminSettings.f153920a;
                sb.append(VideoChatAdminSettings.f153926g);
                sb.append("checkScreenShare ");
                VideoChatAdminSettings aVar14 = VideoChatAdminSettings.f153920a;
                sb.append(VideoChatAdminSettings.f153927h);
                sb.append(' ');
                sb.append("adminMeetingBackgroundUploadOnOff ");
                VideoChatAdminSettings aVar15 = VideoChatAdminSettings.f153920a;
                sb.append(VideoChatAdminSettings.f153925f);
                C60700b.m235851b(str, "[updateAdminSettings2]", sb.toString());
            }
            AbstractC63598b bVar = this.f153932a;
            if (bVar != null) {
                bVar.onSuccess(adminSettings);
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m239405a(AbstractC63598b<AdminSettings> bVar) {
        C60700b.m235851b(f153921b, "[updateAdminSettings]", "updateAdminSettings");
        VcBizSender.m249290i("").mo219893b(new C61398c(bVar));
    }
}
