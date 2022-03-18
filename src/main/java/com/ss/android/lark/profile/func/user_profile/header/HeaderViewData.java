package com.ss.android.lark.profile.func.user_profile.header;

import com.bytedance.lark.pb.contact.v2.GetUserProfileResponse;
import com.ss.android.lark.profile.entity.WorkStatus;
import com.ss.android.lark.profile.func.user_profile.base.BaseViewData;
import com.ss.android.lark.profile.func.user_profile.header.cta.BaseCtaViewData;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 (2\u00020\u0001:\u0002()B\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b¢\u0006\u0002\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010 R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010 R\u0011\u0010\u0015\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010 R\u0011\u0010\u0013\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData;", "Lcom/ss/android/lark/profile/func/user_profile/base/BaseViewData;", "name", "", "avatarKey", "entityId", "tenantName", "ctas", "", "Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "gender", "", "isDoNotDisturbTag", "", "frozen", "workStatus", "Lcom/ss/android/lark/profile/entity/WorkStatus;", "isDemission", "isBlocked", "isTenantCertification", "tenantCertificationUrl", "isHasTenantCertification", "customTagFields", "Lcom/bytedance/lark/pb/contact/v2/GetUserProfileResponse$CustomImage;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IZZLcom/ss/android/lark/profile/entity/WorkStatus;ZZZLjava/lang/String;ZLjava/util/List;)V", "getAvatarKey", "()Ljava/lang/String;", "getCtas", "()Ljava/util/List;", "getCustomTagFields", "getEntityId", "getFrozen", "()Z", "getGender", "()I", "getName", "getTenantCertificationUrl", "getTenantName", "getWorkStatus", "()Lcom/ss/android/lark/profile/entity/WorkStatus;", "Companion", "Gender", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class HeaderViewData extends BaseViewData {

    /* renamed from: a */
    public static final Companion f130162a = new Companion(null);

    /* renamed from: b */
    private final String f130163b;

    /* renamed from: c */
    private final String f130164c;

    /* renamed from: d */
    private final String f130165d;

    /* renamed from: e */
    private final String f130166e;

    /* renamed from: f */
    private final List<BaseCtaViewData> f130167f;

    /* renamed from: g */
    private final int f130168g;

    /* renamed from: h */
    private final boolean f130169h;

    /* renamed from: i */
    private final boolean f130170i;

    /* renamed from: j */
    private final WorkStatus f130171j;

    /* renamed from: k */
    private final boolean f130172k;

    /* renamed from: l */
    private final boolean f130173l;

    /* renamed from: m */
    private final boolean f130174m;

    /* renamed from: n */
    private final String f130175n;

    /* renamed from: o */
    private final boolean f130176o;

    /* renamed from: p */
    private final List<GetUserProfileResponse.CustomImage> f130177p;

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData$Gender;", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface Gender {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/HeaderViewData$Companion;", "", "()V", "GENDER_TYPE_FEMALE", "", "GENDER_TYPE_MALE", "GENDER_TYPE_UNKNOWN", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.HeaderViewData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo179792a() {
        return this.f130163b;
    }

    /* renamed from: b */
    public final String mo179793b() {
        return this.f130164c;
    }

    /* renamed from: c */
    public final String mo179794c() {
        return this.f130165d;
    }

    /* renamed from: e */
    public final String mo179795e() {
        return this.f130166e;
    }

    /* renamed from: f */
    public final List<BaseCtaViewData> mo179796f() {
        return this.f130167f;
    }

    /* renamed from: g */
    public final int mo179797g() {
        return this.f130168g;
    }

    /* renamed from: h */
    public final boolean mo179798h() {
        return this.f130169h;
    }

    /* renamed from: i */
    public final boolean mo179799i() {
        return this.f130170i;
    }

    /* renamed from: j */
    public final WorkStatus mo179800j() {
        return this.f130171j;
    }

    /* renamed from: k */
    public final boolean mo179801k() {
        return this.f130172k;
    }

    /* renamed from: l */
    public final boolean mo179802l() {
        return this.f130173l;
    }

    /* renamed from: m */
    public final boolean mo179803m() {
        return this.f130174m;
    }

    /* renamed from: n */
    public final String mo179804n() {
        return this.f130175n;
    }

    /* renamed from: o */
    public final boolean mo179805o() {
        return this.f130176o;
    }

    /* renamed from: p */
    public final List<GetUserProfileResponse.CustomImage> mo179806p() {
        return this.f130177p;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: java.util.List<? extends com.ss.android.lark.profile.func.user_profile.header.cta.BaseCtaViewData> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HeaderViewData(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.util.List<? extends com.ss.android.lark.profile.func.user_profile.header.cta.BaseCtaViewData> r10, int r11, boolean r12, boolean r13, com.ss.android.lark.profile.entity.WorkStatus r14, boolean r15, boolean r16, boolean r17, java.lang.String r18, boolean r19, java.util.List<com.bytedance.lark.pb.contact.v2.GetUserProfileResponse.CustomImage> r20) {
        /*
            r5 = this;
            r0 = r5
            r1 = r10
            r2 = r20
            java.lang.String r3 = "ctas"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r3)
            java.lang.String r3 = "customTagFields"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            java.lang.Class<com.ss.android.lark.profile.func.user_profile.header.HeaderViewData> r3 = com.ss.android.lark.profile.func.user_profile.header.HeaderViewData.class
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r4 = "HeaderViewData::class.java.simpleName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            r5.<init>(r3)
            r3 = r6
            r0.f130163b = r3
            r3 = r7
            r0.f130164c = r3
            r3 = r8
            r0.f130165d = r3
            r3 = r9
            r0.f130166e = r3
            r0.f130167f = r1
            r1 = r11
            r0.f130168g = r1
            r1 = r12
            r0.f130169h = r1
            r1 = r13
            r0.f130170i = r1
            r1 = r14
            r0.f130171j = r1
            r1 = r15
            r0.f130172k = r1
            r1 = r16
            r0.f130173l = r1
            r1 = r17
            r0.f130174m = r1
            r1 = r18
            r0.f130175n = r1
            r1 = r19
            r0.f130176o = r1
            r0.f130177p = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.profile.func.user_profile.header.HeaderViewData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, int, boolean, boolean, com.ss.android.lark.profile.entity.WorkStatus, boolean, boolean, boolean, java.lang.String, boolean, java.util.List):void");
    }
}
