package com.ss.android.lark.chat.export.entity.chatter;

import java.io.Serializable;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0005H&J\b\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u0005H&J\b\u0010\u0012\u001a\u00020\u0005H&J\b\u0010\u0013\u001a\u00020\u0014H'J\b\u0010\u0015\u001a\u00020\u0016H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0016H&¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "Ljava/io/Serializable;", "getAccess", "Lcom/ss/android/lark/chat/export/entity/chatter/IAccess;", "getAlias", "", "getAvatarKey", "getCustomStatus", "", "T", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterCustomStatus;", "getDesc", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterDesc;", "getEnName", "getId", "getLocalizedName", "getName", "getNamePy", "getTenantId", "getZenModeEndTime", "", "isBot", "", "isDimission", "isRegistered", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface OpenChatter extends Serializable {
    IAccess getAccess();

    String getAlias();

    String getAvatarKey();

    <T extends IChatterCustomStatus> List<T> getCustomStatus();

    IChatterDesc getDesc();

    String getEnName();

    String getId();

    String getLocalizedName();

    String getName();

    String getNamePy();

    String getTenantId();

    @Deprecated(message = "use custom status")
    long getZenModeEndTime();

    boolean isBot();

    boolean isDimission();

    boolean isRegistered();
}
