package com.ss.android.lark.chat.export.ui.message;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.lark.chat.export.ui.menu.OpenMenuDataHolder;
import com.ss.android.lark.chat.export.ui.p1672b.AbstractC34028a;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.export.vo.OpenMessageVO;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H&J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH&J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/export/ui/message/IOpenMessageCell;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/export/ui/menu/IContextMenuHandler;", "Lcom/ss/android/lark/chat/export/ui/menu/OpenMenuDataHolder;", "getMessageClass", "Ljava/lang/Class;", "onBindView", "", "itemView", "Landroid/view/View;", "position", "", "message", "Lcom/ss/android/lark/chat/export/vo/OpenMessageVO;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewRecycled", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.ui.message.c */
public interface IOpenMessageCell<T extends ContentVO<?>> extends AbstractC34028a<OpenMenuDataHolder<T>> {
    /* renamed from: a */
    View mo120406a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    /* renamed from: a */
    Class<T> mo120409a();

    /* renamed from: a */
    void mo120410a(View view);

    /* renamed from: a */
    void mo120411a(View view, int i, OpenMessageVO<T> cVar);
}
