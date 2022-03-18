package com.ss.android.lark.threadmergeforward;

import com.ss.android.lark.chat.base.view.p1603a.AbstractC32928b;
import com.ss.android.lark.chat.export.ui.p1672b.C34029b;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/threadmergeforward/ThreadMergeForwardMenuFilter;", "Lcom/ss/android/lark/chat/base/view/menu/IMenuFilter;", "Lcom/ss/android/lark/chat/vo/ChatMessageVO;", "()V", "accept", "", "menuItem", "Lcom/ss/android/lark/chat/export/ui/menu/MenuItem;", "value", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadmergeforward.e */
public final class ThreadMergeForwardMenuFilter implements AbstractC32928b<ChatMessageVO<?>> {
    /* renamed from: a */
    public boolean accept(C34029b<?> bVar, ChatMessageVO<?> cVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "menuItem");
        if (bVar.f87966a == 8 || bVar.f87966a == 9 || bVar.f87966a == 11 || bVar.f87966a == 12 || bVar.f87966a == 26) {
            return true;
        }
        return false;
    }
}
