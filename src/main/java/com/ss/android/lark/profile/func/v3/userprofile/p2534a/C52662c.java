package com.ss.android.lark.profile.func.v3.userprofile.p2534a;

import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.ss.android.lark.profile.func.v3.userprofile.UserProfileState;
import com.ss.android.lark.profile.func.v3.userprofile.view.CtaView;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\"'\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"binderMap", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CTA$CTAType;", "Lcom/ss/android/lark/profile/func/v3/userprofile/cta/ICtaViewBinder;", "getBinderMap", "()Ljava/util/Map;", "binderMap$delegate", "Lkotlin/Lazy;", "bindCtaInfo", "", "Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView;", "ctaInfo", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$CtaInfo;", "core_profile_profile_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.a.c */
public final class C52662c {

    /* renamed from: a */
    private static final Lazy f130363a = LazyKt.lazy(C52663a.INSTANCE);

    /* renamed from: a */
    private static final Map<GetUserProfileResponse.CTA.CTAType, ICtaViewBinder> m204099a() {
        return (Map) f130363a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CTA$CTAType;", "Lcom/ss/android/lark/profile/func/v3/userprofile/cta/ICtaViewBinder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.a.c$a */
    static final class C52663a extends Lambda implements Function0<Map<GetUserProfileResponse.CTA.CTAType, ? extends ICtaViewBinder>> {
        public static final C52663a INSTANCE = new C52663a();

        C52663a() {
            super(0);
        }

        /* Return type fixed from 'java.util.Map<com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$CTA$CTAType, com.ss.android.lark.profile.func.v3.userprofile.a.d>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Map<GetUserProfileResponse.CTA.CTAType, ? extends ICtaViewBinder> invoke() {
            return MapsKt.mapOf(new Pair(GetUserProfileResponse.CTA.CTAType.CHAT, new ChatCtaViewBinder()), new Pair(GetUserProfileResponse.CTA.CTAType.VIDEO, new CtaViewBinder()), new Pair(GetUserProfileResponse.CTA.CTAType.VOICE, new CtaViewBinder()), new Pair(GetUserProfileResponse.CTA.CTAType.CRYPTO_CHAT, new CtaViewBinder()));
        }
    }

    /* renamed from: a */
    public static final void m204100a(CtaView ctaView, UserProfileState.CtaInfo aVar) {
        Intrinsics.checkParameterIsNotNull(ctaView, "$this$bindCtaInfo");
        Intrinsics.checkParameterIsNotNull(aVar, "ctaInfo");
        ICtaViewBinder dVar = m204099a().get(aVar.mo180066d());
        if (dVar != null) {
            dVar.mo179967a(ctaView, aVar);
        }
    }
}
