package com.ss.android.lark.feed.app.view;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.jato.Jato;
import com.google.android.material.appbar.AppBarLayout;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23299i;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.component.universe_design.dialog.UDBaseListDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.im.api.FeedCard;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.featuregating.service.util.FeedFgSyncUtil;
import com.ss.android.lark.feed.app.entity.BoxFeedPreview;
import com.ss.android.lark.feed.app.entity.FeedFilter;
import com.ss.android.lark.feed.app.entity.FeedPreview;
import com.ss.android.lark.feed.app.entity.FilterPreview;
import com.ss.android.lark.feed.app.entity.UIFeedCard;
import com.ss.android.lark.feed.app.filter.C37548b;
import com.ss.android.lark.feed.app.filter.data.FeedTabItemData;
import com.ss.android.lark.feed.app.filter.widget.FeedFilterView;
import com.ss.android.lark.feed.app.guide.FeedTipController;
import com.ss.android.lark.feed.app.guide.FeedTipGuideHelper;
import com.ss.android.lark.feed.app.model.C37755f;
import com.ss.android.lark.feed.app.model.common.UpdateRecord;
import com.ss.android.lark.feed.app.model.event.ShortcutAnimationEvent;
import com.ss.android.lark.feed.app.model.p1861a.C37673a;
import com.ss.android.lark.feed.app.model.p1861a.C37674b;
import com.ss.android.lark.feed.app.model.p1863c.C37713d;
import com.ss.android.lark.feed.app.p1849b.C37306c;
import com.ss.android.lark.feed.app.shortcut.C37815f;
import com.ss.android.lark.feed.app.shortcut.ShortCutStausManager;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPoint;
import com.ss.android.lark.feed.app.statistics.feed.FeedHitPointNew;
import com.ss.android.lark.feed.app.team.feed.TeamFeedFragment;
import com.ss.android.lark.feed.app.view.C37985g;
import com.ss.android.lark.feed.app.view.FeedListAdapter;
import com.ss.android.lark.feed.app.view.p1870a.C37963a;
import com.ss.android.lark.feed.app.view.scroll.AppbarScrollChecker;
import com.ss.android.lark.feed.app.view.scroll.FeedScrollStateRecorder;
import com.ss.android.lark.feed.app.view.scroll.FlingBehavior;
import com.ss.android.lark.feed.app.view.title.AbstractC38026b;
import com.ss.android.lark.feed.app.view.title.AbstractC38027d;
import com.ss.android.lark.feed.app.view.title.C38024a;
import com.ss.android.lark.feed.app.view.title.FeedTitleScrollHelperV2;
import com.ss.android.lark.feed.app.view.title.ITitleScrollHelper;
import com.ss.android.lark.feed.app.view.unread.UnreadScrollListener;
import com.ss.android.lark.feed.app.view.unread.UnreadScrollListenerV2;
import com.ss.android.lark.feed.common.FeedFgUtils;
import com.ss.android.lark.feed.common.FeedTabUtil;
import com.ss.android.lark.feed.p1847a.C37266b;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1873d.C38074a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.CommonRecyclerView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class InboxContainerView extends FrameLayout {

    /* renamed from: A */
    public int f97327A;

    /* renamed from: B */
    public int f97328B;

    /* renamed from: C */
    public InboxContainerViewInit f97329C;

    /* renamed from: D */
    public FeedFilter f97330D;

    /* renamed from: E */
    public int f97331E;

    /* renamed from: F */
    private boolean f97332F;

    /* renamed from: G */
    private boolean f97333G;

    /* renamed from: H */
    private volatile boolean f97334H;

    /* renamed from: I */
    private AbstractC37957b f97335I;

    /* renamed from: J */
    private RecyclerView.Adapter<?> f97336J;

    /* renamed from: K */
    private boolean f97337K;

    /* renamed from: L */
    private C37963a.AbstractC37964a f97338L;

    /* renamed from: M */
    private AbstractC37956a f97339M;

    /* renamed from: N */
    private LKUIStatus f97340N;

    /* renamed from: O */
    private ShortCutStausManager.AbstractC37801b f97341O;

    /* renamed from: P */
    private boolean f97342P;

    /* renamed from: Q */
    private boolean f97343Q;

    /* renamed from: R */
    private InboxContainerViewInit f97344R;

    /* renamed from: S */
    private TeamFeedFragment f97345S;

    /* renamed from: T */
    private final FeedTabUtil.SwitchTabListener f97346T;

    /* renamed from: U */
    private final View.OnTouchListener f97347U;

    /* renamed from: a */
    FrameLayout f97348a;

    /* renamed from: b */
    CommonRecyclerView f97349b;

    /* renamed from: c */
    LKUIPtrFrameLayout f97350c;

    /* renamed from: d */
    AppBarLayout f97351d;

    /* renamed from: e */
    CoordinatorLayout f97352e;

    /* renamed from: f */
    RecyclerView f97353f;

    /* renamed from: g */
    FrameLayout f97354g;

    /* renamed from: h */
    View f97355h;

    /* renamed from: i */
    ConstraintLayout f97356i;

    /* renamed from: j */
    FrameLayout f97357j;

    /* renamed from: k */
    List<UIFeedCard> f97358k;

    /* renamed from: l */
    public volatile boolean f97359l;

    /* renamed from: m */
    public Context f97360m;

    /* renamed from: n */
    public UpdateRecord f97361n;

    /* renamed from: o */
    public C37985g f97362o;

    /* renamed from: p */
    public C37985g f97363p;

    /* renamed from: q */
    public FeedScrollStateRecorder f97364q;

    /* renamed from: r */
    public AppbarScrollChecker f97365r;

    /* renamed from: s */
    public FeedFilterView f97366s;

    /* renamed from: t */
    public C37963a f97367t;

    /* renamed from: u */
    public C37815f f97368u;

    /* renamed from: v */
    public ITitleScrollHelper f97369v;

    /* renamed from: w */
    public C23289c f97370w;

    /* renamed from: x */
    public AbstractC37958c f97371x;

    /* renamed from: y */
    public boolean f97372y;

    /* renamed from: z */
    public VelocityTracker f97373z;

    @Retention(RetentionPolicy.SOURCE)
    public @interface AppBarStatus {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LKSTATUS {
    }

    /* renamed from: com.ss.android.lark.feed.app.view.InboxContainerView$a */
    public interface AbstractC37956a {
        /* renamed from: a */
        int mo137075a();

        /* renamed from: a */
        void mo137076a(int i, TeamFeedFragment cVar);

        /* renamed from: b */
        int mo137077b();
    }

    /* renamed from: com.ss.android.lark.feed.app.view.InboxContainerView$b */
    public interface AbstractC37957b {
        /* renamed from: a */
        void mo137072a();

        /* renamed from: b */
        void mo137073b();

        /* renamed from: c */
        void mo137074c();
    }

    /* renamed from: com.ss.android.lark.feed.app.view.InboxContainerView$c */
    public interface AbstractC37958c {
        /* renamed from: a */
        void mo137057a();

        /* renamed from: a */
        void mo137058a(int i, UIFeedCard uIFeedCard);

        /* renamed from: a */
        void mo137059a(View view, UIFeedCard uIFeedCard);

        /* renamed from: a */
        void mo137060a(FeedFilter feedFilter);

        /* renamed from: a */
        void mo137061a(FeedPreview feedPreview);

        /* renamed from: a */
        void mo137062a(FeedPreview feedPreview, boolean z);

        /* renamed from: a */
        void mo137063a(UIFeedCard uIFeedCard, int i);

        /* renamed from: a */
        void mo137064a(UIFeedCard uIFeedCard, boolean z);

        /* renamed from: a */
        void mo137065a(List<UIFeedCard> list);

        /* renamed from: b */
        void mo137066b(View view, UIFeedCard uIFeedCard);

        /* renamed from: b */
        void mo137067b(FeedPreview feedPreview, boolean z);

        /* renamed from: b */
        boolean mo137068b();

        /* renamed from: c */
        void mo137069c();

        /* renamed from: c */
        void mo137070c(FeedPreview feedPreview, boolean z);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void requestLayout() {
        super.requestLayout();
    }

    /* renamed from: a */
    public void mo138964a(boolean z) {
        if (this.f97342P != z) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) this.f97353f.getLayoutParams();
            if (z) {
                layoutParams.mo76392a(13);
            }
            Log.m165379d("FeedModule_InboxContainerView", "appbar layout enable " + z);
            this.f97353f.setLayoutParams(layoutParams);
            this.f97342P = z;
        }
    }

    /* renamed from: a */
    public boolean mo138965a(FeedFilter feedFilter) {
        FeedFilterView feedFilterView = this.f97366s;
        if (feedFilterView == null) {
            return false;
        }
        return feedFilterView.mo137837b(feedFilter);
    }

    /* renamed from: a */
    public void mo138958a() {
        this.f97334H = true;
        postInvalidate();
    }

    /* renamed from: i */
    public void mo138981i() {
        this.f97327A = 2;
        setLoadingState(2);
    }

    /* renamed from: j */
    public void mo138982j() {
        this.f97327A = 0;
        setLoadingState(0);
    }

    /* renamed from: l */
    private void m149245l() {
        this.f97348a = (FrameLayout) findViewById(R.id.team_fragment_container);
    }

    /* renamed from: c */
    public void mo138970c() {
        RecyclerView.Adapter<?> adapter = this.f97336J;
        if (adapter instanceof C23299i) {
            ((C23299i) adapter).mo80859d();
        }
    }

    /* renamed from: d */
    public void mo138973d() {
        ITitleScrollHelper cVar = this.f97369v;
        if (cVar == null) {
            Log.m165383e("FeedModule_InboxContainerView", "inbox forget int Scroll Helper! ");
        } else {
            cVar.mo139134a();
        }
    }

    /* renamed from: g */
    public void mo138979g() {
        C37985g gVar = this.f97362o;
        if (gVar != null) {
            gVar.mo138944n();
        }
        C37985g gVar2 = this.f97363p;
        if (gVar2 != null) {
            gVar2.mo138944n();
        }
    }

    /* renamed from: h */
    public void mo138980h() {
        C37985g gVar = this.f97362o;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        C37985g gVar2 = this.f97363p;
        if (gVar2 != null) {
            gVar2.notifyDataSetChanged();
        }
    }

    /* renamed from: n */
    private void m149247n() {
        this.f97368u = new C37815f(this.f97362o, this.f97349b, new C37815f.AbstractC37816a() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379515 */

            @Override // com.ss.android.lark.feed.app.shortcut.C37815f.AbstractC37816a
            /* renamed from: a */
            public boolean mo138603a() {
                if (!FeedFgUtils.m146773b()) {
                    return !InboxContainerView.this.f97349b.canScrollVertically(-1);
                }
                if (InboxContainerView.this.f97328B == 1) {
                    return true;
                }
                return false;
            }
        });
        this.f97352e.setOnTouchListener(this.f97347U);
        this.f97349b.setOnTouchListener(this.f97347U);
    }

    /* renamed from: b */
    public void mo138966b() {
        int c;
        C37673a b = C37674b.m148126a().mo138116b();
        if (b != null && (c = b.mo138114c()) > this.f97331E) {
            this.f97331E = c;
        }
    }

    /* renamed from: e */
    public void mo138977e() {
        this.f97349b.getLayoutManager().scrollToPosition(0);
        ITitleScrollHelper cVar = this.f97369v;
        if (cVar != null) {
            cVar.mo139137c();
        }
    }

    /* renamed from: f */
    public void mo138978f() {
        FeedTabUtil.m146779a((FeedTabUtil.SwitchTabListener) null);
        LKUIStatus lKUIStatus = this.f97340N;
        if (lKUIStatus != null) {
            lKUIStatus.mo89849f();
        }
        C37985g gVar = this.f97362o;
        if (gVar != null) {
            gVar.mo138941k();
        }
        C37985g gVar2 = this.f97363p;
        if (gVar2 != null) {
            gVar2.mo138941k();
        }
    }

    /* renamed from: k */
    private boolean m149244k() {
        LKUIStatus lKUIStatus = this.f97340N;
        if (lKUIStatus != null && lKUIStatus.mo89850g()) {
            return true;
        }
        for (int i = 0; i < this.f97349b.getChildCount(); i++) {
            if (this.f97349b.getChildAt(i) instanceof FeedItemView) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ShortCutStausManager.m148791a().mo138572b(this.f97341O);
        this.f97329C.mo139043c();
        InboxContainerViewInit dVar = this.f97344R;
        if (dVar != null) {
            dVar.mo139043c();
        }
        C37963a.AbstractC37964a aVar = this.f97338L;
        if (aVar != null) {
            aVar.mo138876d();
        }
        C38074a.m149790a();
    }

    /* renamed from: o */
    private void m149248o() {
        if (!FeedFgUtils.m146773b()) {
            this.f97351d.setVisibility(8);
            this.f97355h.setVisibility(8);
            return;
        }
        this.f97353f.setHasFixedSize(false);
        this.f97351d.setVisibility(0);
        ((AppBarLayout.LayoutParams) this.f97353f.getLayoutParams()).mo76392a(13);
        ((CoordinatorLayout.LayoutParams) this.f97351d.getLayoutParams()).setBehavior(new FlingBehavior());
        this.f97363p = new C37985g();
        InboxContainerViewInit dVar = new InboxContainerViewInit(getContext(), this.f97353f, this.f97363p);
        this.f97344R = dVar;
        dVar.mo139042b();
        AbstractC37958c cVar = this.f97371x;
        if (cVar != null) {
            this.f97344R.mo139041a(cVar);
        }
        this.f97363p.mo138926a(C37306c.m146953a());
        this.f97363p.mo138928a(new FeedListAdapter.AbstractC37926a() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379526 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: a */
            public void mo137382a(UpdateRecord updateRecord) {
            }

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: b */
            public void mo137383b(UpdateRecord updateRecord) {
                if (InboxContainerView.this.f97369v != null) {
                    InboxContainerView.this.f97369v.mo139136b();
                }
            }
        });
        this.f97351d.addOnOffsetChangedListener((AppBarLayout.AbstractC22134b) new AppBarLayout.AbstractC22134b() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379537 */

            /* renamed from: a */
            int f97403a = Integer.MIN_VALUE;

            @Override // com.google.android.material.appbar.AppBarLayout.AbstractC22133a
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (InboxContainerView.this.f97351d.getTotalScrollRange() != 0 && this.f97403a != i) {
                    this.f97403a = i;
                    if (Math.abs(i) >= InboxContainerView.this.f97351d.getTotalScrollRange()) {
                        EventBus.getDefault().trigger(new ShortcutAnimationEvent(ShortcutAnimationEvent.AnimationStatus.CLOSE_SILENT));
                        InboxContainerView.this.f97328B = 0;
                    } else if (Math.abs(i) == 0) {
                        InboxContainerView.this.f97328B = 1;
                    } else {
                        InboxContainerView.this.f97328B = 2;
                    }
                }
            }
        });
        this.f97349b.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379548 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() > 0) {
                    InboxContainerView.this.f97355h.setVisibility(0);
                    if (InboxContainerView.this.f97366s != null) {
                        InboxContainerView.this.f97366s.setDividerVisibility(false);
                        return;
                    }
                    return;
                }
                InboxContainerView.this.f97355h.setVisibility(4);
                if (InboxContainerView.this.f97366s != null) {
                    InboxContainerView.this.f97366s.setDividerVisibility(true);
                }
            }
        });
        this.f97365r = new AppbarScrollChecker(this.f97349b, new AppbarScrollChecker.AppbarScrollCheckerDependency() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379559 */

            @Override // com.ss.android.lark.feed.app.view.scroll.AppbarScrollChecker.AppbarScrollCheckerDependency
            /* renamed from: a */
            public int mo139001a() {
                int i;
                int height = InboxContainerView.this.f97352e.getHeight();
                if (InboxContainerView.this.f97366s == null) {
                    i = 0;
                } else {
                    i = InboxContainerView.this.f97366s.getHeight();
                }
                return (height - i) - InboxContainerView.this.f97353f.getHeight();
            }

            @Override // com.ss.android.lark.feed.app.view.scroll.AppbarScrollChecker.AppbarScrollCheckerDependency
            /* renamed from: a */
            public void mo139002a(boolean z) {
                InboxContainerView.this.mo138964a(z);
            }
        });
    }

    /* renamed from: m */
    private void m149246m() {
        this.f97373z = VelocityTracker.obtain();
        this.f97350c = (LKUIPtrFrameLayout) findViewById(R.id.inbox_ptr_layout);
        this.f97349b = (CommonRecyclerView) findViewById(R.id.feed_inbox_recycler_view);
        this.f97351d = (AppBarLayout) findViewById(R.id.appbar);
        this.f97353f = (RecyclerView) findViewById(R.id.header_content);
        this.f97354g = (FrameLayout) findViewById(R.id.sticky_container);
        this.f97352e = (CoordinatorLayout) findViewById(R.id.coordinator);
        this.f97355h = findViewById(R.id.status_blur_v2);
        this.f97356i = (ConstraintLayout) findViewById(R.id.data_container);
        this.f97362o = new C37985g();
        this.f97370w = new C23289c();
        this.f97370w.mo80801a(ViewConfiguration.get(this.f97360m).getScaledTouchSlop() * 40);
        this.f97336J = this.f97370w.mo80800a(this.f97362o);
        this.f97349b.setWillNotDraw(false);
        this.f97349b.setHasFixedSize(true);
        C38074a.m149791a(this.f97349b);
        HashMap hashMap = new HashMap();
        hashMap.put("biz", Integer.valueOf(Biz.Messenger.getValue()));
        hashMap.put("scene", Integer.valueOf(Scene.Feed.getValue()));
        this.f97349b.mo200036a(hashMap);
        InboxContainerViewInit dVar = new InboxContainerViewInit(getContext(), this.f97349b, this.f97362o, this.f97336J);
        this.f97329C = dVar;
        dVar.mo139042b();
        this.f97364q = new FeedScrollStateRecorder(this.f97349b);
        AbstractC37958c cVar = this.f97371x;
        if (cVar != null) {
            this.f97329C.mo139041a(cVar);
        }
        this.f97370w.mo80804a(this.f97349b);
        this.f97367t = new C37963a(this.f97362o, this.f97349b);
        this.f97349b.mo200038c();
        this.f97350c.setEnableScrollContentAfterLoad(true);
        this.f97350c.setPtrHandler(new LKUIPtrDefaultHandler2() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass16 */

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
            public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                return false;
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
            public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
                InboxContainerView.this.f97350c.postDelayed(new Runnable() {
                    /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass16.RunnableC379441 */

                    public void run() {
                        InboxContainerView.this.f97350c.refreshComplete();
                    }
                }, 500);
                InboxContainerView.this.f97371x.mo137069c();
            }

            @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
            public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
                if (InboxContainerView.this.f97348a.getVisibility() != 0 && InboxContainerView.this.f97371x.mo137068b() && super.checkCanDoLoadMore(lKUIPtrFrameLayout, InboxContainerView.this.f97349b, view2)) {
                    return true;
                }
                return false;
            }
        });
        this.f97362o.mo139049a(new C37985g.AbstractC37988a() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass17 */

            @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37988a
            /* renamed from: a */
            public void mo137499a() {
                C37266b.m146760c(InboxContainerView.this.f97349b);
            }

            @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37988a
            /* renamed from: b */
            public void mo137501b() {
                C37266b.m146761d(InboxContainerView.this.f97349b);
            }

            @Override // com.ss.android.lark.feed.app.view.C37985g.AbstractC37988a
            /* renamed from: a */
            public void mo137500a(C37968c cVar, UIFeedCard uIFeedCard, boolean z, boolean z2) {
                if (InboxContainerView.this.f97371x != null) {
                    InboxContainerView.this.f97371x.mo137064a(uIFeedCard, z);
                    if (InboxContainerView.this.f97369v != null) {
                        InboxContainerView.this.f97369v.mo139136b();
                    }
                    C37266b.m146762e(InboxContainerView.this.f97349b);
                }
            }
        });
        this.f97362o.mo138926a(C37306c.m146953a());
        this.f97362o.mo138928a(new FeedListAdapter.AbstractC37926a() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass18 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: a */
            public void mo137382a(final UpdateRecord updateRecord) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass18.RunnableC379451 */

                    public void run() {
                        InboxContainerView.this.f97364q.mo139084a(updateRecord);
                    }
                });
            }

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37926a
            /* renamed from: b */
            public void mo137383b(final UpdateRecord updateRecord) {
                if (InboxContainerView.this.f97369v != null) {
                    InboxContainerView.this.f97369v.mo139136b();
                }
                if (InboxContainerView.this.f97361n != null && !TextUtils.equals(InboxContainerView.this.f97361n.mo138380g(), updateRecord.mo138380g())) {
                    InboxContainerView.this.f97359l = true;
                    InboxContainerView.this.postInvalidate();
                }
                InboxContainerView.this.f97361n = updateRecord;
                C38074a.m149792a("afterDispatchDiff", new Runnable() {
                    /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass18.RunnableC379462 */

                    public void run() {
                        if (InboxContainerView.this.f97371x != null && InboxContainerView.this.f97329C.mo139044d().getScrollState() == 0) {
                            InboxContainerView.this.f97371x.mo137065a(InboxContainerView.this.mo138957a(InboxContainerView.this.f97329C.mo139040a()));
                        }
                        InboxContainerView.this.f97364q.mo139087c(updateRecord);
                        if (InboxContainerView.this.f97365r != null) {
                            InboxContainerView.this.f97365r.mo139081a();
                        }
                    }
                });
            }
        });
        this.f97362o.mo138931a(new FeedListAdapter.AbstractC37929d() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass19 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37929d
            /* renamed from: a */
            public void mo137502a(C37968c cVar) {
                InboxContainerView.this.f97370w.mo80808a(cVar, 4);
            }
        });
        this.f97349b.addOnScrollListener(new RecyclerView.OnScrollListener() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass20 */

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                int findFirstVisibleItemPosition;
                super.onScrollStateChanged(recyclerView, i);
                if (InboxContainerView.this.f97362o != null) {
                    InboxContainerView.this.f97362o.mo139057r();
                }
                if (i != 0) {
                    InboxContainerView.this.f97349b.postDelayed(new Runnable() {
                        /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass20.RunnableC379481 */

                        public void run() {
                            InboxContainerView.this.f97362o.mo139057r();
                        }
                    }, 300);
                    return;
                }
                if (C37713d.f96678h && (findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition()) >= 0 && findFirstVisibleItemPosition < InboxContainerView.this.f97362o.getItemCount()) {
                    InboxContainerView.this.f97371x.mo137058a(findFirstVisibleItemPosition, InboxContainerView.this.f97362o.getItem(findFirstVisibleItemPosition));
                }
                if (InboxContainerView.this.f97371x != null) {
                    AbstractC37958c cVar = InboxContainerView.this.f97371x;
                    InboxContainerView inboxContainerView = InboxContainerView.this;
                    cVar.mo137065a(inboxContainerView.mo138957a(inboxContainerView.f97329C.mo139040a()));
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                C37755f.m148611a().mo138465b();
            }
        });
        this.f97349b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.ViewTreeObserver$OnPreDrawListenerC379472 */

            public boolean onPreDraw() {
                if (InboxContainerView.this.f97349b.getChildCount() <= 0) {
                    return true;
                }
                InboxContainerView.this.f97349b.getViewTreeObserver().removeOnPreDrawListener(this);
                if (InboxContainerView.this.f97371x == null) {
                    return true;
                }
                AbstractC37958c cVar = InboxContainerView.this.f97371x;
                InboxContainerView inboxContainerView = InboxContainerView.this;
                cVar.mo137065a(inboxContainerView.mo138957a(inboxContainerView.f97329C.mo139040a()));
                return true;
            }
        });
        this.f97362o.mo138929a(new FeedListAdapter.AbstractC37927b() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379493 */

            @Override // com.ss.android.lark.feed.app.view.FeedListAdapter.AbstractC37927b
            /* renamed from: a */
            public void mo137374a(int i, UIFeedCard uIFeedCard) {
                if (InboxContainerView.this.f97362o != null) {
                    if (C37713d.f96677g) {
                        InboxContainerView.this.f97371x.mo137058a(i, uIFeedCard);
                    } else if (InboxContainerView.this.f97362o.getItemCount() - i < InboxContainerView.this.f97331E) {
                        InboxContainerView.this.f97371x.mo137058a(i, uIFeedCard);
                    }
                    InboxContainerView.this.f97373z.computeCurrentVelocity(1);
                }
            }
        });
        this.f97341O = new ShortCutStausManager.AbstractC37801b() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379504 */

            @Override // com.ss.android.lark.feed.app.shortcut.ShortCutStausManager.AbstractC37801b
            /* renamed from: a */
            public void mo138582a(ShortCutStausManager.ShortCutStatus shortCutStatus) {
                if (shortCutStatus == ShortCutStausManager.ShortCutStatus.OPEN || InboxContainerView.this.f97327A == 0) {
                    InboxContainerView.this.setLoadingState(0);
                } else if (InboxContainerView.this.f97327A == 2) {
                    InboxContainerView.this.setLoadingState(2);
                } else if (InboxContainerView.this.f97327A == 1) {
                    InboxContainerView.this.setLoadingState(1);
                }
            }
        };
        ShortCutStausManager.m148791a().mo138569a(this.f97341O);
    }

    /* renamed from: b */
    public void mo138969b(boolean z) {
        this.f97337K = z;
    }

    public void setBoxContainerDependency(AbstractC37956a aVar) {
        this.f97339M = aVar;
    }

    public void setFirstPageViewListener(AbstractC37957b bVar) {
        this.f97335I = bVar;
    }

    public InboxContainerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void mo138959a(int i) {
        C37985g gVar = this.f97362o;
        if (gVar != null) {
            gVar.mo138940b(i);
        }
        C37985g gVar2 = this.f97363p;
        if (gVar2 != null) {
            gVar2.mo138940b(i);
        }
    }

    /* renamed from: b */
    public void mo138967b(final FeedPreview feedPreview) {
        post(new Runnable() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass15 */

            public void run() {
                if (!feedPreview.isHeaderData() || !FeedFgUtils.m146773b()) {
                    if (InboxContainerView.this.f97362o != null) {
                        InboxContainerView.this.f97362o.remove(feedPreview);
                        InboxContainerView.this.f97362o.f97291g.mo137111a(true);
                    }
                } else if (InboxContainerView.this.f97363p != null) {
                    InboxContainerView.this.f97363p.remove(feedPreview);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo138960a(Activity activity) {
        this.f97360m = activity;
        m149246m();
        m149248o();
        m149247n();
        mo138966b();
        m149245l();
        FeedTabUtil.m146779a(this.f97346T);
    }

    /* renamed from: c */
    public void mo138972c(boolean z) {
        if (z) {
            this.f97327A = 1;
        } else {
            this.f97327A = 0;
        }
        if (!z || !ShortCutStausManager.m148791a().mo138578e()) {
            setLoadingState(0);
        } else {
            setLoadingState(1);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (C37713d.f96682l && motionEvent.getAction() == 0) {
            Jato.tryCpuBoostWithResult(200);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setInboxContainerListener(AbstractC37958c cVar) {
        this.f97371x = cVar;
        InboxContainerViewInit dVar = this.f97344R;
        if (dVar != null) {
            dVar.mo139041a(cVar);
        }
        InboxContainerViewInit dVar2 = this.f97329C;
        if (dVar2 != null) {
            dVar2.mo139041a(cVar);
        }
    }

    /* renamed from: a */
    private void m149242a(List<UIFeedCard> list) {
        if (CollectionUtils.isEmpty(list) && this.f97343Q) {
            FeedFilterView feedFilterView = this.f97366s;
            if (feedFilterView != null && feedFilterView.getVisibility() == 0) {
                this.f97366s.mo137834a(FeedFilter.INBOX);
            }
            this.f97343Q = false;
        } else if (list.size() > 0) {
            this.f97343Q = true;
        }
    }

    /* renamed from: b */
    public void mo138968b(UpdateRecord updateRecord) {
        C37985g gVar = this.f97363p;
        if (gVar != null) {
            gVar.mo138927a(updateRecord);
        }
    }

    /* renamed from: d */
    public void mo138974d(boolean z) {
        int i;
        if (z && this.f97345S == null && this.f97339M != null) {
            TeamFeedFragment cVar = new TeamFeedFragment();
            this.f97345S = cVar;
            cVar.mo138646a(this.f97347U);
            this.f97339M.mo137076a(R.id.team_fragment_container, this.f97345S);
        }
        int i2 = 0;
        if (z) {
            mo138972c(false);
        }
        FrameLayout frameLayout = this.f97348a;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        CommonRecyclerView commonRecyclerView = this.f97349b;
        if (z) {
            i2 = 8;
        }
        commonRecyclerView.setVisibility(i2);
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.f97332F) {
            this.f97332F = true;
            AbstractC37957b bVar = this.f97335I;
            if (bVar != null) {
                bVar.mo137072a();
            }
        }
        if (!this.f97333G && m149244k()) {
            this.f97333G = true;
            AbstractC37957b bVar2 = this.f97335I;
            if (bVar2 != null) {
                bVar2.mo137073b();
            }
        }
        if (this.f97359l && this.f97334H) {
            this.f97359l = false;
            this.f97334H = false;
            AbstractC37957b bVar3 = this.f97335I;
            if (bVar3 != null) {
                bVar3.mo137074c();
            }
        }
    }

    /* renamed from: a */
    public UIFeedCard mo138956a(Boolean bool) {
        C37963a.AbstractC37964a aVar;
        if (this.f97338L == null) {
            if (FeedFgUtils.m146773b()) {
                aVar = new UnreadScrollListenerV2(this.f97351d, this.f97352e, this.f97356i, this.f97339M.mo137075a(), this.f97369v, new Function1<FeedFilter, Unit>() {
                    /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass12 */

                    /* renamed from: a */
                    public Unit invoke(FeedFilter feedFilter) {
                        if (InboxContainerView.this.f97366s == null || InboxContainerView.this.f97366s.getVisibility() != 0 || InboxContainerView.this.f97366s.getMCurSelectFilter() == feedFilter) {
                            return null;
                        }
                        InboxContainerView.this.f97366s.mo137834a(feedFilter);
                        return null;
                    }
                });
            } else {
                aVar = new UnreadScrollListener(this.f97339M.mo137077b(), this.f97339M.mo137075a(), this.f97369v);
            }
            this.f97338L = aVar;
        }
        return this.f97367t.mo139020a(this.f97338L, bool, Boolean.valueOf(this.f97337K));
    }

    public void setLoadingState(int i) {
        double d;
        if (i == 0) {
            LKUIStatus lKUIStatus = this.f97340N;
            if (lKUIStatus != null) {
                lKUIStatus.mo89847d();
                return;
            }
            return;
        }
        if (this.f97340N == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.load_layout);
            this.f97357j = frameLayout;
            LKUIStatus.C25680a c = new LKUIStatus.C25680a(frameLayout).mo89862c(R.drawable.illustration_placeholder_common_default);
            if (DesktopUtil.m144307b()) {
                d = 0.4d;
            } else {
                d = 0.5d;
            }
            this.f97340N = c.mo89855a(d).mo89863c(UIHelper.getString(R.string.Lark_Legacy_CurrentPageEmpty)).mo89859a();
        }
        if (i == 1) {
            this.f97340N.mo89845c();
        } else if (i == 2 && !this.f97340N.mo89851h()) {
            this.f97340N.mo89837a();
        }
    }

    /* renamed from: b */
    private boolean m149243b(LinearLayoutManager linearLayoutManager) {
        View view;
        FeedTipGuideHelper.GuideType guideType;
        int findFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (!(findFirstCompletelyVisibleItemPosition == -1 || findLastCompletelyVisibleItemPosition == -1 || findFirstCompletelyVisibleItemPosition >= findLastCompletelyVisibleItemPosition)) {
            boolean a = FeedTipController.f96436a.mo137991a();
            boolean b = FeedTipController.f96436a.mo137993b();
            boolean c = FeedTipController.f96436a.mo137994c();
            if (!a && !b && !c) {
                return true;
            }
            View view2 = null;
            FeedPreview feedPreview = null;
            FeedTipGuideHelper.GuideType guideType2 = null;
            while (true) {
                if (findFirstCompletelyVisibleItemPosition >= findLastCompletelyVisibleItemPosition) {
                    view = view2;
                    guideType = guideType2;
                    break;
                }
                UIFeedCard c2 = this.f97362o.getItem(findFirstCompletelyVisibleItemPosition);
                if (c2 instanceof FeedPreview) {
                    FeedPreview feedPreview2 = (FeedPreview) c2;
                    if (!(feedPreview2.getAtInfo() == null || feedPreview2.getAtInfo().getAvatarKey() == null)) {
                        if (a && feedPreview2.isContainMarkType(FeedPreview.MarkType.AT_USER)) {
                            guideType = FeedTipGuideHelper.GuideType.AT_USER;
                            feedPreview = feedPreview2;
                            view = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition).findViewById(R.id.at_avatar);
                            break;
                        } else if (b && feedPreview2.isContainMarkType(FeedPreview.MarkType.AT_ALL) && feedPreview == null) {
                            view2 = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition).findViewById(R.id.at_avatar);
                            guideType2 = FeedTipGuideHelper.GuideType.AT_ALL;
                            feedPreview = feedPreview2;
                        }
                    }
                    if (guideType2 == null && c && !(c2 instanceof BoxFeedPreview) && !feedPreview2.isRemind() && feedPreview2.getUnreadCount() > 0) {
                        guideType2 = FeedTipGuideHelper.GuideType.BADGE_STYLE;
                        view2 = linearLayoutManager.findViewByPosition(findFirstCompletelyVisibleItemPosition).findViewById(R.id.badge);
                        feedPreview = feedPreview2;
                    }
                }
                findFirstCompletelyVisibleItemPosition++;
            }
            if (!(view == null || guideType == null)) {
                this.f97362o.mo138942l();
                FeedTipController.f96436a.mo137990a(view, (Activity) this.f97360m, feedPreview.getAtInfo(), guideType, new FeedTipController.OnClickListener() {
                    /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass10 */

                    @Override // com.ss.android.lark.feed.app.guide.FeedTipController.OnClickListener
                    /* renamed from: a */
                    public void mo137995a() {
                        InboxContainerView.this.f97362o.mo138943m();
                        InboxContainerView.this.f97372y = false;
                    }

                    @Override // com.ss.android.lark.feed.app.guide.FeedTipController.OnClickListener
                    /* renamed from: b */
                    public void mo137996b() {
                        InboxContainerView.this.f97362o.mo138943m();
                        InboxContainerView.this.f97372y = false;
                    }
                });
                this.f97349b.stopScroll();
                this.f97372y = true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public List<UIFeedCard> mo138957a(LinearLayoutManager linearLayoutManager) {
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || findLastVisibleItemPosition == -1 || findFirstVisibleItemPosition >= findLastVisibleItemPosition) {
            return null;
        }
        this.f97358k.clear();
        while (findFirstVisibleItemPosition < findLastVisibleItemPosition) {
            UIFeedCard c = this.f97362o.getItem(findFirstVisibleItemPosition);
            if (c != null) {
                this.f97358k.add(c);
            }
            findFirstVisibleItemPosition++;
        }
        m149243b(linearLayoutManager);
        return this.f97358k;
    }

    /* renamed from: c */
    public void mo138971c(UpdateRecord updateRecord) {
        this.f97354g.setVisibility(0);
        List<UIFeedCard> c = updateRecord.mo138376c();
        m149242a(c);
        if (c.isEmpty()) {
            this.f97354g.setVisibility(8);
            return;
        }
        FilterPreview filterPreview = (FilterPreview) c.get(0);
        if (filterPreview != null) {
            FeedFilterView feedFilterView = this.f97366s;
            if (feedFilterView == null) {
                FeedFilterView feedFilterView2 = new FeedFilterView(this.f97360m);
                this.f97366s = feedFilterView2;
                feedFilterView2.mo137835a(filterPreview.getFilterItems());
                this.f97366s.mo137832a(filterPreview.getDeviceStatus());
                this.f97366s.mo137831a(new FeedFilterView.IFeedFilterTabListener() {
                    /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass13 */

                    @Override // com.ss.android.lark.feed.app.filter.widget.FeedFilterView.IFeedFilterTabListener
                    /* renamed from: a */
                    public void mo137855a(View view) {
                        C37268c.m146766b().mo139180a(InboxContainerView.this.getContext());
                        FeedHitPoint.m148871g();
                        FeedHitPointNew.m148858b(FeedHitPointNew.FeedMainClickParam.MESSAGE_SETTING);
                    }

                    @Override // com.ss.android.lark.feed.app.filter.widget.FeedFilterView.IFeedFilterTabListener
                    /* renamed from: b */
                    public void mo137858b(View view) {
                        ArrayList arrayList = new ArrayList();
                        for (String str : InboxContainerView.this.f97360m.getResources().getStringArray(R.array.lark_Feed_FilterActionArray)) {
                            arrayList.add(new UDBaseListDialogBuilder.ListItemBuilder(str).mo90889c());
                        }
                        if (FeedFgSyncUtil.m146722b()) {
                            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(InboxContainerView.this.f97360m).title(R.string.Lark_Feed_MoreActions)).mo90873b(arrayList)).mo90869a(new UDListDialogController.OnItemClickListener() {
                                /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass13.C379422 */

                                @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                                public void onItemClick(int i) {
                                    if (i == 0) {
                                        C37268c.m146766b().mo139182b(InboxContainerView.this.getContext(), 0);
                                        FeedHitPointNew.m148847a(FeedHitPointNew.FeedMainClickParam.FEED_MORE_TAB_TO_EDIT);
                                    } else if (i == 1) {
                                        C37268c.m146766b().mo139174a(InboxContainerView.this.getContext(), 0);
                                        FeedHitPointNew.m148847a(FeedHitPointNew.FeedMainClickParam.FEED_MORE_TAB_TO_SETTING);
                                    }
                                }
                            })).addActionButton(R.id.ud_dialog_btn_cancel, R.string.Lark_Feed_Cancel, new DialogInterface.OnClickListener() {
                                /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass13.DialogInterface$OnClickListenerC379411 */

                                public void onClick(DialogInterface dialogInterface, int i) {
                                    FeedHitPointNew.m148847a(FeedHitPointNew.FeedMainClickParam.FEED_MORE_TAB_TO_CANCEL);
                                }
                            })).build().show();
                            return;
                        }
                        C37268c.m146766b().mo139174a(InboxContainerView.this.getContext(), 0);
                        FeedHitPointNew.m148858b(FeedHitPointNew.FeedMainClickParam.FEED_MORE_TAB_MOBILE);
                    }

                    @Override // com.ss.android.lark.feed.app.filter.widget.FeedFilterView.IFeedFilterTabListener
                    /* renamed from: a */
                    public void mo137856a(View view, FeedTabItemData.IFilterItem eVar) {
                        if (eVar.mo137801b() == InboxContainerView.this.f97364q.mo139082a()) {
                            InboxContainerView.this.mo138956a((Boolean) true);
                            FeedHitPoint.m148867c(eVar.mo137801b().name());
                            return;
                        }
                        InboxContainerView.this.f97364q.mo139085b(eVar.mo137801b());
                    }

                    @Override // com.ss.android.lark.feed.app.filter.widget.FeedFilterView.IFeedFilterTabListener
                    /* renamed from: a */
                    public void mo137857a(View view, FeedTabItemData.IFilterItem eVar, int i) {
                        boolean z = true;
                        if (eVar.mo137797a() == 1) {
                            FeedFilter b = eVar.mo137801b();
                            String lowerCase = eVar.mo137801b().name().toLowerCase(Locale.ROOT);
                            FeedHitPoint.m148865b(b.name());
                            FeedHitPointNew.m148848a(FeedHitPointNew.FeedMainClickParam.FEED_GROUPING_TAB, new HashMap<String, Object>(i, lowerCase) {
                                /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass13.C379433 */
                                final /* synthetic */ int val$index;
                                final /* synthetic */ String val$tabType;

                                {
                                    this.val$index = r2;
                                    this.val$tabType = r3;
                                    put("tab_order", Integer.valueOf(r2 + 1));
                                    put("tab_type", r3);
                                    put("is_more_tab", "false");
                                }
                            });
                            if (eVar.mo137801b() != InboxContainerView.this.f97364q.mo139082a() || InboxContainerView.this.f97330D != eVar.mo137801b()) {
                                InboxContainerView.this.f97330D = eVar.mo137801b();
                                InboxContainerView.this.f97364q.mo139083a(b);
                                if (InboxContainerView.this.f97362o != null) {
                                    C37985g gVar = InboxContainerView.this.f97362o;
                                    if (b == FeedFilter.DONE) {
                                        z = false;
                                    }
                                    gVar.mo139053a(z);
                                }
                                InboxContainerView.this.f97367t.mo139021a();
                                if (InboxContainerView.this.f97371x != null) {
                                    InboxContainerView.this.f97371x.mo137060a(b);
                                }
                            }
                        }
                    }
                });
                this.f97354g.addView(this.f97366s, new FrameLayout.LayoutParams(-1, -2));
                FeedHitPointNew.m148853a(Integer.valueOf(filterPreview.getFilterItems().size()));
            } else {
                feedFilterView.mo137835a(filterPreview.getFilterItems());
                this.f97366s.mo137832a(filterPreview.getDeviceStatus());
            }
            if (this.f97366s.mo137836a()) {
                this.f97366s.setVisibility(8);
            } else {
                this.f97366s.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public void mo138961a(final FeedPreview feedPreview) {
        post(new Runnable() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass14 */

            public void run() {
                if (!feedPreview.isHeaderData() || !FeedFgUtils.m146773b()) {
                    if (InboxContainerView.this.f97362o != null) {
                        InboxContainerView.this.f97362o.notifyItemChanged(feedPreview);
                    }
                } else if (InboxContainerView.this.f97363p != null) {
                    InboxContainerView.this.f97363p.notifyItemChanged(feedPreview);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo138962a(UpdateRecord updateRecord) {
        if (this.f97362o != null) {
            if (!FeedFgUtils.m146773b() || C37548b.m147657a().mo137792b() == updateRecord.mo138382i()) {
                this.f97362o.mo138927a(updateRecord);
                return;
            }
            Log.m165397w("FeedModule_InboxContainerView", "updateInboxFeedView wrong ,cur=" + C37548b.m147657a().mo137792b() + ":" + updateRecord.mo138382i());
        }
    }

    public InboxContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo138963a(AbstractC38026b bVar, AbstractC38027d dVar) {
        this.f97353f.setMinimumHeight(bVar.mo139094a(FeedCard.FeedType.INBOX));
        ITitleScrollHelper cVar = this.f97369v;
        if (cVar != null) {
            cVar.mo139137c();
            this.f97369v.mo139138d();
            this.f97369v = null;
        }
        if (!DesktopUtil.m144301a(this.f97360m)) {
            if (FeedFgUtils.m146773b()) {
                this.f97369v = new FeedTitleScrollHelperV2(FeedCard.FeedType.INBOX, bVar, this.f97349b, this.f97351d, this.f97362o, this.f97363p, dVar);
            } else {
                this.f97369v = new C38024a(FeedCard.FeedType.INBOX, bVar, dVar, this.f97349b, this.f97362o);
            }
        }
        if (FeedFgUtils.m146773b()) {
            C37985g gVar = this.f97363p;
            if (gVar != null) {
                gVar.mo138924a(bVar.mo139094a(FeedCard.FeedType.INBOX));
                return;
            }
            return;
        }
        C37985g gVar2 = this.f97362o;
        if (gVar2 != null) {
            gVar2.mo138924a(bVar.mo139094a(FeedCard.FeedType.INBOX));
        }
    }

    public InboxContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f97358k = new ArrayList(16);
        this.f97332F = false;
        this.f97333G = false;
        this.f97359l = false;
        this.f97334H = false;
        this.f97337K = false;
        this.f97328B = 1;
        this.f97342P = false;
        this.f97343Q = true;
        this.f97330D = FeedFilter.UNKNOWN;
        this.f97345S = null;
        this.f97346T = new FeedTabUtil.SwitchTabListener() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379391 */

            @Override // com.ss.android.lark.feed.common.FeedTabUtil.SwitchTabListener
            /* renamed from: a */
            public void mo136997a(final FeedFilter feedFilter) {
                UICallbackExecutor.execute(new Runnable() {
                    /* class com.ss.android.lark.feed.app.view.InboxContainerView.C379391.RunnableC379401 */

                    public void run() {
                        InboxContainerView.this.f97366s.mo137834a(feedFilter);
                    }
                });
            }
        };
        this.f97331E = 20;
        this.f97347U = new View.OnTouchListener() {
            /* class com.ss.android.lark.feed.app.view.InboxContainerView.AnonymousClass11 */

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (InboxContainerView.this.f97372y) {
                    return true;
                }
                InboxContainerView.this.f97373z.addMovement(motionEvent);
                return InboxContainerView.this.f97368u.mo138602a(view, motionEvent);
            }
        };
    }
}
