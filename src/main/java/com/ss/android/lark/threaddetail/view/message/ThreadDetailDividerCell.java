package com.ss.android.lark.threaddetail.view.message;

import android.view.View;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailDividerCell;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailDividerCell$ThreadDetailDividerViewHolder;", "chaContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;)V", "getHolderClassImpl", "Ljava/lang/Class;", "layoutId", "", "ThreadDetailDividerViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threaddetail.view.message.c */
public final class ThreadDetailDividerCell extends AbstractC33290a<ContentVO<?>, ThreadDetailDividerViewHolder> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/threaddetail/view/message/ThreadDetailDividerCell$ThreadDetailDividerViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "()V", "onBindView", "", "itemView", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threaddetail.view.message.c$a */
    public static final class ThreadDetailDividerViewHolder extends AbstractC59010e {
        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
        }
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_detail_divider;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<ThreadDetailDividerViewHolder> mo122650b() {
        return ThreadDetailDividerViewHolder.class;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadDetailDividerCell(AbstractC33342d dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "chaContext");
    }
}
