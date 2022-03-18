package com.ss.android.lark.threaddetail.view.block;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.SendStatus;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock;
import com.ss.android.lark.threaddetail.view.p2751a.AbstractC55868d;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;

public class ThreadDetailReplyBlock extends AbstractC59004b<ChatMessageVO, ThreadDetailReplyViewHolder> {

    /* renamed from: a */
    protected AbstractC55868d f138090a;

    /* renamed from: b */
    private final ThreadDetailCommonBlock f138091b;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadDetailReplyViewHolder extends ThreadDetailCommonBlock.ThreadDetailCommonViewHolder {
        @BindView(8080)
        public View mOnboardingView;
        @BindView(8545)
        public ViewGroup mReplyContent;
        @BindView(8549)
        public TextView mReplyDesc;
        @BindView(8851)
        public ImageView mSendFailStatus;
        @BindView(8735)
        public ViewGroup mSendStatus;
        @BindView(8736)
        public TextView mSendStatusDesc;
        @BindView(8853)
        public ProgressBar mSendingStatus;
        @BindView(9147)
        public TextView mTvSendReply;

        ThreadDetailReplyViewHolder() {
        }
    }

    public class ThreadDetailReplyViewHolder_ViewBinding extends ThreadDetailCommonBlock.ThreadDetailCommonViewHolder_ViewBinding {

        /* renamed from: a */
        private ThreadDetailReplyViewHolder f138095a;

        @Override // com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock.ThreadDetailCommonViewHolder_ViewBinding, butterknife.Unbinder
        public void unbind() {
            ThreadDetailReplyViewHolder threadDetailReplyViewHolder = this.f138095a;
            if (threadDetailReplyViewHolder != null) {
                this.f138095a = null;
                threadDetailReplyViewHolder.mReplyDesc = null;
                threadDetailReplyViewHolder.mSendStatus = null;
                threadDetailReplyViewHolder.mSendingStatus = null;
                threadDetailReplyViewHolder.mSendFailStatus = null;
                threadDetailReplyViewHolder.mSendStatusDesc = null;
                threadDetailReplyViewHolder.mTvSendReply = null;
                threadDetailReplyViewHolder.mOnboardingView = null;
                threadDetailReplyViewHolder.mReplyContent = null;
                super.unbind();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadDetailReplyViewHolder_ViewBinding(ThreadDetailReplyViewHolder threadDetailReplyViewHolder, View view) {
            super(threadDetailReplyViewHolder, view);
            this.f138095a = threadDetailReplyViewHolder;
            threadDetailReplyViewHolder.mReplyDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.reply_desc, "field 'mReplyDesc'", TextView.class);
            threadDetailReplyViewHolder.mSendStatus = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.send_status, "field 'mSendStatus'", ViewGroup.class);
            threadDetailReplyViewHolder.mSendingStatus = (ProgressBar) Utils.findRequiredViewAsType(view, R.id.status_sending, "field 'mSendingStatus'", ProgressBar.class);
            threadDetailReplyViewHolder.mSendFailStatus = (ImageView) Utils.findRequiredViewAsType(view, R.id.status_send_fail, "field 'mSendFailStatus'", ImageView.class);
            threadDetailReplyViewHolder.mSendStatusDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.send_status_desc, "field 'mSendStatusDesc'", TextView.class);
            threadDetailReplyViewHolder.mTvSendReply = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_send_reply, "field 'mTvSendReply'", TextView.class);
            threadDetailReplyViewHolder.mOnboardingView = Utils.findRequiredView(view, R.id.ll_onboarding_layout, "field 'mOnboardingView'");
            threadDetailReplyViewHolder.mReplyContent = (ViewGroup) Utils.findRequiredViewAsType(view, R.id.reply_content, "field 'mReplyContent'", ViewGroup.class);
        }
    }

    public ThreadDetailReplyBlock(ThreadDetailCommonBlock threadDetailCommonBlock, AbstractC55868d dVar) {
        this.f138090a = dVar;
        this.f138091b = threadDetailCommonBlock;
    }

    /* renamed from: a */
    private void m217072a(ThreadDetailReplyViewHolder threadDetailReplyViewHolder, boolean z) {
        String str;
        threadDetailReplyViewHolder.mOnboardingView.setVisibility(0);
        TextView textView = threadDetailReplyViewHolder.mTvSendReply;
        if (z) {
            str = UIHelper.getString(R.string.Lark_Chat_TopicClosedReplyOnboardingTip);
        } else {
            str = UIHelper.getString(R.string.Lark_Chat_TopicReplyOnboardingTipTwo);
        }
        textView.setText(str);
        threadDetailReplyViewHolder.mOnboardingView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threaddetail.view.block.ThreadDetailReplyBlock.C559021 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                ThreadDetailReplyBlock.this.f138090a.mo190439A();
            }
        });
        C25649b.m91856a(threadDetailReplyViewHolder.mTvSendReply, 14);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadDetailReplyViewHolder threadDetailReplyViewHolder, ChatMessageVO cVar) {
        this.f138091b.mo122649a((ThreadDetailCommonBlock.ThreadDetailCommonViewHolder) threadDetailReplyViewHolder, cVar);
        m217071a(threadDetailReplyViewHolder, cVar.mo121656B(), cVar);
        if (cVar.mo124235H()) {
            m217073a(threadDetailReplyViewHolder, true, cVar.mo121715w());
            m217072a(threadDetailReplyViewHolder, cVar.mo124234G());
            threadDetailReplyViewHolder.mReplyContent.setVisibility(8);
            return;
        }
        threadDetailReplyViewHolder.mOnboardingView.setVisibility(8);
        threadDetailReplyViewHolder.mReplyContent.setVisibility(0);
        m217073a(threadDetailReplyViewHolder, cVar.ak(), cVar.mo121715w());
    }

    /* renamed from: a */
    private void m217073a(ThreadDetailReplyViewHolder threadDetailReplyViewHolder, boolean z, int i) {
        if (z) {
            threadDetailReplyViewHolder.mReplyDesc.setVisibility(0);
            if (i > 0) {
                TextView textView = threadDetailReplyViewHolder.mReplyDesc;
                textView.setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title) + "  " + i);
            } else {
                threadDetailReplyViewHolder.mReplyDesc.setText(UIHelper.getString(R.string.Lark_Chat_Topic_DetailPage_Replies_Title));
            }
        } else {
            threadDetailReplyViewHolder.mReplyDesc.setVisibility(8);
        }
        Context context = threadDetailReplyViewHolder.f146209n.getContext();
        threadDetailReplyViewHolder.mReplyDesc.getLayoutParams().height = LKUIDisplayManager.m91881c(context, 50);
        C25649b.m91856a(threadDetailReplyViewHolder.mReplyDesc, 17);
    }

    /* renamed from: a */
    private void m217071a(final ThreadDetailReplyViewHolder threadDetailReplyViewHolder, SendStatus sendStatus, ChatMessageVO cVar) {
        if (sendStatus == null || sendStatus == SendStatus.SUCCESS) {
            UIUtils.hide(threadDetailReplyViewHolder.mSendStatus);
            UIUtils.hide(threadDetailReplyViewHolder.mSendingStatus);
            UIUtils.hide(threadDetailReplyViewHolder.mSendFailStatus);
            UIUtils.hide(threadDetailReplyViewHolder.mSendStatusDesc);
        } else if (sendStatus == SendStatus.FAIL) {
            UIUtils.show(threadDetailReplyViewHolder.mSendStatus);
            UIUtils.hide(threadDetailReplyViewHolder.mSendingStatus);
            UIUtils.show(threadDetailReplyViewHolder.mSendFailStatus);
            UIUtils.show(threadDetailReplyViewHolder.mSendStatusDesc);
            View$OnClickListenerC559032 r2 = new View.OnClickListener() {
                /* class com.ss.android.lark.threaddetail.view.block.ThreadDetailReplyBlock.View$OnClickListenerC559032 */

                public void onClick(View view) {
                    ThreadDetailReplyBlock.this.f138090a.mo190473e(threadDetailReplyViewHolder.mo200148l());
                }
            };
            threadDetailReplyViewHolder.mSendFailStatus.setOnClickListener(r2);
            threadDetailReplyViewHolder.mSendStatusDesc.setOnClickListener(r2);
            threadDetailReplyViewHolder.mSendStatusDesc.setText(UIHelper.getString(R.string.Lark_Legacy_ClickRetry));
            threadDetailReplyViewHolder.mSendStatusDesc.setTextColor(UIHelper.getColor(R.color.function_danger_500));
        } else {
            UIUtils.show(threadDetailReplyViewHolder.mSendStatus);
            UIUtils.show(threadDetailReplyViewHolder.mSendingStatus);
            UIUtils.hide(threadDetailReplyViewHolder.mSendFailStatus);
            UIUtils.show(threadDetailReplyViewHolder.mSendStatusDesc);
            threadDetailReplyViewHolder.mSendStatusDesc.setText(UIHelper.getString(R.string.Lark_Chat_Sending));
            threadDetailReplyViewHolder.mSendStatusDesc.setTextColor(UIHelper.getColor(R.color.function_info_500));
            threadDetailReplyViewHolder.mSendStatusDesc.setOnClickListener(null);
        }
        C25649b.m91853a(threadDetailReplyViewHolder.mSendingStatus, 16);
        C25649b.m91853a(threadDetailReplyViewHolder.mSendFailStatus, 16);
        C25649b.m91856a(threadDetailReplyViewHolder.mSendStatusDesc, 14);
    }
}
