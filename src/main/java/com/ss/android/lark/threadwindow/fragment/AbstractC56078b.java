package com.ss.android.lark.threadwindow.fragment;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.chatwindow.chat.C33421q;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.threadtab.widget.ThreadTopicPtrHeader;
import com.ss.android.lark.threadwindow.C56145l;
import com.ss.android.lark.utils.C57764ab;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.List;

/* renamed from: com.ss.android.lark.threadwindow.fragment.b */
public abstract class AbstractC56078b extends BaseTopicFragment implements AbstractC56085c {

    /* renamed from: a */
    public final boolean f138681a = mo191325j();

    /* renamed from: b */
    public final int f138682b = mo67285b();

    /* renamed from: c */
    private final AbstractC36503q f138683c = C29990c.m110930b().mo134586n();

    /* renamed from: t */
    private ThreadTopicPtrHeader f138684t;

    /* renamed from: u */
    private RecyclerViewItemDetector<ThreadMessageVO> f138685u;

    /* renamed from: v */
    private boolean f138686v;

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo191317a(MessageInfo messageInfo) {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo67284a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo67285b();

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: b */
    public void mo191322b(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract String mo109394h();

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract Integer mo191324i();

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: m */
    public void mo191327m() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: n */
    public void mo191328n() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: p */
    public void mo191330p() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: q */
    public void mo191331q() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: r */
    public void mo191332r() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: t */
    public void mo191334t() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: u */
    public void mo191335u() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: w */
    public void mo191337w() {
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: v */
    public boolean mo191336v() {
        return this.f138686v;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: j */
    public boolean mo191325j() {
        return C56145l.m218886a();
    }

    /* renamed from: F */
    private void m218417F() {
        if (this.mOnboardingLayout.getVisibility() != 8) {
            this.mOnboardingLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: H */
    private /* synthetic */ void m218419H() {
        this.f138693s.mo190961a(mo191293c(this.mMessageRV), this.f138682b);
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: l */
    public void mo104653l() {
        RecyclerViewItemDetector<ThreadMessageVO> bVar = this.f138685u;
        if (bVar != null) {
            bVar.mo123939c();
        }
        this.f138598g.mo92349b();
        super.mo104653l();
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: s */
    public void mo191333s() {
        this.f138598g.mo92346a(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$b$o9ICgkM3mF3qm6303QJJTESuzTY */

            public final void run() {
                AbstractC56078b.this.m218419H();
            }
        }, 100);
    }

    /* renamed from: G */
    private void m218418G() {
        this.mOnboardingLayout.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mOnboardingLayout.getLayoutParams();
        layoutParams.height = -1;
        this.mOnboardingLayout.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: k */
    private void m218422k() {
        RecyclerViewItemDetector<ThreadMessageVO> bVar = new RecyclerViewItemDetector<>(this.mMessageRV, (RecyclerView.Adapter) this.f138597f, new RecyclerViewItemDetector.ItemDataProvider<ThreadMessageVO>() {
            /* class com.ss.android.lark.threadwindow.fragment.AbstractC56078b.C560791 */

            /* renamed from: a */
            public String mo123406a(ThreadMessageVO threadMessageVO) {
                return threadMessageVO.mo121681a();
            }

            /* renamed from: a */
            public ThreadMessageVO mo123407b(int i) {
                if (i < 0 || i >= AbstractC56078b.this.f138597f.getItemCount()) {
                    return null;
                }
                return AbstractC56078b.this.f138597f.mo191468b(i);
            }
        });
        this.f138685u = bVar;
        bVar.mo123935a(new RecyclerViewItemDetector.ItemDetectListener<ThreadMessageVO>() {
            /* class com.ss.android.lark.threadwindow.fragment.AbstractC56078b.C560802 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122146a() {
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122148a(boolean z, int i, int i2) {
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122147a(List<? extends ThreadMessageVO> list) {
                AbstractC56078b.this.f138598g.mo92346a(new Runnable() {
                    /* class com.ss.android.lark.threadwindow.fragment.AbstractC56078b.C560802.RunnableC560811 */

                    public void run() {
                        AbstractC56078b.this.mo191270E();
                    }
                }, 100);
            }
        });
        this.f138685u.mo123938b();
    }

    /* renamed from: e */
    public void mo67292e() {
        if (this.f138681a) {
            this.f138693s.mo190966d(this.f138682b);
        } else {
            this.f138693s.mo190963b(this.f138682b);
        }
    }

    /* renamed from: g */
    public void mo191323g() {
        if (this.f138681a) {
            this.f138693s.mo190963b(this.f138682b);
        } else {
            this.f138693s.mo190966d(this.f138682b);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: a */
    public void mo67278a() {
        super.mo67278a();
        this.f138684t = new ThreadTopicPtrHeader(this.f138595d, null, new ThreadTopicPtrHeader.OnUIResetListener() {
            /* class com.ss.android.lark.threadwindow.fragment.AbstractC56078b.C560823 */

            @Override // com.ss.android.lark.threadtab.widget.ThreadTopicPtrHeader.OnUIResetListener
            /* renamed from: a */
            public void mo190839a() {
                if (AbstractC56078b.this.f138607p) {
                    AbstractC56078b.this.f138607p = false;
                }
            }
        });
        this.mPtrFrame.setHeaderView(this.f138684t);
        this.mPtrFrame.addPtrUIHandler(this.f138684t);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.threadwindow.fragment.AbstractC56078b.C560834 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                PerfChatPerformanceMonitor.m213464a(true, Boolean.valueOf(!lKUIPtrFrameLayout.isAutoRefresh()));
                AbstractC56078b.this.mo67292e();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                PerfChatPerformanceMonitor.m213464a(false, Boolean.valueOf(!lKUIPtrFrameLayout.isAutoRefresh()));
                AbstractC56078b.this.mo191323g();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (AbstractC56078b.this.f138681a) {
                    if (!AbstractC56078b.this.f138693s.mo190965c(AbstractC56078b.this.f138682b) || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                        return false;
                    }
                    return true;
                } else if (!AbstractC56078b.this.f138693s.mo190962a(AbstractC56078b.this.f138682b) || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (AbstractC56078b.this.f138681a) {
                    if (!AbstractC56078b.this.f138693s.mo190962a(AbstractC56078b.this.f138682b) || !super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2)) {
                        return false;
                    }
                    return true;
                } else if (!AbstractC56078b.this.f138693s.mo190965c(AbstractC56078b.this.f138682b) || !super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        this.mMessageRV.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.threadwindow.fragment.AbstractC56078b.C560845 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
                AbstractC56087e eVar = AbstractC56078b.this.f138693s;
                AbstractC56078b bVar = AbstractC56078b.this;
                eVar.mo190961a(bVar.mo191293c(bVar.mMessageRV), AbstractC56078b.this.f138682b);
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector, androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
                AbstractC56078b.this.f138693s.mo190961a(AbstractC56078b.this.mo191294c(AbstractC56078b.this.f138597f.mo191466a(i, i2, true)), AbstractC56078b.this.f138682b);
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                if (AbstractC56078b.this.f138681a) {
                    if (i <= 5 && AbstractC56078b.this.f138693s.mo190962a(AbstractC56078b.this.f138682b)) {
                        AbstractC56078b.this.f138693s.mo190963b(AbstractC56078b.this.f138682b);
                    }
                    if (i2 >= AbstractC56078b.this.f138597f.getItemCount() - 5 && AbstractC56078b.this.f138693s.mo190965c(AbstractC56078b.this.f138682b)) {
                        AbstractC56078b.this.f138693s.mo190966d(AbstractC56078b.this.f138682b);
                        return;
                    }
                    return;
                }
                if (i <= 5 && AbstractC56078b.this.f138693s.mo190965c(AbstractC56078b.this.f138682b)) {
                    AbstractC56078b.this.f138693s.mo190966d(AbstractC56078b.this.f138682b);
                }
                if (i2 >= AbstractC56078b.this.f138597f.getItemCount() - 5 && AbstractC56078b.this.f138693s.mo190962a(AbstractC56078b.this.f138682b)) {
                    AbstractC56078b.this.f138693s.mo190963b(AbstractC56078b.this.f138682b);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: f */
    public void mo67293f() {
        super.mo67293f();
        this.mMessageRV.addItemDecoration(this.f138596e, 0);
        this.mMessageRV.addItemDecoration(new C33421q(this.f138597f));
        if (!this.f138681a && C57764ab.m224186a(this.f138595d)) {
            this.mMessageRV.setPadding(0, 0, 0, C57764ab.m224185a((Context) this.f138595d) + UIHelper.dp2px(55.0f));
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: o */
    private void m218423o() {
        this.mOnboardingLayout.setVisibility(4);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mOnboardingLayout.getLayoutParams();
        layoutParams.height = -1;
        this.mOnboardingLayout.setLayoutParams(layoutParams);
        this.mOnboardingLayout.setBackgroundColor(UDColorUtils.getColor(this.f138595d, R.color.imtoken_message_topic_group_bg));
        this.mSendThreadBtn.setVisibility(8);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.mTvThreadOnboarding.getLayoutParams();
        layoutParams2.topMargin = UIHelper.dp2px(12.0f);
        this.mTvThreadOnboarding.setLayoutParams(layoutParams2);
        this.mTvThreadOnboarding.setText(mo109394h());
        this.mTvThreadOnboarding.setTextColor(UDColorUtils.getColor(this.f138595d, R.color.text_caption));
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.mIvThreadOnboarding.getLayoutParams();
        layoutParams3.height = -2;
        layoutParams3.width = -2;
        layoutParams3.topMargin = UIHelper.dp2px(126.0f);
        this.mIvThreadOnboarding.setLayoutParams(layoutParams3);
        this.mIvThreadOnboarding.setImageResource(mo191324i().intValue());
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56085c
    /* renamed from: f */
    public void mo191350f(int i) {
        mo191333s();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m218421h(int i) {
        int c = this.f138597f.mo191470c(i);
        if (c == -1) {
            Log.m165383e("FilterTopicFragment", "Failed to find thread, position is:" + i);
            int itemCount = this.f138597f.getItemCount();
            if (itemCount <= 0) {
                return;
            }
            if (this.f138681a) {
                this.mMessageRV.scrollToPosition(0);
            } else {
                this.mMessageRV.scrollToPosition(itemCount - 1);
            }
        } else {
            C58996h.m228974a((RecyclerView) this.mMessageRV, c, 0);
        }
    }

    /* renamed from: e */
    public void mo191349e(boolean z) {
        if (this.mMessageRV.getScrollState() == 0) {
            if (this.f138681a) {
                mo191266A();
            } else {
                mo191305z();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.base.fragment.AbstractC29528b, com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: a */
    public void mo67279a(View view) {
        super.mo67279a(view);
        mo191269D();
        mo191302e(0);
        mo67278a();
        mo67293f();
        m218423o();
        m218422k();
        this.f138693s.mo190967e(mo67285b());
        this.f138686v = true;
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56085c
    /* renamed from: a */
    public void mo191345a(int i, int i2) {
        mo191288b(i2);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56085c
    /* renamed from: b */
    public void mo191348b(int i, int i2) {
        mo191295c(i2);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo191315a(int i, boolean z) {
        if (z) {
            this.f138598g.mo92346a(new Runnable(i) {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$b$Wv5P3GtFAoLeLzfTrsFhF7aNz6U */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    AbstractC56078b.this.m218421h(this.f$1);
                }
            }, 200);
        } else {
            m218421h(i);
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a
    /* renamed from: a */
    public void mo190444a(View view, AbsMessageVO aVar) {
        this.f138693s.mo190955a(aVar, mo67285b());
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56085c
    /* renamed from: a */
    public void mo191346a(int i, int i2, boolean z) {
        mo191315a(i, z);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo191319a(boolean z, boolean z2, List<ThreadMessageVO> list) {
        boolean z3;
        if (this.f138597f.getItemCount() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && z2) {
            mo191349e(z);
        }
        this.f138597f.mo191467a(list);
        mo191333s();
        if (CollectionUtils.isEmpty(list)) {
            m218418G();
        } else {
            m218417F();
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56085c
    /* renamed from: a */
    public void mo191347a(int i, boolean z, boolean z2, List<ThreadMessageVO> list) {
        mo191319a(z, z2, list);
    }
}
