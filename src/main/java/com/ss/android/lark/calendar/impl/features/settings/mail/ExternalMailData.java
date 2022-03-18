package com.ss.android.lark.calendar.impl.features.settings.mail;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\n\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/settings/mail/ExternalMailData;", "Ljava/io/Serializable;", "id", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/calendar/impl/features/settings/mail/MailType;", "email", "enable_calendar", "", "enable_email_attendee_invitation", "has_gmail_scope", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/features/settings/mail/MailType;Ljava/lang/String;ZZZ)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getEnable_calendar", "()Z", "setEnable_calendar", "(Z)V", "getEnable_email_attendee_invitation", "setEnable_email_attendee_invitation", "getHas_gmail_scope", "setHas_gmail_scope", "getId", "setId", "getType", "()Lcom/ss/android/lark/calendar/impl/features/settings/mail/MailType;", "setType", "(Lcom/ss/android/lark/calendar/impl/features/settings/mail/MailType;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ExternalMailData implements Serializable {
    private String email;
    private boolean enable_calendar;
    private boolean enable_email_attendee_invitation;
    private boolean has_gmail_scope;
    private String id;
    private MailType type;

    public static /* synthetic */ ExternalMailData copy$default(ExternalMailData externalMailData, String str, MailType mailType, String str2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalMailData.id;
        }
        if ((i & 2) != 0) {
            mailType = externalMailData.type;
        }
        if ((i & 4) != 0) {
            str2 = externalMailData.email;
        }
        if ((i & 8) != 0) {
            z = externalMailData.enable_calendar;
        }
        if ((i & 16) != 0) {
            z2 = externalMailData.enable_email_attendee_invitation;
        }
        if ((i & 32) != 0) {
            z3 = externalMailData.has_gmail_scope;
        }
        return externalMailData.copy(str, mailType, str2, z, z2, z3);
    }

    public final String component1() {
        return this.id;
    }

    public final MailType component2() {
        return this.type;
    }

    public final String component3() {
        return this.email;
    }

    public final boolean component4() {
        return this.enable_calendar;
    }

    public final boolean component5() {
        return this.enable_email_attendee_invitation;
    }

    public final boolean component6() {
        return this.has_gmail_scope;
    }

    public final ExternalMailData copy(String str, MailType mailType, String str2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(mailType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "email");
        return new ExternalMailData(str, mailType, str2, z, z2, z3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalMailData)) {
            return false;
        }
        ExternalMailData externalMailData = (ExternalMailData) obj;
        return Intrinsics.areEqual(this.id, externalMailData.id) && Intrinsics.areEqual(this.type, externalMailData.type) && Intrinsics.areEqual(this.email, externalMailData.email) && this.enable_calendar == externalMailData.enable_calendar && this.enable_email_attendee_invitation == externalMailData.enable_email_attendee_invitation && this.has_gmail_scope == externalMailData.has_gmail_scope;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        MailType mailType = this.type;
        int hashCode2 = (hashCode + (mailType != null ? mailType.hashCode() : 0)) * 31;
        String str2 = this.email;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.enable_calendar;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.enable_email_attendee_invitation;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.has_gmail_scope;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return i11 + i3;
    }

    public String toString() {
        return "ExternalMailData(id=" + this.id + ", type=" + this.type + ", email=" + this.email + ", enable_calendar=" + this.enable_calendar + ", enable_email_attendee_invitation=" + this.enable_email_attendee_invitation + ", has_gmail_scope=" + this.has_gmail_scope + ")";
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getEnable_calendar() {
        return this.enable_calendar;
    }

    public final boolean getEnable_email_attendee_invitation() {
        return this.enable_email_attendee_invitation;
    }

    public final boolean getHas_gmail_scope() {
        return this.has_gmail_scope;
    }

    public final String getId() {
        return this.id;
    }

    public final MailType getType() {
        return this.type;
    }

    public final void setEnable_calendar(boolean z) {
        this.enable_calendar = z;
    }

    public final void setEnable_email_attendee_invitation(boolean z) {
        this.enable_email_attendee_invitation = z;
    }

    public final void setHas_gmail_scope(boolean z) {
        this.has_gmail_scope = z;
    }

    public final void setEmail(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.email = str;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setType(MailType mailType) {
        Intrinsics.checkParameterIsNotNull(mailType, "<set-?>");
        this.type = mailType;
    }

    public ExternalMailData(String str, MailType mailType, String str2, boolean z, boolean z2, boolean z3) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(mailType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(str2, "email");
        this.id = str;
        this.type = mailType;
        this.email = str2;
        this.enable_calendar = z;
        this.enable_email_attendee_invitation = z2;
        this.has_gmail_scope = z3;
    }
}
