package com.ss.android.vc.meeting.module.reaction.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.entity.ParticipantRole;
import com.ss.android.vc.entity.ParticipantType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010 \u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/entity/VideoChatParticipant;", "", "userId", "", "deviceId", "name", "avatarKey", ShareHitPoint.f121869d, "Lcom/ss/android/vc/entity/ParticipantType;", "role", "Lcom/ss/android/vc/entity/ParticipantRole;", "isBot", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/entity/ParticipantType;Lcom/ss/android/vc/entity/ParticipantRole;Z)V", "getAvatarKey", "()Ljava/lang/String;", "getDeviceId", "()Z", "getName", "getRole", "()Lcom/ss/android/vc/entity/ParticipantRole;", "getType", "()Lcom/ss/android/vc/entity/ParticipantType;", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.entity.e */
public final class VideoChatParticipant {

    /* renamed from: a */
    private final String f158032a;

    /* renamed from: b */
    private final String f158033b;

    /* renamed from: c */
    private final String f158034c;

    /* renamed from: d */
    private final String f158035d;

    /* renamed from: e */
    private final ParticipantType f158036e;

    /* renamed from: f */
    private final ParticipantRole f158037f;

    /* renamed from: g */
    private final boolean f158038g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoChatParticipant)) {
            return false;
        }
        VideoChatParticipant eVar = (VideoChatParticipant) obj;
        return Intrinsics.areEqual(this.f158032a, eVar.f158032a) && Intrinsics.areEqual(this.f158033b, eVar.f158033b) && Intrinsics.areEqual(this.f158034c, eVar.f158034c) && Intrinsics.areEqual(this.f158035d, eVar.f158035d) && Intrinsics.areEqual(this.f158036e, eVar.f158036e) && Intrinsics.areEqual(this.f158037f, eVar.f158037f) && this.f158038g == eVar.f158038g;
    }

    public int hashCode() {
        String str = this.f158032a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f158033b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f158034c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f158035d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ParticipantType participantType = this.f158036e;
        int hashCode5 = (hashCode4 + (participantType != null ? participantType.hashCode() : 0)) * 31;
        ParticipantRole participantRole = this.f158037f;
        if (participantRole != null) {
            i = participantRole.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.f158038g;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "VideoChatParticipant(userId=" + this.f158032a + ", deviceId=" + this.f158033b + ", name=" + this.f158034c + ", avatarKey=" + this.f158035d + ", type=" + this.f158036e + ", role=" + this.f158037f + ", isBot=" + this.f158038g + ")";
    }

    /* renamed from: a */
    public final String mo216940a() {
        return this.f158032a;
    }

    /* renamed from: b */
    public final String mo216941b() {
        return this.f158033b;
    }

    /* renamed from: c */
    public final String mo216942c() {
        return this.f158034c;
    }

    /* renamed from: d */
    public final String mo216943d() {
        return this.f158035d;
    }

    /* renamed from: e */
    public final ParticipantType mo216944e() {
        return this.f158036e;
    }

    /* renamed from: f */
    public final ParticipantRole mo216946f() {
        return this.f158037f;
    }

    /* renamed from: g */
    public final boolean mo216947g() {
        return this.f158038g;
    }

    public VideoChatParticipant(String str, String str2, String str3, String str4, ParticipantType participantType, ParticipantRole participantRole, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "userId");
        Intrinsics.checkParameterIsNotNull(str2, "deviceId");
        Intrinsics.checkParameterIsNotNull(str3, "name");
        Intrinsics.checkParameterIsNotNull(str4, "avatarKey");
        Intrinsics.checkParameterIsNotNull(participantType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(participantRole, "role");
        this.f158032a = str;
        this.f158033b = str2;
        this.f158034c = str3;
        this.f158035d = str4;
        this.f158036e = participantType;
        this.f158037f = participantRole;
        this.f158038g = z;
    }
}
