package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.ss.android.lark.tab.service.entity.ChatTab;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/TabViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "chatTabListLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/ss/android/lark/tab/service/entity/ChatTab;", "getChatTabListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setChatTabListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.j */
public final class TabViewModel extends AbstractC1142af {
    private C1177w<List<ChatTab>> chatTabListLiveData = new C1177w<>();

    public final C1177w<List<ChatTab>> getChatTabListLiveData() {
        return this.chatTabListLiveData;
    }

    public final void setChatTabListLiveData(C1177w<List<ChatTab>> wVar) {
        Intrinsics.checkParameterIsNotNull(wVar, "<set-?>");
        this.chatTabListLiveData = wVar;
    }
}
