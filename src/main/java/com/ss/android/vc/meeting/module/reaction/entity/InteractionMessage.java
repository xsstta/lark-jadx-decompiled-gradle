package com.ss.android.vc.meeting.module.reaction.entity;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b'\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u0012\u0012\u0004\u0012\u00020\u00000\u0002j\b\u0012\u0004\u0012\u00020\u0000`\u0003Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0002\u0010\u0019J\u001c\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u00002\b\u00100\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u00103\u001a\u00020\u0016HÆ\u0003J\t\u00104\u001a\u00020\u0018HÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\u0005HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010>\u001a\u00020\u00162\b\u0010?\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\fHÖ\u0001J\u0012\u0010B\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010D\u001a\u00020\u00162\b\u0010C\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010E\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010 R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006F"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "Lcom/larksuite/framework/utils/diff/Diffable;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "id", "", ShareHitPoint.f121869d, "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessageType;", "fromUser", "Lcom/ss/android/vc/meeting/module/reaction/entity/VideoChatParticipant;", "cid", "position", "", "createMilliTime", "meetingId", "reactionContent", "Lcom/ss/android/vc/meeting/module/reaction/entity/ReactionContent;", "textContent", "Lcom/ss/android/vc/meeting/module/reaction/entity/TextContent;", "systemContent", "Lcom/ss/android/vc/meeting/module/reaction/entity/SystemContent;", "isGuest", "", "tenantId", "", "(Ljava/lang/String;Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessageType;Lcom/ss/android/vc/meeting/module/reaction/entity/VideoChatParticipant;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/ss/android/vc/meeting/module/reaction/entity/ReactionContent;Lcom/ss/android/vc/meeting/module/reaction/entity/TextContent;Lcom/ss/android/vc/meeting/module/reaction/entity/SystemContent;ZJ)V", "getCid", "()Ljava/lang/String;", "getCreateMilliTime", "getFromUser", "()Lcom/ss/android/vc/meeting/module/reaction/entity/VideoChatParticipant;", "getId", "()Z", "getMeetingId", "getPosition", "()I", "getReactionContent", "()Lcom/ss/android/vc/meeting/module/reaction/entity/ReactionContent;", "getSystemContent", "()Lcom/ss/android/vc/meeting/module/reaction/entity/SystemContent;", "getTenantId", "()J", "getTextContent", "()Lcom/ss/android/vc/meeting/module/reaction/entity/TextContent;", "getType", "()Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessageType;", "compare", "o1", "o2", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "isContentSame", "diffable", "isItemSame", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.entity.a */
public final class InteractionMessage implements AbstractC26248b<InteractionMessage>, Comparator<InteractionMessage> {

    /* renamed from: a */
    private final String f158017a;

    /* renamed from: b */
    private final InteractionMessageType f158018b;

    /* renamed from: c */
    private final VideoChatParticipant f158019c;

    /* renamed from: d */
    private final String f158020d;

    /* renamed from: e */
    private final int f158021e;

    /* renamed from: f */
    private final String f158022f;

    /* renamed from: g */
    private final String f158023g;

    /* renamed from: h */
    private final ReactionContent f158024h;

    /* renamed from: i */
    private final TextContent f158025i;

    /* renamed from: j */
    private final SystemContent f158026j;

    /* renamed from: k */
    private final boolean f158027k;

    /* renamed from: l */
    private final long f158028l;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InteractionMessage)) {
            return false;
        }
        InteractionMessage aVar = (InteractionMessage) obj;
        return Intrinsics.areEqual(this.f158017a, aVar.f158017a) && Intrinsics.areEqual(this.f158018b, aVar.f158018b) && Intrinsics.areEqual(this.f158019c, aVar.f158019c) && Intrinsics.areEqual(this.f158020d, aVar.f158020d) && this.f158021e == aVar.f158021e && Intrinsics.areEqual(this.f158022f, aVar.f158022f) && Intrinsics.areEqual(this.f158023g, aVar.f158023g) && Intrinsics.areEqual(this.f158024h, aVar.f158024h) && Intrinsics.areEqual(this.f158025i, aVar.f158025i) && Intrinsics.areEqual(this.f158026j, aVar.f158026j) && this.f158027k == aVar.f158027k && this.f158028l == aVar.f158028l;
    }

    public int hashCode() {
        String str = this.f158017a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        InteractionMessageType interactionMessageType = this.f158018b;
        int hashCode2 = (hashCode + (interactionMessageType != null ? interactionMessageType.hashCode() : 0)) * 31;
        VideoChatParticipant eVar = this.f158019c;
        int hashCode3 = (hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31;
        String str2 = this.f158020d;
        int hashCode4 = (((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f158021e) * 31;
        String str3 = this.f158022f;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f158023g;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ReactionContent bVar = this.f158024h;
        int hashCode7 = (hashCode6 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        TextContent dVar = this.f158025i;
        int hashCode8 = (hashCode7 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        SystemContent cVar = this.f158026j;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        int i2 = (hashCode8 + i) * 31;
        boolean z = this.f158027k;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        long j = this.f158028l;
        return ((i2 + i3) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "InteractionMessage(id=" + this.f158017a + ", type=" + this.f158018b + ", fromUser=" + this.f158019c + ", cid=" + this.f158020d + ", position=" + this.f158021e + ", createMilliTime=" + this.f158022f + ", meetingId=" + this.f158023g + ", reactionContent=" + this.f158024h + ", textContent=" + this.f158025i + ", systemContent=" + this.f158026j + ", isGuest=" + this.f158027k + ", tenantId=" + this.f158028l + ")";
    }

    /* renamed from: a */
    public final String mo216912a() {
        return this.f158017a;
    }

    /* renamed from: b */
    public final InteractionMessageType mo216914b() {
        return this.f158018b;
    }

    /* renamed from: c */
    public final VideoChatParticipant mo216916c() {
        return this.f158019c;
    }

    /* renamed from: d */
    public final String mo216918d() {
        return this.f158020d;
    }

    /* renamed from: e */
    public final int mo216919e() {
        return this.f158021e;
    }

    /* renamed from: f */
    public final String mo216921f() {
        return this.f158022f;
    }

    /* renamed from: g */
    public final String mo216922g() {
        return this.f158023g;
    }

    /* renamed from: h */
    public final ReactionContent mo216923h() {
        return this.f158024h;
    }

    /* renamed from: i */
    public final TextContent mo216925i() {
        return this.f158025i;
    }

    /* renamed from: j */
    public final boolean mo216926j() {
        return this.f158027k;
    }

    /* renamed from: k */
    public final long mo216927k() {
        return this.f158028l;
    }

    /* renamed from: a */
    public boolean isItemSame(InteractionMessage aVar) {
        if (aVar == null || !Intrinsics.areEqual(aVar.f158020d, this.f158020d)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean isContentSame(InteractionMessage aVar) {
        InteractionMessageType interactionMessageType;
        if (aVar == null || (interactionMessageType = aVar.f158018b) != this.f158018b) {
            return false;
        }
        if (interactionMessageType == InteractionMessageType.TEXT) {
            TextContent dVar = this.f158025i;
            if (dVar == null || !Intrinsics.areEqual(dVar, aVar.f158025i)) {
                return false;
            }
            return true;
        } else if (aVar.f158018b == InteractionMessageType.UNKNOWN) {
            return Intrinsics.areEqual(this.f158019c, aVar.f158019c);
        } else {
            if (aVar.f158018b == InteractionMessageType.SYSTEM) {
                return Intrinsics.areEqual(this.f158019c, aVar.f158019c);
            }
            return false;
        }
    }

    /* renamed from: a */
    public int compare(InteractionMessage aVar, InteractionMessage aVar2) {
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        int i = aVar.f158021e;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        return i - aVar2.f158021e;
    }

    public InteractionMessage(String str, InteractionMessageType interactionMessageType, VideoChatParticipant eVar, String str2, int i, String str3, String str4, ReactionContent bVar, TextContent dVar, SystemContent cVar, boolean z, long j) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(interactionMessageType, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(eVar, "fromUser");
        Intrinsics.checkParameterIsNotNull(str2, "cid");
        Intrinsics.checkParameterIsNotNull(str3, "createMilliTime");
        Intrinsics.checkParameterIsNotNull(str4, "meetingId");
        this.f158017a = str;
        this.f158018b = interactionMessageType;
        this.f158019c = eVar;
        this.f158020d = str2;
        this.f158021e = i;
        this.f158022f = str3;
        this.f158023g = str4;
        this.f158024h = bVar;
        this.f158025i = dVar;
        this.f158026j = cVar;
        this.f158027k = z;
        this.f158028l = j;
    }
}
