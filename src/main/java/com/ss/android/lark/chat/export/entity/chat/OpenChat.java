package com.ss.android.lark.chat.export.entity.chat;

import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&J\b\u0010\u0010\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u000bH&J\b\u0010\u0012\u001a\u00020\u000bH&J\b\u0010\u0013\u001a\u00020\u000bH&J\b\u0010\u0014\u001a\u00020\u000bH&J\b\u0010\u0015\u001a\u00020\u000bH&J\b\u0010\u0016\u001a\u00020\u000bH&J\b\u0010\u0017\u001a\u00020\u000bH&¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chat/OpenChat;", "Ljava/io/Serializable;", "getAvatarKey", "", "getGroupOwnerId", "getId", "getName", "getP2pChatterId", "getUserCount", "", "isAdmin", "", "isAllowPost", "isCrossTenant", "isCrossWithKa", "isCustomerService", "isGroup", "isMeeting", "isMember", "isOnCall", "isOnlyManagerCreateVC", "isP2PChat", "isSecret", "isSoloChat", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface OpenChat extends Serializable {
    String getAvatarKey();

    String getGroupOwnerId();

    String getId();

    String getName();

    String getP2pChatterId();

    int getUserCount();

    boolean isAdmin();

    boolean isAllowPost();

    boolean isCrossTenant();

    boolean isCrossWithKa();

    boolean isCustomerService();

    boolean isGroup();

    boolean isMeeting();

    boolean isMember();

    boolean isOnCall();

    boolean isOnlyManagerCreateVC();

    boolean isP2PChat();

    boolean isSecret();

    boolean isSoloChat();
}
