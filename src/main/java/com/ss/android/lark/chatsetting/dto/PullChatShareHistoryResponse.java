package com.ss.android.lark.chatsetting.dto;

import com.ss.android.lark.chat.entity.chat.ChatShareInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J8\u0010\u001a\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\bHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/ss/android/lark/chatsetting/dto/PullChatShareHistoryResponse;", "", "chatShareHistorys", "", "Lcom/ss/android/lark/chat/entity/chat/ChatShareInfo;", "hasMore", "", "nextCursor", "", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "getChatShareHistorys", "()Ljava/util/List;", "setChatShareHistorys", "(Ljava/util/List;)V", "getHasMore", "()Ljava/lang/Boolean;", "setHasMore", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getNextCursor", "()Ljava/lang/String;", "setNextCursor", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/ss/android/lark/chatsetting/dto/PullChatShareHistoryResponse;", "equals", "other", "hashCode", "", "toString", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.dto.h */
public final class PullChatShareHistoryResponse {

    /* renamed from: a */
    private List<ChatShareInfo> f88998a;

    /* renamed from: b */
    private Boolean f88999b;

    /* renamed from: c */
    private String f89000c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullChatShareHistoryResponse)) {
            return false;
        }
        PullChatShareHistoryResponse hVar = (PullChatShareHistoryResponse) obj;
        return Intrinsics.areEqual(this.f88998a, hVar.f88998a) && Intrinsics.areEqual(this.f88999b, hVar.f88999b) && Intrinsics.areEqual(this.f89000c, hVar.f89000c);
    }

    public int hashCode() {
        List<ChatShareInfo> list = this.f88998a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Boolean bool = this.f88999b;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.f89000c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "PullChatShareHistoryResponse(chatShareHistorys=" + this.f88998a + ", hasMore=" + this.f88999b + ", nextCursor=" + this.f89000c + ")";
    }

    /* renamed from: a */
    public final List<ChatShareInfo> mo127531a() {
        return this.f88998a;
    }

    /* renamed from: b */
    public final Boolean mo127532b() {
        return this.f88999b;
    }

    /* renamed from: c */
    public final String mo127533c() {
        return this.f89000c;
    }

    public PullChatShareHistoryResponse(List<ChatShareInfo> list, Boolean bool, String str) {
        this.f88998a = list;
        this.f88999b = bool;
        this.f89000c = str;
    }
}
