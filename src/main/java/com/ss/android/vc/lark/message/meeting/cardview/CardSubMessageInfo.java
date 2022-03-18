package com.ss.android.vc.lark.message.meeting.cardview;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/vc/lark/message/meeting/cardview/CardSubMessageInfo;", "", "messageId", "", "chatId", "hasReaction", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getChatId", "()Ljava/lang/String;", "getHasReaction", "()Z", "getMessageId", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.b */
public final class CardSubMessageInfo {

    /* renamed from: a */
    private final String f153165a;

    /* renamed from: b */
    private final String f153166b;

    /* renamed from: c */
    private final boolean f153167c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardSubMessageInfo)) {
            return false;
        }
        CardSubMessageInfo bVar = (CardSubMessageInfo) obj;
        return Intrinsics.areEqual(this.f153165a, bVar.f153165a) && Intrinsics.areEqual(this.f153166b, bVar.f153166b) && this.f153167c == bVar.f153167c;
    }

    public int hashCode() {
        String str = this.f153165a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f153166b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f153167c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "CardSubMessageInfo(messageId=" + this.f153165a + ", chatId=" + this.f153166b + ", hasReaction=" + this.f153167c + ")";
    }

    /* renamed from: a */
    public final String mo211430a() {
        return this.f153165a;
    }

    /* renamed from: b */
    public final String mo211431b() {
        return this.f153166b;
    }

    public CardSubMessageInfo(String str, String str2, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "messageId");
        Intrinsics.checkParameterIsNotNull(str2, "chatId");
        this.f153165a = str;
        this.f153166b = str2;
        this.f153167c = z;
    }
}
