package com.ss.android.lark.chat.export.entity.chatter;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/IChatterCustomStatus;", "", "getEffectiveInterval", "Lcom/ss/android/lark/chat/export/entity/chatter/IChatterCustomStatus$IStatusEffectiveInterval;", "getIconKey", "", "getTitle", "isNotDisturbMode", "", "IStatusEffectiveInterval", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.entity.chatter.b */
public interface IChatterCustomStatus {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/chatter/IChatterCustomStatus$IStatusEffectiveInterval;", "", "getEndTime", "", "getStartTime", "isShowEndTime", "", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.export.entity.chatter.b$a */
    public interface IStatusEffectiveInterval {
        long getEndTime();

        long getStartTime();

        boolean isShowEndTime();
    }
}
