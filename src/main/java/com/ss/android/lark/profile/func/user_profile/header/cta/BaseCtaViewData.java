package com.ss.android.lark.profile.func.user_profile.header.cta;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b&\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001a\u001b\u001cB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nR\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData;", "", ShareHitPoint.f121869d, "", "enable", "", "name", "", "denyReason", "denyReasonDes", "(IZLjava/lang/String;ILjava/lang/String;)V", "getDenyReason", "()I", "setDenyReason", "(I)V", "getDenyReasonDes", "()Ljava/lang/String;", "setDenyReasonDes", "(Ljava/lang/String;)V", "getEnable", "()Z", "setEnable", "(Z)V", "getName", "setName", "getType", "Companion", "CtaType", "DeniedReason", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class BaseCtaViewData {

    /* renamed from: a */
    public static final Companion f130196a = new Companion(null);

    /* renamed from: b */
    private final int f130197b;

    /* renamed from: c */
    private boolean f130198c;

    /* renamed from: d */
    private String f130199d;

    /* renamed from: e */
    private int f130200e;

    /* renamed from: f */
    private String f130201f;

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData$CtaType;", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface CtaType {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData$DeniedReason;", "", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface DeniedReason {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/func/user_profile/header/cta/BaseCtaViewData$Companion;", "", "()V", "CTA_TYPE_CHAT", "", "CTA_TYPE_CRYPTO_CHAT", "CTA_TYPE_LINK", "CTA_TYPE_UNKNOWN", "CTA_TYPE_USER_CARD", "CTA_TYPE_VIDEO", "CTA_TYPE_VOICE", "DENIED_REASON_CROSS_TENANT_BLOCKED", "DENIED_REASON_CROSS_TENANT_DENY", "DENIED_REASON_SAME_CRYPTO_CHAT_DENY", "DENIED_REASON_SAME_TENANT_DENY", "DENIED_REASON_UNKNOWN", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.func.user_profile.header.cta.BaseCtaViewData$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo179819a() {
        return this.f130197b;
    }

    /* renamed from: b */
    public final boolean mo179820b() {
        return this.f130198c;
    }

    /* renamed from: c */
    public final int mo179821c() {
        return this.f130200e;
    }

    /* renamed from: d */
    public final String mo179822d() {
        return this.f130201f;
    }

    public BaseCtaViewData(int i, boolean z, String str, int i2, String str2) {
        Intrinsics.checkParameterIsNotNull(str2, "denyReasonDes");
        this.f130197b = i;
        this.f130198c = z;
        this.f130199d = str;
        this.f130200e = i2;
        this.f130201f = str2;
    }
}
