package com.ss.android.vc.applink.openplatfrom;

import android.text.TextUtils;
import com.ss.android.vc.VideoChatModule;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dto.VCLaunchError;
import com.ss.android.vc.entity.response.ReservationInfoEntity;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.service.IVideoChatService;
import com.ss.android.vc.service.VideoChatCalleeType;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¨\u0006\u000f"}, d2 = {"Lcom/ss/android/vc/applink/openplatfrom/ReservationCallManager;", "", "()V", "callRemoteUser", "", "reservationCallInfo", "Lcom/ss/android/vc/entity/response/ReservationInfoEntity;", "isVoiceOnly", "", "getReservationCallInfo", "id", "", "callback", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.c.a.a */
public final class ReservationCallManager {

    /* renamed from: a */
    public static final Lazy f151818a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C60689b.INSTANCE);

    /* renamed from: b */
    public static final Companion f151819b = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/vc/applink/openplatfrom/ReservationCallManager$Companion;", "", "()V", "TAG", "", "instance", "Lcom/ss/android/vc/applink/openplatfrom/ReservationCallManager;", "getInstance", "()Lcom/ss/android/vc/applink/openplatfrom/ReservationCallManager;", "instance$delegate", "Lkotlin/Lazy;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.c.a.a$a */
    public static final class Companion {
        /* renamed from: a */
        public final ReservationCallManager mo208263a() {
            Lazy lazy = ReservationCallManager.f151818a;
            Companion aVar = ReservationCallManager.f151819b;
            return (ReservationCallManager) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/vc/applink/openplatfrom/ReservationCallManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.c.a.a$b */
    static final class C60689b extends Lambda implements Function0<ReservationCallManager> {
        public static final C60689b INSTANCE = new C60689b();

        C60689b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ReservationCallManager invoke() {
            return new ReservationCallManager();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "error", "Lcom/ss/android/vc/dto/VCLaunchError;", "kotlin.jvm.PlatformType", "onError"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.c.a.a$c */
    public static final class C60690c implements IVideoChatService.AbstractC63626a {

        /* renamed from: a */
        public static final C60690c f151820a = new C60690c();

        C60690c() {
        }

        @Override // com.ss.android.vc.service.IVideoChatService.AbstractC63626a
        public final void onError(VCLaunchError vCLaunchError) {
            C60700b.m235851b("ReservationCallManager@", "[callRemoteUser]", "onError: " + vCLaunchError);
        }
    }

    /* renamed from: a */
    public final void mo208261a(ReservationInfoEntity reservationInfoEntity, boolean z) {
        Intrinsics.checkParameterIsNotNull(reservationInfoEntity, "reservationCallInfo");
        VideoChatModule.getVideoChatService().mo220076a(VideoChatCalleeType.RESERVATION_PSTN_SIP, null, reservationInfoEntity, null, "openplatform_1v1", false, z, C60690c.f151820a);
    }

    /* renamed from: a */
    public final void mo208262a(String str, AbstractC63598b<ReservationInfoEntity> bVar) {
        C60700b.m235851b("ReservationCallManager@", "[getReservationCallInfo]", "get info");
        if (!TextUtils.isEmpty(str)) {
            VcBizSender.m249271e(str, bVar);
        }
    }
}
