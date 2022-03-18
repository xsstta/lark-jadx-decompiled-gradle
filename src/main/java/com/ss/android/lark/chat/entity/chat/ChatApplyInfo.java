package com.ss.android.lark.chat.entity.chat;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/chat/entity/chat/ChatApplyInfo;", "", "applyInfoList", "", "Lcom/ss/android/lark/chat/entity/chat/AddChatChatterApply;", "nextCursor", "", "hasMore", "", "(Ljava/util/List;Ljava/lang/String;Z)V", "getApplyInfoList", "()Ljava/util/List;", "setApplyInfoList", "(Ljava/util/List;)V", "getHasMore", "()Z", "setHasMore", "(Z)V", "getNextCursor", "()Ljava/lang/String;", "setNextCursor", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.chat.a */
public final class ChatApplyInfo {

    /* renamed from: a */
    private List<AddChatChatterApply> f87771a;

    /* renamed from: b */
    private String f87772b;

    /* renamed from: c */
    private boolean f87773c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatApplyInfo)) {
            return false;
        }
        ChatApplyInfo aVar = (ChatApplyInfo) obj;
        return Intrinsics.areEqual(this.f87771a, aVar.f87771a) && Intrinsics.areEqual(this.f87772b, aVar.f87772b) && this.f87773c == aVar.f87773c;
    }

    public int hashCode() {
        List<AddChatChatterApply> list = this.f87771a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f87772b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f87773c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    public String toString() {
        return "ChatApplyInfo(applyInfoList=" + this.f87771a + ", nextCursor=" + this.f87772b + ", hasMore=" + this.f87773c + ")";
    }

    /* renamed from: a */
    public final List<AddChatChatterApply> mo124704a() {
        return this.f87771a;
    }

    /* renamed from: b */
    public final String mo124705b() {
        return this.f87772b;
    }

    /* renamed from: c */
    public final boolean mo124706c() {
        return this.f87773c;
    }

    public ChatApplyInfo(List<AddChatChatterApply> list, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "applyInfoList");
        Intrinsics.checkParameterIsNotNull(str, "nextCursor");
        this.f87771a = list;
        this.f87772b = str;
        this.f87773c = z;
    }
}
