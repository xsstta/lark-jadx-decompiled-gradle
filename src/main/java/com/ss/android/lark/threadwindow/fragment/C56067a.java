package com.ss.android.lark.threadwindow.fragment;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.sdk.Sdk;
import com.google.gson.Gson;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.AbstractC32812c;
import com.ss.android.lark.chat.base.view.vo.ThreadMessageVO;
import com.ss.android.lark.chat.chatwindow.chat.C33421q;
import com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.utils.MessagePositionUtils;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chatwindow.view.tip.AbstractC35310a;
import com.ss.android.lark.chatwindow.view.tip.C35324c;
import com.ss.android.lark.chatwindow.view.tip.p1728a.C35314a;
import com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35320b;
import com.ss.android.lark.chatwindow.view.tip.p1729b.C35322d;
import com.ss.android.lark.dependency.AbstractC36503q;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.eetroublecapture.C36969b;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.perf.PerfChatPerformanceMonitor;
import com.ss.android.lark.statistics.thread.ThreadTopicHitPoint;
import com.ss.android.lark.threadwindow.C56145l;
import com.ss.android.lark.threadwindow.handler.C56097a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57764ab;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.C58996h;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.lark.threadwindow.fragment.a */
public class C56067a extends BaseTopicFragment implements AbstractC36982d {

    /* renamed from: A */
    private boolean f138653A;

    /* renamed from: B */
    private final AbstractC36503q f138654B = C29990c.m110930b().mo134586n();

    /* renamed from: C */
    private RecyclerViewItemDetector<ThreadMessageVO> f138655C;

    /* renamed from: D */
    private boolean f138656D = false;

    /* renamed from: E */
    private ChatWindowPtrLoadingHeader f138657E;

    /* renamed from: a */
    public C35324c f138658a;

    /* renamed from: b */
    public final boolean f138659b = C29990c.m110930b().mo134586n().mo134685a("feature.lark.thread.window.detector");

    /* renamed from: c */
    public final boolean f138660c = C56145l.m218886a();

    /* renamed from: t */
    private final AbstractC35310a.AbstractC35312b f138661t = new C35314a();

    /* renamed from: u */
    private ViewTreeObserver.OnGlobalLayoutListener f138662u;

    /* renamed from: v */
    private final OnSingleClickListener f138663v = new OnSingleClickListener() {
        /* class com.ss.android.lark.threadwindow.fragment.C56067a.C560681 */

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            if (C56067a.this.f138693s.mo190969i()) {
                C56067a.this.f138693s.mo190970j();
                return;
            }
            C56067a aVar = C56067a.this;
            aVar.mo191292b(UIUtils.getString(aVar.f138595d, R.string.Lark_Group_GroupOwnerAdminBannedNewTopics));
        }
    };

    /* renamed from: w */
    private boolean f138664w;

    /* renamed from: x */
    private boolean f138665x = true;

    /* renamed from: y */
    private TimerTask f138666y;

    /* renamed from: z */
    private ScheduledFuture f138667z;

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: n */
    public void mo191328n() {
        m218353G();
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: v */
    public boolean mo191336v() {
        return this.f138653A;
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo191319a(boolean z, boolean z2, List<ThreadMessageVO> list) {
        boolean z3 = this.f138597f.getItemCount() == 0;
        mo191270E();
        this.f138597f.mo191467a(list);
        m218364d(list);
        if (z3) {
            C29990c.m110930b().mo134577e().mo120977h();
            if (z2) {
                m218366e(z);
                mo191329o();
                return;
            }
            mo191315a(this.f138693s.mo190975m(), false);
        }
    }

    /* renamed from: G */
    private void m218353G() {
        this.mOnboardingLayout.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m218359M() {
        mo191316a((RecyclerView) this.mMessageRV);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m218360N() {
        C35324c cVar = this.f138658a;
        if (cVar != null) {
            cVar.mo129985d();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m218361O() {
        mo191316a((RecyclerView) this.mMessageRV);
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ Chat m218362P() {
        return this.f138693s.mo190968h();
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: q */
    public void mo191331q() {
        C35324c cVar = this.f138658a;
        if (cVar != null) {
            cVar.mo129989h();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ void m218357K() {
        this.f138693s.mo190961a(mo191293c(this.mMessageRV), 0);
    }

    /* renamed from: b */
    public void mo67285b() {
        if (this.f138660c) {
            this.f138693s.mo190792e();
        } else {
            this.f138693s.mo190787c();
        }
    }

    /* renamed from: e */
    public void mo67292e() {
        if (this.f138660c) {
            this.f138693s.mo190787c();
        } else {
            this.f138693s.mo190792e();
        }
    }

    /* renamed from: k */
    public void mo191326k() {
        this.f138598g.mo92346a(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$4AgvwYPNReskOSJ70DQ4fzsS2Cg */

            public final void run() {
                C56067a.this.m218361O();
            }
        }, 100);
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        Log.m165389i("AllTopicFragment", "onPause");
        mo191334t();
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: r */
    public void mo191332r() {
        this.mMessageRV.post(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$CvILnMM8zX79VrnFA6Sxy2Tz9s */

            public final void run() {
                C56067a.this.m218358L();
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: s */
    public void mo191333s() {
        this.f138598g.mo92346a(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$wX8dUGbW0ooa4JwMHdfh8ExYOQ */

            public final void run() {
                C56067a.this.m218357K();
            }
        }, 100);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: w */
    public void mo191337w() {
        this.mMessageRV.post(new Runnable() {
            /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$pQ0K8fjhRlzd7Rb1Thaq9WgPuzg */

            public final void run() {
                C56067a.this.m218356J();
            }
        });
    }

    /* renamed from: I */
    private void m218355I() {
        if (this.mMessageRV.getChildCount() > 0) {
            this.f138656D = true;
            this.mMessageRV.post(new Runnable() {
                /* class com.ss.android.lark.threadwindow.fragment.C56067a.RunnableC560714 */

                public void run() {
                    AbstractC32812c e = C29990c.m110930b().mo134577e();
                    e.mo120979j();
                    e.mo120955a(C56067a.this.f138595d);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public /* synthetic */ void m218358L() {
        if (this.f138597f.getItemCount() > 0) {
            this.mMessageRV.smoothScrollToPosition(0);
            mo191316a((RecyclerView) this.mMessageRV);
        }
    }

    /* renamed from: g */
    public void mo191323g() {
        C58996h.m228979b(this.mMessageRV, mo191325j(), this.f138693s.mo190972k() + UIHelper.dp2px(20.0f));
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: m */
    public void mo191327m() {
        if (this.f138693s == null || !this.f138693s.mo190978p()) {
            this.f138598g.mo92346a(new Runnable() {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$n9n91ydQfRyBSS1mJvxb6XU77Lg */

                public final void run() {
                    C56067a.this.m218360N();
                }
            }, 1000);
        }
    }

    /* renamed from: o */
    public void mo191329o() {
        if (this.f138693s == null || !this.f138693s.mo190978p()) {
            this.f138598g.mo92346a(new Runnable() {
                /* class com.ss.android.lark.threadwindow.fragment.C56067a.RunnableC560703 */

                public void run() {
                    if (C56067a.this.f138658a != null) {
                        C56067a.this.f138658a.mo129986e();
                    }
                }
            }, 1000);
        }
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b, androidx.fragment.app.Fragment, com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    public void onResume() {
        super.onResume();
        Log.m165389i("AllTopicFragment", "onResume");
        if (this.f138693s.mo190977o()) {
            mo191335u();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.lark.desktopmode.p1787a.C36516a
    public void onStop() {
        super.onStop();
        MessagePositionUtils.m133220a(this.f138693s.mo190968h(), this.mMessageRV, new MessagePositionUtils.IMessagePosInfo() {
            /* class com.ss.android.lark.threadwindow.fragment.C56067a.C560736 */

            @Override // com.ss.android.lark.chat.utils.MessagePositionUtils.IMessagePosInfo
            /* renamed from: a */
            public int mo123385a() {
                return C56067a.this.f138597f.getItemCount();
            }

            @Override // com.ss.android.lark.chat.utils.MessagePositionUtils.IMessagePosInfo
            /* renamed from: a */
            public AbsMessageVO<?> mo123386a(int i) {
                return C56067a.this.f138597f.mo191468b(i);
            }
        });
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: p */
    public void mo191330p() {
        C35324c cVar;
        if ((this.f138693s == null || !this.f138693s.mo190978p()) && (cVar = this.f138658a) != null) {
            cVar.mo129988g();
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: t */
    public void mo191334t() {
        ScheduledFuture scheduledFuture = this.f138667z;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.f138667z.cancel(true);
            this.f138667z = null;
        }
    }

    /* renamed from: F */
    private void m218352F() {
        if (!this.f138659b) {
            Log.m165389i("AllTopicFragment", "use old scroll listener");
            return;
        }
        Log.m165389i("AllTopicFragment", "use item detector");
        RecyclerViewItemDetector<ThreadMessageVO> bVar = new RecyclerViewItemDetector<>(this.mMessageRV, (RecyclerView.Adapter) this.f138597f, new RecyclerViewItemDetector.ItemDataProvider<ThreadMessageVO>() {
            /* class com.ss.android.lark.threadwindow.fragment.C56067a.AnonymousClass11 */

            /* renamed from: a */
            public String mo123406a(ThreadMessageVO threadMessageVO) {
                return threadMessageVO.mo121681a();
            }

            /* renamed from: a */
            public ThreadMessageVO mo123407b(int i) {
                if (i < 0 || i >= C56067a.this.f138597f.getItemCount()) {
                    return null;
                }
                return C56067a.this.f138597f.mo191468b(i);
            }
        });
        this.f138655C = bVar;
        bVar.mo123935a(new RecyclerViewItemDetector.ItemDetectListener<ThreadMessageVO>() {
            /* class com.ss.android.lark.threadwindow.fragment.C56067a.AnonymousClass12 */

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122148a(boolean z, int i, int i2) {
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122146a() {
                C56067a aVar = C56067a.this;
                aVar.mo191316a((RecyclerView) aVar.mMessageRV);
            }

            @Override // com.ss.android.lark.chat.chatwindow.chat.v2.widget.RecyclerViewItemDetector.ItemDetectListener
            /* renamed from: a */
            public void mo122147a(List<? extends ThreadMessageVO> list) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < list.size(); i++) {
                    ThreadMessageVO threadMessageVO = (ThreadMessageVO) list.get(i);
                    if (threadMessageVO != null) {
                        arrayList.add(threadMessageVO.mo121681a());
                    }
                }
                C56067a.this.f138693s.mo190960a(arrayList);
                C56067a.this.mo191318a(new ArrayList(list));
            }
        });
        this.f138655C.mo123938b();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ void m218356J() {
        try {
            int itemCount = this.f138597f.getItemCount() - 1;
            if (itemCount != -1) {
                this.mMessageRV.smoothScrollToPosition(itemCount);
            }
        } catch (Exception e) {
            Log.m165383e("AllTopicFragment", "asyncScrollToBottom exception=" + e.getMessage());
        }
        mo191316a((RecyclerView) this.mMessageRV);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: a */
    public void mo67278a() {
        super.mo67278a();
        this.f138657E = new ChatWindowPtrLoadingHeader(this.f138595d);
        this.mPtrFrame.setHeaderView(this.f138657E);
        this.mPtrFrame.addPtrUIHandler(this.f138657E);
        this.mPtrFrame.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.threadwindow.fragment.C56067a.C560747 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                PerfChatPerformanceMonitor.m213464a(true, Boolean.valueOf(!lKUIPtrFrameLayout.isAutoRefresh()));
                C56067a.this.mo67285b();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                PerfChatPerformanceMonitor.m213464a(false, Boolean.valueOf(!lKUIPtrFrameLayout.isAutoRefresh()));
                C56067a.this.mo67292e();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (C56067a.this.f138660c) {
                    if (!C56067a.this.f138693s.mo190791d() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                        return false;
                    }
                    return true;
                } else if (!C56067a.this.f138693s.mo190785b() || !super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (C56067a.this.f138660c) {
                    if (!C56067a.this.f138693s.mo190785b() || !super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2)) {
                        return false;
                    }
                    return true;
                } else if (!C56067a.this.f138693s.mo190791d() || !super.checkCanDoRefresh(lKUIPtrFrameLayout, view, view2)) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        this.mMessageRV.addOnScrollListener(new RecyclerViewScrollDetector() {
            /* class com.ss.android.lark.threadwindow.fragment.C56067a.C560758 */

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollToBottom() {
                C56067a.this.f138599h = System.currentTimeMillis();
                if (!C56067a.this.f138659b) {
                    C56067a aVar = C56067a.this;
                    aVar.mo191316a((RecyclerView) aVar.mMessageRV);
                }
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector, androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollStop(int i, int i2) {
                Log.m165389i("AllTopicFragment", "onScrollStop, startIndex:" + i + ", endIndex:" + i2);
                C56067a.this.f138599h = System.currentTimeMillis();
                C56067a.this.f138600i = false;
                if (!C56067a.this.f138659b) {
                    C56067a.this.f138693s.mo190960a(C56067a.this.mo191294c(C56067a.this.f138597f.mo191466a(i, i2, true)));
                }
            }

            @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
            public void onScrollPassed(int i, int i2) {
                C56067a.this.f138599h = System.currentTimeMillis();
                if (C56067a.this.f138660c) {
                    if (i <= 5 && C56067a.this.f138693s.mo190785b()) {
                        C56067a.this.mPtrFrame.autoRefresh();
                    }
                    if (i2 >= C56067a.this.f138597f.getItemCount() - 5 && C56067a.this.f138693s.mo190791d()) {
                        C56067a.this.mPtrFrame.autoLoadMore();
                    }
                } else {
                    if (i <= 5 && C56067a.this.f138693s.mo190791d()) {
                        C56067a.this.mPtrFrame.autoRefresh();
                    }
                    if (i2 >= C56067a.this.f138597f.getItemCount() - 5 && C56067a.this.f138693s.mo190785b()) {
                        C56067a.this.mPtrFrame.autoLoadMore();
                    }
                }
                if (!C56067a.this.f138659b) {
                    C56067a.this.mo191318a(C56067a.this.f138597f.mo191466a(i, i2, false));
                }
            }
        });
    }

    @Override // com.ss.android.lark.base.fragment.AbstractC29528b
    /* renamed from: l */
    public void mo104653l() {
        super.mo104653l();
        C35324c cVar = this.f138658a;
        if (cVar != null) {
            cVar.mo129987f();
        }
        this.f138598g.mo92349b();
        mo191334t();
        if (this.f138662u != null) {
            this.mMessageRV.getViewTreeObserver().removeOnGlobalLayoutListener(this.f138662u);
        }
        RecyclerViewItemDetector<ThreadMessageVO> bVar = this.f138655C;
        if (bVar != null) {
            bVar.mo123939c();
        }
    }

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        try {
            List<Map<String, String>> b = C36969b.m145958b(getView().findViewById(R.id.message_view));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("channel_id", mo191303x());
            linkedHashMap.put("messages", b);
            String str = "user screenshot accompanying infos:" + new Gson().toJson(linkedHashMap);
            Log.m165389i("AllTopicFragment", str);
            Sdk.log("screenshot", str);
        } catch (Exception e) {
            Log.m165382e(e.getMessage());
        }
    }

    /* renamed from: j */
    public int mo191325j() {
        if (this.f138660c) {
            List<ThreadMessageVO> a = this.f138597f.mo191465a();
            int i = 0;
            while (i <= a.size() - 1 && !a.get(i).mo121664J()) {
                i++;
            }
            return i;
        }
        List<ThreadMessageVO> a2 = this.f138597f.mo191465a();
        int size = a2.size() - 1;
        while (size >= 0 && !a2.get(size).mo121664J()) {
            size--;
        }
        return size;
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: u */
    public void mo191335u() {
        int e = C56097a.m218572d().mo107775e();
        if (e != 0 && this.f138667z == null) {
            this.f138666y = new TimerTask() {
                /* class com.ss.android.lark.threadwindow.fragment.C56067a.C560725 */

                public void run() {
                    RecyclerView.LayoutManager layoutManager = C56067a.this.mMessageRV.getLayoutManager();
                    if (layoutManager instanceof LinearLayoutManager) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) C56067a.this.mMessageRV.getLayoutManager();
                        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                        if (findFirstVisibleItemPosition >= 0 && findLastVisibleItemPosition >= 0) {
                            int i = findFirstVisibleItemPosition;
                            while (i <= findLastVisibleItemPosition && i < C56067a.this.f138597f.getItemCount()) {
                                ThreadMessageVO b = C56067a.this.f138597f.mo191468b(i);
                                if (b == null) {
                                    Log.m165383e("AllTopicFragment", "i=" + i + "itemdata == null");
                                    return;
                                }
                                View childAt = layoutManager.getChildAt(i - findFirstVisibleItemPosition);
                                if (childAt == null) {
                                    Log.m165383e("AllTopicFragment", "i=" + i + "view == null");
                                } else {
                                    Rect rect = new Rect();
                                    childAt.getLocalVisibleRect(rect);
                                    int measuredHeight = childAt.getMeasuredHeight();
                                    ThreadTopicHitPoint.f135906a.mo187717a(b.mo121662H(), "-1", measuredHeight, rect.bottom - rect.top, (int) C56067a.this.f138599h, C56067a.this.f138600i, b.af(), b.mo121692b());
                                }
                                i++;
                            }
                        }
                    }
                }
            };
            Log.m165389i("AllTopicFragment", "thread interval=" + e);
            long j = (long) e;
            this.f138667z = CoreThreadPool.getDefault().getScheduleThreadPool().scheduleWithFixedDelay(this.f138666y, j, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: H */
    private void m218354H() {
        if (this.f138693s == null || !this.f138693s.mo190978p()) {
            C35322d dVar = new C35322d(new AbstractC35320b() {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$QWEnBAr3Ye37nPekPmqnjgDUCyk */

                @Override // com.ss.android.lark.chatwindow.view.tip.p1729b.AbstractC35320b
                public final Object get() {
                    return C56067a.this.m218362P();
                }
            });
            if (this.f138660c) {
                this.f138658a = new C35324c(this.f138595d, dVar, this.newMessageTopTipReverse, this.newMessageBottomTipReverse, false);
                this.newMessageTopTipReverse.setArrowDirection(false);
                this.newMessageBottomTipReverse.setArrowDirection(true);
            } else {
                this.f138658a = new C35324c(this.f138595d, dVar, this.newMessageTopTip, this.newMessageBottomTip, false);
            }
            this.f138658a.mo129983c();
            this.f138658a.mo129980b();
            this.f138658a.mo129973a(new AbstractC35310a.AbstractC35313c() {
                /* class com.ss.android.lark.threadwindow.fragment.C56067a.AnonymousClass13 */

                @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a.AbstractC35313c
                /* renamed from: a */
                public void mo122143a(Message message) {
                    if (C56067a.this.f138597f != null) {
                        Log.m165389i("AllTopicFragment", "onAtAllMessageClick: position = " + message.getPosition());
                        C56067a.this.f138693s.mo190954a(message.getPosition(), false);
                    }
                }

                @Override // com.ss.android.lark.chatwindow.view.tip.AbstractC35310a.AbstractC35313c
                /* renamed from: a */
                public void mo122142a(int i, boolean z) {
                    if (C56067a.this.f138597f != null) {
                        Log.m165389i("AllTopicFragment", "onNewMessageClick:" + i + ", toBottom:" + z);
                        if (z) {
                            C56067a.this.f138693s.mo190954a(i, false);
                            return;
                        }
                        int j = C56067a.this.mo191325j();
                        if (j == -1 || j >= C56067a.this.f138597f.getItemCount()) {
                            C56067a.this.f138693s.mo190954a(i, true);
                            return;
                        }
                        C56067a.this.mo191323g();
                        C56067a.this.mo191326k();
                    }
                }
            });
            if (this.f138660c) {
                ViewGroup.LayoutParams layoutParams = this.newMessageBottomTipReverse.getLayoutParams();
                boolean z = layoutParams instanceof ViewGroup.MarginLayoutParams;
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = (int) (((float) marginLayoutParams.topMargin) + this.f138693s.mo190974l());
                }
                this.newMessageBottomTipReverse.setLayoutParams(layoutParams);
                ViewGroup.LayoutParams layoutParams2 = this.newMessageTopTipReverse.getLayoutParams();
                if (z) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = (int) (((float) marginLayoutParams2.bottomMargin) + ((float) UIHelper.dp2px(84.0f)) + this.f138693s.mo190974l());
                }
                this.newMessageTopTipReverse.setLayoutParams(layoutParams2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: f */
    public void mo67293f() {
        super.mo67293f();
        if (this.f138693s == null || !this.f138693s.mo190978p()) {
            this.mMessageRV.addItemDecoration(new C33421q(this.f138597f));
            this.mMessageRV.addItemDecoration(this.f138596e, 0);
        } else {
            this.mMessageRV.addItemDecoration(this.f138596e, 0);
        }
        ((RecyclerView.Adapter) this.f138597f).registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            /* class com.ss.android.lark.threadwindow.fragment.C56067a.C560769 */

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeChanged(int i, int i2) {
                super.onItemRangeChanged(i, i2);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onItemRangeInserted(int i, int i2) {
                super.onItemRangeInserted(i, i2);
                if (C56067a.this.f138660c) {
                    C56067a.this.mo191314a(i, i2);
                } else {
                    C56067a.this.mo191320b(i, i2);
                }
            }
        });
        this.f138662u = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.ss.android.lark.threadwindow.fragment.C56067a.AnonymousClass10 */

            public void onGlobalLayout() {
                Log.m165389i("AllTopicFragment", "onGlobalLayout");
                C56067a.this.mo191324i();
            }
        };
        this.mMessageRV.getViewTreeObserver().addOnGlobalLayoutListener(this.f138662u);
        if (!this.f138660c && C57764ab.m224186a(this.f138595d)) {
            this.mMessageRV.setPadding(0, 0, 0, C57764ab.m224185a((Context) this.f138595d) + UIHelper.dp2px(55.0f));
        }
        m218352F();
    }

    /* renamed from: i */
    public void mo191324i() {
        Log.m165389i("AllTopicFragment", "set onboarding view location");
        if (this.mOnboardingLayout.getVisibility() == 8) {
            Log.m165389i("AllTopicFragment", "onboarding visibility is gone");
        } else if (this.f138597f == null || this.f138597f.getItemCount() == 0 || this.mMessageRV.getChildCount() == 0) {
            Log.m165389i("AllTopicFragment", "mAdapter or mAdapter.getItemCount()==0 or mMessageRV.getChildCount() == 0");
        } else {
            RecyclerView.LayoutManager layoutManager = this.mMessageRV.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                Log.m165389i("AllTopicFragment", "layoutManager not instanceof LinearLayoutManager");
                return;
            }
            View childAt = this.mMessageRV.getChildAt(((LinearLayoutManager) layoutManager).findLastVisibleItemPosition());
            if (childAt == null) {
                Log.m165389i("AllTopicFragment", "bottomView == null");
                return;
            }
            int bottom = childAt.getBottom() + this.f138693s.mo190972k();
            int top = this.mOnboardingLayout.getTop();
            int i = top - bottom;
            Log.m165389i("AllTopicFragment", "contentBottom =" + bottom + ";onboardingTop =" + top + ";distance =" + i);
            if (i < UIHelper.dp2px(16.0f)) {
                int dp2px = bottom + UIHelper.dp2px(16.0f);
                int measuredHeight = this.mOnboardingLayout.getMeasuredHeight() + dp2px;
                int screenHeight = DeviceUtils.getScreenHeight(this.f138595d) - measuredHeight;
                Log.m165389i("AllTopicFragment", "newOnboardingTop =" + dp2px + ";newOnboardingBottom=" + measuredHeight + ";onboardingDistance =" + screenHeight);
                if (screenHeight < UIHelper.dp2px(120.0f)) {
                    this.f138665x = false;
                    this.mOnboardingLayout.setVisibility(8);
                    Log.m165389i("AllTopicFragment", "set mOnboardingLayout visibility gone , mCanShowOnboarding = false");
                    if (this.f138662u != null) {
                        this.mMessageRV.getViewTreeObserver().removeOnGlobalLayoutListener(this.f138662u);
                        Log.m165389i("AllTopicFragment", "set mMessageRV removeOnGlobalLayoutListener");
                        return;
                    }
                    return;
                }
                int i2 = dp2px - top;
                this.mOnboardingLayout.offsetTopAndBottom(i2);
                Log.m165389i("AllTopicFragment", "mOnboardingLayout offsetTopAndBottom =" + i2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m218365e(List list) {
        C35324c cVar = this.f138658a;
        if (cVar != null) {
            cVar.mo129976a(list);
        }
    }

    @Override // com.ss.android.lark.threadwindow.view.message.ThreadWindowAtAndReplyTipCell.AbstractC56170a, com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: c */
    public void mo191299c(boolean z) {
        this.f138693s.mo190964b(z);
    }

    /* renamed from: a */
    public void mo191316a(RecyclerView recyclerView) {
        if (!this.f138656D) {
            m218355I();
        }
        m218363d(recyclerView);
    }

    /* renamed from: d */
    private void m218363d(RecyclerView recyclerView) {
        List<ThreadMessageVO> b = mo191287b(recyclerView);
        if (b != null) {
            this.f138693s.mo190960a(mo191294c(b));
            mo191318a(b);
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: b */
    public void mo191321b(List<MessageInfo> list) {
        if (this.f138693s == null || !this.f138693s.mo190978p()) {
            this.f138598g.mo92345a(new Runnable(list) {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$pc5RA3hX2nctQ91YhoDRZvULH6s */
                public final /* synthetic */ List f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C56067a.this.m218365e((C56067a) this.f$1);
                }
            });
        }
    }

    /* renamed from: e */
    private void m218366e(boolean z) {
        if (this.mMessageRV.getScrollState() == 0) {
            if (this.f138660c) {
                if (z) {
                    mo191266A();
                } else {
                    mo67284a(false);
                }
            } else if (z) {
                mo191305z();
            } else {
                mo67284a(true);
            }
            mo191326k();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m218368g(int i) {
        int c = this.f138597f.mo191470c(i);
        if (c == -1) {
            Log.m165383e("AllTopicFragment", "Failed to find thread, position is:" + i);
            int itemCount = this.f138597f.getItemCount();
            if (itemCount <= 0) {
                return;
            }
            if (this.f138660c) {
                this.mMessageRV.scrollToPosition(0);
            } else {
                this.mMessageRV.scrollToPosition(itemCount - 1);
            }
        } else {
            C58996h.m228974a((RecyclerView) this.mMessageRV, c, 0);
            mo191326k();
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment
    /* renamed from: a */
    public void mo191272a(int i) {
        if (this.f138660c) {
            ViewGroup.LayoutParams layoutParams = this.newMessageBottomTipReverse.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((int) this.f138693s.mo190974l()) - Math.abs(i);
            }
            this.newMessageBottomTipReverse.setLayoutParams(layoutParams);
            ViewGroup.LayoutParams layoutParams2 = this.newMessageTopTipReverse.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = (UIHelper.dp2px(84.0f) + ((int) this.f138693s.mo190974l())) - Math.abs(i);
            }
            this.newMessageTopTipReverse.setLayoutParams(layoutParams2);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = this.newMessageBottomTip.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = (UIHelper.dp2px(84.0f) + ((int) this.f138693s.mo190974l())) - Math.abs(i);
        }
        this.newMessageBottomTip.setLayoutParams(layoutParams3);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: b */
    public void mo191322b(boolean z) {
        if (z) {
            this.f138598g.mo92346a(new Runnable() {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$HrtrSqn_Lavu6D0vL6jUsy1x8DI */

                public final void run() {
                    C56067a.this.m218359M();
                }
            }, 100);
        } else {
            mo191316a((RecyclerView) this.mMessageRV);
        }
    }

    /* renamed from: d */
    private void m218364d(List<ThreadMessageVO> list) {
        boolean z;
        boolean z2;
        Iterator<ThreadMessageVO> it = list.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            ThreadMessageVO next = it.next();
            Log.m165389i("AllTopicFragment", "show item type" + next.mo121710r().toString());
            if (next.mo121710r() != Message.Type.SYSTEM) {
                z2 = true;
                break;
            }
        }
        Log.m165389i("AllTopicFragment", "hasTopic =" + z2);
        this.f138693s.mo190781a(z2);
        if (z2 || list.size() > 6) {
            Log.m165389i("AllTopicFragment", "mHasTopicOrEnoughDataBefore =" + this.f138664w);
            if (!this.f138664w && this.f138662u != null) {
                this.mMessageRV.getViewTreeObserver().removeOnGlobalLayoutListener(this.f138662u);
                Log.m165389i("AllTopicFragment", "mMessageRV removeOnGlobalLayoutListener");
            }
            this.mOnboardingLayout.setVisibility(8);
            Log.m165389i("AllTopicFragment", "hide onboarding view");
        } else if (this.f138665x) {
            this.mOnboardingLayout.setVisibility(0);
            Log.m165389i("AllTopicFragment", "show onboarding view");
            this.mMessageRV.postDelayed(new Runnable() {
                /* class com.ss.android.lark.threadwindow.fragment.C56067a.RunnableC560692 */

                public void run() {
                    if (C57582a.m223607a((Activity) C56067a.this.getActivity())) {
                        C56067a.this.mo191324i();
                    }
                }
            }, 200);
        }
        if (!z2 && list.size() <= 6) {
            z = false;
        }
        this.f138664w = z;
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo191317a(MessageInfo messageInfo) {
        boolean z;
        if ((this.f138693s == null || !this.f138693s.mo190978p()) && this.f138658a != null) {
            if (this.f138660c) {
                z = C58996h.m228983e(this.mMessageRV);
            } else {
                z = C58996h.m228982d(this.mMessageRV);
            }
            this.f138658a.mo129978a(Collections.singletonList(messageInfo), !z);
        }
    }

    /* renamed from: a */
    public void mo191318a(List<ThreadMessageVO> list) {
        if (this.f138658a != null && CollectionUtils.isNotEmpty(list)) {
            this.f138658a.mo129977a(list, this.f138661t);
        }
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo67284a(boolean z) {
        if (this.f138660c) {
            int j = mo191325j();
            if (j < this.f138597f.getItemCount()) {
                int i = j + 1;
                if (i < this.f138597f.getItemCount()) {
                    C58996h.m228979b(this.mMessageRV, i, (int) (((float) this.mMessageRV.getHeight()) * 0.73f));
                } else {
                    C58996h.m228973a(this.mMessageRV, j);
                }
            } else {
                mo191266A();
            }
        } else {
            int j2 = mo191325j();
            boolean b = C37239a.m146648b().mo136955b("im.chat.start.from.which.message", false);
            if (j2 != -1 && !b) {
                mo191323g();
            } else if (this.f138693s.mo190968h().getRecentReadPosition() > -1 && b) {
                Log.m165389i("AllTopicFragment", "init scroll to recent read position");
                C58996h.m228979b(this.mMessageRV, this.f138597f.mo191470c(this.f138693s.mo190968h().getRecentReadPosition()), (int) this.f138693s.mo190968h().getRecentReadOffset());
            } else if (z) {
                mo191305z();
            } else if (this.f138597f.getItemCount() > 0) {
                this.mMessageRV.scrollToPosition(0);
            }
        }
        mo191326k();
    }

    @Override // com.ss.android.lark.threadwindow.fragment.BaseTopicFragment, com.ss.android.lark.threadwindow.view.message.ThreadWindowPostCell2.AbstractC56194a
    /* renamed from: a */
    public void mo190444a(View view, AbsMessageVO aVar) {
        this.f138693s.mo190955a(aVar, 0);
    }

    @Override // com.ss.android.lark.threadwindow.fragment.AbstractC56088f
    /* renamed from: a */
    public void mo191315a(int i, boolean z) {
        if (z) {
            this.f138598g.mo92346a(new Runnable(i) {
                /* class com.ss.android.lark.threadwindow.fragment.$$Lambda$a$EgEoVfsEu0lPBhLZkbU8gmGExUI */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C56067a.this.m218368g(this.f$1);
                }
            }, 200);
        } else {
            m218368g(i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo191269D();
        mo191302e(0);
        mo67278a();
        mo67293f();
        m218354H();
        m218353G();
        this.f138693s.mo190967e(0);
        this.f138653A = true;
    }

    /* renamed from: b */
    public void mo191320b(int i, int i2) {
        boolean z = true;
        if (i2 == 1) {
            if (!(i == this.f138597f.getItemCount() - 1 && (this.mMessageRV.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) this.mMessageRV.getLayoutManager()).findLastVisibleItemPosition() == i - 1)) {
                z = false;
            }
            if (z && this.f138693s.mo190976n()) {
                mo191337w();
            }
        }
    }

    /* renamed from: a */
    public void mo191314a(int i, int i2) {
        boolean z = true;
        if (i2 == 1) {
            if (!(i == 0 && (this.mMessageRV.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) this.mMessageRV.getLayoutManager()).findFirstVisibleItemPosition() == i)) {
                z = false;
            }
            if (z && this.f138693s.mo190976n()) {
                mo191332r();
            }
        }
    }
}
