package com.ss.android.lark.threaddetail.view.message;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.SystemContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class ThreadDetailSystemCell extends AbstractC33290a<SystemContentVO, ThreadDetailSystemViewHolder> {
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_detail_system;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadDetailSystemViewHolder extends AbstractC59010e {
        @BindView(8549)
        public TextView replyDescTv;
        @BindView(8888)
        public TextView systemMessageTv;

        ThreadDetailSystemViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            Context context = view.getContext();
            this.replyDescTv.getLayoutParams().height = LKUIDisplayManager.m91881c(context, 50);
            C25649b.m91856a(this.replyDescTv, 17);
            C25649b.m91856a(this.systemMessageTv, 12);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return SystemContentVO.class;
    }

    public class ThreadDetailSystemViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadDetailSystemViewHolder f138163a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadDetailSystemViewHolder threadDetailSystemViewHolder = this.f138163a;
            if (threadDetailSystemViewHolder != null) {
                this.f138163a = null;
                threadDetailSystemViewHolder.replyDescTv = null;
                threadDetailSystemViewHolder.systemMessageTv = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadDetailSystemViewHolder_ViewBinding(ThreadDetailSystemViewHolder threadDetailSystemViewHolder, View view) {
            this.f138163a = threadDetailSystemViewHolder;
            threadDetailSystemViewHolder.replyDescTv = (TextView) Utils.findRequiredViewAsType(view, R.id.reply_desc, "field 'replyDescTv'", TextView.class);
            threadDetailSystemViewHolder.systemMessageTv = (TextView) Utils.findRequiredViewAsType(view, R.id.system_message, "field 'systemMessageTv'", TextView.class);
        }
    }

    public ThreadDetailSystemCell(AbstractC33342d dVar) {
        super(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadDetailSystemViewHolder threadDetailSystemViewHolder, AbsMessageVO<SystemContentVO> aVar) {
        boolean z;
        super.mo122648a((AbstractC59010e) threadDetailSystemViewHolder, (AbsMessageVO) aVar);
        if (aVar instanceof ChatMessageVO) {
            ChatMessageVO cVar = (ChatMessageVO) aVar;
            if (cVar.mo124239L() != 0 || cVar.ai()) {
                z = false;
            } else {
                z = true;
            }
            m217226a(threadDetailSystemViewHolder, z, aVar.mo121715w());
            if (cVar.mo124239L() != 0 || cVar.ai()) {
                threadDetailSystemViewHolder.replyDescTv.setVisibility(8);
            } else {
                threadDetailSystemViewHolder.replyDescTv.setVisibility(0);
            }
            threadDetailSystemViewHolder.systemMessageTv.setText(((SystemContent) cVar.mo121699g().mo126168z()).getFormattedContent());
        }
    }

    /* renamed from: a */
    private void m217226a(ThreadDetailSystemViewHolder threadDetailSystemViewHolder, boolean z, int i) {
        if (z) {
            threadDetailSystemViewHolder.replyDescTv.setVisibility(0);
            if (i > 0) {
                TextView textView = threadDetailSystemViewHolder.replyDescTv;
                textView.setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title) + "  " + i);
                return;
            }
            threadDetailSystemViewHolder.replyDescTv.setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title));
            return;
        }
        threadDetailSystemViewHolder.replyDescTv.setVisibility(8);
    }
}
