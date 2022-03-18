package com.ss.android.vc.meeting.module.reaction.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/entity/ViewItemReaction;", "", "fromUser", "Lcom/ss/android/vc/meeting/module/reaction/entity/VideoChatParticipant;", "reactionKey", "", "countNum", "", "duration", "(Lcom/ss/android/vc/meeting/module/reaction/entity/VideoChatParticipant;Ljava/lang/String;II)V", "getCountNum", "()I", "setCountNum", "(I)V", "getDuration", "setDuration", "getFromUser", "()Lcom/ss/android/vc/meeting/module/reaction/entity/VideoChatParticipant;", "getReactionKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "lib_vc_entity_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.entity.f */
public final class ViewItemReaction {

    /* renamed from: a */
    private final VideoChatParticipant f158039a;

    /* renamed from: b */
    private final String f158040b;

    /* renamed from: c */
    private int f158041c;

    /* renamed from: d */
    private int f158042d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewItemReaction)) {
            return false;
        }
        ViewItemReaction fVar = (ViewItemReaction) obj;
        return Intrinsics.areEqual(this.f158039a, fVar.f158039a) && Intrinsics.areEqual(this.f158040b, fVar.f158040b) && this.f158041c == fVar.f158041c && this.f158042d == fVar.f158042d;
    }

    public int hashCode() {
        VideoChatParticipant eVar = this.f158039a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        String str = this.f158040b;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f158041c) * 31) + this.f158042d;
    }

    public String toString() {
        return "ViewItemReaction(fromUser=" + this.f158039a + ", reactionKey=" + this.f158040b + ", countNum=" + this.f158041c + ", duration=" + this.f158042d + ")";
    }

    /* renamed from: a */
    public final VideoChatParticipant mo216950a() {
        return this.f158039a;
    }

    /* renamed from: b */
    public final String mo216952b() {
        return this.f158040b;
    }

    /* renamed from: c */
    public final int mo216954c() {
        return this.f158041c;
    }

    /* renamed from: a */
    public final void mo216951a(int i) {
        this.f158041c = i;
    }

    /* renamed from: b */
    public final void mo216953b(int i) {
        this.f158042d = i;
    }

    public ViewItemReaction(VideoChatParticipant eVar, String str, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(eVar, "fromUser");
        Intrinsics.checkParameterIsNotNull(str, "reactionKey");
        this.f158039a = eVar;
        this.f158040b = str;
        this.f158041c = i;
        this.f158042d = i2;
    }
}
