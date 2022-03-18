package com.ss.android.lark.threadwindow.view.message;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33290a;
import com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e;

public class ThreadWindowTabOnBoardingCell extends AbstractC33290a<ContentVO<?>, ThreadWindowTabOnBoardingViewHolder> {

    /* renamed from: a */
    public final AbstractC56198a f139071a;

    /* renamed from: com.ss.android.lark.threadwindow.view.message.ThreadWindowTabOnBoardingCell$a */
    public interface AbstractC56198a {
        /* renamed from: C */
        void mo191268C();
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.item_thread_tab_onboarding;
    }

    /* access modifiers changed from: package-private */
    public static class ThreadWindowTabOnBoardingViewHolder extends AbstractC59010e {
        @BindView(7935)
        public ImageView mIvThreadOnboarding;
        @BindView(8083)
        public LinearLayout mOnboardingLayout;
        @BindView(7333)
        public Button mSendThreadBtn;
        @BindView(9153)
        public TextView mTvThreadOnboarding;

        ThreadWindowTabOnBoardingViewHolder() {
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59010e
        /* renamed from: a */
        public void mo122652a(View view) {
            ButterKnife.bind(this, view);
            C25649b.m91856a(this.mTvThreadOnboarding, 14);
            this.mSendThreadBtn.getLayoutParams().height = LKUIDisplayManager.m91881c(view.getContext(), 32);
            C25649b.m91856a((TextView) this.mSendThreadBtn, 16);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: a */
    public Class<?> mo122646a() {
        return PostContentVO.class;
    }

    public class ThreadWindowTabOnBoardingViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private ThreadWindowTabOnBoardingViewHolder f139073a;

        @Override // butterknife.Unbinder
        public void unbind() {
            ThreadWindowTabOnBoardingViewHolder threadWindowTabOnBoardingViewHolder = this.f139073a;
            if (threadWindowTabOnBoardingViewHolder != null) {
                this.f139073a = null;
                threadWindowTabOnBoardingViewHolder.mOnboardingLayout = null;
                threadWindowTabOnBoardingViewHolder.mSendThreadBtn = null;
                threadWindowTabOnBoardingViewHolder.mTvThreadOnboarding = null;
                threadWindowTabOnBoardingViewHolder.mIvThreadOnboarding = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public ThreadWindowTabOnBoardingViewHolder_ViewBinding(ThreadWindowTabOnBoardingViewHolder threadWindowTabOnBoardingViewHolder, View view) {
            this.f139073a = threadWindowTabOnBoardingViewHolder;
            threadWindowTabOnBoardingViewHolder.mOnboardingLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.ll_thread_onboarding, "field 'mOnboardingLayout'", LinearLayout.class);
            threadWindowTabOnBoardingViewHolder.mSendThreadBtn = (Button) Utils.findRequiredViewAsType(view, R.id.btn_send_thread, "field 'mSendThreadBtn'", Button.class);
            threadWindowTabOnBoardingViewHolder.mTvThreadOnboarding = (TextView) Utils.findRequiredViewAsType(view, R.id.tv_thread_onboarding, "field 'mTvThreadOnboarding'", TextView.class);
            threadWindowTabOnBoardingViewHolder.mIvThreadOnboarding = (ImageView) Utils.findRequiredViewAsType(view, R.id.iv_thread_onboarding, "field 'mIvThreadOnboarding'", ImageView.class);
        }
    }

    public ThreadWindowTabOnBoardingCell(AbstractC33342d dVar, AbstractC56198a aVar) {
        super(dVar);
        this.f139071a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo122649a(ThreadWindowTabOnBoardingViewHolder threadWindowTabOnBoardingViewHolder, AbsMessageVO<ContentVO<?>> aVar) {
        super.mo122648a((AbstractC59010e) threadWindowTabOnBoardingViewHolder, (AbsMessageVO) aVar);
        threadWindowTabOnBoardingViewHolder.mOnboardingLayout.setVisibility(0);
        TextView textView = threadWindowTabOnBoardingViewHolder.mTvThreadOnboarding;
        textView.setText(UIHelper.getString(R.string.Lark_Groups_PostOnboardingTipOne) + "\n" + UIHelper.getString(R.string.Lark_Groups_PostOnboardingTipTwo));
        threadWindowTabOnBoardingViewHolder.mSendThreadBtn.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.threadwindow.view.message.ThreadWindowTabOnBoardingCell.C561971 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (ThreadWindowTabOnBoardingCell.this.f139071a != null) {
                    ThreadWindowTabOnBoardingCell.this.f139071a.mo191268C();
                }
            }
        });
    }
}
