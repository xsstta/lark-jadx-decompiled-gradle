package com.ss.android.lark.threaddetail;

import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.threaddetail.view.p2755c.C55905a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J&\u0010\r\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J&\u0010\u000e\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J&\u0010\u000f\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/threaddetail/ThreadDetailUIModelInterceptor;", "Lcom/ss/android/lark/chat/core/model/DataListPipeline$ListChangeInterceptor;", "Lcom/ss/android/lark/threaddetail/view/viewdata/ThreadDetailUIItem;", "uiModel", "Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel;", "(Lcom/ss/android/lark/threaddetail/ThreadDetailUIModel;)V", "applyUIModel", "", "list", "", "start", "", "count", "onItemChanged", "onItemInserted", "onItemRemoved", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threaddetail.h */
public final class ThreadDetailUIModelInterceptor implements C33955c.AbstractC33956a<C55905a> {

    /* renamed from: a */
    private final ThreadDetailUIModel f137843a;

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: b */
    public void mo122970b(List<C55905a> list, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "list");
    }

    public ThreadDetailUIModelInterceptor(ThreadDetailUIModel gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "uiModel");
        this.f137843a = gVar;
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: a */
    public void mo122969a(List<C55905a> list, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        m216676d(list, i, i2);
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: c */
    public void mo122971c(List<C55905a> list, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        m216676d(list, i, i2);
    }

    /* renamed from: d */
    private final void m216676d(List<C55905a> list, int i, int i2) {
        int size = list.size();
        while (i < size) {
            C55905a aVar = list.get(i);
            Message message = aVar.mo190598f().getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "item.messageInfo.getMessage()");
            if (message.getType() == Message.Type.POST || message.getType() == Message.Type.TEXT) {
                ThreadDetailUIModel gVar = this.f137843a;
                String k = aVar.mo190608k();
                Intrinsics.checkExpressionValueIsNotNull(k, "item.messageId");
                aVar.mo190599f(gVar.mo190403a(k));
                ThreadDetailUIModel gVar2 = this.f137843a;
                String k2 = aVar.mo190608k();
                Intrinsics.checkExpressionValueIsNotNull(k2, "item.messageId");
                aVar.mo190573a((double) gVar2.mo190404b(k2));
            }
            i++;
        }
    }
}
