package com.ss.android.lark.profile.v2.entity;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u0000 %2\u00020\u0001:\u0003$%&B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0011R\u001c\u0010!\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u0006'"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/CTA;", "Ljava/io/Serializable;", "()V", "ctaType", "", "getCtaType", "()I", "setCtaType", "(I)V", "denyReason", "getDenyReason", "setDenyReason", "denyReasonDescription", "", "getDenyReasonDescription", "()Ljava/lang/String;", "setDenyReasonDescription", "(Ljava/lang/String;)V", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "iconKey", "getIconKey", "setIconKey", "key", "getKey", "setKey", "name", "getName", "setName", "url", "getUrl", "setUrl", "CTAType", "Companion", "DeniedReason", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CTA implements Serializable {
    public static final Companion Companion = new Companion(null);
    private int ctaType;
    private int denyReason;
    private String denyReasonDescription;
    private boolean enable = true;
    private String iconKey;
    private String key = "";
    private String name;
    private String url;

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/CTA$CTAType;", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface CTAType {
    }

    @Target({ElementType.FIELD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/CTA$DeniedReason;", "", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    public @interface DeniedReason {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/CTA$Companion;", "", "()V", "CTA_TYPE_CHAT", "", "CTA_TYPE_CRYPTO_CHAT", "CTA_TYPE_LINK", "CTA_TYPE_UNKNOWN", "CTA_TYPE_USER_CARD", "CTA_TYPE_VIDEO", "CTA_TYPE_VOICE", "DENIED_REASON_CROSS_TENANT_BLOCKED", "DENIED_REASON_CROSS_TENANT_DENY", "DENIED_REASON_SAME_CRYPTO_CHAT_DENY", "DENIED_REASON_SAME_TENANT_DENY", "DENIED_REASON_UNKNOWN", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.v2.entity.CTA$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final int getCtaType() {
        return this.ctaType;
    }

    public final int getDenyReason() {
        return this.denyReason;
    }

    public final String getDenyReasonDescription() {
        return this.denyReasonDescription;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getIconKey() {
        return this.iconKey;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setCtaType(int i) {
        this.ctaType = i;
    }

    public final void setDenyReason(int i) {
        this.denyReason = i;
    }

    public final void setDenyReasonDescription(String str) {
        this.denyReasonDescription = str;
    }

    public final void setEnable(boolean z) {
        this.enable = z;
    }

    public final void setIconKey(String str) {
        this.iconKey = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.key = str;
    }
}
