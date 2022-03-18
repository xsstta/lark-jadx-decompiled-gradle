package com.ss.android.lark.feed.app.model.event;

import com.ss.android.eventbus.BaseEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/feed/app/model/event/ChatStartEvent;", "Lcom/ss/android/eventbus/BaseEvent;", "chatId", "", "(Ljava/lang/String;)V", "mChatId", "getChatId", "im_feed_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.feed.app.model.event.a */
public final class ChatStartEvent extends BaseEvent {

    /* renamed from: a */
    private final String f96799a;

    /* renamed from: a */
    public final String mo138462a() {
        return this.f96799a;
    }

    public ChatStartEvent(String str) {
        this.f96799a = str;
    }
}
