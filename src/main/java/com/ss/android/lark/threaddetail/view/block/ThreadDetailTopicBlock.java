package com.ss.android.lark.threaddetail.view.block;

import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Pin;
import com.ss.android.lark.chat.utils.C34357v;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.threaddetail.view.C55869b;
import com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock;
import com.ss.android.lark.threaddetail.view.message.C55934b;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b;

public class ThreadDetailTopicBlock extends AbstractC59004b<ChatMessageVO, ThreadDetailContentViewHolder> {

    /* renamed from: a */
    private final AbstractC36503q f138096a = C29990c.m110930b().mo134586n();

    /* renamed from: b */
    private final ThreadDetailCommonBlock f138097b;

    /* renamed from: c */
    private final C55934b f138098c;

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadDetailContentViewHolder extends ThreadDetailCommonBlock.ThreadDetailCommonViewHolder {
        @BindView(9158)
        public TextView mCloseStatusTv;
        @BindView(9053)
        public TextView mForwardDescription;
        @BindView(8412)
        public TextView mPinDesc;
        @BindView(8413)
        public ImageView mPinImage;

        ThreadDetailContentViewHolder() {
        }
    }

    public class ThreadDetailContentViewHolder_ViewBinding extends ThreadDetailCommonBlock.ThreadDetailCommonViewHolder_ViewBinding {

        /* renamed from: a */
        private ThreadDetailContentViewHolder f138099a;

        @Override // com.ss.android.lark.threaddetail.view.block.ThreadDetailCommonBlock.ThreadDetailCommonViewHolder_ViewBinding, butterknife.Unbinder
        public void unbind() {
            ThreadDetailContentViewHolder threadDetailContentViewHolder = this.f138099a;
            if (threadDetailContentViewHolder != null) {
                this.f138099a = null;
                threadDetailContentViewHolder.mPinDesc = null;
                threadDetailContentViewHolder.mPinImage = null;
                threadDetailContentViewHolder.mCloseStatusTv = null;
                threadDetailContentViewHolder.mForwardDescription = null;
                super.unbind();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadDetailContentViewHolder_ViewBinding(ThreadDetailContentViewHolder threadDetailContentViewHolder, View view) {
            super(threadDetailContentViewHolder, view);
            this.f138099a = threadDetailContentViewHolder;
            threadDetailContentViewHolder.mPinDesc = (TextView) Utils.findRequiredViewAsType(view, R.id.pin_desc, "field 'mPinDesc'", TextView.class);
            threadDetailContentViewHolder.mPinImage = (ImageView) Utils.findRequiredViewAsType(view, R.id.pin_img, "field 'mPinImage'", ImageView.class);
            threadDetailContentViewHolder.mCloseStatusTv = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_topic_close_status, "field 'mCloseStatusTv'", TextView.class);
            threadDetailContentViewHolder.mForwardDescription = (TextView) Utils.findRequiredViewAsType(view, R.id.topic_forward_description, "field 'mForwardDescription'", TextView.class);
        }
    }

    public ThreadDetailTopicBlock(C55934b bVar, ThreadDetailCommonBlock threadDetailCommonBlock) {
        this.f138097b = threadDetailCommonBlock;
        this.f138098c = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadDetailContentViewHolder threadDetailContentViewHolder, ChatMessageVO cVar) {
        this.f138097b.mo122649a((ThreadDetailCommonBlock.ThreadDetailCommonViewHolder) threadDetailContentViewHolder, cVar);
        m217077a(threadDetailContentViewHolder, cVar.mo121659E());
        m217078a(threadDetailContentViewHolder, cVar.mo124234G());
        m217079b(threadDetailContentViewHolder, cVar);
    }

    /* renamed from: a */
    private void m217077a(ThreadDetailContentViewHolder threadDetailContentViewHolder, Pin pin) {
        if (pin != null) {
            threadDetailContentViewHolder.mPinDesc.setVisibility(0);
            threadDetailContentViewHolder.mPinImage.setVisibility(0);
            threadDetailContentViewHolder.mPinDesc.setText(UIHelper.mustacheFormat((int) R.string.Lark_Groups_PostPinTip, "user_name", pin.getOperatorDisplayName()));
        } else {
            threadDetailContentViewHolder.mPinDesc.setVisibility(8);
            threadDetailContentViewHolder.mPinImage.setVisibility(8);
        }
        C25649b.m91856a(threadDetailContentViewHolder.mPinDesc, 12);
        C25649b.m91853a(threadDetailContentViewHolder.mPinImage, 13);
    }

    /* renamed from: a */
    private void m217078a(ThreadDetailContentViewHolder threadDetailContentViewHolder, boolean z) {
        if (z) {
            threadDetailContentViewHolder.mCloseStatusTv.setText(C55869b.m217003a((int) R.string.Lark_Groups_PostStatusClosedTip));
            threadDetailContentViewHolder.mCloseStatusTv.setVisibility(0);
        } else {
            threadDetailContentViewHolder.mCloseStatusTv.setVisibility(8);
        }
        C25649b.m91856a(threadDetailContentViewHolder.mCloseStatusTv, 12);
        threadDetailContentViewHolder.mCloseStatusTv.getLayoutParams().height = LKUIDisplayManager.m91881c(this.f138098c.mo122543g(), 28);
        Drawable drawable = UIHelper.getDrawable(R.drawable.ic_svg_thread_topic_close);
        drawable.setBounds(0, 0, LKUIDisplayManager.m91881c(this.f138098c.mo122543g(), 14), LKUIDisplayManager.m91881c(this.f138098c.mo122543g(), 14));
        threadDetailContentViewHolder.mCloseStatusTv.setCompoundDrawables(drawable, null, null, null);
    }

    /* renamed from: b */
    private void m217079b(ThreadDetailContentViewHolder threadDetailContentViewHolder, ChatMessageVO cVar) {
        String str;
        if (!this.f138096a.mo134685a("lark.overseas.forward") || cVar.ad() == null) {
            threadDetailContentViewHolder.mForwardDescription.setVisibility(8);
            return;
        }
        FragmentActivity g = this.f138098c.mo122543g();
        String string = UIHelper.getString(R.string.Lark_Chat_MessageForward);
        String g2 = cVar.ad().mo124214g();
        if (!cVar.af() || cVar.ad().mo124230r()) {
            str = "";
        } else {
            str = cVar.ae();
        }
        SpannableStringBuilder a = C34357v.m133267a(g, string, "{{name}}", g2, str, cVar.mo121692b());
        threadDetailContentViewHolder.mForwardDescription.setMovementMethod(LinkMovementMethod.getInstance());
        threadDetailContentViewHolder.mForwardDescription.setVisibility(0);
        threadDetailContentViewHolder.mForwardDescription.setText(a);
        C25649b.m91856a(threadDetailContentViewHolder.mForwardDescription, 12);
        Drawable drawable = UIHelper.getDrawable(R.drawable.ic_svg_message_tag_forward);
        drawable.setBounds(0, 0, LKUIDisplayManager.m91881c(this.f138098c.mo122543g(), 12), LKUIDisplayManager.m91881c(this.f138098c.mo122543g(), 12));
        threadDetailContentViewHolder.mForwardDescription.setCompoundDrawables(drawable, null, null, null);
    }
}
