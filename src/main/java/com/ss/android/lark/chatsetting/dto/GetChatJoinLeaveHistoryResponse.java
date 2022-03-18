package com.ss.android.lark.chatsetting.dto;

import com.ss.android.lark.chat.entity.chat.ChatJoinLeaveHistory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/dto/GetChatJoinLeaveHistoryResponse;", "", "chatJoinLeaveHistoryList", "", "Lcom/ss/android/lark/chat/entity/chat/ChatJoinLeaveHistory;", "hasMore", "", "nextCursor", "", "(Ljava/util/List;ZLjava/lang/String;)V", "getChatJoinLeaveHistoryList", "()Ljava/util/List;", "getHasMore", "()Z", "getNextCursor", "()Ljava/lang/String;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.dto.b */
public final class GetChatJoinLeaveHistoryResponse {

    /* renamed from: a */
    private final List<ChatJoinLeaveHistory> f88995a;

    /* renamed from: b */
    private final boolean f88996b;

    /* renamed from: c */
    private final String f88997c;

    /* renamed from: a */
    public final List<ChatJoinLeaveHistory> mo127523a() {
        return this.f88995a;
    }

    /* renamed from: b */
    public final boolean mo127524b() {
        return this.f88996b;
    }

    /* renamed from: c */
    public final String mo127525c() {
        return this.f88997c;
    }

    public GetChatJoinLeaveHistoryResponse(List<ChatJoinLeaveHistory> list, boolean z, String str) {
        Intrinsics.checkParameterIsNotNull(list, "chatJoinLeaveHistoryList");
        Intrinsics.checkParameterIsNotNull(str, "nextCursor");
        this.f88995a = list;
        this.f88996b = z;
        this.f88997c = str;
    }
}
