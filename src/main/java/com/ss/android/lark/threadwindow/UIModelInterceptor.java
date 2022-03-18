package com.ss.android.lark.threadwindow;

import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.core.model.C33955c;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.threadwindow.view.ThreadWindowUIModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002J*\u0010\r\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J*\u0010\u000e\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J*\u0010\u000f\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/threadwindow/UIModelInterceptor;", "Lcom/ss/android/lark/chat/core/model/DataListPipeline$ListChangeInterceptor;", "Lcom/ss/android/lark/chat/base/view/vo/ThreadMessageVO;", "uiModel", "Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel;", "(Lcom/ss/android/lark/threadwindow/view/ThreadWindowUIModel;)V", "applyUIModel", "", "list", "", "start", "", "count", "onItemChanged", "onItemInserted", "onItemRemoved", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.n */
public final class UIModelInterceptor implements C33955c.AbstractC33956a<ThreadMessageVO<?>> {

    /* renamed from: a */
    private final ThreadWindowUIModel f138881a;

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: b */
    public void mo122970b(List<ThreadMessageVO<?>> list, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "list");
    }

    public UIModelInterceptor(ThreadWindowUIModel dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "uiModel");
        this.f138881a = dVar;
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: a */
    public void mo122969a(List<ThreadMessageVO<?>> list, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        m218892d(list, i, i2);
    }

    @Override // com.ss.android.lark.chat.core.model.C33955c.AbstractC33956a
    /* renamed from: c */
    public void mo122971c(List<ThreadMessageVO<?>> list, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(list, "list");
        m218892d(list, i, i2);
    }

    /* renamed from: d */
    private final void m218892d(List<ThreadMessageVO<?>> list, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            ThreadMessageVO<?> threadMessageVO = list.get(i);
            String a = threadMessageVO.mo121681a();
            ContentVO g = threadMessageVO.mo121699g();
            if (g instanceof BaseTextContentVO) {
                BaseTextContentVO baseTextContentVO = (BaseTextContentVO) g;
                baseTextContentVO.mo121774a(-1);
                baseTextContentVO.mo121773a((double) this.f138881a.mo191494b(a));
                baseTextContentVO.mo121779a(this.f138881a.mo191493a(a));
            }
            i++;
        }
    }
}
