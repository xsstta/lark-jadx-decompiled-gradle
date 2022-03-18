package com.ss.android.lark.profile.func.v3.userprofile.cta;

import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.larksuite.suite.R;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\f\u0010\u0011\u001a\u00020\u0006*\u00020\u0010H\u0015R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048DX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/cta/CtaViewBinder;", "Lcom/ss/android/lark/profile/func/v3/userprofile/cta/ICtaViewBinder;", "()V", "ctaIconMap", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CTA$CTAType;", "", "getCtaIconMap", "()Ljava/util/Map;", "ctaIconMap$delegate", "Lkotlin/Lazy;", "bindCtaView", "", "ctaView", "Lcom/ss/android/lark/profile/func/v3/userprofile/view/CtaView;", "ctaInfo", "Lcom/ss/android/lark/profile/func/v3/userprofile/UserProfileState$CtaInfo;", "getIconResource", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.a.b */
public class CtaViewBinder implements ICtaViewBinder {

    /* renamed from: a */
    private final Lazy f130362a = LazyKt.lazy(C52661a.INSTANCE);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Map<GetUserProfileResponse.CTA.CTAType, Integer> mo179966a() {
        return (Map) this.f130362a.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CTA$CTAType;", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.v3.userprofile.a.b$a */
    static final class C52661a extends Lambda implements Function0<Map<GetUserProfileResponse.CTA.CTAType, ? extends Integer>> {
        public static final C52661a INSTANCE = new C52661a();

        C52661a() {
            super(0);
        }

        /* Return type fixed from 'java.util.Map<com.bytedance.lark.pb.contact.v2.GetUserProfileResponse$CTA$CTAType, java.lang.Integer>' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Map<GetUserProfileResponse.CTA.CTAType, ? extends Integer> invoke() {
            return MapsKt.mapOf(new Pair(GetUserProfileResponse.CTA.CTAType.CHAT, Integer.valueOf((int) R.drawable.ud_icon_chat_filled)), new Pair(GetUserProfileResponse.CTA.CTAType.VOICE, Integer.valueOf((int) R.drawable.ud_icon_call_filled)), new Pair(GetUserProfileResponse.CTA.CTAType.VIDEO, Integer.valueOf((int) R.drawable.ud_icon_video_filled)), new Pair(GetUserProfileResponse.CTA.CTAType.CRYPTO_CHAT, Integer.valueOf((int) R.drawable.ud_icon_chat_secret_filled)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo179965a(UserProfileState.CtaInfo aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$getIconResource");
        Integer num = mo179966a().get(aVar.mo180066d());
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.lark.profile.func.v3.userprofile.cta.ICtaViewBinder
    /* renamed from: a */
    public void mo179967a(CtaView ctaView, UserProfileState.CtaInfo aVar) {
        Intrinsics.checkParameterIsNotNull(ctaView, "ctaView");
        Intrinsics.checkParameterIsNotNull(aVar, "ctaInfo");
        ctaView.setText(aVar.mo180064b());
        int a = mo179965a(aVar);
        if (a != 0) {
            ctaView.setCtaIcon(a);
        }
    }
}
