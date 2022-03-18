package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/ShareFailedChat;", "", "errorCode", "", "chatId", "", "chatName", "(ILjava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getChatName", "setChatName", "getErrorCode", "()I", "setErrorCode", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.x */
public final class ShareFailedChat {

    /* renamed from: a */
    private int f83680a;

    /* renamed from: b */
    private String f83681b;

    /* renamed from: c */
    private String f83682c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareFailedChat)) {
            return false;
        }
        ShareFailedChat xVar = (ShareFailedChat) obj;
        return this.f83680a == xVar.f83680a && Intrinsics.areEqual(this.f83681b, xVar.f83681b) && Intrinsics.areEqual(this.f83682c, xVar.f83682c);
    }

    public int hashCode() {
        int i = this.f83680a * 31;
        String str = this.f83681b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83682c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return "ShareFailedChat(errorCode=" + this.f83680a + ", chatId=" + this.f83681b + ", chatName=" + this.f83682c + ")";
    }

    /* renamed from: a */
    public final int mo120244a() {
        return this.f83680a;
    }

    /* renamed from: b */
    public final String mo120245b() {
        return this.f83682c;
    }

    public ShareFailedChat(int i, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "chatName");
        this.f83680a = i;
        this.f83681b = str;
        this.f83682c = str2;
    }
}
