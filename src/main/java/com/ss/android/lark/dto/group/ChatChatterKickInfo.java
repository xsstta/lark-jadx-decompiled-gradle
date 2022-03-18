package com.ss.android.lark.dto.group;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/dto/group/ChatChatterKickInfo;", "", "chatId", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getReason", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.dto.group.a */
public final class ChatChatterKickInfo {

    /* renamed from: a */
    private final String f94798a;

    /* renamed from: b */
    private final String f94799b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatChatterKickInfo)) {
            return false;
        }
        ChatChatterKickInfo aVar = (ChatChatterKickInfo) obj;
        return Intrinsics.areEqual(this.f94798a, aVar.f94798a) && Intrinsics.areEqual(this.f94799b, aVar.f94799b);
    }

    public int hashCode() {
        String str = this.f94798a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f94799b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ChatChatterKickInfo(chatId=" + this.f94798a + ", reason=" + this.f94799b + ")";
    }

    /* renamed from: a */
    public final String mo136121a() {
        return this.f94799b;
    }

    public ChatChatterKickInfo(String str, String str2) {
        this.f94798a = str;
        this.f94799b = str2;
    }
}
