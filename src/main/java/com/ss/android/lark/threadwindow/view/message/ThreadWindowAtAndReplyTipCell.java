package com.ss.android.lark.threadwindow.view.message;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.huawei.hms.api.ConnectionResult;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.base.view.vo.message.AtAndReplyTipVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class ThreadWindowAtAndReplyTipCell extends AbstractC33290a<AtAndReplyTipVO, ThreadWindowTabAtTipViewHolder> {

    /* renamed from: c */
    private static final int f138960c = UIHelper.dp2px(20.0f);

    /* renamed from: a */
    public final AbstractC56170a f138961a;

    /* renamed from: b */
    public boolean f138962b;

    /* renamed from: e */
    private final AbstractC33342d f138963e;

    /* renamed from: com.ss.android.lark.threadwindow.view.message.ThreadWindowAtAndReplyTipCell$a */
    public interface AbstractC56170a {
        /* renamed from: c */
        void mo191299c(boolean z);
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_at_and_reply_tip;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadWindowTabAtTipViewHolder extends AbstractC59010e {
        @BindView(7206)
        public ImageView atAvatarIV;
        @BindView(ConnectionResult.SERVICE_UPDATING)
        public View rootView;
        @BindView(ConnectionResult.SIGN_IN_FAILED)
        public TextView tipsTV;

        ThreadWindowTabAtTipViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            C25649b.m91853a(this.atAvatarIV, 20);
            C25649b.m91856a(this.tipsTV, 14);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return AtAndReplyTipVO.class;
    }

    public class ThreadWindowTabAtTipViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadWindowTabAtTipViewHolder f138965a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadWindowTabAtTipViewHolder threadWindowTabAtTipViewHolder = this.f138965a;
            if (threadWindowTabAtTipViewHolder != null) {
                this.f138965a = null;
                threadWindowTabAtTipViewHolder.rootView = null;
                threadWindowTabAtTipViewHolder.atAvatarIV = null;
                threadWindowTabAtTipViewHolder.tipsTV = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadWindowTabAtTipViewHolder_ViewBinding(ThreadWindowTabAtTipViewHolder threadWindowTabAtTipViewHolder, View view) {
            this.f138965a = threadWindowTabAtTipViewHolder;
            threadWindowTabAtTipViewHolder.rootView = Utils.findRequiredView(view, R.id.tips_root, "field 'rootView'");
            threadWindowTabAtTipViewHolder.atAvatarIV = (ImageView) Utils.findRequiredViewAsType(view, R.id.at_avatar, "field 'atAvatarIV'", ImageView.class);
            threadWindowTabAtTipViewHolder.tipsTV = (TextView) Utils.findRequiredViewAsType(view, R.id.tips_tv, "field 'tipsTV'", TextView.class);
        }
    }

    public ThreadWindowAtAndReplyTipCell(AbstractC33342d dVar, AbstractC56170a aVar) {
        super(dVar);
        this.f138963e = dVar;
        this.f138961a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadWindowTabAtTipViewHolder threadWindowTabAtTipViewHolder, AbsMessageVO<AtAndReplyTipVO> aVar) {
        String str;
        int i;
        int i2;
        super.mo122648a((AbstractC59010e) threadWindowTabAtTipViewHolder, (AbsMessageVO) aVar);
        if (aVar != null) {
            AtAndReplyTipVO g = aVar.mo121699g();
            ChatChatter a = g.mo121793a();
            int b = g.mo121794b();
            int c = g.mo121795c();
            String str2 = "";
            if (a == null) {
                str = str2;
            } else {
                str = a.getAvatarKey();
            }
            if (a != null) {
                str2 = a.getId();
            }
            threadWindowTabAtTipViewHolder.rootView.setVisibility(0);
            if (c > 0) {
                this.f138962b = true;
                threadWindowTabAtTipViewHolder.atAvatarIV.setVisibility(0);
                m219021a(threadWindowTabAtTipViewHolder, str, str2);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) threadWindowTabAtTipViewHolder.tipsTV.getLayoutParams();
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = UIHelper.dp2px(4.0f);
                }
                threadWindowTabAtTipViewHolder.tipsTV.setLayoutParams(marginLayoutParams);
                if (c == 1) {
                    i2 = R.string.Lark_TopicChannel_OneNewMentionTip;
                } else {
                    i2 = R.string.Lark_TopicChannel_NewMentionsTip;
                }
                threadWindowTabAtTipViewHolder.tipsTV.setText(UIHelper.mustacheFormat(i2, "N", Integer.toString(c)));
            } else if (b > 0) {
                this.f138962b = false;
                threadWindowTabAtTipViewHolder.atAvatarIV.setVisibility(8);
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) threadWindowTabAtTipViewHolder.tipsTV.getLayoutParams();
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.leftMargin = UIHelper.dp2px(16.0f);
                }
                threadWindowTabAtTipViewHolder.tipsTV.setLayoutParams(marginLayoutParams2);
                if (b == 1) {
                    i = R.string.Lark_TopicChannel_OneTopicHasNewReplyTip;
                } else {
                    i = R.string.Lark_TopicChannel_NewRepliesTip;
                }
                threadWindowTabAtTipViewHolder.tipsTV.setText(UIHelper.mustacheFormat(i, "N", Integer.toString(b)));
            } else {
                threadWindowTabAtTipViewHolder.rootView.setVisibility(8);
            }
            threadWindowTabAtTipViewHolder.rootView.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowAtAndReplyTipCell.C561691 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    ThreadWindowAtAndReplyTipCell.this.f138961a.mo191299c(ThreadWindowAtAndReplyTipCell.this.f138962b);
                }
            });
        }
    }

    /* renamed from: a */
    private void m219021a(ThreadWindowTabAtTipViewHolder threadWindowTabAtTipViewHolder, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Context d = mo122719d();
            ImageView imageView = threadWindowTabAtTipViewHolder.atAvatarIV;
            int i = f138960c;
            C34336c.m133130a(d, imageView, str, str2, i, i, Scene.Thread);
            return;
        }
        ImageView imageView2 = threadWindowTabAtTipViewHolder.atAvatarIV;
        Context d2 = mo122719d();
        int i2 = f138960c;
        imageView2.setImageDrawable(C34336c.m133122a(d2, i2, i2, threadWindowTabAtTipViewHolder.atAvatarIV));
    }
}
