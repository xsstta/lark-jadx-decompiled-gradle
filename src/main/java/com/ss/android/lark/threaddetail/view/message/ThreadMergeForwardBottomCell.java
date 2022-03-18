package com.ss.android.lark.threaddetail.view.message;

import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0014J\b\u0010\u0010\u001a\u00020\rH\u0016J$\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u0013H\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/threaddetail/view/message/ThreadMergeForwardBottomCell;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/threaddetail/view/message/ThreadMergeForwardBottomCell$ThreadMergeForwardBottomViewHolder;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;)V", "bindReplyDesc", "", "viewHolder", "showRelpyDesc", "", "replyCount", "", "getHolderClassImpl", "Ljava/lang/Class;", "layoutId", "onBindViewHolder", "item", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "ThreadMergeForwardBottomViewHolder", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threaddetail.view.message.f */
public final class ThreadMergeForwardBottomCell extends AbstractC33290a<ContentVO<?>, ThreadMergeForwardBottomViewHolder> {
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_detail_merger_forward_bottom_tips;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/threaddetail/view/message/ThreadMergeForwardBottomCell$ThreadMergeForwardBottomViewHolder;", "Lcom/ss/android/lark/widget/recyclerview/hive/HiveHolder;", "()V", "replyDescTv", "Landroid/widget/TextView;", "getReplyDescTv", "()Landroid/widget/TextView;", "setReplyDescTv", "(Landroid/widget/TextView;)V", "onBindView", "", "itemView", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.threaddetail.view.message.f$a */
    public static final class ThreadMergeForwardBottomViewHolder extends AbstractC59010e {

        /* renamed from: a */
        private TextView f138239a;

        /* renamed from: a */
        public final TextView mo190692a() {
            return this.f138239a;
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f138239a = (TextView) view.findViewById(R.id.reply_desc);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<ThreadMergeForwardBottomViewHolder> mo122650b() {
        return ThreadMergeForwardBottomViewHolder.class;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadMergeForwardBottomCell(AbstractC33342d dVar) {
        super(dVar);
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadMergeForwardBottomViewHolder aVar, AbsMessageVO<ContentVO<?>> aVar2) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "viewHolder");
        super.mo122648a((AbstractC59010e) aVar, (AbsMessageVO) aVar2);
        if (aVar2 instanceof ChatMessageVO) {
            if (((ChatMessageVO) aVar2).mo124239L() == 0) {
                z = true;
            } else {
                z = false;
            }
            m217332a(aVar, z, aVar2.mo121715w());
        }
    }

    /* renamed from: a */
    private final void m217332a(ThreadMergeForwardBottomViewHolder aVar, boolean z, int i) {
        if (z) {
            TextView a = aVar.mo190692a();
            if (a != null) {
                a.setVisibility(0);
            }
            if (i > 0) {
                TextView a2 = aVar.mo190692a();
                if (a2 != null) {
                    a2.setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title) + "  " + i);
                    return;
                }
                return;
            }
            TextView a3 = aVar.mo190692a();
            if (a3 != null) {
                a3.setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title));
                return;
            }
            return;
        }
        TextView a4 = aVar.mo190692a();
        if (a4 != null) {
            a4.setVisibility(8);
        }
    }
}
