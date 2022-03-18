package com.ss.android.lark.chat.export.ui.message;

import android.view.View;
import com.ss.android.lark.chat.export.ui.p1671a.AbstractC34027a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/export/ui/message/IOpenCellCallback;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/export/ui/callback/ICardActionCallback;", "onCellClicked", "", "itemView", "Landroid/view/View;", "item", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "onCellLongClicked", "", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.ui.message.b */
public interface IOpenCellCallback<T extends ContentVO<?>> extends AbstractC34027a {
    /* renamed from: a */
    void mo122829a(View view, OpenMessageVO<T> cVar);

    /* renamed from: b */
    boolean mo122833b(View view, OpenMessageVO<T> cVar);
}
