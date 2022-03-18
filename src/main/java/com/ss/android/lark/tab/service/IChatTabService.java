package com.ss.android.lark.tab.service;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.tab.service.entity.ChatTab;
import com.ss.android.lark.tab.service.entity.ChatTabsListResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\u0019J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J&\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J:\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J,\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/tab/service/IChatTabService;", "", "addChatTab", "", "chatId", "", "name", ShareHitPoint.f121869d, "Lcom/ss/android/lark/tab/service/entity/ChatTab$ChatTabType;", "payload", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/tab/service/entity/ChatTabsListResult;", "deleteChatTab", "tabId", "", "getChatTabs", "syncStrategy", "Lcom/ss/android/lark/tab/service/IChatTabService$SyncStrategy;", "updateChatTab", "deleteTabIds", "", "currentTabIds", "updateChatTabOrders", "reOrderIds", "SyncStrategy", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public interface IChatTabService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/tab/service/IChatTabService$SyncStrategy;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "SYNC", "OLD_THEN_TRIGGER", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum SyncStrategy {
        SYNC(0),
        OLD_THEN_TRIGGER(1);
        
        public static final Companion Companion = new Companion(null);
        private final int value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/tab/service/IChatTabService$SyncStrategy$Companion;", "", "()V", "forNumber", "Lcom/ss/android/lark/tab/service/IChatTabService$SyncStrategy;", "value", "", "valueOf", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.tab.service.IChatTabService$SyncStrategy$a */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public final int getValue() {
            return this.value;
        }

        private SyncStrategy(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    void mo188371a(String str, long j, IGetDataCallback<ChatTabsListResult> iGetDataCallback);

    /* renamed from: a */
    void mo188372a(String str, SyncStrategy syncStrategy, IGetDataCallback<ChatTabsListResult> iGetDataCallback);

    /* renamed from: a */
    void mo188373a(String str, String str2, ChatTab.ChatTabType chatTabType, String str3, IGetDataCallback<ChatTabsListResult> iGetDataCallback);

    /* renamed from: a */
    void mo188374a(String str, List<Long> list, IGetDataCallback<ChatTabsListResult> iGetDataCallback);

    /* renamed from: a */
    void mo188375a(String str, List<Long> list, List<Long> list2, IGetDataCallback<ChatTabsListResult> iGetDataCallback);
}
