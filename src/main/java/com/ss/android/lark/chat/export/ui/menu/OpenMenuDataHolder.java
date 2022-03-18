package com.ss.android.lark.chat.export.ui.menu;

import android.view.View;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/export/ui/menu/OpenMenuDataHolder;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "", "itemView", "Landroid/view/View;", "messageVo", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "(Landroid/view/View;Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;)V", "getItemView", "()Landroid/view/View;", "getMessageVo", "()Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.ui.b.c */
public final class OpenMenuDataHolder<T extends ContentVO<?>> {

    /* renamed from: a */
    private final View f87986a;

    /* renamed from: b */
    private final OpenMessageVO<T> f87987b;

    /* renamed from: a */
    public final OpenMessageVO<T> mo126137a() {
        return this.f87987b;
    }

    public OpenMenuDataHolder(View view, OpenMessageVO<T> cVar) {
        Intrinsics.checkParameterIsNotNull(view, "itemView");
        Intrinsics.checkParameterIsNotNull(cVar, "messageVo");
        this.f87986a = view;
        this.f87987b = cVar;
    }
}
